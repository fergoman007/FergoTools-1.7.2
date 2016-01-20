package io.github.fergoman123.fergotools;

import io.github.fergoman123.fergotools.logging.LoggerUtils;
import io.github.fergoman123.fergotools.reference.MetadataFT;
import io.github.fergoman123.fergotools.reference.ModInfo;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.proxy.IProxy;
import io.github.fergoman123.fergoutil.reference.ModConstants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.versionMain, dependencies = ModConstants.dep, guiFactory = Reference.guiFactoryClass)
public class FergoTools {

    @Instance(ModInfo.modid)
    public static FergoTools instance;

    @SidedProxy(clientSide = Reference.clientProxyClass, serverSide = Reference.serverProxyClass)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent evt) {
        LoggerUtils.info("Pre Initialising Mod");
        MetadataFT.writeMetadata(evt.getModMetadata());
    }

    @EventHandler
    public void load(FMLInitializationEvent evt) {
        LoggerUtils.info("Initialising Registration");
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
