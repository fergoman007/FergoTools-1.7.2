package io.github.fergoman123.fergotools.core.block.stair;

import io.github.fergoman123.fergotools.util.base.BlockStairsFT;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123.
 */
public final class BlockStairSilk extends BlockStairsFT
{

    public BlockStairSilk(Block extender, String blockName) {
        super(extender, blockName);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
