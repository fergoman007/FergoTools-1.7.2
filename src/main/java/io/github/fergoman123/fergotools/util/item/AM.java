package io.github.fergoman123.fergotools.util.item;

import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.reference.ints.ArmorInts;
import io.github.fergoman123.fergotools.reference.strings.Material;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class AM
{
    public static ArmorMaterial quartzArmor;
    public static ArmorMaterial obsidianArmor;
    public static ArmorMaterial emeraldArmor;
    public static ArmorMaterial lapisArmor;
    public static ArmorMaterial bronzeArmor;
    public static ArmorMaterial coalArmor;
    public static ArmorMaterial glowstoneArmor;
    public static ArmorMaterial adamantiumArmor;
    public static ArmorMaterial redstoneArmor;

    public static void initMaterials()
    {
        quartzArmor = EnumHelper.addArmorMaterial(Material.quartzArmor, ArmorInts.quartzArmorMaxDamage, ArmorInts.quartzReduct, ConfigHandler.enchantability);
        obsidianArmor = EnumHelper.addArmorMaterial(Material.obsidianArmor, ArmorInts.obsidianArmorMaxDamage, ArmorInts.obsidianReduct, ConfigHandler.enchantability);
        emeraldArmor = EnumHelper.addArmorMaterial(Material.emeraldArmor, ArmorInts.emeraldArmorMaxDamage, ArmorInts.emeraldReduct, ConfigHandler.enchantability);
        lapisArmor = EnumHelper.addArmorMaterial(Material.lapisArmor, ArmorInts.lapisArmorMaxDamage, ArmorInts.lapisReduct, ConfigHandler.enchantability);
        bronzeArmor = EnumHelper.addArmorMaterial(Material.bronzeArmor, ArmorInts.bronzeArmorMaxDamage, ArmorInts.bronzeReduct, ConfigHandler.enchantability);
        coalArmor = EnumHelper.addArmorMaterial(Material.coalArmor, ArmorInts.coalArmorMaxDamage, ArmorInts.coalReduct, ConfigHandler.enchantability);
        glowstoneArmor = EnumHelper.addArmorMaterial(Material.glowstoneArmor, ArmorInts.glowstoneArmorMaxDamage, ArmorInts.glowstoneReduct, ConfigHandler.enchantability);
        adamantiumArmor = EnumHelper.addArmorMaterial(Material.adamantiumArmor, ArmorInts.adamantiumArmorMaxDamage, ArmorInts.adamantiumReduct, ConfigHandler.enchantability);
        redstoneArmor = EnumHelper.addArmorMaterial(Material.redstoneArmor, ArmorInts.redstoneArmorMaxDamage, ArmorInts.redstoneReduct, ConfigHandler.enchantability);

    }
}
