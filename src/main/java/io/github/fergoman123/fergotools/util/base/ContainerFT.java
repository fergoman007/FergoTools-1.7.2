/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.base;


import io.github.fergoman123.fergoutil.inventory.FergoContainer;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * this is the base class for
 * furnaces
 */
public abstract class ContainerFT extends FergoContainer{
    /** the players inventory */
    public InventoryPlayer invPlayer;
    public int playerInvRows = 3;
    public int playerInvCols = 9;
    public int lastBurnTime, lastCookTime, lastItemBurnTime;

    /**
     * adds the player inventory to the container
     */
    public abstract void addPlayerInventory();

    /**
     * adds the slots for the container
     */
    public abstract void addInventorySlots();
}
