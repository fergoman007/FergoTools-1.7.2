/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.fergoman123.fergotools.core.block.furnace.BlockCoalFurnace;
import io.github.fergoman123.fergotools.reference.ints.FurnaceInts;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.TileEntityFurnaceFT;
import io.github.fergoman123.fergoutil.util.NBTTags;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public final class TileEntityCoalFurnace extends TileEntityFurnaceFT
{

    @Override
    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.localizedName : Locale.containerCoalFurnace;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        NBTTagList list = compound.getTagList(NBTTags.items, 10);
        this.slots = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound compound1 = list.getCompoundTagAt(i);
            byte b0 = compound1.getByte(NBTTags.slot);

            if (b0 >= 0 && b0 < this.slots.length)
            {
                this.slots[b0] = ItemStack.loadItemStackFromNBT(compound1);
            }
        }

        this.burnTime = compound.getShort(NBTTags.burnTime);
        this.cookTime = compound.getShort(NBTTags.cookTime);
        this.currentItemBurnTime = getItemBurnTime(this.slots[1]);

        if (compound.hasKey(NBTTags.customName, 8))
        {
            this.localizedName = compound.getString(NBTTags.customName);
        }
    }

    @Override
    public int getCookProgressScaled(int speed) {
        return this.cookTime * speed / FurnaceInts.coalFurnaceSpeed;
    }

    @Override
    public int getBurnTimeRemainingScaled(int speed) {
        if (this.currentItemBurnTime == 0)
        {
            this.currentItemBurnTime = FurnaceInts.coalFurnaceSpeed;
        }

        return this.burnTime * speed / this.currentItemBurnTime;
    }

    @Override
    public void updateEntity() {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if (this.burnTime > 0)
        {
            --this.burnTime;
        }

        if (!this.worldObj.isRemote)
        {
            if (this.burnTime != 0 || this.slots[1] != null && this.slots[0] != null)
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
                    if (this.cookTime == FurnaceInts.coalFurnaceSpeed)
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
            }

            if (flag != this.burnTime > 0)
            {
                flag1 = true;
                BlockCoalFurnace.updateBlockState(this.isBurning(), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1)
        {
            this.markDirty();
        }
    }

    @Override
    public boolean canSmelt() {
        if (this.slots[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
            if (stack == null) return false;
            if (this.slots[2] == null)return true;
            if (!this.slots[2].isItemEqual(stack))return false;
            int result = slots[2].stackSize + stack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.slots[2].getMaxStackSize();
        }
    }

    @Override
    public void smeltItem() {
        if (this.canSmelt())
        {
            ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);

            if (this.slots[2] == null)
            {
                this.slots[2] = stack.copy();
            }
            else if (this.slots[2].getItem() == stack.getItem())
            {
                this.slots[2].stackSize += stack.stackSize;
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

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air)
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

            if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD"))return 200;
            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD"))return 200;
            if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD"))return 200;
            if (item == Items.stick)return 100;
            if (item == Items.coal)return 1600;
            if (item == Items.lava_bucket)return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling))return 100;
            if (item == Items.blaze_rod)return 2400;
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
