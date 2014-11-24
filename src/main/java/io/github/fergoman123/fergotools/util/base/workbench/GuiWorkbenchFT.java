/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.base.workbench;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

public abstract class GuiWorkbenchFT extends GuiContainer
{
    public Object[] obj = new Object[0];

    /**
     * the base guicontainer for workbench
     * @param container the workbench container
     */
    public GuiWorkbenchFT(Container container) {
        super(container);
    }

    public abstract void drawGuiContainerBackgroundLayer(float particleTick, int x, int y);

    public abstract void drawGuiContainerForegroundLayer(int x, int y);
}
