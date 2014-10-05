package fergoman123.mods.fergotools.init;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.config.ConfigHandler;
import fergoman123.mods.fergotools.creativetab.Tabs;
import fergoman123.mods.fergotools.handler.RegHandler;
import fergoman123.mods.fergotools.helper.LogHelper;
import fergoman123.mods.fergotools.reference.MetadataFT;
import fergoman123.mods.fergotools.reference.Strings.Messages;
import fergoman123.mods.fergotools.util.item.Materials;

public class FergoToolsMod
{
    public static void preInit(FMLPreInitializationEvent evt)
    {
        LogHelper.info(Messages.preInitMessage);
        MetadataFT.writeMetadata(evt.getModMetadata());
        ConfigHandler.init(evt.getSuggestedConfigurationFile());
        FergoTools.proxy.registerKeyBindings();
        FergoTools.proxy.registerEventHandlers();
        Tabs.init();
        Materials.init();
        ModItems.init();
        ModBlocks.init();

    }

    public static void load(FMLInitializationEvent evt)
    {
        LogHelper.info(Messages.initMessage);
        ModTiles.init();
        RegHandler.init();
        RegHandler.registerOres();
        Recipes.init();
    }

    public static void modsLoaded(FMLPostInitializationEvent evt)
    {
        LogHelper.info(Messages.postInitMessage);
    }
}
