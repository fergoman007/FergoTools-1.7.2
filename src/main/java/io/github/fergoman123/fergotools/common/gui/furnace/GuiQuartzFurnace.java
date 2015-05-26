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
import io.github.fergoman123.fergotools.common.gui.furnace.container.ContainerQuartzFurnace;
import io.github.fergoman123.fergotools.common.tileentities.TileQuartzFurnace;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergoutil.helper.GLStateHelper;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;

public class GuiQuartzFurnace extends GuiFurnaceFT
{

    public GuiQuartzFurnace(InventoryPlayer invPlayer, IInventory furnace) {
        super(new ContainerQuartzFurnace(invPlayer, furnace), new TileQuartzFurnace(), invPlayer, furnace, Textures.quartzFurnaceGuiTexture);
    }

    @Override
    public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GLStateHelper.color();
        GuiHelper.bindTexture(this.texture);
        int startX = (width - xSize) / 2;
        int startY = (height - ySize) / 2;
        drawTexturedModalRect(startX, startY, 0, 0, xSize, ySize);

        if (TileQuartzFurnace.isBurning(furnace))
        {
            int cookTime = getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(startX + 63, startY + 7 + 12 - cookTime, 176, 12 - cookTime, 14, cookTime + 2);
        }

        int scaleAdjustment = getCookProgressScaled(24);
        drawTexturedModalRect(startX + 83, startY + 5, 176, 14, scaleAdjustment + 1, 16);
    }
}
