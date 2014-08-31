 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergotools.util.base;

import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergotools.creativetab.CreativeTabsFergoTools;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;

import java.util.Random;

public abstract class BlockGlassFT extends BlockBreakable
{
    public BlockGlassFT()
    {
        super("glass", Material.glass, false);
        setCreativeTab(CreativeTabsFergoTools.tabFergoBlocks);
        setHardness(0.3f);
        setResistance(50f);
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
