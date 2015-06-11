package io.github.fergoman123.fergotools.common.blocks;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.api.content.StorageTypes;
import io.github.fergoman123.fergotools.reference.BlockNames;
import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public class BlockStorageFT extends BlockMultiFergo
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", StorageTypes.class);

    public BlockStorageFT(String name) {
        super(Material.iron, 0, FergoTools.tabFergoTools, 5.0f, 10.0f, BlockNames.blocks, name);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((StorageTypes)state.getValue(VARIANT)).getMeta();
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
