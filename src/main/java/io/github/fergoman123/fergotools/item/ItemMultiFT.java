package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMultiFT extends Item {

    public String[] subNames;

    public ItemMultiFT(String[] subNames, String name){
        super();
        this.setUnlocalizedName(name);
        this.subNames = subNames;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.ft.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.ft.%s.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)), subNames[stack.getItemDamage()]);
    }
}
