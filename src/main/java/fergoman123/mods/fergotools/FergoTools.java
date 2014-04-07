package fergoman123.mods.fergotools;

// minecraft imports
// fml imports

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fergoman123.mods.fergotools.block.ModBlocks;
import fergoman123.mods.fergotools.handler.RegHandler;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.ModInfo;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.packet.PacketPipeline;
import fergoman123.mods.fergotools.proxy.CommonProxy;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;


@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.version)
public class FergoTools {

    public static final PacketPipeline packPipe = new PacketPipeline();
	
    @Instance(ModInfo.modid)
    public static FergoTools instance;
    
    @SidedProxy(clientSide = Reference.clientProxy, serverSide = Reference.commonProxy)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {

        Tabs.addTabs();
        ToolArmorMaterials.addToolMaterials();
        ToolArmorMaterials.addArmorMaterials();
        ModItems.addItems();
        ModItems.addArmor();
        ModItems.addBows();
        ModItems.addHammers();
        ModBlocks.addBlocks();
        RegHandler.registerBlocks();
        RegHandler.registerItems();
    }
    

	@EventHandler
    public void load(FMLInitializationEvent evt)
    {
//        RecipesHandler.init();
        RegHandler.registerGuiHandlers();
        RegHandler.registerTileEntities();
        RegHandler.registerWorldGen();
        packPipe.initialise();
    }
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt)
    {
        FMLLog.info("Mod Loaded");
        FMLLog.info("Enjoy!!!!!");
        packPipe.postInitialise();
    }


}
