package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemAxeFT extends ItemAxe{
    public ToolMaterial material;

    public ItemAxeFT(ToolMaterial material, String name) {
        super(material);
        this.setUnlocalizedName(name);
        this.setMaxDamage(material.getMaxUses());
        this.material = material;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.ft.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.ft.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }
}
