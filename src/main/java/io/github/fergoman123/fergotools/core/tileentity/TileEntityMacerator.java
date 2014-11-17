package io.github.fergoman123.fergotools.core.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergotools.core.block.furnace.BlockMacerator;
import io.github.fergoman123.fergotools.crafting.MaceratorRecipes;
import io.github.fergoman123.fergotools.reference.Ints;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.reference.strings.Tile;
import io.github.fergoman123.fergotools.util.base.TileEntityFurnaceFT;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Fergoman123.
 */
public final class TileEntityMacerator extends TileEntityFurnaceFT {

    public int getSizeInventory(){return this.slots.length;}

        public ItemStack getStackInSlot(int slot){return this.slots[slot];}

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
            return this.hasCustomInventoryName() ? this.localizedName : Locale.containerMacerator;
        }

        public boolean hasCustomInventoryName()
        {
            return this.localizedName != null && this.localizedName.length() > 0;
        }

        public void setGuiDisplayName(String displayName)
        {
            this.localizedName = displayName;
        }

        @Override
        public void readFromNBT(NBTTagCompound compound) {
            super.readFromNBT(compound);
            NBTTagList list = compound.getTagList(Tile.items, 10);
            this.slots = new ItemStack[this.getSizeInventory()];

            for (int i = 0; i < list.tagCount(); ++i)
            {
                NBTTagCompound compound1 = list.getCompoundTagAt(i);
                byte b0 = compound1.getByte(Tile.slot);

                if (b0 >= 0 && b0 < this.slots.length)
                {
                    this.slots[b0] = ItemStack.loadItemStackFromNBT(compound1);
                }
            }

            this.burnTime = compound.getShort(Tile.burnTime);
            this.cookTime = compound.getShort(Tile.cookTime);
            this.currentItemBurnTime = getItemBurnTime(this.slots[1]);

            if (compound.hasKey(Tile.customName, 8))
            {
                this.localizedName = compound.getString(Tile.customName);
            }
        }

        @Override
        public void writeToNBT(NBTTagCompound compound) {
            super.writeToNBT(compound);
            compound.setShort(Tile.burnTime, (short)this.burnTime);
            compound.setShort(Tile.cookTime, (short)this.cookTime);
            NBTTagList list = new NBTTagList();

            for (int i = 0; i < this.slots.length; ++i)
            {
                if (this.slots[i] != null)
                {
                    NBTTagCompound compound1 = new NBTTagCompound();
                    compound1.setByte(Tile.slot, (byte)i);
                    this.slots[i].writeToNBT(compound1);
                    list.appendTag(compound1);
                }
            }

            compound.setTag(Tile.items, list);

            if (this.hasCustomInventoryName())
            {
                compound.setString(Tile.customName, this.localizedName);
            }
        }

        public int getInventoryStackLimit()
        {
            return inventoryStackLimit;
        }

        @SideOnly(Side.CLIENT)
        public int getCookProgressScaled(int speed)
        {
            return this.cookTime * speed / Ints.Furnace.maceratorSpeed;
        }

        @SideOnly(Side.CLIENT)
        public int getBurnTimeRemainingScaled(int speed)
        {
            if (this.currentItemBurnTime == 0)
            {
                this.currentItemBurnTime = Ints.Furnace.maceratorSpeed;
            }

            return this.burnTime * speed / this.currentItemBurnTime;
        }

        public boolean isBurning(){return this.burnTime > 0;}

        public void updateEntity()
        {
            boolean flag = this.burnTime > 0;
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
                                this.slots[1] = slots[1].getItem().getContainerItem(slots[1]);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt())
                {
                    ++this.cookTime;

                    if (this.cookTime == Ints.Furnace.maceratorSpeed)
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
                    BlockMacerator.updateBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
                }
            }

            if (flag1)
            {
                this.markDirty();
            }
        }

        public boolean isOre(ItemStack stack)
        {
            String[] ores = OreDictionary.getOreNames();
            for (int i = 0; i < ores.length; i++)
            {
                if (ores[i].contains("ore"))
                {
                    if (OreDictionary.getOres(ores[i]) != null)
                    {
                        for(int j = 0; j < OreDictionary.getOres(ores[i]).size(); j++)
                        {
                            if (OreDictionary.getOres(ores[i]).get(j).getItem() == stack.getItem())
                            {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public boolean canSmelt()
        {
            if (this.slots[0] == null)
            {
                return false;
            }
            else
            {
                ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
                if (stack == null)return false;
                if (!this.isOre(this.slots[0]))return false;
                if (this.slots[2] == null)return true;
                if (!this.slots[2].isItemEqual(stack))return false;
                int result = slots[2].stackSize + stack.stackSize*2;
                return (result <= getInventoryStackLimit() && result <= this.slots[2].getMaxStackSize());
            }
        }

        public void smeltItem()
        {
            if (this.canSmelt())
            {
                ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);

                if (this.slots[2] == null)
                {
                    this.slots[2] = stack.copy();
                    this.slots[2].stackSize*=2;
                }
                else if (this.slots[2].getItem() == stack.getItem())
                {
                    this.slots[2].stackSize += stack.stackSize*2;
                }

                --this.slots[0].stackSize;

                if (this.slots[0].stackSize <= 0)
                {
                    this.slots[0] = null;
                }
            }
        }

        private static int getItemBurnTime(ItemStack stack)
        {
            if (stack == null)
            {
                return 0;
            }
            else
            {
                Item item = stack.getItem();

                if (item == Items.redstone)return 150;
                if (item == Item.getItemFromBlock(Blocks.redstone_block))return 1350;
                return GameRegistry.getFuelValue(stack);
            }
        }

        public static boolean isItemFuel(ItemStack stack)
        {
            return getItemBurnTime(stack) > 0;
        }

        @Override
        public boolean isItemValidForSlot(int slot, ItemStack stack) {
            return slot == 2 ? false : (slot == 1 ? isItemFuel(stack) : true);
        }
}
