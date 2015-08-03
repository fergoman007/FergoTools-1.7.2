package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.item.ItemFT;
import io.github.fergoman123.fergotools.reference.ItemNames;
import net.minecraft.item.ItemStack;

public class ItemExpCollector extends ItemFT {
    public ItemExpCollector() {
        super(ItemNames.expCollector);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
