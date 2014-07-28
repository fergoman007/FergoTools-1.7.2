package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.block.BlockFergoGlass;
import fergoman123.mods.fergotools.block.furnace.*;
import fergoman123.mods.fergotools.block.ore.*;
import fergoman123.mods.fergotools.block.stairs.*;
import fergoman123.mods.fergotools.block.storage.*;
import fergoman123.mods.fergotools.creativetab.CreativeTabsFergoTools;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockFT;
import fergoman123.mods.fergotools.util.base.BlockFurnaceFT;
import fergoman123.mods.fergotools.util.base.BlockGlassFT;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;
import fergoman123.mods.fergoutil.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockStairs;

public class ModBlocks{

    public static final BlockFT oreExperience = new BlockOreExperience();
    public static final BlockFT oreObsidian = new BlockObsidianStorage();
    public static final BlockFT oreEmeraldCrystal = new BlockOreEmeraldCrystal();
    public static final BlockFT oreLapisCrystal = new BlockOreLapisCrystal();
    public static final BlockFT oreBronze = new BlockOreBronze();
    public static final BlockFT oreAdamantium = new BlockOreAdamantium();
    public static final BlockFT oreRedstoneCrystal = new BlockOreRedstoneCrystal();

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

    public static final BlockStairsFT obsidianStairs = new BlockObsidianStairs();
    public static final BlockStairsFT emeraldStairs = new BlockEmeraldStairs();
    public static final BlockStairsFT lapisStairs = new BlockLapisStairs();
    public static final BlockStairsFT bronzeStairs = new BlockBronzeStairs();
    public static final BlockStairsFT coalStairs = new BlockCoalStairs();
    public static final BlockStairsFT glowstoneStairs = new BlockGlowstoneStairs();
    public static final BlockStairsFT adamantiumStairs = new BlockAdamantiumStairs();
    public static final BlockStairsFT silkStairs = new BlockSilkStairs();
    public static final BlockStairsFT redstoneStairs = new BlockRedstoneStairs();

    public static final Block quartzFurnaceIdle = new BlockQuartzFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block obsidianFurnaceIdle = new BlockObsidianFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block emeraldFurnaceIdle = new BlockEmeraldCrystalFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block lapisFurnaceIdle = new BlockLapisCrystalFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block bronzeFurnaceIdle = new BlockBronzeFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block coalFurnaceIdle = new BlockCoalFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block silkFurnaceIdle = new BlockSilkFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block redstoneFurnaceIdle = new BlockRedstoneFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block maceratorIdle = new BlockMacerator(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);

    public static final Block quartzFurnaceActive = new BlockQuartzFurnace(true).setLightLevel(0.9f);
    public static final Block obsidianFurnaceActive = new BlockObsidianFurnace(true).setLightLevel(0.9f);
    public static final Block emeraldFurnaceActive = new BlockEmeraldCrystalFurnace(true).setLightLevel(0.9f);
    public static final Block lapisFurnaceActive = new BlockLapisCrystalFurnace(true).setLightLevel(0.9f);
    public static final Block bronzeFurnaceActive = new BlockBronzeFurnace(true).setLightLevel(0.9f);
    public static final Block coalFurnaceActive = new BlockCoalFurnace(true).setLightLevel(0.9f);
    public static final Block glowstoneFurnaceActive = new BlockGlowstoneFurnace(true).setLightLevel(0.9f);
    public static final Block adamantiumFurnaceActive = new BlockAdamantiumFurnace(true).setLightLevel(0.9f);
    public static final Block silkFurnaceActive = new BlockSilkFurnace(true).setLightLevel(0.9f);
    public static final Block redstoneFurnaceActive = new BlockRedstoneFurnace(true).setLightLevel(0.9f);
    public static final Block maceratorActive = new BlockMacerator(true).setLightLevel(0.9f);

    private static void initOre(){
        RegisterHelper.registerBlock(oreExperience, Names.Blocks.oreExperience);
        RegisterHelper.registerBlock(oreObsidian, Names.Blocks.oreObsidian);
        RegisterHelper.registerBlock(oreEmeraldCrystal, Names.Blocks.oreEmeraldCrystal);
        RegisterHelper.registerBlock(oreLapisCrystal, Names.Blocks.oreLapisCrystal);
        RegisterHelper.registerBlock(oreBronze, Names.Blocks.oreBronze);
        RegisterHelper.registerBlock(oreAdamantium, Names.Blocks.oreAdamantium);
        RegisterHelper.registerBlock(oreRedstoneCrystal, Names.Blocks.oreRedstoneCrystal);
    }

    private static void initStorageBlocks(){
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
    }

    private static void initStairs(){
        RegisterHelper.registerBlock(obsidianStairs, Names.Blocks.blockObsidianStairs);
        RegisterHelper.registerBlock(emeraldStairs, Names.Blocks.blockEmeraldStairs);
    }

    private static void initGlass()
    {
        RegisterHelper.registerBlock(blockFergoGlass, Names.Blocks.blockFergoGlass);
    }

    private static void initFurnaces()
    {
        RegisterHelper.registerBlock(quartzFurnaceIdle, Names.Blocks.quartzFurnaceIdle);
        RegisterHelper.registerBlock(obsidianFurnaceIdle, Names.Blocks.obsidianFurnaceIdle);
        RegisterHelper.registerBlock(emeraldFurnaceIdle, Names.Blocks.emeraldCrystalFurnaceIdle);
        RegisterHelper.registerBlock(lapisFurnaceIdle, Names.Blocks.lapisCrystalFurnaceIdle);
        RegisterHelper.registerBlock(bronzeFurnaceIdle, Names.Blocks.bronzeFurnaceIdle);
        RegisterHelper.registerBlock(coalFurnaceIdle, Names.Blocks.coalFurnaceIdle);
        RegisterHelper.registerBlock(glowstoneFurnaceIdle, Names.Blocks.glowstoneFurnaceIdle);
        RegisterHelper.registerBlock(adamantiumFurnaceIdle, Names.Blocks.adamantiumFurnaceIdle);
        RegisterHelper.registerBlock(silkFurnaceIdle, Names.Blocks.silkFurnaceIdle);
        RegisterHelper.registerBlock(redstoneFurnaceIdle, Names.Blocks.redstoneFurnaceIdle);
        RegisterHelper.registerBlock(maceratorIdle, Names.Blocks.maceratorIdle);

        RegisterHelper.registerBlock(quartzFurnaceActive, Names.Blocks.quartzFurnaceActive);
        RegisterHelper.registerBlock(obsidianFurnaceActive, Names.Blocks.obsidianFurnaceActive);
        RegisterHelper.registerBlock(emeraldFurnaceActive, Names.Blocks.emeraldCrystalFurnaceActive);
        RegisterHelper.registerBlock(lapisFurnaceActive, Names.Blocks.lapisCrystalFurnaceActive);
        RegisterHelper.registerBlock(bronzeFurnaceActive, Names.Blocks.bronzeFurnaceActive);
        RegisterHelper.registerBlock(coalFurnaceActive, Names.Blocks.coalFurnaceActive);
        RegisterHelper.registerBlock(glowstoneFurnaceActive, Names.Blocks.glowstoneFurnaceActive);
        RegisterHelper.registerBlock(adamantiumFurnaceActive, Names.Blocks.adamantiumFurnaceActive);
        RegisterHelper.registerBlock(silkFurnaceActive, Names.Blocks.silkFurnaceActive);
        RegisterHelper.registerBlock(redstoneFurnaceActive, Names.Blocks.redstoneFurnaceActive);
        RegisterHelper.registerBlock(maceratorActive, Names.Blocks.maceratorActive);
    }

	public static void init()
	{
        initOre();
        initStorageBlocks();
        initStairs();
        initGlass();
        initFurnaces();
	}


}