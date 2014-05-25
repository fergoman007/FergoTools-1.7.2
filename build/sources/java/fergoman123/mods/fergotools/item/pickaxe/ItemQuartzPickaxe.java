package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.lib.strings.Strings;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.recipe.UtilToolArmor;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemQuartzPickaxe extends ItemPickaxe
{
    public ItemQuartzPickaxe()
    {
        super(UtilToolArmor.quartz);
        this.setUnlocalizedName(Strings.ToolStrings.quartzPickaxe);
        this.setMaxDamage(UtilToolArmor.quartz.getMaxUses());
        this.setCreativeTab(Tabs.tabFergoTools);
        this.setTextureName(Textures.ToolTextures.quartzPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(stack1, stack2);
    }
}
