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
import io.github.fergoman123.fergotools.reference.Strings;
import io.github.fergoman123.fergotools.util.item.Materials;
import net.minecraftforge.oredict.OreDictionary;

public class FergoToolsMod
{
    public static void preInit(FMLPreInitializationEvent evt)
    {
        LogHelper.info(Strings.Messages.preInitMessage);
        MetadataFT.writeMetadata(evt.getModMetadata());
        ConfigHandler.init(evt.getSuggestedConfigurationFile());
        FergoTools.proxy.registerEventHandlers();
        Tabs.init();
        Materials.init();
        ModItems.init();
        ModBlocks.init();

    }

    public static void load(FMLInitializationEvent evt)
    {
        LogHelper.info(Strings.Messages.initMessage);
        ModTiles.init();
        RegHandler.init();
        RegHandler.registerOres();
        Recipes.init();
    }

    public static void modsLoaded(FMLPostInitializationEvent evt)
    {
        LogHelper.info(Strings.Messages.postInitMessage);
    }
}
