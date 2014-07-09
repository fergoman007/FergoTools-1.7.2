package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.item.materials.ItemEmeraldCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemEmeraldPickaxe extends PickaxeGeneric
{

    public static ItemEmeraldPickaxe instance = new ItemEmeraldPickaxe();

    public ItemEmeraldPickaxe()
    {
        super(UtilToolArmor.emerald);
        this.setUnlocalizedName(Names.Items.emeraldPickaxe);
        this.setMaxDamage(UtilToolArmor.getEmeraldMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ItemEmeraldCrystal.instance)) || super.getIsRepairable(stack1, stack2);
    }
}
