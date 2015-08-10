package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.block.BlockStairsFergo;
import net.minecraft.block.state.IBlockState;

public class BlockStairFT extends BlockStairsFergo{

	public BlockStairFT(IBlockState modelState, String name) {
		super(modelState, "ft", FergoTools.tabFergoTools, name);
	}

}
