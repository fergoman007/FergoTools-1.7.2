/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.gui.furnace;

import io.github.fergoman123.fergotools.core.gui.furnace.container.ContainerSilkFurnace;
import io.github.fergoman123.fergotools.core.tileentity.TileEntitySilkFurnace;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.GuiFT;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

public class GuiSilkFurnace extends GuiFT
{
    private TileEntitySilkFurnace furnace;

    public GuiSilkFurnace(InventoryPlayer par1InventoryPlayer, TileEntitySilkFurnace par2TileEntityFurnace)
    {
        super(new ContainerSilkFurnace(par1InventoryPlayer, par2TileEntityFurnace));
        this.furnace = par2TileEntityFurnace;
    }

    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = this.furnace.hasCustomInventoryName() ? this.furnace.getInventoryName() : GuiHelper.format(this.furnace.getInventoryName());
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        fontRendererObj.drawString(GuiHelper.format(Locale.containerInventory), 8, ySize - 126 + 2, 4210752);
    }

    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GuiHelper.bindTexture(Textures.silkFurnaceGuiTexture);
        int startX = (width - xSize) / 2;
        int startY = (height - ySize) / 2;
        drawTexturedModalRect(startX, startY, 0, 0, xSize, ySize);

        if (this.furnace.isBurning())
        {
            int cookTime = this.furnace.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(startX + 25, startY + 24 + 12 - cookTime, 176, 12 - cookTime, 14, cookTime + 2);
        }

        int scaleAdjustment = this.furnace.getCookProgressScaled(24);
        drawTexturedModalRect(startX + 80, startY + 21, 176, 14, scaleAdjustment + 1, 16);
    }
}
