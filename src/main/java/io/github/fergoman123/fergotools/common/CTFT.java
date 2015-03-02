package io.github.fergoman123.fergotools.common;

import io.github.fergoman123.fergotools.info.Locale;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTFT extends CreativeTabs
{
    public static final CTFT instance = new CTFT();

    public CTFT() {
        super(Locale.tabFergoTools);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.quartzPickaxe;
    }

    @Override
    public String getTranslatedTabLabel() {
        return NameHelper.translate(Locale.tabFergoTools);
    }
}
