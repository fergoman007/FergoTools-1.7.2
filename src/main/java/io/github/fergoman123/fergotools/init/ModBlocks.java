package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.BlockOreBlockFT;
import io.github.fergoman123.fergotools.api.BlockOreItemFT;
import io.github.fergoman123.fergotools.api.BlockStorageFT;
import io.github.fergoman123.fergotools.common.blocks.*;
import io.github.fergoman123.fergotools.info.BlockNames;
import io.github.fergoman123.fergotools.info.ModInfo;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

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

        quartzFurnaceIdle = BlockQuartzFurnace.idle;
        quartzFurnaceActive = BlockQuartzFurnace.active;

        obsidianFurnaceIdle = BlockObsidianFurnace.idle;
        obsidianFurnaceActive = BlockObsidianFurnace.active;

        silkFurnaceIdle = BlockSilkFurnace.idle;
        silkFurnaceActive = BlockSilkFurnace.active;

        redstoneFurnaceIdle = BlockRedstoneFurnace.idle;
        redstoneFurnaceActive = BlockRedstoneFurnace.active;

        maceratorIdle = BlockMacerator.idle;
        maceratorActive = BlockMacerator.active;
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

        registerBlock(maceratorIdle, BlockNames.maceratorIdle);
        registerBlock(maceratorActive, BlockNames.maceratorActive);
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlock, String name)
    {
        RegisterHelper.registerBlock(block, itemBlock, ModInfo.modid, name);
    }

    public static void registerBlock(Block block, String name){
        RegisterHelper.registerBlock(block, ModInfo.modid, name);
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlock, String name, String[] modelNames)
    {
        RegisterHelper.registerBlock(block, itemBlock, ModInfo.modid, name, modelNames);
    }
}
