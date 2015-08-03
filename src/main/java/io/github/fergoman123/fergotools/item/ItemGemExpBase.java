package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGemExpBase extends Item{

    private int type;

    public ItemGemExpBase(int type){
        super();
        this.type = type;
        if (type == 0){
            this.setUnlocalizedName(ItemNames.gemExp);
        } else if (type == 1){
            this.setUnlocalizedName(ItemNames.gemExp2);
        } else if (type == 2){
            this.setUnlocalizedName(ItemNames.gemExp3);
        }
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.ft.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.ft.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    public int getType() {
        return type;
    }
}
