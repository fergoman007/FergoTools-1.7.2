/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.common.gui.furnace;

import io.github.fergoman123.fergotools.api.base.GuiFurnaceFT;
import io.github.fergoman123.fergotools.common.gui.furnace.container.ContainerMacerator;
import io.github.fergoman123.fergotools.common.tileentities.TileMacerator;
import io.github.fergoman123.fergotools.reference.Textures;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;

public class GuiMacerator extends GuiFurnaceFT
{
    public GuiMacerator(InventoryPlayer invPlayer, IInventory furnace) {
        super(new ContainerMacerator(invPlayer, furnace), new TileMacerator(), invPlayer, furnace);
    }

    @Override
    public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {

    }
}
