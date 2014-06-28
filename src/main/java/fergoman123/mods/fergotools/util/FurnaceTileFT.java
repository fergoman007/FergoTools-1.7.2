package fergoman123.mods.fergotools.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergoutil.tileentity.ITileFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public abstract class FurnaceTileFT extends TileEntity implements ISidedInventory, ITileFurnace
{
    public int[] slotsTop = new int[]{0};
    public int[] slotsBottom = new int[]{2, 1};
    public int[] slotsSides = new int[]{1};

    public ItemStack[] slots = new ItemStack[3];

    public int burnTime;
    public int currentItemBurnTime;
    public int cookTime;

    public int inventoryStackLimit = 64;

    public String localizedName;

    public abstract ItemStack getStackInSlot(int slot);

    public abstract ItemStack decrStackSize(int par1, int par2);

    public abstract ItemStack getStackInSlotOnClosing(int slot);

    public abstract void setInventorySlotContents(int slot, ItemStack stack);

    public abstract String getInventoryName();

    public abstract boolean hasCustomInventoryName();

    public abstract void setGuiDisplayName(String displayName);

    public abstract int getInventoryStackLimit();

    @SideOnly(Side.CLIENT)
    public abstract int getCookProgressScaled(int speed);

    @SideOnly(Side.CLIENT)
    public abstract int getBurnTimeRemainingScaled(int speed);

    public abstract boolean isBurning();

    public abstract void updateEntity();

    public abstract boolean canSmelt();

    public abstract void smeltItem();

    public abstract boolean isUseableByPlayer(EntityPlayer player);

    public abstract void openInventory();

    public abstract void closeInventory();

    public abstract boolean isItemValidForSlot(int slot, ItemStack stack);

    public abstract boolean canInsertItem(int par1, ItemStack stack, int par3);

    public abstract boolean canExtractItem(int par1, ItemStack stack, int par3);
}
