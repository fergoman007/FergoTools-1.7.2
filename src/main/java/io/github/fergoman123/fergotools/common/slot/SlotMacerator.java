/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.common.slot;

import io.github.fergoman123.fergoutil.inventory.SlotFuelFergo;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class SlotMacerator extends SlotFuelFergo
{

    public SlotMacerator(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return TileFurnaceFT.getMaceratorBurnTime(stack) > 0;
    }
}
