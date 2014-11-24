/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.gui.furnace;

import io.github.fergoman123.fergotools.core.gui.furnace.container.ContainerEmeraldFurnace;
import io.github.fergoman123.fergotools.core.tileentity.TileEntityEmeraldFurnace;
import io.github.fergoman123.fergotools.reference.Ints;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.GuiFT;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

public class GuiEmeraldFurnace extends GuiFT
{
    private TileEntityEmeraldFurnace furnace;
    public GuiEmeraldFurnace(InventoryPlayer inventory, TileEntityEmeraldFurnace furnace)
    {
        super(new ContainerEmeraldFurnace(inventory, furnace));
        this.furnace = furnace;
    }


    @Override
    public void drawGuiContainerForegroundLayer(int par1, int par2) {
        String s = furnace.hasCustomInventoryName() ? furnace.getInventoryName() : GuiHelper.format(furnace.getInventoryName());
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, Ints.Colors.renderColorInventory);
        fontRendererObj.drawString(GuiHelper.format(Locale.containerInventory), 8, ySize - 126 + 2, Ints.Colors.renderColorInventory);
    }

    @Override
    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GuiHelper.bindTexture(Textures.emeraldFurnaceGuiTexture);
        int startX = (width - xSize) / 2;
        int startY = (height - ySize) / 2;
        drawTexturedModalRect(startX, startY, 0, 0, xSize, ySize);
        if (furnace.isBurning())
        {
            int cookTime = furnace.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(startX + 25, startY + 24 + 12 - cookTime, 176, 12 - cookTime, 14, cookTime + 2);
        }

        int scaleAdjustment = furnace.getCookProgressScaled(24);
        drawTexturedModalRect(startX + 77, startY + 27, 176, 14, scaleAdjustment + 1, 16);
    }
}
