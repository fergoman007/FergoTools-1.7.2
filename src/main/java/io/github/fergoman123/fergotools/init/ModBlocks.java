package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergotools.block.BlockFergoGlass;
import io.github.fergoman123.fergotools.block.FTBlocks.*;
import io.github.fergoman123.fergotools.block.FTLogs.*;
import io.github.fergoman123.fergotools.block.FTOres.*;
import io.github.fergoman123.fergotools.block.FTPlanks.*;
import io.github.fergoman123.fergotools.creativetab.Tabs;
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
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.Utils;
import io.github.fergoman123.fergotools.util.base.BlockFT;
import io.github.fergoman123.fergotools.util.base.BlockGlassFT;
import io.github.fergoman123.fergotools.util.base.BlockLogFT;
import io.github.fergoman123.fergotools.util.base.BlockWoodFT;
import io.github.fergoman123.fergotools.util.base.workbench.BlockWorkbenchFT;
import io.github.fergoman123.fergotools.workbenches.EmeraldWorkbench.BlockEmeraldWorkbench;
import io.github.fergoman123.fergotools.workbenches.ObsidianWorkbench.BlockObsidianWorkbench;
import net.minecraft.block.Block;

public class ModBlocks{

    public static final BlockFT oreExperience = new BlockOreExperience();
    public static final BlockFT oreObsidian = new BlockOreObsidian();
    public static final BlockFT oreEmeraldCrystal = new BlockOreEmeraldCrystal();
    public static final BlockFT oreLapisCrystal = new BlockOreLapisCrystal();
    public static final BlockFT oreBronze = new BlockOreBronze();
    public static final BlockFT oreAdamantium = new BlockOreAdamantium();
    public static final BlockFT oreCrystalRed = new BlockOreRedCrystal();

    public static final Block[] ores = new Block[]{oreExperience, oreObsidian, oreEmeraldCrystal, oreLapisCrystal, oreBronze, oreAdamantium, oreCrystalRed};

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
    public static final BlockFT blockExpCollector = new BlockExpCollector();
    public static final Block[] blocks = new Block[]{blockExperience, blockObsidian, blockEmeraldCrystal, blockLapisCrystal, blockBronze, blockCoal, blockGlowstone, blockAdamantium, blockSilkGem, blockRedstoneCrystal};

    public static final BlockGlassFT blockFergoGlass = new BlockFergoGlass();

    public static final Block quartzFurnaceIdle = new BlockQuartzFurnace(false).setCreativeTab(Tabs.tabFergoFurnaces);
    public static final Block obsidianFurnaceIdle = new BlockObsidianFurnace(false).setCreativeTab(Tabs.tabFergoFurnaces);
    public static final Block emeraldFurnaceIdle = new BlockEmeraldFurnace(false).setCreativeTab(Tabs.tabFergoFurnaces);
    public static final Block lapisFurnaceIdle = new BlockLapisFurnace(false).setCreativeTab(Tabs.tabFergoFurnaces);
    public static final Block bronzeFurnaceIdle = new BlockBronzeFurnace(false).setCreativeTab(Tabs.tabFergoFurnaces);
    public static final Block coalFurnaceIdle = new BlockCoalFurnace(false).setCreativeTab(Tabs.tabFergoFurnaces);
    public static final Block glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false).setCreativeTab(Tabs.tabFergoFurnaces);
    public static final Block adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false).setCreativeTab(Tabs.tabFergoFurnaces);
    public static final Block silkFurnaceIdle = new BlockSilkFurnace(false).setCreativeTab(Tabs.tabFergoFurnaces);
    public static final Block redstoneFurnaceIdle = new BlockRedstoneFurnace(false).setCreativeTab(Tabs.tabFergoFurnaces);
    public static final Block maceratorIdle = new BlockMacerator(false).setCreativeTab(Tabs.tabFergoFurnaces);

    public static final Block[] furnaceIdle = new Block[]{quartzFurnaceIdle, obsidianFurnaceIdle, emeraldFurnaceIdle, lapisFurnaceIdle, bronzeFurnaceIdle, coalFurnaceIdle, glowstoneFurnaceIdle, adamantiumFurnaceIdle, silkFurnaceIdle, redstoneFurnaceIdle, maceratorIdle};

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

    public static final Block[] furnaceActive = new Block[]{quartzFurnaceActive, obsidianFurnaceActive, emeraldFurnaceActive, lapisFurnaceActive, bronzeFurnaceActive, coalFurnaceActive, glowstoneFurnaceActive, adamantiumFurnaceActive, silkFurnaceActive, redstoneFurnaceActive, maceratorActive};

    public static final BlockLogFT logObsidian = new BlockLogObsidian();
    public static final BlockLogFT logEmerald = new BlockLogEmerald();
    public static final BlockLogFT logLapis = new BlockLogLapis();
    public static final BlockLogFT logBronze = new BlockLogBronze();
    public static final BlockLogFT logCoal = new BlockLogCoal();
    public static final BlockLogFT logGlowstone = new BlockLogGlowstone();
    public static final BlockLogFT logAdamantium = new BlockLogAdamantium();
    public static final BlockLogFT logSilk = new BlockLogSilk();
    public static final BlockLogFT logRedstone = new BlockLogRedstone();

    public static final Block[] logs = new Block[]{logObsidian, logEmerald, logLapis, logBronze, logCoal, logGlowstone, logAdamantium, logSilk, logRedstone};

    public static final BlockWoodFT plankObsidian = new BlockPlankObsidian();
    public static final BlockWoodFT plankEmerald = new BlockPlankEmerald();
    public static final BlockWoodFT plankLapis = new BlockPlankLapis();
    public static final BlockWoodFT plankBronze = new BlockPlankBronze();
    public static final BlockWoodFT plankCoal = new BlockPlankCoal();
    public static final BlockWoodFT plankGlowstone = new BlockPlankGlowstone();
    public static final BlockWoodFT plankAdamantium = new BlockPlankAdamantium();
    public static final BlockWoodFT plankSilk = new BlockPlankSilk();
    public static final BlockWoodFT plankRedstone = new BlockPlankRedstone();

    public static final Block[] planks = new Block[]{plankObsidian, plankEmerald, plankLapis, plankBronze, plankCoal, plankGlowstone, plankAdamantium, plankSilk, plankRedstone};

    public static final BlockWorkbenchFT obsidianWorkbench = new BlockObsidianWorkbench();
    public static final BlockWorkbenchFT emeraldWorkbench = new BlockEmeraldWorkbench();
//    public static final BlockWorkbenchFT lapisWorkbench = new BlockLapisWorkbench();
//    public static final BlockWorkbenchFT bronzeWorkbench = new BlockBronzeWorkbench();
//    public static final BlockWorkbenchFT coalWorkbench = new BlockCoalWorkbench();
//    public static final BlockWorkbenchFT glowstoneWorkbench = new BlockGlowstoneWorkbench();
//    public static final BlockWorkbenchFT adamantiumWorkbench = new BlockAdamantiumWorkbench();
//    public static final BlockWorkbenchFT silkWorkbench = new BlockSilkWorkbench();
//    public static final BlockWorkbenchFT redstoneWorkbench = new BlockRedstoneWorkbench();

//    public static final Block[] workbenches = new Block[]{obsidianWorkbench, emeraldWorkbench, lapisWorkbench, bronzeWorkbench, coalWorkbench, glowstoneWorkbench, adamantiumWorkbench, silkWorkbench, redstoneWorkbench};

	public static void init()
	{

        for (int i = 0; i < ores.length; i++)
        {
            RegisterHelper.registerBlock(ores[i], Utils.ores[i], Names.Blocks.oreList[i]);
        }

        for (int i = 0; i < blocks.length; i++) {
            RegisterHelper.registerBlock(blocks[i], Utils.blocks[i], Names.Blocks.blockList[i]);
        }

        RegisterHelper.registerBlock(blockFergoGlass, Names.Blocks.blockFergoGlass);

        for (int i = 0; i < furnaceIdle.length; i++) {
            RegisterHelper.registerBlock(furnaceIdle[i], Utils.furnaceIdle[i], Names.Blocks.furnaceIdle[i]);
        }

        for (int i = 0; i < furnaceActive.length; i++) {
            RegisterHelper.registerBlock(furnaceActive[i], Utils.furnaceActive[i], Names.Blocks.furnaceActive[i]);
        }

        for (int i = 0; i < logs.length; i++)
        {
            RegisterHelper.registerBlock(logs[i], Names.Blocks.logs[i]);
        }

        for (int i = 0; i < planks.length; i++)
        {
            RegisterHelper.registerBlock(planks[i], Names.Blocks.planks[i]);
        }

        RegisterHelper.registerBlock(obsidianWorkbench, Names.Blocks.obsidianWorkbench);
        RegisterHelper.registerBlock(emeraldWorkbench, Names.Blocks.emeraldWorkbench);
    }


}