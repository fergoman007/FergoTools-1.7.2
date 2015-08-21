package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.reference.Assets;
import io.github.fergoman123.fergoutil.helper.GLStateHelper;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiWorkbenchFT extends GuiContainer
{
	private String guiString;
	private ResourceLocation texture;

    public GuiWorkbenchFT(Container container, InventoryPlayer invPlayer, World world){
		this(container, invPlayer, world, null, null);
	}
	
	public GuiWorkbenchFT(Container container, InventoryPlayer invPlayer, World world, String guiString, ResourceLocation texture){
		super(container);
		this.guiString = guiString;
		this.texture = texture;
	}

	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		if(guiString == null){
			this.fontRendererObj.drawString(I18n.format("ft.container.noname"), 28, 6, 4210752);
			this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
		} else {
			this.fontRendererObj.drawString(I18n.format(this.guiString), 28, 6, 4210752);
			this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
		}
	}

	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		if(texture == null){
			GLStateHelper.color();
			GuiHelper.bindTexture(Assets.getWorkbenchGui("blankWorkbench"));
			int startX = (this.width - this.xSize) / 2;
			int startY = (this.height - this.ySize) / 2;
			this.drawTexturedModalRect(startX, startY, 0, 0, this.xSize, this.ySize);
		} else {
			GLStateHelper.color();
			GuiHelper.bindTexture(this.texture);
			int startX = (this.width - this.xSize) / 2;
			int startY = (this.height - this.ySize) / 2;
			this.drawTexturedModalRect(startX, startY, 0, 0, this.xSize, this.ySize);
		}
	}
}
