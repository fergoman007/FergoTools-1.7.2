package io.github.fergoman123.fergotools.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public abstract class BlockOreFT extends BlockFT {

	public BlockOreFT(String name) {
		super(Material.rock, name);
		this.setHardness(2.5f);
		this.setResistance(5.0f);
	}
	
	public abstract Item getItemDropped(IBlockState state, Random rand, int fortune);
	
	public abstract int quantityDropped(Random rand);
}
