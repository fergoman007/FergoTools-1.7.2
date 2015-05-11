package io.github.fergoman123.fergotools.util.item;

import io.github.fergoman123.fergotools.api.content.ToolMaterials;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TM
{
    public static ToolMaterial quartz;
    public static ToolMaterial obsidian;
    public static ToolMaterial emerald;
    public static ToolMaterial lapis;
    public static ToolMaterial bronze;
    public static ToolMaterial coal;
    public static ToolMaterial glowstone;
    public static ToolMaterial adamantium;
    public static ToolMaterial donator;
    public static ToolMaterial silk;
    public static ToolMaterial redstone;

    public static final ToolMaterial[] materials = new ToolMaterial[]{quartz, obsidian, emerald, lapis, bronze, coal, glowstone, adamantium, donator, silk, redstone};

    public static void initMaterials()
    {
        quartz = addToolMaterial(ToolMaterials.quartz);
        obsidian = addToolMaterial(ToolMaterials.obsidian);
        emerald = addToolMaterial(ToolMaterials.emerald);
        lapis = addToolMaterial(ToolMaterials.lapis);
        bronze = addToolMaterial(ToolMaterials.bronze);
        coal = addToolMaterial(ToolMaterials.coal);
        glowstone = addToolMaterial(ToolMaterials.glowstone);
        adamantium = addToolMaterial(ToolMaterials.adamantium);
        donator = addToolMaterial(ToolMaterials.donator);
        silk = addToolMaterial(ToolMaterials.silk);
        redstone = addToolMaterial(ToolMaterials.redstone);
    }

    private static ToolMaterial addToolMaterial(ToolMaterials material)
    {
        return EnumHelper.addToolMaterial(material.getName(), material.getHarvestLevel(), material.getMaxDamage(), material.getEfficiency(), material.getDamageVsEntity(), material.getEnchantability()).setRepairItem(material.getRepairItemStack());
    }
}
