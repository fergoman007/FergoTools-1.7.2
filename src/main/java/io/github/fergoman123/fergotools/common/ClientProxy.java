package io.github.fergoman123.fergotools.common;

import io.github.fergoman123.fergotools.common.handler.EventHandler;
import io.github.fergoman123.fergotools.common.tileentity.TileMacerator;
import io.github.fergoman123.fergotools.common.tileentity.TileQuartzFurnace;
import io.github.fergoman123.fergotools.info.FurnaceConstants;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.proxy.CommonProxy;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerTileEntities() {
        RegisterHelper.registerTileEntity(TileQuartzFurnace.class, "fergotools.tile.quartzfurnace");
        RegisterHelper.registerTileEntity(TileEntityList.macerator, FurnaceConstants.Tile.macerator);
    }

    @Override
    public void registerRenderers() {

    }

    @Override
    public void registerEventHandlers() {
        RegisterHelper.registerEvent(EventHandler.tooltipEvent);
    }
}
