package io.github.fergoman123.fergotools.common.blocks.wood;

import io.github.fergoman123.fergotools.api.base.BlockBases.BlockLogFT;
import io.github.fergoman123.fergotools.api.content.WoodTypes;
import io.github.fergoman123.fergoutil.enums.SwitchEnumAxis;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class BlockWoodLogFT extends BlockLogFT
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", WoodTypes.class);
    private String[] subNames;

    public BlockWoodLogFT(String[] subNames, String name) {
        super(name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, WoodTypes.obsidian).withProperty(LOG_AXIS, EnumAxis.Y));
        this.subNames = subNames;
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        for(WoodTypes type : WoodTypes.values())
        {
            list.add(new ItemStack(itemIn, 1, type.getMeta()));
        }
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, WoodTypes.values()[meta]);

        switch (meta & 12)
        {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, EnumAxis.NONE);
        }

        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        byte b0 = 0;
        int i = b0 | ((WoodTypes)state.getValue(VARIANT)).getMeta();

        switch (SwitchEnumAxis.AXIS_LOOKUP[((EnumAxis)state.getValue(LOG_AXIS)).ordinal()])
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

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT, LOG_AXIS);
    }

    @Override
    public ItemStack createStackedBlock(IBlockState state) {
    return new ItemStack(Item.getItemFromBlock(this), 1, ((WoodTypes)state.getValue(VARIANT)).getMeta());
    }

    public String[] getSubNames() {
        return subNames;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((WoodTypes)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public void registerModels() {
        for (int i = 0; i < subNames.length; i++) {
            RegisterHelper.registerModel(this, i, NameHelper.getModString(0) + getSubNames()[i]);
        }
    }
}
