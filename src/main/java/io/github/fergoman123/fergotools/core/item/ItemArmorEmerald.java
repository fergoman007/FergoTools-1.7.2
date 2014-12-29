package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergoutil.item.ArmorType;

public class ItemArmorEmerald extends ItemArmorFT {
    public ItemArmorEmerald(ArmorType type) {
        super(AM.emeraldArmor, type, FTContent.gemEmerald, "emerald");
        if (type == ArmorType.HELMET)
        {
            this.setUnlocalizedName(ItemNames.emeraldHelmet);
        }

        if (type == ArmorType.CHEST)
        {
            this.setUnlocalizedName(ItemNames.emeraldChestplate);
        }

        if (type == ArmorType.LEGS)
        {
            this.setUnlocalizedName(ItemNames.emeraldLeggings);
        }

        if (type == ArmorType.BOOTS)
        {
            this.setUnlocalizedName(ItemNames.emeraldBoots);
        }
    }
}
