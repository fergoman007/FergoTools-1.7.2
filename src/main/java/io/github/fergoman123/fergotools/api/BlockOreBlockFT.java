package io.github.fergoman123.fergotools.api;

import io.github.fergoman123.fergotools.common.CTFT;
import io.github.fergoman123.fergoutil.block.BlockFergo;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreBlockFT extends BlockFergo
{
    public BlockOreBlockFT(String name) {
        super(Material.rock, 0, CTFT.instance, 2.5f, 5f, name);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
