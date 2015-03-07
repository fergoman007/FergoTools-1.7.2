package io.github.fergoman123.fergotools.common;

import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergoutil.helper.BlockStateHelper;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public class BlockStates
{
    public static final IBlockState quartzFurnaceIdle = getBlockState(ModBlocks.quartzFurnaceIdle);
    public static final IBlockState obsidianFurnaceIdle = getBlockState(ModBlocks.obsidianFurnaceIdle);
    public static final IBlockState emeraldFurnaceIdle = getBlockState(ModBlocks.emeraldFurnaceIdle);
    public static final IBlockState lapisFurnaceIdle = getBlockState(ModBlocks.lapisFurnaceIdle);
    public static final IBlockState bronzeFurnaceIdle = getBlockState(ModBlocks.bronzeFurnaceIdle);
    public static final IBlockState coalFurnaceIdle = getBlockState(ModBlocks.coalFurnaceIdle);
    public static final IBlockState glowstoneFurnaceIdle = getBlockState(ModBlocks.glowstoneFurnaceIdle);
    public static final IBlockState adamantiumFurnaceIdle = getBlockState(ModBlocks.adamantiumFurnaceIdle);
    public static final IBlockState silkFurnaceIdle = getBlockState(ModBlocks.silkFurnaceIdle);
    public static final IBlockState redstoneFurnaceIdle = getBlockState(ModBlocks.redstoneFurnaceIdle);
    public static final IBlockState maceratorIdle = getBlockState(ModBlocks.maceratorIdle);

    public static final IBlockState quartzFurnaceActive = getBlockState(ModBlocks.quartzFurnaceActive);
    public static final IBlockState obsidianFurnaceActive = getBlockState(ModBlocks.obsidianFurnaceActive);
    public static final IBlockState emeraldFurnaceActive = getBlockState(ModBlocks.emeraldFurnaceActive);
    public static final IBlockState lapisFurnaceActive = getBlockState(ModBlocks.lapisFurnaceActive);
    public static final IBlockState bronzeFurnaceActive = getBlockState(ModBlocks.bronzeFurnaceActive);
    public static final IBlockState coalFurnaceActive = getBlockState(ModBlocks.coalFurnaceActive);
    public static final IBlockState glowstoneFurnaceActive = getBlockState(ModBlocks.glowstoneFurnaceActive);
    public static final IBlockState adamantiumFurnaceActive = getBlockState(ModBlocks.adamantiumFurnaceActive);
    public static final IBlockState silkFurnaceActive = getBlockState(ModBlocks.silkFurnaceActive);
    public static final IBlockState redstoneFurnaceActive = getBlockState(ModBlocks.redstoneFurnaceActive);
    public static final IBlockState maceratorActive = getBlockState(ModBlocks.maceratorActive);

    public static IBlockState getBlockState(Block block)
    {
        return BlockStateHelper.blockToState(block);
    }
}
