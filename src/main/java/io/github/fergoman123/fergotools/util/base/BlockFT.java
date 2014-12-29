 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.base;


 import io.github.fergoman123.fergotools.creativetab.Tabs;
 import io.github.fergoman123.fergotools.reference.Reference;
 import io.github.fergoman123.fergoutil.helper.NameHelper;
 import net.minecraft.block.Block;
 import net.minecraft.block.material.Material;
 import net.minecraft.client.renderer.texture.IIconRegister;
 import net.minecraft.item.Item;

 import java.util.Random;

 public abstract class BlockFT extends Block
{


    public BlockFT(Material material) {
        super(material);
        this.setCreativeTab(Tabs.tabFergoBlocks);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public abstract void registerBlockIcons(IIconRegister register);

    public static String getBlockType(int type)
    {
        if (type == 0)
        {
            return "ore";
        }
        else if (type == 1)
        {
            return "block";
        }
        else
        {
            return null;
        }
    }

    public abstract Item getItemDropped(int metadata, Random rand, int fortune);
}
