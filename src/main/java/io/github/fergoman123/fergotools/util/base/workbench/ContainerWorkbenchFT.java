package io.github.fergoman123.fergotools.util.base.workbench;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class ContainerWorkbenchFT extends Container
{
    public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
    public IInventory craftResult = new InventoryCraftResult();
    public World world;
    public int x, y, z;

    public ContainerWorkbenchFT(InventoryPlayer inventory, World world, int x, int y, int z)
    {
        super();
    }

    public abstract interface IContainerWorkbenchFT
    {
        public abstract void onCraftMatrixChanged(IInventory inventory);

        public abstract void onContainerClosed(EntityPlayer player);

        public abstract boolean canInteractWith(EntityPlayer player);

        public abstract ItemStack transferStackInSlot(EntityPlayer player, int slotIndex);
    }
}
