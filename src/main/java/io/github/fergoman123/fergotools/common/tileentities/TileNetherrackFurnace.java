/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.common.tileentities;

import io.github.fergoman123.fergotools.common.gui.ContainerNetherrackFurnace;
import io.github.fergoman123.fergotools.init.Recipes;
import io.github.fergoman123.fergoutil.enums.SwitchAxis;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraftforge.common.util.Constants;

public class TileNetherrackFurnace extends TileEntityLockable implements IUpdatePlayerListBox, ISidedInventory{
    private static final int[] slotTop = new int[]{0};
    private static final int[] slotBottom = new int[]{1};

    private ItemStack[] slots = new ItemStack[2];

    private int cookTime;
    private int totalCookTime;

    private String customName;

    @Override
    public int getSizeInventory() {
        return this.slots.length;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return this.slots[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        if (this.slots[index] != null){
            ItemStack stack;

            if (this.slots[index].stackSize <= count)
            {
                stack = this.slots[index];
                this.slots[index] = null;
                return stack;
            }
            else
            {
                stack = this.slots[index].splitStack(count);
                if (this.slots[index].stackSize == 0){
                    this.slots[index] = null;
                }

                return stack;
            }
        }
        else
        {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int index) {
        if (this.slots[index] != null){
            ItemStack stack = this.slots[index];
            this.slots[index] = null;
            return stack;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        boolean flag = stack != null && stack.isItemEqual(this.slots[index]) && ItemStack.areItemStackTagsEqual(stack, this.slots[index]);
        this.slots[index] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit()){
            stack.stackSize = this.getInventoryStackLimit();
        }

        if (index == 0 && !flag)
        {
            this.totalCookTime = this.getCookTime(stack);
            this.cookTime = 0;
            this.markDirty();
        }
    }

    @Override
    public String getName() {
        return "fergotools.container.netherrackFurnace";
    }

    @Override
    public boolean hasCustomName() {
        return this.customName != null && this.customName.length() > 0;
    }

    public void setCustomInventoryName(String customName)
    {
        this.customName = customName;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        NBTTagList list = compound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        this.slots = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound compound1 = list.getCompoundTagAt(i);
            byte b0 = compound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.slots.length)
            {
                this.slots[b0] = ItemStack.loadItemStackFromNBT(compound1);
            }
        }

        this.cookTime = compound.getShort("CookTime");
        this.totalCookTime = compound.getShort("CookTimeTotal");

        if (compound.hasKey("CustomName", Constants.NBT.TAG_STRING)){
            this.customName = compound.getString("CustomName");
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setShort("CookTime", (short)this.cookTime);
        compound.setShort("CookTimeTotal", (short)this.totalCookTime);

        NBTTagList list = new NBTTagList();

        for (int i = 0; i < this.slots.length; i++) {
            if (this.slots[i] != null){
                NBTTagCompound compound1 = new NBTTagCompound();
                compound1.setByte("Slot", (byte)i);
                this.slots[i].writeToNBT(compound1);
            }
        }

        compound.setTag("Items", list);

        if (this.hasCustomName())
        {
            compound.setString("CustomName", this.customName);
        }
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    public void update()
    {

        if (!this.worldObj.isRemote)
        {
            if (this.slots[1] == null || this.slots[0] == null)
            {
                if (this.cookTime > 0)
                {
                    this.cookTime = MathHelper.clamp_int(this.cookTime - 2, 0, this.totalCookTime);
                }
            }
            else
            {
                if (this.canSmelt())
                {
                        if (this.slots[1] != null)
                        {
                            --this.slots[1].stackSize;

                            if (this.slots[1].stackSize == 0)
                            {
                                this.slots[1] = slots[1].getItem().getContainerItem(slots[1]);
                            }
                        }
                }

                if (this.canSmelt())
                {
                    ++this.cookTime;

                    if (this.cookTime == this.totalCookTime)
                    {
                        this.cookTime = 0;
                        this.totalCookTime = this.getCookTime(this.slots[0]);
                        this.smeltItem();
                    }
                }
                else
                {
                    this.cookTime = 0;
                }
            }
        }
    }

    public int getCookTime(ItemStack stack) {
        return 200;
    }


    private boolean canSmelt()
    {
        if (this.slots[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.slots[0]);
            if (itemstack == null) return false;
            if (this.slots[1] == null) return true;
            if (!this.slots[1].isItemEqual(itemstack)) return false;
            int result = slots[1].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.slots[1].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
    }

    /**
     * Turn one item from the furnace source stack into the appropriate smelted item in the furnace result stack
     */
    public void smeltItem()
    {
        if (this.canSmelt())
        {
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.slots[0]);

            if (this.slots[1] == null)
            {
                this.slots[1] = itemstack.copy();
            }
            else if (this.slots[1].getItem() == itemstack.getItem())
            {
                this.slots[1].stackSize += itemstack.stackSize;
            }

            --this.slots[0].stackSize;

            if (this.slots[0].stackSize <= 0)
            {
                this.slots[0] = null;
            }
        }
    }


    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return this.worldObj.getTileEntity(this.pos) == this && player.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D, (double) this.pos.getZ() + 0.5D) <= 64.0D;
    }

    public void openInventory(EntityPlayer player){}
    public void closeInventory(EntityPlayer player){}

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return index != 2 && (index != 1);
    }

    @Override
    public int[] getSlotsForFace(EnumFacing side) {
        return side == EnumFacing.DOWN ? slotBottom : slotTop;
    }

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return this.isItemValidForSlot(index, itemStackIn);
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
        return !(direction == EnumFacing.DOWN && index == 1);
    }

    @Override
    public String getGuiID() {
        return "fergotools:netherrackfurnace";
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
        return new ContainerNetherrackFurnace(playerInventory, this);
    }

    @Override
    public int getField(int id) {
        switch (id)
        {
            case 0: return this.cookTime;
            case 1: return this.totalCookTime;
            default:return 0;
        }
    }

    @Override
    public void setField(int id, int value) {
        switch (id)
        {
            case 0: this.cookTime = value;break;
            case 1: this.totalCookTime = value;
        }
    }

    @Override
    public int getFieldCount() {
        return 2;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.slots.length; i++) {
            this.slots[i] = null;
        }
    }
}
