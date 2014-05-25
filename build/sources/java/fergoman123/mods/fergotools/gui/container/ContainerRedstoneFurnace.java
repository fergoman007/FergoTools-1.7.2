package fergoman123.mods.fergotools.gui.container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.tileentity.TileEntityRedstoneFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

/**
 * Created by Fergoman123 on 22/04/2014.
 */
public class ContainerRedstoneFurnace extends Container {

    private TileEntityRedstoneFurnace furnace;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;

    public ContainerRedstoneFurnace(InventoryPlayer player, TileEntityRedstoneFurnace furnace) {
        this.furnace = furnace;
        this.addSlotToContainer(new Slot(furnace, 0, 56, 17));
        this.addSlotToContainer(new Slot(furnace, 1, 56, 53));
        this.addSlotToContainer(new SlotFurnace(player.player, furnace, 2, 116, 35));

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(player, i, 8 + i * 18, 142));
        }
    }

    public void addCraftingToCrafters(ICrafting crafting) {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, this.furnace.cookTime);
        crafting.sendProgressBarUpdate(this, 1, this.furnace.burnTime);
        crafting.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
    }

    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i) {
            ICrafting crafting = (ICrafting) this.crafters.get(i);

            if (this.lastCookTime != this.furnace.cookTime) {
                crafting.sendProgressBarUpdate(this, 0, this.furnace.cookTime);
            }

            if (this.lastBurnTime != this.furnace.burnTime) {
                crafting.sendProgressBarUpdate(this, 1, this.furnace.burnTime);
            }

            if (this.lastItemBurnTime != this.furnace.currentItemBurnTime) {
                crafting.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
            }
        }

        this.lastCookTime = this.furnace.cookTime;
        this.lastBurnTime = this.furnace.burnTime;
        this.lastItemBurnTime = this.furnace.currentItemBurnTime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2) {
        if (par1 == 0) {
            this.furnace.cookTime = par2;
        }

        if (par1 == 1) {
            this.furnace.burnTime = par2;
        }

        if (par1 == 2) {
            this.furnace.currentItemBurnTime = par2;
        }
    }

    public boolean canInteractWith(EntityPlayer player) {
        return this.furnace.isUseableByPlayer(player);
    }

    public ItemStack transferStackInSlot(EntityPlayer player, int par2) {
        ItemStack stack = null;
        Slot slot = (Slot) this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack()) {
            ItemStack stack1 = slot.getStack();
            stack = stack1.copy();

            if (par2 == 2) {
                if (!this.mergeItemStack(stack1, 3, 39, true)) {
                    return null;
                }

                slot.onSlotChange(stack1, stack);
            } else if (par2 != 1 && par2 != 0) {
                if (FurnaceRecipes.smelting().getSmeltingResult(stack1) != null) {
                    if (!this.mergeItemStack(stack1, 0, 1, false)) {
                        return null;
                    }
                } else if (TileEntityRedstoneFurnace.isItemFuel(stack1)) {
                    if (!this.mergeItemStack(stack1, 1, 2, false)) {
                        return null;
                    }
                } else if (par2 >= 3 && par2 < 30) {
                    if (!this.mergeItemStack(stack1, 30, 39, false)) {
                        return null;
                    }
                } else if (par2 >= 30 && par2 < 39 && !this.mergeItemStack(stack1, 3, 30, false)) {
                    return null;
                }
            } else if (!this.mergeItemStack(stack1, 3, 39, false)) {
                return null;
            }

            if (stack1.stackSize == 0) {
                slot.putStack((ItemStack) null);
            } else {
                slot.onSlotChanged();
            }

            if (stack1.stackSize == stack.stackSize) {
                return null;
            }

            slot.onPickupFromSlot(player, stack1);
        }

       return stack;
    }
}
