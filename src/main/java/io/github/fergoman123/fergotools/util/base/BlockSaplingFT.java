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
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.world.gen.WorldGenTree;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

public class BlockSaplingFT extends BlockSapling
{
    public Block logBlock;
    public Block leafBlock;
    public BlockSaplingFT(Block logBlock, Block leafBlock)
    {
        super();
        this.logBlock = logBlock;
        this.leafBlock = leafBlock;
        this.setCreativeTab(Tabs.tabFergoWood);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public void registerBlockIcons(IIconRegister register){
        blockIcon = register.registerIcon(String.format("%s%s%s", Reference.textureLoc, Textures.saplingLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
    }

    public boolean isValidPosition(World world, int x, int y, int z, int metadata)
    {
        Block block = world.getBlock(x, y - 1, z);
        if (block == Blocks.grass || block == Blocks.dirt || block.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this))
        {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean canBlockStay(World world, int x, int y, int z)
    {
        Block soil = world.getBlock(x, y - 1, z);

        if (world.getFullBlockLightValue(x, y, z) >= 8 || world.canBlockSeeTheSky(x, y, z) && soil != null && soil.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void updateTick(World world, int x, int y, int z, Random rand)
    {
        if (!world.isRemote)
        {
            if (world.getBlockLightValue(x, y + 1, z) >= 9 && rand.nextInt(7) == 0)
            {
                //Todo: growTree
                this.func_149878_d(world, x, y, z, rand);
            }
        }
    }

    @Override
    //TODO: growTree
    public void func_149878_d(World world, int x, int y, int z, Random rand)
    {
        int meta = world.getBlockMetadata(x, y, z);
        Object obj = null;
        int rnd = rand.nextInt(8);

        if (obj == null)
        {
            switch (meta)
            {
                case 0: obj = new WorldGenTree(this.logBlock, this.leafBlock, 0, false);
                    break;
            }
        }

        if (obj != null)
        {
            world.setBlockToAir(x, y, z);

            if (!((WorldGenerator)obj).generate(world, rand, x, y, z))
            {
                world.setBlock(x, y, z, this, meta, 2);
            }
        }
    }




}
