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
 import io.github.fergoman123.fergotools.block.FTLogs;
 import io.github.fergoman123.fergotools.block.FTPlanks;
 import io.github.fergoman123.fergotools.init.FergoBlocks.*;
 import io.github.fergoman123.fergotools.init.ModBlocks;
 import io.github.fergoman123.fergotools.init.FergoItems.*;
 import io.github.fergoman123.fergotools.reference.names.BlockNames;
 import io.github.fergoman123.fergotools.reference.names.ItemNames;
 import io.github.fergoman123.fergotools.util.GuiHandler;
 import io.github.fergoman123.fergoutil.helper.RegisterHelper;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.oredict.OreDictionary;

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
//
//        RegisterHelper.registerOre("logWood", new ItemStack(FTLogs.instance, 1, OreDictionary.WILDCARD_VALUE));
//        RegisterHelper.registerOre("plankWood", new ItemStack(FTPlanks.instance, 1, OreDictionary.WILDCARD_VALUE));
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

