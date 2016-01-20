package io.github.fergoman123.fergotools.item.tool;

import net.minecraft.item.Item;

public class ItemSwordFT extends Item {
    private float attackDamage;
    private final ToolMaterial material;

    public ItemSwordFT(ToolMaterial material) {
        this.material = material;
        setMaxStackSize(1);
        setMaxDamage(material.getMaxUses());
//        setCreativeTab()
    }
}
