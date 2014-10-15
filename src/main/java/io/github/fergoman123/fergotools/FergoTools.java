 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.fergoman123.fergotools.init.FergoToolsMod;
import io.github.fergoman123.fergotools.reference.ModInfo;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.lib.ModConstants;
import io.github.fergoman123.fergoutil.proxy.IProxy;

@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.versionMain, dependencies = ModConstants.dependency, guiFactory = Reference.guiFactoryClass)
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
}
