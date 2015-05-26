/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.common.gui.furnace.container;

import io.github.fergoman123.fergotools.api.base.ContainerFurnaceFT;
import io.github.fergoman123.fergotools.common.tileentities.TileObsidianFurnace;
import io.github.fergoman123.fergotools.common.tileentities.TileQuartzFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerObsidianFurnace extends ContainerFurnaceFT {
    public ContainerObsidianFurnace(InventoryPlayer invPlayer, IInventory furnace) {
        super(invPlayer, furnace, new TileObsidianFurnace());
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int index) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (index != 1 && index != 0)
            {
                if (FurnaceRecipes.instance().getSmeltingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileQuartzFurnace.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (index >= 3 && index < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (index >= 30 && index < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(player, itemstack1);
        }

        return itemstack;
    }

    @Override
    public void addInventorySlots() {
        addSlot(this.furnace, 0, 80, 31);
        addFurnaceFuelSlot(this.furnace, 1, 62, 31);
        addOutputSlot(invPlayer.player, furnace, 2, 98, 31);
    }

    @Override
    public void addPlayerInventory() {
        for (int rowIndex = 0; rowIndex < playerInvRows; ++rowIndex)
        {
            for (int colIndex = 0; colIndex < playerInvCols; ++colIndex)
            {
                this.addSlot(invPlayer, colIndex + rowIndex * 9, 8 + colIndex * 18, 53 + rowIndex * 18);
            }
        }

        for (int rowIndex = 0; rowIndex < playerInvCols; ++rowIndex)
        {
            this.addSlot(invPlayer, rowIndex, 8 + rowIndex * 18, 111);
        }
    }
}
