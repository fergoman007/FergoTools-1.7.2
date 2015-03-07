package io.github.fergoman123.fergotools.common;

import io.github.fergoman123.fergotools.common.handler.EventHandler;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.proxy.CommonProxy;
import io.github.fergoman123.fergotools.common.furnace.QuartzFurnace.TileQuartzFurnace;
import io.github.fergoman123.fergotools.common.furnace.ObsidianFurnace.TileObsidianFurnace;
import io.github.fergoman123.fergotools.common.furnace.EmeraldFurnace.TileEmeraldFurnace;
import io.github.fergoman123.fergotools.common.furnace.LapisFurnace.TileLapisFurnace;
import io.github.fergoman123.fergotools.common.furnace.BronzeFurnace.TileBronzeFurnace;
import io.github.fergoman123.fergotools.common.furnace.CoalFurnace.TileCoalFurnace;
import io.github.fergoman123.fergotools.common.furnace.GlowstoneFurnace.TileGlowstoneFurnace;
import io.github.fergoman123.fergotools.common.furnace.AdamantiumFurnace.TileAdamantiumFurnace;
import io.github.fergoman123.fergotools.common.furnace.SilkFurnace.TileSilkFurnace;
import io.github.fergoman123.fergotools.common.furnace.RedstoneFurnace.TileRedstoneFurnace;
import io.github.fergoman123.fergotools.common.furnace.Macerator.TileMacerator;
import static io.github.fergoman123.fergoutil.helper.RegisterHelper.registerTileEntity;
import static io.github.fergoman123.fergoutil.helper.RegisterHelper.registerEvent;

public class ClientProxy extends CommonProxy{

    @Override
    public void registerTileEntities() {
        registerTileEntity(TileQuartzFurnace.class, "quartzFurnace");
        registerTileEntity(TileObsidianFurnace.class, "obsidianFurnace");
        registerTileEntity(TileEmeraldFurnace.class, "emeraldFurnace");
        registerTileEntity(TileLapisFurnace.class, "lapisFurnace");
        registerTileEntity(TileBronzeFurnace.class, "bronzeFurnace");
        registerTileEntity(TileCoalFurnace.class, "coalFurnace");
        registerTileEntity(TileGlowstoneFurnace.class, "glowstoneFurnace");
        registerTileEntity(TileAdamantiumFurnace.class, "adamantiumFurnace");
        registerTileEntity(TileSilkFurnace.class, "silkFurnace");
        registerTileEntity(TileRedstoneFurnace.class, "redstoneFurnace");
        registerTileEntity(TileMacerator.class, "macerator");
    }

    @Override
    public void registerRenderers() {

    }

    @Override
    public void registerEventHandlers() {
        registerEvent(EventHandler.tooltipEvent);
    }
}
