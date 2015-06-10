package io.github.fergoman123.fergotools.common.blocks;

import io.github.fergoman123.fergotools.api.base.BlockBases;
import io.github.fergoman123.fergotools.common.tileentities.TileSilkFurnace;
import io.github.fergoman123.fergotools.helper.FTHelper;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.gui.GuiIds;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockSilkFurnace extends BlockBases.BlockFurnaceFT
{
    public BlockSilkFurnace(boolean isActive, String name) {
        super(Material.iron, isActive, name);
    }

    @Override
    public Block getBlockDropped() {
        return ModBlocks.silkFurnaceIdle;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote && !playerIn.isSneaking())
        {
            TileSilkFurnace furnace = (TileSilkFurnace)worldIn.getTileEntity(pos);
            if (furnace != null)
            {
                FTHelper.openGui(playerIn, GuiIds.silkFurnace, worldIn, pos);
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
            ((TileSilkFurnace)worldIn.getTileEntity(pos)).setCustomInventoryName(stack.getDisplayName());
        }
    }

    @Override
    public Block getBlock() {
        return ModBlocks.silkFurnaceIdle;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileSilkFurnace();
    }

    public static void setState(boolean active, World world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        TileEntity tile = world.getTileEntity(pos);

        keepInventory = true;

        if (active)
        {
            world.setBlockState(pos, ModBlocks.silkFurnaceActive.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            world.setBlockState(pos, ModBlocks.silkFurnaceActive.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
        }
        else
        {
            world.setBlockState(pos, ModBlocks.silkFurnaceIdle.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            world.setBlockState(pos, ModBlocks.silkFurnaceIdle.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
        }

        keepInventory = false;

        if (tile != null)
        {
            tile.validate();
            world.setTileEntity(pos, tile);
        }
    }
}