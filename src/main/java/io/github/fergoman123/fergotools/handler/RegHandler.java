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
 import io.github.fergoman123.fergotools.core.FTContent;
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
        RegisterHelper.registerOre(BlockNames.oreObsidian, FTContent.oreObsidian);
        RegisterHelper.registerOre(BlockNames.oreEmeraldCrystal, FTContent.oreGemEmerald);
        RegisterHelper.registerOre(BlockNames.oreLapisCrystal, FTContent.oreGemLapis);
        RegisterHelper.registerOre(BlockNames.oreBronze, FTContent.oreBronze);
        RegisterHelper.registerOre(BlockNames.oreAdamantium, FTContent.oreAdamantium);
        RegisterHelper.registerOre(BlockNames.oreExperience, FTContent.oreExperience);
        RegisterHelper.registerOre(BlockNames.oreCrystalRed, FTContent.oreRedCrystal);

        RegisterHelper.registerOre(BlockNames.blockObsidian, FTContent.blockObsidian);
        RegisterHelper.registerOre(BlockNames.blockEmeraldCrystal, FTContent.blockEmerald);
        RegisterHelper.registerOre(BlockNames.blockLapisCrystal, FTContent.blockLapis);
        RegisterHelper.registerOre(BlockNames.blockBronze, FTContent.blockBronze);
        RegisterHelper.registerOre(BlockNames.blockCoal, FTContent.blockCoal);
        RegisterHelper.registerOre(BlockNames.blockGlowstone, FTContent.blockGlowstone);
        RegisterHelper.registerOre(BlockNames.blockAdamantium, FTContent.blockAdamantium);
        RegisterHelper.registerOre(BlockNames.blockSilkGem, FTContent.blockSilkGem);
        RegisterHelper.registerOre(BlockNames.blockRedstoneCrystal, FTContent.blockRedstone);

        RegisterHelper.registerOre(ItemNames.ingotObsidian, FTContent.ingotObsidian);
        RegisterHelper.registerOre(ItemNames.gemEmerald, FTContent.gemEmerald);
        RegisterHelper.registerOre(ItemNames.gemLapis, FTContent.gemLapis);
        RegisterHelper.registerOre(ItemNames.ingotBronze, FTContent.ingotBronze);
        RegisterHelper.registerOre(ItemNames.ingotCoal, FTContent.ingotCoal);
        RegisterHelper.registerOre(ItemNames.ingotGlowstone, FTContent.ingotGlowstone);
        RegisterHelper.registerOre(ItemNames.ingotAdamantium, FTContent.ingotAdamantium);
        RegisterHelper.registerOre(ItemNames.gemSilk, FTContent.gemSilk);
        RegisterHelper.registerOre(ItemNames.gemRedstone, FTContent.gemRedstone);
        RegisterHelper.registerOre(ItemNames.shardExp, FTContent.shardExp);

        RegisterHelper.registerOre("logWood", FTContent.logObsidian);
        RegisterHelper.registerOre("logWood", FTContent.logEmerald);
        RegisterHelper.registerOre("logWood", FTContent.logLapis);
        RegisterHelper.registerOre("logWood", FTContent.logBronze);
        RegisterHelper.registerOre("logWood", FTContent.logCoal);
        RegisterHelper.registerOre("logWood", FTContent.logGlowstone);
        RegisterHelper.registerOre("logWood", FTContent.logAdamantium);
        RegisterHelper.registerOre("logWood", FTContent.logSilk);
        RegisterHelper.registerOre("logWood", FTContent.logRedstone);

        RegisterHelper.registerOre("plankWood", FTContent.plankObsidian);
        RegisterHelper.registerOre("plankWood", FTContent.plankEmerald);
        RegisterHelper.registerOre("plankWood", FTContent.plankLapis);
        RegisterHelper.registerOre("plankWood", FTContent.plankBronze);
        RegisterHelper.registerOre("plankWood", FTContent.plankCoal);
        RegisterHelper.registerOre("plankWood", FTContent.plankGlowstone);
        RegisterHelper.registerOre("plankWood", FTContent.plankAdamantium);
        RegisterHelper.registerOre("plankWood", FTContent.plankSilk);
        RegisterHelper.registerOre("plankWood", FTContent.plankRedstone);

        RegisterHelper.registerOre("stairWood", FTContent.stairObsidian);
        RegisterHelper.registerOre("stairWood", FTContent.stairEmerald);
        RegisterHelper.registerOre("stairWood", FTContent.stairLapis);
        RegisterHelper.registerOre("stairWood", FTContent.stairBronze);
        RegisterHelper.registerOre("stairWood", FTContent.stairCoal);
        RegisterHelper.registerOre("stairWood", FTContent.stairGlowstone);
        RegisterHelper.registerOre("stairWood", FTContent.stairAdamantium);
        RegisterHelper.registerOre("stairWood", FTContent.stairSilk);
        RegisterHelper.registerOre("stairWood", FTContent.stairRedstone);

        RegisterHelper.registerOre("stickWood", FTContent.stickObsidian);
        RegisterHelper.registerOre("stickWood", FTContent.stickEmerald);
        RegisterHelper.registerOre("stickWood", FTContent.stickLapis);
        RegisterHelper.registerOre("stickWood", FTContent.stickBronze);
        RegisterHelper.registerOre("stickWood", FTContent.stickCoal);
        RegisterHelper.registerOre("stickWood", FTContent.stickGlowstone);
        RegisterHelper.registerOre("stickWood", FTContent.stickAdamantium);
        RegisterHelper.registerOre("stickWood", FTContent.stickSilk);
        RegisterHelper.registerOre("stickWood", FTContent.stickRedstone);
    }
}

