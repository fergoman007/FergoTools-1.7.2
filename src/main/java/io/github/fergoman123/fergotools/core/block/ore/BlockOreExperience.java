/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.block.ore;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.util.base.BlockFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreExperience extends BlockFT
{

    public BlockOreExperience() {
        super(Material.rock);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return FTContent.shardExp;
    }

    public int quantityDropped(Random rand)
    {
        return 5 + rand.nextInt(3);
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(String.format("%sblock/ore/%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
    }
}
