package io.github.fergoman123.fergotools.item;

import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeFT extends ItemPickaxe{

    public ToolMaterial material;

    public ItemPickaxeFT(ToolMaterial material, String name) {
        super(material);
        this.material = material;
        this.setMaxDamage(material.getMaxUses());
        this.setUnlocalizedName(name);
    }


}
