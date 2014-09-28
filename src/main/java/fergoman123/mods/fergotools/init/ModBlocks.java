package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.block.BlockFergoGlass;
import fergoman123.mods.fergotools.block.FergoOres.*;
import fergoman123.mods.fergotools.block.FergoStorageBlocks.*;
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
import fergoman123.mods.fergotools.item.block.furnaceactive.*;
import fergoman123.mods.fergotools.item.block.furnaceidle.*;
import fergoman123.mods.fergotools.item.block.furnaceidle.ItemBlockLapisFurnaceIdle;
import fergoman123.mods.fergotools.item.block.ore.*;
import fergoman123.mods.fergotools.item.block.storage.*;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockFT;
import fergoman123.mods.fergotools.util.base.BlockGlassFT;
import fergoman123.mods.fergoutil.helper.RegisterHelper;
import net.minecraft.block.Block;

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

    public static final Block quartzFurnaceIdle = new BlockQuartzFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block obsidianFurnaceIdle = new BlockObsidianFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block emeraldFurnaceIdle = new BlockEmeraldFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block lapisFurnaceIdle = new BlockLapisFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block bronzeFurnaceIdle = new BlockBronzeFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block coalFurnaceIdle = new BlockCoalFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block silkFurnaceIdle = new BlockSilkFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block redstoneFurnaceIdle = new BlockRedstoneFurnace(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);
    public static final Block maceratorIdle = new BlockMacerator(false).setCreativeTab(CreativeTabsFergoTools.tabFergoFurnaces);

    public static final Block quartzFurnaceActive = new BlockQuartzFurnace(true).setLightLevel(0.9f);
    public static final Block obsidianFurnaceActive = new BlockObsidianFurnace(true).setLightLevel(0.9f);
    public static final Block emeraldFurnaceActive = new BlockEmeraldFurnace(true).setLightLevel(0.9f);
    public static final Block lapisFurnaceActive = new BlockLapisFurnace(true).setLightLevel(0.9f);
    public static final Block bronzeFurnaceActive = new BlockBronzeFurnace(true).setLightLevel(0.9f);
    public static final Block coalFurnaceActive = new BlockCoalFurnace(true).setLightLevel(0.9f);
    public static final Block glowstoneFurnaceActive = new BlockGlowstoneFurnace(true).setLightLevel(0.9f);
    public static final Block adamantiumFurnaceActive = new BlockAdamantiumFurnace(true).setLightLevel(0.9f);
    public static final Block silkFurnaceActive = new BlockSilkFurnace(true).setLightLevel(0.9f);
    public static final Block redstoneFurnaceActive = new BlockRedstoneFurnace(true).setLightLevel(0.9f);
    public static final Block maceratorActive = new BlockMacerator(true).setLightLevel(0.9f);

	public static void init()
	{
        RegisterHelper.registerBlock(oreExperience, ItemBlockOreExperience.class, Names.Blocks.oreExperience);
        RegisterHelper.registerBlock(oreObsidian, ItemBlockOreObsidian.class, Names.Blocks.oreObsidian);
        RegisterHelper.registerBlock(oreEmeraldCrystal, ItemBlockOreEmeraldCrystal.class, Names.Blocks.oreEmeraldCrystal);
        RegisterHelper.registerBlock(oreLapisCrystal, ItemBlockOreLapisCrystal.class, Names.Blocks.oreLapisCrystal);
        RegisterHelper.registerBlock(oreBronze, ItemBlockOreBronze.class, Names.Blocks.oreBronze);
        RegisterHelper.registerBlock(oreAdamantium, ItemBlockOreAdamantium.class, Names.Blocks.oreAdamantium);
        RegisterHelper.registerBlock(oreCrystalRed, ItemBlockOreCrystalRed.class, Names.Blocks.oreCrystalRed);

        RegisterHelper.registerBlock(blockExperience, ItemBlockExperience.class, Names.Blocks.blockExperience);
        RegisterHelper.registerBlock(blockObsidian, ItemBlockObsidian.class, Names.Blocks.blockObsidian);
        RegisterHelper.registerBlock(blockEmeraldCrystal, ItemBlockEmeraldCrystal.class, Names.Blocks.blockEmeraldCrystal);
        RegisterHelper.registerBlock(blockLapisCrystal, ItemBlockLapisCrystal.class, Names.Blocks.blockLapisCrystal);
        RegisterHelper.registerBlock(blockBronze, ItemBlockBronze.class, Names.Blocks.blockBronze);
        RegisterHelper.registerBlock(blockCoal, ItemBlockCoal.class, Names.Blocks.blockCoal);
        RegisterHelper.registerBlock(blockGlowstone, ItemBlockGlowstone.class, Names.Blocks.blockGlowstone);
        RegisterHelper.registerBlock(blockAdamantium, ItemBlockAdamantium.class, Names.Blocks.blockAdamantium);
        RegisterHelper.registerBlock(blockSilkGem, ItemBlockSilkGem.class, Names.Blocks.blockSilkGem);
        RegisterHelper.registerBlock(blockRedstoneCrystal, ItemBlockRedstoneCrystal.class, Names.Blocks.blockRedstoneCrystal);

        RegisterHelper.registerBlock(blockFergoGlass, Names.Blocks.blockFergoGlass);

        RegisterHelper.registerBlock(quartzFurnaceIdle, ItemBlockQuartzFurnaceIdle.class, Names.Blocks.quartzFurnaceIdle);
        RegisterHelper.registerBlock(obsidianFurnaceIdle, ItemBlockObsidianFurnaceIdle.class, Names.Blocks.obsidianFurnaceIdle);
        RegisterHelper.registerBlock(emeraldFurnaceIdle, ItemBlockEmeraldFurnaceIdle.class, Names.Blocks.emeraldFurnaceIdle);
        RegisterHelper.registerBlock(lapisFurnaceIdle, ItemBlockLapisFurnaceIdle.class, Names.Blocks.lapisFurnaceIdle);
        RegisterHelper.registerBlock(bronzeFurnaceIdle, ItemBlockBronzeFurnaceIdle.class, Names.Blocks.bronzeFurnaceIdle);
        RegisterHelper.registerBlock(coalFurnaceIdle, ItemBlockCoalFurnaceIdle.class, Names.Blocks.coalFurnaceIdle);
        RegisterHelper.registerBlock(glowstoneFurnaceIdle, ItemBlockGlowstoneFurnaceIdle.class, Names.Blocks.glowstoneFurnaceIdle);
        RegisterHelper.registerBlock(adamantiumFurnaceIdle, ItemBlockAdamantiumFurnaceIdle.class, Names.Blocks.adamantiumFurnaceIdle);
        RegisterHelper.registerBlock(silkFurnaceIdle, ItemBlockSilkFurnaceIdle.class, Names.Blocks.silkFurnaceIdle);
        RegisterHelper.registerBlock(redstoneFurnaceIdle, ItemBlockRedstoneFurnaceIdle.class, Names.Blocks.redstoneFurnaceIdle);
        RegisterHelper.registerBlock(maceratorIdle, ItemBlockMaceratorIdle.class, Names.Blocks.maceratorIdle);

        RegisterHelper.registerBlock(quartzFurnaceActive, ItemBlockQuartzFurnaceActive.class, Names.Blocks.quartzFurnaceActive);
        RegisterHelper.registerBlock(obsidianFurnaceActive, ItemBlockObsidianFurnaceActive.class, Names.Blocks.obsidianFurnaceActive);
        RegisterHelper.registerBlock(emeraldFurnaceActive, ItemBlockEmeraldFurnaceActive.class, Names.Blocks.emeraldFurnaceActive);
        RegisterHelper.registerBlock(lapisFurnaceActive, ItemBlockLapisFurnaceActive.class, Names.Blocks.lapisFurnaceActive);
        RegisterHelper.registerBlock(bronzeFurnaceActive, ItemBlockBronzeFurnaceActive.class, Names.Blocks.bronzeFurnaceActive);
        RegisterHelper.registerBlock(coalFurnaceActive, ItemBlockCoalFurnaceActive.class, Names.Blocks.coalFurnaceActive);
        RegisterHelper.registerBlock(glowstoneFurnaceActive, ItemBlockGlowstoneFurnaceActive.class, Names.Blocks.glowstoneFurnaceActive);
        RegisterHelper.registerBlock(adamantiumFurnaceActive, ItemBlockAdamantiumFurnaceActive.class, Names.Blocks.adamantiumFurnaceActive);
        RegisterHelper.registerBlock(silkFurnaceActive, ItemBlockSilkFurnaceActive.class, Names.Blocks.silkFurnaceActive);
        RegisterHelper.registerBlock(redstoneFurnaceActive, ItemBlockRedstoneFurnaceActive.class, Names.Blocks.redstoneFurnaceActive);
        RegisterHelper.registerBlock(maceratorActive, ItemBlockMaceratorActive.class, Names.Blocks.maceratorActive);
	}


}