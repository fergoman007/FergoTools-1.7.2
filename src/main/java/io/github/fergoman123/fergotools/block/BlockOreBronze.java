package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreBronze extends Block{
    public BlockOreBronze() {
        super(Material.rock);
        this.setUnlocalizedName("fergotools." + BlockNames.oreBronze);
        this.setHardness(2.5f);
        this.setResistance(5.0f);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }
}