package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFT extends Item {
    public ItemFT(String name){
        super();
        this.setUnlocalizedName(name);
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
