package io.github.fergoman123.fergotools.inventory;

import io.github.fergoman123.fergoutil.gui.IContainerFergo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ContainerObsidianWorkbench extends Container implements IContainerFergo{

    public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
    public IInventory craftResult = new InventoryCraftResult();
    private World world;
    private BlockPos pos;

    public ContainerObsidianWorkbench(InventoryPlayer invPlayer, World world, BlockPos pos) {
        this.world = world;
        this.pos = pos;
    }

    @Override
    public void addPlayerInventory() {

    }

    @Override
    public void addInventorySlots() {

    }



}
