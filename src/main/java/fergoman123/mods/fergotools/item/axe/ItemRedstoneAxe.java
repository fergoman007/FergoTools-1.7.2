package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemRedstoneAxe extends ItemAxe{
    public ItemRedstoneAxe() {
        super(ToolArmorMaterials.redstone);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.redstoneCrystal)) || super.getIsRepairable(stack1, stack2);
    }
}
