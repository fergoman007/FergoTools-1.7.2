 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.handler;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.GuiHandler;

 public class RegHandler {

    public static WorldGenerationHandler worldGenHandler = new WorldGenerationHandler();
    public static GuiHandler guiHandler = new GuiHandler();
    public static FuelHandler fuel = new FuelHandler();

    public static void init() {
        RegisterHelper.registerGuiHandler(FergoTools.instance, guiHandler);
        RegisterHelper.registerWorldGenerator(worldGenHandler, 0);
        RegisterHelper.registerFuelHandler(fuel);
    }

    public static void registerOres()
    {
        for (int i = 0; i < Names.Blocks.oreList.length; i++) {
            RegisterHelper.registerOre(Names.Blocks.oreList[i], ModBlocks.ores[i]);
        }

        for (int i = 0; i < Names.Blocks.blockList.length; i++)
        {
            RegisterHelper.registerOre(Names.Blocks.blockList[i], ModBlocks.blocks[i]);
        }

        for (int i = 0; i < Names.Items.materials.length; i++) {
            RegisterHelper.registerOre(Names.Items.materials[i], ModItems.materials[i]);
        }

        for (int i = 0; i < Names.Blocks.logs.length; i++) {
            RegisterHelper.registerOre("logWood", ModBlocks.logs[i]);
        }

        for (int i = 0; i < Names.Blocks.planks.length; i++)
        {
            RegisterHelper.registerOre("plankWood", ModBlocks.planks[i]);
        }

        for (int i = 0; i < Names.Items.sticks.length; i++) {
            RegisterHelper.registerOre("stickWood", ModItems.sticks[i]);
        }
    }
}

