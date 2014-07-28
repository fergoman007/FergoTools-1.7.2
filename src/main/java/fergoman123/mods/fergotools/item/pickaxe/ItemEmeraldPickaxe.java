package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemEmeraldCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.item.ItemStack;

public class ItemEmeraldPickaxe extends ItemPickaxeFT
{

    public ItemEmeraldPickaxe()
    {
        super(ToolArmorMaterials.emerald, ToolArmorMaterials.emerald.getMaxUses());
        this.setUnlocalizedName(Names.Items.emeraldPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.emeraldCrystal)) || super.getIsRepairable(stack1, stack2);
    }
}
