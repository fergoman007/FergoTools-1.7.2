package io.github.fergoman123.fergotools.worldgen;

import java.util.Random;

import io.github.fergoman123.fergotools.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class WorldGenTreesFT extends WorldGenAbstractTree
{
    
    private final int minTreeHeight;
    private final int randomTreeHeight;
    private final boolean vinesGrow;
    private final int metaWood;
    private final int metaLeaves;

    public WorldGenTreesFT(int metaWood, int metaLeaves){
    	this(metaWood, metaLeaves, false, 4, false);
    }

    public WorldGenTreesFT(int metaWood, int metaLeaves, boolean doBlockNofity, int minTreeHeight, boolean vinesGrow){
    	super(doBlockNofity);
    	this.metaWood = metaWood;
    	this.metaLeaves =  metaLeaves;
    	this.minTreeHeight = minTreeHeight;
    	this.randomTreeHeight = new Random().nextInt(3);
    	this.vinesGrow = vinesGrow;
    	
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        int i = this.randomTreeHeight + this.minTreeHeight;
        boolean flag = true;

        if (position.getY() >= 1 && position.getY() + i + 1 <= 256)
        {
            byte b0;
            int l;

            for (int j = position.getY(); j <= position.getY() + 1 + i; ++j)
            {
                b0 = 1;

                if (j == position.getY())
                {
                    b0 = 0;
                }

                if (j >= position.getY() + 1 + i - 2)
                {
                    b0 = 2;
                }

                for (int k = position.getX() - b0; k <= position.getX() + b0 && flag; ++k)
                {
                    for (l = position.getZ() - b0; l <= position.getZ() + b0 && flag; ++l)
                    {
                        if (j >= 0 && j < 256)
                        {
                            if (!this.isReplaceable(worldIn, new BlockPos(k, j, l)))
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                BlockPos down = position.down();
                Block block1 = worldIn.getBlockState(down).getBlock();
                boolean isSoil = block1.canSustainPlant(worldIn, down, net.minecraft.util.EnumFacing.UP, ModBlocks.saplingFT);

                if (isSoil && position.getY() < 256 - i - 1)
                {
                    block1.onPlantGrow(worldIn, down, position);
                    b0 = 3;
                    byte b1 = 0;
                    int i1;
                    int j1;
                    int k1;
                    int l1;
                    BlockPos blockpos1;

                    for (l = position.getY() - b0 + i; l <= position.getY() + i; ++l)
                    {
                        i1 = l - (position.getY() + i);
                        j1 = b1 + 1 - i1 / 2;

                        for (k1 = position.getX() - j1; k1 <= position.getX() + j1; ++k1)
                        {
                            l1 = k1 - position.getX();

                            for (int i2 = position.getZ() - j1; i2 <= position.getZ() + j1; ++i2)
                            {
                                int j2 = i2 - position.getZ();

                                if (Math.abs(l1) != j1 || Math.abs(j2) != j1 || rand.nextInt(2) != 0 && i1 != 0)
                                {
                                    blockpos1 = new BlockPos(k1, l, i2);
                                    Block block = worldIn.getBlockState(blockpos1).getBlock();

                                    if (block.isAir(worldIn, blockpos1) || block.isLeaves(worldIn, blockpos1) || block.getMaterial() == Material.vine)
                                    {
                                        this.setBlock(worldIn, blockpos1, ModBlocks.leavesFT, this.metaLeaves);
                                    }
                                }
                            }
                        }
                    }

                    for (l = 0; l < i; ++l)
                    {
                        BlockPos upN = position.up(l);
                        Block block2 = worldIn.getBlockState(upN).getBlock();

                        if (block2.isAir(worldIn, upN) || block2.isLeaves(worldIn, upN) || block2.getMaterial() == Material.vine)
                        {
                            this.setBlock(worldIn, position.up(l), ModBlocks.logFT, this.metaWood);

                            if (this.vinesGrow && l > 0)
                            {
                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(position.add(-1, l, 0)))
                                {
                                    this.setBlock(worldIn, position.add(-1, l, 0), Blocks.vine, BlockVine.EAST_FLAG);
                                }

                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(position.add(1, l, 0)))
                                {
                                    this.setBlock(worldIn, position.add(1, l, 0), Blocks.vine, BlockVine.WEST_FLAG);
                                }

                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(position.add(0, l, -1)))
                                {
                                    this.setBlock(worldIn, position.add(0, l, -1), Blocks.vine, BlockVine.SOUTH_FLAG);
                                }

                                if (rand.nextInt(3) > 0 && worldIn.isAirBlock(position.add(0, l, 1)))
                                {
                                    this.setBlock(worldIn, position.add(0, l, 1), Blocks.vine, BlockVine.NORTH_FLAG);
                                }
                            }
                        }
                    }

                    if (this.vinesGrow)
                    {
                        for (l = position.getY() - 3 + i; l <= position.getY() + i; ++l)
                        {
                            i1 = l - (position.getY() + i);
                            j1 = 2 - i1 / 2;

                            for (k1 = position.getX() - j1; k1 <= position.getX() + j1; ++k1)
                            {
                                for (l1 = position.getZ() - j1; l1 <= position.getZ() + j1; ++l1)
                                {
                                    BlockPos blockpos3 = new BlockPos(k1, l, l1);

                                    if (worldIn.getBlockState(blockpos3).getBlock().isLeaves(worldIn, blockpos3))
                                    {
                                        BlockPos blockpos4 = blockpos3.west();
                                        blockpos1 = blockpos3.east();
                                        BlockPos blockpos5 = blockpos3.north();
                                        BlockPos blockpos2 = blockpos3.south();

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos4).getBlock().isAir(worldIn, blockpos4))
                                        {
                                            this.func_175923_a(worldIn, blockpos4, BlockVine.EAST_FLAG);
                                        }

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos1).getBlock().isAir(worldIn, blockpos1))
                                        {
                                            this.func_175923_a(worldIn, blockpos1, BlockVine.WEST_FLAG);
                                        }

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos5).getBlock().isAir(worldIn, blockpos5))
                                        {
                                            this.func_175923_a(worldIn, blockpos5, BlockVine.SOUTH_FLAG);
                                        }

                                        if (rand.nextInt(4) == 0 && worldIn.getBlockState(blockpos2).getBlock().isAir(worldIn, blockpos2))
                                        {
                                            this.func_175923_a(worldIn, blockpos2, BlockVine.NORTH_FLAG);
                                        }
                                    }
                                }
                            }
                        }

                        if (rand.nextInt(5) == 0 && i > 5)
                        {
                            for (l = 0; l < 2; ++l)
                            {
                                for (i1 = 0; i1 < 4; ++i1)
                                {
                                    if (rand.nextInt(4 - l) == 0)
                                    {
                                        j1 = rand.nextInt(3);
                                        EnumFacing enumfacing = EnumFacing.getHorizontal(i1).getOpposite();
                                        this.setBlock(worldIn, position.add(enumfacing.getFrontOffsetX(), i - 5 + l, enumfacing.getFrontOffsetZ()), Blocks.cocoa, j1 << 2 | EnumFacing.getHorizontal(i1).getHorizontalIndex());
                                    }
                                }
                            }
                        }
                    }

                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }

    private void func_175923_a(World worldIn, BlockPos p_175923_2_, int p_175923_3_)
    {
        this.setBlock(worldIn, p_175923_2_, Blocks.vine, p_175923_3_);
        int j = 4;

        for (p_175923_2_ = p_175923_2_.down(); worldIn.getBlockState(p_175923_2_).getBlock().isAir(worldIn, p_175923_2_) && j > 0; --j)
        {
            this.setBlock(worldIn, p_175923_2_, Blocks.vine, p_175923_3_);
            p_175923_2_ = p_175923_2_.down();
        }
    }
}
