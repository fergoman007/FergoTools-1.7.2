package fergoman123.mods.fergotools.gui.container;

import fergoman123.mods.fergotools.tileentity.TileEntityLapisCrystalFurnace;
import fergoman123.mods.fergotools.util.base.ContainerFT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerLapisCrystalFurnace extends ContainerFT {

    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;

    public ContainerLapisCrystalFurnace(InventoryPlayer player, TileEntityLapisCrystalFurnace furnace)
    {
        this.lapisCrystalFurnace = furnace;
        this.addSlotToContainer(new Slot(furnace, 0, 56, 17));
        this.addSlotToContainer(new Slot(furnace, 1, 56, 53));
        this.addSlotToContainer(new SlotFurnace(player.player, furnace, 2, 116, 35));
        int i;

        for (i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(player, i, 8 + i * 18, 142));
        }
    }

    public void addCraftingToCrafters(ICrafting crafting)
    {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, this.lapisCrystalFurnace.cookTime);
        crafting.sendProgressBarUpdate(this, 1, this.lapisCrystalFurnace.burnTime);
        crafting.sendProgressBarUpdate(this, 2, this.lapisCrystalFurnace.currentItemBurnTime);
    }

    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i)
        {
            ICrafting crafting = (ICrafting)this.crafters.get(i);

            if (this.lastCookTime != this.lapisCrystalFurnace.cookTime)
            {
                crafting.sendProgressBarUpdate(this, 0, this.lapisCrystalFurnace.cookTime);
            }

            if (this.lastBurnTime != this.lapisCrystalFurnace.burnTime)
            {
                crafting.sendProgressBarUpdate(this, 1, this.lapisCrystalFurnace.burnTime);
            }

            if (this.lastItemBurnTime != this.lapisCrystalFurnace.currentItemBurnTime)
            {
                crafting.sendProgressBarUpdate(this, 2, this.lapisCrystalFurnace.currentItemBurnTime);
            }
        }

        this.lastCookTime = this.lapisCrystalFurnace.cookTime;
        this.lastBurnTime = this.lapisCrystalFurnace.burnTime;
        this.lastItemBurnTime = this.lapisCrystalFurnace.currentItemBurnTime;
    }

    public void updateProgressBar(int par1, int par2)
    {
        if (par1 == 0)
        {
            this.lapisCrystalFurnace.cookTime = par2;
        }

        if (par1 == 1)
        {
            this.lapisCrystalFurnace.burnTime = par2;
        }

        if (par1 == 2)
        {
            this.lapisCrystalFurnace.currentItemBurnTime = par2;
        }
    }

    public boolean canInteractWith(EntityPlayer player)
    {
        return this.lapisCrystalFurnace.isUseableByPlayer(player);
    }

    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (par2 != 1 && par2 != 0)
            {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityLapisCrystalFurnace.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 3 && par2 < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
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

            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }
}
