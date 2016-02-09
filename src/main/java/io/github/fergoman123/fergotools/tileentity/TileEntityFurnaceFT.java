package io.github.fergoman123.fergotools.tileentity;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.*;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

public abstract class TileEntityFurnaceFT extends TileEntityLockable implements ITickable, ISidedInventory {
    public static final int[] slotsTop = new int[]{0};
    public static final int[] slotsBottom = new int[]{2, 1};
    public static final int[] slotsSides = new int[]{1};

    public ItemStack[] slots = new ItemStack[3];

    public int burnTime;
    public int currentItemBurnTime;
    public int cookTime;
    public int totalCookTime;

    public String inventoryName;
    public int cookingTime;

    public TileEntityFurnaceFT(int cookingTime){
        this.cookingTime = cookingTime;
    }

    public int getSizeInventory() {
        return this.slots.length;
    }

    public ItemStack getStackInSlot(int slot) {
        return this.slots[slot];
    }

    public ItemStack decrStackSize(int slot, int count) {
        if (this.slots[slot] != null) {
            if (this.slots[slot].stackSize <= count) {
                ItemStack stack1 = this.slots[slot];
                this.slots[slot] = null;
                return stack1;
            } else {
                ItemStack stack = this.slots[slot].splitStack(count);
                if (this.slots[slot].stackSize == 0) {
                    this.slots[slot] = null;
                }
                return stack;
            }
        } else {
            return null;
        }
    }

    public ItemStack removeStackFromSlot(int slot) {
        if (this.slots[slot] != null) {
            ItemStack stack = this.slots[slot];
            this.slots[slot] = null;
            return stack;
        } else {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        boolean flag = stack != null && stack.isItemEqual(this.slots[slot]) && ItemStack.areItemStackTagsEqual(stack, this.slots[slot]);
        if (stack != null && stack.stackSize > this.getInventoryStackLimit()) {
            stack.stackSize = this.getInventoryStackLimit();
        }

        if (slot == 0 && !flag) {
            this.totalCookTime = this.getCookTime(stack);
            this.cookTime = 0;
            this.markDirty();
        }
    }

    public abstract String getName();

    @Override
    public boolean hasCustomName() {
        return this.inventoryName != null && this.inventoryName.length() > 0;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    @Override
    public void writeToNBT(NBTTagCompound tag) {
        super.writeToNBT(tag);
        tag.setShort("BurnTime", (short) this.burnTime);
        tag.setShort("CookTime", (short) this.cookTime);
        tag.setShort("CookTimeTotal", (short) this.totalCookTime);
        NBTTagList list = new NBTTagList();

        for (int i = 0; i < this.slots.length; i++) {
            if (this.slots[i] != null) {
                NBTTagCompound tag1 = new NBTTagCompound();
                tag1.setByte("Slot", (byte) i);
                this.slots[i].writeToNBT(tag1);
                list.appendTag(tag1);
            }
        }

        tag.setTag("Items", list);

        if (this.hasCustomName()) {
            tag.setString("CustomName", this.inventoryName);
        }
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    public boolean isBurning() {
        return this.burnTime > 0;
    }

    @Override
    public abstract String getGuiID();

    public abstract Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn);

    public int getField(int id) {
        switch (id) {
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

    public void setField(int id, int value) {
        switch (id) {
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

    public int getFieldCount() {
        return 4;
    }

    public void clear() {
        for (int i = 0; i < this.slots.length; i++) {
            this.slots[i] = null;
        }
    }


    IItemHandler handlerTop = new SidedInvWrapper(this, EnumFacing.UP);
    IItemHandler handlerBottom = new SidedInvWrapper(this, EnumFacing.DOWN);
    IItemHandler handlerSide = new SidedInvWrapper(this, EnumFacing.WEST);

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (facing != null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (facing == EnumFacing.DOWN) {
                return (T) handlerBottom;
            } else if (facing == EnumFacing.UP) {
                return (T) handlerTop;
            } else {
                return (T) handlerSide;
            }
        }
        return super.getCapability(capability, facing);
    }

    public static int getMaceratorBurnTime(ItemStack stack) {
        if (stack == null) {
            return 0;
        } else {
            Item item = stack.getItem();
            if (item == Items.redstone) return 350;
            if (item == Item.getItemFromBlock(Blocks.redstone_block)) return 1350;
            return GameRegistry.getFuelValue(stack);
        }
    }

    public static int getItemBurnTime(ItemStack stack) {
        if (stack == null) {
            return 0;
        } else {
            Item item = stack.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab) {
                    return 150;
                }

                if (block.getMaterial() == Material.wood) {
                    return 300;
                }

                if (block == Blocks.coal_block) {
                    return 16000;
                }
            }

            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe) item).getMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(stack);
        }
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return this.worldObj.getTileEntity(this.pos) == this && player.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D, (double) this.pos.getZ() + 0.5D) <= 64.0D;
    }

    public int getCookTime(ItemStack stack){
        return this.cookingTime;
    }

    public boolean canSmelt()
    {
        if (this.slots[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.slots[0]);
            if (itemstack == null) return false;
            if (this.slots[2] == null) return true;
            if (!this.slots[2].isItemEqual(itemstack)) return false;
            int result = slots[2].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.slots[2].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
    }

    /**
     * Turn one item from the furnace source stack into the appropriate smelted item in the furnace result stack
     */
    public void smeltItem()
    {
        if (this.canSmelt())
        {
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.slots[0]);

            if (this.slots[2] == null)
            {
                this.slots[2] = itemstack.copy();
            }
            else if (this.slots[2].getItem() == itemstack.getItem())
            {
                this.slots[2].stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
            }

            if (this.slots[0].getItem() == Item.getItemFromBlock(Blocks.sponge) && this.slots[0].getMetadata() == 1 && this.slots[1] != null && this.slots[1].getItem() == Items.bucket)
            {
                this.slots[1] = new ItemStack(Items.water_bucket);
            }

            --this.slots[0].stackSize;

            if (this.slots[0].stackSize <= 0)
            {
                this.slots[0] = null;
            }
        }
    }

    public void openInventory(EntityPlayer player) {
    }

    public void closeInventory(EntityPlayer player) {
    }

    public int getBurnTimeVal(){
        return this.getField(0);
    }

    public int getCurrentItemBurnTimeVal(){
        return this.getField(1);
    }

    public int getCookTimeVal(){
        return this.getField(2);
    }

    public int getTotalCookTimeVal(){
        return this.getField(3);
    }
}
