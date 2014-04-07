package fergoman123.mods.fergotools.util.item;

import fergoman123.mods.fergotools.lib.ints.ArmorInts;
import fergoman123.mods.fergotools.lib.ints.ToolInts;
import fergoman123.mods.fergotools.lib.strings.MaterialStrings;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Fergoman123 on 05/04/2014.
 */
public class ToolArmorMaterials {

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

    public static ArmorMaterial quartzArmor;
    public static ArmorMaterial obsidianArmor;
    public static ArmorMaterial emeraldArmor;
    public static ArmorMaterial lapisArmor;
    public static ArmorMaterial bronzeArmor;
    public static ArmorMaterial coalArmor;
    public static ArmorMaterial glowstoneArmor;

    public static void addToolMaterials()
    {
        quartz = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[0], ToolInts.harvestLvl, ToolInts.quartzMaxDamage, ToolInts.quartzEff, ToolInts.quartzDamage, ToolInts.enchantability);
        obsidian = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[1], ToolInts.harvestLvl, ToolInts.obsidianMaxDamage, ToolInts.obsidianEff, ToolInts.obsidianDamage, ToolInts.enchantability);
        emerald = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[2], ToolInts.harvestLvl, ToolInts.emeraldMaxDamage, ToolInts.emeraldEff, ToolInts.emeraldDamage, ToolInts.enchantability);
        lapis = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[3], ToolInts.harvestLvl, ToolInts.lapisMaxDamage, ToolInts.lapisEff, ToolInts.lapisDamage, ToolInts.enchantability);
        bronze = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[4], ToolInts.harvestLvl, ToolInts.bronzeMaxDamage, ToolInts.bronzeEff, ToolInts.bronzeDamage, ToolInts.enchantability);
        coal = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[5], ToolInts.harvestLvl, ToolInts.coalMaxDamage, ToolInts.coalEff, ToolInts.coalDamage, ToolInts.enchantability);
        glowstone = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[6], ToolInts.harvestLvl, ToolInts.glowstoneMaxDamage, ToolInts.glowstoneEff, ToolInts.glowstoneDamage, ToolInts.enchantability);
        adamantium = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[7], ToolInts.harvestLvl, ToolInts.adamantiumMaxDamage, ToolInts.adamantiumEff, ToolInts.adamantiumDamage, ToolInts.enchantability);
        donator = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[8], 3, 20000, 10f, 10, 30);
        silk = EnumHelper.addToolMaterial(MaterialStrings.toolMaterials[9], 3, 2500, 5f, 5, 30);
    }

    public static void addArmorMaterials() {
        quartzArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[0], ArmorInts.quartzArmorMaxDamage, ArmorInts.quartzReduct, ArmorInts.enchantability);
        obsidianArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[1], ArmorInts.obsidianArmorMaxDamage, ArmorInts.obsidianReduct, ArmorInts.enchantability);
        emeraldArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[2], ArmorInts.obsidianArmorMaxDamage, ArmorInts.emeraldReduct, ArmorInts.enchantability);
        lapisArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[3], ArmorInts.lapisArmorMaxDamage, ArmorInts.lapisReduct, ArmorInts.enchantability);
        bronzeArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[4], ArmorInts.bronzeArmorMaxDamage, ArmorInts.bronzeReduct, ArmorInts.enchantability);
        coalArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[5], ArmorInts.coalArmorMaxDamage, ArmorInts.coalReduct, ArmorInts.enchantability);
        glowstoneArmor = EnumHelper.addArmorMaterial(MaterialStrings.armorMaterials[6], ArmorInts.glowstoneArmorMaxDamage, ArmorInts.glowstoneReduct, ArmorInts.enchantability);
    }
}
