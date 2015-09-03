package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockFT extends Block{
	private String name;

	public BlockFT(Material material, String name){
		super(material);
		this.setCreativeTab(FergoTools.tabFergoTools);
		this.setUnlocalizedName(name);
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public BlockFT register(){
		GameRegistry.registerBlock(this, this.name);
		RegisterHelper.getModelMesher().register(Item.getItemFromBlock(this), 0, new ModelResourceLocation("fergotools:" + this.name, "inventory"));
		ModelBakery.addVariantName(Item.getItemFromBlock(this), "fergotools:" + this.name);
		return this;
	}
}
