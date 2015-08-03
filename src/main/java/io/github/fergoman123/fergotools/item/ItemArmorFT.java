package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorFT extends ItemArmor{
    public ArmorMaterial material;

    public ItemArmorFT(ArmorMaterial material, ArmorType type, String name) {
        super(material, 0, type.ordinal());
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setUnlocalizedName(name);
        this.material = material;
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

    public String getUnlocalizedName(){
        return String.format("item.ft.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack){
        return String.format("item.ft.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }
}
