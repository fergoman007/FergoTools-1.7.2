package io.github.fergoman123.fergotools.common.gui;

import io.github.fergoman123.fergotools.common.inventory.ContainerObsidianFurnace;
import io.github.fergoman123.fergotools.common.tileentity.TileObsidianFurnace;
import io.github.fergoman123.fergotools.info.Textures;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;

public class GuiObsidianFurnace extends GuiContainer
{
    private final InventoryPlayer invPlayer;
    private IInventory furnace;

    public GuiObsidianFurnace(InventoryPlayer invPlayer, IInventory furnace)
    {
        super(new ContainerObsidianFurnace(invPlayer, furnace));
        this.invPlayer = invPlayer;
        this.furnace = furnace;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String s = NameHelper.translate(this.furnace.getDisplayName().getFormattedText());
        fontRendererObj.drawString(s, this.xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        fontRendererObj.drawString(this.invPlayer.getDisplayName().getUnformattedText(), 8, this.ySize - 126 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(Textures.obsidianFurnaceGui);
        int startX = (this.width - this.xSize) / 2;
        int startY = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(startX, startY, 0, 0, this.xSize, this.ySize);
        int i1;

        if (TileObsidianFurnace.isBurning(this.furnace))
        {
            i1 = this.getBurmTimeRemainingScaled(13);
            this.drawTexturedModalRect(startX + 25, startY + 24 + 12 - i1, 176, 12 - i1, 13, i1 + 1);
        }

        i1 = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(startX + 80, startY + 21, 176, 14, i1 + 1, 16);
    }

    private int getCookProgressScaled(int p_175381_1_)
    {
        int j = this.furnace.getField(2);
        int k = this.furnace.getField(3);
        return k != 0 && j != 0 ? j * p_175381_1_ / k : 0;
    }

    private int getBurmTimeRemainingScaled(int p_175382_1_)
    {
        int j = this.furnace.getField(1);

        if (j == 0)
        {
            j = 200;
        }

        return this.furnace.getField(0) * p_175382_1_ / j;
    }
}
