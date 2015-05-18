package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.block.BlockLogFergo;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public abstract class BlockLogFT extends BlockLogFergo
{
    public BlockLogFT(String name) {
        super(0, FergoTools.tabFergoTools, name);
    }

    public abstract IBlockState getStateFromMeta(int meta);
    public abstract int getMetaFromState(IBlockState state);
    protected abstract BlockState createBlockState();
    public abstract ItemStack createStackedBlock(IBlockState state);
    public abstract int damageDropped(IBlockState state);
}
