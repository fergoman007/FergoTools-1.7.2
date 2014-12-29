package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergoutil.item.ArmorType;

public class ItemArmorBronze extends ItemArmorFT {

    public ItemArmorBronze(ArmorType type) {
        super(AM.bronzeArmor, type, FTContent.ingotBronze, "bronze");
        if (type == ArmorType.HELMET)
        {
            this.setUnlocalizedName(ItemNames.bronzeHelmet);
        }

        if (type == ArmorType.CHEST)
        {
            this.setUnlocalizedName(ItemNames.bronzeChestplate);
        }

        if (type == ArmorType.LEGS)
        {
            this.setUnlocalizedName(ItemNames.bronzeLeggings);
        }

        if (type == ArmorType.BOOTS)
        {
            this.setUnlocalizedName(ItemNames.bronzeBoots);
        }
    }
}
