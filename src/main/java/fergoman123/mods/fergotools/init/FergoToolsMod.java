package fergoman123.mods.fergotools.init;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import fergoman123.mods.fergotools.command.CommandFergoTools;
import fergoman123.mods.fergotools.command.FergoCommands;
import fergoman123.mods.fergotools.config.ConfigHandler;
import fergoman123.mods.fergotools.creativetab.CreativeTabsFergoTools;
import fergoman123.mods.fergotools.handler.FTEventHandler;
import fergoman123.mods.fergotools.handler.RegHandler;
import fergoman123.mods.fergotools.helper.LogHelper;
import fergoman123.mods.fergotools.reference.MetadataFT;
import fergoman123.mods.fergotools.reference.Strings.Messages;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommand;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.command.server.CommandBlockLogic;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.ClientCommandHandler;

public class FergoToolsMod
{
    public static void preInit(FMLPreInitializationEvent evt)
    {
        LogHelper.info(Messages.preInitMessage);
        MetadataFT.writeMetadata(evt.getModMetadata());
//        ConfigHandler.init(evt.getSuggestedConfigurationFile());
        CreativeTabsFergoTools.init();
        ToolArmorMaterials.init();
        ModItems.init();
        ModBlocks.init();
        FTEventHandler.registerEvents();
    }

    public static void load(FMLInitializationEvent evt)
    {
        LogHelper.info(Messages.initMessage);
        ModTiles.init();
        RegHandler.init();
        Recipes.init();
    }

    public static void modsLoaded(FMLPostInitializationEvent evt)
    {
        LogHelper.info(Messages.postInitMessage);
    }

    public static void serverStarted(FMLServerStartedEvent evt)
    {

    }
}
