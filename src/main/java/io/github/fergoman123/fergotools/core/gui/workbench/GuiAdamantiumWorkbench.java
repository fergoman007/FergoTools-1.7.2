package io.github.fergoman123.fergotools.core.gui.workbench;

import io.github.fergoman123.fergotools.core.gui.workbench.container.ContainerAdamantiumWorkbench;
import io.github.fergoman123.fergotools.reference.Ints;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.workbench.GuiWorkbenchFT;
import io.github.fergoman123.fergoutil.helper.GLHelper;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

/**
 * Created by Fergoman123.
 */
public final class GuiAdamantiumWorkbench extends GuiWorkbenchFT
{
    public GuiAdamantiumWorkbench(InventoryPlayer inventory, World world, int x, int y, int z)
    {
        super(new ContainerAdamantiumWorkbench(inventory, world, x, y, z));
        this.localeName = Locale.containerAdamantiumWorkbench;
    }

    @Override
    public void drawGuiContainerForegroundLayer(int par1, int par2) {
        this.fontRendererObj.drawString(I18n.format(this.localeName, this.obj), 28, 6, Ints.Colors.renderColorInventory);
        this.fontRendererObj.drawString(I18n.format(this.localeInventory, this.obj), 8, this.ySize - 96 + 2, Ints.Colors.renderColorInventory);
    }

    @Override
    public void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        GLHelper.glColor4f(1f, 1f, 1f, 1f);
        GuiHelper.bindTexture(Textures.adamantiumWorkbenchGuiTexture);
        int k = (width - xSize) / 2;
        int l = (height - ySize) / 2;
        drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
    }
}
