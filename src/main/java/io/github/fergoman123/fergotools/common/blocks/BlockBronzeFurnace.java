package io.github.fergoman123.fergotools.common.blocks;

import java.util.Random;

import io.github.fergoman123.fergotools.api.base.BlockBases.BlockFurnaceFT;
import io.github.fergoman123.fergotools.common.tileentities.TileBronzeFurnace;
import io.github.fergoman123.fergotools.helper.FTHelper;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.GuiIds;
import net.minecraft.block.Block;
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

public class BlockBronzeFurnace extends BlockFurnaceFT {
    public BlockBronzeFurnace(boolean isActive, String name) {
        super(Material.iron, isActive, name);
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
    	return Item.getItemFromBlock(ModBlocks.bronzeFurnaceIdle);
    }
    
    @Override
    public Item getItem(World world, BlockPos pos) {
    	return Item.getItemFromBlock(ModBlocks.bronzeFurnaceIdle);
    }
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote && !playerIn.isSneaking()){
            TileBronzeFurnace furnace = (TileBronzeFurnace)worldIn.getTileEntity(pos);
            if (furnace != null){
                FTHelper.openGui(playerIn, GuiIds.bronzeFurnace, worldIn, pos);
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

        if (stack.hasDisplayName()){
            ((TileBronzeFurnace)worldIn.getTileEntity(pos)).setCustomInventoryName(stack.getDisplayName());
        }
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        if (!keepInventory){
            TileBronzeFurnace furnace = (TileBronzeFurnace)worldIn.getTileEntity(pos);
            if (furnace != null){
                InventoryHelper.dropInventoryItems(worldIn, pos, furnace);
                worldIn.updateComparatorOutputLevel(pos, this);
            }
        }

        super.breakBlock(worldIn, pos, state);
    }

    public TileEntity createNewTileEntity(World world, int meta){
        return new TileBronzeFurnace();
    }

    public static void setState(boolean active, World world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        TileEntity entity = world.getTileEntity(pos);

        keepInventory = true;

        if (active)
        {
            world.setBlockState(pos, ModBlocks.bronzeFurnaceActive.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            world.setBlockState(pos, ModBlocks.bronzeFurnaceActive.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
        }
        else
        {
            world.setBlockState(pos, ModBlocks.bronzeFurnaceIdle.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            world.setBlockState(pos, ModBlocks.bronzeFurnaceIdle.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
        }

        keepInventory = false;
        if (entity != null) {
            entity.validate();
            world.setTileEntity(pos, entity);
        }
    }
}