/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergotools.core.block.plank.BlockPlankObsidian;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class BlockPlankFT extends Block
{

    public String texture;

    public BlockPlankFT(String texture)
    {
        super(Material.wood);
        this.texture = texture;
        this.setCreativeTab(Tabs.tabFergoWood);

    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        blockIcon = register.registerIcon(String.format("%splank/%s/%s", Reference.textureLoc, this.texture.toLowerCase(), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z) {
        return true;
    }
}
