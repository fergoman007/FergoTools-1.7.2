package io.github.fergoman123.fergotools.core.gui.workbench;

import io.github.fergoman123.fergotools.core.gui.workbench.container.ContainerCoalWorkbench;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.workbench.GuiWorkbenchFT;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

/**
 * Created by Fergoman123.
 */
public final class GuiCoalWorkbench extends GuiWorkbenchFT
{
    public GuiCoalWorkbench(InventoryPlayer inventory, World world, int x, int y, int z)
    {
        super(new ContainerCoalWorkbench(inventory, world, x, y, z));
    }

    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRendererObj.drawString(I18n.format(Locale.containerCoalWorkbench, new Object[0]), 28, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format(Locale.containerInventory, new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1f, 1f, 1f, 1f);
        this.mc.getTextureManager().bindTexture(Textures.coalWorkbenchGuiTexture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }
}
