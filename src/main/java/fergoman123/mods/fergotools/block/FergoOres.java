 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergotools.block;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockFT;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class FergoOres
{
    public static final class BlockOreObsidian extends BlockFT
    {
        public BlockOreObsidian()
        {
            super(Material.rock);
            this.setBlockName(Names.Blocks.oreObsidian);
        }

        public Item getItemDropped(int metadata, Random random, int fortune)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockOreEmeraldCrystal extends BlockFT
    {
        public BlockOreEmeraldCrystal()
        {
            super(Material.rock);
            this.setBlockName(Names.Blocks.oreEmeraldCrystal);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return ModItems.emeraldCrystal;
        }
    }

    public static final class BlockOreLapisCrystal extends BlockFT
    {
        public BlockOreLapisCrystal()
        {
            super(Material.rock);
            this.setBlockName(Names.Blocks.oreLapisCrystal);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return ModItems.lapisCrystal;
        }
    }

    public static final class BlockOreBronze extends BlockFT
    {
        public BlockOreBronze()
        {
            super(Material.rock);
            this.setBlockName(Names.Blocks.oreBronze);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockOreAdamantium extends BlockFT
    {
        public BlockOreAdamantium()
        {
            super();
            this.setBlockName(Names.Blocks.oreAdamantium);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockOreExperience extends BlockFT
    {
        public BlockOreExperience()
        {
            super(Material.rock);
            this.setBlockName(Names.Blocks.oreExperience);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return ModItems.expShard;
        }

        public int quantityDropped(Random rand)
        {
            return 5 + rand.nextInt(3);
        }
    }

    public static final class BlockOreRedCrystal extends BlockFT
    {
        public BlockOreRedCrystal()
        {
            super(Material.iron);
            this.setBlockName(Names.Blocks.oreCrystalRed);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }
}
