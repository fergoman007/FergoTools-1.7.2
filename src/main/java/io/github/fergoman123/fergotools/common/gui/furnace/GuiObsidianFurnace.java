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
import io.github.fergoman123.fergotools.common.gui.furnace.container.ContainerObsidianFurnace;
import io.github.fergoman123.fergotools.common.tileentities.TileObsidianFurnace;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergoutil.helper.GLStateHelper;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiObsidianFurnace extends GuiFurnaceFT
{
    public GuiObsidianFurnace(InventoryPlayer invPlayer, IInventory furnace) {
        super(new ContainerObsidianFurnace(invPlayer, furnace), new TileObsidianFurnace(), invPlayer, furnace);
    }

    public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GLStateHelper.color();
        GuiHelper.bindTexture(getGuiTexture());
        int startX = (width - xSize) / 2;
        int startY = (height - ySize) / 2;
        drawTexturedModalRect(startX, startY, 0, 0, xSize, ySize);

        if (this.getFurnaceInstance().isBurning(furnace))
        {
            int cookTime = getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(startX + 63, startY + 15 + 12 - cookTime, 176, 12 - cookTime, 14, cookTime + 2);
        }

        int scaleAdjustment = getCookProgressScaled(24);
        drawTexturedModalRect(startX + 83, startY + 12, 176, 14, scaleAdjustment + 1, 16);
    }

    @Override
    public ResourceLocation getGuiTexture() {
        return Textures.obsidianFurnaceGuiTexture;
    }
}
