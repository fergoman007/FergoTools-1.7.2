package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemQuartzSword extends ItemSword {

    public ItemQuartzSword() {
        super(UtilToolArmor.quartz);
        this.setUnlocalizedName(Strings.ToolStrings.quartzSword);
        this.setMaxDamage(UtilToolArmor.quartz.getMaxUses());
        this.setCreativeTab(Tabs.tabFergoTools);
        this.setTextureName(Textures.ToolTextures.quartzSword);
        this.setMaxStackSize(1);
    }


    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
