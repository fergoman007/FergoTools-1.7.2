package io.github.fergoman123.fergotools.api.base;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public abstract class ContainerWorkbenchFT extends Container
{
    private InventoryPlayer invPlayer;
    private InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
    private IInventory craftResult = new InventoryCraftResult();
    private World world;
    private BlockPos pos;

    public ContainerWorkbenchFT(InventoryPlayer invPlayer, World world, BlockPos pos)
    {
        this.invPlayer = invPlayer;
        this.world = world;
        this.pos = pos;
        addInventorySlots();
    }

    public abstract void addInventorySlots();
    public abstract void addPlayerInventory();

    @Override
    public void onCraftMatrixChanged(IInventory inventoryIn) {
        this.craftResult.setInventorySlotContents(0, CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.world));
    }

    @Override
    public void onContainerClosed(EntityPlayer playerIn) {
        InventoryPlayer invPlayer = this.invPlayer;

        if (!this.getWorld().isRemote)
        {
            for(int i = 0; i < 9; ++i)
            {
                ItemStack stack = this.craftMatrix.getStackInSlotOnClosing(i);

                if(stack != null)
                {
                    playerIn.dropPlayerItemWithRandomChoice(stack, false);
                }
            }
        }
    }

    @Override
    public abstract boolean canInteractWith(EntityPlayer playerIn);

    @Override
    public abstract ItemStack transferStackInSlot(EntityPlayer playerIn, int index);

    public boolean canMergeSlot(ItemStack p_94530_1_, Slot p_94530_2_)
    {
        return p_94530_2_.inventory != this.craftResult && super.canMergeSlot(p_94530_1_, p_94530_2_);
    }

    public World getWorld() {
        return world;
    }

    public BlockPos getPos() {
        return pos;
    }

    public InventoryPlayer getInvPlayer() {
        return invPlayer;
    }

    public InventoryCrafting getCraftMatrix() {
        return craftMatrix;
    }

    public IInventory getCraftResult() {
        return craftResult;
    }
}
