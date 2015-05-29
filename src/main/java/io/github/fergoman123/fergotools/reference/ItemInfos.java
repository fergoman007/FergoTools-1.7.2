/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.reference;

import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergoutil.info.*;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemInfos
{
    public static final ItemInfo ingotObsidian = getItemInfo(ItemNames.ingotObsidian);
    public static final ItemInfo gemEmerald = getItemInfo(ItemNames.gemEmerald);
    public static final ItemInfo gemLapis = getItemInfo(ItemNames.gemLapis);
    public static final ItemInfo ingotBronze = getItemInfo(ItemNames.ingotBronze);
    public static final ItemInfo ingotCoal = getItemInfo(ItemNames.ingotCoal);
    public static final ItemInfo ingotGlowstone = getItemInfo(ItemNames.ingotGlowstone);
    public static final ItemInfo ingotAdamantium = getItemInfo(ItemNames.ingotAdamantium);
    public static final ItemInfo gemSilk = getItemInfo(ItemNames.gemSilk);
    public static final ItemInfo gemRedstone = getItemInfo(ItemNames.gemRedstone);
    public static final ItemInfo gemExp = getItemInfo(ItemNames.gemExp);
    public static final ItemInfo gemExp2 = getItemInfo(ItemNames.gemExp2);
    public static final ItemInfo gemExp3 = getItemInfo(ItemNames.gemExp3);

    public static final ItemInfo staffExp = getItemInfo(ItemNames.staffExpVariants[0]);
    public static final ItemInfo staffExp2 = getItemInfo(ItemNames.staffExpVariants[1]);
    public static final ItemInfo staffExp3 = getItemInfo(ItemNames.staffExpVariants[2]);

    public static final ItemInfo shardExp = getItemInfo(ItemNames.shardExp);
    public static final ItemInfo expCollector = getItemInfo(ItemNames.expCollector);

    public static final ToolInfo quartzPickaxe = getToolInfo(TM.quartz, ItemNames.quartzPickaxe);
    public static final ToolInfo quartzShovel = getToolInfo(TM.quartz, ItemNames.quartzShovel);
    public static final ToolInfo quartzAxe = getToolInfo(TM.quartz, ItemNames.quartzAxe);
    public static final ToolInfo quartzHoe = getToolInfo(TM.quartz, ItemNames.quartzShovel);
    public static final ToolInfo quartzSword = getToolInfo(TM.quartz, ItemNames.quartzSword);

    public static final ToolInfo obsidianPickaxe = getToolInfo(TM.obsidian, ItemNames.obsidianPickaxe);
    public static final ToolInfo obsidianShovel = getToolInfo(TM.obsidian, ItemNames.obsidianShovel);
    public static final ToolInfo obsidianAxe = getToolInfo(TM.obsidian, ItemNames.obsidianAxe);
    public static final ToolInfo obsidianHoe = getToolInfo(TM.obsidian, ItemNames.obsidianShovel);
    public static final ToolInfo obsidianSword = getToolInfo(TM.obsidian, ItemNames.obsidianSword);

    public static final ToolInfo emeraldPickaxe = getToolInfo(TM.emerald, ItemNames.emeraldPickaxe);
    public static final ToolInfo emeraldShovel = getToolInfo(TM.emerald, ItemNames.emeraldShovel);
    public static final ToolInfo emeraldAxe = getToolInfo(TM.emerald, ItemNames.emeraldAxe);
    public static final ToolInfo emeraldHoe = getToolInfo(TM.emerald, ItemNames.emeraldShovel);
    public static final ToolInfo emeraldSword = getToolInfo(TM.emerald, ItemNames.emeraldSword);

    public static final ToolInfo lapisPickaxe = getToolInfo(TM.lapis, ItemNames.lapisPickaxe);
    public static final ToolInfo lapisShovel = getToolInfo(TM.lapis, ItemNames.lapisShovel);
    public static final ToolInfo lapisAxe = getToolInfo(TM.lapis, ItemNames.lapisAxe);
    public static final ToolInfo lapisHoe = getToolInfo(TM.lapis, ItemNames.lapisShovel);
    public static final ToolInfo lapisSword = getToolInfo(TM.lapis, ItemNames.lapisSword);

    public static final ToolInfo bronzePickaxe = getToolInfo(TM.bronze, ItemNames.bronzePickaxe);
    public static final ToolInfo bronzeShovel = getToolInfo(TM.bronze, ItemNames.bronzeShovel);
    public static final ToolInfo bronzeAxe = getToolInfo(TM.bronze, ItemNames.bronzeAxe);
    public static final ToolInfo bronzeHoe = getToolInfo(TM.bronze, ItemNames.bronzeShovel);
    public static final ToolInfo bronzeSword = getToolInfo(TM.bronze, ItemNames.bronzeSword);

    public static final ToolInfo coalPickaxe = getToolInfo(TM.coal, ItemNames.coalPickaxe);
    public static final ToolInfo coalShovel = getToolInfo(TM.coal, ItemNames.coalShovel);
    public static final ToolInfo coalAxe = getToolInfo(TM.coal, ItemNames.coalAxe);
    public static final ToolInfo coalHoe = getToolInfo(TM.coal, ItemNames.coalShovel);
    public static final ToolInfo coalSword = getToolInfo(TM.coal, ItemNames.coalSword);

    public static final ToolInfo glowstonePickaxe = getToolInfo(TM.glowstone, ItemNames.glowstonePickaxe);
    public static final ToolInfo glowstoneShovel = getToolInfo(TM.glowstone, ItemNames.glowstoneShovel);
    public static final ToolInfo glowstoneAxe = getToolInfo(TM.glowstone, ItemNames.glowstoneAxe);
    public static final ToolInfo glowstoneHoe = getToolInfo(TM.glowstone, ItemNames.glowstoneShovel);
    public static final ToolInfo glowstoneSword = getToolInfo(TM.glowstone, ItemNames.glowstoneSword);

    public static final ToolInfo adamantiumPickaxe = getToolInfo(TM.adamantium, ItemNames.adamantiumPickaxe);
    public static final ToolInfo adamantiumShovel = getToolInfo(TM.adamantium, ItemNames.adamantiumShovel);
    public static final ToolInfo adamantiumAxe = getToolInfo(TM.adamantium, ItemNames.adamantiumAxe);
    public static final ToolInfo adamantiumHoe = getToolInfo(TM.adamantium, ItemNames.adamantiumShovel);
    public static final ToolInfo adamantiumSword = getToolInfo(TM.adamantium, ItemNames.adamantiumSword);

    public static final ToolInfo silkPickaxe = getToolInfo(TM.silk, ItemNames.silkPickaxe);
    public static final ToolInfo silkShovel = getToolInfo(TM.silk, ItemNames.silkShovel);
    public static final ToolInfo silkAxe = getToolInfo(TM.silk, ItemNames.silkAxe);
    public static final ToolInfo silkHoe = getToolInfo(TM.silk, ItemNames.silkShovel);
    public static final ToolInfo silkSword = getToolInfo(TM.silk, ItemNames.silkSword);

    public static final ToolInfo redstonePickaxe = getToolInfo(TM.redstone, ItemNames.redstonePickaxe);
    public static final ToolInfo redstoneShovel = getToolInfo(TM.redstone, ItemNames.redstoneShovel);
    public static final ToolInfo redstoneAxe = getToolInfo(TM.redstone, ItemNames.redstoneAxe);
    public static final ToolInfo redstoneHoe = getToolInfo(TM.redstone, ItemNames.redstoneShovel);
    public static final ToolInfo redstoneSword = getToolInfo(TM.redstone, ItemNames.redstoneSword);

    public static final ArmorInfo quartzHelmet = getArmorInfo(AM.quartzArmor, ItemNames.quartzHelmet, ArmorType.helmet);
    public static final ArmorInfo quartzChestplate = getArmorInfo(AM.quartzArmor, ItemNames.quartzChestplate, ArmorType.chestplate);
    public static final ArmorInfo quartzLeggings = getArmorInfo(AM.quartzArmor, ItemNames.quartzLeggings, ArmorType.leggings);
    public static final ArmorInfo quartzBoots = getArmorInfo(AM.quartzArmor, ItemNames.quartzBoots, ArmorType.boots);

    public static final ArmorInfo obsidianHelmet = getArmorInfo(AM.obsidianArmor, ItemNames.obsidianHelmet, ArmorType.helmet);
    public static final ArmorInfo obsidianChestplate = getArmorInfo(AM.obsidianArmor, ItemNames.obsidianChestplate, ArmorType.chestplate);
    public static final ArmorInfo obsidianLeggings = getArmorInfo(AM.obsidianArmor, ItemNames.obsidianLeggings, ArmorType.leggings);
    public static final ArmorInfo obsidianBoots = getArmorInfo(AM.obsidianArmor, ItemNames.obsidianBoots, ArmorType.boots);

    public static final ArmorInfo emeraldHelmet = getArmorInfo(AM.emeraldArmor, ItemNames.emeraldHelmet, ArmorType.helmet);
    public static final ArmorInfo emeraldChestplate = getArmorInfo(AM.emeraldArmor, ItemNames.emeraldChestplate, ArmorType.chestplate);
    public static final ArmorInfo emeraldLeggings = getArmorInfo(AM.emeraldArmor, ItemNames.emeraldLeggings, ArmorType.leggings);
    public static final ArmorInfo emeraldBoots = getArmorInfo(AM.emeraldArmor, ItemNames.emeraldBoots, ArmorType.boots);

    public static final ArmorInfo lapisHelmet = getArmorInfo(AM.lapisArmor, ItemNames.lapisHelmet, ArmorType.helmet);
    public static final ArmorInfo lapisChestplate = getArmorInfo(AM.lapisArmor, ItemNames.lapisChestplate, ArmorType.chestplate);
    public static final ArmorInfo lapisLeggings = getArmorInfo(AM.lapisArmor, ItemNames.lapisLeggings, ArmorType.leggings);
    public static final ArmorInfo lapisBoots = getArmorInfo(AM.lapisArmor, ItemNames.lapisBoots, ArmorType.boots);

    public static final ArmorInfo bronzeHelmet = getArmorInfo(AM.bronzeArmor, ItemNames.bronzeHelmet, ArmorType.helmet);
    public static final ArmorInfo bronzeChestplate = getArmorInfo(AM.bronzeArmor, ItemNames.bronzeChestplate, ArmorType.chestplate);
    public static final ArmorInfo bronzeLeggings = getArmorInfo(AM.bronzeArmor, ItemNames.bronzeLeggings, ArmorType.leggings);
    public static final ArmorInfo bronzeBoots = getArmorInfo(AM.bronzeArmor, ItemNames.bronzeBoots, ArmorType.boots);

    public static final ArmorInfo coalHelmet = getArmorInfo(AM.coalArmor, ItemNames.coalHelmet, ArmorType.helmet);
    public static final ArmorInfo coalChestplate = getArmorInfo(AM.coalArmor, ItemNames.coalChestplate, ArmorType.chestplate);
    public static final ArmorInfo coalLeggings = getArmorInfo(AM.coalArmor, ItemNames.coalLeggings, ArmorType.leggings);
    public static final ArmorInfo coalBoots = getArmorInfo(AM.coalArmor, ItemNames.coalBoots, ArmorType.boots);

    public static final ArmorInfo glowstoneHelmet = getArmorInfo(AM.glowstoneArmor, ItemNames.glowstoneHelmet, ArmorType.helmet);
    public static final ArmorInfo glowstoneChestplate = getArmorInfo(AM.glowstoneArmor, ItemNames.glowstoneChestplate, ArmorType.chestplate);
    public static final ArmorInfo glowstoneLeggings = getArmorInfo(AM.glowstoneArmor, ItemNames.glowstoneLeggings, ArmorType.leggings);
    public static final ArmorInfo glowstoneBoots = getArmorInfo(AM.glowstoneArmor, ItemNames.glowstoneBoots, ArmorType.boots);

    public static final ArmorInfo adamantiumHelmet = getArmorInfo(AM.adamantiumArmor, ItemNames.adamantiumHelmet, ArmorType.helmet);
    public static final ArmorInfo adamantiumChestplate = getArmorInfo(AM.adamantiumArmor, ItemNames.adamantiumChestplate, ArmorType.chestplate);
    public static final ArmorInfo adamantiumLeggings = getArmorInfo(AM.adamantiumArmor, ItemNames.adamantiumLeggings, ArmorType.leggings);
    public static final ArmorInfo adamantiumBoots = getArmorInfo(AM.adamantiumArmor, ItemNames.adamantiumBoots, ArmorType.boots);

    public static final ArmorInfo redstoneHelmet = getArmorInfo(AM.redstoneArmor, ItemNames.redstoneHelmet, ArmorType.helmet);
    public static final ArmorInfo redstoneChestplate = getArmorInfo(AM.redstoneArmor, ItemNames.redstoneChestplate, ArmorType.chestplate);
    public static final ArmorInfo redstoneLeggings = getArmorInfo(AM.redstoneArmor, ItemNames.redstoneLeggings, ArmorType.leggings);
    public static final ArmorInfo redstoneBoots = getArmorInfo(AM.redstoneArmor, ItemNames.redstoneBoots, ArmorType.boots);
    
    public static final BowInfo bowQuartz = getBowInfo(TM.quartz, ItemNames.bowQuartz[0]);
    public static final BowInfo bowObsidian = getBowInfo(TM.obsidian, ItemNames.bowObsidian[0]);
    public static final BowInfo bowEmerald = getBowInfo(TM.emerald, ItemNames.bowEmerald[0]);
    public static final BowInfo bowLapis = getBowInfo(TM.lapis, ItemNames.bowLapis[0]);
    public static final BowInfo bowBronze = getBowInfo(TM.bronze, ItemNames.bowBronze[0]);
    public static final BowInfo bowCoal = getBowInfo(TM.coal, ItemNames.bowCoal[0]);
    public static final BowInfo bowGlowstone = getBowInfo(TM.glowstone, ItemNames.bowGlowstone[0]);
    public static final BowInfo bowAdamantium = getBowInfo(TM.adamantium, ItemNames.bowAdamantium[0]);
    public static final BowInfo bowSilk = getBowInfo(TM.silk, ItemNames.bowSilk[0]);
    public static final BowInfo bowRedstone = getBowInfo(TM.redstone, ItemNames.bowRedstone[0]);

    public static final ToolInfo quartzShears = getToolInfo(TM.quartz, ItemNames.quartzShears);
    public static final ToolInfo obsidianShears = getToolInfo(TM.obsidian, ItemNames.obsidianShears);

    private static ItemInfo getItemInfo(String name)
    {
        return new ItemInfo(name, "fergotools:" + name);
    }

    public static MultiItemInfo getMultiItemInfo(String name, String[] names, String[] models)
    {
        return new MultiItemInfo(name, names, models);
    }

    public static ArmorInfo getArmorInfo(ArmorMaterial material, String name, ArmorType type)
    {
        return new ArmorInfo(material, name, type, "fergotools:" + name);
    }

    public static ToolInfo getToolInfo(ToolMaterial material, String name)
    {
        return new ToolInfo(material,name, "fergotools:" + name);
    }
    
    public static BowInfo getBowInfo(ToolMaterial material, String name)
    {
        return new BowInfo(material, name, name, "fergotools:" + name + "_0", "fergotools:" + name + "_1", "fergotools:" + name + "_2");
    }
}
