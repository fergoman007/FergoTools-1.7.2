package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemGlowstoneShovel extends ItemSpade {

	public ItemGlowstoneShovel() {
		super(ModItems.glowstone);
	}

	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.glowstoneIngot)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
