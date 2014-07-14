package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.reference.Strings;
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
        RegisterHelper.registerTileEntity(quartzFurnaceClass, Strings.Tile.quartzFurnaceTile);
        RegisterHelper.registerTileEntity(obsidianFurnaceClass, Strings.Tile.obsidianFurnaceTile);
        RegisterHelper.registerTileEntity(emeraldCrystalFurnaceClass, Strings.Tile.emeraldCrystalFurnaceTile);
        RegisterHelper.registerTileEntity(lapisCrystalClass, Strings.Tile.lapisCrystalFurnaceTile);
        RegisterHelper.registerTileEntity(bronzeFurnaceClass, Strings.Tile.bronzeFurnaceTile);
        RegisterHelper.registerTileEntity(coalFurnaceClass, Strings.Tile.coalFurnaceTile);
        RegisterHelper.registerTileEntity(glowstoneFurnaceClass, Strings.Tile.glowstoneFurnaceTile);
        RegisterHelper.registerTileEntity(adamantiumFurnaceClass, Strings.Tile.adamantiumFurnaceTile);
        RegisterHelper.registerTileEntity(silkFurnaceClass, Strings.Tile.silkFurnaceTile);
        RegisterHelper.registerTileEntity(redstoneFurnaceClass, Strings.Tile.redstoneFurnaceTile);
        RegisterHelper.registerTileEntity(maceratorClass, Strings.Tile.maceratorTile);
    }
}
