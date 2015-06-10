package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.api.base.ItemFT;
import io.github.fergoman123.fergotools.reference.gui.ItemNames;
import net.minecraft.item.ItemStack;

public class ItemExpShard extends ItemFT
{
    public ItemExpShard() {
        super(ItemNames.shardExp);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
