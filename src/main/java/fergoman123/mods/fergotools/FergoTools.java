package fergoman123.mods.fergotools;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import fergoman123.mods.fergotools.command.CommandFergoTools;
import fergoman123.mods.fergotools.command.FergoCommands;
import fergoman123.mods.fergotools.config.ConfigHandler;
import fergoman123.mods.fergotools.handler.FTEventHandler;
import fergoman123.mods.fergotools.handler.RegHandler;
import fergoman123.mods.fergotools.helper.LogHelper;
import fergoman123.mods.fergotools.init.*;
import fergoman123.mods.fergotools.reference.MetadataFT;
import fergoman123.mods.fergotools.reference.ModInfo;
import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergotools.creativetab.CreativeTabsFergoTools;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergoutil.command.FergoCommand;
import fergoman123.mods.fergoutil.proxy.IProxy;
import fergoman123.mods.fergotools.reference.Strings.Messages;
import net.minecraft.command.CommandHandler;
import net.minecraft.command.ICommand;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.ClientCommandHandler;

@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.versionMain, dependencies = ModInfo.dep, guiFactory = Reference.guiFactoryClass)
public class FergoTools
{
    @Instance(ModInfo.modid)
    public static FergoTools instance;
    
    @SidedProxy(clientSide = Reference.clientProxyClass, serverSide = Reference.serverProxyClass)
    public static IProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        FergoToolsMod.preInit(evt);
    }

	@EventHandler
    public void load(FMLInitializationEvent evt)
    {
        FergoToolsMod.load(evt);
    }
	
	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt)
    {
        FergoToolsMod.modsLoaded(evt);
    }

    @EventHandler
    public void serverStarted(FMLServerStartedEvent evt)
    {
        ServerCommandManager manager = (ServerCommandManager) MinecraftServer.getServer().getCommandManager();
        if (FergoCommands.commands != null)
        {
            for (ICommand cmd : FergoCommands.commands)
            {
                manager.registerCommand(cmd);
            }

            manager.registerCommand(new CommandFergoTools());
        }
    }
}
