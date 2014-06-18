package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.HoeGeneric;
import net.minecraft.item.ItemStack;

public class ItemRedstoneHoe extends HoeGeneric{

    public static ItemRedstoneHoe instance = new ItemRedstoneHoe();

    public ItemRedstoneHoe()
    {
        super(UtilToolArmor.redstone);
        this.setUnlocalizedName(Strings.ToolStrings.redstoneHoe);
        this.setMaxDamage(UtilToolArmor.redstone.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.redstoneCrystal)) || super.getIsRepairable(stack1, stack2);
    }
}
