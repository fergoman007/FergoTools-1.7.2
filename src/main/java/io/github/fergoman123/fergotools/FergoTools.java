package io.github.fergoman123.fergotools;

import io.github.fergoman123.fergotools.common.handler.FuelHandler;
import io.github.fergoman123.fergotools.common.handler.GuiHandler;
import io.github.fergoman123.fergotools.common.recipe.MaceratorRecipeList;
import io.github.fergoman123.fergotools.info.FTModMetadata;
import io.github.fergoman123.fergotools.info.ModInfo;
import io.github.fergoman123.fergotools.info.Reference;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.proxy.IProxy;
import io.github.fergoman123.fergoutil.reference.ModConstants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.version, dependencies = ModConstants.dep, guiFactory = Reference.guiFactoryClass)
public class FergoTools
{
    @Mod.Instance(ModInfo.modid)
    public static FergoTools instance;

    public static Logger getLogger()
    {
        return LogManager.getLogger(ModInfo.modid);
    }

    @SidedProxy(clientSide = Reference.clientProxyClass, serverSide = Reference.serverProxyClass)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        FTModMetadata.writeMetadata(evt.getModMetadata());
        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent evt)
    {
        ModItems.register();
        ModBlocks.register();
        proxy.registerTileEntities();
        proxy.registerEventHandlers();

        GuiHelper.registerGuiHandler(this, GuiHandler.instance);
        RegisterHelper.registerFuelHandler(FuelHandler.instance);
    }

    @Mod.EventHandler
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
        getLogger().info("Mods Loaded");

        for (String oreName : OreDictionary.getOreNames())
        {
            getLogger().info("Ore DictionaryName: " + oreName);
        }
    }
}
