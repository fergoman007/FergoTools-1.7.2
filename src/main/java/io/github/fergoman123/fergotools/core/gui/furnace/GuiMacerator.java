package io.github.fergoman123.fergotools.core.gui.furnace;

import io.github.fergoman123.fergotools.core.gui.furnace.container.ContainerMacerator;
import io.github.fergoman123.fergotools.core.tileentity.TileEntityMacerator;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.GuiFT;
import io.github.fergoman123.fergoutil.helper.GLHelper;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * Created by Fergoman123.
 */
public class GuiMacerator extends GuiFT
{
    private TileEntityMacerator macerator;

    public GuiMacerator(InventoryPlayer par1InventoryPlayer, TileEntityMacerator par2TileEntityFurnace)
    {
        super(new ContainerMacerator(par1InventoryPlayer, par2TileEntityFurnace));
        this.macerator = par2TileEntityFurnace;
    }

    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = this.macerator.hasCustomInventoryName() ? macerator.getInventoryName() : GuiHelper.format(this.macerator.getInventoryName());
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        fontRendererObj.drawString(GuiHelper.format(Locale.containerInventory), 8, ySize - 100 + 2, 4210752);
    }

    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GLHelper.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GuiHelper.bindTexture(Textures.maceratorGuiTexture);
        int startX = (width - xSize) / 2;
        int startY = (height - ySize) / 2;
        drawTexturedModalRect(startX, startY, 0, 0, xSize, ySize);

        if (this.macerator.isBurning())
        {
            int cookTime = this.macerator.getPowerRemainingScaled(12);
            drawTexturedModalRect(startX + 25, startY + 24 + 12 - cookTime, 176, 12 - cookTime, 14, cookTime + 2);
        }

        int scaleAdjustment = this.macerator.getCookProgressScaled(24);
        drawTexturedModalRect(startX + 80, startY + 21, 176, 14, scaleAdjustment + 1, 16);
    }
}
