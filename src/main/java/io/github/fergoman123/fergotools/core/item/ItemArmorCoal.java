package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemArmorCoal extends ItemArmorFT
{

    public ItemArmorCoal(ArmorType type) {
        super(AM.coalArmor, type, FTContent.ingotCoal, "coal");
        if (type == ArmorType.HELMET)
        {
            this.setUnlocalizedName(ItemNames.coalHelmet);
        }

        if (type == ArmorType.CHEST)
        {
            this.setUnlocalizedName(ItemNames.coalChestplate);
        }

        if (type == ArmorType.LEGS)
        {
            this.setUnlocalizedName(ItemNames.coalLeggings);
        }

        if (type == ArmorType.BOOTS)
        {
            this.setUnlocalizedName(ItemNames.coalBoots);
        }
    }
}
