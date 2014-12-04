/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.block.stair;

import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.util.base.BlockStairsFT;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.Random;

public final class BlockStairCoal extends BlockStairsFT
{

    public BlockStairCoal(String blockName) {
        super(FTContent.plankCoal, blockName);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
