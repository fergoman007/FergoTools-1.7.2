package fergoman123.mods.fergotools.util.item;

import fergoman123.mods.fergotools.config.ConfigHandler;
import fergoman123.mods.fergotools.reference.ints.ArmorInts;
import fergoman123.mods.fergotools.reference.ints.ToolInts;
import fergoman123.mods.fergotools.reference.strings.MaterialStrings;
import fergoman123.mods.fergoutil.helper.ToolHelper;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

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
        quartz = ToolHelper.addToolMaterial(MaterialStrings.quartzToolMat, ToolInts.harvestLvl, ToolInts.quartzMaxDamage, ToolInts.quartzEff, ToolInts.quartzDamage, ConfigHandler.enchantability);
        obsidian = ToolHelper.addToolMaterial(MaterialStrings.obsidianToolMat, ToolInts.harvestLvl, ToolInts.obsidianMaxDamage, ToolInts.obsidianEff, ToolInts.obsidianDamage, ConfigHandler.enchantability);
        emerald = ToolHelper.addToolMaterial(MaterialStrings.emeraldToolMat, ToolInts.harvestLvl, ToolInts.emeraldMaxDamage, ToolInts.emeraldEff, ToolInts.emeraldDamage, ConfigHandler.enchantability);
        lapis = ToolHelper.addToolMaterial(MaterialStrings.lapisToolMat, ToolInts.harvestLvl, ToolInts.lapisMaxDamage, ToolInts.lapisEff, ToolInts.lapisDamage, ConfigHandler.enchantability);
        bronze = ToolHelper.addToolMaterial(MaterialStrings.bronzeToolMat, ToolInts.harvestLvl, ToolInts.bronzeMaxDamage, ToolInts.bronzeEff, ToolInts.bronzeDamage, ConfigHandler.enchantability);
        coal = ToolHelper.addToolMaterial(MaterialStrings.coalToolMat, ToolInts.harvestLvl, ToolInts.coalMaxDamage, ToolInts.coalEff, ToolInts.coalDamage, ConfigHandler.enchantability);
        glowstone = ToolHelper.addToolMaterial(MaterialStrings.glowstoneToolMat, ToolInts.harvestLvl, ToolInts.glowstoneMaxDamage, ToolInts.glowstoneEff, ToolInts.glowstoneDamage, ConfigHandler.enchantability);
        adamantium = ToolHelper.addToolMaterial(MaterialStrings.adamantiumToolMat, ToolInts.harvestLvl, ConfigHandler.adamantiumMaxDamage, ToolInts.adamantiumEff, ToolInts.adamantiumDamage, ConfigHandler.enchantability);
        donator = ToolHelper.addToolMaterial(MaterialStrings.donatorToolMat, ToolInts.harvestLvl, ToolInts.donatorMaxDamage, ToolInts.donatorEff, ToolInts.donatorDamage, ConfigHandler.enchantability);
        silk = ToolHelper.addToolMaterial(MaterialStrings.silkToolMat, ToolInts.harvestLvl, ToolInts.silkMaxDamage, ToolInts.silkEff, ToolInts.silkDamage, ConfigHandler.enchantability);
        redstone = ToolHelper.addToolMaterial(MaterialStrings.redstoneToolMat, ToolInts.harvestLvl, ToolInts.redstoneMaxDamage, ToolInts.redstoneEff, ToolInts.redstoneDamage, ConfigHandler.enchantability);
    }

    public static void addArmorMaterials() {
        quartzArmor = ToolHelper.addArmorMaterial(MaterialStrings.quartzArmor, ArmorInts.quartzArmorMaxDamage, ArmorInts.quartzReduct, ArmorInts.enchantability);
        obsidianArmor = ToolHelper.addArmorMaterial(MaterialStrings.obsidianArmor, ArmorInts.obsidianArmorMaxDamage, ArmorInts.obsidianReduct, ArmorInts.enchantability);
        emeraldArmor = ToolHelper.addArmorMaterial(MaterialStrings.emeraldArmor, ArmorInts.obsidianArmorMaxDamage, ArmorInts.emeraldReduct, ArmorInts.enchantability);
        lapisArmor = ToolHelper.addArmorMaterial(MaterialStrings.lapisArmor, ArmorInts.lapisArmorMaxDamage, ArmorInts.lapisReduct, ArmorInts.enchantability);
        bronzeArmor = ToolHelper.addArmorMaterial(MaterialStrings.bronzeArmor, ArmorInts.bronzeArmorMaxDamage, ArmorInts.bronzeReduct, ArmorInts.enchantability);
        coalArmor = ToolHelper.addArmorMaterial(MaterialStrings.coalArmor, ArmorInts.coalArmorMaxDamage, ArmorInts.coalReduct, ArmorInts.enchantability);
        glowstoneArmor = ToolHelper.addArmorMaterial(MaterialStrings.glowstoneArmor, ArmorInts.glowstoneArmorMaxDamage, ArmorInts.glowstoneReduct, ArmorInts.enchantability);
        redstoneArmor = ToolHelper.addArmorMaterial(MaterialStrings.redstoneArmor, ArmorInts.redstoneArmorMaxDamage, ArmorInts.redstoneReduct, ArmorInts.enchantability);
        adamantiumArmor = ToolHelper.addArmorMaterial(MaterialStrings.adamantiumArmor, ArmorInts.adamantiumArmorMaxDamage, ArmorInts.adamantiumReduct, ArmorInts.enchantability);
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
