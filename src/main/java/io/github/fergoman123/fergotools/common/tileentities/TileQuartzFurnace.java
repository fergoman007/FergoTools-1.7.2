package io.github.fergoman123.fergotools.common.tileentities;

import io.github.fergoman123.fergotools.api.base.TileFurnaceFT;
import io.github.fergoman123.fergotools.common.blocks.BlockQuartzFurnace;
import io.github.fergoman123.fergotools.common.gui.furnace.container.ContainerQuartzFurnace;
import io.github.fergoman123.fergotools.reference.names.Locale;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.MathHelper;

public class TileQuartzFurnace extends TileFurnaceFT
{
    @Override
    public String getCommandSenderName() {
        return Locale.containerQuartzFurnace;
    }

    @Override
    public void update() {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if (this.isBurning())
        {
            --this.burnTime;
        }

        if (!this.worldObj.isRemote)
        {
            if (!this.isBurning() && (this.slots[1] == null || this.slots[0] == null))
            {
                if (!this.isBurning() && this.cookTime > 0)
                {
                    this.cookTime = MathHelper.clamp_int(this.cookTime - 2, 0, this.totalCookTime);
                }
            }
            else
            {
                if (!this.isBurning() && this.canSmelt())
                {
                    this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                    if (this.isBurning())
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

                    if (this.cookTime == this.totalCookTime)
                    {
                        this.cookTime = 0;
                        this.totalCookTime = this.getFurnaceSpeed(this.slots[0]);
                        this.smeltItem();
                        flag1 = true;
                    }
                }
                else
                {
                    this.cookTime = 0;
                }
            }

            if (flag != this.isBurning())
            {
                flag1 = true;
                BlockQuartzFurnace.setState(this.isBurning(), this.worldObj, this.pos);
            }
        }

        if (flag1)
        {
            this.markDirty();
        }
    }

    @Override
    public int getFurnaceSpeed(ItemStack stack) {
//        return FurnaceInts.quartzFurnaceSpeed;
        return 2000;
    }

    @Override
    public boolean canSmelt() {
        if (this.slots[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack stack = FurnaceRecipes.instance().getSmeltingResult(this.slots[0]);
            if (stack == null)return false;
            if (this.slots[2] == null)return true;
            if (!this.slots[2].isItemEqual(stack))return false;
            int result = slots[2].stackSize + stack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.slots[2].getMaxStackSize();
        }
    }

    @Override
    public void smeltItem() {
        if (this.canSmelt())
        {
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.slots[0]);

            if (this.slots[2] == null)
            {
                this.slots[2] = itemstack.copy();
            }
            else if (this.slots[2].getItem() == itemstack.getItem())
            {
                this.slots[2].stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
            }

            if (this.slots[0].getItem() == Item.getItemFromBlock(Blocks.sponge) && this.slots[0].getMetadata() == 1 && this.slots[1] != null && this.slots[1].getItem() == Items.bucket)
            {
                this.slots[1] = new ItemStack(Items.water_bucket);
            }

            --this.slots[0].stackSize;

            if (this.slots[0].stackSize <= 0)
            {
                this.slots[0] = null;
            }
        }
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return index != 2 && (index != 1 || isItemFuel(stack) || SlotFurnaceFuel.isBucket(stack));
    }

    public static boolean isItemFuel(ItemStack stack)
    {
        return getItemBurnTime(stack) > 0;
    }

    @Override
    public String getGuiID() {
        return "fergotools:quartzFurnace";
    }

    @Override
    public Container createContainer(InventoryPlayer invPlayer, EntityPlayer player) {
        return new ContainerQuartzFurnace(invPlayer, this);
    }
}
