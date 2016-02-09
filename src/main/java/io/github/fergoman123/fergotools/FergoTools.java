package io.github.fergoman123.fergotools;

import io.github.fergoman123.fergotools.event.ItemToolTipEvent;
import io.github.fergoman123.fergotools.handler.GuiHandler;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.logging.LoggerUtils;
import io.github.fergoman123.fergotools.reference.MetadataFT;
import io.github.fergoman123.fergotools.reference.ModInfo;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.proxy.IProxy;
import io.github.fergoman123.fergoutil.reference.ModConstants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.network.NetworkManager;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.versionMain, dependencies = ModConstants.dep, guiFactory = Reference.guiFactoryClass)
public class FergoTools {

    @Instance(ModInfo.modid)
    public static FergoTools instance;

    @SidedProxy(clientSide = Reference.clientProxyClass, serverSide = Reference.serverProxyClass)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent evt) {
        LoggerUtils.info("Pre Initialising Mod");
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
        MetadataFT.writeMetadata(evt.getModMetadata());
        ModItems.addItems();
        ModBlocks.addBlocks();
    }

    @EventHandler
    public void load(FMLInitializationEvent evt) {
        LoggerUtils.info("Initialising Registration");
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        MinecraftForge.EVENT_BUS.register(new ItemToolTipEvent());
    }

    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent evt) {
        LoggerUtils.info("Mod Loaded");
    }

    @EventHandler
    public void serverStarted(FMLServerStartingEvent evt) {
        LoggerUtils.info("Registering Commands");
    }
}
