package io.github.fergoman123.fergotools.common.gui.workbench;

import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiWorkbenchFT extends GuiContainer
{
	private String guiString;
	private ResourceLocation texture;

    public GuiWorkbenchFT(InventoryPlayer invPlayer, World world)
	{
		this(invPlayer, world, BlockPos.ORIGIN, (Block)null, null, (ResourceLocation)null);
	}
	
	public GuiWorkbenchFT(InventoryPlayer invPlayer, World world, BlockPos pos, Block interactionBlock, String guiString, ResourceLocation texture)
	{
		super(new ContainerWorkbenchFT(invPlayer, world, pos, interactionBlock));
		this.setGuiString(guiString);
		this.setTexture(texture);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		this.fontRendererObj.drawString(I18n.format(this.getGuiString()), 28, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(this.getTexture());
		int startX = (this.width - this.xSize) / 2;
		int startY = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(startX, startY, 0, 0, this.xSize, this.ySize);
	}

	public void setGuiString(String guiString)
	{
		this.guiString = guiString;
	}

	public void setTexture(ResourceLocation texture) {
		this.texture = texture;
	}

	public String getGuiString() {
		return guiString;
	}

	public ResourceLocation getTexture() {
		return texture;
	}
}
