package fergoman123.mods.fergotools.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.gui.container.ContainerQuartzFurnace;
import fergoman123.mods.fergotools.lib.Strings.GuiStrings;
import fergoman123.mods.fergotools.tileentity.TileEntityQuartzFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiQuartzFurnace extends GuiContainer
{
    private TileEntityQuartzFurnace furnace;
    private Object[] obj = new Object[0];

    public GuiQuartzFurnace(InventoryPlayer par1InventoryPlayer, TileEntityQuartzFurnace par2TileEntityFurnace)
    {
        super(new ContainerQuartzFurnace(par1InventoryPlayer, par2TileEntityFurnace));
        furnace = par2TileEntityFurnace;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = furnace.hasCustomInventoryName() ? furnace.getInventoryName() : I18n.format(furnace.getInventoryName(), obj);
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        fontRendererObj.drawString(I18n.format(GuiStrings.containerInventory, obj), 8, ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(GuiStrings.vanillaFurnace);
        int k = (width - xSize) / 2;
        int l = (height - ySize) / 2;
        drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
        int i1;

        if (furnace.isBurning())
        {
            i1 = furnace.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = furnace.getCookProgressScaled(24);
        drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }
}
