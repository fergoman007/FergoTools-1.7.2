package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemFT extends Item {

    public ItemFT(String name) {
        this.setUnlocalizedName(name);
    }

    public String getUnlocalizedName(){
        return String.format("item.ft.%s", NameHelper.getName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack){
        return String.format("item.ft.%s", NameHelper.getName(super.getUnlocalizedName(stack)));
    }
}
