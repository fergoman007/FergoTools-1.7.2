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
import io.github.fergoman123.fergotools.common.blocks.BlockMacerator;
import io.github.fergoman123.fergotools.common.gui.furnace.container.ContainerMacerator;
import io.github.fergoman123.fergotools.crafting.MaceratorRecipes;
import io.github.fergoman123.fergotools.reference.ints.FurnaceInts;
import io.github.fergoman123.fergotools.reference.names.Locale;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraftforge.oredict.OreDictionary;

public class TileMacerator extends TileFurnaceFT
{

    @Override
    public String getCommandSenderName() {
        return Locale.containerMacerator;
    }

    @Override
    public void update() {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if (this.isBurning())
        {
            --this.burnTime;
        }

        if (!this.worldObj.isRemote)
        {
            if (!this.isBurning() && (this.slots[1] == null || this.slots[0] == null))
            {
                if (!this.isBurning() && this.cookTime > 0)
                {
                    this.cookTime = MathHelper.clamp_int(this.cookTime - 2, 0, this.totalCookTime);
                }
            }
            else
            {
                if (!this.isBurning() && this.canSmelt())
                {
                    this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                    if (this.isBurning())
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

                    if (this.cookTime == this.totalCookTime)
                    {
                        this.cookTime = 0;
                        this.totalCookTime = this.getFurnaceSpeed(this.slots[0]);
                        this.smeltItem();
                        flag1 = true;
                    }
                }
                else
                {
                    this.cookTime = 0;
                }
            }

            if (flag != this.isBurning())
            {
                flag1 = true;
                BlockMacerator.setState(this.isBurning(), this.worldObj, this.pos);
            }
        }

        if (flag1)
        {
            this.markDirty();
        }
    }

    @Override
    public int getFurnaceSpeed(ItemStack stack) {
        return FurnaceInts.maceratorSpeed;
    }

    public boolean isOre(ItemStack stack)
    {
        String[] ores = OreDictionary.getOreNames();
        for (int i = 0; i < ores.length; i++) {
            if (ores[i].contains("ore"))
            {
                if (OreDictionary.getOres(ores[i]) != null)
                {
                    for (int j = 0; j < OreDictionary.getOres(ores[i]).size(); j++) {
                        if (OreDictionary.getOres(ores[i]).get(j).getItem() == stack.getItem());
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean canSmelt() {
        if (slots[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack stack = MaceratorRecipes.macerating().getSmeltingResult(slots[0]);
            if (stack == null)return false;
            if (!isOre(this.slots[0]))return false;
            if (slots[2] == null)return true;
            if (!slots[2].isItemEqual(stack))return false;
            int result = slots[2].stackSize + stack.stackSize;
            return result <= getInventoryStackLimit() && result <= slots[2].getMaxStackSize();
        }
    }

    @Override
    public void smeltItem() {
        if (this.canSmelt())
        {
            ItemStack stack = MaceratorRecipes.macerating().getSmeltingResult(this.slots[0]);

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

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return index != 2 && (index != 1 || isItemFuel(stack));
}

    @Override
    public String getGuiID() {
        return "fergotools:macerator";
    }

    @Override
    public Container createContainer(InventoryPlayer invPlayer, EntityPlayer player) {
        return new ContainerMacerator(invPlayer, this);
    }
}
