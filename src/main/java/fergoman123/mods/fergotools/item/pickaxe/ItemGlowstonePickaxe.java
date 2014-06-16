package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemGlowstonePickaxe extends PickaxeGeneric
{
    public static ItemGlowstonePickaxe instance = new ItemGlowstonePickaxe();

    public ItemGlowstonePickaxe()
    {
        super(UtilToolArmor.glowstone);
        this.setUnlocalizedName(Strings.ToolStrings.glowstonePickaxe);
        this.setMaxDamage(UtilToolArmor.getGlowstoneMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.glowstoneIngot)) || super.getIsRepairable(stack1, stack2);
    }
}
