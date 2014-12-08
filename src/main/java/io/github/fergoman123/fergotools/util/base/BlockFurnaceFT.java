/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.base;


import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public abstract class BlockFurnaceFT extends BlockContainer
{
    public boolean isActive;
    public static boolean keepInventory;
    /**
     * base class for furnace
     * @param isActive whether or not the furnace is active
     * @param material the block material
     * @param furnaceType the name of the furnace
     */
    public BlockFurnaceFT(boolean isActive, Material material, String furnaceType) {
        super(material);
        this.setBlockName(furnaceType);
        this.setHardness(3.5f);
        this.setResistance(2000f);
        this.isActive = isActive;
    }

    public void setDefaultDirection(World world, int x, int y, int z)
    {
        if (!world.isRemote)
        {
            Block a = world.getBlock(x, y, z - 1);
            Block b = world.getBlock(x, y, z + 1);
            Block c = world.getBlock(x - 1, y, z);
            Block d = world.getBlock(x + 1, y, z);
            byte b0 = 3;

            if (a.func_149730_j() && !b.func_149730_j())
            {
                b0 = 3;
            }

            if (b.func_149730_j() && !a.func_149730_j())
            {
                b0 = 2;
            }

            if (c.func_149730_j() && !d.func_149730_j())
            {
                b0 = 5;
            }

            if (d.func_149730_j() && !c.func_149730_j())
            {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify(x, y, z, b0, 2);
        }
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), NameHelper.getFurnaceType(this.isActive));
    }
}
