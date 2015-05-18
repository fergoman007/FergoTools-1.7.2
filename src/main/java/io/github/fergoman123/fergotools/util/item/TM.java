package io.github.fergoman123.fergotools.util.item;

import io.github.fergoman123.fergotools.api.content.ToolMaterials;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TM
{
    public static final ToolMaterial quartz = addToolMaterial(ToolMaterials.quartz);
    public static final ToolMaterial obsidian = addToolMaterial(ToolMaterials.obsidian);
    public static final ToolMaterial emerald = addToolMaterial(ToolMaterials.emerald);
    public static final ToolMaterial lapis = addToolMaterial(ToolMaterials.lapis);
    public static final ToolMaterial bronze = addToolMaterial(ToolMaterials.bronze);
    public static final ToolMaterial coal = addToolMaterial(ToolMaterials.coal);
    public static final ToolMaterial glowstone = addToolMaterial(ToolMaterials.glowstone);
    public static final ToolMaterial adamantium = addToolMaterial(ToolMaterials.adamantium);
    public static final ToolMaterial donator = addToolMaterial(ToolMaterials.donator);
    public static final ToolMaterial silk = addToolMaterial(ToolMaterials.silk);
    public static final ToolMaterial redstone = addToolMaterial(ToolMaterials.redstone);

    private static ToolMaterial addToolMaterial(ToolMaterials material)
    {
        return EnumHelper.addToolMaterial(material.getName(), material.getHarvestLevel(), material.getMaxDamage(), material.getEfficiency(), material.getDamageVsEntity(), material.getEnchantability()).setRepairItem(material.getRepairItemStack());
    }
}
