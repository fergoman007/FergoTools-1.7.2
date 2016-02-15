package io.github.fergoman123.fergotools.tileentity;

import io.github.fergoman123.fergotools.block.BlockQuartzFurnace;
import io.github.fergoman123.fergotools.inventory.ContainerQuartzFurnace;
import io.github.fergoman123.fergotools.reference.ContainerNames;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

public class TileEntityQuartzFurnace extends TileEntityFurnaceFT {

    public TileEntityQuartzFurnace() {
        super(200);
    }

    @Override
    public String getName() {
        return this.hasCustomName() ? this.inventoryName : ContainerNames.containerQuartzFurnace;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        NBTTagList list = nbt.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        this.slots = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound nbt1 = list.getCompoundTagAt(i);
            int j = nbt1.getByte("Slot");

            if (j >= 0 && j < this.slots.length) {
                this.slots[j] = ItemStack.loadItemStackFromNBT(nbt1);
            }
        }

        this.burnTime = nbt.getShort("BurnTime");
        this.cookTime = nbt.getShort("CookTime");
        this.totalCookTime = nbt.getShort("CookTimeTotal");
        this.currentItemBurnTime = getItemBurnTime(this.slots[1]);

        if (nbt.hasKey("CustomName")) {
            this.inventoryName = nbt.getString("CustomName");
        }
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    public boolean isBurning() {
        return this.burnTime > 0;
    }

    @SideOnly(Side.CLIENT)
    public static boolean isBurning(IInventory inventory) {
        return inventory.getField(0) > 0;
    }

    @Override
    public void update() {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if (this.isBurning()) {
            --this.burnTime;
        }

        if (!this.worldObj.isRemote) {
            if (this.isBurning() || this.slots[1] != null && this.slots[0] != null) {
                if (!this.isBurning() && this.canSmelt()) {
                    this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                    if (this.isBurning()) {
                        flag1 = true;

                        if (this.slots[1] != null) {
                            --this.slots[1].stackSize;

                            if (this.slots[1].stackSize == 0) {
                                this.slots[1] = slots[1].getItem().getContainerItem(slots[1]);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt()) {
                    ++this.cookTime;

                    if (this.cookTime == this.totalCookTime) {
                        this.cookTime = 0;
                        this.totalCookTime = this.getCookTime(this.slots[0]);
                        this.smeltItem();
                        flag1 = true;
                    }
                } else {
                    this.cookTime = 0;
                }
            } else if (!this.isBurning() && this.cookTime > 0) {
                this.cookTime = MathHelper.clamp_int(this.cookTime - 2, 0, this.totalCookTime);
            }

            if (flag != this.isBurning()) {
                flag1 = true;
                BlockQuartzFurnace.setState(this.isBurning(), this.worldObj, this.pos);
            }
        }

        if (flag1) {
            this.markDirty();
        }
    }

    public int getCookTime(ItemStack stack) {
        return 1000;
    }

    public static boolean isItemFuel(ItemStack stack) {
        return getItemBurnTime(stack) > 0;
    }

    public boolean isUseableByPlayer(EntityPlayer player) {
        return this.worldObj.getTileEntity(this.pos) == this && player.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D, (double) this.pos.getZ() + 0.5D) <= 64.0D;
    }

    public void openInventory(EntityPlayer player) {
    }

    public void closeInventory(EntityPlayer player) {
    }

    /**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
     */
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return index != 2 && (index != 1 || (isItemFuel(stack) || SlotFurnaceFuel.isBucket(stack)));
    }

    public int[] getSlotsForFace(EnumFacing side) {
        return side == EnumFacing.DOWN ? slotsBottom : (side == EnumFacing.UP ? slotsTop : slotsSides);
    }

    /**
     * Returns true if automation can insert the given item in the given slot from the given side. Args: slot, item,
     * side
     */
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return this.isItemValidForSlot(index, itemStackIn);
    }

    /**
     * Returns true if automation can extract the given item in the given slot from the given side. Args: slot, item,
     * side
     */
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
        if (direction == EnumFacing.DOWN && index == 1) {
            Item item = stack.getItem();

            if (item != Items.water_bucket && item != Items.bucket) {
                return false;
            }
        }

        return true;
    }

    public String getGuiID() {
        return "fergotools:quartzFurnace";
    }

    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
        return new ContainerQuartzFurnace(playerInventory, this);
    }

    public int getField(int id) {
        switch (id) {
            case 0:
                return this.burnTime;
            case 1:
                return this.currentItemBurnTime;
            case 2:
                return this.cookTime;
            case 3:
                return this.totalCookTime;
            default:
                return 0;
        }
    }

    public void setField(int id, int value) {
        switch (id) {
            case 0:
                this.burnTime = value;
                break;
            case 1:
                this.currentItemBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            case 3:
                this.totalCookTime = value;
        }
    }

    public int getFieldCount() {
        return 4;
    }

    public void clear() {
        for (int i = 0; i < this.slots.length; ++i) {
            this.slots[i] = null;
        }
    }

    IItemHandler handlerTop = new SidedInvWrapper(this, EnumFacing.UP);
    IItemHandler handlerBottom = new SidedInvWrapper(this, EnumFacing.DOWN);
    IItemHandler handlerSide = new SidedInvWrapper(this, EnumFacing.WEST);

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (facing != null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            if (facing == EnumFacing.DOWN)
                return (T) handlerBottom;
            else if (facing == EnumFacing.UP)
                return (T) handlerTop;
            else
                return (T) handlerSide;
        return super.getCapability(capability, facing);
    }
}
