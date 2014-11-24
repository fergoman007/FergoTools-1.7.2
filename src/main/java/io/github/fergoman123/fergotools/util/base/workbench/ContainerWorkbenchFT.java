/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

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
    /** the crafting grid */
    public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
    /** the crafting result */
    public IInventory craftResult = new InventoryCraftResult();
    /** the world */
    public World world;
    /** the x, y and z coordinates */
    public int x, y, z;

    /**
     * the main constuctor for the workbench container
     * @param inventory the inventory of the player
     * @param world the world in which the player is in
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
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
