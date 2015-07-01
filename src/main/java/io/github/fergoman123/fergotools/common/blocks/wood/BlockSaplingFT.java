package io.github.fergoman123.fergotools.common.blocks.wood;

import io.github.fergoman123.fergotools.api.content.WoodTypes;
import io.github.fergoman123.fergotools.world.gen.WorldGenTreesFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

public class BlockSaplingFT extends BlockBush implements IGrowable {
    public static final PropertyEnum TYPE = PropertyEnum.create("type", WoodTypes.class);
    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
    private String[] subNames;

    public BlockSaplingFT(String[] subNames, String name)
    {
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, WoodTypes.obsidian).withProperty(STAGE, 0));
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setUnlocalizedName(name);
        this.subNames = subNames;
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

    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) return;
        Object object = rand.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenTreesFT(true);
        int i = 0;
        int j = 0;
        boolean flag = false;

        switch (SwitchEnumType.WOOD_TYPE_LOOKUP[((WoodTypes)state.getValue(TYPE)).ordinal()])
        {
            case 1: object = new WorldGenTreesFT(true, 4, 1, 1, false);break;
            case 2: object = new WorldGenTreesFT(true, 4, 2, 2, false);break;
            case 3: object = new WorldGenTreesFT(true, 4, 3, 3, false);break;
            case 4: object = new WorldGenTreesFT(true, 4, 4, 4, false);break;
            case 5: object = new WorldGenTreesFT(true, 4, 5, 5, false);break;
            case 6: object = new WorldGenTreesFT(true, 4, 6, 6, false);break;
            case 7: object = new WorldGenTreesFT(true, 4, 7, 7, false);break;
            case 8: object = new WorldGenTreesFT(true, 4, 8, 8, false);break;
        }

        IBlockState iblockstate1 = Blocks.air.getDefaultState();

        if (flag)
        {
            worldIn.setBlockState(pos.add(i, 0, j), iblockstate1, 4);
            worldIn.setBlockState(pos.add(i + 1, 0, j), iblockstate1, 4);
            worldIn.setBlockState(pos.add(i, 0, j + 1), iblockstate1, 4);
            worldIn.setBlockState(pos.add(i + 1, 0, j + 1), iblockstate1, 4);
        }
        else
        {
            worldIn.setBlockState(pos, iblockstate1, 4);
        }

        if (!((WorldGenerator)object).generate(worldIn, rand, pos.add(i, 0, j)))
        {
            if (flag)
            {
                worldIn.setBlockState(pos.add(i, 0, j), state, 4);
                worldIn.setBlockState(pos.add(i + 1, 0, j), state, 4);
                worldIn.setBlockState(pos.add(i, 0, j + 1), state, 4);
                worldIn.setBlockState(pos.add(i + 1, 0, j + 1), state, 4);
            }
            else
            {
                worldIn.setBlockState(pos, state, 4);
            }
        }
    }

    /**
     * Check whether the given BlockPos has a Sapling of the given type
     */
    public boolean isTypeAt(World worldIn, BlockPos pos, WoodTypes type)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        return iblockstate.getBlock() == this && iblockstate.getValue(TYPE) == type;
    }

    /**
     * Get the damage value that this Block should drop
     */
    public int damageDropped(IBlockState state)
    {
        return ((WoodTypes)state.getValue(TYPE)).getMeta();
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    @SuppressWarnings("unchecked")
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
    {
        for(int i = 0; i < WoodTypes.values().length; i++){
        	list.add(new ItemStack(itemIn, i, WoodTypes.values()[i].getMeta()));
        }
    }

    /**
     * Whether this IGrowable can grow
     */
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
    {
        return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        return (double)worldIn.rand.nextFloat() < 0.45D;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        this.grow(worldIn, pos, state, rand);
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(TYPE, WoodTypes.byMetadata(meta)).withProperty(STAGE, (meta & 8) >> 3);
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        byte b0 = 0;
        int i = b0 | ((WoodTypes)state.getValue(TYPE)).getMeta();
        i |= (Integer) state.getValue(STAGE) << 3;
        return i;
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, TYPE, STAGE);
    }

    static final class SwitchEnumType
    {
        static final int[] WOOD_TYPE_LOOKUP = new int[WoodTypes.values().length];
        private static final String __OBFID = "CL_00002067";

        static
        {
            try
            {
                WOOD_TYPE_LOOKUP[WoodTypes.emerald.ordinal()] = 1;
            }
            catch (NoSuchFieldError var6)
            {
                var6.printStackTrace();
            }

            try
            {
                WOOD_TYPE_LOOKUP[WoodTypes.lapis.ordinal()] = 2;
            }
            catch (NoSuchFieldError var5)
            {
                var5.printStackTrace();
            }

            try
            {
                WOOD_TYPE_LOOKUP[WoodTypes.bronze.ordinal()] = 3;
            }
            catch (NoSuchFieldError var4)
            {
                var4.printStackTrace();
            }

            try
            {
                WOOD_TYPE_LOOKUP[WoodTypes.coal.ordinal()] = 4;
            }
            catch (NoSuchFieldError var3)
            {
                var3.printStackTrace();
            }

            try
            {
                WOOD_TYPE_LOOKUP[WoodTypes.glowstone.ordinal()] = 5;
            }
            catch (NoSuchFieldError var2)
            {
                var2.printStackTrace();
            }

            try
            {
                WOOD_TYPE_LOOKUP[WoodTypes.adamantium.ordinal()] = 6;
            }
            catch (NoSuchFieldError var1)
            {
                var1.printStackTrace();
            }

            try
            {
                WOOD_TYPE_LOOKUP[WoodTypes.silk.ordinal()] = 7;
            }
            catch (NoSuchFieldError var1)
            {
                var1.printStackTrace();
            }

            try
            {
                WOOD_TYPE_LOOKUP[WoodTypes.redstone.ordinal()] = 8;
            }
            catch (NoSuchFieldError var1)
            {
                var1.printStackTrace();
            }
        }
    }
    
    public String getUnlocalizedName(){
    	return NameHelper.formatBlockName(0, NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }
}
