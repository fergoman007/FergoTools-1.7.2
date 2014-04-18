package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemQuartzPickaxe extends ItemPickaxe
{
    public ItemQuartzPickaxe()
    {
        super(ToolArmorMaterials.quartz);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(stack1, stack2);
    }
}
