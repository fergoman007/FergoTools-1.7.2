 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools;

 import io.github.fergoman123.fergotools.init.FergoToolsMod;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.ModInfo;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.proxy.IProxy;
import io.github.fergoman123.fergoutil.reference.ModConstants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

 @Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.versionMain, dependencies = ModConstants.dep, guiFactory = Reference.guiFactoryClass)
public class FergoTools
{
    public static final CreativeTabs tabFergoTools = new CreativeTabs("fergotools.tabFergoTools") {
        @Override
        public Item getTabIconItem() {
            return ModItems.shardExp;
        }

        @Override
        public String getTranslatedTabLabel() {
            return StatCollector.translateToLocal("fergotools.tabfergotools");
        }
    };

    @Mod.Instance(ModInfo.modid)
    private static FergoTools instance;

    private static final Logger logger = LogManager.getLogger(ModInfo.modid);

    public static FergoTools getInstance() {
        return instance;
    }

    public static Logger getLogger()
    {
        return logger;
    }

    @SidedProxy(clientSide = Reference.clientProxyClass, serverSide = Reference.serverProxyClass)
    public static IProxy
            proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        FergoToolsMod.preInit(evt);
    }

	@Mod.EventHandler
    public void load(FMLInitializationEvent evt)
    {
        FergoToolsMod.load(evt);
    }

	@Mod.EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt)
    {
        FergoToolsMod.modsLoaded(evt);
    }
}
