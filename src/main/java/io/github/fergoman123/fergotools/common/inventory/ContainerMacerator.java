package io.github.fergoman123.fergotools.common.inventory;

import io.github.fergoman123.fergotools.common.slot.SlotMaceratorFuel;
import io.github.fergoman123.fergotools.common.slot.SlotMaceratorOutput;
import io.github.fergoman123.fergotools.common.tileentity.TileEntityMacerator;
import io.github.fergoman123.fergotools.item.crafting.MaceratorRecipes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerMacerator extends Container {

    private final IInventory furnace;
    private int field_178152_f;
    private int field_178153_g;
    private int field_178154_h;
    private int field_178155_i;

    public ContainerMacerator(InventoryPlayer invPlayer, IInventory furnace)
    {
        this.furnace = furnace;
        this.addSlotToContainer(new Slot(furnace, 0, 62, 22));
        this.addSlotToContainer(new SlotMaceratorFuel(furnace, 1, 42, 22));
        this.addSlotToContainer(new SlotMaceratorOutput(invPlayer.player, furnace, 2, 110, 22));
        int i;

        for (i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 53 + i * 18));
            }
        }

        for (i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 111));
        }
    }

    public void onCraftGuiOpened(ICrafting listener)
    {
        super.onCraftGuiOpened(listener);
        listener.func_175173_a(this, this.furnace);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i)
        {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.field_178152_f != this.furnace.getField(2))
            {
                icrafting.sendProgressBarUpdate(this, 2, this.furnace.getField(2));
            }

            if (this.field_178154_h != this.furnace.getField(0))
            {
                icrafting.sendProgressBarUpdate(this, 0, this.furnace.getField(0));
            }

            if (this.field_178155_i != this.furnace.getField(1))
            {
                icrafting.sendProgressBarUpdate(this, 1, this.furnace.getField(1));
            }

            if (this.field_178153_g != this.furnace.getField(3))
            {
                icrafting.sendProgressBarUpdate(this, 3, this.furnace.getField(3));
            }
        }

        this.field_178152_f = this.furnace.getField(2);
        this.field_178154_h = this.furnace.getField(0);
        this.field_178155_i = this.furnace.getField(1);
        this.field_178153_g = this.furnace.getField(3);
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data)
    {
        this.furnace.setField(id, data);
    }

    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return this.furnace.isUseableByPlayer(playerIn);
    }

    /**
     * Take a stack from the specified inventory slot.
     */
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
                if (MaceratorRecipes.instance().getSmeltingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityMacerator.isItemFuel(itemstack1))
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
