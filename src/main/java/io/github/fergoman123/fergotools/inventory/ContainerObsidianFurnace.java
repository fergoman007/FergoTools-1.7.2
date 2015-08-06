package io.github.fergoman123.fergotools.inventory;

import io.github.fergoman123.fergotools.common.gui.ContainerFurnaceFT;
import io.github.fergoman123.fergotools.common.tileentities.TileQuartzFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.inventory.SlotFurnaceOutput;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerObsidianFurnace extends ContainerFurnaceFT {

	public ContainerObsidianFurnace(InventoryPlayer invPlayer, IInventory furnace) {
		super(invPlayer, furnace);
	}

	@Override
	public void addInventorySlots() {
		this.addSlotToContainer(new Slot(this.furnace, 0, 56, 17));
		this.addSlotToContainer(new SlotFurnaceFuel(this.furnace, 1, 56, 53));
		this.addSlotToContainer(new SlotFurnaceOutput(this.invPlayer.player, this.furnace, 2, 116, 35));
	}

	@Override
	public void addPlayerInventory() {
		for (int row = 0; row < 3; ++row)
        {
            for (int cols = 0; cols < 9; ++cols)
            {
                this.addSlotToContainer(new Slot(this.invPlayer, cols + row * 9 + 9, 8 + cols * 18, 84 + row * 18));
            }
        }

        for (int hotbarIndex = 0; hotbarIndex < hotbarIndex; ++hotbarIndex){
            this.addSlotToContainer(new Slot(this.invPlayer, hotbarIndex, 8+hotbarIndex*18, hotbarIndex));
        }
	}

	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
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

            slot.onPickupFromSlot(playerIn, itemstack1);
        }

        return itemstack;
    }

}
