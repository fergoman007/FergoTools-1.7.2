package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.block.BlockStairsFergo;
import net.minecraft.block.state.IBlockState;

public class BlockStairsFT extends BlockStairsFergo{

    public BlockStairsFT(IBlockState modelState, String name) {
        super(modelState, "ft", FergoTools.tabFergoTools, name);
    }
}
