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
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.oredict.OreDictionary;

 public class RegHandler {

    public static WorldGenerationHandler worldGenHandler = new WorldGenerationHandler();
    public static GuiHandler guiHandler = new GuiHandler();
    public static FuelHandler fuel = new FuelHandler();

    public static void init() {
        NetworkRegistry.INSTANCE.registerGuiHandler(FergoTools.getInstance(), guiHandler);
        RegisterHelper.registerWorldGenerator(worldGenHandler, 0);
        RegisterHelper.registerFuelHandler(fuel);
    }

    public static void registerOres()
    {
//        registerOre(BlockNames.oreObsidian, FTContent.oreObsidian);
//        registerOre(BlockNames.oreGemEmerald, FTContent.oreGemEmerald);
//        registerOre(BlockNames.oreGemLapis, FTContent.oreGemLapis);
//        registerOre(BlockNames.oreBronze, FTContent.oreBronze);
//        registerOre(BlockNames.oreAdamantium, FTContent.oreAdamantium);
//        registerOre(BlockNames.oreExperience, FTContent.oreExperience);
//        registerOre(BlockNames.oreGemRedstone, FTContent.oreGemRedstone);
//
//        registerOre(BlockNames.blockObsidian, FTContent.blockObsidian);
//        registerOre(BlockNames.blockGemEmerald, FTContent.blockGemEmerald);
//        registerOre(BlockNames.blockGemLapis, FTContent.blockGemLapis);
//        registerOre(BlockNames.blockBronze, FTContent.blockBronze);
//        registerOre(BlockNames.blockCoal, FTContent.blockCoal);
//        registerOre(BlockNames.blockGlowstone, FTContent.blockGlowstone);
//        registerOre(BlockNames.blockAdamantium, FTContent.blockAdamantium);
//        registerOre(BlockNames.blockGemSilk, FTContent.blockGemSilk);
//        registerOre(BlockNames.blockGemRedstone, FTContent.blockGemRedstone);
//
//        registerOre(ItemNames.ingotObsidian, FTContent.ingotObsidian);
//        registerOre(ItemNames.gemEmerald, FTContent.gemEmerald);
//        registerOre(ItemNames.gemLapis, FTContent.gemLapis);
//        registerOre(ItemNames.ingotBronze, FTContent.ingotBronze);
//        registerOre(ItemNames.ingotCoal, FTContent.ingotCoal);
//        registerOre(ItemNames.ingotGlowstone, FTContent.ingotGlowstone);
//        registerOre(ItemNames.ingotAdamantium, FTContent.ingotAdamantium);
//        registerOre(ItemNames.gemSilk, FTContent.gemSilk);
//        registerOre(ItemNames.gemRedstone, FTContent.gemRedstone);
//        registerOre(ItemNames.shardExp, FTContent.shardExp);
//
//        registerOre("logWood", FTContent.logObsidian);
//        registerOre("logWood", FTContent.logEmerald);
//        registerOre("logWood", FTContent.logLapis);
//        registerOre("logWood", FTContent.logBronze);
//        registerOre("logWood", FTContent.logCoal);
//        registerOre("logWood", FTContent.logGlowstone);
//        registerOre("logWood", FTContent.logAdamantium);
//        registerOre("logWood", FTContent.logSilk);
//        registerOre("logWood", FTContent.logRedstone);
//
//        registerOre("plankWood", FTContent.plankObsidian);
//        registerOre("plankWood", FTContent.plankEmerald);
//        registerOre("plankWood", FTContent.plankLapis);
//        registerOre("plankWood", FTContent.plankBronze);
//        registerOre("plankWood", FTContent.plankCoal);
//        registerOre("plankWood", FTContent.plankGlowstone);
//        registerOre("plankWood", FTContent.plankAdamantium);
//        registerOre("plankWood", FTContent.plankSilk);
//        registerOre("plankWood", FTContent.plankRedstone);
//
//        registerOre("stairWood", FTContent.stairObsidian);
//        registerOre("stairWood", FTContent.stairEmerald);
//        registerOre("stairWood", FTContent.stairLapis);
//        registerOre("stairWood", FTContent.stairBronze);
//        registerOre("stairWood", FTContent.stairCoal);
//        registerOre("stairWood", FTContent.stairGlowstone);
//        registerOre("stairWood", FTContent.stairAdamantium);
//        registerOre("stairWood", FTContent.stairSilk);
//        registerOre("stairWood", FTContent.stairRedstone);
//
//        registerOre("stickWood", new ItemStack(FTContent.stickFT, 1, OreDictionary.WILDCARD_VALUE));
    }

     public static void registerOre(String oreName, Item item)
     {
         OreDictionary.registerOre(oreName, item);
     }

     public static void registerOre(String oreName, Block block)
     {
         OreDictionary.registerOre(oreName, block);
     }

     public static void registerOre(String oreName, ItemStack stack)
     {
         OreDictionary.registerOre(oreName, stack);
     }
}

