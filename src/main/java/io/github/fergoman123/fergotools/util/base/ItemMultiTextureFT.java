/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

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
