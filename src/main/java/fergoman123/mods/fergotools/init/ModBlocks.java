package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.block.furnace.*;
import fergoman123.mods.fergotools.block.ore.*;
import fergoman123.mods.fergotools.block.storage.*;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.lib.Strings.FurnaceStrings;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

public class ModBlocks{
    
	public static void init()
	{
        RegisterHelper.registerBlock(BlockOreExperience.instance, Strings.BlockStrings.oreExperience);
        RegisterHelper.registerBlock(BlockOreObsidian.instance, Strings.BlockStrings.oreObsidian);
        RegisterHelper.registerBlock(BlockOreEmeraldCrystal.instance, Strings.BlockStrings.oreEmeraldCrystal);
        RegisterHelper.registerBlock(BlockOreLapisCrystal.instance, Strings.BlockStrings.oreLapisCrystal);
        RegisterHelper.registerBlock(BlockOreBronze.instance, Strings.BlockStrings.oreBronze);
        RegisterHelper.registerBlock(BlockOreAdamantium.instance, Strings.BlockStrings.oreAdamantium);
        RegisterHelper.registerBlock(BlockOreRedstoneCrystal.instance, Strings.BlockStrings.oreRedstoneCrystal);

        RegisterHelper.registerBlock(BlockExperience.instance, Strings.BlockStrings.blockExperience);
        RegisterHelper.registerBlock(BlockObsidianStorage.instance, Strings.BlockStrings.blockObsidian);
        RegisterHelper.registerBlock(BlockEmeraldCrystal.instance, Strings.BlockStrings.blockEmeraldCrystal);
        RegisterHelper.registerBlock(BlockLapisCrystal.instance, Strings.BlockStrings.blockLapisCrystal);
        RegisterHelper.registerBlock(BlockBronze.instance, Strings.BlockStrings.blockBronze);
        RegisterHelper.registerBlock(BlockCoalStorage.instance, Strings.BlockStrings.blockCoal);
        RegisterHelper.registerBlock(BlockGlowstoneStorage.instance, Strings.BlockStrings.blockGlowstone);
        RegisterHelper.registerBlock(BlockAdamantium.instance, Strings.BlockStrings.blockAdamantium);
        RegisterHelper.registerBlock(BlockSilkGem.instance, Strings.BlockStrings.blockSilkGem);
        RegisterHelper.registerBlock(BlockRedstoneCrystal.instance, Strings.BlockStrings.blockRedstoneCrystal);

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