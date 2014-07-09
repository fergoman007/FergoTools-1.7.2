package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.item.materials.ItemRedstoneCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.HoeGeneric;
import net.minecraft.item.ItemStack;

public class ItemRedstoneHoe extends HoeGeneric{

    public static ItemRedstoneHoe instance = new ItemRedstoneHoe();

    public ItemRedstoneHoe()
    {
        super(UtilToolArmor.redstone);
        this.setUnlocalizedName(Names.Items.redstoneHoe);
        this.setMaxDamage(UtilToolArmor.redstone.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ItemRedstoneCrystal.instance)) || super.getIsRepairable(stack1, stack2);
    }
}
