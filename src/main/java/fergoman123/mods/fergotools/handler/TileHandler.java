package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.tileentity.*;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Fergoman123 on 20/05/2014.
 */
public class TileHandler {

    public static TileEntityQuartzFurnace quartzFurnace = new TileEntityQuartzFurnace();
    public static TileEntityObsidianFurnace obsidianFurnace = new TileEntityObsidianFurnace();
    public static TileEntityEmeraldCrystalFurnace emeraldCrystalFurnace = new TileEntityEmeraldCrystalFurnace();
    public static TileEntityLapisCrystalFurnace lapisCrystalFurnace = new TileEntityLapisCrystalFurnace();
    public static TileEntityBronzeFurnace bronzeFurnace = new TileEntityBronzeFurnace();
    public static TileEntityCoalFurnace coalFurnace = new TileEntityCoalFurnace();
    public static TileEntityGlowstoneFurnace glowstoneFurnace = new TileEntityGlowstoneFurnace();
    public static TileEntityAdamantiumFurnace adamantiumFurnace = new TileEntityAdamantiumFurnace();
    public static TileEntitySilkFurnace silkFurnace = new TileEntitySilkFurnace();
    public static TileEntityRedstoneFurnace redstoneFurnace = new TileEntityRedstoneFurnace();

    public static Class<? extends TileEntity> quartzFurnaceClass = TileEntityQuartzFurnace.class;
    public static Class<? extends TileEntity> obsidianFurnaceClass = TileEntityObsidianFurnace.class;
    public static Class<? extends TileEntity> emeraldCrystalFurnaceClass = TileEntityEmeraldCrystalFurnace.class;
    public static Class<? extends TileEntity> lapisCrystalClass = TileEntityLapisCrystalFurnace.class;
    public static Class<? extends TileEntity> bronzeFurnaceClass = TileEntityBronzeFurnace.class;
    public static Class<? extends TileEntity> coalFurnaceClass = TileEntityCoalFurnace.class;
    public static Class<? extends TileEntity> glowstoneFurnaceClass = TileEntityGlowstoneFurnace.class;
    public static Class<? extends TileEntity> adamantiumFurnaceClass = TileEntityAdamantiumFurnace.class;
    public static Class<? extends TileEntity> silkFurnaceClass = TileEntitySilkFurnace.class;
    public static Class<? extends TileEntity> redstoneFurnaceClass = TileEntityRedstoneFurnace.class;
}
