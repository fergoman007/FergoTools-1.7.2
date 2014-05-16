package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemGlowstonePickaxe extends ItemPickaxe
{
    public ItemGlowstonePickaxe()
    {
        super(UtilToolArmor.glowstone);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.fergoMaterials, 1, 5)) || super.getIsRepairable(stack1, stack2);
    }
}
