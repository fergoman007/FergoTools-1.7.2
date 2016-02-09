package io.github.fergoman123.fergotools.inventory;

import io.github.fergoman123.fergotools.tileentity.TileEntityQuartzFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerQuartzFurnace extends Container {
    private final IInventory furnace;
    private int cookTime;
    private int totalCookTime;
    private int burnTime;
    private int currentItemBurnTime;

    public ContainerQuartzFurnace(InventoryPlayer playerInventory, IInventory furnace) {
        this.furnace = furnace;
        this.addSlotToContainer(new Slot(furnace, 0, 80, 31));
        this.addSlotToContainer(new SlotFurnaceFuel(furnace, 1, 62, 31));
        this.addSlotToContainer(new SlotFurnaceOutput(playerInventory.player, furnace, 2, 98, 31));

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 53 + i * 18));
            }
        }

        for (int k = 0; k < 9; ++k) {
            this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 111));
        }
    }

    public void onCraftGuiOpened(ICrafting listener){
        super.onCraftGuiOpened(listener);
        listener.sendAllWindowProperties(this, this.furnace);
    }

    public void detectAndSendChanges(){
        super.detectAndSendChanges();
        int burnTime = this.furnace.getField(0);
        int currentItemBurnTime = this.furnace.getField(1);
        int cookTime = this.furnace.getField(2);
        int totalCookTime = this.furnace.getField(3);

        for (ICrafting crafter : this.crafters) {
            if (this.cookTime != cookTime) {
                crafter.sendProgressBarUpdate(this, 2, cookTime);
            }

            if (this.burnTime != burnTime) {
                crafter.sendProgressBarUpdate(this, 0, burnTime);
            }

            if (this.currentItemBurnTime != currentItemBurnTime) {
                crafter.sendProgressBarUpdate(this, 1, currentItemBurnTime);
            }

            if (this.totalCookTime != totalCookTime) {
                crafter.sendProgressBarUpdate(this, 3, totalCookTime);
            }
        }

        this.cookTime = cookTime;
        this.burnTime = burnTime;
        this.currentItemBurnTime = currentItemBurnTime;
        this.totalCookTime = totalCookTime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data){
        this.furnace.setField(id, data);
    }

    public boolean canInteractWith(EntityPlayer player){
        return this.furnace.isUseableByPlayer(player);
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
                else if (TileEntityQuartzFurnace.isItemFuel(itemstack1))
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
