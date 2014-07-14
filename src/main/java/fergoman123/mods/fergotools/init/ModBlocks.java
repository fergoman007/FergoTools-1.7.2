package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.block.BlockFergoGlass;
import fergoman123.mods.fergotools.block.furnace.*;
import fergoman123.mods.fergotools.block.ore.*;
import fergoman123.mods.fergotools.block.storage.*;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

public class ModBlocks{
    
	public static void init()
	{
        RegisterHelper.registerBlock(BlockOreExperience.instance, Names.Blocks.oreExperience);
        RegisterHelper.registerBlock(BlockOreObsidian.instance, Names.Blocks.oreObsidian);
        RegisterHelper.registerBlock(BlockOreEmeraldCrystal.instance, Names.Blocks.oreEmeraldCrystal);
        RegisterHelper.registerBlock(BlockOreLapisCrystal.instance, Names.Blocks.oreLapisCrystal);
        RegisterHelper.registerBlock(BlockOreBronze.instance, Names.Blocks.oreBronze);
        RegisterHelper.registerBlock(BlockOreAdamantium.instance, Names.Blocks.oreAdamantium);
        RegisterHelper.registerBlock(BlockOreRedstoneCrystal.instance, Names.Blocks.oreRedstoneCrystal);

        RegisterHelper.registerBlock(BlockExperience.instance, Names.Blocks.blockExperience);
        RegisterHelper.registerBlock(BlockObsidianStorage.instance, Names.Blocks.blockObsidian);
        RegisterHelper.registerBlock(BlockEmeraldCrystal.instance, Names.Blocks.blockEmeraldCrystal);
        RegisterHelper.registerBlock(BlockLapisCrystal.instance, Names.Blocks.blockLapisCrystal);
        RegisterHelper.registerBlock(BlockBronze.instance, Names.Blocks.blockBronze);
        RegisterHelper.registerBlock(BlockCoalStorage.instance, Names.Blocks.blockCoal);
        RegisterHelper.registerBlock(BlockGlowstoneStorage.instance, Names.Blocks.blockGlowstone);
        RegisterHelper.registerBlock(BlockAdamantium.instance, Names.Blocks.blockAdamantium);
        RegisterHelper.registerBlock(BlockSilkGem.instance, Names.Blocks.blockSilkGem);
        RegisterHelper.registerBlock(BlockRedstoneCrystal.instance, Names.Blocks.blockRedstoneCrystal);

        RegisterHelper.registerBlock(BlockFergoGlass.instance, Names.Blocks.blockFergoGlass);

        RegisterHelper.registerBlock(BlockQuartzFurnace.instanceIdle, Names.Blocks.quartzFurnaceIdle);
        RegisterHelper.registerBlock(BlockObsidianFurnace.instanceIdle, Names.Blocks.obsidianFurnaceIdle);
        RegisterHelper.registerBlock(BlockEmeraldCrystalFurnace.instanceIdle, Names.Blocks.emeraldCrystalFurnaceIdle);
        RegisterHelper.registerBlock(BlockLapisCrystalFurnace.instanceIdle, Names.Blocks.lapisCrystalFurnaceIdle);
        RegisterHelper.registerBlock(BlockBronzeFurnace.instanceIdle, Names.Blocks.bronzeFurnaceIdle);
        RegisterHelper.registerBlock(BlockCoalFurnace.instanceIdle, Names.Blocks.coalFurnaceIdle);
        RegisterHelper.registerBlock(BlockGlowstoneFurnace.instanceIdle, Names.Blocks.glowstoneFurnaceIdle);
        RegisterHelper.registerBlock(BlockAdamantiumFurnace.instanceIdle, Names.Blocks.adamantiumFurnaceIdle);
        RegisterHelper.registerBlock(BlockSilkFurnace.instanceIdle, Names.Blocks.silkFurnaceIdle);
        RegisterHelper.registerBlock(BlockRedstoneFurnace.instanceIdle, Names.Blocks.redstoneFurnaceIdle);
        RegisterHelper.registerBlock(BlockMacerator.instanceIdle, Names.Blocks.maceratorIdle);

        RegisterHelper.registerBlock(BlockQuartzFurnace.instanceActive, Names.Blocks.quartzFurnaceActive);
        RegisterHelper.registerBlock(BlockObsidianFurnace.instanceActive, Names.Blocks.obsidianFurnaceActive);
        RegisterHelper.registerBlock(BlockEmeraldCrystalFurnace.instanceActive, Names.Blocks.emeraldCrystalFurnaceActive);
        RegisterHelper.registerBlock(BlockLapisCrystalFurnace.instanceActive, Names.Blocks.lapisCrystalFurnaceActive);
        RegisterHelper.registerBlock(BlockBronzeFurnace.instanceActive, Names.Blocks.bronzeFurnaceActive);
        RegisterHelper.registerBlock(BlockCoalFurnace.instanceActive, Names.Blocks.coalFurnaceActive);
        RegisterHelper.registerBlock(BlockGlowstoneFurnace.instanceActive, Names.Blocks.glowstoneFurnaceActive);
        RegisterHelper.registerBlock(BlockAdamantiumFurnace.instanceActive, Names.Blocks.adamantiumFurnaceActive);
        RegisterHelper.registerBlock(BlockSilkFurnace.instanceActive, Names.Blocks.silkFurnaceActive);
        RegisterHelper.registerBlock(BlockRedstoneFurnace.instanceActive, Names.Blocks.redstoneFurnaceActive);
        RegisterHelper.registerBlock(BlockMacerator.instanceActive, Names.Blocks.maceratorActive);
	}


}