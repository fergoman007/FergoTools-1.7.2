package io.github.fergoman123.fergotools.core.gui.workbench;

import io.github.fergoman123.fergotools.core.gui.workbench.container.ContainerObsidianWorkbench;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.Locale;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

/**
 * Created by Fergoman123.
 */
public class GuiObsidianWorkbench extends GuiContainer {
    public GuiObsidianWorkbench(InventoryPlayer inventory, World world, int x, int y, int z) {
        super(new ContainerObsidianWorkbench(inventory, world, x, y, z));
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
        this.fontRendererObj.drawString(I18n.format(Locale.containerObsidianWorkbench, new Object[0]), 28, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format(Locale.containerInventory, new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GL11.glColor4f(1f, 1f, 1f, 1f);
        this.mc.getTextureManager().bindTexture(Textures.obsidianWorkbenchGuiTexture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }
}
