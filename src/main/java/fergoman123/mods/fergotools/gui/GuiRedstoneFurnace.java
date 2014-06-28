package fergoman123.mods.fergotools.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.gui.container.ContainerRedstoneFurnace;
import fergoman123.mods.fergotools.lib.Strings.GuiStrings;
import fergoman123.mods.fergotools.tileentity.TileEntityRedstoneFurnace;
import fergoman123.mods.fergotools.util.GuiFT;
import fergoman123.mods.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiRedstoneFurnace extends GuiFT
{

    public GuiRedstoneFurnace(InventoryPlayer par1InventoryPlayer, TileEntityRedstoneFurnace par2TileEntityFurnace)
    {
        super(new ContainerRedstoneFurnace(par1InventoryPlayer, par2TileEntityFurnace));
        redstoneFurnace = par2TileEntityFurnace;
    }

    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = redstoneFurnace.hasCustomInventoryName() ? redstoneFurnace.getInventoryName() : GuiHelper.format(redstoneFurnace.getInventoryName());
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        fontRendererObj.drawString(GuiHelper.format(GuiStrings.containerInventory), 8, ySize - 96 + 2, 4210752);
    }

    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GuiHelper.bindTexture(GuiStrings.vanillaFurnace);
        int k = (width - xSize) / 2;
        int l = (height - ySize) / 2;
        drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
        int i1;

        if (redstoneFurnace.isBurning())
        {
            i1 = redstoneFurnace.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = redstoneFurnace.getCookProgressScaled(24);
        drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }
}
