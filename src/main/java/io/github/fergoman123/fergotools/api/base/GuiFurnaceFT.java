/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.api.base;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;

public abstract class GuiFurnaceFT extends GuiContainer
{

    public InventoryPlayer invPlayer;
    public IInventory furnace;

    public GuiFurnaceFT(Container container, InventoryPlayer invPlayer, IInventory furnace) {
        super(container);
        this.invPlayer = invPlayer;
        this.furnace = furnace;
    }

    protected abstract void drawGuiContainerForegroundLayer(int mouseX, int mouseY);
    public abstract void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY);

    public int getCookProgressScaled(int pixels){
        int j = this.furnace.getField(2);
        int k = this.furnace.getField(3);
        return k != 0 && j != 0 ? j*pixels / k : 0;
    }

    public int getBurnLeftScaled(int pixels){
        int j = this.furnace.getField(1);
        if (j == 0){j = 200;}
        return this.furnace.getField(0) * pixels / j;
    }

    public int getCookTime(){
        return getBurnLeftScaled(12);
    }

    public int getScaledAdjustment(){
        return getCookProgressScaled(24);
    }
}
