package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.common.tileentities.TileQuartzFurnace;
import io.github.fergoman123.fergotools.inventory.ContainerObsidianFurnace;
import io.github.fergoman123.fergotools.reference.Assets.GuiTextures;
import io.github.fergoman123.fergoutil.gui.GuiFurnaceFergo;
import io.github.fergoman123.fergoutil.helper.GLStateHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;

public class GuiObsidianFurnace extends GuiFurnaceFergo {

	public GuiObsidianFurnace(InventoryPlayer invPlayer, IInventory furnace) {
		super(new ContainerObsidianFurnace(invPlayer, furnace), GuiTextures.obsidianFurnaceGui, invPlayer, furnace);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GLStateHelper.color();
		this.mc.getTextureManager().bindTexture(this.texture);
		int startX = (this.width - this.xSize) / 2;
		int startY = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(startX, startY, 0, 0, this.xSize, this.ySize);
		
		if(TileQuartzFurnace.isBurning(this.furnace)){
			int burnTime = this.getBurnLeftScaled(13);
			drawTexturedModalRect(startX + 56, startY + 36 + 12 - burnTime, 176, 12 - burnTime, 14, burnTime + 1);
		}
		
		int scaleAdjustment = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(startX + 79, startY + 34, 176, 14, scaleAdjustment + 1, 16);
	}

}
