package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.block.BlockFergoGlass;
import fergoman123.mods.fergotools.block.FergoOres.*;
import fergoman123.mods.fergotools.block.FergoStorageBlocks.*;
import fergoman123.mods.fergotools.creativetab.Tabs;
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
import fergoman123.mods.fergotools.util.Utils;
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
    }


}