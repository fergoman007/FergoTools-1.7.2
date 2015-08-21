package io.github.fergoman123.fergotools.block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.fergoman123.fergotools.api.content.WoodTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLeavesImpl extends BlockLeavesFT {
	public static PropertyEnum VARIANT = PropertyEnum.create("variant", WoodTypes.class);
	
	public BlockLeavesImpl(String name){
		super(name);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, WoodTypes.obsidian).withProperty(CHECK_DECAY, true).withProperty(DECAYABLE, true));
	}
	
	@SideOnly(Side.CLIENT)
	public int getRenderColor(IBlockState state){
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
	public int colorMultiplier(IBlockAccess world, BlockPos pos, int renderPass) {
		return getRenderColor(world.getBlockState(pos));
	}
	
	@Override
	public void dropApple(World world, BlockPos pos, IBlockState state, int chance) {
		spawnAsEntity(world, pos, new ItemStack(Items.apple));
	}
	
	@Override
	public int getSaplingDropChance(IBlockState state) {
		return super.getSaplingDropChance(state);
	}
	
	@SuppressWarnings({"unchecked", "rawtypes"})
	public void getSubBlocks(Item item, CreativeTabs tab, List list){
		for(WoodTypes type : WoodTypes.values()){
			list.add(new ItemStack(item, 1, type.getMeta()));
		}
	}
	
	public int getMetaFromState(IBlockState state)
    {
        byte b0 = 0;
        int i = b0 | ((BlockPlanks.EnumType)state.getValue(VARIANT)).getMetadata();

        if (!((Boolean)state.getValue(DECAYABLE)).booleanValue())
        {
            i |= 4;
        }

        if (((Boolean)state.getValue(CHECK_DECAY)).booleanValue())
        {
            i |= 8;
        }

        return i;
    }

    public WoodTypes getWoodType(int meta)
    {
        return WoodTypes.byMetadata((meta & 3) % 4);
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {VARIANT, CHECK_DECAY, DECAYABLE});
    }
    
    @Override
    public int damageDropped(IBlockState state) {
    	return ((WoodTypes)state.getValue(VARIANT)).getMeta();
    }
    
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te)
    {
        if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == Items.shears)
        {
            player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
        }
        else
        {
            super.harvestBlock(worldIn, player, pos, state, te);
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        IBlockState state = world.getBlockState(pos);
        return new ArrayList(Arrays.asList(new ItemStack(this, 1, ((WoodTypes)state.getValue(VARIANT)).getMeta())));
    }
}
