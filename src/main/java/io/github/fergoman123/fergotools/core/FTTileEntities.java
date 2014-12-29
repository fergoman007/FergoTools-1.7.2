package io.github.fergoman123.fergotools.core;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.fergoman123.fergotools.api.content.FTCTileEntities;
import io.github.fergoman123.fergotools.reference.strings.Tile;
import net.minecraft.tileentity.TileEntity;

public class FTTileEntities
{
    public static void registerTileEntities()
    {
        registerTileEntity(FTCTileEntities.quartzFurnace, Tile.quartzFurnaceTile);
        registerTileEntity(FTCTileEntities.obsidianFurnace, Tile.obsidianFurnaceTile);
        registerTileEntity(FTCTileEntities.emeraldFurnace, Tile.emeraldFurnaceTile);
        registerTileEntity(FTCTileEntities.lapisFurnace, Tile.lapisFurnaceTile);
        registerTileEntity(FTCTileEntities.bronzeFurnace, Tile.bronzeFurnaceTile);
        registerTileEntity(FTCTileEntities.coalFurnace, Tile.coalFurnaceTile);
        registerTileEntity(FTCTileEntities.glowstoneFurnace, Tile.glowstoneFurnaceTile);
        registerTileEntity(FTCTileEntities.adamantiumFurnace, Tile.adamantiumFurnaceTile);
        registerTileEntity(FTCTileEntities.silkFurnace, Tile.silkFurnaceTile);
        registerTileEntity(FTCTileEntities.redstoneFurnace, Tile.redstoneFurnaceTile);
        registerTileEntity(FTCTileEntities.macerator, Tile.maceratorTile);
    }

    public static void registerTileEntity(Class<? extends TileEntity> tileclass, String id)
    {
        GameRegistry.registerTileEntity(tileclass, id);
    }
}
