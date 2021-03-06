 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;

import java.util.Random;

public abstract class BlockGlassFT extends BlockBreakable
{
    public BlockGlassFT()
    {
        super("glass", Material.rock, false);
        setCreativeTab(Tabs.tabFergoBlocks);
        setBlockUnbreakable();
        setStepSound(Block.soundTypeGlass);
    }

    public int quantityDropped(Random rand){
       return  1;
    }

    public boolean isOpaqueCube(){return false;}

    public boolean renderAsNormalBlock(){
        return false;
    }

    public String getUnlocalizedName()
    {
        return NameHelper.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
}
