package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.item.materials.ItemRedstoneCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.SwordGeneric;
import net.minecraft.item.ItemStack;

public class ItemRedstoneSword extends SwordGeneric {

    public static ItemRedstoneSword instance = new ItemRedstoneSword();

    public ItemRedstoneSword()
    {
        super(UtilToolArmor.redstone);
        this.setUnlocalizedName(Names.Items.redstoneSword);
        this.setMaxDamage(UtilToolArmor.getRedstoneMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ItemRedstoneCrystal.instance)) || super.getIsRepairable(stack1, stack2);
    }
}
