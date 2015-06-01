package io.github.fergoman123.fergotools.common.blocks;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.api.content.StorageTypes;
import io.github.fergoman123.fergotools.reference.BlockInfos;
import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class BlockStorageFT extends BlockMultiFergo
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", StorageTypes.class);

    public BlockStorageFT(String[] subNames, String name) {
        super(0, FergoTools.tabFergoTools, 5.0f, 10.0f, BlockInfos.storageFT);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((StorageTypes)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for(StorageTypes type : StorageTypes.values())
        {
            list.add(new ItemStack(item, 1, type.getMeta()));
        }
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, StorageTypes.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((StorageTypes)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public BlockState createBlockState() {
        return new BlockState(this, VARIANT);
    }
}
