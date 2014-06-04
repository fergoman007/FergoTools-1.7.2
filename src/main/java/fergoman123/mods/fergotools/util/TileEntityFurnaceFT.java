package fergoman123.mods.fergotools.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public abstract class TileEntityFurnaceFT extends TileEntity implements ISidedInventory{

    public abstract int getSizeInventory();
    public abstract ItemStack getStackInSlot(int slot);
    public abstract ItemStack decrStackSize(int par1, int par2);
    public abstract ItemStack getStackInSlotOnClosing(int slot);
    public abstract void setInventorySlotContents(int slot, ItemStack stack);
    public abstract String getInventoryName();
    public abstract boolean hasCustomInventoryName();
    public abstract void setGuiDisplayName(String displayName);
    public abstract int getInventoryStackLimit();

    @SideOnly(Side.CLIENT)
    public abstract int getCookProgressScaled(int par1);

    @SideOnly(Side.CLIENT)
    public abstract int getBurnTimeRemainingScaled(int par1);

    public abstract boolean isBurning();
    public abstract void updateEntity();
    public abstract boolean canSmelt();
    public abstract void smeltItem();
    public abstract boolean isUseableByPlayer(EntityPlayer player);
    public abstract void openInventory();
    public abstract void closeInventory();
    public abstract boolean isItemValidForSlot(int slot, ItemStack stack);
    public abstract int[] getAccessibleSlotsFromSide(int slot);
    public abstract boolean canInsertItem(int par1, ItemStack stack, int par3);
    public abstract boolean canExtractItem(int par1, ItemStack stack, int par3);
}
