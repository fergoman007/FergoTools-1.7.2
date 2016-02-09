package io.github.fergoman123.fergotools.item.tool;

import io.github.fergoman123.fergotools.tab.CTFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemPickaxeFT extends ItemPickaxe{
    public ItemPickaxeFT(ToolMaterial material, String name) {
        super(material);
        this.setUnlocalizedName(name);
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(CTFT.tabFergoTools);
    }

    public String getUnlocalizedName(){
        return String.format("item.fergotools.%s", NameHelper.getName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack){
        return String.format("item.fergotools.%s", NameHelper.getName(super.getUnlocalizedName(stack)));
    }
}
