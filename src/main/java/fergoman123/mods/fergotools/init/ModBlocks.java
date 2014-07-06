package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.block.BlockFergoGlass;
import fergoman123.mods.fergotools.block.furnace.*;
import fergoman123.mods.fergotools.block.ore.*;
import fergoman123.mods.fergotools.block.storage.*;
import fergoman123.mods.fergotools.lib.strings.BlockStrings;
import fergoman123.mods.fergotools.lib.strings.FurnaceStrings;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

public class ModBlocks{
    
	public static void init()
	{
        RegisterHelper.registerBlock(BlockOreExperience.instance, BlockStrings.oreExperience);
        RegisterHelper.registerBlock(BlockOreObsidian.instance, BlockStrings.oreObsidian);
        RegisterHelper.registerBlock(BlockOreEmeraldCrystal.instance, BlockStrings.oreEmeraldCrystal);
        RegisterHelper.registerBlock(BlockOreLapisCrystal.instance, BlockStrings.oreLapisCrystal);
        RegisterHelper.registerBlock(BlockOreBronze.instance, BlockStrings.oreBronze);
        RegisterHelper.registerBlock(BlockOreAdamantium.instance, BlockStrings.oreAdamantium);
        RegisterHelper.registerBlock(BlockOreRedstoneCrystal.instance, BlockStrings.oreRedstoneCrystal);

        RegisterHelper.registerBlock(BlockExperience.instance, BlockStrings.blockExperience);
        RegisterHelper.registerBlock(BlockObsidianStorage.instance, BlockStrings.blockObsidian);
        RegisterHelper.registerBlock(BlockEmeraldCrystal.instance, BlockStrings.blockEmeraldCrystal);
        RegisterHelper.registerBlock(BlockLapisCrystal.instance, BlockStrings.blockLapisCrystal);
        RegisterHelper.registerBlock(BlockBronze.instance, BlockStrings.blockBronze);
        RegisterHelper.registerBlock(BlockCoalStorage.instance, BlockStrings.blockCoal);
        RegisterHelper.registerBlock(BlockGlowstoneStorage.instance, BlockStrings.blockGlowstone);
        RegisterHelper.registerBlock(BlockAdamantium.instance, BlockStrings.blockAdamantium);
        RegisterHelper.registerBlock(BlockSilkGem.instance, BlockStrings.blockSilkGem);
        RegisterHelper.registerBlock(BlockRedstoneCrystal.instance, BlockStrings.blockRedstoneCrystal);

        RegisterHelper.registerBlock(BlockFergoGlass.instance, "blockFergoGlass");

        RegisterHelper.registerBlock(BlockQuartzFurnace.instanceIdle, FurnaceStrings.quartzFurnaceIdle);
        RegisterHelper.registerBlock(BlockObsidianFurnace.instanceIdle, FurnaceStrings.obsidianFurnaceIdle);
        RegisterHelper.registerBlock(BlockEmeraldCrystalFurnace.instanceIdle, FurnaceStrings.emeraldCrystalFurnaceIdle);
        RegisterHelper.registerBlock(BlockLapisCrystalFurnace.instanceIdle, FurnaceStrings.lapisCrystalFurnaceIdle);
        RegisterHelper.registerBlock(BlockBronzeFurnace.instanceIdle, FurnaceStrings.bronzeFurnaceIdle);
        RegisterHelper.registerBlock(BlockCoalFurnace.instanceIdle, FurnaceStrings.coalFurnaceIdle);
        RegisterHelper.registerBlock(BlockGlowstoneFurnace.instanceIdle, FurnaceStrings.glowstoneFurnaceIdle);
        RegisterHelper.registerBlock(BlockAdamantiumFurnace.instanceIdle, FurnaceStrings.adamantiumFurnaceIdle);
        RegisterHelper.registerBlock(BlockSilkFurnace.instanceIdle, FurnaceStrings.silkFurnaceIdle);
        RegisterHelper.registerBlock(BlockRedstoneFurnace.instanceIdle, FurnaceStrings.redstoneFurnaceIdle);
        RegisterHelper.registerBlock(BlockMacerator.instanceIdle, FurnaceStrings.maceratorIdle);

        RegisterHelper.registerBlock(BlockQuartzFurnace.instanceActive, FurnaceStrings.quartzFurnaceActive);
        RegisterHelper.registerBlock(BlockObsidianFurnace.instanceActive, FurnaceStrings.obsidianFurnaceActive);
        RegisterHelper.registerBlock(BlockEmeraldCrystalFurnace.instanceActive, FurnaceStrings.emeraldCrystalFurnaceActive);
        RegisterHelper.registerBlock(BlockLapisCrystalFurnace.instanceActive, FurnaceStrings.lapisCrystalFurnaceActive);
        RegisterHelper.registerBlock(BlockBronzeFurnace.instanceActive, FurnaceStrings.bronzeFurnaceActive);
        RegisterHelper.registerBlock(BlockCoalFurnace.instanceActive, FurnaceStrings.coalFurnaceActive);
        RegisterHelper.registerBlock(BlockGlowstoneFurnace.instanceActive, FurnaceStrings.glowstoneFurnaceActive);
        RegisterHelper.registerBlock(BlockAdamantiumFurnace.instanceActive, FurnaceStrings.adamantiumFurnaceActive);
        RegisterHelper.registerBlock(BlockSilkFurnace.instanceActive, FurnaceStrings.silkFurnaceActive);
        RegisterHelper.registerBlock(BlockRedstoneFurnace.instanceActive, FurnaceStrings.redstoneFurnaceActive);
        RegisterHelper.registerBlock(BlockMacerator.instanceActive, FurnaceStrings.maceratorActive);
	}


}