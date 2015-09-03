package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;

public abstract class BlockMultiFT extends Block {

	private String[] subNames;
	private String name;

	public BlockMultiFT(Material material, String[] subNames, String name) {
		super(material);
		this.setCreativeTab(FergoTools.tabFergoTools);
		this.setUnlocalizedName(name);
		this.subNames = subNames;
		this.name = name;
	}

	public String getUnlocalizedName(){
		return String.format("item.ft.%s", this.name);
	}

	public String[] getSubNames() {
		return subNames;
	}

	public String getName() {
		return name;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		for (int i = 0; i < this.getSubNames().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

	public static final class ItemBlockFT extends ItemBlockVariants{

		public ItemBlockFT(Block block){
			super(block);
		}

		@Override
		public String getUnlocalizedName(ItemStack stack) {
			BlockMultiFT multiFT = (BlockMultiFT)this.block;
			return super.getUnlocalizedName() + "." + multiFT.getSubNames()[stack.getMetadata()];
		}
	}

	public BlockMultiFT register(){
		GameRegistry.registerBlock(this, ItemBlockFT.class, this.name);
		for (int i = 0; i < this.getSubNames().length; i++) {
			RegisterHelper.getModelMesher().register(Item.getItemFromBlock(this), i, new ModelResourceLocation("fergotools:" + this.getSubNames()[i], "inventory"));
			ModelBakery.addVariantName(Item.getItemFromBlock(this), "fergotools:" + this.getSubNames()[i]);
		}
		return this;
	}

	public abstract int damageDropped(IBlockState state);
	public abstract IBlockState getStateFromMeta(int meta);
	public abstract int getMetaFromState(IBlockState state);
	public abstract BlockState createBlockState();
}
