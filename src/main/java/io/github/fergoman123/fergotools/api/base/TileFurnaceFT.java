package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class TileFurnaceFT extends TileEntityLockable implements IUpdatePlayerListBox, ISidedInventory
{
	public static final int[] slotsTop = new int[]{0};
	public static final int[] slotsBottom = new int[]{2,1};
	public static final int[] slotsSides = new int[]{1};

    public ItemStack[] slots;

    public int burnTime;
    public int currentItemBurnTime;
    public int cookTime;
    public int totalCookTime;

    public String customName;

    public TileFurnaceFT(){}
	
	@Override
	public int getSizeInventory() {
		return this.slots.length;
	}
	
	public ItemStack getStackInSlot(int index){
		return this.slots[index];
	}
	
	public ItemStack decrStackSize(int index, int count)
    {
        if (this.slots[index] != null)
        {
            ItemStack itemstack;

            if (this.slots[index].stackSize <= count)
            {
                itemstack = this.slots[index];
                this.slots[index] = null;
                return itemstack;
            }
            else
            {
                itemstack = this.slots[index].splitStack(count);

                if (this.slots[index].stackSize == 0)
                {
                    this.slots[index] = null;
                }

                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }
	
	public ItemStack getStackInSlotOnClosing(int index)
    {
        if (this.slots[index] != null)
        {
            ItemStack itemstack = this.slots[index];
            this.slots[index] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }
	
	public void setInventorySlotContents(int index, ItemStack stack)
    {
        boolean flag = stack != null && stack.isItemEqual(this.slots[index]) && ItemStack.areItemStackTagsEqual(stack, this.slots[index]);
        this.slots[index] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }

        if (index == 0 && !flag)
        {
            this.totalCookTime = this.getFurnaceSpeed(stack); //TODO: getFurnaceSpeed(stack)
            this.cookTime = 0;
            this.markDirty();
        }
    }
	
	public abstract String getName();
	
	public boolean hasCustomName(){
		return this.customName != null && this.customName.length() > 0;
	}
	
	public void setCustomInventoryName(String customName){
		this.customName = customName;
	}
	
	public void writeToNBT(NBTTagCompound compound){
		super.writeToNBT(compound);
		compound.setShort("BurnTime", (short)this.burnTime);
		compound.setShort("CookTime", (short)this.cookTime);
		compound.setShort("CookTimeTotal", (short)this.totalCookTime);
		NBTTagList list = new NBTTagList();
		
		for(int i = 0; i < this.slots.length; ++i){
			if(this.slots[i] != null){
				NBTTagCompound compound1 = new NBTTagCompound();
				compound1.setByte("Slot", (byte)i);
				this.slots[i].writeToNBT(compound1);
				list.appendTag(compound1);
			}
		}
		
		compound.setTag("Items", list);
		
		if(this.hasCustomName()){
			compound.setString("CustomName", this.customName);
		}
	}
	
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
	
	public boolean isBurning(){
		return this.burnTime > 0;
	}
	
	public static boolean isBurning(IInventory inventory){
		return inventory.getField(0) > 0;
	}
	
	public abstract void update();
	
	public abstract int getFurnaceSpeed(ItemStack stack);
	
	public abstract boolean canSmelt();
	
	public abstract void smeltItem();
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getTileEntity(this.pos) == this && player.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D, (double) this.pos.getZ() + 0.5D) <= 64.0D;
	}
	
	public void openInventory(EntityPlayer player){}
	public void closeInventory(EntityPlayer player){}
	
	public abstract boolean isItemValidForSlot(int index, ItemStack stack);
	
	public int[] getSlotsForFace(EnumFacing side){
		return side == EnumFacing.DOWN ? slotsBottom : (side == EnumFacing.UP ? slotsTop : slotsSides);
	}
	
	public boolean canInsertItem(int index, ItemStack stack, EnumFacing direction){
		return this.isItemValidForSlot(index, stack);
	}
	
	public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction){
		if(direction == EnumFacing.DOWN && index == 1){
			Item item = stack.getItem();
			
			if(item != Items.water_bucket && item != Items.bucket){
				return false;
			}
		}
		return true;
	}
	
	public abstract String getGuiID();
	public abstract Container createContainer(InventoryPlayer invPlayer, EntityPlayer player);
	
	public int getField(int id)
    {
        switch (id)
        {
            case 0:
                return this.burnTime;
            case 1:
                return this.currentItemBurnTime;
            case 2:
                return this.cookTime;
            case 3:
                return this.totalCookTime;
            default:
                return 0;
        }
    }

    public void setField(int id, int value)
    {
        switch (id)
        {
            case 0:
                this.burnTime = value;
                break;
            case 1:
                this.currentItemBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            case 3:
                this.totalCookTime = value;
        }
    }

    public int getFieldCount()
    {
        return 4;
    }

    public void clear()
    {
        for (int i = 0; i < this.slots.length; ++i)
        {
            this.slots[i] = null;
        }
    }

    public static int getMaceratorBurnTime(ItemStack stack){
        if (stack == null){
            return 0;
        } else {
            Item item = stack.getItem();

            if (item == Item.getItemFromBlock(Blocks.redstone_block))return 1350;
            if (item == Items.redstone)return 150;
            if (item == ModItems.gemRedstone)return 1350;
            return GameRegistry.getFuelValue(stack);
        }
    }

    public static int getBurnTime(ItemStack stack){
        if (stack == null){
            return 0;
        } else {
            Item item = stack.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air){
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab)return 150;
                if (block.getMaterial() == Material.wood)return 300;
                if (block == Blocks.coal_block)return 16000;
            }

            if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe)item).getMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(stack);
        }
    }

    public static boolean isItemFuel(ItemStack stack)
    {
        return getBurnTime(stack) > 0;
    }
    
    public static boolean isItemMaceratorFuel(ItemStack stack){
    	return getMaceratorBurnTime(stack) > 0;
    }
}