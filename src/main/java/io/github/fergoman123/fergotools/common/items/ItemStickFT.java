package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.api.base.ItemMultiFT;
import io.github.fergoman123.fergotools.reference.ItemNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemStickFT extends ItemMultiFT
{
    public ItemStickFT() {
        super(ItemNames.sticks, ItemNames.stickFT);
    }

    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, List list) {
        for (int i = 0; i < ItemNames.sticks.length; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }
}
