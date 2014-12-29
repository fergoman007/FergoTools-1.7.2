package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemSwordFT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBronzeSword extends ItemSwordFT {
    public ItemBronzeSword() {
        super(TM.bronze, FTContent.ingotBronze);
        this.setUnlocalizedName(ItemNames.bronzeSword);
    }
}
