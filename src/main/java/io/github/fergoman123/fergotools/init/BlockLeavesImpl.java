package io.github.fergoman123.fergotools.init;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.fergoman123.fergotools.api.content.WoodTypes;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLeavesImpl extends BlockLeavesFT {

	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", WoodTypes.class);

	public BlockLeavesImpl(String name) {
		super(name);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, WoodTypes.obsidian).withProperty(CHECK_DECAY, true).withProperty(DECAYABLE, true));
	}

	public int getRenderColor(IBlockState state) {

		if (state.getValue(VARIANT) == WoodTypes.obsidian) {
			return 6568045;
		} else if (state.getValue(VARIANT) == WoodTypes.emerald) {
			return 108597;
		} else if (state.getValue(VARIANT) == WoodTypes.lapis) {
			return 3432131;
		} else if (state.getValue(VARIANT) == WoodTypes.bronze) {
			return 11025920;
		} else if (state.getValue(VARIANT) == WoodTypes.coal) {
			return 2500134;
		} else if (state.getValue(VARIANT) == WoodTypes.glowstone) {
			return 5263360;
		} else if (state.getValue(VARIANT) == WoodTypes.adamantium) {
			return 26126;
		} else if (state.getValue(VARIANT) == WoodTypes.silk) {
			return 2631720;
		} else if (state.getValue(VARIANT) == WoodTypes.redstone) {
			return 13506070;
		} else {
			return super.getRenderColor(state);
		}
	}

	@Override
	public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
		return getRenderColor(worldIn.getBlockState(pos));
	}

	@Override
	protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
		spawnAsEntity(worldIn, pos, new ItemStack(Items.apple, 1, 0));
	}

	@Override
	protected int getSaplingDropChance(IBlockState state) {
		return 20;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		for (WoodTypes type : WoodTypes.values())
			list.add(new ItemStack(itemIn, 1, type.getMeta()));
	}

	@Override
	protected ItemStack createStackedBlock(IBlockState state) {
		return new ItemStack(Item.getItemFromBlock(this), 1, ((WoodTypes) state.getValue(VARIANT)).getMeta());
	}

	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, this.getWoodType(meta)).withProperty(DECAYABLE, Boolean.valueOf((meta & 4) == 0)).withProperty(CHECK_DECAY, Boolean.valueOf((meta & 8) > 0));
	}

	public int getMetaFromState(IBlockState state) {
		byte b0 = 0;
		int i = b0 | ((BlockPlanks.EnumType) state.getValue(VARIANT)).getMetadata();
		if (!((Boolean) state.getValue(DECAYABLE)).booleanValue()){i |= 4;}
		if (((Boolean) state.getValue(CHECK_DECAY)).booleanValue()){i |= 8;}
		return i;
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		IBlockState state = world.getBlockState(pos);
		return new ArrayList<ItemStack>(Arrays.asList(new ItemStack(this, 1, ((WoodTypes)state.getValue(VARIANT)).getMeta())));
	}

	@Override
	public WoodTypes getWoodType(int meta) {
		return WoodTypes.byMetadata(meta);
	}
	
	
}
