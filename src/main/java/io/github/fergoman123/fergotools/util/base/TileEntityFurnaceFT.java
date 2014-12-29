 /*
   * Fergoman123's Tools
   * Copyright (c) 2014 fergoman123.
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the GNU Lesser Public License v2.1
   * which accompanies this distribution, and is available at
   * http://www.gnu.org/licenses/gpl-3.0.html
   */
  package io.github.fergoman123.fergotools.util.base;


 import io.github.fergoman123.fergoutil.util.NBTTags;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.init.Items;
 import net.minecraft.inventory.ISidedInventory;
 import net.minecraft.item.ItemStack;
 import net.minecraft.nbt.NBTTagCompound;
 import net.minecraft.nbt.NBTTagList;
 import net.minecraft.tileentity.TileEntity;

 /**
 * this class serves as a pass-through for a furnace tile entity
 * @author fergoman123
 */
public abstract class TileEntityFurnaceFT extends TileEntity implements ISidedInventory, ITileEntityFurnace
 {
     public int cookTime;
     public int burnTime;
     public int currentItemBurnTime;

     public String localizedName;

     public int inventoryStackLimit = 64;

     public static final int[] slotsTop = new int[] {0};
     public static final int[] slotsBottom = new int[] {2, 1};
     public static final int[] slotsSides = new int[] {1};

     public ItemStack[] slots = new ItemStack[3];

     public int getSizeInventory()
     {
         return this.slots.length;
     }

     public ItemStack getStackInSlot(int slot) {
         return this.slots[slot];
     }


     public ItemStack decrStackSize(int slot, int decrementAmount) {
         if (this.slots[slot] != null)
         {
             ItemStack stack;

             if (this.slots[slot].stackSize <= decrementAmount)
             {
                 stack = this.slots[slot];
                 this.slots[slot] = null;
                 return stack;
             }
             else
             {
                 stack = this.slots[slot].splitStack(decrementAmount);

                 if (this.slots[slot].stackSize == 0)
                 {
                     this.slots[slot] = null;
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
     public ItemStack getStackInSlotOnClosing(int slot) {
         if (this.slots[slot] != null)
         {
             ItemStack stack = this.slots[slot];
             this.slots[slot] = null;
             return stack;
         }
         else
         {
             return null;
         }
     }

     @Override
     public void setInventorySlotContents(int slot, ItemStack stack) {
         this.slots[slot] = stack;
         if (stack != null && stack.stackSize > this.getInventoryStackLimit())
         {
             stack.stackSize = this.getInventoryStackLimit();
         }
     }

     public abstract String getInventoryName();

     public boolean hasCustomInventoryName()
     {
         return this.localizedName != null && this.localizedName.length() > 0;
     }

     public void setGuiDisplayName(String displayName)
     {
         this.localizedName = displayName;
     }

     public void writeToNBT(NBTTagCompound compound)
     {
         super.writeToNBT(compound);
         compound.setShort(NBTTags.burnTime, (short)this.burnTime);
         compound.setShort(NBTTags.cookTime, (short)this.cookTime);
         NBTTagList list = new NBTTagList();

         for (int i = 0; i < this.slots.length; i++) {
             if (slots[i] != null)
             {
                 NBTTagCompound compound1 = new NBTTagCompound();
                 compound1.setByte(NBTTags.slot, (byte)i);
                 this.slots[i].writeToNBT(compound1);
                 list.appendTag(compound1);
             }
         }

         compound.setTag(NBTTags.items, list);

         if (this.hasCustomInventoryName())
         {
             compound.setString(NBTTags.customName, this.localizedName);
         }
     }

     @Override
     public int getInventoryStackLimit() {
         return inventoryStackLimit;
     }

     public abstract int getCookProgressScaled(int speed);

     public abstract int getBurnTimeRemainingScaled(int speed);

     public boolean isBurning()
     {
         return this.burnTime > 0;
     }

     public abstract void updateEntity();

     public abstract boolean canSmelt();

     public abstract void smeltItem();

     public boolean isUseableByPlayer(EntityPlayer player)
     {
         return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
     }

     public void openInventory(){}
     public void closeInventory(){}

     public abstract boolean isItemValidForSlot(int slot, ItemStack stack);

     public int[] getAccessibleSlotsFromSide(int slot)
     {
         return slot == 0 ? slotsBottom : (slot == 1 ? slotsTop : slotsSides);
     }

     public boolean canInsertItem(int slot, ItemStack stack, int par3)
     {
         return this.isItemValidForSlot(slot, stack);
     }

     public boolean canExtractItem(int slot, ItemStack stack, int par3)
     {
         return par3 != 0 || slot != 1 || stack.getItem() == Items.bucket;
     }

 }
