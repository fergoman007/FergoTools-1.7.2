package fergoman123.mods.fergotools.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fergoman123.mods.fergotools.gui.container.ContainerBronzeFurnace;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.lib.strings.GuiStrings;
import fergoman123.mods.fergotools.tileentity.TileEntityBronzeFurnace;

public class GuiBronzeFurnace extends GuiContainer {
	
	private static final ResourceLocation texture = new ResourceLocation(Reference.textureLocGui, Reference.dirGui + GuiStrings.furnaceGuiTexture);
	private TileEntityBronzeFurnace furnace;
	
	public GuiBronzeFurnace(InventoryPlayer player, TileEntityBronzeFurnace entity)
	{
		super(new ContainerBronzeFurnace(player, entity));
		this.furnace = entity;
	}
	
	public void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		String name = this.furnace.hasCustomInventoryName() ? this.furnace.getInventoryName() : I18n.format(this.furnace.getInventoryName(), new Object[0]);
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
	}
	
	public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{
		GL11.glColor4f(1f, 1f, 1f, 1f);
		this.mc.getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
		int i1;
		
		if(this.furnace.isBurning())
		{
			i1 = this.furnace.getBurnTimeRemainingScaled(12);
			this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
		}
		
		i1 = this.furnace.getCookProgressScaled(24);
		this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
	}
}
