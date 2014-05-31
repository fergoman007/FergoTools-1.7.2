package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemQuartzHoe extends ItemHoe {

    public ItemQuartzHoe() {
        super(UtilToolArmor.quartz);
        this.setUnlocalizedName(Strings.ToolStrings.quartzHoe);
        this.setMaxDamage(UtilToolArmor.quartz.getMaxUses());
        this.setCreativeTab(Tabs.tabFergoTools);
        this.setTextureName(Textures.ToolTextures.quartzHoe);
        this.setMaxStackSize(1);
    }


    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2) {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }
}


