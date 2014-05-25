package fergoman123.mods.fergotools;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fergoman123.mods.fergotools.handler.RecipeHandler;
import fergoman123.mods.fergotools.handler.RegHandler;
import fergoman123.mods.fergotools.handler.WorldGenerationHandler;
import fergoman123.mods.fergotools.helper.LogHelper;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.ModInfo;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.packet.PacketPipeline;
import fergoman123.mods.fergotools.proxy.CommonProxy;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;

@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.version, dependencies = ModInfo.dep)
public class FergoTools {

    public static final PacketPipeline packPipe = new PacketPipeline();
	
    @Instance(ModInfo.modid)
    public static FergoTools instance;
    
    @SidedProxy(clientSide = Reference.clientProxy, serverSide = Reference.commonProxy)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        LogHelper.info("Pre Initialising Mod");
        Tabs.init();
        UtilToolArmor.init();
        ModItems.init();
        ModBlocks.initBlocks();
        WorldGenerationHandler.initBiomes();
    }

	@EventHandler
    public void load(FMLInitializationEvent evt)
    {
        LogHelper.info("Initialising Registration and Packet Handler");
        RegHandler.init();
        RecipeHandler.initRecipes();
        RecipeHandler.initSmeltingRecipes();
        packPipe.initialise();
    }
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt)
    {
        LogHelper.info("Mod Loaded");
        packPipe.postInitialise();
    }
}
