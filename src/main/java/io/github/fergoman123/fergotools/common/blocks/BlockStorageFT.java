package io.github.fergoman123.fergotools.common.blocks;

import io.github.fergoman123.fergotools.api.content.StorageTypes;
import io.github.fergoman123.fergotools.reference.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockStorageFT extends BlockMultiFT
{
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", StorageTypes.class);

    public BlockStorageFT(String name) {
        super(Material.iron, 5.0f, 10.0f, BlockNames.blocks, name);
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
    
    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
    	return Item.getItemFromBlock(this);
    }
}
