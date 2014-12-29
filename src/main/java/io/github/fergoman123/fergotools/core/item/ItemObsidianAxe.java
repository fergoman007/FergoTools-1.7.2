package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemAxeFT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemObsidianAxe extends ItemAxeFT
{
    public ItemObsidianAxe() {
        super(TM.obsidian, FTContent.ingotObsidian);
        this.setUnlocalizedName(ItemNames.obsidianAxe);
    }
}
