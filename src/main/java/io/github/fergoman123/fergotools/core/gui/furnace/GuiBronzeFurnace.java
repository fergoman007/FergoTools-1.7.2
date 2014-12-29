/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.gui.furnace;

import io.github.fergoman123.fergotools.core.gui.furnace.container.ContainerBronzeFurnace;
import io.github.fergoman123.fergotools.core.tileentity.TileEntityBronzeFurnace;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.ints.ColorInts;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.GuiFT;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

public class GuiBronzeFurnace extends GuiFT
{
    private TileEntityBronzeFurnace furnace;
    public GuiBronzeFurnace(InventoryPlayer par1InventoryPlayer, TileEntityBronzeFurnace par2TileEntityFurnace)
    {
        super(new ContainerBronzeFurnace(par1InventoryPlayer, par2TileEntityFurnace));
        furnace = par2TileEntityFurnace;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = furnace.hasCustomInventoryName() ? furnace.getInventoryName() : GuiHelper.format(furnace.getInventoryName());
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, ColorInts.renderColorInventory);
        fontRendererObj.drawString(GuiHelper.format(Locale.containerInventory), 8, ySize - 126 + 2, ColorInts.renderColorInventory);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GuiHelper.bindTexture(Textures.bronzeFurnaceGuiTexture);
        int startX = (width - xSize) / 2;
        int startY = (height - ySize) / 2;
        drawTexturedModalRect(startX, startY, 0, 0, xSize, ySize);

        if (furnace.isBurning())
        {
            int cookTime = furnace.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(startX + 25, startY + 24 + 12 - cookTime, 176, 12 - cookTime, 14, cookTime + 2);
        }

        int scaleAdjustment = furnace.getCookProgressScaled(24);
        drawTexturedModalRect(startX + 80, startY + 21, 176, 14, scaleAdjustment + 1, 16);
    }
}
