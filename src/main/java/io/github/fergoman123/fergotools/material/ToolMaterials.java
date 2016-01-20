package io.github.fergoman123.fergotools.material;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import static net.minecraft.item.Item.ToolMaterial;

public class ToolMaterials {

    public static final ToolMaterial quartz = addToolMaterial("quartz", 3, 1000000, 15f, 20f, )

    public static ToolMaterial addToolMaterial(String name, int harvestLvl, int maxUses, float eff, float damage, int ench, ItemStack repairItem) {
        ToolMaterial material = EnumHelper.addToolMaterial(name, harvestLvl, maxUses, eff, damage, ench);
        material.setRepairItem(repairItem);
        return material;
    }
}
