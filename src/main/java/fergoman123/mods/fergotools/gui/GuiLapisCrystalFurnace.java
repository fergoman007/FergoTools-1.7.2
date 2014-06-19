package fergoman123.mods.fergotools.gui;

import fergoman123.mods.fergotools.gui.container.ContainerLapisCrystalFurnace;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.tileentity.TileEntityLapisCrystalFurnace;
import fergoman123.mods.fergoutil.helper.GuiHelper;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

public class GuiLapisCrystalFurnace extends GuiContainer{

    private TileEntityLapisCrystalFurnace furnace;


    public GuiLapisCrystalFurnace(InventoryPlayer player, TileEntityLapisCrystalFurnace furnace)
    {
        super(new ContainerLapisCrystalFurnace(player, furnace));
        this.furnace = furnace;

    }

    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = furnace.hasCustomInventoryName() ? this.furnace.getInventoryName() : GuiHelper.format(this.furnace.getInventoryName());
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        fontRendererObj.drawString(GuiHelper.format(Strings.GuiStrings.containerInventory), 8, ySize - 96 + 2, 4210752);
    }

    public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
        GuiHelper.bindTexture(Strings.GuiStrings.lapisFurnaceGuiTexture);
        int k = (width - xSize) / 2;
        int l = (height - ySize) / 2;
        drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
        int i;

        if (furnace.isBurning())
        {
            i = furnace.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(k + 56, l + 36 + 12 - i, 176, 12 - i, 14, i + 2);
        }

        i = furnace.getCookProgressScaled(24);
        drawTexturedModalRect(k + 79, l + 34, 176, 14, i + 1, 16);
    }


}
