package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemLapisCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.item.ItemStack;

public class ItemLapisPickaxe extends ItemPickaxeFT
{

    public ItemLapisPickaxe()
    {
        super(ToolArmorMaterials.lapis, ToolArmorMaterials.lapis.getMaxUses());
        this.setUnlocalizedName(Names.Items.lapisPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.lapisCrystal)) || super.getIsRepairable(stack1, stack2);
    }
}
