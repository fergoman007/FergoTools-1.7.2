package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMultiFT extends Item
{
	private String[] names;
	
    public ItemMultiFT(String[] names, String name) {
        super();
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.names = names;
        this.setUnlocalizedName("ft." + name);
        this.setHasSubtypes(true);
    }
    
    public String getUnlocalizedName(ItemStack stack){
    	return super.getUnlocalizedName() + "." + this.names[stack.getItemDamage()];
    }
}
