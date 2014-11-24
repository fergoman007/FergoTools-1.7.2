/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.block.plank;

import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.util.base.BlockPlankFT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public final class BlockPlankBronze extends BlockPlankFT
{
    public BlockPlankBronze(String blockName) {
        super(blockName);
    }

    @Override
    public void registerBlockIcons(IIconRegister register)
    {
        this.blockIcon = register.registerIcon(Textures.plankBronze);
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
