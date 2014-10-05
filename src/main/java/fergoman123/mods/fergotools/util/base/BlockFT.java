 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergotools.util.base;

import fergoman123.mods.fergotools.creativetab.Tabs;
import fergoman123.mods.fergoutil.block.FergoBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

 public abstract class BlockFT extends FergoBlock
{
    public BlockFT(Material material) {
        super(material, Tabs.tabFergoBlocks, 1);
    }
}
