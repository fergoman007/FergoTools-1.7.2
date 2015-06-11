/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.proxy;


import io.github.fergoman123.fergotools.common.tileentities.*;
import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.event.ItemToolTipEvent;
import io.github.fergoman123.fergotools.event.OnArmorTickEvent;
import io.github.fergoman123.fergotools.event.OnPlayerLoggedInEvent;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;

import static io.github.fergoman123.fergoutil.helper.RegisterHelper.registerEvent;
import static io.github.fergoman123.fergoutil.helper.RegisterHelper.registerTileEntity;

public class ClientProxy extends CommonProxy
{

    @Override
    public void registerTileEntities() {
        registerTileEntity(TileQuartzFurnace.class, "quartzFurnace");
        registerTileEntity(TileObsidianFurnace.class, "obsidianFurnace");
        registerTileEntity(TileEmeraldFurnace.class, "emeraldFurnace");
        registerTileEntity(TileLapisFurnace.class, "lapisFurnace");
        registerTileEntity(TileBronzeFurnace.class, "bronzeFurnace");
        registerTileEntity(TileCoalFurnace.class, "coalFurnace");
        registerTileEntity(TileGlowstoneFurnace.class, "glowstoneFurnace");
        registerTileEntity(TileAdamantiumFurnace.class, "adamantiumFurnace");
        registerTileEntity(TileSilkFurnace.class, "silkFurnace");
        registerTileEntity(TileRedstoneFurnace.class, "redstoneFurnace");
        registerTileEntity(TileMacerator.class, "macerator");
    }

    @Override
    public void registerRenderers() {
        ModItems.ingotObsidian.registerModel();
        ModItems.gemEmerald.registerModel();
        ModItems.gemLapis.registerModel();
        ModItems.ingotBronze.registerModel();
        ModItems.ingotCoal.registerModel();
        ModItems.ingotGlowstone.registerModel();
        ModItems.ingotAdamantium.registerModel();
        ModItems.gemSilk.registerModel();
        ModItems.gemRedstone.registerModel();
        ModItems.gemExp.registerModel();
        ModItems.gemExp2.registerModel();
        ModItems.gemExp3.registerModel();

        ModItems.staffExp.registerModel();
        ModItems.staffExp2.registerModel();
        ModItems.staffExp3.registerModel();

        ModItems.shardExp.registerModel();
        ModItems.expCollector.registerModel();

        ModItems.quartzPickaxe.registerModel();
        ModItems.quartzShovel.registerModel();
        ModItems.quartzAxe.registerModel();
        ModItems.quartzHoe.registerModel();
        ModItems.quartzSword.registerModel();

        ModItems.obsidianPickaxe.registerModel();
        ModItems.obsidianShovel.registerModel();
        ModItems.obsidianAxe.registerModel();
        ModItems.obsidianHoe.registerModel();
        ModItems.obsidianSword.registerModel();

        ModItems.emeraldPickaxe.registerModel();
        ModItems.emeraldShovel.registerModel();
        ModItems.emeraldAxe.registerModel();
        ModItems.emeraldHoe.registerModel();
        ModItems.emeraldSword.registerModel();

        ModItems.lapisPickaxe.registerModel();
        ModItems.lapisShovel.registerModel();
        ModItems.lapisAxe.registerModel();
        ModItems.lapisHoe.registerModel();
        ModItems.lapisSword.registerModel();

        ModItems.bronzePickaxe.registerModel();
        ModItems.bronzeShovel.registerModel();
        ModItems.bronzeAxe.registerModel();
        ModItems.bronzeHoe.registerModel();
        ModItems.bronzeSword.registerModel();

        ModItems.coalPickaxe.registerModel();
        ModItems.coalShovel.registerModel();
        ModItems.coalAxe.registerModel();
        ModItems.coalHoe.registerModel();
        ModItems.coalSword.registerModel();

        ModItems.glowstonePickaxe.registerModel();
        ModItems.glowstoneShovel.registerModel();
        ModItems.glowstoneAxe.registerModel();
        ModItems.glowstoneHoe.registerModel();
        ModItems.glowstoneSword.registerModel();

        ModItems.adamantiumPickaxe.registerModel();
        ModItems.adamantiumShovel.registerModel();
        ModItems.adamantiumAxe.registerModel();
        ModItems.adamantiumHoe.registerModel();
        ModItems.adamantiumSword.registerModel();

        ModItems.silkPickaxe.registerModel();
        ModItems.silkShovel.registerModel();
        ModItems.silkAxe.registerModel();
        ModItems.silkHoe.registerModel();
        ModItems.silkSword.registerModel();

        ModItems.redstonePickaxe.registerModel();
        ModItems.redstoneShovel.registerModel();
        ModItems.redstoneAxe.registerModel();
        ModItems.redstoneHoe.registerModel();
        ModItems.redstoneSword.registerModel();

        ModItems.quartzHelmet.registerModel();
        ModItems.quartzChestplate.registerModel();
        ModItems.quartzLeggings.registerModel();
        ModItems.quartzBoots.registerModel();

        ModItems.obsidianHelmet.registerModel();
        ModItems.obsidianChestplate.registerModel();
        ModItems.obsidianLeggings.registerModel();
        ModItems.obsidianBoots.registerModel();

        ModItems.emeraldHelmet.registerModel();
        ModItems.emeraldChestplate.registerModel();
        ModItems.emeraldLeggings.registerModel();
        ModItems.emeraldBoots.registerModel();

        ModItems.lapisHelmet.registerModel();
        ModItems.lapisChestplate.registerModel();
        ModItems.lapisLeggings.registerModel();
        ModItems.lapisBoots.registerModel();

        ModItems.bronzeHelmet.registerModel();
        ModItems.bronzeChestplate.registerModel();
        ModItems.bronzeLeggings.registerModel();
        ModItems.bronzeBoots.registerModel();

        ModItems.coalHelmet.registerModel();
        ModItems.coalChestplate.registerModel();
        ModItems.coalLeggings.registerModel();
        ModItems.coalBoots.registerModel();

        ModItems.glowstoneHelmet.registerModel();
        ModItems.glowstoneChestplate.registerModel();
        ModItems.glowstoneLeggings.registerModel();
        ModItems.glowstoneBoots.registerModel();

        ModItems.adamantiumHelmet.registerModel();
        ModItems.adamantiumChestplate.registerModel();
        ModItems.adamantiumLeggings.registerModel();
        ModItems.adamantiumBoots.registerModel();

        ModItems.redstoneHelmet.registerModel();
        ModItems.redstoneChestplate.registerModel();
        ModItems.redstoneLeggings.registerModel();
        ModItems.redstoneBoots.registerModel();

        ModItems.bowQuartz.registerModels();
        ModItems.bowObsidian.registerModels();
        ModItems.bowEmerald.registerModels();
        ModItems.bowLapis.registerModels();
        ModItems.bowBronze.registerModels();
        ModItems.bowCoal.registerModels();
        ModItems.bowGlowstone.registerModels();
        ModItems.bowAdamantium.registerModels();
        ModItems.bowSilk.registerModels();
        ModItems.bowRedstone.registerModels();

        ModItems.quartzShears.registerModel();
        ModItems.obsidianShears.registerModel();
        ModItems.emeraldShears.registerModel();
        ModItems.lapisShears.registerModel();
        ModItems.bronzeShears.registerModel();
        ModItems.coalShears.registerModel();
        ModItems.glowstoneShears.registerModel();
        ModItems.adamantiumShears.registerModel();
        ModItems.silkShears.registerModel();
        ModItems.redstoneShears.registerModel();

        ModItems.stickFT.registerModels();

        ModBlocks.oreExperience.registerModel();
        ModBlocks.oreObsidian.registerModel();
        ModBlocks.oreGemEmerald.registerModel();
        ModBlocks.oreGemLapis.registerModel();
        ModBlocks.oreBronze.registerModel();
        ModBlocks.oreAdamantium.registerModel();
        ModBlocks.oreGemRedstone.registerModel();

        ModBlocks.storageFT.registerModels();

        ModBlocks.quartzFurnaceIdle.registerModel();
        ModBlocks.obsidianFurnaceIdle.registerModel();
        ModBlocks.emeraldFurnaceIdle.registerModel();
        ModBlocks.lapisFurnaceIdle.registerModel();
        ModBlocks.bronzeFurnaceIdle.registerModel();
        ModBlocks.coalFurnaceIdle.registerModel();
        ModBlocks.glowstoneFurnaceIdle.registerModel();
        ModBlocks.adamantiumFurnaceIdle.registerModel();
        ModBlocks.silkFurnaceIdle.registerModel();
        ModBlocks.redstoneFurnaceIdle.registerModel();
        ModBlocks.maceratorIdle.registerModel();

        ModBlocks.quartzFurnaceActive.registerModel();
        ModBlocks.obsidianFurnaceActive.registerModel();
        ModBlocks.emeraldFurnaceActive.registerModel();
        ModBlocks.lapisFurnaceActive.registerModel();
        ModBlocks.bronzeFurnaceActive.registerModel();
        ModBlocks.coalFurnaceActive.registerModel();
        ModBlocks.glowstoneFurnaceActive.registerModel();
        ModBlocks.adamantiumFurnaceActive.registerModel();
        ModBlocks.silkFurnaceActive.registerModel();
        ModBlocks.redstoneFurnaceActive.registerModel();
        ModBlocks.maceratorActive.registerModel();

        ModBlocks.logFT = new BlockWoodLogFT(BlockNames.logFT);
        ModBlocks.plankFT = new BlockPlankFT(BlockNames.plankFT);

        ModBlocks.stairObsidian.registerModel();
        ModBlocks.stairEmerald.registerModel();
        ModBlocks.stairLapis.registerModel();
        ModBlocks.stairBronze.registerModel();
        ModBlocks.stairCoal.registerModel();
        ModBlocks.stairGlowstone.registerModel();
        ModBlocks.stairAdamantium.registerModel();
        ModBlocks.stairSilk.registerModel();
        ModBlocks.stairRedstone.registerModel();

        ModBlocks.singleSlabFT.registerModel();
        ModBlocks.doubleSlabFT = new BlockDSFT(BlockNames.slabDoubleFT);

        ModBlocks.leavesObsidian.registerModel();
        ModBlocks.leavesEmerald.registerModel();
        ModBlocks.leavesLapis.registerModel();
        ModBlocks.leavesBronze.registerModel();
        ModBlocks.leavesCoal.registerModel();
        ModBlocks.leavesGlowstone.registerModel();
        ModBlocks.leavesAdamantium.registerModel();
        ModBlocks.leavesSilk.registerModel();
        ModBlocks.leavesRedstone.registerModel();

        ModBlocks.saplingFT.registerModels();

        ModBlocks.obsidianWorkbench.registerModel();
        ModBlocks.emeraldWorkbench.registerModel();
        ModBlocks.lapisWorkbench.registerModel();
        ModBlocks.bronzeWorkbench.registerModel();
        ModBlocks.coalWorkbench.registerModel();
        ModBlocks.glowstoneWorkbench.registerModel();
        ModBlocks.adamantiumWorkbench.registerModel();
        ModBlocks.silkWorkbench.registerModel();
        ModBlocks.redstoneWorkbench.registerModel();
    }

    @Override
    public void registerEventHandlers()
    {
        registerEvent(OnPlayerLoggedInEvent.instance);
        registerEvent(OnArmorTickEvent.instance);
        registerEvent(ConfigHandler.instance);
        registerEvent(ItemToolTipEvent.instance);
    }
}
