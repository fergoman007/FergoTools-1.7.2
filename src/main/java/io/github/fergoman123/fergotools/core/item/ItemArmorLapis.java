package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergoutil.item.ArmorType;

public class ItemArmorLapis extends ItemArmorFT
{

    public ItemArmorLapis(ArmorType type) {
        super(AM.lapisArmor, type, FTContent.gemLapis, "lapis");
        if (type == ArmorType.HELMET)
        {
            this.setUnlocalizedName(ItemNames.lapisHelmet);
        }

        if(type == ArmorType.CHEST)
        {
            this.setUnlocalizedName(ItemNames.lapisChestplate);
        }

        if (type == ArmorType.LEGS)
        {
            this.setUnlocalizedName(ItemNames.lapisLeggings);
        }

        if (type == ArmorType.BOOTS)
        {
            this.setUnlocalizedName(ItemNames.lapisBoots);
        }
    }
}
