package io.github.fergoman123.fergotools.common;

import io.github.fergoman123.fergotools.common.Containers.ContainerQuartzFurnace;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergoutil.gui.GuiFurnaceFergo;
import io.github.fergoman123.fergoutil.helper.GLStateHelper;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;

public class FurnaceGuis
{
    public static final class GuiQuartzFurnace extends GuiFurnaceFergo
    {

        public GuiQuartzFurnace(InventoryPlayer invPlayer, IInventory furnace) {
            super(new ContainerQuartzFurnace(invPlayer, furnace), invPlayer, furnace, Textures.quartzFurnaceGuiTexture);
        }

        @Override
        public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
            GLStateHelper.color();
            GuiHelper.bindTexture(this.texture);
            int startX = (width - xSize) / 2;
            int startY = (height - ySize) / 2;
            drawTexturedModalRect(startX, startY, 0, 0, xSize, ySize);

            if (Tiles.TileQuartzFurnace.isBurning(this.furnace))
            {
                int cookTime = getBurnTimeRemainingScaled(12);
                drawTexturedModalRect(startX + 25, startY + 24 + 12 - cookTime, 176, 12 - cookTime, 14, cookTime + 2);
            }

            int scaleAdjustment = getCookProgressScaled(24);
            drawTexturedModalRect(startX + 80, startY + 21, 176, 14, scaleAdjustment + 1, 16);
        }
    }
}
