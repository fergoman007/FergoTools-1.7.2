package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.FergoTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemHoeFT extends ItemHoe{
    private Item.ToolMaterial material;
    private String name;

    public ItemHoeFT(Item.ToolMaterial material, String name){
        super(material);
        this.setUnlocalizedName(name);
        this.name = name;
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setHarvestLevel("hoe", material.getHarvestLevel());
        this.setMaxDamage(material.getMaxUses());
    }

    public String getUnlocalizedName(){
        return String.format("item.ft.%s", this.name);
    }

    public String getUnlocalizedName(ItemStack stack){
        return String.format("item.ft.%s", this.name);
    }

    public Item.ToolMaterial getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }
}
