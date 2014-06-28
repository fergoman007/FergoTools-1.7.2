package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.tileentity.*;
import fergoman123.mods.fergoutil.helper.RegisterHelper;
import net.minecraft.tileentity.TileEntity;

public class ModTiles {

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
    public static Class<? extends TileEntity> maceratorClass = TileEntityMacerator.class;

    public static void init()
    {
        RegisterHelper.registerTileEntity(quartzFurnaceClass, Strings.TileStrings.quartzFurnaceTile);
        RegisterHelper.registerTileEntity(obsidianFurnaceClass, Strings.TileStrings.obsidianFurnaceTile);
        RegisterHelper.registerTileEntity(emeraldCrystalFurnaceClass, Strings.TileStrings.emeraldCrystalFurnaceTile);
        RegisterHelper.registerTileEntity(lapisCrystalClass, Strings.TileStrings.lapisCrystalFurnaceTile);
        RegisterHelper.registerTileEntity(bronzeFurnaceClass, Strings.TileStrings.bronzeFurnaceTile);
        RegisterHelper.registerTileEntity(coalFurnaceClass, Strings.TileStrings.coalFurnaceTile);
        RegisterHelper.registerTileEntity(glowstoneFurnaceClass, Strings.TileStrings.glowstoneFurnaceTile);
        RegisterHelper.registerTileEntity(adamantiumFurnaceClass, Strings.TileStrings.adamantiumFurnaceTile);
        RegisterHelper.registerTileEntity(silkFurnaceClass, Strings.TileStrings.silkFurnaceTile);
        RegisterHelper.registerTileEntity(redstoneFurnaceClass, Strings.TileStrings.redstoneFurnaceTile);
        RegisterHelper.registerTileEntity(maceratorClass, Strings.TileStrings.maceratorTile);
    }
}
