package io.github.fergoman123.fergotools.block;


import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.base.BlockFT;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class FergoStorageBlocks
{


    public static final class BlockObsidianStorage extends BlockFT
    {

        public BlockObsidianStorage()
        {
            super(Material.iron);
            this.setBlockName(Names.Blocks.blockObsidian);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockEmeraldCrystal extends BlockFT
    {
        public BlockEmeraldCrystal()
        {
            super(Material.iron);
            this.setBlockName(Names.Blocks.blockEmeraldCrystal);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockLapisCrystal extends BlockFT
    {
        public BlockLapisCrystal()
        {
            super(Material.iron);
            this.setBlockName(Names.Blocks.blockLapisCrystal);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockBronze extends BlockFT
    {
        public BlockBronze()
        {
            super(Material.iron);
            this.setBlockName(Names.Blocks.blockBronze);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockCoalStorage extends BlockFT
    {
        public BlockCoalStorage()
        {
            super(Material.iron);
            this.setBlockName(Names.Blocks.blockCoal);
        }

        public Item getItemDropped(int metadata, Random random, int fortune)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockGlowstoneStorage extends BlockFT
    {
        public BlockGlowstoneStorage()
        {
            super(Material.iron);
            this.setBlockName(Names.Blocks.blockGlowstone);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockAdamantium extends BlockFT
    {
        public BlockAdamantium()
        {
            super(Material.iron);
            this.setBlockName(Names.Blocks.blockAdamantium);
        }

        public Item getItemDropped(int metadata, Random random, int fortune)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockSilkGem extends BlockFT
    {
        public BlockSilkGem()
        {
            super(Material.iron);
            this.setBlockName(Names.Blocks.blockSilkGem);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockRedstoneCrystal extends BlockFT
    {
        public BlockRedstoneCrystal()
        {
            super(Material.iron);
            this.setBlockName(Names.Blocks.blockRedstoneCrystal);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockExperience extends BlockFT
    {
        public BlockExperience()
        {
            super(Material.iron);
            this.setBlockName(Names.Blocks.blockExperience);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }
}
