package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.block.BlockStairsFergo;
import net.minecraft.block.state.IBlockState;

public class BlockStairsFT extends BlockStairsFergo
{
    public BlockStairsFT(IBlockState model, String name) {
        super(model, 0, FergoTools.tabFergoTools, name);
    }
}
