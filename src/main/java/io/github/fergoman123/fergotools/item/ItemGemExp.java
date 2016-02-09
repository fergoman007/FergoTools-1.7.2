package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergotools.tab.CTFT;
import io.github.fergoman123.fergoutil.item.ItemMultiFergo;
import net.minecraft.item.ItemStack;

public class ItemGemExp extends ItemMultiFT {
    public ItemGemExp() {
        super(ItemNames.expGems);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
