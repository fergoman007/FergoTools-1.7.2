package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.FergoTools;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;

public class ItemShearsFT extends ItemShears{
    public ToolMaterial material;

    public ItemShearsFT(ToolMaterial material, String name) {
        super();
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setUnlocalizedName(name);
        this.setMaxDamage(material.getMaxUses());
    }

    @Override
    public String getUnlocalizedName() {
        return super.getUnlocalizedName();
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(this.material.getRepairItemStack()) || super.getIsRepairable(toRepair, repair);
    }
}
