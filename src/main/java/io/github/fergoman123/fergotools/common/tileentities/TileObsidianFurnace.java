/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.common.tileentities;

import io.github.fergoman123.fergotools.api.base.TileFurnaceFT;
import io.github.fergoman123.fergotools.common.blocks.BlockObsidianFurnace;
import io.github.fergoman123.fergotools.common.gui.furnace.container.ContainerMacerator;
import io.github.fergoman123.fergotools.common.gui.furnace.container.ContainerObsidianFurnace;
import io.github.fergoman123.fergotools.reference.ints.FurnaceInts;
import io.github.fergoman123.fergotools.reference.names.Locale;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.MathHelper;

public class TileObsidianFurnace extends TileFurnaceFT
{
    @Override
    public String getCommandSenderName() {
        return Locale.containerObsidianFurnace;
    }

    @Override
    public void update() {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if (this.isBurning())
        {
            --this.burnTime;
        }

        if (!worldObj.isRemote)
        {
            if (!isBurning() && (slots[1] == null || slots[0] == null))
            {
                if (!isBurning() && cookTime > 0)
                {
                    cookTime = MathHelper.clamp_int(cookTime - 2, 0, totalCookTime);
                }
            }
            else
            {
                if (isBurning() && canSmelt())
                {
                    currentItemBurnTime = burnTime = getItemBurnTime(slots[1]);

                    if (isBurning())
                    {
                        flag1 = true;

                        if (slots[1] != null)
                        {
                            --slots[1].stackSize;

                            if (slots[1].stackSize == 0)
                            {
                                slots[1] = slots[1].getItem().getContainerItem(slots[1]);
                            }
                        }
                    }
                }

                if (isBurning() && canSmelt())
                {
                    ++cookTime;

                    if (cookTime == totalCookTime)
                    {
                        cookTime = 0;
                        totalCookTime = getFurnaceSpeed(slots[0]);
                        smeltItem();
                        flag1 = true;
                    }
                }
                else
                {
                    cookTime = 0;
                }
            }

            if (flag != isBurning())
            {
                flag1 = true;
                BlockObsidianFurnace.setState(isBurning(), worldObj, pos);
            }
        }

        if (flag1)
        {
            markDirty();
        }
    }

    @Override
    public int getFurnaceSpeed(ItemStack stack) {
        return FurnaceInts.obsidianFurnaceSpeed;
    }

    @Override
    public boolean canSmelt() {
        if (slots[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack stack = FurnaceRecipes.instance().getSmeltingResult(slots[0]);
            if (stack == null)return false;
            if (slots[2] == null)return true;
            if (!slots[2].isItemEqual(stack))return false;
            int res = slots[2].stackSize + stack.stackSize;
            return res <= getInventoryStackLimit() && res <= slots[2].getMaxStackSize();
        }
    }

    @Override
    public void smeltItem() {
        if (canSmelt())
        {
            ItemStack stack = FurnaceRecipes.instance().getSmeltingResult(slots[0]);

            if (slots[2] == null)
            {
                slots[2] = stack.copy();
            }
            else if (slots[2].getItem() == stack.getItem()){
                slots[2].stackSize += stack.stackSize;
            }

            if (slots[0].getItem() == Item.getItemFromBlock(Blocks.sponge) && slots[0].getMetadata() == 1 && slots[1] != null && slots[1].getItem() == Items.bucket)
            {
                slots[1] = new ItemStack(Items.water_bucket);
            }

            --slots[0].stackSize;

            if (slots[0].stackSize <= 0)
            {
                slots[0] = null;
            }
        }
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return index != 2 && (index != 1 || isItemFuel(stack) || SlotFurnaceFuel.isBucket(stack));
    }

    @Override
    public String getGuiID() {
        return "fergotools:obsidianFurnace";
    }

    @Override
    public Container createContainer(InventoryPlayer invPlayer, EntityPlayer player) {
        return new ContainerObsidianFurnace(invPlayer, this);
    }
}
