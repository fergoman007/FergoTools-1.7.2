/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.block.storage;

import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.util.base.BlockFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockExperience extends BlockFT
{

    public BlockExperience() {
        super(Material.iron);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(String.format("%sblock/storage/%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
    }
}
