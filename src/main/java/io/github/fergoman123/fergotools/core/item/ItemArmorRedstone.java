package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemArmorRedstone extends ItemArmorFT {
    public ItemArmorRedstone(ArmorType type) {
        super(AM.redstoneArmor, type, FTContent.gemRedstone, "redstone");
        if (type == ArmorType.HELMET)
        {
            this.setUnlocalizedName(ItemNames.redstoneHelmet);
        }

        if (type == ArmorType.CHEST)
        {
            this.setUnlocalizedName(ItemNames.redstoneChestplate);
        }

        if (type == ArmorType.LEGS)
        {
            this.setUnlocalizedName(ItemNames.redstoneLeggings);
        }

        if (type == ArmorType.BOOTS)
        {
            this.setUnlocalizedName(ItemNames.redstoneBoots);
        }
    }



}
