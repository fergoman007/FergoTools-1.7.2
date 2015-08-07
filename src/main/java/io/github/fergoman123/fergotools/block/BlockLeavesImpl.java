package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.api.content.WoodTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
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
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlockLeavesImpl extends BlockLeavesFT {
	
	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", WoodTypes.class);

	public BlockLeavesImpl(String name) {
		super(name);
		this.setUnlocalizedName(name);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, WoodTypes.obsidian).withProperty(CHECK_DECAY, true).withProperty(DECAYABLE, true));
	}
	
	public int getRenderColor(IBlockState state){
		if(state.getBlock() != this){
			return super.getRenderColor(state);
		} else {
			WoodTypes type = (WoodTypes)state.getValue(VARIANT);
			return type == WoodTypes.emerald ? ColorizerFoliage.getFoliageColorPine() : (type == WoodTypes.lapis ? ColorizerFoliage.getFoliageColorBirch() : super.getRenderColor(state));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
		IBlockState iblockstate = worldIn.getBlockState(pos);

        if (iblockstate.getBlock() == this)
        {
            WoodTypes enumtype = (WoodTypes)iblockstate.getValue(VARIANT);

            if (enumtype == WoodTypes.emerald)
            {
                return ColorizerFoliage.getFoliageColorPine();
            }

            if (enumtype == WoodTypes.lapis)
            {
                return ColorizerFoliage.getFoliageColorBirch();
            }
        }

        return super.colorMultiplier(worldIn, pos, renderPass);
	}
	
	public void dropApple(World world, BlockPos pos, IBlockState state, int chance){
		spawnAsEntity(world, pos, new ItemStack(Items.apple, 1, 0));
	}
	
	public int getSaplingDropChance(IBlockState state){
		return state.getValue(VARIANT) == WoodTypes.emerald ? 40 : super.getSaplingDropChance(state);
	}
	
	public void getSubBlocks(Item item, CreativeTabs tab, List list){
		for(WoodTypes type : WoodTypes.values()){
			list.add(new ItemStack(item, 1, type.getMeta()));
		}
	}
	
	public ItemStack createStackedBlock(IBlockState state){
		return new ItemStack(Item.getItemFromBlock(this), 1, ((WoodTypes)state.getValue(VARIANT)).getMeta());
	}
	
	public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, this.getWoodType(meta)).withProperty(DECAYABLE, (meta & 4) == 0).withProperty(CHECK_DECAY, Boolean.valueOf((meta & 8) > 0));
    }
	
	public int getMetaFromState(IBlockState state)
    {
        byte b0 = 0;
        int i = b0 | ((BlockPlanks.EnumType)state.getValue(VARIANT)).getMetadata();

        if (!(Boolean) state.getValue(DECAYABLE))
        {
            i |= 4;
        }

        if ((Boolean) state.getValue(CHECK_DECAY))
        {
            i |= 8;
        }

        return i;
    }
	
	public WoodTypes getWoodType(int meta){
		return WoodTypes.byMetadata((meta & 3) % 4);
	}
	
	public BlockState createBlockState(){
		return new BlockState(this, VARIANT, CHECK_DECAY, DECAYABLE);
	}
	
	public int damageDropped(IBlockState state){
		return ((WoodTypes)state.getValue(VARIANT)).getMeta();
	}
	
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te)
    {
        if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == Items.shears)
        {
            player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
            spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(this), 1, ((WoodTypes)state.getValue(VARIANT)).getMeta()));
        }
        else
        {
            super.harvestBlock(worldIn, player, pos, state, te);
        }
    }
	
	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		IBlockState state = world.getBlockState(pos);
		return new ArrayList<ItemStack>(Arrays.asList(new ItemStack(this, 1, ((WoodTypes)state.getValue(VARIANT)).getMeta())));
	}
}
