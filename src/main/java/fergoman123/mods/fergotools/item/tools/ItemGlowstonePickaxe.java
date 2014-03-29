package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemGlowstonePickaxe extends ItemPickaxe {

	public ItemGlowstonePickaxe() {
		super(ModItems.glowstone);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.glowstoneIngot)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
