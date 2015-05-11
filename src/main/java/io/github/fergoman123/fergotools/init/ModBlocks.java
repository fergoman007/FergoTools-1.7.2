package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.base.*;
import io.github.fergoman123.fergotools.api.content.WoodTypes;
import io.github.fergoman123.fergotools.common.Tiles.TileQuartzFurnace;
import io.github.fergoman123.fergotools.common.blocks.BlockSaplingFT;
import io.github.fergoman123.fergotools.common.blocks.Furnaces.BlockQuartzFurnace;
import io.github.fergoman123.fergotools.common.blocks.Ores.*;
import io.github.fergoman123.fergotools.common.blocks.wood.*;
import io.github.fergoman123.fergotools.common.itemblock.*;
import io.github.fergoman123.fergotools.reference.ModInfo;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import io.github.fergoman123.fergoutil.helper.GRHelper;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static BlockOreFT oreExperience;
    public static BlockOreFT oreObsidian;
    public static BlockOreFT oreGemEmerald;
    public static BlockOreFT oreGemLapis;
    public static BlockOreFT oreBronze;
    public static BlockOreFT oreAdamantium;
    public static BlockOreFT oreGemRedstone;

    public static BlockMultiFergo storageFT;

    public static BlockFurnaceFT quartzFurnaceIdle;
    public static BlockFurnaceFT obsidianFurnaceIdle;
    public static BlockFurnaceFT emeraldFurnaceIdle;
    public static BlockFurnaceFT lapisFurnaceIdle;
    public static BlockFurnaceFT bronzeFurnaceIdle;
    public static BlockFurnaceFT coalFurnaceIdle;
    public static BlockFurnaceFT glowstoneFurnaceIdle;
    public static BlockFurnaceFT adamantiumFurnaceIdle;
    public static BlockFurnaceFT silkFurnaceIdle;
    public static BlockFurnaceFT redstoneFurnaceIdle;
    public static BlockFurnaceFT maceratorIdle;

    public static BlockFurnaceFT quartzFurnaceActive;
    public static BlockFurnaceFT obsidianFurnaceActive;
    public static BlockFurnaceFT emeraldFurnaceActive;
    public static BlockFurnaceFT lapisFurnaceActive;
    public static BlockFurnaceFT bronzeFurnaceActive;
    public static BlockFurnaceFT coalFurnaceActive;
    public static BlockFurnaceFT glowstoneFurnaceActive;
    public static BlockFurnaceFT adamantiumFurnaceActive;
    public static BlockFurnaceFT silkFurnaceActive;
    public static BlockFurnaceFT redstoneFurnaceActive;
    public static BlockFurnaceFT maceratorActive;

    public static BlockLogFT logFT;
    public static BlockMultiFergo plankFT;

    public static BlockStairsFT stairObsidian;
    public static BlockStairsFT stairEmerald;
    public static BlockStairsFT stairLapis;
    public static BlockStairsFT stairBronze;
    public static BlockStairsFT stairCoal;
    public static BlockStairsFT stairGlowstone;
    public static BlockStairsFT stairAdamantium;
    public static BlockStairsFT stairSilk;
    public static BlockStairsFT stairRedstone;

    public static BlockWoodSlabFT singleSlabFT;
    public static BlockWoodSlabFT doubleSlabFT;

    public static BlockLeavesFT leavesFT;

    public static BlockSaplingFT saplingFT;

    public static void init()
    {
        oreExperience = new BlockOreExperience();
        oreObsidian = new BlockOreObsidian();
        oreGemEmerald = new BlockOreEmerald();
        oreGemLapis = new BlockOreLapis();
        oreBronze = new BlockOreBronze();
        oreAdamantium = new BlockOreAdamantium();
        oreGemRedstone = new BlockOreRedstone();

        storageFT = new BlockStorageFT(BlockNames.blocks, BlockNames.storageFT);

        quartzFurnaceIdle = new BlockQuartzFurnace(false, BlockNames.quartzFurnaceIdle);
//    obsidianFurnaceIdle = new BlockObsidianFurnace(false, BlockNames.obsidianFurnaceIdle);
//    emeraldFurnaceIdle = new BlockEmeraldFurnace(false, BlockNames.emeraldFurnaceIdle);
//    lapisFurnaceIdle = new BlockLapisFurnace(false, BlockNames.lapisFurnaceIdle);
//    bronzeFurnaceIdle = new BlockBronzeFurnace(false, BlockNames.bronzeFurnaceIdle);
//    coalFurnaceIdle = new BlockCoalFurnace(false, BlockNames.coalFurnaceIdle);
//    glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false, BlockNames.glowstoneFurnaceIdle);
//    adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false, BlockNames.adamantiumFurnaceIdle);
//    silkFurnaceIdle = new BlockSilkFurnace(false, BlockNames.silkFurnaceIdle);
//    redstoneFurnaceIdle = new BlockRedstoneFurnace(false, BlockNames.redstoneFurnaceIdle);
//    maceratorIdle = new BlockMacerator(false, BlockNames.maceratorIdle);

        quartzFurnaceActive = new BlockQuartzFurnace(true, BlockNames.quartzFurnaceActive);
//    obsidianFurnaceActive = new BlockObsidianFurnace(true, BlockNames.obsidianFurnaceActive);
//    emeraldFurnaceActive = new BlockEmeraldFurnace(true, BlockNames.emeraldFurnaceActive);
//    lapisFurnaceActive = new BlockLapisFurnace(true, BlockNames.lapisFurnaceActive);
//    bronzeFurnaceActive = new BlockBronzeFurnace(true, BlockNames.bronzeFurnaceActive);
//    coalFurnaceActive = new BlockCoalFurnace(true, BlockNames.coalFurnaceActive);
//    glowstoneFurnaceActive = new BlockGlowstoneFurnace(true, BlockNames.glowstoneFurnaceActive);
//    adamantiumFurnaceActive = new BlockAdamantiumFurnace(true, BlockNames.adamantiumFurnaceActive);
//    silkFurnaceActive = new BlockSilkFurnace(true, BlockNames.silkFurnaceActive);
//    redstoneFurnaceActive = new BlockRedstoneFurnace(true, BlockNames.redstoneFurnaceActive);
//    maceratorActive = new BlockMacerator(true, BlockNames.maceratorActive);


        logFT = new BlockWoodLogFT(BlockNames.logFT);
        plankFT = new BlockPlankFT(BlockNames.plankFT);

        stairObsidian = new BlockStairsFT(plankFT.getDefaultState().withProperty(BlockPlankFT.VARIANT, WoodTypes.obsidian), BlockNames.stairs[0]);
        stairEmerald = new BlockStairsFT(plankFT.getDefaultState().withProperty(BlockPlankFT.VARIANT, WoodTypes.emerald), BlockNames.stairs[1]);
        stairLapis = new BlockStairsFT(plankFT.getDefaultState().withProperty(BlockPlankFT.VARIANT, WoodTypes.lapis), BlockNames.stairs[2]);
        stairBronze = new BlockStairsFT(plankFT.getDefaultState().withProperty(BlockPlankFT.VARIANT, WoodTypes.bronze), BlockNames.stairs[3]);
        stairCoal = new BlockStairsFT(plankFT.getDefaultState().withProperty(BlockPlankFT.VARIANT, WoodTypes.coal), BlockNames.stairs[4]);
        stairGlowstone = new BlockStairsFT(plankFT.getDefaultState().withProperty(BlockPlankFT.VARIANT, WoodTypes.glowstone), BlockNames.stairs[5]);
        stairAdamantium = new BlockStairsFT(plankFT.getDefaultState().withProperty(BlockPlankFT.VARIANT, WoodTypes.adamantium), BlockNames.stairs[6]);
        stairSilk = new BlockStairsFT(plankFT.getDefaultState().withProperty(BlockPlankFT.VARIANT, WoodTypes.silk), BlockNames.stairs[7]);
        stairRedstone = new BlockStairsFT(plankFT.getDefaultState().withProperty(BlockPlankFT.VARIANT, WoodTypes.redstone), BlockNames.stairs[8]);

        singleSlabFT = new BlockHSFT(BlockNames.slabSingleFT);
        doubleSlabFT = new BlockDSFT(BlockNames.slabDoubleFT);
        leavesFT = new BlockLeavesImpl(BlockNames.leavesFT);
        saplingFT = new BlockSaplingFT(BlockNames.saplingFT);

    }

    public static void registerBlocks()
    {
        registerBlock(oreExperience, BlockNames.oreExperience);
        registerBlock(oreObsidian, BlockNames.oreObsidian);
        registerBlock(oreGemEmerald, BlockNames.oreGemEmerald);
        registerBlock(oreGemLapis, BlockNames.oreGemLapis);
        registerBlock(oreBronze, BlockNames.oreBronze);
        registerBlock(oreAdamantium, BlockNames.oreAdamantium);
        registerBlock(oreGemRedstone, BlockNames.oreGemRedstone);

        registerBlock(storageFT, BlockNames.storageFT);

        registerFurnace(quartzFurnaceIdle, quartzFurnaceActive, TileQuartzFurnace.class, "quartzFurnace", BlockNames.quartzFurnaceIdle, BlockNames.quartzFurnaceActive);

        registerBlock(logFT, ItemBlockLogFT.class, BlockNames.logs, BlockNames.logFT);
        registerBlock(plankFT, ItemBlockPlankFT.class, BlockNames.planks, BlockNames.plankFT);

        registerStair(stairObsidian, BlockNames.stairObsidian);
        registerStair(stairEmerald, BlockNames.stairEmerald);
        registerStair(stairLapis, BlockNames.stairLapis);
        registerStair(stairBronze, BlockNames.stairBronze);
        registerStair(stairCoal, BlockNames.stairCoal);
        registerStair(stairGlowstone, BlockNames.stairGlowstone);
        registerStair(stairAdamantium, BlockNames.stairAdamantium);
        registerStair(stairSilk, BlockNames.stairSilk);

        registerBlock(singleSlabFT, ItemBlockSlabSingle.class, BlockNames.slabSingle, BlockNames.slabSingleFT);
        registerBlock(doubleSlabFT, ItemBlockSlabDouble.class, BlockNames.slabDouble, BlockNames.slabDoubleFT);
        registerBlock(leavesFT, ItemBlockLeavesFT.class, BlockNames.leaves, BlockNames.leavesFT);
        registerBlock(saplingFT, ItemBlockSaplingFT.class, BlockNames.saplings, BlockNames.saplingFT);
    }

    public static void registerBlock(Block block, String name)
    {
        GRHelper.registerBlock(block, ModInfo.modid, name);
    }

    public static void registerStair(BlockStairsFT stair, String name)
    {
        GameRegistry.registerBlock(stair, name);
        ModelHelper.getItemModelMesher().register(Item.getItemFromBlock(stair), 0, new ModelResLocFT(name));
        ModelBakery.addVariantName(Item.getItemFromBlock(stair), ModInfo.modid.toLowerCase() + ":" + name);
    }

    public static void registerFurnace(BlockFurnaceFT idle, BlockFurnaceFT active, Class<? extends TileEntity> tile, String tileName, String idleName, String activeName)
    {
        GameRegistry.registerBlock(idle, idleName);
        GameRegistry.registerBlock(active, activeName);
        GameRegistry.registerTileEntity(tile, tileName);
        ModelHelper.getItemModelMesher().register(Item.getItemFromBlock(idle), 0, new ModelResLocFT(idleName));
        ModelHelper.getItemModelMesher().register(Item.getItemFromBlock(active), 0, new ModelResLocFT(activeName));
        ModelBakery.addVariantName(Item.getItemFromBlock(idle), ModInfo.modid + ":" + idleName);
        ModelBakery.addVariantName(Item.getItemFromBlock(active), ModInfo.modid + ":" + activeName);
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemClass, String[] models, String name)
    {
        GameRegistry.registerBlock(block, itemClass, name);
        for(int i = 0; i < models.length; i++)
        {
            ModelHelper.getItemModelMesher().register(ItemBlock.getItemFromBlock(block), i, new ModelResLocFT(models[i]));
            ModelBakery.addVariantName(Item.getItemFromBlock(block), ModInfo.modid + ":" + models[i]);
        }
    }
}
