 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.handler;

 import io.github.fergoman123.fergotools.FergoTools;
 import io.github.fergoman123.fergotools.init.ModBlocks;
 import io.github.fergoman123.fergotools.init.ModItems;
 import io.github.fergoman123.fergotools.reference.names.BlockNames;
 import io.github.fergoman123.fergotools.reference.names.ItemNames;
 import io.github.fergoman123.fergotools.util.GuiHandler;
 import io.github.fergoman123.fergoutil.helper.RegisterHelper;

 public class RegHandler {

    public static WorldGenerationHandler worldGenHandler = new WorldGenerationHandler();
    public static GuiHandler guiHandler = new GuiHandler();
    public static FuelHandler fuel = new FuelHandler();

    public static void init() {
        RegisterHelper.registerGuiHandler(FergoTools.getInstance(), guiHandler);
        RegisterHelper.registerWorldGenerator(worldGenHandler, 0);
        RegisterHelper.registerFuelHandler(fuel);
    }

    public static void registerOres()
    {
        for (int i = 0; i < BlockNames.oreList.length; i++) {
            RegisterHelper.registerOre(BlockNames.oreList[i], ModBlocks.ores[i]);
        }

        for (int i = 0; i < BlockNames.blockList.length; i++)
        {
            RegisterHelper.registerOre(BlockNames.blockList[i], ModBlocks.blocks[i]);
        }

        for (int i = 0; i < ItemNames.materials.length; i++) {
            RegisterHelper.registerOre(ItemNames.materials[i], ModItems.materials[i]);
        }

        for (int i = 0; i < BlockNames.logs.length; i++) {
            RegisterHelper.registerOre("logWood", ModBlocks.logs[i]);
        }

        for (int i = 0; i < BlockNames.planks.length; i++)
        {
            RegisterHelper.registerOre("plankWood", ModBlocks.planks[i]);
        }

        for (int i = 0; i < ItemNames.sticks.length; i++) {
            RegisterHelper.registerOre("stickWood", ModItems.sticks[i]);
        }
    }
}

