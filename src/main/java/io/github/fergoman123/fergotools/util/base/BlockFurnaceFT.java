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

import io.github.fergoman123.fergoutil.block.BlockFergoFurnace;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.material.Material;

public abstract class BlockFurnaceFT extends BlockFergoFurnace
{
    /**
     * base class for furnace
     * @param isActive whether or not the furnace is active
     * @param material the block material
     * @param furnaceType the name of the furnace
     */
    public BlockFurnaceFT(boolean isActive, Material material, String furnaceType) {
        super(isActive, material, furnaceType);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), NameHelper.getFurnaceType(this.isActive));
    }
}
