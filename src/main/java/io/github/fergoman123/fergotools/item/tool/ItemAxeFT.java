package io.github.fergoman123.fergotools.item.tool;

import io.github.fergoman123.fergotools.tab.CTFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemAxeFT extends ItemAxe{
    private ToolMaterial material;
    public ItemAxeFT(ToolMaterial material, String name) {
        super(material);
        this.setMaxDamage(material.getMaxUses());
        this.setUnlocalizedName(name);
        this.setCreativeTab(CTFT.tabFergoTools);
    }

    public String getUnlocalizedName(){
        return String.format("item.fergotools.%s", NameHelper.getName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack){
        return String.format("item.fergotools.%s", NameHelper.getName(super.getUnlocalizedName(stack)));
    }
}
