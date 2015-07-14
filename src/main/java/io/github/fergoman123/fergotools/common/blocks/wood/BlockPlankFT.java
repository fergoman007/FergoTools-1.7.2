package io.github.fergoman123.fergotools.common.blocks.wood;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.api.content.WoodTypes;
import io.github.fergoman123.fergotools.reference.BlockNames;
import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class BlockPlankFT extends BlockMultiFergo
{
    public BlockPlankFT(String name) {
		super(Material.wood, 0, FergoTools.tabFergoTools, 2.0f, 5.0f, BlockNames.planks, name);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, WoodTypes.obsidian));
	}

	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", WoodTypes.class);


    @Override
    public int damageDropped(IBlockState state) {
        return ((WoodTypes)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for(WoodTypes type : WoodTypes.values())
        {
            list.add(new ItemStack(item, 1, type.getMeta()));
        }
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, WoodTypes.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
    return ((WoodTypes)state.getValue(VARIANT)).getMeta();
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
