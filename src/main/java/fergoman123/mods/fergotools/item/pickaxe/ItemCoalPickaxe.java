package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemCoalIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.item.ItemStack;

public class ItemCoalPickaxe extends ItemPickaxeFT
{

    public ItemCoalPickaxe()
    {
        super(ToolArmorMaterials.coal, ToolArmorMaterials.coal.getMaxUses());
        this.setUnlocalizedName(Names.Items.coalPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.ingotCoal)) || super.getIsRepairable(stack1, stack2);
    }
}
