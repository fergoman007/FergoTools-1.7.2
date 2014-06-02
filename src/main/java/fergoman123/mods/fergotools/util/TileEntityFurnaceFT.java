package fergoman123.mods.fergotools.util;

import fergoman123.mods.fergoutil.util.IFurnaceTile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Fergoman123 on 02/06/2014.
 */
public abstract class TileEntityFurnaceFT extends TileEntity implements ISidedInventory, IFurnaceTile{


    public abstract void setGuiDisplayName(String displayName);
    public abstract boolean canSmelt();
    public abstract void smeltItem();
    public abstract int[] getAccessibleSlotsFromSide(int var1);
    public abstract boolean canInsertItem(int var1, ItemStack var2, int var3);
    public abstract boolean canExtractItem(int var1, ItemStack var2, int var3);
    public abstract int getSizeInventory();
    public abstract ItemStack getStackInSlot(int var1);
    public abstract ItemStack decrStackSize(int var1, int var2);
    public abstract ItemStack getStackInSlotOnClosing(int var1);
    public abstract void setInventorySlotContents(int par1, ItemStack stack);
    public abstract String getInventoryName();
    public abstract boolean hasCustomInventoryName();
    public abstract int getInventoryStackLimit();
    public abstract boolean isUseableByPlayer(EntityPlayer var1);
    public abstract void openInventory();
    public abstract void closeInventory();
    public abstract boolean isItemValidForSlot(int var1, ItemStack var2);
}
