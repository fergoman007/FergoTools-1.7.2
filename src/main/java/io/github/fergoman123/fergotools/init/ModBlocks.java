package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.content.WoodTypes;
import io.github.fergoman123.fergotools.common.blocks.BlockAdamantiumFurnace;
import io.github.fergoman123.fergotools.common.blocks.BlockBronzeFurnace;
import io.github.fergoman123.fergotools.common.blocks.BlockCoalFurnace;
import io.github.fergoman123.fergotools.common.blocks.BlockEmeraldFurnace;
import io.github.fergoman123.fergotools.common.blocks.BlockFurnaceFT;
import io.github.fergoman123.fergotools.common.blocks.BlockGlowstoneFurnace;
import io.github.fergoman123.fergotools.common.blocks.BlockLapisFurnace;
import io.github.fergoman123.fergotools.common.blocks.BlockMacerator;
import io.github.fergoman123.fergotools.common.blocks.BlockMultiFT;
import io.github.fergoman123.fergotools.common.blocks.BlockObsidianFurnace;
import io.github.fergoman123.fergotools.common.blocks.BlockQuartzFurnace;
import io.github.fergoman123.fergotools.common.blocks.BlockRedstoneFurnace;
import io.github.fergoman123.fergotools.common.blocks.BlockSilkFurnace;
import io.github.fergoman123.fergotools.common.blocks.BlockStorageFT;
import io.github.fergoman123.fergotools.common.blocks.BlockWorkbenchFT;
import io.github.fergoman123.fergotools.common.blocks.Ores.BlockOreAdamantium;
import io.github.fergoman123.fergotools.common.blocks.Ores.BlockOreBronze;
import io.github.fergoman123.fergotools.common.blocks.Ores.BlockOreEmerald;
import io.github.fergoman123.fergotools.common.blocks.Ores.BlockOreExperience;
import io.github.fergoman123.fergotools.common.blocks.Ores.BlockOreFT;
import io.github.fergoman123.fergotools.common.blocks.Ores.BlockOreLapis;
import io.github.fergoman123.fergotools.common.blocks.Ores.BlockOreObsidian;
import io.github.fergoman123.fergotools.common.blocks.Ores.BlockOreRedstone;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockDSFT;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockHSFT;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockLeavesImpl;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockPlankFT;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockWoodLogFT;
import io.github.fergoman123.fergotools.common.blocks.wood.BlockWoodSlabFT;
import io.github.fergoman123.fergotools.common.itemblock.ItemBlockLeavesFT;
import io.github.fergoman123.fergotools.common.itemblock.ItemBlockLogFT;
import io.github.fergoman123.fergotools.common.itemblock.ItemBlockSaplingFT;
import io.github.fergoman123.fergotools.common.itemblock.ItemBlockSlabDouble;
import io.github.fergoman123.fergotools.common.itemblock.ItemBlockSlabSingle;
import io.github.fergoman123.fergotools.common.itemblock.ItemBlockStorageFT;
import io.github.fergoman123.fergotools.reference.BlockNames;
import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static BlockOreFT oreExperience;
    public static BlockOreFT oreObsidian;
    public static BlockOreFT oreGemEmerald;
    public static BlockOreFT oreGemLapis;
    public static BlockOreFT oreBronze;
    public static BlockOreFT oreAdamantium;
    public static BlockOreFT oreGemRedstone;

    public static BlockMultiFT storageFT;

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

    public static BlockContainerFergo netherrackFurnace;

    public static BlockLogFT logFT;
    public static BlockMultiFT plankFT;
    public static BlockLeavesImpl leavesFT;
    public static BlockSaplingFT saplingFT;

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

        storageFT = new BlockStorageFT(BlockNames.storageFT);

        quartzFurnaceIdle = new BlockQuartzFurnace(false, BlockNames.quartzFurnaceIdle);
        obsidianFurnaceIdle = new BlockObsidianFurnace(false, BlockNames.obsidianFurnaceIdle);
        emeraldFurnaceIdle = new BlockEmeraldFurnace(false, BlockNames.emeraldFurnaceIdle);
        lapisFurnaceIdle = new BlockLapisFurnace(false, BlockNames.lapisFurnaceIdle);
        bronzeFurnaceIdle = new BlockBronzeFurnace(false, BlockNames.bronzeFurnaceIdle);
        coalFurnaceIdle = new BlockCoalFurnace(false, BlockNames.coalFurnaceIdle);
        glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false, BlockNames.glowstoneFurnaceIdle);
        adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false, BlockNames.adamantiumFurnaceIdle);
        silkFurnaceIdle = new BlockSilkFurnace(false, BlockNames.silkFurnaceIdle);
        redstoneFurnaceIdle = new BlockRedstoneFurnace(false, BlockNames.redstoneFurnaceIdle);
        maceratorIdle = new BlockMacerator(false, BlockNames.maceratorIdle);

        quartzFurnaceActive = new BlockQuartzFurnace(true, BlockNames.quartzFurnaceActive);
        obsidianFurnaceActive = new BlockObsidianFurnace(true, BlockNames.obsidianFurnaceActive);
        emeraldFurnaceActive = new BlockEmeraldFurnace(true, BlockNames.emeraldFurnaceActive);
        lapisFurnaceActive = new BlockLapisFurnace(true, BlockNames.lapisFurnaceActive);
        bronzeFurnaceActive = new BlockBronzeFurnace(true, BlockNames.bronzeFurnaceActive);
        coalFurnaceActive = new BlockCoalFurnace(true, BlockNames.coalFurnaceActive);
        glowstoneFurnaceActive = new BlockGlowstoneFurnace(true, BlockNames.glowstoneFurnaceActive);
        adamantiumFurnaceActive = new BlockAdamantiumFurnace(true, BlockNames.adamantiumFurnaceActive);
        silkFurnaceActive = new BlockSilkFurnace(true, BlockNames.silkFurnaceActive);
        redstoneFurnaceActive = new BlockRedstoneFurnace(true, BlockNames.redstoneFurnaceActive);
        maceratorActive = new BlockMacerator(true, BlockNames.maceratorActive);

        logFT = new BlockWoodLogFT(BlockNames.logFT);
        plankFT = new BlockPlankFT(BlockNames.plankFT);
        leavesFT = new BlockLeavesImpl(BlockNames.leavesFT);
        saplingFT = new BlockSaplingFT();

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
        GameRegistry.registerBlock(oreExperience, BlockNames.oreExperience);
        GameRegistry.registerBlock(oreObsidian, BlockNames.oreObsidian);
        GameRegistry.registerBlock(oreGemEmerald, BlockNames.oreGemEmerald);
        GameRegistry.registerBlock(oreGemLapis, BlockNames.oreGemLapis);
        GameRegistry.registerBlock(oreBronze, BlockNames.oreBronze);
        GameRegistry.registerBlock(oreAdamantium, BlockNames.oreAdamantium);
        GameRegistry.registerBlock(oreGemRedstone, BlockNames.oreGemRedstone);

        GameRegistry.registerBlock(storageFT, ItemBlockStorageFT.class, BlockNames.storageFT);

        GameRegistry.registerBlock(quartzFurnaceIdle, BlockNames.quartzFurnaceIdle);
        GameRegistry.registerBlock(obsidianFurnaceIdle, BlockNames.obsidianFurnaceIdle);
        GameRegistry.registerBlock(emeraldFurnaceIdle, BlockNames.emeraldFurnaceIdle);
        GameRegistry.registerBlock(lapisFurnaceIdle, BlockNames.lapisFurnaceIdle);
        GameRegistry.registerBlock(bronzeFurnaceIdle, BlockNames.bronzeFurnaceIdle);
        GameRegistry.registerBlock(coalFurnaceIdle, BlockNames.coalFurnaceIdle);
        GameRegistry.registerBlock(glowstoneFurnaceIdle, BlockNames.glowstoneFurnaceIdle);
        GameRegistry.registerBlock(adamantiumFurnaceIdle, BlockNames.adamantiumFurnaceIdle);
        GameRegistry.registerBlock(silkFurnaceIdle, BlockNames.silkFurnaceIdle);
        GameRegistry.registerBlock(redstoneFurnaceIdle, BlockNames.redstoneFurnaceIdle);
        GameRegistry.registerBlock(maceratorIdle, BlockNames.maceratorIdle);

        GameRegistry.registerBlock(quartzFurnaceActive, BlockNames.quartzFurnaceActive);
        GameRegistry.registerBlock(obsidianFurnaceActive, BlockNames.obsidianFurnaceActive);
        GameRegistry.registerBlock(emeraldFurnaceActive, BlockNames.emeraldFurnaceActive);
        GameRegistry.registerBlock(lapisFurnaceActive, BlockNames.lapisFurnaceActive);
        GameRegistry.registerBlock(bronzeFurnaceActive, BlockNames.bronzeFurnaceActive);
        GameRegistry.registerBlock(coalFurnaceActive, BlockNames.coalFurnaceActive);
        GameRegistry.registerBlock(glowstoneFurnaceActive, BlockNames.glowstoneFurnaceActive);
        GameRegistry.registerBlock(adamantiumFurnaceActive, BlockNames.adamantiumFurnaceActive);
        GameRegistry.registerBlock(silkFurnaceActive, BlockNames.silkFurnaceActive);
        GameRegistry.registerBlock(redstoneFurnaceActive, BlockNames.redstoneFurnaceActive);
        GameRegistry.registerBlock(maceratorActive, BlockNames.maceratorActive);

        GameRegistry.registerBlock(logFT, ItemBlockLogFT.class, BlockNames.logFT);
        GameRegistry.registerBlock(plankFT, ItemBlockVariants.class, BlockNames.plankFT);
        GameRegistry.registerBlock(leavesFT, ItemBlockLeavesFT.class, BlockNames.leavesFT);
        GameRegistry.registerBlock(saplingFT, ItemBlockSaplingFT.class, BlockNames.saplingFT);

        GameRegistry.registerBlock(stairObsidian, BlockNames.stairObsidian);
        GameRegistry.registerBlock(stairEmerald, BlockNames.stairEmerald);
        GameRegistry.registerBlock(stairLapis, BlockNames.stairLapis);
        GameRegistry.registerBlock(stairBronze, BlockNames.stairBronze);
        GameRegistry.registerBlock(stairCoal, BlockNames.stairCoal);
        GameRegistry.registerBlock(stairGlowstone, BlockNames.stairGlowstone);
        GameRegistry.registerBlock(stairAdamantium, BlockNames.stairAdamantium);
        GameRegistry.registerBlock(stairSilk, BlockNames.stairSilk);
        GameRegistry.registerBlock(stairRedstone, BlockNames.stairRedstone);

        GameRegistry.registerBlock(singleSlabFT, ItemBlockSlabSingle.class, BlockNames.slabSingleFT);
        GameRegistry.registerBlock(doubleSlabFT, ItemBlockSlabDouble.class, BlockNames.slabDoubleFT);

        GameRegistry.registerBlock(obsidianWorkbench, BlockNames.workbenches[0]);
        GameRegistry.registerBlock(emeraldWorkbench, BlockNames.workbenches[1]);
        GameRegistry.registerBlock(lapisWorkbench, BlockNames.workbenches[2]);
        GameRegistry.registerBlock(bronzeWorkbench, BlockNames.workbenches[3]);
        GameRegistry.registerBlock(coalWorkbench, BlockNames.workbenches[4]);
        GameRegistry.registerBlock(glowstoneWorkbench, BlockNames.workbenches[5]);
        GameRegistry.registerBlock(adamantiumWorkbench, BlockNames.workbenches[6]);
        GameRegistry.registerBlock(silkWorkbench, BlockNames.workbenches[7]);
        GameRegistry.registerBlock(redstoneWorkbench, BlockNames.workbenches[8]);
    }
}
