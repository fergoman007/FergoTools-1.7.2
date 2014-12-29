package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.init.Items;

public class ItemQuartzPickaxe extends ItemPickaxeFT
{
    public ItemQuartzPickaxe()
    {
        super(TM.quartz, Items.quartz);
        this.setUnlocalizedName(ItemNames.quartzPickaxe);
    }
}
