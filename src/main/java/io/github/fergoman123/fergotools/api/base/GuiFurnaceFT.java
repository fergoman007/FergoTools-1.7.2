/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergoutil.gui.GuiFurnaceFergo;
import io.github.fergoman123.fergoutil.helper.GLStateHelper;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiFurnaceFT extends GuiFurnaceFergo
{
    private TileFurnaceFT furnaceInstance;

    public GuiFurnaceFT(Container container, TileFurnaceFT furnaceInstance, InventoryPlayer invPlayer, IInventory furnace, ResourceLocation texture) {
        super(container, invPlayer, furnace, texture);
        this.furnaceInstance = furnaceInstance;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String s = this.furnace.getDisplayName().getUnformattedText();
        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(invPlayer.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GLStateHelper.color();
        GuiHelper.bindTexture(this.texture);
        int startX = (width - xSize) / 2;
        int startY = (height - ySize) / 2;
        drawTexturedModalRect(startX, startY, 0, 0, xSize, ySize);

        if (furnaceInstance.isBurning(this.furnace))
        {
            int cookTime = getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(startX + 63, startY + 7 + 12 - cookTime, 176, 12 - cookTime, 14, cookTime + 2);
        }

        int scaleAdjustment = getCookProgressScaled(24);
        drawTexturedModalRect(startX + 83, startY + 5, 176, 14, scaleAdjustment + 1, 16);
    }
}
