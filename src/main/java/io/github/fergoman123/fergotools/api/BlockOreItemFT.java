package io.github.fergoman123.fergotools.api;

import io.github.fergoman123.fergotools.common.CTFT;
import io.github.fergoman123.fergoutil.block.BlockFergo;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreItemFT extends BlockFergo
{
    public Item droppedItem;
    public int amountDropped;

    public BlockOreItemFT(String name, Item droppedItem, int amountDropped) {
        super(Material.rock, 0, CTFT.instance, 2.5f, 5.0f, name);
        this.droppedItem = droppedItem;
        this.amountDropped = amountDropped;
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this.droppedItem;
    }

    public int quantityDropped(Random rand) {
        return this.amountDropped;
    }
}
