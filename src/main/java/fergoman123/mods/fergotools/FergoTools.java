package fergoman123.mods.fergotools;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fergoman123.mods.fergotools.config.ConfigHandler;
import fergoman123.mods.fergotools.handler.RegHandler;
import fergoman123.mods.fergotools.helper.LogHelper;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.init.ModTiles;
import fergoman123.mods.fergotools.init.Recipes;
import fergoman123.mods.fergotools.reference.MetadataFT;
import fergoman123.mods.fergotools.reference.ModInfo;
import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergotools.creativetab.CreativeTabsFergoTools;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergoutil.proxy.IProxy;

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
        LogHelper.info("Pre Initialising Mod");
        MetadataFT.writeMetadata(evt.getModMetadata());
        ConfigHandler.init(evt.getSuggestedConfigurationFile());
        CreativeTabsFergoTools.init();
        ToolArmorMaterials.init();
        ModItems.init();
        ModBlocks.init();
    }

	@EventHandler
    public void load(FMLInitializationEvent evt)
    {
        LogHelper.info("Initialising Registration and Packet Handler");
        ModTiles.init();
        RegHandler.init();
        Recipes.init();
    }
	
	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt)
    {
        LogHelper.info("Mod Loaded");
    }
}
