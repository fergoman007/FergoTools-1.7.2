 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergotools.util.item;

import fergoman123.mods.fergotools.config.ConfigHandler;
import fergoman123.mods.fergotools.reference.Ints;
import fergoman123.mods.fergotools.reference.Strings;
import fergoman123.mods.fergoutil.helper.ToolHelper;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

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

    public static void init() {
        addToolMaterials();
        addArmorMaterials();
    }

    public static void addToolMaterials() {
        quartz = ToolHelper.addToolMaterial(Strings.Material.quartzToolMat, Ints.Tools.harvestLvl, Ints.Tools.quartzMaxDamage, Ints.Tools.quartzEff, Ints.Tools.quartzDamage, ConfigHandler.enchantability);
        obsidian = ToolHelper.addToolMaterial(Strings.Material.obsidianToolMat, Ints.Tools.harvestLvl, Ints.Tools.obsidianMaxDamage, Ints.Tools.obsidianEff, Ints.Tools.obsidianDamage, ConfigHandler.enchantability);
        emerald = ToolHelper.addToolMaterial(Strings.Material.emeraldToolMat, Ints.Tools.harvestLvl, Ints.Tools.emeraldMaxDamage, Ints.Tools.emeraldEff, Ints.Tools.emeraldDamage, ConfigHandler.enchantability);
        lapis = ToolHelper.addToolMaterial(Strings.Material.lapisToolMat, Ints.Tools.harvestLvl, Ints.Tools.lapisMaxDamage, Ints.Tools.lapisEff, Ints.Tools.lapisDamage, ConfigHandler.enchantability);
        bronze = ToolHelper.addToolMaterial(Strings.Material.bronzeToolMat, Ints.Tools.harvestLvl, Ints.Tools.bronzeMaxDamage, Ints.Tools.bronzeEff, Ints.Tools.bronzeDamage, ConfigHandler.enchantability);
        coal = ToolHelper.addToolMaterial(Strings.Material.coalToolMat, Ints.Tools.harvestLvl, Ints.Tools.coalMaxDamage, Ints.Tools.coalEff, Ints.Tools.coalDamage, ConfigHandler.enchantability);
        glowstone = ToolHelper.addToolMaterial(Strings.Material.glowstoneToolMat, Ints.Tools.harvestLvl, Ints.Tools.glowstoneMaxDamage, Ints.Tools.glowstoneEff, Ints.Tools.glowstoneDamage, ConfigHandler.enchantability);
        adamantium = ToolHelper.addToolMaterial(Strings.Material.adamantiumToolMat, Ints.Tools.harvestLvl, Ints.Tools.adamantiumMaxDamage, Ints.Tools.adamantiumEff, Ints.Tools.adamantiumDamage, ConfigHandler.enchantability);
        donator = ToolHelper.addToolMaterial(Strings.Material.donatorToolMat, Ints.Tools.harvestLvl, Ints.Tools.donatorMaxDamage, Ints.Tools.donatorEff, Ints.Tools.donatorDamage, ConfigHandler.enchantability);
        silk = ToolHelper.addToolMaterial(Strings.Material.silkToolMat, Ints.Tools.harvestLvl, Ints.Tools.silkMaxDamage, Ints.Tools.silkEff, Ints.Tools.silkDamage, ConfigHandler.enchantability);
        redstone = ToolHelper.addToolMaterial(Strings.Material.redstoneToolMat, Ints.Tools.harvestLvl, Ints.Tools.redstoneMaxDamage, Ints.Tools.redstoneEff, Ints.Tools.redstoneDamage, ConfigHandler.enchantability);
    }

    public static void addArmorMaterials() {
        quartzArmor = ToolHelper.addArmorMaterial(Strings.Material.quartzArmor, Ints.Armor.quartzArmorMaxDamage, Ints.Armor.quartzReduct, ConfigHandler.enchantability);
        obsidianArmor = ToolHelper.addArmorMaterial(Strings.Material.obsidianArmor, Ints.Armor.obsidianArmorMaxDamage, Ints.Armor.obsidianReduct, ConfigHandler.enchantability);
        emeraldArmor = ToolHelper.addArmorMaterial(Strings.Material.emeraldArmor, Ints.Armor.obsidianArmorMaxDamage, Ints.Armor.emeraldReduct, ConfigHandler.enchantability);
        lapisArmor = ToolHelper.addArmorMaterial(Strings.Material.lapisArmor, Ints.Armor.lapisArmorMaxDamage, Ints.Armor.lapisReduct, ConfigHandler.enchantability);
        bronzeArmor = ToolHelper.addArmorMaterial(Strings.Material.bronzeArmor, Ints.Armor.bronzeArmorMaxDamage, Ints.Armor.bronzeReduct, ConfigHandler.enchantability);
        coalArmor = ToolHelper.addArmorMaterial(Strings.Material.coalArmor, Ints.Armor.coalArmorMaxDamage, Ints.Armor.coalReduct, ConfigHandler.enchantability);
        glowstoneArmor = ToolHelper.addArmorMaterial(Strings.Material.glowstoneArmor, Ints.Armor.glowstoneArmorMaxDamage, Ints.Armor.glowstoneReduct, ConfigHandler.enchantability);
        redstoneArmor = ToolHelper.addArmorMaterial(Strings.Material.redstoneArmor, Ints.Armor.redstoneArmorMaxDamage, Ints.Armor.redstoneReduct, ConfigHandler.enchantability);
        adamantiumArmor = ToolHelper.addArmorMaterial(Strings.Material.adamantiumArmor, Ints.Armor.adamantiumArmorMaxDamage, Ints.Armor.adamantiumReduct, ConfigHandler.enchantability);
    }
}
