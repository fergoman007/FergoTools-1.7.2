package fergoman123.mods.fergotools.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.gui.container.ContainerGlowstoneFurnace;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.tileentity.TileEntityGlowstoneFurnace;
import fergoman123.mods.fergotools.util.base.GuiFT;
import fergoman123.mods.fergoutil.helper.GuiHelper;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiGlowstoneFurnace extends GuiFT
{

    public GuiGlowstoneFurnace(InventoryPlayer par1InventoryPlayer, TileEntityGlowstoneFurnace par2TileEntityFurnace)
    {
        super(new ContainerGlowstoneFurnace(par1InventoryPlayer, par2TileEntityFurnace));
        glowstoneFurnace = par2TileEntityFurnace;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = glowstoneFurnace.hasCustomInventoryName() ? glowstoneFurnace.getInventoryName() : GuiHelper.format(glowstoneFurnace.getInventoryName());
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        fontRendererObj.drawString(GuiHelper.format(Names.Locale.containerInventory), 8, ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GuiHelper.bindTexture(Textures.glowstoneFurnaceGuiTexture);
        int k = (width - xSize) / 2;
        int l = (height - ySize) / 2;
        drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
        int i1;

        if (glowstoneFurnace.isBurning())
        {
            i1 = glowstoneFurnace.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = glowstoneFurnace.getCookProgressScaled(24);
        drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }
}
