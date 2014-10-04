 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.GuiHandler;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

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
        RegisterHelper.registerOre(Names.Blocks.oreObsidian, ModBlocks.oreObsidian);
        RegisterHelper.registerOre(Names.Blocks.oreEmeraldCrystal, ModBlocks.oreEmeraldCrystal);
        RegisterHelper.registerOre(Names.Blocks.oreLapisCrystal, ModBlocks.oreLapisCrystal);
        RegisterHelper.registerOre(Names.Blocks.oreBronze, ModBlocks.oreBronze);
        RegisterHelper.registerOre(Names.Blocks.oreExperience, ModBlocks.oreExperience);
        RegisterHelper.registerOre(Names.Blocks.oreAdamantium, ModBlocks.oreAdamantium);
        RegisterHelper.registerOre(Names.Blocks.oreCrystalRed, ModBlocks.oreCrystalRed);

        RegisterHelper.registerOre(Names.Blocks.blockExperience, ModBlocks.blockExperience);
        RegisterHelper.registerOre(Names.Blocks.blockObsidian, ModBlocks.blockObsidian);
        RegisterHelper.registerOre(Names.Blocks.blockEmeraldCrystal, ModBlocks.blockEmeraldCrystal);
        RegisterHelper.registerOre(Names.Blocks.blockLapisCrystal, ModBlocks.blockLapisCrystal);
        RegisterHelper.registerOre(Names.Blocks.blockBronze, ModBlocks.blockBronze);
        RegisterHelper.registerOre(Names.Blocks.blockCoal, ModBlocks.blockCoal);
        RegisterHelper.registerOre(Names.Blocks.blockGlowstone, ModBlocks.blockGlowstone);
        RegisterHelper.registerOre(Names.Blocks.blockAdamantium, ModBlocks.blockAdamantium);
        RegisterHelper.registerOre(Names.Blocks.blockSilkGem, ModBlocks.blockSilkGem);
        RegisterHelper.registerOre(Names.Blocks.blockRedstoneCrystal, ModBlocks.blockRedstoneCrystal);

        RegisterHelper.registerOre(Names.Items.ingotObsidian, ModItems.ingotObsidian);
        RegisterHelper.registerOre(Names.Items.gemEmerald, ModItems.gemEmerald);
        RegisterHelper.registerOre(Names.Items.gemLapis, ModItems.gemLapis);
        RegisterHelper.registerOre(Names.Items.ingotBronze, ModItems.ingotBronze);
        RegisterHelper.registerOre(Names.Items.ingotCoal, ModItems.ingotCoal);
        RegisterHelper.registerOre(Names.Items.ingotGlowstone, ModItems.ingotGlowstone);
        RegisterHelper.registerOre(Names.Items.ingotAdamantium, ModItems.ingotAdamantium);
        RegisterHelper.registerOre(Names.Items.gemRedstone, ModItems.gemRedstone);
        RegisterHelper.registerOre(Names.Items.gemSilk, ModItems.gemSilk);
        RegisterHelper.registerOre(Names.Items.shardExp, ModItems.shardExp);
    }
}

