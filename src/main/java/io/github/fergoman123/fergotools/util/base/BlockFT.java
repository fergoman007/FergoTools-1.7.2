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
 import net.minecraft.block.Block;
 import net.minecraft.block.material.Material;
 import net.minecraft.client.renderer.texture.IIconRegister;
 import net.minecraft.item.Item;

 import java.util.Random;

 public abstract class BlockFT extends Block
{
    /**
     * the base constructor for block classes
     * @param material the block material
     * @param blockName the block name
     */
    public BlockFT(Material material, String blockName)
    {
        super(material);
        this.setBlockName(blockName);
        this.setCreativeTab(Tabs.tabFergoBlocks);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", NameHelper.getModString(1), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public void registerBlockIcons(IIconRegister register)
    {
        blockIcon = register.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    /**
     *  gets the block or item dropped when block
     *  is broken
     * @param metadata the metadata of the item or block
     * @param rand the random
     * @param fortune the fortune
     * @return block or item
     */
    public abstract Item getItemDropped(int metadata, Random rand, int fortune);
}
