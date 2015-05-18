package io.github.fergoman123.fergotools.common.gui.workbench.container;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ContainerWorkbenchFT extends Container {

	public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
	public IInventory craftResult = new InventoryCraftResult();
	private World world;
	private BlockPos pos;
    private Block interactionBlock;
	
	public ContainerWorkbenchFT(InventoryPlayer invPlayer, World world, BlockPos pos, Block interactionBlock)
	{
		this.world = world;
		this.pos = pos;
        this.interactionBlock = interactionBlock;
		this.addSlotToContainer(new SlotCrafting(invPlayer.player, this.craftMatrix, this.craftResult, 0, 124, 35));
		
		for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 3; ++j)
            {
                this.addSlotToContainer(new Slot(this.craftMatrix, j + i * 3, 30 + j * 18, 17 + i * 18));
            }
        }

        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
        }

        this.onCraftMatrixChanged(this.craftMatrix);
	}

    public void onCraftMatrixChanged(IInventory inventory)
    {
        this.craftResult.setInventorySlotContents(0, CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.world));
    }

    public void onContainerClosed(EntityPlayer player)
    {
        super.onContainerClosed(player);

        if (!this.world.isRemote)
        {
            for (int i = 0; i < 9; i++) {
                ItemStack stack = this.craftMatrix.getStackInSlotOnClosing(i);
                if (stack != null)
                {
                    player.dropPlayerItemWithRandomChoice(stack, false);
                }
            }
        }
    }
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
        return this.world.getBlockState(this.pos).getBlock() == this.interactionBlock && playerIn.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D, (double) this.pos.getZ() + 0.5D) <= 64.0D;
	}

    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 0)
            {
                if (!this.mergeItemStack(itemstack1, 10, 46, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (index >= 10 && index < 37)
            {
                if (!this.mergeItemStack(itemstack1, 37, 46, false))
                {
                    return null;
                }
            }
            else if (index >= 37 && index < 46)
            {
                if (!this.mergeItemStack(itemstack1, 10, 37, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 10, 46, false))
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

            slot.onPickupFromSlot(playerIn, itemstack1);
        }

        return itemstack;
    }

    public boolean canMergeSlot(ItemStack stack, Slot slot)
    {
        return slot.inventory != this.craftResult && super.canMergeSlot(stack, slot);
    }
}
