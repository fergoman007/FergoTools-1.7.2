package io.github.fergoman123.fergotools.common.blocks;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.api.base.BlockFurnaceFT;
import io.github.fergoman123.fergotools.common.Tiles.TileQuartzFurnace;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergoutil.helper.GuiHelper;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.Random;

public class Furnaces
{
    public static final class BlockQuartzFurnace extends BlockFurnaceFT
    {
        public BlockQuartzFurnace(boolean isActive, String name)
        {
            super(Material.rock, isActive, name);
        }

        @Override
        public Item getItemDropped(IBlockState state, Random random, int fortune) {
            return Item.getItemFromBlock(ModBlocks.quartzFurnaceIdle);
        }

        @Override
        public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
            if (worldIn.isRemote)
            {
                return true;
            }
            else if (!playerIn.isSneaking())
            {
                TileQuartzFurnace furnace = (TileQuartzFurnace)worldIn.getTileEntity(pos);

                if (furnace != null)
                {
                    GuiHelper.openGui(playerIn, FergoTools.getInstance(), GuiIds.quartzFurnace, worldIn, pos);
                    FergoTools.getLogger().info("Opened Quartz Furnace");
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
                ((TileQuartzFurnace)worldIn.getTileEntity(pos)).setCustomInventoryName(stack.getDisplayName());
            }
        }

        @Override
        public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
            if (!keepInventory)
            {
                TileQuartzFurnace furnace = (TileQuartzFurnace)worldIn.getTileEntity(pos);
                if (furnace != null)
                {
                    InventoryHelper.dropInventoryItems(worldIn, pos, furnace);
                    worldIn.updateComparatorOutputLevel(pos, this);
                }
            }

            super.breakBlock(worldIn, pos, state);
        }

        @Override
        public Item getItem(World world, BlockPos pos) {
            return Item.getItemFromBlock(ModBlocks.quartzFurnaceIdle);
        }

        @Override
        public TileEntity createNewTileEntity(World worldIn, int meta) {
            return new TileQuartzFurnace();
        }

        public static void setState(boolean active, World world, BlockPos pos)
        {
            IBlockState state = world.getBlockState(pos);
            TileEntity tile = world.getTileEntity(pos);
            keepInventory = true;

            if (active)
            {
                world.setBlockState(pos, ModBlocks.quartzFurnaceActive.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
                world.setBlockState(pos, ModBlocks.quartzFurnaceActive.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            }
            else
            {
                world.setBlockState(pos, ModBlocks.quartzFurnaceIdle.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
                world.setBlockState(pos, ModBlocks.quartzFurnaceIdle.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            }

            keepInventory = false;

            if (tile != null)
            {
                tile.validate();
                world.setTileEntity(pos, tile);
            }
        }
    }
}
