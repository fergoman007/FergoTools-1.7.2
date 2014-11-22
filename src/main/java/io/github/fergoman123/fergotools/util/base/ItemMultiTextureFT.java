package io.github.fergoman123.fergotools.util.base;

import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

public class ItemMultiTextureFT extends ItemMultiTexture
{

    /**
     * main constuctor
     * @param block1 the first block
     * @param block2 the second block
     * @param blockNames the block subtypeNames
     */
    public ItemMultiTextureFT(Block block1, Block block2, String[] blockNames) {
        super(block1, block2, blockNames);
    }
}
