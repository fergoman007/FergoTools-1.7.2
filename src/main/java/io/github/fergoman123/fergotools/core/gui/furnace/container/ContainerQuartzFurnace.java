package io.github.fergoman123.fergotools.core.gui.furnace.container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergotools.core.tileentity.TileEntityQuartzFurnace;
import io.github.fergoman123.fergotools.util.base.ContainerFT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

/**
 * Created by Fergoman123.
 */
public class ContainerQuartzFurnace extends ContainerFT
{
    private TileEntityQuartzFurnace furnace;
    public ContainerQuartzFurnace(InventoryPlayer invPlayer,  TileEntityQuartzFurnace furnace)
    {
        this.furnace = furnace;
        this.invPlayer = invPlayer;
        addInventorySlots();
        addPlayerInventory();
    }

    @Override
    public void addInventorySlots() {
        this.addSlotToContainer(new Slot(this.furnace, 0, 62, 22));
        this.addSlotToContainer(new Slot(this.furnace, 1, 42, 22));
        this.addSlotToContainer(new SlotFurnace(this.invPlayer.player, furnace, 2, 110, 22));
    }

    @Override
    public void addPlayerInventory() {
        for (int invRowIndex = 0; invRowIndex < playerInvRows; invRowIndex++) {
            for (int invColIndex = 0; invColIndex < playerInvCols; ++invColIndex)
            {
                this.addSlotToContainer(new Slot(this.invPlayer, invColIndex + invRowIndex * 9 + 9, 8 + invColIndex * 18, 53 + invRowIndex * 18));
            }
        }

        for (int actionBarSlotIndex = 0; actionBarSlotIndex < playerInvCols; ++actionBarSlotIndex)
        {
            this.addSlotToContainer(new Slot(this.invPlayer, actionBarSlotIndex, 8 + actionBarSlotIndex * 18, 111));
        }
    }

    public void addCraftingToCrafters(ICrafting par1ICrafting)
    {
        super.addCraftingToCrafters(par1ICrafting);
        par1ICrafting.sendProgressBarUpdate(this, 0, this.furnace.cookTime);
        par1ICrafting.sendProgressBarUpdate(this, 1, this.furnace.burnTime);
        par1ICrafting.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
    }

    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i)
        {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.lastCookTime != this.furnace.cookTime)
            {
                icrafting.sendProgressBarUpdate(this, 0, this.furnace.cookTime);
            }

            if (this.lastBurnTime != this.furnace.burnTime)
            {
                icrafting.sendProgressBarUpdate(this, 1, this.furnace.burnTime);
            }

            if (this.lastItemBurnTime != this.furnace.currentItemBurnTime)
            {
                icrafting.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
            }
        }

        this.lastCookTime = this.furnace.cookTime;
        this.lastBurnTime = this.furnace.burnTime;
        this.lastItemBurnTime = this.furnace.currentItemBurnTime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2)
    {
        if (par1 == 0)
        {
            this.furnace.cookTime = par2;
        }

        if (par1 == 1)
        {
            this.furnace.burnTime = par2;
        }

        if (par1 == 2)
        {
            this.furnace.currentItemBurnTime = par2;
        }
    }

    public boolean canInteractWith(EntityPlayer par1EntityPlayer)
    {
        return this.furnace.isUseableByPlayer(par1EntityPlayer);
    }

    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int slotIndex){
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotIndex);
        if (slot != null && slot.getHasStack()){
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if (slotIndex == 2){
                if (!this.mergeItemStack(itemstack1, 3, 39, true)){return null;}
                slot.onSlotChange(itemstack1, itemstack);
            }else if (slotIndex != 1 && slotIndex != 0){
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null){
                    if (!this.mergeItemStack(itemstack1, 0, 1, false)){return null;}
                }else if (TileEntityQuartzFurnace.isItemFuel(itemstack1)){
                    if (!this.mergeItemStack(itemstack1, 1, 2, false)){return null;}
                }else if (slotIndex >= 3 && slotIndex < 30){
                    if (!this.mergeItemStack(itemstack1, 30, 39, false)){return null;}
                }else if (slotIndex >= 30 && slotIndex < 39 && !this.mergeItemStack(itemstack1, 3, 30, false)){return null;
                }} else if (!this.mergeItemStack(itemstack1, 3, 39, false)){return null;}

            if (itemstack1.stackSize == 0){slot.putStack((ItemStack)null);
            }else{slot.onSlotChanged();}
            if (itemstack1.stackSize == itemstack.stackSize){return null;}
            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }
        return itemstack;
    }
}
