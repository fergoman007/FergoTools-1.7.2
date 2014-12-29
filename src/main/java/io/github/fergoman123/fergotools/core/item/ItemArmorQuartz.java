package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.init.Items;

public class ItemArmorQuartz extends ItemArmorFT
{
    public ItemArmorQuartz(ArmorType type) {
        super(AM.quartzArmor, type, Items.quartz, "quartz");
        if (type == ArmorType.HELMET)
        {
            this.setUnlocalizedName(ItemNames.quartzHelmet);
        }

        if (type == ArmorType.CHEST)
        {
            this.setUnlocalizedName(ItemNames.quartzChestplate);
        }

        if (type == ArmorType.LEGS)
        {
            this.setUnlocalizedName(ItemNames.quartzLeggings);
        }

        if (type == ArmorType.BOOTS)
        {
            this.setUnlocalizedName(ItemNames.quartzBoots);
        }
    }


}
