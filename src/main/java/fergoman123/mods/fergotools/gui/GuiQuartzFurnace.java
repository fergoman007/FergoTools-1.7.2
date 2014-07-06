package fergoman123.mods.fergotools.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.gui.container.ContainerQuartzFurnace;
import fergoman123.mods.fergotools.lib.strings.GuiStrings;
import fergoman123.mods.fergotools.tileentity.TileEntityQuartzFurnace;
import fergoman123.mods.fergotools.util.base.GuiFT;
import fergoman123.mods.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiQuartzFurnace extends GuiFT
{

    public GuiQuartzFurnace(InventoryPlayer par1InventoryPlayer, TileEntityQuartzFurnace par2TileEntityFurnace)
    {
        super(new ContainerQuartzFurnace(par1InventoryPlayer, par2TileEntityFurnace));
        quartzFurnace = par2TileEntityFurnace;
    }

    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = quartzFurnace.hasCustomInventoryName() ? quartzFurnace.getInventoryName() : GuiHelper.format(quartzFurnace.getInventoryName());
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

        if (quartzFurnace.isBurning())
        {
            i1 = quartzFurnace.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = quartzFurnace.getCookProgressScaled(24);
        drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }
}
