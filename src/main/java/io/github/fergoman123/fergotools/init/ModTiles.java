package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.furnaces.AdamantiumFurnace.TileEntityAdamantiumFurnace;
import io.github.fergoman123.fergotools.furnaces.BronzeFurnace.TileEntityBronzeFurnace;
import io.github.fergoman123.fergotools.furnaces.CoalFurnace.TileEntityCoalFurnace;
import io.github.fergoman123.fergotools.furnaces.EmeraldFurnace.TileEntityEmeraldFurnace;
import io.github.fergoman123.fergotools.furnaces.GlowstoneFurnace.TileEntityGlowstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.LapisFurnace.TileEntityLapisFurnace;
import io.github.fergoman123.fergotools.furnaces.Macerator.TileEntityMacerator;
import io.github.fergoman123.fergotools.furnaces.ObsidianFurnace.TileEntityObsidianFurnace;
import io.github.fergoman123.fergotools.furnaces.QuartzFurnace.TileEntityQuartzFurnace;
import io.github.fergoman123.fergotools.furnaces.RedstoneFurnace.TileEntityRedstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.SilkFurnace.TileEntitySilkFurnace;
import io.github.fergoman123.fergotools.reference.strings.Tile;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;

public class ModTiles {

    public static void init()
    {
        RegisterHelper.registerTileEntity(TileEntityQuartzFurnace.class, Tile.quartzFurnaceTile);
        RegisterHelper.registerTileEntity(TileEntityObsidianFurnace.class, Tile.obsidianFurnaceTile);
        RegisterHelper.registerTileEntity(TileEntityEmeraldFurnace.class, Tile.emeraldCrystalFurnaceTile);
        RegisterHelper.registerTileEntity(TileEntityLapisFurnace.class, Tile.lapisCrystalFurnaceTile);
        RegisterHelper.registerTileEntity(TileEntityBronzeFurnace.class, Tile.bronzeFurnaceTile);
        RegisterHelper.registerTileEntity(TileEntityCoalFurnace.class, Tile.coalFurnaceTile);
        RegisterHelper.registerTileEntity(TileEntityGlowstoneFurnace.class, Tile.glowstoneFurnaceTile);
        RegisterHelper.registerTileEntity(TileEntityAdamantiumFurnace.class, Tile.adamantiumFurnaceTile);
        RegisterHelper.registerTileEntity(TileEntitySilkFurnace.class, Tile.silkFurnaceTile);
        RegisterHelper.registerTileEntity(TileEntityRedstoneFurnace.class, Tile.redstoneFurnaceTile);
        RegisterHelper.registerTileEntity(TileEntityMacerator.class, Tile.maceratorTile);
    }
}
