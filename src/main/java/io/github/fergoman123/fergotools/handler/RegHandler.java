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
 import io.github.fergoman123.fergotools.init.FTBlocks.*;
 import io.github.fergoman123.fergotools.init.FTItems.*;
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
//        RegisterHelper.registerOre(BlockNames.oreObsidian, BlockOreObsidian.instance);
//        RegisterHelper.registerOre(BlockNames.oreEmeraldCrystal, BlockOreEmeraldCrystal.instance);
//        RegisterHelper.registerOre(BlockNames.oreLapisCrystal, BlockOreLapisCrystal.instance);
//        RegisterHelper.registerOre(BlockNames.oreBronze, BlockOreBronze.instance);
//        RegisterHelper.registerOre(BlockNames.oreAdamantium, BlockOreAdamantium.instance);
//        RegisterHelper.registerOre(BlockNames.oreExperience, BlockOreExperience.instance);
//        RegisterHelper.registerOre(BlockNames.oreCrystalRed, BlockOreRedCrystal.instance);
//
//        RegisterHelper.registerOre(BlockNames.blockObsidian, BlockObsidianStorage.instance);
//        RegisterHelper.registerOre(BlockNames.blockEmeraldCrystal, BlockEmeraldCrystal.instance);
//        RegisterHelper.registerOre(BlockNames.blockLapisCrystal, BlockLapisCrystal.instance);
//        RegisterHelper.registerOre(BlockNames.blockBronze, BlockBronze.instance);
//        RegisterHelper.registerOre(BlockNames.blockCoal, BlockCoalStorage.instance);
//        RegisterHelper.registerOre(BlockNames.blockGlowstone, BlockGlowstoneStorage.instance);
//        RegisterHelper.registerOre(BlockNames.blockAdamantium, BlockAdamantium.instance);
//        RegisterHelper.registerOre(BlockNames.blockSilkGem, BlockSilkGem.instance);
//        RegisterHelper.registerOre(BlockNames.blockRedstoneCrystal, BlockRedstoneCrystal.instance);
//
//        RegisterHelper.registerOre(ItemNames.ingotObsidian, ItemObsidianIngot.instance);
//        RegisterHelper.registerOre(ItemNames.gemEmerald, ItemObsidianIngot.instance);
//        RegisterHelper.registerOre(ItemNames.gemLapis, ItemObsidianIngot.instance);
//        RegisterHelper.registerOre(ItemNames.ingotBronze, ItemObsidianIngot.instance);
//        RegisterHelper.registerOre(ItemNames.ingotCoal, ItemObsidianIngot.instance);
//        RegisterHelper.registerOre(ItemNames.ingotGlowstone, ItemObsidianIngot.instance);
//        RegisterHelper.registerOre(ItemNames.ingotAdamantium, ItemObsidianIngot.instance);
//        RegisterHelper.registerOre(ItemNames.gemSilk, ItemObsidianIngot.instance);
//        RegisterHelper.registerOre(ItemNames.gemRedstone, ItemObsidianIngot.instance);
//        RegisterHelper.registerOre(ItemNames.shardExp, ItemExpShard.instance);
//
//        RegisterHelper.registerOre("logWood", BlockLogObsidian.instance);
//        RegisterHelper.registerOre("logWood", BlockLogEmerald.instance);
//        RegisterHelper.registerOre("logWood", BlockLogLapis.instance);
//        RegisterHelper.registerOre("logWood", BlockLogBronze.instance);
//        RegisterHelper.registerOre("logWood", BlockLogCoal.instance);
//        RegisterHelper.registerOre("logWood", BlockLogGlowstone.instance);
//        RegisterHelper.registerOre("logWood", BlockLogAdamantium.instance);
//        RegisterHelper.registerOre("logWood", BlockLogSilk.instance);
//        RegisterHelper.registerOre("logWood", BlockLogRedstone.instance);
//
//        RegisterHelper.registerOre("plankWood", BlockPlankObsidian.instance);
//        RegisterHelper.registerOre("plankWood", BlockPlankEmerald.instance);
//        RegisterHelper.registerOre("plankWood", BlockPlankLapis.instance);
//        RegisterHelper.registerOre("plankWood", BlockPlankBronze.instance);
//        RegisterHelper.registerOre("plankWood", BlockPlankCoal.instance);
//        RegisterHelper.registerOre("plankWood", BlockPlankGlowstone.instance);
//        RegisterHelper.registerOre("plankWood", BlockPlankAdamantium.instance);
//        RegisterHelper.registerOre("plankWood", BlockPlankSilk.instance);
//        RegisterHelper.registerOre("plankWood", BlockPlankRedstone.instance);
//
//        RegisterHelper.registerOre("stairWood", BlockStairObsidian.instance);
//        RegisterHelper.registerOre("stairWood", BlockStairEmerald.instance);
//        RegisterHelper.registerOre("stairWood", BlockStairLapis.instance);
//        RegisterHelper.registerOre("stairWood", BlockStairBronze.instance);
//        RegisterHelper.registerOre("stairWood", BlockStairCoal.instance);
//        RegisterHelper.registerOre("stairWood", BlockStairGlowstone.instance);
//        RegisterHelper.registerOre("stairWood", BlockStairAdamantium.instance);
//        RegisterHelper.registerOre("stairWood", BlockStairSilk.instance);
//        RegisterHelper.registerOre("stairWood", BlockStairRedstone.instance);
//
//        RegisterHelper.registerOre("stickWood", ItemStickObsidian.instance);
//        RegisterHelper.registerOre("stickWood", ItemStickEmerald.instance);
//        RegisterHelper.registerOre("stickWood", ItemStickLapis.instance);
//        RegisterHelper.registerOre("stickWood", ItemStickBronze.instance);
//        RegisterHelper.registerOre("stickWood", ItemStickCoal.instance);
//        RegisterHelper.registerOre("stickWood", ItemStickGlowstone.instance);
//        RegisterHelper.registerOre("stickWood", ItemStickAdamantium.instance);
//        RegisterHelper.registerOre("stickWood", ItemStickSilk.instance);
//        RegisterHelper.registerOre("stickWood", ItemStickRedstone.instance);
    }
}

