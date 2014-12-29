/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.init;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.core.FTBlocks;
import io.github.fergoman123.fergotools.core.FTItems;
import io.github.fergoman123.fergotools.core.FTTileEntities;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.handler.RegHandler;
import io.github.fergoman123.fergotools.reference.MetadataFT;
import io.github.fergoman123.fergotools.reference.strings.Messages;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergotools.util.item.TM;

public class FergoToolsMod
{
    public static void preInit(FMLPreInitializationEvent evt)
    {
        FergoTools.getLogger().info(Messages.preInitMessage);
        MetadataFT.writeMetadata(evt.getModMetadata());
        ConfigHandler.init(evt.getSuggestedConfigurationFile());
        FergoTools.proxy.registerEventHandlers();
        FTItems.init();
        FTBlocks.init();
        Tabs.init();
        TM.initMaterials();
        AM.initMaterials();
        FTBlocks.init();

    }

    public static void load(FMLInitializationEvent evt)
    {
        FergoTools.getLogger().info(Messages.initMessage);
        FTTileEntities.registerTileEntities();
        RegHandler.init();
        RegHandler.registerOres();
        Recipes.init();
    }

    public static void modsLoaded(FMLPostInitializationEvent evt)
    {
        FergoTools.getLogger().info(Messages.postInitMessage);
    }
}
