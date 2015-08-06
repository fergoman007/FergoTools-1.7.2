package io.github.fergoman123.fergotools.block;

import java.util.Random;

import io.github.fergoman123.fergotools.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOreObsidian extends BlockOreFT{
	public BlockOreObsidian(String name){
		super(name);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.oreObsidian);
	}

	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}
}
