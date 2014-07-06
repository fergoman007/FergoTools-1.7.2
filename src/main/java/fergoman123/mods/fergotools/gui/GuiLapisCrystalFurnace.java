package fergoman123.mods.fergotools.gui;

import fergoman123.mods.fergotools.gui.container.ContainerLapisCrystalFurnace;
import fergoman123.mods.fergotools.lib.strings.GuiStrings;
import fergoman123.mods.fergotools.tileentity.TileEntityLapisCrystalFurnace;
import fergoman123.mods.fergotools.util.base.GuiFT;
import fergoman123.mods.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;

public class GuiLapisCrystalFurnace extends GuiFT{


    public GuiLapisCrystalFurnace(InventoryPlayer player, TileEntityLapisCrystalFurnace furnace)
    {
        super(new ContainerLapisCrystalFurnace(player, furnace));
        lapisCrystalFurnace = furnace;

    }

    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = lapisCrystalFurnace.hasCustomInventoryName() ? this.lapisCrystalFurnace.getInventoryName() : GuiHelper.format(this.lapisCrystalFurnace.getInventoryName());
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        fontRendererObj.drawString(GuiHelper.format(GuiStrings.containerInventory), 8, ySize - 96 + 2, 4210752);
    }

    public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
        GuiHelper.bindTexture(GuiStrings.lapisFurnaceGuiTexture);
        int k = (width - xSize) / 2;
        int l = (height - ySize) / 2;
        drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
        int i;

        if (lapisCrystalFurnace.isBurning())
        {
            i = lapisCrystalFurnace.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(k + 56, l + 36 + 12 - i, 176, 12 - i, 14, i + 2);
        }

        i = lapisCrystalFurnace.getCookProgressScaled(24);
        drawTexturedModalRect(k + 79, l + 34, 176, 14, i + 1, 16);
    }


}
