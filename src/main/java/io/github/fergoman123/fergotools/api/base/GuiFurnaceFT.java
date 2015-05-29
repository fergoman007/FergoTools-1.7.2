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
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public abstract class GuiFurnaceFT extends GuiFurnaceFergo
{
    private TileFurnaceFT furnaceInstance;

    public GuiFurnaceFT(Container container, TileFurnaceFT furnaceInstance, InventoryPlayer invPlayer, IInventory furnace) {
        super(container, invPlayer, furnace);
        this.furnaceInstance = furnaceInstance;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String s = this.furnace.getDisplayName().getUnformattedText();
        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 4, 4210752);
        this.fontRendererObj.drawString(invPlayer.getDisplayName().getUnformattedText(), 8, this.ySize - 126 + 2, 4210752);
    }

    @Override
    public abstract void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY);

    public TileFurnaceFT getFurnaceInstance()
    {
        return furnaceInstance;
    }

    public abstract ResourceLocation getGuiTexture();
}
