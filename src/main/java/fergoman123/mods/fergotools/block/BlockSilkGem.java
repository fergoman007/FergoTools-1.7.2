package fergoman123.mods.fergotools.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockSilkGem extends Block {
	
	public BlockSilkGem()
	{
		super(Material.iron);
	}
	
	public Item getItemDropped(int par1, Random rand, int par3)
	{
		return Item.getItemFromBlock(this);
	}

}
