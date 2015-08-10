package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.inventory.ContainerObsidianWorkbench;
import io.github.fergoman123.fergotools.reference.Assets;
import io.github.fergoman123.fergoutil.helper.GLStateHelper;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class GuiObsidianWorkbench extends GuiContainer{

    public GuiObsidianWorkbench(InventoryPlayer invPlayer, World world){
        this(invPlayer, world, BlockPos.ORIGIN);
    }

    public GuiObsidianWorkbench(InventoryPlayer invPlayer, World world, BlockPos pos){
        super(new ContainerObsidianWorkbench(invPlayer, world, pos));
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        this.fontRendererObj.drawString(I18n.format(Assets.Locale.containerObsidianWorkbench), 28, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GLStateHelper.color();
        this.mc.getTextureManager().bindTexture(Assets.GuiTextures.obsidianWorkbenchGui);
        int startX = (width - xSize) / 2;
        int startY = (height - ySize) / 2;
        drawTexturedModalRect(startX, startY, 0, 0, xSize, ySize);
    }
}
