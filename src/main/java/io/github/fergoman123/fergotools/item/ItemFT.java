package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.FergoTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFT extends Item {

    private String name;

    public ItemFT(String name, int maxStackSize){
        super();
        this.name = name;
        this.setUnlocalizedName(name);
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setMaxStackSize(maxStackSize);
    }

    public ItemFT(String name){
        this(name, 64);
    }

    public String getUnlocalizedName(){
        return String.format("item.ft.%s", this.name);
    }

    public String getUnlocalizedName(ItemStack stack){
        return String.format("item.ft.%s", this.name);
    }

    public String getName() {
        return name;
    }
}
