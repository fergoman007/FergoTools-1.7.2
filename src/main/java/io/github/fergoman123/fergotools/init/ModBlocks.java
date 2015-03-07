package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.BlockOreBlockFT;
import io.github.fergoman123.fergotools.api.BlockOreItemFT;
import io.github.fergoman123.fergotools.api.BlockStorageFT;
import io.github.fergoman123.fergotools.common.furnace.*;
import io.github.fergoman123.fergotools.info.BlockNames;
import io.github.fergoman123.fergotools.info.ModInfo;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.block.Block;
import scala.tools.nsc.typechecker.Namers$class;

public class ModBlocks
{

    public static Block oreExperience;
    public static Block oreObsidian;
    public static Block oreGemEmerald;
    public static Block oreGemLapis;
    public static Block oreBronze;
    public static Block oreAdamantium;
    public static Block oreGemRedstone;

    public static Block blockExperience;
    public static Block blockExpCollector;
    public static Block blockObsidian;
    public static Block blockGemEmerald;
    public static Block blockGemLapis;
    public static Block blockBronze;
    public static Block blockCoal;
    public static Block blockGlowstone;
    public static Block blockAdamantium;
    public static Block blockGemSilk;
    public static Block blockGemRedstone;

    public static Block quartzFurnaceIdle;
    public static Block quartzFurnaceActive;

    public static Block obsidianFurnaceIdle;
    public static Block obsidianFurnaceActive;

    public static Block emeraldFurnaceIdle;
    public static Block emeraldFurnaceActive;

    public static Block lapisFurnaceIdle;
    public static Block lapisFurnaceActive;

    public static Block bronzeFurnaceIdle;
    public static Block bronzeFurnaceActive;

    public static Block coalFurnaceIdle;
    public static Block coalFurnaceActive;

    public static Block glowstoneFurnaceIdle;
    public static Block glowstoneFurnaceActive;

    public static Block adamantiumFurnaceIdle;
    public static Block adamantiumFurnaceActive;

    public static Block silkFurnaceIdle;
    public static Block silkFurnaceActive;

    public static Block redstoneFurnaceIdle;
    public static Block redstoneFurnaceActive;

    public static Block maceratorIdle;
    public static Block maceratorActive;



    public static void init()
    {
        oreExperience = new BlockOreItemFT(BlockNames.oreExperience, ModItems.shardExp, 5);
        oreObsidian = new BlockOreBlockFT(BlockNames.oreObsidian);
        oreGemEmerald = new BlockOreItemFT(BlockNames.oreGemEmerald, ModItems.gemEmerald, 1);
        oreGemLapis = new BlockOreItemFT(BlockNames.oreGemLapis, ModItems.gemLapis, 1);
        oreBronze = new BlockOreBlockFT(BlockNames.oreBronze);
        oreAdamantium = new BlockOreBlockFT(BlockNames.oreAdamantium);
        oreGemRedstone = new BlockOreItemFT(BlockNames.oreGemRedstone, ModItems.gemRedstone, 1);

        blockExperience = new BlockStorageFT(BlockNames.blockExperience);
        blockExpCollector = new BlockStorageFT(BlockNames.blockExpCollector);
        blockObsidian = new BlockStorageFT(BlockNames.blockObsidian);
        blockGemEmerald = new BlockStorageFT(BlockNames.blockGemEmerald);
        blockGemLapis = new BlockStorageFT(BlockNames.blockGemLapis);
        blockBronze = new BlockStorageFT(BlockNames.blockBronze);
        blockCoal = new BlockStorageFT(BlockNames.blockCoal);
        blockGlowstone = new BlockStorageFT(BlockNames.blockGlowstone);
        blockAdamantium = new BlockStorageFT(BlockNames.blockAdamantium);
        blockGemSilk = new BlockStorageFT(BlockNames.blockGemSilk);
        blockGemRedstone = new BlockStorageFT(BlockNames.blockGemRedstone);

        quartzFurnaceIdle = new QuartzFurnace.BlockQuartzFurnace(false, BlockNames.quartzFurnaceIdle);
        quartzFurnaceActive = new QuartzFurnace.BlockQuartzFurnace(true, BlockNames.quartzFurnaceActive);

        obsidianFurnaceIdle = new ObsidianFurnace.BlockObsidianFurnace(false, BlockNames.obsidianFurnaceIdle);
        obsidianFurnaceActive = new ObsidianFurnace.BlockObsidianFurnace(true, BlockNames.obsidianFurnaceActive);

        emeraldFurnaceIdle = new EmeraldFurnace.BlockEmeraldFurnace(false, BlockNames.emeraldFurnaceIdle);
        emeraldFurnaceActive = new EmeraldFurnace.BlockEmeraldFurnace(true, BlockNames.emeraldFurnaceActive);

        lapisFurnaceIdle = new LapisFurnace.BlockLapisFurnace(false, BlockNames.lapisFurnaceIdle);
        lapisFurnaceActive = new LapisFurnace.BlockLapisFurnace(true, BlockNames.lapisFurnaceActive);

        bronzeFurnaceIdle = new BronzeFurnace.BlockBronzeFurnace(false, BlockNames.bronzeFurnaceIdle);
        bronzeFurnaceActive = new BronzeFurnace.BlockBronzeFurnace(true, BlockNames.bronzeFurnaceActive);

        coalFurnaceIdle = new CoalFurnace.BlockCoalFurnace(false, BlockNames.coalFurnaceIdle);
        coalFurnaceActive = new CoalFurnace.BlockCoalFurnace(true, BlockNames.coalFurnaceActive);

        glowstoneFurnaceIdle = new GlowstoneFurnace.BlockGlowstoneFurnace(false, BlockNames.glowstoneFurnaceIdle);
        glowstoneFurnaceActive = new GlowstoneFurnace.BlockGlowstoneFurnace(true, BlockNames.glowstoneFurnaceActive);

        adamantiumFurnaceIdle = new AdamantiumFurnace.BlockAdamantiumFurnace(false, BlockNames.adamantiumFurnaceIdle);
        adamantiumFurnaceActive = new AdamantiumFurnace.BlockAdamantiumFurnace(true, BlockNames.adamantiumFurnaceActive);

        silkFurnaceIdle = new SilkFurnace.BlockSilkFurnace(false, BlockNames.silkFurnaceIdle);
        silkFurnaceActive = new SilkFurnace.BlockSilkFurnace(true, BlockNames.silkFurnaceActive);

        redstoneFurnaceIdle = new RedstoneFurnace.BlockRedstoneFurnace(false, BlockNames.redstoneFurnaceIdle);
        redstoneFurnaceActive = new RedstoneFurnace.BlockRedstoneFurnace(true, BlockNames.redstoneFurnaceActive);

        maceratorIdle = new Macerator.BlockMacerator(false, BlockNames.maceratorIdle);
        maceratorActive = new Macerator.BlockMacerator(true, BlockNames.maceratorActive);
    }

    public static void register()
    {
        registerBlock(oreExperience, BlockNames.oreExperience);
        registerBlock(oreObsidian, BlockNames.oreObsidian);
        registerBlock(oreGemEmerald, BlockNames.oreGemEmerald);
        registerBlock(oreGemLapis, BlockNames.oreGemLapis);
        registerBlock(oreBronze, BlockNames.oreBronze);
        registerBlock(oreAdamantium, BlockNames.oreAdamantium);
        registerBlock(oreGemRedstone, BlockNames.oreGemRedstone);

        registerBlock(blockExperience, BlockNames.blockExperience);
        registerBlock(blockExpCollector, BlockNames.blockExpCollector);
        registerBlock(blockObsidian, BlockNames.blockObsidian);
        registerBlock(blockGemEmerald, BlockNames.blockGemEmerald);
        registerBlock(blockGemLapis, BlockNames.blockGemLapis);
        registerBlock(blockBronze, BlockNames.blockBronze);
        registerBlock(blockCoal, BlockNames.blockCoal);
        registerBlock(blockGlowstone, BlockNames.blockGlowstone);
        registerBlock(blockAdamantium, BlockNames.blockAdamantium);
        registerBlock(blockGemSilk, BlockNames.blockGemSilk);
        registerBlock(blockGemRedstone, BlockNames.blockGemRedstone);

        registerBlock(quartzFurnaceIdle, BlockNames.quartzFurnaceIdle);
        registerBlock(quartzFurnaceActive, BlockNames.quartzFurnaceActive);

        registerBlock(obsidianFurnaceIdle, BlockNames.obsidianFurnaceIdle);
        registerBlock(obsidianFurnaceActive, BlockNames.obsidianFurnaceActive);

        registerBlock(emeraldFurnaceIdle, BlockNames.emeraldFurnaceIdle);
        registerBlock(emeraldFurnaceActive, BlockNames.emeraldFurnaceActive);

        registerBlock(lapisFurnaceIdle, BlockNames.lapisFurnaceIdle);
        registerBlock(lapisFurnaceActive, BlockNames.lapisFurnaceActive);

        registerBlock(bronzeFurnaceIdle, BlockNames.bronzeFurnaceIdle);
        registerBlock(bronzeFurnaceActive, BlockNames.bronzeFurnaceActive);

        registerBlock(coalFurnaceIdle, BlockNames.coalFurnaceIdle);
        registerBlock(coalFurnaceActive, BlockNames.coalFurnaceActive);

        registerBlock(glowstoneFurnaceIdle, BlockNames.glowstoneFurnaceIdle);
        registerBlock(glowstoneFurnaceActive, BlockNames.glowstoneFurnaceActive);

        registerBlock(adamantiumFurnaceIdle, BlockNames.adamantiumFurnaceIdle);
        registerBlock(adamantiumFurnaceActive, BlockNames.adamantiumFurnaceActive);

        registerBlock(silkFurnaceIdle, BlockNames.silkFurnaceIdle);
        registerBlock(silkFurnaceActive, BlockNames.silkFurnaceActive);

        registerBlock(redstoneFurnaceIdle, BlockNames.redstoneFurnaceIdle);
        registerBlock(redstoneFurnaceActive, BlockNames.redstoneFurnaceActive);

        registerBlock(maceratorIdle, BlockNames.maceratorIdle);
        registerBlock(maceratorActive, BlockNames.maceratorActive);
    }

    public static void registerBlock(Block block, String name){
        RegisterHelper.registerBlock(block, ModInfo.modid, name);
    }
}
