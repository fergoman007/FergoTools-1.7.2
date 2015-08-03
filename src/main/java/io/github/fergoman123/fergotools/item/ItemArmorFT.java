package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import io.github.fergoman123.fergoutil.item.ItemArmorFergo;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorFT extends ItemArmorFergo{
    public ArmorMaterial material;

    public ItemArmorFT(ArmorMaterial material, ArmorType type, String name) {
        super(material, "ft", FergoTools.tabFergoTools, type, name);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        String layer1 = String.format("fergotools:textures/models/armor/%s_1.png", this.material.getName());
        String layer2 = String.format("fergotools:textures/models/armor/%s_2.png", this.material.getName());

        if (slot == ArmorType.helmet.ordinal() || slot == ArmorType.chestplate.ordinal() || slot == ArmorType.boots.ordinal()){
            return layer1;
        }

        if (slot == ArmorType.leggings.ordinal()){
            return layer2;
        } else {
            return null;
        }
    }
}
