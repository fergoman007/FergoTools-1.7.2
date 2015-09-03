package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGemExpBase extends ItemFT{

    private int type;

    public ItemGemExpBase(int type){
        super(ItemNames.gemExpVariants[type]);
        this.type = type;
    }

    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    public int getType() {
        return type;
    }
}
