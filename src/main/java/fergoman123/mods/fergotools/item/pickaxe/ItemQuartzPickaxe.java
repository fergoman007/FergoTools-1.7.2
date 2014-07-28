package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemQuartzPickaxe extends ItemPickaxeFT
{

    public ItemQuartzPickaxe()
    {
        super(ToolArmorMaterials.quartz, ToolArmorMaterials.quartz.getMaxUses());
        this.setUnlocalizedName(Names.Items.quartzPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(stack1, stack2);
    }
}
