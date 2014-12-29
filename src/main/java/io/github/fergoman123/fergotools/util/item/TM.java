package io.github.fergoman123.fergotools.util.item;

import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.reference.ints.ToolInts;
import io.github.fergoman123.fergotools.reference.strings.Material;
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
        quartz = EnumHelper.addToolMaterial(Material.quartzToolMat, ToolInts.harvestLvl, ToolInts.quartzMaxDamage, ToolInts.quartzEff, ToolInts.quartzDamage, ConfigHandler.enchantability);
        obsidian = EnumHelper.addToolMaterial(Material.obsidianToolMat, ToolInts.harvestLvl, ToolInts.obsidianMaxDamage, ToolInts.obsidianEff, ToolInts.obsidianDamage, ConfigHandler.enchantability);
        emerald = EnumHelper.addToolMaterial(Material.emeraldToolMat, ToolInts.harvestLvl, ToolInts.emeraldMaxDamage, ToolInts.emeraldEff, ToolInts.emeraldDamage, ConfigHandler.enchantability);
        lapis = EnumHelper.addToolMaterial(Material.lapisToolMat, ToolInts.harvestLvl, ToolInts.lapisMaxDamage, ToolInts.lapisEff, ToolInts.lapisDamage, ConfigHandler.enchantability);
        bronze = EnumHelper.addToolMaterial(Material.bronzeToolMat, ToolInts.harvestLvl, ToolInts.bronzeMaxDamage, ToolInts.bronzeEff, ToolInts.bronzeDamage, ConfigHandler.enchantability);
        coal = EnumHelper.addToolMaterial(Material.coalToolMat, ToolInts.harvestLvl, ToolInts.coalMaxDamage, ToolInts.coalEff, ToolInts.coalDamage, ConfigHandler.enchantability);
        glowstone = EnumHelper.addToolMaterial(Material.glowstoneToolMat, ToolInts.harvestLvl, ToolInts.glowstoneMaxDamage, ToolInts.glowstoneEff, ToolInts.glowstoneDamage, ConfigHandler.enchantability);
        adamantium = EnumHelper.addToolMaterial(Material.adamantiumToolMat, ToolInts.harvestLvl, ToolInts.adamantiumMaxDamage, ToolInts.adamantiumEff, ToolInts.adamantiumDamage, ConfigHandler.enchantability);
        donator = EnumHelper.addToolMaterial(Material.donatorToolMat, ToolInts.harvestLvl, ToolInts.donatorMaxDamage, ToolInts.donatorEff, ToolInts.donatorDamage, ConfigHandler.enchantability);
        silk = EnumHelper.addToolMaterial(Material.silkToolMat, ToolInts.harvestLvl, ToolInts.silkMaxDamage, ToolInts.silkEff, ToolInts.silkDamage, ConfigHandler.enchantability);
        redstone = EnumHelper.addToolMaterial(Material.redstoneToolMat, ToolInts.harvestLvl, ToolInts.redstoneMaxDamage, ToolInts.redstoneEff, ToolInts.redstoneDamage, ConfigHandler.enchantability);
    }
}
