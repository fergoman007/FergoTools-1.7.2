package fergoman123.mods.fergotools.gui;

import fergoman123.mods.fergotools.gui.container.ContainerEmeraldCrystalFurnace;
import fergoman123.mods.fergotools.lib.Strings.GuiStrings;
import fergoman123.mods.fergotools.tileentity.TileEntityEmeraldCrystalFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import org.lwjgl.opengl.GL11;

/**
 * Created by Fergoman123 on 25/03/2014.
 */
public class GuiEmeraldCrystalFurnace extends GuiContainer{

    private Object[] obj = new Object[0];
    private TileEntityEmeraldCrystalFurnace furnace;

    public GuiEmeraldCrystalFurnace(InventoryPlayer player, TileEntityEmeraldCrystalFurnace furnace)
    {
        super(new ContainerEmeraldCrystalFurnace(player, furnace));
        this.furnace = furnace;
    }

    public void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = this.furnace.hasCustomInventoryName() ? this.furnace.getInventoryName() : I18n.format(this.furnace.getInventoryName(), obj);
        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", obj), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(GuiStrings.vanillaFurnace);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        int i1;

        if (this.furnace.isBurning())
        {
            i1 = this.furnace.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = this.furnace.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }
}
