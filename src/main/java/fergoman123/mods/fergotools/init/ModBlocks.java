package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.block.BlockFergoGlass;

import fergoman123.mods.fergotools.creativetab.CreativeTabsFergoTools;
import fergoman123.mods.fergotools.furnaces.AdamantiumFurnace.BlockAdamantiumFurnace;
import fergoman123.mods.fergotools.furnaces.BronzeFurnace.BlockBronzeFurnace;
import fergoman123.mods.fergotools.furnaces.CoalFurnace.BlockCoalFurnace;
import fergoman123.mods.fergotools.furnaces.EmeraldFurnace.BlockEmeraldFurnace;
import fergoman123.mods.fergotools.furnaces.GlowstoneFurnace.BlockGlowstoneFurnace;
import fergoman123.mods.fergotools.furnaces.LapisFurnace.BlockLapisFurnace;
import fergoman123.mods.fergotools.furnaces.Macerator.BlockMacerator;
import fergoman123.mods.fergotools.furnaces.ObsidianFurnace.BlockObsidianFurnace;
import fergoman123.mods.fergotools.furnaces.QuartzFurnace.BlockQuartzFurnace;
import fergoman123.mods.fergotools.furnaces.RedstoneFurnace.BlockRedstoneFurnace;
import fergoman123.mods.fergotools.furnaces.SilkFurnace.BlockSilkFurnace;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockFT;
import fergoman123.mods.fergotools.util.base.BlockGlassFT;
import fergoman123.mods.fergoutil.helper.RegisterHelper;
import net.minecraft.block.Block;
import fergoman123.mods.fergotools.block.FergoOres.*;
import fergoman123.mods.fergotools.block.FergoStorageBlocks.*;

public class ModBlocks{

    public static final BlockFT oreExperience = new BlockOreExperience();
    public static final BlockFT oreObsidian = new BlockOreObsidian();
    public static final BlockFT oreEmeraldCrystal = new BlockOreEmeraldCrystal();
    public static final BlockFT oreLapisCrystal = new BlockOreLapisCrystal();
    public static final BlockFT oreBronze = new BlockOreBronze();
    public static final BlockFT oreAdamantium = new BlockOreAdamantium();
    public static final BlockFT oreCrystalRed = new BlockOreRedCrystal();

    public static final BlockFT blockExperience = new BlockExperience();
    public static final BlockFT blockObsidian = new BlockObsidianStorage();
    public static final BlockFT blockEmeraldCrystal = new BlockEmeraldCrystal();
    public static final BlockFT blockLapisCrystal = new BlockLapisCrystal();
    public static final BlockFT blockBronze = new BlockBronze();
    public static final BlockFT blockCoal = new BlockCoalStorage();
    public static final BlockFT blockGlowstone = new BlockGlowstoneStorage();
    public static final BlockFT blockAdamantium = new BlockAdamantium();
    public static final BlockFT blockSilkGem = new BlockSilkGem();
    public static final BlockFT blockRedstoneCrystal = new BlockRedstoneCrystal();

    public static final BlockGlassFT blockFergoGlass = new BlockFergoGlass();

    public static final Block quartzFurnaceIdle = new BlockQuartzFurnace(false);
    public static final Block obsidianFurnaceIdle = new BlockObsidianFurnace(false);
    public static final Block emeraldFurnaceIdle = new BlockEmeraldFurnace(false);
    public static final Block lapisFurnaceIdle = new BlockLapisFurnace(false);
    public static final Block bronzeFurnaceIdle = new BlockBronzeFurnace(false);
    public static final Block coalFurnaceIdle = new BlockCoalFurnace(false);
    public static final Block glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false);
    public static final Block adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false);
    public static final Block silkFurnaceIdle = new BlockSilkFurnace(false);
    public static final Block redstoneFurnaceIdle = new BlockRedstoneFurnace(false);
    public static final Block maceratorIdle = new BlockMacerator(false);

    public static final Block quartzFurnaceActive = new BlockQuartzFurnace(true);
    public static final Block obsidianFurnaceActive = new BlockObsidianFurnace(true);
    public static final Block emeraldFurnaceActive = new BlockEmeraldFurnace(true);
    public static final Block lapisFurnaceActive = new BlockLapisFurnace(true);
    public static final Block bronzeFurnaceActive = new BlockBronzeFurnace(true);
    public static final Block coalFurnaceActive = new BlockCoalFurnace(true);
    public static final Block glowstoneFurnaceActive = new BlockGlowstoneFurnace(true);
    public static final Block adamantiumFurnaceActive = new BlockAdamantiumFurnace(true);
    public static final Block silkFurnaceActive = new BlockSilkFurnace(true);
    public static final Block redstoneFurnaceActive = new BlockRedstoneFurnace(true);
    public static final Block maceratorActive = new BlockMacerator(true);

	public static void init()
	{
        RegisterHelper.registerBlock(oreExperience, Names.Blocks.oreExperience);
        RegisterHelper.registerBlock(oreObsidian, Names.Blocks.oreObsidian);
        RegisterHelper.registerBlock(oreEmeraldCrystal, Names.Blocks.oreEmeraldCrystal);
        RegisterHelper.registerBlock(oreLapisCrystal, Names.Blocks.oreLapisCrystal);
        RegisterHelper.registerBlock(oreBronze, Names.Blocks.oreBronze);
        RegisterHelper.registerBlock(oreAdamantium, Names.Blocks.oreAdamantium);
        RegisterHelper.registerBlock(oreCrystalRed, Names.Blocks.oreCrystalRed);

        RegisterHelper.registerBlock(blockExperience, Names.Blocks.blockExperience);
        RegisterHelper.registerBlock(blockObsidian, Names.Blocks.blockObsidian);
        RegisterHelper.registerBlock(blockEmeraldCrystal, Names.Blocks.blockEmeraldCrystal);
        RegisterHelper.registerBlock(blockLapisCrystal, Names.Blocks.blockLapisCrystal);
        RegisterHelper.registerBlock(blockBronze, Names.Blocks.blockBronze);
        RegisterHelper.registerBlock(blockCoal, Names.Blocks.blockCoal);
        RegisterHelper.registerBlock(blockGlowstone, Names.Blocks.blockGlowstone);
        RegisterHelper.registerBlock(blockAdamantium, Names.Blocks.blockAdamantium);
        RegisterHelper.registerBlock(blockSilkGem, Names.Blocks.blockSilkGem);
        RegisterHelper.registerBlock(blockRedstoneCrystal, Names.Blocks.blockRedstoneCrystal);

        RegisterHelper.registerBlock(blockFergoGlass, Names.Blocks.blockFergoGlass);

        RegisterHelper.registerBlock(quartzFurnaceIdle, Names.Blocks.quartzFurnaceIdle);
        RegisterHelper.registerBlock(obsidianFurnaceIdle, Names.Blocks.obsidianFurnaceIdle);
        RegisterHelper.registerBlock(emeraldFurnaceIdle, Names.Blocks.emeraldFurnaceIdle);
        RegisterHelper.registerBlock(lapisFurnaceIdle, Names.Blocks.lapisFurnaceIdle);
        RegisterHelper.registerBlock(bronzeFurnaceIdle, Names.Blocks.bronzeFurnaceIdle);
        RegisterHelper.registerBlock(coalFurnaceIdle, Names.Blocks.coalFurnaceIdle);
        RegisterHelper.registerBlock(glowstoneFurnaceIdle, Names.Blocks.glowstoneFurnaceIdle);
        RegisterHelper.registerBlock(adamantiumFurnaceIdle, Names.Blocks.adamantiumFurnaceIdle);
        RegisterHelper.registerBlock(silkFurnaceIdle, Names.Blocks.silkFurnaceIdle);
        RegisterHelper.registerBlock(redstoneFurnaceIdle, Names.Blocks.redstoneFurnaceIdle);
        RegisterHelper.registerBlock(maceratorIdle, Names.Blocks.maceratorIdle);

        RegisterHelper.registerBlock(quartzFurnaceActive, Names.Blocks.quartzFurnaceActive);
        RegisterHelper.registerBlock(obsidianFurnaceActive, Names.Blocks.obsidianFurnaceActive);
        RegisterHelper.registerBlock(emeraldFurnaceActive, Names.Blocks.emeraldFurnaceActive);
        RegisterHelper.registerBlock(lapisFurnaceActive, Names.Blocks.lapisFurnaceActive);
        RegisterHelper.registerBlock(bronzeFurnaceActive, Names.Blocks.bronzeFurnaceActive);
        RegisterHelper.registerBlock(coalFurnaceActive, Names.Blocks.coalFurnaceActive);
        RegisterHelper.registerBlock(glowstoneFurnaceActive, Names.Blocks.glowstoneFurnaceActive);
        RegisterHelper.registerBlock(adamantiumFurnaceActive, Names.Blocks.adamantiumFurnaceActive);
        RegisterHelper.registerBlock(silkFurnaceActive, Names.Blocks.silkFurnaceActive);
        RegisterHelper.registerBlock(redstoneFurnaceActive, Names.Blocks.redstoneFurnaceActive);
        RegisterHelper.registerBlock(maceratorActive, Names.Blocks.maceratorActive);
	}


}