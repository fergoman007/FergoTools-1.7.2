package io.github.fergoman123.fergotools.item.tool;

import io.github.fergoman123.fergotools.tab.CTFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemHoeFT extends ItemHoe{
    private ToolMaterial material;
    public ItemHoeFT(ToolMaterial material, String name){
        super(material);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CTFT.tabFergoTools);
        this.setMaxDamage(material.getMaxUses());
        this.material = material;
    }

    public String getUnlocalizedName() {
        return String.format("item.fergotools.%s", NameHelper.getName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.fergotools.%s", NameHelper.getName(super.getUnlocalizedName(stack)));
    }

    public ToolMaterial getToolMaterial(){
        return this.material;
    }
}
