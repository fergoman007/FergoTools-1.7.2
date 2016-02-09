package io.github.fergoman123.fergotools.client.gui;

import io.github.fergoman123.fergotools.inventory.ContainerQuartzFurnace;
import io.github.fergoman123.fergotools.resloc.ResLocFT;
import io.github.fergoman123.fergotools.tileentity.TileEntityQuartzFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiQuartzFurnace extends GuiContainer{

    private static final ResourceLocation furnaceTexture = new ResLocFT("textures/gui/furnace/quartzFurnace.png");

    private final InventoryPlayer invPlayer;
    private IInventory furnace;

    public GuiQuartzFurnace(InventoryPlayer invPlayer, IInventory furnace){
        super(new ContainerQuartzFurnace(invPlayer, furnace));
        this.invPlayer = invPlayer;
        this.furnace = furnace;
    }

    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        String s = this.furnace.getDisplayName().getUnformattedText();
        this.fontRendererObj.drawString(StatCollector.translateToLocal(s), this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(this.invPlayer.getDisplayName().getUnformattedText(), 8, this.ySize - 125 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(furnaceTexture);
        int startX = (this.width - this.xSize) / 2;
        int startY = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(startX, startY, 0, 0, this.xSize, this.ySize);

        if (TileEntityQuartzFurnace.isBurning(this.furnace)) {
            int k = this.getBurnLeftScaled(13);
            this.drawTexturedModalRect(startX + 63, startY + 15 + 12 - k, 176, 12 - k, 14, k + 1);
        }

        int l = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(startX + 83, startY + 13, 176, 14, l + 1, 16);
    }

    private int getCookProgressScaled(int pixels)
    {
        int cookTime = this.furnace.getField(2);
        int totalCookTime = this.furnace.getField(3);
        return totalCookTime != 0 && cookTime != 0 ? cookTime * pixels / totalCookTime : 0;
    }

    private int getBurnLeftScaled(int pixels)
    {
        int currentItemBurnTime = this.furnace.getField(1);
        int burnTime = this.furnace.getField(0);

        if (currentItemBurnTime == 0)
        {
            currentItemBurnTime = 200;
        }

        return burnTime * pixels / currentItemBurnTime;
    }
}
