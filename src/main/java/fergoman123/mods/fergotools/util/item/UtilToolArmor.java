package fergoman123.mods.fergotools.util.item;

import fergoman123.mods.fergotools.lib.ints.ArmorInts;
import fergoman123.mods.fergotools.lib.ints.ToolInts;
import fergoman123.mods.fergotools.lib.Strings.MaterialStrings;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Fergoman123 on 05/04/2014.
 */
public class UtilToolArmor {

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

    public static ArmorMaterial quartzArmor;
    public static ArmorMaterial obsidianArmor;
    public static ArmorMaterial emeraldArmor;
    public static ArmorMaterial lapisArmor;
    public static ArmorMaterial bronzeArmor;
    public static ArmorMaterial coalArmor;
    public static ArmorMaterial glowstoneArmor;
    public static ArmorMaterial redstoneArmor;
    public static ArmorMaterial adamantiumArmor;

    public static void init()
    {
        addToolMaterials();
        addArmorMaterials();
    }

    public static void addToolMaterials()
    {
        quartz = EnumHelper.addToolMaterial(MaterialStrings.quartzToolMat, ToolInts.harvestLvl, ToolInts.quartzMaxDamage, ToolInts.quartzEff, ToolInts.quartzDamage, ToolInts.enchantability);
        obsidian = EnumHelper.addToolMaterial(MaterialStrings.obsidianToolMat, ToolInts.harvestLvl, ToolInts.obsidianMaxDamage, ToolInts.obsidianEff, ToolInts.obsidianDamage, ToolInts.enchantability);
        emerald = EnumHelper.addToolMaterial(MaterialStrings.emeraldToolMat, ToolInts.harvestLvl, ToolInts.emeraldMaxDamage, ToolInts.emeraldEff, ToolInts.emeraldDamage, ToolInts.enchantability);
        lapis = EnumHelper.addToolMaterial(MaterialStrings.lapisToolMat, ToolInts.harvestLvl, ToolInts.lapisMaxDamage, ToolInts.lapisEff, ToolInts.lapisDamage, ToolInts.enchantability);
        bronze = EnumHelper.addToolMaterial(MaterialStrings.bronzeToolMat, ToolInts.harvestLvl, ToolInts.bronzeMaxDamage, ToolInts.bronzeEff, ToolInts.bronzeDamage, ToolInts.enchantability);
        coal = EnumHelper.addToolMaterial(MaterialStrings.coalToolMat, ToolInts.harvestLvl, ToolInts.coalMaxDamage, ToolInts.coalEff, ToolInts.coalDamage, ToolInts.enchantability);
        glowstone = EnumHelper.addToolMaterial(MaterialStrings.glowstoneToolMat, ToolInts.harvestLvl, ToolInts.glowstoneMaxDamage, ToolInts.glowstoneEff, ToolInts.glowstoneDamage, ToolInts.enchantability);
        adamantium = EnumHelper.addToolMaterial(MaterialStrings.adamantiumToolMat, ToolInts.harvestLvl, ToolInts.adamantiumMaxDamage, ToolInts.adamantiumEff, ToolInts.adamantiumDamage, ToolInts.enchantability);
        donator = EnumHelper.addToolMaterial(MaterialStrings.donatorToolMat, ToolInts.harvestLvl, ToolInts.donatorMaxDamage, ToolInts.donatorEff, ToolInts.donatorDamage, ToolInts.enchantability);
        silk = EnumHelper.addToolMaterial(MaterialStrings.silkToolMat, ToolInts.harvestLvl, ToolInts.silkMaxDamage, ToolInts.silkEff, ToolInts.silkDamage, ToolInts.enchantability);
        redstone = EnumHelper.addToolMaterial(MaterialStrings.redstoneToolMat, ToolInts.harvestLvl, ToolInts.redstoneMaxDamage, ToolInts.redstoneEff, ToolInts.redstoneDamage, ToolInts.enchantability);
    }

    public static void addArmorMaterials() {
        quartzArmor = EnumHelper.addArmorMaterial(MaterialStrings.quartzArmor, ArmorInts.quartzArmorMaxDamage, ArmorInts.quartzReduct, ArmorInts.enchantability);
        obsidianArmor = EnumHelper.addArmorMaterial(MaterialStrings.obsidianArmor, ArmorInts.obsidianArmorMaxDamage, ArmorInts.obsidianReduct, ArmorInts.enchantability);
        emeraldArmor = EnumHelper.addArmorMaterial(MaterialStrings.emeraldArmor, ArmorInts.obsidianArmorMaxDamage, ArmorInts.emeraldReduct, ArmorInts.enchantability);
        lapisArmor = EnumHelper.addArmorMaterial(MaterialStrings.lapisArmor, ArmorInts.lapisArmorMaxDamage, ArmorInts.lapisReduct, ArmorInts.enchantability);
        bronzeArmor = EnumHelper.addArmorMaterial(MaterialStrings.bronzeArmor, ArmorInts.bronzeArmorMaxDamage, ArmorInts.bronzeReduct, ArmorInts.enchantability);
        coalArmor = EnumHelper.addArmorMaterial(MaterialStrings.coalArmor, ArmorInts.coalArmorMaxDamage, ArmorInts.coalReduct, ArmorInts.enchantability);
        glowstoneArmor = EnumHelper.addArmorMaterial(MaterialStrings.glowstoneArmor, ArmorInts.glowstoneArmorMaxDamage, ArmorInts.glowstoneReduct, ArmorInts.enchantability);
        redstoneArmor = EnumHelper.addArmorMaterial(MaterialStrings.redstoneArmor, ArmorInts.redstoneArmorMaxDamage, ArmorInts.redstoneReduct, ArmorInts.enchantability);
        adamantiumArmor = EnumHelper.addArmorMaterial(MaterialStrings.adamantiumArmor, ArmorInts.adamantiumArmorMaxDamage, ArmorInts.adamantiumReduct, ArmorInts.enchantability);
    }

    public static int getQuartzMaxUses(){return quartz.getMaxUses();}
    public static int getObsidianMaxUses(){return obsidian.getMaxUses();}
    public static int getEmeraldMaxUses(){return emerald.getMaxUses();}
    public static int getLapisMaxUses(){return lapis.getMaxUses();}
    public static int getBronzeMaxUses(){return bronze.getMaxUses();}
    public static int getCoalMaxUses(){return coal.getMaxUses();}
    public static int getGlowstoneMaxUses(){return glowstone.getMaxUses();}
    public static int getAdamantiumMaxUses(){return adamantium.getMaxUses();}
    public static int getDonatorMaxUses(){return donator.getMaxUses();}
    public static int getSilkMaxUses(){return silk.getMaxUses();}
    public static int getRedstoneMaxUses(){return redstone.getMaxUses();}
}
