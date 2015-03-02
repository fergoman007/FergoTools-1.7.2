package io.github.fergoman123.fergotools.common;

import io.github.fergoman123.fergotools.common.handler.EventHandler;
import io.github.fergoman123.fergotools.common.tileentity.TileEntityQuartzFurnace;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.proxy.CommonProxy;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerTileEntities() {
        RegisterHelper.registerTileEntity(TileEntityQuartzFurnace.class, "fergotools.tile.quartzfurnace");
    }

    @Override
    public void registerRenderers() {

    }

    @Override
    public void registerEventHandlers() {
        RegisterHelper.registerEvent(EventHandler.tooltipEvent);
    }
}
