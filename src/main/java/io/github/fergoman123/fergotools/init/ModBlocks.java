package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.block.FTStairs;
import io.github.fergoman123.fergotools.furnaces.AdamantiumFurnace.BlockAdamantiumFurnace;
import io.github.fergoman123.fergotools.furnaces.BronzeFurnace.BlockBronzeFurnace;
import io.github.fergoman123.fergotools.furnaces.CoalFurnace.BlockCoalFurnace;
import io.github.fergoman123.fergotools.furnaces.EmeraldFurnace.BlockEmeraldFurnace;
import io.github.fergoman123.fergotools.furnaces.GlowstoneFurnace.BlockGlowstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.LapisFurnace.BlockLapisFurnace;
import io.github.fergoman123.fergotools.furnaces.Macerator.BlockMacerator;
import io.github.fergoman123.fergotools.furnaces.ObsidianFurnace.BlockObsidianFurnace;
import io.github.fergoman123.fergotools.furnaces.QuartzFurnace.BlockQuartzFurnace;
import io.github.fergoman123.fergotools.furnaces.RedstoneFurnace.BlockRedstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.SilkFurnace.BlockSilkFurnace;
import io.github.fergoman123.fergotools.init.FTBlocks.*;
import io.github.fergoman123.fergotools.init.ItemBlocks.*;
import io.github.fergoman123.fergotools.workbenches.AdamantiumWorkbench.BlockAdamantiumWorkbench;
import io.github.fergoman123.fergotools.workbenches.BronzeWorkbench.BlockBronzeWorkbench;
import io.github.fergoman123.fergotools.workbenches.CoalWorkbench.BlockCoalWorkbench;
import io.github.fergoman123.fergotools.workbenches.EmeraldWorkbench.BlockEmeraldWorkbench;
import io.github.fergoman123.fergotools.workbenches.GlowstoneWorkbench.BlockGlowstoneWorkbench;
import io.github.fergoman123.fergotools.workbenches.LapisWorkbench.BlockLapisWorkbench;
import io.github.fergoman123.fergotools.workbenches.ObsidianWorkbench.BlockObsidianWorkbench;
import io.github.fergoman123.fergotools.workbenches.RedstoneWorkbench.BlockRedstoneWorkbench;
import io.github.fergoman123.fergotools.workbenches.SilkWorkbench.BlockSilkWorkbench;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;

public class ModBlocks{
	public static void init()
	{
        RegisterHelper.registerBlock(BlockOreObsidian.instance, ItemBlockOreObsidian.class);
        RegisterHelper.registerBlock(BlockOreEmeraldCrystal.instance, ItemBlockOreEmerald.class);
        RegisterHelper.registerBlock(BlockOreLapisCrystal.instance, ItemBlockOreLapis.class);
        RegisterHelper.registerBlock(BlockOreBronze.instance, ItemBlockOreBronze.class);
        RegisterHelper.registerBlock(BlockOreAdamantium.instance, ItemBlockOreAdamantium.class);
        RegisterHelper.registerBlock(BlockOreRedCrystal.instance, ItemBlockOreCrystalRed.class);

        RegisterHelper.registerBlock(BlockObsidianStorage.instance, ItemBlockObsidian.class);
        RegisterHelper.registerBlock(BlockEmeraldCrystal.instance, ItemBlockEmerald.class);
        RegisterHelper.registerBlock(BlockLapisCrystal.instance, ItemBlockLapis.class);
        RegisterHelper.registerBlock(BlockBronze.instance, ItemBlockBronze.class);
        RegisterHelper.registerBlock(BlockCoalStorage.instance, ItemBlockCoal.class);
        RegisterHelper.registerBlock(BlockGlowstoneStorage.instance, ItemBlockGlowstone.class);
        RegisterHelper.registerBlock(BlockAdamantium.instance, ItemBlockAdamantium.class);
        RegisterHelper.registerBlock(BlockSilkGem.instance, ItemBlockSilkGem.class);
        RegisterHelper.registerBlock(BlockRedstoneCrystal.instance, ItemBlockRedstoneCrystal.class);

        RegisterHelper.registerBlock(BlockFergoGlass.instance);

        RegisterHelper.registerBlock(BlockQuartzFurnace.instanceIdle, ItemBlockQuartzFurnaceIdle.class);
        RegisterHelper.registerBlock(BlockObsidianFurnace.instanceIdle, ItemBlockObsidianFurnaceIdle.class);
        RegisterHelper.registerBlock(BlockEmeraldFurnace.instanceIdle, ItemBlockEmeraldFurnaceIdle.class);
        RegisterHelper.registerBlock(BlockLapisFurnace.instanceIdle, ItemBlockLapisFurnaceIdle.class);
        RegisterHelper.registerBlock(BlockBronzeFurnace.instanceIdle, ItemBlockBronzeFurnaceIdle.class);
        RegisterHelper.registerBlock(BlockCoalFurnace.instanceIdle, ItemBlockCoalFurnaceIdle.class);
        RegisterHelper.registerBlock(BlockGlowstoneFurnace.instanceIdle, ItemBlockGlowstoneFurnaceIdle.class);
        RegisterHelper.registerBlock(BlockAdamantiumFurnace.instanceIdle, ItemBlockAdamantiumFurnaceIdle.class);
        RegisterHelper.registerBlock(BlockSilkFurnace.instanceIdle, ItemBlockSilkFurnaceIdle.class);
        RegisterHelper.registerBlock(BlockRedstoneFurnace.instanceIdle, ItemBlockRedstoneFurnaceIdle.class);
        RegisterHelper.registerBlock(BlockMacerator.instanceIdle, ItemBlockMaceratorIdle.class);

        RegisterHelper.registerBlock(BlockQuartzFurnace.instanceActive, ItemBlockQuartzFurnaceActive.class);
        RegisterHelper.registerBlock(BlockObsidianFurnace.instanceActive, ItemBlockObsidianFurnaceActive.class);
        RegisterHelper.registerBlock(BlockEmeraldFurnace.instanceActive, ItemBlockEmeraldFurnaceActive.class);
        RegisterHelper.registerBlock(BlockLapisFurnace.instanceActive, ItemBlockLapisFurnaceActive.class);
        RegisterHelper.registerBlock(BlockBronzeFurnace.instanceActive, ItemBlockBronzeFurnaceActive.class);
        RegisterHelper.registerBlock(BlockCoalFurnace.instanceActive, ItemBlockCoalFurnaceActive.class);
        RegisterHelper.registerBlock(BlockGlowstoneFurnace.instanceActive, ItemBlockGlowstoneFurnaceActive.class);
        RegisterHelper.registerBlock(BlockAdamantiumFurnace.instanceActive, ItemBlockAdamantiumFurnaceActive.class);
        RegisterHelper.registerBlock(BlockSilkFurnace.instanceActive, ItemBlockSilkFurnaceActive.class);
        RegisterHelper.registerBlock(BlockRedstoneFurnace.instanceActive, ItemBlockRedstoneFurnaceActive.class);
        RegisterHelper.registerBlock(BlockMacerator.instanceActive, ItemBlockMaceratorActive.class);

        RegisterHelper.registerBlock(BlockLogObsidian.instance, ItemBlockLogObsidian.class);
        RegisterHelper.registerBlock(BlockLogEmerald.instance, ItemBlockLogEmerald.class);
        RegisterHelper.registerBlock(BlockLogLapis.instance, ItemBlockLogLapis.class);
        RegisterHelper.registerBlock(BlockLogBronze.instance, ItemBlockLogBronze.class);
        RegisterHelper.registerBlock(BlockLogCoal.instance, ItemBlockLogCoal.class);
        RegisterHelper.registerBlock(BlockLogGlowstone.instance, ItemBlockLogGlowstone.class);
        RegisterHelper.registerBlock(BlockLogAdamantium.instance, ItemBlockLogAdamantium.class);
        RegisterHelper.registerBlock(BlockLogSilk.instance, ItemBlockLogSilk.class);
        RegisterHelper.registerBlock(BlockLogRedstone.instance, ItemBlockLogRedstone.class);

        RegisterHelper.registerBlock(BlockPlankObsidian.instance, ItemBlockPlankObsidian.class);
        RegisterHelper.registerBlock(BlockPlankEmerald.instance, ItemBlockPlankEmerald.class);
        RegisterHelper.registerBlock(BlockPlankLapis.instance, ItemBlockPlankLapis.class);
        RegisterHelper.registerBlock(BlockPlankBronze.instance, ItemBlockPlankBronze.class);
        RegisterHelper.registerBlock(BlockPlankCoal.instance, ItemBlockPlankCoal.class);
        RegisterHelper.registerBlock(BlockPlankGlowstone.instance, ItemBlockPlankGlowstone.class);
        RegisterHelper.registerBlock(BlockPlankAdamantium.instance, ItemBlockPlankAdamantium.class);
        RegisterHelper.registerBlock(BlockPlankSilk.instance, ItemBlockPlankSilk.class);
        RegisterHelper.registerBlock(BlockPlankRedstone.instance, ItemBlockPlankRedstone.class);

        RegisterHelper.registerBlock(FTStairs.stairObsidian, ItemBlockStairObsidian.class);
        RegisterHelper.registerBlock(FTStairs.stairEmerald, ItemBlockStairEmerald.class);
        RegisterHelper.registerBlock(FTStairs.stairLapis, ItemBlockStairLapis.class);
        RegisterHelper.registerBlock(FTStairs.stairBronze, ItemBlockStairBronze.class);
        RegisterHelper.registerBlock(FTStairs.stairCoal, ItemBlockStairCoal.class);
        RegisterHelper.registerBlock(FTStairs.stairGlowstone, ItemBlockStairGlowstone.class);
        RegisterHelper.registerBlock(FTStairs.stairAdamantium, ItemBlockStairAdamantium.class);
        RegisterHelper.registerBlock(FTStairs.stairSilk, ItemBlockStairSilk.class);
        RegisterHelper.registerBlock(FTStairs.stairRedstone, ItemBlockStairRedstone.class);


        RegisterHelper.registerBlock(BlockObsidianWorkbench.instance);
        RegisterHelper.registerBlock(BlockEmeraldWorkbench.instance);
        RegisterHelper.registerBlock(BlockLapisWorkbench.instance);
        RegisterHelper.registerBlock(BlockBronzeWorkbench.instance);
        RegisterHelper.registerBlock(BlockCoalWorkbench.instance);
        RegisterHelper.registerBlock(BlockGlowstoneWorkbench.instance);
        RegisterHelper.registerBlock(BlockAdamantiumWorkbench.instance);
        RegisterHelper.registerBlock(BlockSilkWorkbench.instance);
        RegisterHelper.registerBlock(BlockRedstoneWorkbench.instance);
    }
}