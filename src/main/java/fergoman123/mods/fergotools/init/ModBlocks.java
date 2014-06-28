package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.block.furnace.*;
import fergoman123.mods.fergotools.block.ore.*;
import fergoman123.mods.fergotools.block.storage.*;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.lib.Strings.FurnaceStrings;
import fergoman123.mods.fergotools.util.BlockFT;
import fergoman123.mods.fergoutil.helper.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks{

    public static final BlockFT oreObsidian = BlockOreObsidian.instance;
    public static final BlockFT oreEmeraldCrystal = BlockOreEmeraldCrystal.instance;
    public static final BlockFT oreLapisCrystal = BlockOreLapisCrystal.instance;
    public static final BlockFT oreBronze = BlockOreBronze.instance;
    public static final BlockFT oreAdamantium = BlockOreAdamantium.instance;
    public static final BlockFT oreExperience = BlockOreExperience.instance;
    public static final BlockFT oreRedstoneCrystal = BlockOreRedstoneCrystal.instance;

    public static final BlockFT blockExperience = BlockExperience.instance;
    public static final BlockFT blockObsidian = BlockObsidianStorage.instance;
    public static final BlockFT blockEmeraldCrystal = BlockEmeraldCrystal.instance;
    public static final BlockFT blockLapisCrystal = BlockLapisCrystal.instance;
    public static final BlockFT blockBronze = BlockBronze.instance;
    public static final BlockFT blockCoal = BlockCoalStorage.instance;
    public static final BlockFT blockGlowstone = BlockGlowstoneStorage.instance;
    public static final BlockFT blockAdamantium = BlockAdamantium.instance;
    public static final BlockFT blockSilkGem = BlockSilkGem.instance;
    public static final BlockFT blockRedstoneCrystal = BlockRedstoneCrystal.instance;

    public static final Block quartzFurnaceIdle = BlockQuartzFurnace.instanceIdle;
    public static final Block obsidianFurnaceIdle = BlockObsidianFurnace.instanceIdle;
    public static final Block emeraldCrystalFurnaceIdle = BlockEmeraldCrystalFurnace.instanceIdle;
    public static final Block lapisCrystalFurnaceIdle = BlockLapisCrystalFurnace.instanceIdle;
    public static final Block bronzeFurnaceIdle = BlockBronzeFurnace.instanceIdle;
    public static final Block coalFurnaceIdle = BlockCoalFurnace.instanceIdle;
    public static final Block glowstoneFurnaceIdle = BlockGlowstoneFurnace.instanceIdle;
    public static final Block adamantiumFurnaceIdle = BlockAdamantiumFurnace.instanceIdle;
    public static final Block silkFurnaceIdle = BlockSilkFurnace.instanceIdle;
    public static final Block redstoneFurnaceIdle = BlockRedstoneFurnace.instanceIdle;
    public static final Block maceratorIdle = BlockMacerator.instanceIdle;

    public static final Block quartzFurnaceActive = BlockQuartzFurnace.instanceActive;
    public static final Block obsidianFurnaceActive = BlockObsidianFurnace.instanceActive;
    public static final Block emeraldCrystalFurnaceActive = BlockEmeraldCrystalFurnace.instanceActive;
    public static final Block lapisCrystalFurnaceActive = BlockLapisCrystalFurnace.instanceActive;
    public static final Block bronzeFurnaceActive = BlockBronzeFurnace.instanceActive;
    public static final Block coalFurnaceActive = BlockCoalFurnace.instanceActive;
    public static final Block glowstoneFurnaceActive = BlockGlowstoneFurnace.instanceActive;
    public static final Block adamantiumFurnaceActive = BlockAdamantiumFurnace.instanceActive;
    public static final Block silkFurnaceActive = BlockSilkFurnace.instanceActive;
    public static final Block redstoneFurnaceActive = BlockRedstoneFurnace.instanceActive;
    public static final Block maceratorActive = BlockMacerator.instanceActive;
    
	public static void init()
	{
        RegisterHelper.registerBlock(ModBlocks.oreExperience, Strings.BlockStrings.oreExperience);
        RegisterHelper.registerBlock(ModBlocks.oreObsidian, Strings.BlockStrings.oreObsidian);
        RegisterHelper.registerBlock(ModBlocks.oreEmeraldCrystal, Strings.BlockStrings.oreEmeraldCrystal);
        RegisterHelper.registerBlock(ModBlocks.oreLapisCrystal, Strings.BlockStrings.oreLapisCrystal);
        RegisterHelper.registerBlock(ModBlocks.oreBronze, Strings.BlockStrings.oreBronze);
        RegisterHelper.registerBlock(ModBlocks.oreAdamantium, Strings.BlockStrings.oreAdamantium);
        RegisterHelper.registerBlock(ModBlocks.oreRedstoneCrystal, Strings.BlockStrings.oreRedstoneCrystal);

        RegisterHelper.registerBlock(ModBlocks.blockExperience, Strings.BlockStrings.blockExperience);
        RegisterHelper.registerBlock(ModBlocks.blockObsidian, Strings.BlockStrings.blockObsidian);
        RegisterHelper.registerBlock(ModBlocks.blockEmeraldCrystal, Strings.BlockStrings.blockEmeraldCrystal);
        RegisterHelper.registerBlock(ModBlocks.blockLapisCrystal, Strings.BlockStrings.blockLapisCrystal);
        RegisterHelper.registerBlock(ModBlocks.blockBronze, Strings.BlockStrings.blockBronze);
        RegisterHelper.registerBlock(ModBlocks.blockCoal, Strings.BlockStrings.blockCoal);
        RegisterHelper.registerBlock(ModBlocks.blockGlowstone, Strings.BlockStrings.blockGlowstone);
        RegisterHelper.registerBlock(ModBlocks.blockAdamantium, Strings.BlockStrings.blockAdamantium);
        RegisterHelper.registerBlock(ModBlocks.blockSilkGem, Strings.BlockStrings.blockSilkGem);
        RegisterHelper.registerBlock(ModBlocks.blockRedstoneCrystal, Strings.BlockStrings.blockRedstoneCrystal);

        RegisterHelper.registerBlock(ModBlocks.quartzFurnaceIdle, FurnaceStrings.quartzFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.obsidianFurnaceIdle, FurnaceStrings.obsidianFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.emeraldCrystalFurnaceIdle, FurnaceStrings.emeraldCrystalFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.lapisCrystalFurnaceIdle, FurnaceStrings.lapisCrystalFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.bronzeFurnaceIdle, FurnaceStrings.bronzeFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.coalFurnaceIdle, FurnaceStrings.coalFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.glowstoneFurnaceIdle, FurnaceStrings.glowstoneFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.adamantiumFurnaceIdle, FurnaceStrings.adamantiumFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.silkFurnaceIdle, FurnaceStrings.silkFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.redstoneFurnaceIdle, FurnaceStrings.redstoneFurnaceIdle);
        RegisterHelper.registerBlock(ModBlocks.maceratorIdle, FurnaceStrings.maceratorIdle);

        RegisterHelper.registerBlock(ModBlocks.quartzFurnaceActive, FurnaceStrings.quartzFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.obsidianFurnaceActive, FurnaceStrings.obsidianFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.emeraldCrystalFurnaceActive, FurnaceStrings.emeraldCrystalFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.lapisCrystalFurnaceActive, FurnaceStrings.lapisCrystalFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.bronzeFurnaceActive, FurnaceStrings.bronzeFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.coalFurnaceActive, FurnaceStrings.coalFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.glowstoneFurnaceActive, FurnaceStrings.glowstoneFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.adamantiumFurnaceActive, FurnaceStrings.adamantiumFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.silkFurnaceActive, FurnaceStrings.silkFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.redstoneFurnaceActive, FurnaceStrings.redstoneFurnaceActive);
        RegisterHelper.registerBlock(ModBlocks.maceratorActive, FurnaceStrings.maceratorActive);
	}


}