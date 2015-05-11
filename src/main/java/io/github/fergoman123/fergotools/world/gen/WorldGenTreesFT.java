package io.github.fergoman123.fergotools.world.gen;

import io.github.fergoman123.fergotools.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenTreesFT extends WorldGenAbstractTree
{
    private final int minTreeHeight;
    private final boolean vinesGrow;
    private final int metaWood;
    private final int metaLeaves;

    public WorldGenTreesFT(boolean doBlockNotify)
    {
        this(doBlockNotify, 4, 0, 0, false);
    }

    public WorldGenTreesFT(boolean doBlockNotify, int minTreeHeight, int metaWood, int metaLeaves, boolean vinesGrow)
    {
        super(doBlockNotify);
        this.minTreeHeight = minTreeHeight;
        this.metaWood = metaWood;
        this.metaLeaves = metaLeaves;
        this.vinesGrow = vinesGrow;
    }

    public boolean generate(World world, Random rand, BlockPos pos)
    {
        int i = rand.nextInt(3) + this.minTreeHeight;
        boolean flag = true;

        if (pos.getY() >= 1 && pos.getY() + i + 1 <= 256)
        {
            byte b0;
            int l;

            for (int j = pos.getY(); j <= pos.getY() + 1 + i; ++j)
            {
                b0 = 1;

                if (j == pos.getY())
                {
                    b0 = 0;
                }

                if (j >= pos.getY() + 1 + i - 2)
                {
                    b0 = 2;
                }

                for (int k = pos.getX() - b0; k <= pos.getX() + b0 && flag; ++k)
                {
                    for (l = pos.getZ() - b0; l <= pos.getZ() + b0 && flag; ++l)
                    {
                        if (j >= 0 && j < 256)
                        {
                            if (!this.isReplaceable(world, new BlockPos(k, j, l)))
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
                BlockPos down = pos.down();
                Block block1 = world.getBlockState(down).getBlock();
                boolean isSoil = block1.canSustainPlant(world, down, net.minecraft.util.EnumFacing.UP, ModBlocks.saplingFT);

                if (isSoil && pos.getY() < 256 - i - 1)
                {
                    block1.onPlantGrow(world, down, pos);
                    b0 = 3;
                    byte b1 = 0;
                    int i1;
                    int j1;
                    int k1;
                    int l1;
                    BlockPos blockpos1;

                    for (l = pos.getY() - b0 + i; l <= pos.getY() + i; ++l)
                    {
                        i1 = l - (pos.getY() + i);
                        j1 = b1 + 1 - i1 / 2;

                        for (k1 = pos.getX() - j1; k1 <= pos.getX() + j1; ++k1)
                        {
                            l1 = k1 - pos.getX();

                            for (int i2 = pos.getZ() - j1; i2 <= pos.getZ() + j1; ++i2)
                            {
                                int j2 = i2 - pos.getZ();

                                if (Math.abs(l1) != j1 || Math.abs(j2) != j1 || rand.nextInt(2) != 0 && i1 != 0)
                                {
                                    blockpos1 = new BlockPos(k1, l, i2);
                                    Block block = world.getBlockState(blockpos1).getBlock();

                                    if (block.isAir(world, blockpos1) || block.isLeaves(world, blockpos1) || block.getMaterial() == Material.vine)
                                    {
                                        this.setBlock(world, blockpos1, ModBlocks.leavesFT, this.metaLeaves);
                                    }
                                }
                            }
                        }
                    }

                    for (l = 0; l < i; ++l)
                    {
                        BlockPos upN = pos.up(l);
                        Block block2 = world.getBlockState(upN).getBlock();

                        if (block2.isAir(world, upN) || block2.isLeaves(world, upN) || block2.getMaterial() == Material.vine)
                        {
                            this.setBlock(world, pos.up(l), ModBlocks.logFT, this.metaWood);

                            if (this.vinesGrow && l > 0)
                            {
                                if (rand.nextInt(3) > 0 && world.isAirBlock(pos.add(-1, l, 0)))
                                {
                                    this.setBlock(world, pos.add(-1, l, 0), Blocks.vine, BlockVine.EAST_FLAG);
                                }

                                if (rand.nextInt(3) > 0 && world.isAirBlock(pos.add(1, l, 0)))
                                {
                                    this.setBlock(world, pos.add(1, l, 0), Blocks.vine, BlockVine.WEST_FLAG);
                                }

                                if (rand.nextInt(3) > 0 && world.isAirBlock(pos.add(0, l, -1)))
                                {
                                    this.setBlock(world, pos.add(0, l, -1), Blocks.vine, BlockVine.SOUTH_FLAG);
                                }

                                if (rand.nextInt(3) > 0 && world.isAirBlock(pos.add(0, l, 1)))
                                {
                                    this.setBlock(world, pos.add(0, l, 1), Blocks.vine, BlockVine.NORTH_FLAG);
                                }
                            }
                        }
                    }

                    if (this.vinesGrow)
                    {
                        for (l = pos.getY() - 3 + i; l <= pos.getY() + i; ++l)
                        {
                            i1 = l - (pos.getY() + i);
                            j1 = 2 - i1 / 2;

                            for (k1 = pos.getX() - j1; k1 <= pos.getX() + j1; ++k1)
                            {
                                for (l1 = pos.getZ() - j1; l1 <= pos.getZ() + j1; ++l1)
                                {
                                    BlockPos blockpos3 = new BlockPos(k1, l, l1);

                                    if (world.getBlockState(blockpos3).getBlock().isLeaves(world, blockpos3))
                                    {
                                        BlockPos blockpos4 = blockpos3.west();
                                        blockpos1 = blockpos3.east();
                                        BlockPos blockpos5 = blockpos3.north();
                                        BlockPos blockpos2 = blockpos3.south();

                                        if (rand.nextInt(4) == 0 && world.getBlockState(blockpos4).getBlock().isAir(world, blockpos4))
                                        {
                                            this.growVines(world, blockpos4, BlockVine.EAST_FLAG);
                                        }

                                        if (rand.nextInt(4) == 0 && world.getBlockState(blockpos1).getBlock().isAir(world, blockpos1))
                                        {
                                            this.growVines(world, blockpos1, BlockVine.WEST_FLAG);
                                        }

                                        if (rand.nextInt(4) == 0 && world.getBlockState(blockpos5).getBlock().isAir(world, blockpos5))
                                        {
                                            this.growVines(world, blockpos5, BlockVine.SOUTH_FLAG);
                                        }

                                        if (rand.nextInt(4) == 0 && world.getBlockState(blockpos2).getBlock().isAir(world, blockpos2))
                                        {
                                            this.growVines(world, blockpos2, BlockVine.NORTH_FLAG);
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
                                        this.setBlock(world, pos.add(enumfacing.getFrontOffsetX(), i - 5 + l, enumfacing.getFrontOffsetZ()), Blocks.cocoa, j1 << 2 | EnumFacing.getHorizontal(i1).getHorizontalIndex());
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

    private void growVines(World worldIn, BlockPos pos, int meta)
    {
        this.setBlock(worldIn, pos, Blocks.vine, meta);
        int j = 4;

        for (pos = pos.down(); worldIn.getBlockState(pos).getBlock().isAir(worldIn, pos) && j > 0; --j)
        {
            this.setBlock(worldIn, pos, Blocks.vine, meta);
            pos = pos.down();
        }
    }
}
