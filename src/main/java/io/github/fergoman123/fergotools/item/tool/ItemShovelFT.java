package io.github.fergoman123.fergotools.item.tool;

import io.github.fergoman123.fergotools.tab.CTFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemShovelFT extends ItemSpade{
    public ItemShovelFT(ToolMaterial material, String name) {
        super(material);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CTFT.tabFergoTools);
        this.setMaxDamage(material.getMaxUses());
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.fergotools.%s", NameHelper.getName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.fergotools.%s", NameHelper.getName(super.getUnlocalizedName(stack)));
    }
}
