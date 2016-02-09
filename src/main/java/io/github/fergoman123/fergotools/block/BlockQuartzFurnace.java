package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.handler.ConfigHandler;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.logging.LoggerUtils;
import io.github.fergoman123.fergotools.reference.BlockNames;
import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergotools.tab.CTFT;
import io.github.fergoman123.fergotools.tileentity.TileEntityQuartzFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

import java.util.Random;

public class BlockQuartzFurnace extends BlockContainer{

    public static final BlockQuartzFurnace idle = new BlockQuartzFurnace(false);
    public static final BlockQuartzFurnace active = new BlockQuartzFurnace(true);

    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    private final boolean isActive;
    private static boolean keepInventory;

    public BlockQuartzFurnace(boolean isActive){
        super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.isActive = isActive;
        if (isActive){
            this.setLightLevel(0.875f);
            this.setUnlocalizedName(BlockNames.quartzFurnaceActive);
        } else {
            this.setCreativeTab(CTFT.tabFergoBlocks);
            this.setUnlocalizedName(BlockNames.quartzFurnaceIdle);
        }
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return Item.getItemFromBlock(idle);
    }

    public void onBlockAdded(World world, BlockPos pos, IBlockState state){
        this.setDefaultFacing(world, pos, state);
    }

    private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!worldIn.isRemote)
        {
            Block a = worldIn.getBlockState(pos.north()).getBlock();
            Block b = worldIn.getBlockState(pos.south()).getBlock();
            Block c = worldIn.getBlockState(pos.west()).getBlock();
            Block d = worldIn.getBlockState(pos.east()).getBlock();
            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

            if (enumfacing == EnumFacing.NORTH && a.isFullBlock() && !b.isFullBlock())
                enumfacing = EnumFacing.SOUTH;
            else if (enumfacing == EnumFacing.SOUTH && b.isFullBlock() && !a.isFullBlock())
                enumfacing = EnumFacing.NORTH;
            else if (enumfacing == EnumFacing.WEST && c.isFullBlock() && !d.isFullBlock())
                enumfacing = EnumFacing.EAST;
            else if (enumfacing == EnumFacing.EAST && d.isFullBlock() && !c.isFullBlock())
                enumfacing = EnumFacing.WEST;

            worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
        }
    }

    @Override
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (this.isActive){
            EnumFacing facing = (EnumFacing)state.getValue(FACING);
            double d0 = (double)pos.getX() + 0.5D;
            double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
            double d2 = (double)pos.getZ() + 0.5D;
            double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;

            switch (facing){
                case WEST:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    break;
                case EAST:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    break;
                case NORTH:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D);
                    break;
                case SOUTH:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D);
            }
        }
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote){
            return true;
        } else if (!playerIn.isSneaking()){
            TileEntityQuartzFurnace furnace = (TileEntityQuartzFurnace)worldIn.getTileEntity(pos);
            if (furnace != null){
                playerIn.openGui(FergoTools.instance, GuiIds.quartzFurnace, worldIn, pos.getX(), pos.getY(), pos.getZ());
                if (ConfigHandler.debugEnabled) {
                    LoggerUtils.info("Opened QuartzFurnace");
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void setState(boolean isActive, World world, BlockPos pos){
        IBlockState state = world.getBlockState(pos);
        TileEntity tileEntity = world.getTileEntity(pos);
        keepInventory = true;

        if (isActive){
            world.setBlockState(pos, active.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            world.setBlockState(pos, active.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
        } else {
            world.setBlockState(pos, idle.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
            world.setBlockState(pos, idle.getDefaultState().withProperty(FACING, state.getValue(FACING)), 3);
        }

        keepInventory = false;

        if (tileEntity != null){
            tileEntity.validate();
            world.setTileEntity(pos, tileEntity);
        }
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityQuartzFurnace();
    }

    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
        if(stack.hasDisplayName()){
            ((TileEntityQuartzFurnace)worldIn.getTileEntity(pos)).setInventoryName(stack.getDisplayName());
        }
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        if (!keepInventory){
            InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityQuartzFurnace)worldIn.getTileEntity(pos));
            worldIn.updateComparatorOutputLevel(pos, this);
        }
        super.breakBlock(worldIn, pos, state);
    }

    @Override
    public boolean hasComparatorInputOverride() {
        return true;
    }

    @Override
    public int getComparatorInputOverride(World worldIn, BlockPos pos) {
        return Container.calcRedstone(worldIn.getTileEntity(pos));
    }

    @Override
    public Item getItem(World worldIn, BlockPos pos) {
        return Item.getItemFromBlock(idle);
    }

    @Override
    public int getRenderType() {
        return 3;
    }

    @Override
    public IBlockState getStateForEntityRender(IBlockState state) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.getFront(meta);
        if (facing.getAxis() == EnumFacing.Axis.Y){
            facing = EnumFacing.NORTH;
        }

        return this.getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing)state.getValue(FACING)).getIndex();
    }

    public BlockState createBlockState(){
        return new BlockState(this, FACING);
    }
}
