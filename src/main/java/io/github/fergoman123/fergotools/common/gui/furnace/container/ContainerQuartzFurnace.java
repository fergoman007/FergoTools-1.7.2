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
import io.github.fergoman123.fergotools.common.tileentities.TileQuartzFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerQuartzFurnace extends ContainerFurnaceFT
{
    public ContainerQuartzFurnace(InventoryPlayer invPlayer, IInventory furnace) {
        super(invPlayer, furnace, new TileQuartzFurnace());
    }
}
