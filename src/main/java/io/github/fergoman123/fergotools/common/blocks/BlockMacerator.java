/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.common.blocks;

import io.github.fergoman123.fergotools.api.base.BlockBases.BlockFurnaceFT;
import io.github.fergoman123.fergotools.common.tileentities.TileMacerator;
import io.github.fergoman123.fergotools.helper.FTHelper;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.GuiIds;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.Random;

public class BlockMacerator extends BlockFurnaceFT {
    public BlockMacerator(boolean isActive, String name) {
        super(Material.iron, isActive, name);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
        return getItemFromBlock(ModBlocks.maceratorIdle);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote)
        {
            return true;
        }
        else if (!playerIn.isSneaking())
        {
            TileMacerator macerator = (TileMacerator)worldIn.getTileEntity(pos);
            if (macerator != null)
            {
                FTHelper.openGui(playerIn, GuiIds.macerator, worldIn, pos);
                FTHelper.logInfo("Opened Macerator");
                return true;
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);

        if (stack.hasDisplayName())
        {
            ((TileMacerator)worldIn.getTileEntity(pos)).setCustomInventoryName(stack.getDisplayName());
        }
    }

    @Override
    public Item getItem(World world, BlockPos pos) {
        return getItemFromBlock(ModBlocks.maceratorIdle);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileMacerator();
    }

    public static void setState(boolean active, World world, BlockPos pos){
        IBlockState state = world.getBlockState(pos);
        TileEntity tile = world.getTileEntity(pos);
        keepInventory = true;

        if (active)
        {
            world.setBlockState(pos, ModBlocks.maceratorActive.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            world.setBlockState(pos, ModBlocks.maceratorActive.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
        }
        else
        {
            world.setBlockState(pos, ModBlocks.maceratorIdle.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            world.setBlockState(pos, ModBlocks.maceratorIdle.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
        }

        keepInventory = false;

        if (tile != null)
        {
            tile.validate();
            world.setTileEntity(pos, tile);
        }
    }
}
