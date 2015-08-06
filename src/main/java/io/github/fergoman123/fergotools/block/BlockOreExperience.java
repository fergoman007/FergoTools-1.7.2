package io.github.fergoman123.fergotools.block;

import java.util.Random;

import io.github.fergoman123.fergotools.init.ModItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOreExperience extends BlockOreFT {

	public BlockOreExperience(String name) {
		super(name);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.shardExp;
	}
	
	@Override
	public int quantityDropped(Random random) {
		return 4 + random.nextInt(5);
	}

}
