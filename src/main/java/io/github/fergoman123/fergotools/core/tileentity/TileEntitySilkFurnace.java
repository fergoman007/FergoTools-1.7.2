/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergotools.core.block.furnace.BlockSilkFurnace;
import io.github.fergoman123.fergotools.reference.Ints;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.TileEntityFurnaceFT;
import io.github.fergoman123.fergoutil.helper.BlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public final class TileEntitySilkFurnace extends TileEntityFurnaceFT {


    public String getInventoryName()
    {
        return this.hasCustomInventoryName() ? this.customName : Locale.containerSilkFurnace;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        NBTTagList list = compound.getTagList("Items", 10);
        this.slots = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < list.tagCount(); ++i)
        {
            NBTTagCompound compound1 = list.getCompoundTagAt(i);
            byte b0 = compound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.slots.length)
            {
                this.slots[b0] = ItemStack.loadItemStackFromNBT(compound1);
            }
        }

        this.burnTime = compound.getShort("BurnTime");
        this.cookTime = compound.getShort("CookTime");
        this.currentItemBurnTime = getItemBurnTime(this.slots[1]);

        if (compound.hasKey("CustomName", 8))
        {
            this.customName = compound.getString("CustomName");
        }
    }

    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int speed)
    {
        return this.cookTime * speed / Ints.Furnace.silkFurnaceSpeed;
    }

    @SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int speed)
    {
        if (this.currentItemBurnTime == 0)
        {
            this.currentItemBurnTime = Ints.Furnace.silkFurnaceSpeed;
        }

        return this.burnTime * speed / this.currentItemBurnTime;
    }

    public boolean isBurning(){return this.burnTime > 0;}

    public void updateEntity()
    {
        boolean flag = this.burnTime > 0;
        boolean flag1 = false;

        if (this.burnTime > 0)
        {
            --this.burnTime;
        }

        if (!this.worldObj.isRemote)
        {
            if (this.burnTime == 0 && this.canSmelt())
            {
                this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                if (this.burnTime > 0)
                {
                    flag1 = true;

                    if (this.slots[1] != null)
                    {
                        --this.slots[1].stackSize;

                        if (this.slots[1].stackSize == 0)
                        {
                            this.slots[1] = slots[1].getItem().getContainerItem(slots[1]);
                        }
                    }
                }
            }

            if (this.isBurning() && this.canSmelt())
            {
                ++this.cookTime;

                if (this.cookTime == Ints.Furnace.silkFurnaceSpeed)
                {
                    this.cookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            }
            else
            {
                this.cookTime = 0;
            }

            if (flag != this.burnTime > 0)
            {
                flag1 = true;
                BlockSilkFurnace.updateSilkFurnaceBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1)
        {
            this.markDirty();
        }
    }

    public boolean canSmelt()
    {
        if (this.slots[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
            if (stack == null)return false;
            if (this.slots[2] == null)return true;
            if (!this.slots[2].isItemEqual(stack))return false;
            int result = slots[2].stackSize + stack.stackSize;
            return (result <= getInventoryStackLimit() && result <= this.slots[2].getMaxStackSize());
        }
    }

    public void smeltItem()
    {
        if (this.canSmelt())
        {
            ItemStack stack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);

            if (this.slots[2] == null)
            {
                this.slots[2] = stack.copy();
            }
            else if (this.slots[2].getItem() == stack.getItem())
            {
                this.slots[2].stackSize += stack.stackSize;
            }

            --this.slots[0].stackSize;

            if (this.slots[0].stackSize <= 0)
            {
                this.slots[0] = null;
            }
        }
    }

    private static int getItemBurnTime(ItemStack stack)
    {
        if (stack == null)
        {
            return 0;
        }
        else
        {
            Item item = stack.getItem();

            if (item instanceof ItemBlock && BlockHelper.getBlockFromItem(item) != null)
            {
                Block block = BlockHelper.getBlockFromItem(item);

                if (block == Blocks.wooden_slab)
                {
                    return 150;
                }

                if (block.getMaterial() == Material.wood)
                {
                    return 300;
                }

                if (block == Blocks.coal_block)
                {
                    return 16000;
                }
            }

            if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD"))return 200;
            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD"))return 200;
            if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD"))return 200;
            if (item == Items.stick)return 100;
            if (item == Items.coal)return 1600;
            if (item == Items.lava_bucket)return 20000;
            if (item == BlockHelper.getItemFromBlock(Blocks.sapling))return 100;
            if (item == Items.blaze_rod)return 2400;
            return GameRegistry.getFuelValue(stack);
        }
    }

    public static boolean isItemFuel(ItemStack stack)
    {
        return getItemBurnTime(stack) > 0;
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        return slot == 2 ? false : (slot == 1 ? isItemFuel(stack) : true);
    }
}
