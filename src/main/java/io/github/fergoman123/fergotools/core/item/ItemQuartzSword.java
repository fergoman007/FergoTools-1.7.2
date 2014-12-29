package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemSwordFT;
import net.minecraft.init.Items;

public class ItemQuartzSword extends ItemSwordFT
{
    public ItemQuartzSword() {
        super(TM.quartz, Items.quartz);
        this.setUnlocalizedName(ItemNames.quartzSword);
    }
}
