package fergoman123.mods.fergotools.block;

import net.minecraft.block.Block;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.block.furnace.BlockAdamantiumFurnace;
import fergoman123.mods.fergotools.block.furnace.BlockBronzeFurnace;
import fergoman123.mods.fergotools.block.furnace.BlockCoalFurnace;
import fergoman123.mods.fergotools.block.furnace.BlockEmeraldCrystalFurnace;
import fergoman123.mods.fergotools.block.furnace.BlockGlowstoneFurnace;
import fergoman123.mods.fergotools.block.furnace.BlockLapisCrystalFurnace;
import fergoman123.mods.fergotools.block.furnace.BlockObsidianFurnace;
import fergoman123.mods.fergotools.block.furnace.BlockQuartzFurnace;
import fergoman123.mods.fergotools.block.ore.BlockOreAdamantium;
import fergoman123.mods.fergotools.block.ore.BlockOreBronze;
import fergoman123.mods.fergotools.block.ore.BlockOreEmeraldCrystal;
import fergoman123.mods.fergotools.block.ore.BlockOreExperience;
import fergoman123.mods.fergotools.block.ore.BlockOreLapisCrystal;
import fergoman123.mods.fergotools.block.ore.BlockOreObsidian;
import fergoman123.mods.fergotools.block.storage.BlockAdamantium;
import fergoman123.mods.fergotools.block.storage.BlockBronze;
import fergoman123.mods.fergotools.block.storage.BlockCoalStorage;
import fergoman123.mods.fergotools.block.storage.BlockEmeraldCrystal;
import fergoman123.mods.fergotools.block.storage.BlockExperience;
import fergoman123.mods.fergotools.block.storage.BlockGlowstoneStorage;
import fergoman123.mods.fergotools.block.storage.BlockLapisCrystal;
import fergoman123.mods.fergotools.block.storage.BlockObsidianStorage;
import fergoman123.mods.fergotools.lib.strings.BlockStrings;
import fergoman123.mods.fergotools.lib.strings.FurnaceStrings;
import fergoman123.mods.fergotools.lib.textures.BlockTextures;

public class ModBlocks {
	
	public static Block oreObsidian;
    public static Block oreEmeraldCrystal;
    public static Block oreLapisCrystal;
    public static Block oreBronze;
    public static Block oreAdamantium;
    public static Block oreExperience;

    public static Block blockExperience;
    public static Block blockObsidian;
    public static Block blockEmeraldCrystal;
    public static Block blockLapisCrystal;
    public static Block blockBronze;
    public static Block blockCoal;
    public static Block blockGlowstone;
    public static Block blockAdamantium;
    public static Block blockSilkGem;

    public static Block quartzFurnaceIdle;
    public static Block quartzFurnaceActive;

    public static Block obsidianFurnaceIdle;
    public static Block obsidianFurnaceActive;

    public static Block emeraldCrystalFurnaceIdle;
    public static Block emeraldCrystalFurnaceActive;

    public static Block lapisCrystalFurnaceIdle;
    public static Block lapisCrystalFurnaceActive;

    public static Block bronzeFurnaceIdle;
    public static Block bronzeFurnaceActive;

    public static Block glowstoneFurnaceIdle;
    public static Block glowstoneFurnaceActive;

    public static Block coalFurnaceIdle;
    public static Block coalFurnaceActive;

    public static Block adamantiumFurnaceIdle;
    public static Block adamantiumFurnaceActive;
    
	public static void addBlocks()
	{
        oreExperience = new BlockOreExperience().setBlockName(BlockStrings.ores[0]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.oreExperience);
        oreObsidian = new BlockOreObsidian().setBlockName(BlockStrings.ores[1]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.oreObsidian);
        oreEmeraldCrystal = new BlockOreEmeraldCrystal().setBlockName(BlockStrings.ores[2]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.oreEmeraldCrystal);
        oreLapisCrystal = new BlockOreLapisCrystal().setBlockName(BlockStrings.ores[3]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.oreLapisCrystal);
        oreBronze = new BlockOreBronze().setBlockName(BlockStrings.ores[4]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.oreBronze);
        oreAdamantium = new BlockOreAdamantium().setBlockName(BlockStrings.ores[5]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.oreAdamantium);


        blockExperience = new BlockExperience().setBlockName(BlockStrings.blocks[0]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.blockExperience);
        blockObsidian = new BlockObsidianStorage().setBlockName(BlockStrings.blocks[1]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.blockObsidian);
        blockEmeraldCrystal = new BlockEmeraldCrystal().setBlockName(BlockStrings.blocks[2]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.blockEmeraldCrystal);
        blockLapisCrystal = new BlockLapisCrystal().setBlockName(BlockStrings.blocks[3]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.blockLapisCrystal);
        blockBronze = new BlockBronze().setBlockName(BlockStrings.blocks[4]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.blockBronze);
        blockCoal = new BlockCoalStorage().setBlockName(BlockStrings.blocks[5]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.blockCoal);
        blockGlowstone = new BlockGlowstoneStorage().setBlockName(BlockStrings.blocks[6]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.blockGlowstone);
        blockAdamantium = new BlockAdamantium().setBlockName(BlockStrings.blocks[7]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.blockAdamantium);
        blockSilkGem = new BlockSilkGem().setBlockName(BlockStrings.blocks[8]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName(BlockTextures.blockSilkGem);

        quartzFurnaceIdle = new BlockQuartzFurnace(false).setBlockName(FurnaceStrings.quartzFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeStone).setCreativeTab(FergoTools.tabFergoFurnaces);
        quartzFurnaceActive = new BlockQuartzFurnace(true).setBlockName(FurnaceStrings.quartzFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeStone).setLightLevel(0.9f);

        obsidianFurnaceIdle = new BlockObsidianFurnace(false).setBlockName(FurnaceStrings.obsidianFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        obsidianFurnaceActive = new BlockObsidianFurnace(true).setBlockName(FurnaceStrings.obsidianFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);

        emeraldCrystalFurnaceIdle = new BlockEmeraldCrystalFurnace(false).setBlockName(FurnaceStrings.emeraldCrystalFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        emeraldCrystalFurnaceActive = new BlockEmeraldCrystalFurnace(true).setBlockName(FurnaceStrings.emeraldCrystalFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);
//
        lapisCrystalFurnaceIdle = new BlockLapisCrystalFurnace(false).setBlockName(FurnaceStrings.lapisCrystalFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        lapisCrystalFurnaceActive = new BlockLapisCrystalFurnace(true).setBlockName(FurnaceStrings.lapisCrystalFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);

        bronzeFurnaceIdle = new BlockBronzeFurnace(false).setBlockName(FurnaceStrings.bronzeFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        bronzeFurnaceActive = new BlockBronzeFurnace(true).setBlockName(FurnaceStrings.bronzeFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);

        coalFurnaceIdle = new BlockCoalFurnace(false).setBlockName(FurnaceStrings.coalFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        coalFurnaceActive = new BlockCoalFurnace(true).setBlockName(FurnaceStrings.coalFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);

        glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false).setBlockName(FurnaceStrings.glowstoneFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        glowstoneFurnaceActive = new BlockGlowstoneFurnace(true).setBlockName(FurnaceStrings.glowstoneFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);

        adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false).setBlockName(FurnaceStrings.adamantiumFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        adamantiumFurnaceActive = new BlockAdamantiumFurnace(true).setBlockName(FurnaceStrings.adamantiumFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);
	}
}
