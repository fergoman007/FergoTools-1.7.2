package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergoutil.item.ArmorType;

public class ItemArmorGlowstone extends ItemArmorFT
{
    public ItemArmorGlowstone(ArmorType type) {
        super(AM.glowstoneArmor, type, FTContent.ingotGlowstone, "glowstone");
        if (type == ArmorType.HELMET)
        {
            this.setUnlocalizedName(ItemNames.glowstoneHelmet);
        }

        if (type == ArmorType.CHEST)
        {
            this.setUnlocalizedName(ItemNames.glowstoneChestplate);
        }

        if (type == ArmorType.LEGS)
        {
            this.setUnlocalizedName(ItemNames.glowstoneLeggings);
        }

        if (type == ArmorType.BOOTS)
        {
            this.setUnlocalizedName(ItemNames.glowstoneBoots);
        }
    }
}
