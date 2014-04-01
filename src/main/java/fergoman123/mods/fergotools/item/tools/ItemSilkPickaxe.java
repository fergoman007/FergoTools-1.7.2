package fergoman123.mods.fergotools.item.tools;

import cpw.mods.fml.common.discovery.ModDiscoverer;
import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSilkPickaxe extends ItemPickaxe {
	
	public ItemSilkPickaxe()
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
