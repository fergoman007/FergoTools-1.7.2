package fergoman123.mods.fergotools.block;

import fergoman123.mods.fergotools.block.furnace.*;
import fergoman123.mods.fergotools.block.ore.*;
import fergoman123.mods.fergotools.block.storage.*;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.lib.strings.Strings;
import net.minecraft.block.Block;

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
        oreExperience = new BlockOreExperience().setBlockName(Strings.ores[0]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:oreExperience");
        oreObsidian = new BlockOreObsidian().setBlockName(Strings.ores[0]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:oreObsidian");
        oreEmeraldCrystal = new BlockOreEmeraldCrystal().setBlockName(Strings.ores[0]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:oreEmeraldCrystal");
        oreLapisCrystal = new BlockOreLapisCrystal().setBlockName(Strings.ores[0]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:oreLapisCrystal");
        oreBronze = new BlockOreBronze().setBlockName(Strings.ores[0]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:oreBronze");
        oreAdamantium = new BlockOreAdamantium().setBlockName(Strings.ores[0]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:oreAdamantium");


        blockExperience = new BlockExperience().setBlockName(Strings.blocks[0]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:blockExperience");
        blockObsidian = new BlockObsidianStorage().setBlockName(Strings.blocks[1]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:blockObsidian");
        blockEmeraldCrystal = new BlockEmeraldCrystal().setBlockName(Strings.blocks[2]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:blockEmeraldCrystal");
        blockLapisCrystal = new BlockLapisCrystal().setBlockName(Strings.blocks[3]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:blockLapisCrystal");
        blockBronze = new BlockBronze().setBlockName(Strings.blocks[4]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:blockBronze");
        blockCoal = new BlockCoalStorage().setBlockName(Strings.blocks[5]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:blockCoal");
        blockGlowstone = new BlockGlowstoneStorage().setBlockName(Strings.blocks[6]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:blockGlowstone");
        blockAdamantium = new BlockAdamantium().setBlockName(Strings.blocks[7]).setHardness(2.5f).setResistance(50f).setCreativeTab(FergoTools.tabFergoBlocks).setBlockTextureName("FergoTools:blockAdamantium");

        quartzFurnaceIdle = new BlockQuartzFurnace(false).setBlockName(Strings.quartzFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeStone).setCreativeTab(FergoTools.tabFergoFurnaces);
        quartzFurnaceActive = new BlockQuartzFurnace(true).setBlockName(Strings.quartzFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeStone).setLightLevel(0.9f);

        obsidianFurnaceIdle = new BlockObsidianFurnace(false).setBlockName(Strings.obsidianFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        obsidianFurnaceActive = new BlockObsidianFurnace(true).setBlockName(Strings.obsidianFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);

        emeraldCrystalFurnaceIdle = new BlockEmeraldCrystalFurnace(false).setBlockName(Strings.emeraldCrystalFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        emeraldCrystalFurnaceActive = new BlockEmeraldCrystalFurnace(true).setBlockName(Strings.emeraldCrystalFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);
//
        lapisCrystalFurnaceIdle = new BlockLapisCrystalFurnace(false).setBlockName(Strings.lapisCrystalFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        lapisCrystalFurnaceActive = new BlockLapisCrystalFurnace(true).setBlockName(Strings.lapisCrystalFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);

        bronzeFurnaceIdle = new BlockBronzeFurnace(false).setBlockName(Strings.bronzeFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        bronzeFurnaceActive = new BlockBronzeFurnace(true).setBlockName(Strings.bronzeFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);

        coalFurnaceIdle = new BlockCoalFurnace(false).setBlockName(Strings.coalFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        coalFurnaceActive = new BlockCoalFurnace(true).setBlockName(Strings.coalFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);

        glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false).setBlockName(Strings.glowstoneFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        glowstoneFurnaceActive = new BlockGlowstoneFurnace(true).setBlockName(Strings.glowstoneFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);

        adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false).setBlockName(Strings.adamantiumFurnace[0]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setCreativeTab(FergoTools.tabFergoFurnaces);
        adamantiumFurnaceActive = new BlockAdamantiumFurnace(true).setBlockName(Strings.adamantiumFurnace[1]).setHardness(3.5f).setResistance(2000f).setStepSound(Block.soundTypeMetal).setLightLevel(0.9f);
	}
}
