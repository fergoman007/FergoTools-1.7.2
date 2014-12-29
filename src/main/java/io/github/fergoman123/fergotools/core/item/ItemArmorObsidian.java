package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergoutil.item.ArmorType;

public class ItemArmorObsidian extends ItemArmorFT
{

    public ItemArmorObsidian(ArmorType type) {
        super(AM.obsidianArmor, type, FTContent.ingotObsidian, "obsidian");
        if (type == ArmorType.HELMET)

        {
            this.setUnlocalizedName(ItemNames.obsidianHelmet);
        }

        if (type == ArmorType.CHEST)
        {
            this.setUnlocalizedName(ItemNames.obsidianChestplate);
        }

        if (type == ArmorType.LEGS)
        {
            this.setUnlocalizedName(ItemNames.obsidianLeggings);
        }

        if (type == ArmorType.BOOTS)
        {
            this.setUnlocalizedName(ItemNames.obsidianBoots);
        }
    }
}
