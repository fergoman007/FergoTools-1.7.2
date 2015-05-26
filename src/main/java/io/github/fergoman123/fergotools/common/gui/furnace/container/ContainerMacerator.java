/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.common.gui.furnace.container;

import io.github.fergoman123.fergotools.api.base.ContainerFurnaceFT;
import io.github.fergoman123.fergotools.api.base.TileFurnaceFT;
import io.github.fergoman123.fergotools.common.tileentities.TileMacerator;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;

public class ContainerMacerator extends ContainerFurnaceFT
{
    public ContainerMacerator(InventoryPlayer invPlayer, IInventory furnace) {
        super(invPlayer, furnace, new TileMacerator());
    }

    @Override
    public void addInventorySlots() {
        addSlot(furnace, 0, 80, 31);
        addMaceratorFuelSlot(furnace, 1, 62, 31);
        addOutputSlot(invPlayer.player, furnace, 2, 98, 31);
    }
}
