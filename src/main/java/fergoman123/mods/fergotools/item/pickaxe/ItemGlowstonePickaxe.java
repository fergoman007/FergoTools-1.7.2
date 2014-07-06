package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.item.materials.ItemGlowstoneIngot;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemGlowstonePickaxe extends PickaxeGeneric
{
    public static ItemGlowstonePickaxe instance = new ItemGlowstonePickaxe();

    public ItemGlowstonePickaxe()
    {
        super(UtilToolArmor.glowstone);
        this.setUnlocalizedName(ToolStrings.glowstonePickaxe);
        this.setMaxDamage(UtilToolArmor.getGlowstoneMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ItemGlowstoneIngot.instance)) || super.getIsRepairable(stack1, stack2);
    }
}
