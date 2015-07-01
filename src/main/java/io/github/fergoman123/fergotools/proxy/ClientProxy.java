/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.proxy;


import io.github.fergoman123.fergotools.common.tileentities.*;
import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.event.ItemToolTipEvent;
import io.github.fergoman123.fergotools.event.OnArmorTickEvent;
import io.github.fergoman123.fergotools.event.OnPlayerLoggedInEvent;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergoutil.proxy.CommonProxy;

import static io.github.fergoman123.fergoutil.helper.RegisterHelper.registerEvent;
import static io.github.fergoman123.fergoutil.helper.RegisterHelper.registerTileEntity;

public class ClientProxy extends CommonProxy
{

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
    public void registerEventHandlers()
    {
        registerEvent(OnPlayerLoggedInEvent.instance);
        registerEvent(OnArmorTickEvent.instance);
        registerEvent(ConfigHandler.instance);
        registerEvent(ItemToolTipEvent.instance);
    }
}
