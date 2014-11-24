/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.gui.workbench;

import io.github.fergoman123.fergotools.core.gui.workbench.container.ContainerEmeraldWorkbench;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.workbench.GuiWorkbenchFT;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public final class GuiEmeraldWorkbench extends GuiWorkbenchFT
{
    public GuiEmeraldWorkbench(InventoryPlayer inventory, World world, int x, int y, int z)
    {
        super(new ContainerEmeraldWorkbench(inventory, world, x, y, z));
    }

    @Override
    public void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
        this.fontRendererObj.drawString(I18n.format(Locale.containerEmeraldWorkbench, new Object[0]), 28, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format(Locale.containerInventory, new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    public void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GL11.glColor4f(1f, 1f, 1f, 1f);
        this.mc.getTextureManager().bindTexture(Textures.emeraldWorkbenchGuiTexture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }
}
