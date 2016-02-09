package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorFT extends ItemArmor {

    private ArmorType armorType;

    public ItemArmorFT(ArmorMaterial material, ArmorType armorType) {
        super(material, 0, armorType.ordinal());
        this.armorType = armorType;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (slot == ArmorType.helmet.ordinal() || slot == ArmorType.chestplate.ordinal() || slot == ArmorType.boots.ordinal()) {
            return String.format("fergotools:textures/armor/" + this.getArmorMaterial().getName() + "_1.png");
        }

        if (slot == ArmorType.leggings.ordinal()) {
            return String.format("fergotools:textures/armor/" + this.getArmorMaterial().getName() + "_2.png");
        } else {
            return null;
        }
    }

    public ArmorType getArmorType(){
        return this.armorType;
    }
}
