/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.proxy;


import io.github.fergoman123.fergotools.api.base.ModelResLocFT;
import io.github.fergoman123.fergotools.common.tileentities.*;
import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.event.ItemToolTipEvent;
import io.github.fergoman123.fergotools.event.OnArmorTickEvent;
import io.github.fergoman123.fergotools.event.OnPlayerLoggedInEvent;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.gui.ItemNames;
import static io.github.fergoman123.fergoutil.helper.RegisterHelper.register;
import static io.github.fergoman123.fergoutil.helper.RegisterHelper.registerTileEntity;
import static io.github.fergoman123.fergoutil.helper.RegisterHelper.registerEvent;

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
    public void registerModels() {
        register(ModItems.ingotObsidian, 0, new ModelResLocFT(ItemNames.ingotObsidian));
        register(ModItems.gemEmerald, 0, new ModelResLocFT(ItemNames.gemEmerald));
        register(ModItems.gemLapis, 0, new ModelResLocFT(ItemNames.gemLapis));
        register(ModItems.ingotBronze, 0, new ModelResLocFT(ItemNames.ingotBronze));
        register(ModItems.ingotCoal, 0, new ModelResLocFT(ItemNames.ingotCoal));
        register(ModItems.ingotGlowstone, 0, new ModelResLocFT(ItemNames.ingotGlowstone));
        register(ModItems.ingotAdamantium, 0, new ModelResLocFT(ItemNames.ingotAdamantium));
        register(ModItems.gemSilk, 0, new ModelResLocFT(ItemNames.gemSilk));
        register(ModItems.gemRedstone, 0, new ModelResLocFT(ItemNames.gemRedstone));
        register(ModItems.gemExp, 0, new ModelResLocFT(ItemNames.gemExp));
        register(ModItems.gemExp2, 0, new ModelResLocFT(ItemNames.gemExp2));
        register(ModItems.gemExp3, 0, new ModelResLocFT(ItemNames.gemExp3));

        register(ModItems.staffExp, 0, new ModelResLocFT(ItemNames.staffExp));
        register(ModItems.staffExp2, 0, new ModelResLocFT(ItemNames.staffExp2));
        register(ModItems.staffExp3, 0, new ModelResLocFT(ItemNames.staffExp3));
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
