package fergoman123.mods.fergotools.util;

import fergoman123.mods.fergotools.tileentity.*;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public abstract class GuiFT extends GuiContainer{

    public ResourceLocation texture;

    public TileEntityQuartzFurnace quartzFurnace;
    public TileEntityObsidianFurnace obsidianFurnace;
    public TileEntityEmeraldCrystalFurnace emeraldCrystalFurnace;
    public TileEntityLapisCrystalFurnace lapisCrystalFurnace;
    public TileEntityBronzeFurnace bronzeFurnace;
    public TileEntityCoalFurnace coalFurnace;
    public TileEntityGlowstoneFurnace glowstoneFurnace;
    public TileEntityAdamantiumFurnace adamantiumFurnace;
    public TileEntityRedstoneFurnace redstoneFurnace;
    public TileEntitySilkFurnace silkFurnace;
    public TileEntityMacerator macerator;

    public GuiFT(Container container) {
        super(container);
    }

    public abstract void drawGuiContainerForegroundLayer(int par1, int par2);

    public abstract void drawGuiContainerBackgroundLayer(float par1, int par2, int par3);
}
