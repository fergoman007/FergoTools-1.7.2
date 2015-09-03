package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.FergoTools;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;

public class ItemShearsFT extends ItemShears{
    private ToolMaterial material;
    private String name;

    public ItemShearsFT(ToolMaterial material, String name) {
        super();
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setUnlocalizedName(name);
        this.setMaxDamage(material.getMaxUses());
        this.material = material;
        this.name = name;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.ft.%s", this.name);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.ft.%s", this.name);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(this.material.getRepairItemStack()) || super.getIsRepairable(toRepair, repair);
    }

    public ToolMaterial getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }
}
