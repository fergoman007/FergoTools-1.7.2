package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.lib.strings.TileStrings;
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
        RegisterHelper.registerTileEntity(quartzFurnaceClass, TileStrings.quartzFurnaceTile);
        RegisterHelper.registerTileEntity(obsidianFurnaceClass, TileStrings.obsidianFurnaceTile);
        RegisterHelper.registerTileEntity(emeraldCrystalFurnaceClass, TileStrings.emeraldCrystalFurnaceTile);
        RegisterHelper.registerTileEntity(lapisCrystalClass, TileStrings.lapisCrystalFurnaceTile);
        RegisterHelper.registerTileEntity(bronzeFurnaceClass, TileStrings.bronzeFurnaceTile);
        RegisterHelper.registerTileEntity(coalFurnaceClass, TileStrings.coalFurnaceTile);
        RegisterHelper.registerTileEntity(glowstoneFurnaceClass, TileStrings.glowstoneFurnaceTile);
        RegisterHelper.registerTileEntity(adamantiumFurnaceClass, TileStrings.adamantiumFurnaceTile);
        RegisterHelper.registerTileEntity(silkFurnaceClass, TileStrings.silkFurnaceTile);
        RegisterHelper.registerTileEntity(redstoneFurnaceClass, TileStrings.redstoneFurnaceTile);
        RegisterHelper.registerTileEntity(maceratorClass, TileStrings.maceratorTile);
    }
}
