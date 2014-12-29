/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.core.itemblock.ItemBlockFergoGlass;
import io.github.fergoman123.fergotools.core.itemblock.ItemBlockFergoWorkbench;
import io.github.fergoman123.fergotools.core.itemblock.block.*;
import io.github.fergoman123.fergotools.core.itemblock.furnaceactive.*;
import io.github.fergoman123.fergotools.core.itemblock.furnaceidle.*;
import io.github.fergoman123.fergotools.core.itemblock.log.*;
import io.github.fergoman123.fergotools.core.itemblock.ore.*;
import io.github.fergoman123.fergotools.core.itemblock.plank.*;
import io.github.fergoman123.fergotools.core.itemblock.stair.*;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class FTBlocks
{
    public static void init()
    {
        registerBlock(FTContent.oreExperience, ItemBlockOreExperience.class, BlockNames.oreExperience);
        registerBlock(FTContent.oreObsidian, ItemBlockOreObsidian.class, BlockNames.oreObsidian);
        registerBlock(FTContent.oreGemEmerald, ItemBlockOreEmerald.class, BlockNames.oreGemEmerald);
        registerBlock(FTContent.oreGemLapis, ItemBlockOreLapis.class, BlockNames.oreGemLapis);
        registerBlock(FTContent.oreBronze, ItemBlockOreBronze.class, BlockNames.oreBronze);
        registerBlock(FTContent.oreAdamantium, ItemBlockOreAdamantium.class, BlockNames.oreAdamantium);

        registerBlock(FTContent.blockExperience, ItemBlockExperience.class, BlockNames.blockExperience);
        registerBlock(FTContent.blockExpCollector, ItemBlockExpCollector.class, BlockNames.blockExpCollector);
        registerBlock(FTContent.blockObsidian, ItemBlockObsidian.class, BlockNames.blockObsidian);
        registerBlock(FTContent.blockEmerald, ItemBlockEmerald.class, BlockNames.blockGemEmerald);
        registerBlock(FTContent.blockLapis, ItemBlockLapis.class, BlockNames.blockGemLapis);
        registerBlock(FTContent.blockBronze, ItemBlockBronze.class, BlockNames.blockBronze);
        registerBlock(FTContent.blockCoal, ItemBlockCoal.class, BlockNames.blockCoal);
        registerBlock(FTContent.blockGlowstone, ItemBlockGlowstone.class, BlockNames.blockGlowstone);
        registerBlock(FTContent.blockAdamantium, ItemBlockAdamantium.class, BlockNames.blockAdamantium);
        registerBlock(FTContent.blockGemSilk, ItemBlockSilkGem.class, BlockNames.blockGemSilk);
        registerBlock(FTContent.blockRedstone, ItemBlockRedstone.class, BlockNames.blockGemRedstone);

        registerBlock(FTContent.quartzFurnaceIdle, ItemBlockQuartzFurnaceIdle.class, BlockNames.quartzFurnaceIdle);
        registerBlock(FTContent.obsidianFurnaceIdle, ItemBlockObsidianFurnaceIdle.class, BlockNames.obsidianFurnaceIdle);
        registerBlock(FTContent.emeraldFurnaceIdle, ItemBlockEmeraldFurnaceIdle.class, BlockNames.emeraldFurnaceIdle);
        registerBlock(FTContent.lapisFurnaceIdle, ItemBlockLapisFurnaceIdle.class, BlockNames.lapisFurnaceIdle);
        registerBlock(FTContent.bronzeFurnaceIdle, ItemBlockBronzeFurnaceIdle.class, BlockNames.bronzeFurnaceIdle);
        registerBlock(FTContent.coalFurnaceIdle, ItemBlockCoalFurnaceIdle.class, BlockNames.coalFurnaceIdle);
        registerBlock(FTContent.glowstoneFurnaceIdle, ItemBlockGlowstoneFurnaceIdle.class, BlockNames.glowstoneFurnaceIdle);
        registerBlock(FTContent.adamantiumFurnaceIdle, ItemBlockAdamantiumFurnaceIdle.class, BlockNames.adamantiumFurnaceIdle);
        registerBlock(FTContent.silkFurnaceIdle, ItemBlockSilkFurnaceIdle.class, BlockNames.silkFurnaceIdle);
        registerBlock(FTContent.redstoneFurnaceIdle, ItemBlockRedstoneFurnaceIdle.class, BlockNames.redstoneFurnaceIdle);
        registerBlock(FTContent.maceratorIdle, ItemBlockMaceratorIdle.class, BlockNames.maceratorIdle);

        registerBlock(FTContent.quartzFurnaceActive, ItemBlockQuartzFurnaceActive.class, BlockNames.quartzFurnaceActive);
        registerBlock(FTContent.obsidianFurnaceActive, ItemBlockObsidianFurnaceActive.class, BlockNames.obsidianFurnaceActive);
        registerBlock(FTContent.emeraldFurnaceActive, ItemBlockEmeraldFurnaceActive.class, BlockNames.emeraldFurnaceActive);
        registerBlock(FTContent.lapisFurnaceActive, ItemBlockLapisFurnaceActive.class, BlockNames.lapisFurnaceActive);
        registerBlock(FTContent.bronzeFurnaceActive, ItemBlockBronzeFurnaceActive.class, BlockNames.bronzeFurnaceActive);
        registerBlock(FTContent.coalFurnaceActive, ItemBlockCoalFurnaceActive.class, BlockNames.coalFurnaceActive);
        registerBlock(FTContent.glowstoneFurnaceActive, ItemBlockGlowstoneFurnaceActive.class, BlockNames.glowstoneFurnaceActive);
        registerBlock(FTContent.adamantiumFurnaceActive, ItemBlockAdamantiumFurnaceActive.class, BlockNames.adamantiumFurnaceActive);
        registerBlock(FTContent.silkFurnaceActive, ItemBlockSilkFurnaceActive.class, BlockNames.silkFurnaceActive);
        registerBlock(FTContent.redstoneFurnaceActive, ItemBlockRedstoneFurnaceActive.class, BlockNames.redstoneFurnaceActive);
        registerBlock(FTContent.maceratorActive, ItemBlockMaceratorActive.class, BlockNames.maceratorActive);

        registerBlock(FTContent.logObsidian, ItemBlockLogObsidian.class, BlockNames.logs[0]);
        registerBlock(FTContent.logEmerald, ItemBlockLogEmerald.class, BlockNames.logs[1]);
        registerBlock(FTContent.logLapis, ItemBlockLogLapis.class, BlockNames.logs[2]);
        registerBlock(FTContent.logBronze, ItemBlockLogBronze.class, BlockNames.logs[3]);
        registerBlock(FTContent.logCoal, ItemBlockLogCoal.class, BlockNames.logs[4]);
        registerBlock(FTContent.logGlowstone, ItemBlockLogGlowstone.class, BlockNames.logs[5]);
        registerBlock(FTContent.logAdamantium, ItemBlockLogAdamantium.class, BlockNames.logs[6]);
        registerBlock(FTContent.logSilk, ItemBlockLogSilk.class, BlockNames.logs[7]);
        registerBlock(FTContent.logRedstone, ItemBlockLogRedstone.class, BlockNames.logs[8]);

        registerBlock(FTContent.plankObsidian, ItemBlockPlankObsidian.class, BlockNames.planks[0]);
        registerBlock(FTContent.plankEmerald, ItemBlockPlankEmerald.class, BlockNames.planks[1]);
        registerBlock(FTContent.plankLapis, ItemBlockPlankLapis.class, BlockNames.planks[2]);
        registerBlock(FTContent.plankBronze, ItemBlockPlankBronze.class, BlockNames.planks[3]);
        registerBlock(FTContent.plankCoal, ItemBlockPlankCoal.class, BlockNames.planks[4]);
        registerBlock(FTContent.plankGlowstone, ItemBlockPlankGlowstone.class, BlockNames.planks[5]);
        registerBlock(FTContent.plankAdamantium, ItemBlockPlankAdamantium.class, BlockNames.planks[6]);
        registerBlock(FTContent.plankSilk, ItemBlockPlankSilk.class, BlockNames.planks[7]);
        registerBlock(FTContent.plankRedstone, ItemBlockPlankRedstone.class, BlockNames.planks[8]);

        registerBlock(FTContent.stairObsidian, ItemBlockStairObsidian.class, BlockNames.stairs[0]);
        registerBlock(FTContent.stairEmerald, ItemBlockStairEmerald.class, BlockNames.stairs[1]);
        registerBlock(FTContent.stairLapis, ItemBlockStairLapis.class, BlockNames.stairs[2]);
        registerBlock(FTContent.stairBronze, ItemBlockStairBronze.class, BlockNames.stairs[3]);
        registerBlock(FTContent.stairCoal, ItemBlockStairCoal.class, BlockNames.stairs[4]);
        registerBlock(FTContent.stairGlowstone, ItemBlockStairGlowstone.class, BlockNames.stairs[5]);
        registerBlock(FTContent.stairAdamantium, ItemBlockStairAdamantium.class, BlockNames.stairs[6]);
        registerBlock(FTContent.stairSilk, ItemBlockStairSilk.class, BlockNames.stairs[7]);
        registerBlock(FTContent.stairRedstone, ItemBlockStairRedstone.class, BlockNames.stairs[8]);

        registerBlock(FTContent.slabObsidianSingle, BlockNames.slabSingle[0]);
        registerBlock(FTContent.slabEmeraldSingle, BlockNames.slabSingle[1]);
        registerBlock(FTContent.slabLapisSingle, BlockNames.slabSingle[2]);
        registerBlock(FTContent.slabBronzeSingle, BlockNames.slabSingle[3]);
        registerBlock(FTContent.slabCoalSingle, BlockNames.slabSingle[4]);
        registerBlock(FTContent.slabGlowstoneSingle, BlockNames.slabSingle[5]);
        registerBlock(FTContent.slabAdamantiumSingle, BlockNames.slabSingle[6]);
        registerBlock(FTContent.slabSilkSingle, BlockNames.slabSingle[7]);
        registerBlock(FTContent.slabRedstoneSingle, BlockNames.slabSingle[8]);

        registerBlock(FTContent.slabObsidianDouble, BlockNames.slabDouble[0]);
        registerBlock(FTContent.slabEmeraldDouble, BlockNames.slabDouble[1]);
        registerBlock(FTContent.slabLapisDouble, BlockNames.slabDouble[2]);
        registerBlock(FTContent.slabBronzeDouble, BlockNames.slabDouble[3]);
        registerBlock(FTContent.slabCoalDouble, BlockNames.slabDouble[4]);
        registerBlock(FTContent.slabGlowstoneDouble, BlockNames.slabDouble[5]);
        registerBlock(FTContent.slabAdamantiumDouble, BlockNames.slabDouble[6]);
        registerBlock(FTContent.slabSilkDouble, BlockNames.slabDouble[7]);
        registerBlock(FTContent.slabRedstoneDouble, BlockNames.slabDouble[8]);

        registerBlock(FTContent.leavesObsidian, BlockNames.leaves[0]);
        registerBlock(FTContent.leavesEmerald, BlockNames.leaves[1]);
        registerBlock(FTContent.leavesLapis, BlockNames.leaves[2]);
        registerBlock(FTContent.leavesBronze, BlockNames.leaves[3]);
        registerBlock(FTContent.leavesCoal, BlockNames.leaves[4]);
        registerBlock(FTContent.leavesGlowstone, BlockNames.leaves[5]);
        registerBlock(FTContent.leavesAdamantium, BlockNames.leaves[6]);
        registerBlock(FTContent.leavesSilk, BlockNames.leaves[7]);
        registerBlock(FTContent.leavesRedstone, BlockNames.leaves[8]);

        registerBlock(FTContent.saplingObsidian, BlockNames.saplings[0]);
        registerBlock(FTContent.saplingEmerald, BlockNames.saplings[1]);
        registerBlock(FTContent.saplingLapis, BlockNames.saplings[2]);
        registerBlock(FTContent.saplingBronze, BlockNames.saplings[3]);
        registerBlock(FTContent.saplingCoal, BlockNames.saplings[4]);
        registerBlock(FTContent.saplingGlowstone, BlockNames.saplings[5]);
        registerBlock(FTContent.saplingAdamantium, BlockNames.saplings[6]);
        registerBlock(FTContent.saplingSilk, BlockNames.saplings[7]);
        registerBlock(FTContent.saplingRedstone, BlockNames.saplings[8]);

        registerBlock(FTContent.fergoWorkbench, ItemBlockFergoWorkbench.class, BlockNames.fergoWorkbench);
        registerBlock(FTContent.blockFergoGlass, ItemBlockFergoGlass.class, BlockNames.blockFergoGlass);
    }

    /*
    uses the GameRegistry to register blocks
    this is used to register blocks that has
    an ItemBlock class attached to it
     */
    public static void registerBlock(Block block, Class<? extends ItemBlock> ibClass, String name)
    {
        GameRegistry.registerBlock(block, ibClass, name);
    }

    /*
    uses the GameRegistry to register blocks
    this is used to register blocks that do not have
    an ItemBlock class attached to them.
     */
    public static void registerBlock(Block block, String name)
    {
        GameRegistry.registerBlock(block, name);
    }
}
