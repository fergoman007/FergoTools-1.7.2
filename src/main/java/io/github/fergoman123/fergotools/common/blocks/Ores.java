package io.github.fergoman123.fergotools.common.blocks;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.BlockInfos;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergoutil.info.BlockInfo;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import io.github.fergoman123.fergotools.api.base.BlockBases.BlockOreFT;

import java.util.Random;

public class Ores
{
    public static final class BlockOreExperience extends BlockOreFT
    {
        public BlockOreExperience() {
            super(BlockInfos.oreExperience);
        }

        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return ModItems.shardExp;
        }

        @Override
        public int quantityDropped(Random rand) {
            return 4 + rand.nextInt(5);
        }
    }

    public static final class BlockOreObsidian extends BlockOreFT
    {
        public BlockOreObsidian()
        {
            super(BlockInfos.oreObsidian);
        }

        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }

        @Override
        public int quantityDropped(Random rand) {
            return 1;
        }
    }

    public static final class BlockOreEmerald extends BlockOreFT
    {
        public BlockOreEmerald()
        {
            super(BlockInfos.oreGemEmerald);
        }

        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return ModItems.gemEmerald;
        }

        @Override
        public int quantityDropped(Random rand) {
            return 1;
        }
    }

    public static final class BlockOreLapis extends BlockOreFT
    {
        public BlockOreLapis()
        {
            super(BlockInfos.oreGemLapis);
        }

        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return ModItems.gemLapis;
        }

        @Override
        public int quantityDropped(Random rand) {
            return 1;
        }
    }

    public static final class BlockOreBronze extends BlockOreFT
    {
        public BlockOreBronze()
        {
            super(BlockInfos.oreBronze);
        }

        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }

        @Override
        public int quantityDropped(Random rand) {
            return 1;
        }
    }

    public static final class BlockOreAdamantium extends BlockOreFT
    {
        public BlockOreAdamantium()
        {
            super(BlockInfos.oreAdamantium);
        }

        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }

        @Override
        public int quantityDropped(Random rand) {
            return 1;
        }
    }

    public static final class BlockOreRedstone extends BlockOreFT
    {
        public BlockOreRedstone()
        {
            super(BlockInfos.oreGemRedstone);
        }

        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune) {
            return ModItems.gemRedstone;
        }

        @Override
        public int quantityDropped(Random rand) {
            return 1;
        }
    }
}
