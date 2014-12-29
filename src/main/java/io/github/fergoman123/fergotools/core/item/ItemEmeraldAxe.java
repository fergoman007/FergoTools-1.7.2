package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemAxeFT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemEmeraldAxe extends ItemAxeFT {

    public ItemEmeraldAxe() {
        super(TM.emerald, FTContent.gemEmerald);
        this.setUnlocalizedName(ItemNames.emeraldAxe);
    }
}
