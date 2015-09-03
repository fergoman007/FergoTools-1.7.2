package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.FergoTools;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemPickaxeFT extends ItemPickaxe {
    private ToolMaterial material;
    private String name;

    public ItemPickaxeFT(ToolMaterial material, String name){
        super(material);
        this.setUnlocalizedName(name);
        this.name = name;
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setHarvestLevel("pickaxe", material.getHarvestLevel());
        this.setMaxDamage(material.getMaxUses());
    }

    public String getUnlocalizedName(){
        return String.format("item.ft.%s", this.name);
    }

    public String getUnlocalizedName(ItemStack stack){
        return String.format("item.ft.%s", this.name);
    }

    public ToolMaterial getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }
}
