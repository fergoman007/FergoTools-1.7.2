package fergoman123.mods.fergotools.util.base;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

public abstract class GuiFT extends GuiContainer{

    public GuiFT(Container container) {
        super(container);
    }

    public abstract void drawGuiContainerForegroundLayer(int par1, int par2);

    public abstract void drawGuiContainerBackgroundLayer(float par1, int par2, int par3);
}
