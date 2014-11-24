/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.gui.workbench;

import io.github.fergoman123.fergotools.core.gui.workbench.container.ContainerSilkWorkbench;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.workbench.GuiWorkbenchFT;
import io.github.fergoman123.fergoutil.helper.GLHelper;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public final class GuiSilkWorkbench extends GuiWorkbenchFT
{
    public GuiSilkWorkbench(InventoryPlayer inventory, World world, int x, int y, int z)
    {
        super(new ContainerSilkWorkbench(inventory, world, x, y, z));
    }

    @Override
    public void drawGuiContainerForegroundLayer(int par1, int par2) {
        this.fontRendererObj.drawString(I18n.format(Locale.containerSilkWorkbench, new Object[0]), 28, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format(Locale.containerInventory, new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        GLHelper.glColor4f(1f, 1f, 1f, 1f);
        GuiHelper.bindTexture(Textures.silkWorkbenchGuiTexture);
        int k = (width - xSize) / 2;
        int l = (height - ySize) / 2;
        drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
    }
}
