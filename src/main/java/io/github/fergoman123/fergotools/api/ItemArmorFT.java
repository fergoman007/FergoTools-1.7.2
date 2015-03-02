package io.github.fergoman123.fergotools.api;

import io.github.fergoman123.fergotools.common.CTFT;
import io.github.fergoman123.fergoutil.item.ArmorType;
import io.github.fergoman123.fergoutil.item.ItemArmorFergo;
import net.minecraft.item.Item;

public class ItemArmorFT extends ItemArmorFergo
{
    public ItemArmorFT(ArmorMaterial material, ArmorType type, Item repairItem, String name) {
        super(material, 0, CTFT.instance, type, repairItem, name);
    }
}
