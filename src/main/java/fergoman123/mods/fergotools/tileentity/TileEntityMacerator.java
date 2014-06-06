package fergoman123.mods.fergotools.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.block.furnace.BlockMacerator;
import fergoman123.mods.fergotools.item.crafting.MaceratorRecipes;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.lib.ints.FurnaceInts;
import fergoman123.mods.fergotools.util.TileEntityFurnaceFT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**
 * Created by Fergoman123 on 05/06/2014.
 */
public class TileEntityMacerator extends TileEntityFurnaceFT{

    private static final int[] slots_top = new int[]{0};
    private static final int[] slots_bottom = new int[]{2, 1};
    private static final int[] slots_sides = new int[]{1};

    private ItemStack[] slots = new ItemStack[3];

    public int burnTime;
    public int currentItemBurnTime;
    public int cookTime;

    private String localizedName;

    public int getSizeInventory()
    {
        return this.slots.length;
    }

    public ItemStack getStackInSlot(int slot)
    {
        return this.slots[slot];
    }

    public ItemStack decrStackSize(int par1, int par2)
    {
        if (this.slots[par1] != null)
        {
            ItemStack stack;

            if (this.slots[par1].stackSize <= par2)
            {
                stack = this.slots[par1];
                this.slots[par1] = null;
                return stack;
            }
            else
            {
                stack = this.slots[par1].splitStack(par2);

                if (this.slots[par1].stackSize == 0)
                {
                    this.slots[par1] = null;
                }
                return stack;
            }
        }
        else
        {
            return null;
        }
    }

    public ItemStack getStackInSlotOnClosing(int slot)
    {
        if (this.slots[slot] != null)
        {
            ItemStack stack = this.slots[slot];
            this.slots[slot] = null;
            return stack;
        }
        else
        {
            return null;
        }
    }

    public void setInventorySlotContents(int slot, ItemStack stack)
    {
        this.slots[slot] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }
    }

    public String getInventoryName()
    {
        return this.hasCustomInventoryName() ? this.localizedName : "container.FergoTools:macerator";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return this.localizedName != null && this.localizedName.length() > 0;
    }

    public void setGuiDisplayName(String displayName)
    {
        this.localizedName = displayName;
    }

    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        NBTTagList nbttaglist = compound.getTagList(Strings.TileStrings.items, 10);
        this.slots = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.getCompoundTagAt(i);
            byte b0 = nbttagcompound1.getByte(Strings.TileStrings.slot);

            if (b0 >= 0 && b0 < this.slots.length)
            {
                this.slots[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        this.burnTime = compound.getShort(Strings.TileStrings.burnTime);
        this.cookTime = compound.getShort(Strings.TileStrings.cookTime);
        this.currentItemBurnTime = getItemBurnTime(this.slots[1]);

        if (compound.hasKey(Strings.TileStrings.customName))
        {
            this.localizedName = compound.getString(Strings.TileStrings.customName);
        }
    }

    public void writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        compound.setShort(Strings.TileStrings.burnTime, (short)this.burnTime);
        compound.setShort(Strings.TileStrings.cookTime, (short)this.cookTime);
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.slots.length; ++i)
        {
            if (this.slots[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte(Strings.TileStrings.slot, (byte)i);
                this.slots[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        compound.setTag(Strings.TileStrings.items, nbttaglist);

        if (this.hasCustomInventoryName())
        {
            compound.setString(Strings.TileStrings.customName, this.localizedName);
        }
    }

    public int getInventoryStackLimit(){return 64;}

    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int par1)
    {
        return this.cookTime * par1 / FurnaceInts.maceratorSpeed;
    }

    @SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int par1)
    {
        if (this.currentItemBurnTime == 0)
        {
            this.currentItemBurnTime = FurnaceInts.maceratorSpeed;
        }

        return this.burnTime * par1 / this.currentItemBurnTime;
    }

    public boolean isBurning(){return this.burnTime > 0;}

    public void updateEntity()
    {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if (this.burnTime > 0)
        {
            --this.burnTime;
        }

        if (!this.worldObj.isRemote)
        {
            if (this.burnTime == 0 && this.canSmelt())
            {
                this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                if (this.burnTime > 0)
                {
                    flag1 = true;

                    if (this.slots[1] != null)
                    {
                        --this.slots[1].stackSize;

                        if (this.slots[1].stackSize == 0)
                        {
                            this.slots[1] = this.slots[1].getItem().getContainerItem(slots[1]);
                        }
                    }
                }
            }

            if (this.isBurning() && this.canSmelt())
            {
                ++this.cookTime;

                if (this.cookTime == FurnaceInts.maceratorSpeed)
                {
                    this.cookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            }
            else
            {
                this.cookTime = 0;
            }

            if (flag != this.burnTime > 0)
            {
                flag1 = true;
                BlockMacerator.updateMaceratorBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1)
        {
            this.markDirty();
        }
    }

    public boolean canSmelt()
    {
        if (this.slots[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack itemstack = MaceratorRecipes.smelting().getSmeltingResult(this.slots[0]);
            if (itemstack == null) return false;
            if (this.slots[2] == null) return true;
            if (!this.slots[2].isItemEqual(itemstack)) return false;
            int result = slots[2].stackSize + itemstack.stackSize;
            return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
        }
    }

    public void smeltItem()
    {
        if (this.canSmelt())
        {
            ItemStack itemstack = MaceratorRecipes.smelting().getSmeltingResult(this.slots[0]);

            if (this.slots[2] == null)
            {
                this.slots[2] = itemstack.copy();
            }
            else if (this.slots[2].isItemEqual(itemstack))
            {
                slots[2].stackSize += itemstack.stackSize;
            }

            --this.slots[0].stackSize;

            if (this.slots[0].stackSize <= 0)
            {
                this.slots[0] = null;
            }
        }
    }

    public static int getItemBurnTime(ItemStack stack)
    {
        if (stack == null)
        {
            return 0;
        }
        else
        {
            Item item = stack.getItem();

            if (stack.getItem() instanceof ItemBlock && Block.getBlockFromItem(item) != null)
            {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab)
                {
                    return 150;
                }

                if (block.getMaterial() == Material.wood)
                {
                    return 300;
                }

                if (block == Blocks.coal_block)
                {
                    return 16000;
                }
            }

            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(stack);
        }
    }

    public static boolean isItemFuel(ItemStack par0ItemStack)
    {
        return getItemBurnTime(par0ItemStack) > 0;
    }

    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
    {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    public void openInventory() {}

    public void closeInventory() {}

    public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack)
    {
        return par1 == 2 ? false : (par1 == 1 ? isItemFuel(par2ItemStack) : true);
    }

    public int[] getAccessibleSlotsFromSide(int par1)
    {
        return par1 == 0 ? slots_bottom : (par1 == 1 ? slots_top : slots_sides);
    }

    public boolean canInsertItem(int par1, ItemStack par2ItemStack, int par3)
    {
        return this.isItemValidForSlot(par1, par2ItemStack);
    }

    public boolean canExtractItem(int par1, ItemStack par2ItemStack, int par3) {
        return par3 != 0 || par1 != 1 || par2ItemStack.getItem() == Items.bucket;
    }
}
