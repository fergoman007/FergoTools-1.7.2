package fergoman123.mods.fergotools.gui;

import fergoman123.mods.fergotools.gui.container.ContainerMacerator;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.tileentity.TileEntityMacerator;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

/**
 * Created by Fergoman123 on 06/06/2014.
 */
public class GuiMacerator extends GuiContainer{

    private TileEntityMacerator macerator;
    private Object[] obj = new Object[0];

    public GuiMacerator(InventoryPlayer player, TileEntityMacerator macerator)
    {
        super(new ContainerMacerator(player, macerator));
        this.macerator = macerator;
    }




    @Override
    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = this.macerator.hasCustomInventoryName() ? this.macerator.getInventoryName() : I18n.format(this.macerator.getInventoryName(), obj);
        fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        fontRendererObj.drawString(I18n.format(Strings.GuiStrings.containerInventory, obj), 8, ySize - 96 + 2, 4210752);
    }

    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(Strings.GuiStrings.vanillaFurnace);
        int k = (width - xSize) / 2;
        int l = (height - ySize) / 2;
        drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
        int i1;

        if (macerator.isBurning())
        {
            i1 = macerator.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = macerator.getCookProgressScaled(24);
        drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }
}
