package io.github.fergoman123.fergotools.api.base;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public abstract class BlockOreFT extends BlockFT
{
    public BlockOreFT(String name) {
        super(Material.rock, 2.5f, 5f, name);
    }

    public abstract Item getItemDropped(IBlockState state, Random rand, int fortune);
    public abstract int quantityDropped(Random rand);
}
