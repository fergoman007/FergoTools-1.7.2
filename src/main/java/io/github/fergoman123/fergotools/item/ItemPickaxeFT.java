package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.item.ItemPickaxeFergo;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeFT extends ItemPickaxeFergo {

    public Item.ToolMaterial material;

    public ItemPickaxeFT(Item.ToolMaterial material, String name) {
        super(material, "ft", FergoTools.tabFergoTools, name);
    }


}
