package io.github.fergoman123.fergotools.init;


import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.handler.RegHandler;
import io.github.fergoman123.fergotools.helper.LogHelper;
import io.github.fergoman123.fergotools.reference.MetadataFT;
import io.github.fergoman123.fergotools.reference.strings.Messages;
import io.github.fergoman123.fergotools.util.item.Materials;

public class FergoToolsMod
{
    public static void preInit(FMLPreInitializationEvent evt)
    {
        LogHelper.info(Messages.preInitMessage);
        MetadataFT.writeMetadata(evt.getModMetadata());
        ConfigHandler.init(evt.getSuggestedConfigurationFile());
        FergoTools.proxy.registerEventHandlers();
        Tabs.init();
        Materials.init();
<<<<<<< HEAD
        FTContent.init();
        FTContent.registerItems();
        FTContent.registerBlocks();
=======
        ModItems.init();
        ModBlocks.init();
>>>>>>> parent of 49125e6... init package changes

    }

    public static void load(FMLInitializationEvent evt)
    {
        LogHelper.info(Messages.initMessage);
        FTContent.registerTileEntities();
        RegHandler.init();
        RegHandler.registerOres();
        Recipes.init();
    }

    public static void modsLoaded(FMLPostInitializationEvent evt)
    {
        LogHelper.info(Messages.postInitMessage);
    }
}
