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
