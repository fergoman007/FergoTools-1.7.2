package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.api.content.WoodTypes;
import net.minecraft.block.BlockLog;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class BlockWoodLogFT extends BlockLog {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", WoodTypes.class);

    public BlockWoodLogFT(String name){
        super();
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, WoodTypes.obsidian).withProperty(LOG_AXIS, EnumAxis.Y));
        this.setUnlocalizedName(name);
        this.setCreativeTab(FergoTools.tabFergoTools);
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        for(WoodTypes type : WoodTypes.values()){
            list.add(new ItemStack(itemIn, 1, type.getMeta()));
        }
    }

    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, WoodTypes.byMetadata((meta & 3) % 4));

        switch (meta & 12)
        {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
        }

        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        byte b0 = 0;
        int i = b0 | ((WoodTypes)state.getValue(VARIANT)).getMeta();

        switch (SwitchEnumAxis.AXIS_LOOKUP[((BlockLog.EnumAxis)state.getValue(LOG_AXIS)).ordinal()])
        {
            case 1:
                i |= 4;
                break;
            case 2:
                i |= 8;
                break;
            case 3:
                i |= 12;
        }

        return i;
    }

    public BlockState createBlockState(){
        return new BlockState(this, VARIANT);
    }

    public ItemStack createStackedBlock(IBlockState state){
        return new ItemStack(Item.getItemFromBlock(this), 1, ((WoodTypes)state.getValue(VARIANT)).getMeta());
    }

    public int damageDropped(IBlockState state){
        return ((WoodTypes)state.getValue(VARIANT)).getMeta();
    }

    static final class SwitchEnumAxis
    {
        static final int[] AXIS_LOOKUP = new int[EnumAxis.values().length];

        static {
            try{AXIS_LOOKUP[BlockLog.EnumAxis.X.ordinal()] = 1;}
            catch (NoSuchFieldError var3)
            {var3.printStackTrace();}
            try{AXIS_LOOKUP[BlockLog.EnumAxis.Z.ordinal()] = 2;}
            catch (NoSuchFieldError var2)
            {var2.printStackTrace();}
            try{AXIS_LOOKUP[BlockLog.EnumAxis.NONE.ordinal()] = 3;}
            catch (NoSuchFieldError var1)
            {var1.printStackTrace();}
        }
    }
}
