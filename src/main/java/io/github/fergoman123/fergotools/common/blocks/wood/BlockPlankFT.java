package io.github.fergoman123.fergotools.common.blocks.wood;

import io.github.fergoman123.fergotools.api.content.WoodTypes;
import io.github.fergoman123.fergotools.block.BlockMultiFT;
import io.github.fergoman123.fergotools.reference.BlockNames;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class BlockPlankFT extends BlockMultiFT {
    public BlockPlankFT(String name) {
		super(Material.wood, BlockNames.planks, name);
        this.setHardness(2.5f);
        this.setResistance(5.0f);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, WoodTypes.obsidian));
	}

	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", WoodTypes.class);


    @Override
    public int damageDropped(IBlockState state) {
        return ((WoodTypes)state.getValue(VARIANT)).getMeta();
    }

    @Override
    @SuppressWarnings("unchecked")
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
