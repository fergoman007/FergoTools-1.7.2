package fergoman123.mods.fergotools.item.tools;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import fergoman123.mods.fergotools.item.ModItems;

public class ItemSilkHoe extends ItemHoe{
	
	public ItemSilkHoe()
	{
		super(ModItems.silk);
	}
	
	public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
	{
		return stack2.isItemEqual(new ItemStack(ModItems.silkGem)) || super.getIsRepairable(stack1, stack2);
	}
	
	public void onCreated(ItemStack stack, World world, EntityPlayer player)
	{
		stack.addEnchantment(Enchantment.silkTouch, 1);
	}

}
