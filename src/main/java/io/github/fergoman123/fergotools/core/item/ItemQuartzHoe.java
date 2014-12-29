package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemHoeFT;
import net.minecraft.init.Items;

public class ItemQuartzHoe extends ItemHoeFT {

    public ItemQuartzHoe() {
        super(TM.quartz, Items.quartz);
        this.setUnlocalizedName(ItemNames.quartzHoe);
    }
}
