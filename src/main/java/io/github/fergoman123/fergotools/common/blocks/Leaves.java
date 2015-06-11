package io.github.fergoman123.fergotools.common.blocks;

import io.github.fergoman123.fergotools.api.base.BlockBases.BlockLeavesFT;
import io.github.fergoman123.fergotools.api.content.WoodTypes;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public class Leaves
{
    public static final class BlockLeavesObsidian extends BlockLeavesFT {
        public BlockLeavesObsidian(){super(BlockNames.leaves[0]);}
        public Block getBlock() {return ModBlocks.saplingFT;}
        public int damageDropped(IBlockState state){return WoodTypes.obsidian.getMeta();}
    }

    public static final class BlockLeavesEmerald extends BlockLeavesFT {
        public BlockLeavesEmerald(){super(BlockNames.leaves[1]);}
        public Block getBlock() {return ModBlocks.saplingFT;}
        public int damageDropped(IBlockState state){return WoodTypes.obsidian.getMeta();}
    }

    public static final class BlockLeavesLapis extends BlockLeavesFT {
        public BlockLeavesLapis(){super(BlockNames.leaves[2]);}
        public Block getBlock() {return ModBlocks.saplingFT;}
        public int damageDropped(IBlockState state){return WoodTypes.obsidian.getMeta();}
    }

    public static final class BlockLeavesBronze extends BlockLeavesFT {
        public BlockLeavesBronze() {super(BlockNames.leaves[3]);}
        public Block getBlock() {return ModBlocks.saplingFT;}
        public int damageDropped(IBlockState state){return WoodTypes.bronze.getMeta();}
    }

    public static final class BlockLeavesCoal extends BlockLeavesFT{
        public BlockLeavesCoal(){super(BlockNames.leaves[4]);}
        public Block getBlock(){return ModBlocks.saplingFT;}
        public int damageDropped(IBlockState state){return WoodTypes.coal.getMeta();}
    }

    public static final class BlockLeavesGlowstone extends BlockLeavesFT {
        public BlockLeavesGlowstone() {
            super(BlockNames.leaves[5]);
        }
        public Block getBlock() {return ModBlocks.saplingFT;}
        public int damageDropped(IBlockState state){return WoodTypes.glowstone.getMeta();}
    }

    public static final class BlockLeavesAdamantium extends BlockLeavesFT {
        public BlockLeavesAdamantium() {
            super(BlockNames.leaves[6]);
        }
        public Block getBlock() {return ModBlocks.saplingFT;}
        public int damageDropped(IBlockState state){return WoodTypes.adamantium.getMeta();}
    }

    public static final class BlockLeavesSilk extends BlockLeavesFT {
        public BlockLeavesSilk() {
            super(BlockNames.leaves[7]);
        }
        public Block getBlock() {return ModBlocks.saplingFT;}
        public int damageDropped(IBlockState state){return WoodTypes.silk.getMeta();}
    }

    public static final class BlockLeavesRedstone extends BlockLeavesFT {
        public BlockLeavesRedstone() {
            super(BlockNames.leaves[8]);
        }
        public Block getBlock() {return ModBlocks.saplingFT;}
        public int damageDropped(IBlockState state){return WoodTypes.redstone.getMeta();}
    }
}
