package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.api.content.WoodTypes;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockSaplingFT extends BlockBush implements IGrowable {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", WoodTypes.class);
    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);

    private String name;

    public BlockSaplingFT(String name){
        super();
        this.setUnlocalizedName(name);
        this.name = name;
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            super.updateTick(worldIn, pos, state, rand);

            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
            {
                this.grow(worldIn, pos, state, rand);
            }
        }
    }

    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if ((Integer) state.getValue(STAGE) == 0)
        {
            worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
        }
        else
        {
            this.generateTree(worldIn, pos, state, rand);
        }
    }

    public void generateTree(World world, BlockPos pos, IBlockState state, Random rand){
        //TODO generateTree
    }
}
