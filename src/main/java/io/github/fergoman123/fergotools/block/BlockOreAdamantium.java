package io.github.fergoman123.fergotools.block;

import java.util.Random;

import io.github.fergoman123.fergotools.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOreAdamantium extends BlockOreFT{

	

	public BlockOreAdamantium(String name) {
		super(name);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.oreAdamantium);
	}

	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}

}
