package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemBronzeIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.item.ItemStack;

public class ItemBronzePickaxe extends ItemPickaxeFT
{
    public ItemBronzePickaxe()
    {
        super(ToolArmorMaterials.bronze, ToolArmorMaterials.bronze.getMaxUses());
        this.setUnlocalizedName(Names.Items.bronzePickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.ingotBronze)) || super.getIsRepairable(stack1, stack2);
    }
}
