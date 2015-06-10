/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class BlockBases
{
    public static class BlockFT extends BlockFergo
    {
        public BlockFT(Material material, float hardness, float resistance, String name) {
            super(material, 0, FergoTools.tabFergoTools, hardness, resistance, name);
        }
    }

    public static abstract class BlockFurnaceFT extends BlockFurnaceFergo
    {
        public BlockFurnaceFT(Material material, boolean isActive, String name) {
            super(material, isActive, 0, FergoTools.tabFergoTools, name);
        }
    }

    public static abstract class BlockLeavesFT extends BlockLeavesFergo
    {
        public BlockLeavesFT(String name) {
            super(0, FergoTools.tabFergoTools, name);
        }
    }

    public static abstract class BlockLogFT extends BlockLogFergo
    {
        public BlockLogFT(String name) {
            super(0, FergoTools.tabFergoTools, name);
        }

        public abstract IBlockState getStateFromMeta(int meta);
        public abstract int getMetaFromState(IBlockState state);
        public abstract BlockState createBlockState();
        public abstract ItemStack createStackedBlock(IBlockState state);
        public abstract int damageDropped(IBlockState state);
    }

    public static abstract class BlockOreFT extends BlockFT
    {
        public BlockOreFT(String name) {
            super(Material.rock, 2.5f, 5f, name);
        }

        public abstract Item getItemDropped(IBlockState state, Random random, int fortune);
        public abstract int quantityDropped(Random random);
    }

    public static class BlockStairsFT extends BlockStairsFergo
    {
        public BlockStairsFT(IBlockState modelState, String name) {
            super(modelState, 0, FergoTools.tabFergoTools, name);
        }
    }
}
