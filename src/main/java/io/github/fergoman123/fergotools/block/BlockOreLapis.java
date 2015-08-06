package io.github.fergoman123.fergotools.block;

import java.util.Random;

import io.github.fergoman123.fergotools.init.ModItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOreLapis extends BlockOreFT{

	public BlockOreLapis(String name) {
		super(name);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.gemLapis;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}
	
	

}
