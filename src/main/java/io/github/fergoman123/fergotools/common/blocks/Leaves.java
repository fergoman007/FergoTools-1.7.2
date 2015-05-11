package io.github.fergoman123.fergotools.common.blocks;

import io.github.fergoman123.fergotools.api.base.BlockLeavesFT;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaves
{
    public static final class BlockLeavesObsidian extends BlockLeavesFT
    {
        public BlockLeavesObsidian() {
            super(BlockNames.leaves[0]);
        }



        @Override
        public int getRenderColor(IBlockState state) {
            if (state.getBlock() != this)
            {
                return super.getRenderColor(state);
            }
            else
            {
                return ColorizerFoliage.getFoliageColorBasic();
            }
        }

        @Override
        public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
            return ColorizerFoliage.getFoliageColorBasic();
        }

        @Override
        protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.apple, 1, 0));
        }

        @Override
        protected int getSaplingDropChance(IBlockState state) {
            return super.getSaplingDropChance(state);
        }

        @Override
        public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te) {
            if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemShears)
            {
                player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
                spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1, 0));
            }
            else
            {
                super.harvestBlock(worldIn, player, pos, state, te);
            }
        }

        @Override
        public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
            IBlockState state = world.getBlockState(pos);
            return new ArrayList<ItemStack>(Collections.singletonList(new ItemStack(Item.getItemFromBlock(this), 1, 0)));
        }
    }

    public static final class BlockLeavesEmerald extends BlockLeavesFT
    {
        public BlockLeavesEmerald() {
            super(BlockNames.leaves[1]);
        }

        @Override
        public int getRenderColor(IBlockState state) {
            if (state.getBlock() != this)
            {
                return super.getRenderColor(state);
            }
            else
            {
                return ColorizerFoliage.getFoliageColorBasic();
            }
        }

        @Override
        public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
            return ColorizerFoliage.getFoliageColorBasic();
        }

        @Override
        protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.apple, 1, 0));
        }

        @Override
        protected int getSaplingDropChance(IBlockState state) {
            return super.getSaplingDropChance(state);
        }

        @Override
        public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te) {
            if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemShears)
            {
                player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
                spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1, 0));
            }
            else
            {
                super.harvestBlock(worldIn, player, pos, state, te);
            }
        }

        @Override
        public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
            IBlockState state = world.getBlockState(pos);
            return new ArrayList<ItemStack>(Collections.singletonList(new ItemStack(Item.getItemFromBlock(this), 1, 0)));
        }
    }

    public static final class BlockLeavesLapis extends BlockLeavesFT
    {
        public BlockLeavesLapis() {
            super(BlockNames.leaves[2]);
        }

        @Override
        public int getRenderColor(IBlockState state) {
            if (state.getBlock() != this)
            {
                return super.getRenderColor(state);
            }
            else
            {
                return ColorizerFoliage.getFoliageColorBasic();
            }
        }

        @Override
        public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
            return ColorizerFoliage.getFoliageColorBasic();
        }

        @Override
        protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.apple, 1, 0));
        }

        @Override
        protected int getSaplingDropChance(IBlockState state) {
            return super.getSaplingDropChance(state);
        }

        @Override
        public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te) {
            if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemShears)
            {
                player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
                spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1, 0));
            }
            else
            {
                super.harvestBlock(worldIn, player, pos, state, te);
            }
        }

        @Override
        public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
            IBlockState state = world.getBlockState(pos);
            return new ArrayList<ItemStack>(Collections.singletonList(new ItemStack(Item.getItemFromBlock(this), 1, 0)));
        }
    }

    public static final class BlockLeavesBronze extends BlockLeavesFT
    {
        public BlockLeavesBronze() {
            super(BlockNames.leaves[3]);
        }

        @Override
        public int getRenderColor(IBlockState state) {
            if (state.getBlock() != this)
            {
                return super.getRenderColor(state);
            }
            else
            {
                return ColorizerFoliage.getFoliageColorBasic();
            }
        }

        @Override
        public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
            return ColorizerFoliage.getFoliageColorBasic();
        }

        @Override
        protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.apple, 1, 0));
        }

        @Override
        protected int getSaplingDropChance(IBlockState state) {
            return super.getSaplingDropChance(state);
        }

        @Override
        public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te) {
            if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemShears)
            {
                player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
                spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1, 0));
            }
            else
            {
                super.harvestBlock(worldIn, player, pos, state, te);
            }
        }

        @Override
        public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
            IBlockState state = world.getBlockState(pos);
            return new ArrayList<ItemStack>(Collections.singletonList(new ItemStack(Item.getItemFromBlock(this), 1, 0)));
        }
    }

    public static final class BlockLeavesCoal extends BlockLeavesFT
    {
        public BlockLeavesCoal() {
            super(BlockNames.leaves[4]);
        }

        @Override
        public int getRenderColor(IBlockState state) {
            if (state.getBlock() != this)
            {
                return super.getRenderColor(state);
            }
            else
            {
                return ColorizerFoliage.getFoliageColorBasic();
            }
        }

        @Override
        public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
            return ColorizerFoliage.getFoliageColorBasic();
        }

        @Override
        protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.apple, 1, 0));
        }

        @Override
        protected int getSaplingDropChance(IBlockState state) {
            return super.getSaplingDropChance(state);
        }

        @Override
        public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te) {
            if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemShears)
            {
                player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
                spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1, 0));
            }
            else
            {
                super.harvestBlock(worldIn, player, pos, state, te);
            }
        }

        @Override
        public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
            IBlockState state = world.getBlockState(pos);
            return new ArrayList<ItemStack>(Collections.singletonList(new ItemStack(Item.getItemFromBlock(this), 1, 0)));
        }
    }

    public static final class BlockLeavesGlowstone extends BlockLeavesFT
    {
        public BlockLeavesGlowstone() {
            super(BlockNames.leaves[5]);
        }

        @Override
        public int getRenderColor(IBlockState state) {
            if (state.getBlock() != this)
            {
                return super.getRenderColor(state);
            }
            else
            {
                return ColorizerFoliage.getFoliageColorBasic();
            }
        }

        @Override
        public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
            return ColorizerFoliage.getFoliageColorBasic();
        }

        @Override
        protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.apple, 1, 0));
        }

        @Override
        protected int getSaplingDropChance(IBlockState state) {
            return super.getSaplingDropChance(state);
        }

        @Override
        public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te) {
            if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemShears)
            {
                player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
                spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1, 0));
            }
            else
            {
                super.harvestBlock(worldIn, player, pos, state, te);
            }
        }

        @Override
        public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
            IBlockState state = world.getBlockState(pos);
            return new ArrayList<ItemStack>(Collections.singletonList(new ItemStack(Item.getItemFromBlock(this), 1, 0)));
        }
    }

    public static final class BlockLeavesAdamantium extends BlockLeavesFT
    {
        public BlockLeavesAdamantium() {
            super(BlockNames.leaves[6]);
        }

        @Override
        public int getRenderColor(IBlockState state) {
            if (state.getBlock() != this)
            {
                return super.getRenderColor(state);
            }
            else
            {
                return ColorizerFoliage.getFoliageColorBasic();
            }
        }

        @Override
        public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
            return ColorizerFoliage.getFoliageColorBasic();
        }

        @Override
        protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.apple, 1, 0));
        }

        @Override
        protected int getSaplingDropChance(IBlockState state) {
            return super.getSaplingDropChance(state);
        }

        @Override
        public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te) {
            if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemShears)
            {
                player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
                spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1, 0));
            }
            else
            {
                super.harvestBlock(worldIn, player, pos, state, te);
            }
        }

        @Override
        public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
            IBlockState state = world.getBlockState(pos);
            return new ArrayList<ItemStack>(Collections.singletonList(new ItemStack(Item.getItemFromBlock(this), 1, 0)));
        }
    }

    public static final class BlockLeavesSilk extends BlockLeavesFT
    {
        public BlockLeavesSilk() {
            super(BlockNames.leaves[7]);
        }

        @Override
        public int getRenderColor(IBlockState state) {
            if (state.getBlock() != this)
            {
                return super.getRenderColor(state);
            }
            else
            {
                return ColorizerFoliage.getFoliageColorBasic();
            }
        }

        @Override
        public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
            return ColorizerFoliage.getFoliageColorBasic();
        }

        @Override
        protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.apple, 1, 0));
        }

        @Override
        protected int getSaplingDropChance(IBlockState state) {
            return super.getSaplingDropChance(state);
        }

        @Override
        public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te) {
            if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemShears)
            {
                player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
                spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1, 0));
            }
            else
            {
                super.harvestBlock(worldIn, player, pos, state, te);
            }
        }

        @Override
        public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
            IBlockState state = world.getBlockState(pos);
            return new ArrayList<ItemStack>(Collections.singletonList(new ItemStack(Item.getItemFromBlock(this), 1, 0)));
        }
    }

    public static final class BlockLeavesRedstone extends BlockLeavesFT
    {
        public BlockLeavesRedstone() {
            super(BlockNames.leaves[8]);
        }

        @Override
        public int getRenderColor(IBlockState state) {
            if (state.getBlock() != this)
            {
                return super.getRenderColor(state);
            }
            else
            {
                return ColorizerFoliage.getFoliageColorBasic();
            }
        }

        @Override
        public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
            return ColorizerFoliage.getFoliageColorBasic();
        }

        @Override
        protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.apple, 1, 0));
        }

        @Override
        protected int getSaplingDropChance(IBlockState state) {
            return super.getSaplingDropChance(state);
        }

        @Override
        public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te) {
            if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemShears)
            {
                player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
                spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1, 0));
            }
            else
            {
                super.harvestBlock(worldIn, player, pos, state, te);
            }
        }

        @Override
        public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
            IBlockState state = world.getBlockState(pos);
            return new ArrayList<ItemStack>(Collections.singletonList(new ItemStack(Item.getItemFromBlock(this), 1, 0)));
        }
    }
}
