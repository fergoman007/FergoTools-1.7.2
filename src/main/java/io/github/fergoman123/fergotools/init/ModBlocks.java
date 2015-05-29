package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.base.BlockBases.*;
import io.github.fergoman123.fergotools.api.base.ModelResLocFT;
import io.github.fergoman123.fergotools.api.content.WoodTypes;
import io.github.fergoman123.fergotools.common.blocks.*;
import io.github.fergoman123.fergotools.common.blocks.Ores.*;
import io.github.fergoman123.fergotools.common.blocks.wood.*;
import io.github.fergoman123.fergotools.common.itemblock.*;
import io.github.fergoman123.fergotools.reference.BlockInfos;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.util.VariantNameFT;
import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
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

    public static BlockWorkbenchFT obsidianWorkbench;
    public static BlockWorkbenchFT emeraldWorkbench;
    public static BlockWorkbenchFT lapisWorkbench;
    public static BlockWorkbenchFT bronzeWorkbench;
    public static BlockWorkbenchFT coalWorkbench;
    public static BlockWorkbenchFT glowstoneWorkbench;
    public static BlockWorkbenchFT adamantiumWorkbench;
    public static BlockWorkbenchFT silkWorkbench;
    public static BlockWorkbenchFT redstoneWorkbench;

    public static void init() {
        oreExperience = new BlockOreExperience();
        oreObsidian = new BlockOreObsidian();
        oreGemEmerald = new BlockOreEmerald();
        oreGemLapis = new BlockOreLapis();
        oreBronze = new BlockOreBronze();
        oreAdamantium = new BlockOreAdamantium();
        oreGemRedstone = new BlockOreRedstone();

        storageFT = new BlockStorageFT(BlockNames.blocks, BlockNames.storageFT);

        quartzFurnaceIdle = new BlockQuartzFurnace(false, BlockInfos.quartzFurnaceIdle);
        obsidianFurnaceIdle = new BlockObsidianFurnace(false, BlockNames.obsidianFurnaceIdle);
//        emeraldFurnaceIdle = new BlockEmeraldFurnace(false, BlockNames.emeraldFurnaceIdle);
//    lapisFurnaceIdle = new BlockLapisFurnace(false, BlockNames.lapisFurnaceIdle);
//    bronzeFurnaceIdle = new BlockBronzeFurnace(false, BlockNames.bronzeFurnaceIdle);
//    coalFurnaceIdle = new BlockCoalFurnace(false, BlockNames.coalFurnaceIdle);
//    glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false, BlockNames.glowstoneFurnaceIdle);
//    adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false, BlockNames.adamantiumFurnaceIdle);
//    silkFurnaceIdle = new BlockSilkFurnace(false, BlockNames.silkFurnaceIdle);
//    redstoneFurnaceIdle = new BlockRedstoneFurnace(false, BlockNames.redstoneFurnaceIdle);
        maceratorIdle = new BlockMacerator(false, BlockNames.maceratorIdle);

        quartzFurnaceActive = new BlockQuartzFurnace(true, BlockNames.quartzFurnaceActive);
        obsidianFurnaceActive = new BlockObsidianFurnace(true, BlockNames.obsidianFurnaceActive);
//        emeraldFurnaceActive = new BlockEmeraldFurnace(true, BlockNames.emeraldFurnaceActive);
//    lapisFurnaceActive = new BlockLapisFurnace(true, BlockNames.lapisFurnaceActive);
//    bronzeFurnaceActive = new BlockBronzeFurnace(true, BlockNames.bronzeFurnaceActive);
//    coalFurnaceActive = new BlockCoalFurnace(true, BlockNames.coalFurnaceActive);
//    glowstoneFurnaceActive = new BlockGlowstoneFurnace(true, BlockNames.glowstoneFurnaceActive);
//    adamantiumFurnaceActive = new BlockAdamantiumFurnace(true, BlockNames.adamantiumFurnaceActive);
//    silkFurnaceActive = new BlockSilkFurnace(true, BlockNames.silkFurnaceActive);
//    redstoneFurnaceActive = new BlockRedstoneFurnace(true, BlockNames.redstoneFurnaceActive);
        maceratorActive = new BlockMacerator(true, BlockNames.maceratorActive);


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

        obsidianWorkbench = new BlockWorkbenchFT(0);
        emeraldWorkbench = new BlockWorkbenchFT(1);
        lapisWorkbench = new BlockWorkbenchFT(2);
        bronzeWorkbench = new BlockWorkbenchFT(3);
        coalWorkbench = new BlockWorkbenchFT(4);
        glowstoneWorkbench = new BlockWorkbenchFT(5);
        adamantiumWorkbench = new BlockWorkbenchFT(6);
        silkWorkbench = new BlockWorkbenchFT(7);
        redstoneWorkbench = new BlockWorkbenchFT(8);
    }

    public static void registerBlocks() {
        registerBlock(oreExperience, BlockNames.oreExperience);
        registerBlock(oreObsidian, BlockNames.oreObsidian);
        registerBlock(oreGemEmerald, BlockNames.oreGemEmerald);
        registerBlock(oreGemLapis, BlockNames.oreGemLapis);
        registerBlock(oreBronze, BlockNames.oreBronze);
        registerBlock(oreAdamantium, BlockNames.oreAdamantium);
        registerBlock(oreGemRedstone, BlockNames.oreGemRedstone);

        registerBlock(storageFT, BlockNames.storageFT);

        // idle
        registerBlock(quartzFurnaceIdle, BlockNames.quartzFurnaceIdle);
        registerBlock(obsidianFurnaceIdle, BlockNames.obsidianFurnaceIdle);
//        registerBlock(emeraldFurnaceIdle, BlockNames.emeraldFurnaceIdle);

        registerBlock(maceratorIdle, BlockNames.maceratorIdle);

        // active
        registerBlock(quartzFurnaceActive, BlockNames.quartzFurnaceActive);
        registerBlock(obsidianFurnaceActive, BlockNames.obsidianFurnaceActive);
//        registerBlock(emeraldFurnaceActive, BlockNames.emeraldFurnaceActive);

        registerBlock(maceratorActive, BlockNames.maceratorActive);

        registerBlock(logFT, ItemBlockLogFT.class, BlockNames.logFT);
        registerBlock(plankFT, ItemBlockPlankFT.class, BlockNames.plankFT);

        registerBlock(stairObsidian, BlockNames.stairObsidian);
        registerBlock(stairEmerald, BlockNames.stairEmerald);
        registerBlock(stairLapis, BlockNames.stairLapis);
        registerBlock(stairBronze, BlockNames.stairBronze);
        registerBlock(stairCoal, BlockNames.stairCoal);
        registerBlock(stairGlowstone, BlockNames.stairGlowstone);
        registerBlock(stairAdamantium, BlockNames.stairAdamantium);
        registerBlock(stairSilk, BlockNames.stairSilk);
        registerBlock(stairRedstone, BlockNames.stairRedstone);

        registerBlock(singleSlabFT, ItemBlockSlabSingle.class, BlockNames.slabSingleFT);
        registerBlock(doubleSlabFT, ItemBlockSlabDouble.class, BlockNames.slabDoubleFT);
        registerBlock(leavesFT, ItemBlockLeavesFT.class, BlockNames.leavesFT);
        registerBlock(saplingFT, ItemBlockSaplingFT.class, BlockNames.saplingFT);

        registerBlock(obsidianWorkbench, BlockNames.workbenches[0]);
        registerBlock(emeraldWorkbench, BlockNames.workbenches[1]);
        registerBlock(lapisWorkbench, BlockNames.workbenches[2]);
        registerBlock(bronzeWorkbench, BlockNames.workbenches[3]);
        registerBlock(coalWorkbench, BlockNames.workbenches[4]);
        registerBlock(glowstoneWorkbench, BlockNames.workbenches[5]);
        registerBlock(adamantiumWorkbench, BlockNames.workbenches[6]);
        registerBlock(silkWorkbench, BlockNames.workbenches[7]);
        registerBlock(redstoneWorkbench, BlockNames.workbenches[8]);
    }

    public static void registerModels() {
        registerModel(oreExperience, BlockNames.oreExperience);
        registerModel(oreObsidian, BlockNames.oreObsidian);
        registerModel(oreGemEmerald, BlockNames.oreGemEmerald);
        registerModel(oreGemLapis, BlockNames.oreGemLapis);
        registerModel(oreBronze, BlockNames.oreBronze);
        registerModel(oreAdamantium, BlockNames.oreAdamantium);
        registerModel(oreGemRedstone, BlockNames.oreGemRedstone);

        registerModel(storageFT, 0, BlockNames.blocks[0]);
        registerModel(storageFT, 1, BlockNames.blocks[1]);
        registerModel(storageFT, 2, BlockNames.blocks[2]);
        registerModel(storageFT, 3, BlockNames.blocks[3]);
        registerModel(storageFT, 4, BlockNames.blocks[4]);
        registerModel(storageFT, 5, BlockNames.blocks[5]);
        registerModel(storageFT, 6, BlockNames.blocks[6]);
        registerModel(storageFT, 7, BlockNames.blocks[7]);
        registerModel(storageFT, 8, BlockNames.blocks[8]);
        registerModel(storageFT, 9, BlockNames.blocks[9]);
        registerModel(storageFT, 10, BlockNames.blocks[10]);

        // idle
        registerModel(quartzFurnaceIdle, BlockNames.quartzFurnaceIdle);
        registerModel(obsidianFurnaceIdle, BlockNames.obsidianFurnaceIdle);
//        registerModel(emeraldFurnaceIdle, BlockNames.emeraldFurnaceIdle);

        registerModel(maceratorIdle, BlockNames.maceratorIdle);

        //active
        registerModel(quartzFurnaceActive, BlockNames.quartzFurnaceActive);
        registerModel(obsidianFurnaceActive, BlockNames.obsidianFurnaceActive);
//        registerModel(emeraldFurnaceActive, BlockNames.emeraldFurnaceActive);

        registerModel(maceratorActive, BlockNames.maceratorActive);

        registerModel(logFT, 0, BlockNames.logs[0]);
        registerModel(logFT, 1, BlockNames.logs[1]);
        registerModel(logFT, 2, BlockNames.logs[2]);
        registerModel(logFT, 3, BlockNames.logs[3]);
        registerModel(logFT, 4, BlockNames.logs[4]);
        registerModel(logFT, 5, BlockNames.logs[5]);
        registerModel(logFT, 6, BlockNames.logs[6]);
        registerModel(logFT, 7, BlockNames.logs[7]);
        registerModel(logFT, 8, BlockNames.logs[8]);

        registerModel(plankFT, 0, BlockNames.planks[0]);
        registerModel(plankFT, 1, BlockNames.planks[1]);
        registerModel(plankFT, 2, BlockNames.planks[2]);
        registerModel(plankFT, 3, BlockNames.planks[3]);
        registerModel(plankFT, 4, BlockNames.planks[4]);
        registerModel(plankFT, 5, BlockNames.planks[5]);
        registerModel(plankFT, 6, BlockNames.planks[6]);
        registerModel(plankFT, 7, BlockNames.planks[7]);
        registerModel(plankFT, 8, BlockNames.planks[8]);

        registerModel(stairObsidian, BlockNames.stairs[0]);
        registerModel(stairEmerald, BlockNames.stairs[1]);
        registerModel(stairLapis, BlockNames.stairs[2]);
        registerModel(stairBronze, BlockNames.stairs[3]);
        registerModel(stairCoal, BlockNames.stairs[4]);
        registerModel(stairGlowstone, BlockNames.stairs[5]);
        registerModel(stairAdamantium, BlockNames.stairs[6]);
        registerModel(stairSilk, BlockNames.stairs[7]);
        registerModel(stairRedstone, BlockNames.stairs[8]);

        registerModel(singleSlabFT, 0, BlockNames.slabSingle[0]);
        registerModel(singleSlabFT, 1, BlockNames.slabSingle[1]);
        registerModel(singleSlabFT, 2, BlockNames.slabSingle[2]);
        registerModel(singleSlabFT, 3, BlockNames.slabSingle[3]);
        registerModel(singleSlabFT, 4, BlockNames.slabSingle[4]);
        registerModel(singleSlabFT, 5, BlockNames.slabSingle[5]);
        registerModel(singleSlabFT, 6, BlockNames.slabSingle[6]);
        registerModel(singleSlabFT, 7, BlockNames.slabSingle[7]);
        registerModel(singleSlabFT, 8, BlockNames.slabSingle[8]);

        registerModel(doubleSlabFT, 0, BlockNames.slabDouble[0]);
        registerModel(doubleSlabFT, 1, BlockNames.slabDouble[1]);
        registerModel(doubleSlabFT, 2, BlockNames.slabDouble[2]);
        registerModel(doubleSlabFT, 3, BlockNames.slabDouble[3]);
        registerModel(doubleSlabFT, 4, BlockNames.slabDouble[4]);
        registerModel(doubleSlabFT, 5, BlockNames.slabDouble[5]);
        registerModel(doubleSlabFT, 6, BlockNames.slabDouble[6]);
        registerModel(doubleSlabFT, 7, BlockNames.slabDouble[7]);
        registerModel(doubleSlabFT, 8, BlockNames.slabDouble[8]);

        registerModel(leavesFT, 0, BlockNames.leaves[0]);
        registerModel(leavesFT, 1, BlockNames.leaves[1]);
        registerModel(leavesFT, 2, BlockNames.leaves[2]);
        registerModel(leavesFT, 3, BlockNames.leaves[3]);
        registerModel(leavesFT, 4, BlockNames.leaves[4]);
        registerModel(leavesFT, 5, BlockNames.leaves[5]);
        registerModel(leavesFT, 6, BlockNames.leaves[6]);
        registerModel(leavesFT, 7, BlockNames.leaves[7]);
        registerModel(leavesFT, 8, BlockNames.leaves[8]);

        registerModel(saplingFT, 0, BlockNames.saplings[0]);
        registerModel(saplingFT, 1, BlockNames.saplings[1]);
        registerModel(saplingFT, 2, BlockNames.saplings[2]);
        registerModel(saplingFT, 3, BlockNames.saplings[3]);
        registerModel(saplingFT, 4, BlockNames.saplings[4]);
        registerModel(saplingFT, 5, BlockNames.saplings[5]);
        registerModel(saplingFT, 6, BlockNames.saplings[6]);
        registerModel(saplingFT, 7, BlockNames.saplings[7]);
        registerModel(saplingFT, 8, BlockNames.saplings[8]);

        registerModel(obsidianWorkbench, BlockNames.workbenches[0]);
        registerModel(emeraldWorkbench, BlockNames.workbenches[1]);
        registerModel(lapisWorkbench, BlockNames.workbenches[2]);
        registerModel(bronzeWorkbench, BlockNames.workbenches[3]);
        registerModel(coalWorkbench, BlockNames.workbenches[4]);
        registerModel(glowstoneWorkbench, BlockNames.workbenches[5]);
        registerModel(adamantiumWorkbench, BlockNames.workbenches[6]);
        registerModel(silkWorkbench, BlockNames.workbenches[7]);
        registerModel(redstoneWorkbench, BlockNames.workbenches[8]);
    }

    public static void registerBlock(Block block, String name) {
        GameRegistry.registerBlock(block, name);
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemClass, String name) {
        GameRegistry.registerBlock(block, itemClass, name);
    }

    public static void registerModel(Block block, int meta, String name) {
        ModelHelper.getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResLocFT(name));
        ModelBakery.addVariantName(Item.getItemFromBlock(block), new VariantNameFT(name).getFullName());
    }

    public static void registerModel(Block block, String name) {
        registerModel(block, 0, name);
    }
}
