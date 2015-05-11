package io.github.fergoman123.fergotools.api.content;

import io.github.fergoman123.fergotools.api.base.*;
import io.github.fergoman123.fergotools.common.items.*;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemShearsFT;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class FTContent {



    public static void init() {
        quartzPickaxe = new ItemPickaxeFT(TM.quartz, ItemNames.quartzPickaxe);
        quartzShovel = new ItemShovelFT(TM.quartz, ItemNames.quartzShovel);
        quartzAxe = new ItemAxeFT(TM.quartz, ItemNames.quartzAxe);
        quartzHoe = new ItemHoeFT(TM.quartz, ItemNames.quartzHoe);
        quartzSword = new ItemSwordFT(TM.quartz, ItemNames.quartzSword);

        obsidianPickaxe = new ItemPickaxeFT(TM.obsidian, ItemNames.obsidianPickaxe);
        obsidianShovel = new ItemShovelFT(TM.obsidian, ItemNames.obsidianShovel);
        obsidianAxe = new ItemAxeFT(TM.obsidian, ItemNames.obsidianAxe);
        obsidianHoe = new ItemHoeFT(TM.obsidian, ItemNames.obsidianHoe);
        obsidianSword = new ItemSwordFT(TM.obsidian, ItemNames.obsidianSword);

        emeraldPickaxe = new ItemPickaxeFT(TM.emerald, ItemNames.emeraldPickaxe);
        emeraldShovel = new ItemShovelFT(TM.emerald, ItemNames.emeraldShovel);
        emeraldAxe = new ItemAxeFT(TM.emerald, ItemNames.emeraldAxe);
        emeraldHoe = new ItemHoeFT(TM.emerald, ItemNames.emeraldHoe);
        emeraldSword = new ItemSwordFT(TM.emerald, ItemNames.emeraldSword);

        lapisPickaxe = new ItemPickaxeFT(TM.lapis, ItemNames.lapisPickaxe);
        lapisShovel = new ItemShovelFT(TM.lapis, ItemNames.lapisShovel);
        lapisAxe = new ItemAxeFT(TM.lapis, ItemNames.lapisAxe);
        lapisHoe = new ItemHoeFT(TM.lapis, ItemNames.lapisHoe);
        lapisSword = new ItemSwordFT(TM.lapis, ItemNames.lapisSword);

        bronzePickaxe = new ItemPickaxeFT(TM.bronze, ItemNames.bronzePickaxe);
        bronzeShovel = new ItemShovelFT(TM.bronze, ItemNames.bronzeShovel);
        bronzeAxe = new ItemAxeFT(TM.bronze, ItemNames.bronzeAxe);
        bronzeHoe = new ItemHoeFT(TM.bronze, ItemNames.bronzeHoe);
        bronzeSword = new ItemSwordFT(TM.bronze, ItemNames.bronzeSword);

        coalPickaxe = new ItemPickaxeFT(TM.coal, ItemNames.coalPickaxe);
        coalShovel = new ItemShovelFT(TM.coal, ItemNames.coalShovel);
        coalAxe = new ItemAxeFT(TM.coal, ItemNames.coalAxe);
        coalHoe = new ItemHoeFT(TM.coal, ItemNames.coalHoe);
        coalSword = new ItemSwordFT(TM.coal, ItemNames.coalSword);

        glowstonePickaxe = new ItemPickaxeFT(TM.glowstone, ItemNames.glowstonePickaxe);
        glowstoneShovel = new ItemShovelFT(TM.glowstone, ItemNames.glowstoneShovel);
        glowstoneAxe = new ItemAxeFT(TM.glowstone, ItemNames.glowstoneAxe);
        glowstoneHoe = new ItemHoeFT(TM.glowstone, ItemNames.glowstoneHoe);
        glowstoneSword = new ItemSwordFT(TM.glowstone, ItemNames.glowstoneSword);

        adamantiumPickaxe = new ItemPickaxeFT(TM.adamantium, ItemNames.adamantiumPickaxe);
        adamantiumShovel = new ItemShovelFT(TM.adamantium, ItemNames.adamantiumShovel);
        adamantiumAxe = new ItemAxeFT(TM.adamantium, ItemNames.adamantiumAxe);
        adamantiumHoe = new ItemHoeFT(TM.adamantium, ItemNames.adamantiumHoe);
        adamantiumSword = new ItemSwordFT(TM.adamantium, ItemNames.adamantiumSword);

        silkPickaxe = new ItemPickaxeFT(TM.silk, ItemNames.silkPickaxe);
        silkShovel = new ItemShovelFT(TM.silk, ItemNames.silkShovel);
        silkAxe = new ItemAxeFT(TM.silk, ItemNames.silkAxe);
        silkHoe = new ItemHoeFT(TM.silk, ItemNames.silkHoe);
        silkSword = new ItemSwordFT(TM.silk, ItemNames.silkSword);

        redstonePickaxe = new ItemPickaxeFT(TM.redstone, ItemNames.redstonePickaxe);
        redstoneShovel = new ItemShovelFT(TM.redstone, ItemNames.redstoneShovel);
        redstoneAxe = new ItemAxeFT(TM.redstone, ItemNames.redstoneAxe);
        redstoneHoe = new ItemHoeFT(TM.redstone, ItemNames.redstoneHoe);
        redstoneSword = new ItemSwordFT(TM.redstone, ItemNames.redstoneSword);

        ingotObsidian = new ItemFT(ItemNames.ingotObsidian);
        gemEmerald = new ItemFT(ItemNames.gemEmerald);
        gemLapis = new ItemFT(ItemNames.gemLapis);
        ingotBronze = new ItemFT(ItemNames.ingotBronze);
        ingotCoal = new ItemFT(ItemNames.ingotCoal);
        ingotGlowstone = new ItemFT(ItemNames.ingotGlowstone);
        ingotAdamantium = new ItemFT(ItemNames.ingotAdamantium);
        gemSilk = new ItemFT(ItemNames.gemSilk);
        gemRedstone = new ItemFT(ItemNames.gemRedstone);
        gemExp = new ItemFT(ItemNames.gemExp);
        gemExp2 = new ItemFT(ItemNames.gemExp2);
        gemExp3 = new ItemFT(ItemNames.gemExp3);

        staffExp = new ItemStaffExp();
        staffExp2 = new ItemStaffExp2();
        staffExp3 = new ItemStaffExp3();

        shardExp = new ItemExpShard();
        expCollector = new ItemFT(ItemNames.expCollector);

        quartzHelmet = new ItemArmorFT(AM.quartzArmor, ArmorType.helmet, Items.quartz, ItemNames.quartzHelmet);
        quartzChestplate = new ItemArmorFT(AM.quartzArmor, ArmorType.chestplate, Items.quartz, ItemNames.quartzChestplate);
        quartzLeggings = new ItemArmorFT(AM.quartzArmor, ArmorType.leggings, Items.quartz, ItemNames.quartzLeggings);
        quartzBoots = new ItemArmorFT(AM.quartzArmor, ArmorType.boots, Items.quartz, ItemNames.quartzBoots);

        obsidianHelmet = new ItemArmorFT(AM.obsidianArmor, ArmorType.helmet, ingotObsidian, ItemNames.obsidianHelmet);
        obsidianChestplate = new ItemArmorFT(AM.obsidianArmor, ArmorType.chestplate, ingotObsidian, ItemNames.obsidianChestplate);
        obsidianLeggings = new ItemArmorFT(AM.obsidianArmor, ArmorType.leggings, ingotObsidian, ItemNames.obsidianLeggings);
        obsidianBoots = new ItemArmorFT(AM.obsidianArmor, ArmorType.boots, ingotObsidian, ItemNames.obsidianBoots);

        emeraldHelmet = new ItemArmorFT(AM.emeraldArmor, ArmorType.helmet, gemEmerald, ItemNames.emeraldHelmet);
        emeraldChestplate = new ItemArmorFT(AM.emeraldArmor, ArmorType.chestplate, gemEmerald, ItemNames.emeraldChestplate);
        emeraldLeggings = new ItemArmorFT(AM.emeraldArmor, ArmorType.leggings, gemEmerald, ItemNames.emeraldLeggings);
        emeraldBoots = new ItemArmorFT(AM.emeraldArmor, ArmorType.boots, gemEmerald, ItemNames.emeraldBoots);

        lapisHelmet = new ItemArmorFT(AM.lapisArmor, ArmorType.helmet, gemLapis, ItemNames.lapisHelmet);
        lapisChestplate = new ItemArmorFT(AM.lapisArmor, ArmorType.chestplate, gemLapis, ItemNames.lapisChestplate);
        lapisLeggings = new ItemArmorFT(AM.lapisArmor, ArmorType.leggings, gemLapis, ItemNames.lapisLeggings);
        lapisBoots = new ItemArmorFT(AM.lapisArmor, ArmorType.boots, gemLapis, ItemNames.lapisBoots);

        bronzeHelmet = new ItemArmorFT(AM.bronzeArmor, ArmorType.helmet, ingotBronze, ItemNames.bronzeHelmet);
        bronzeChestplate = new ItemArmorFT(AM.bronzeArmor, ArmorType.chestplate, ingotBronze, ItemNames.bronzeChestplate);
        bronzeLeggings = new ItemArmorFT(AM.bronzeArmor, ArmorType.leggings, ingotBronze, ItemNames.bronzeLeggings);
        bronzeBoots = new ItemArmorFT(AM.bronzeArmor, ArmorType.boots, ingotBronze, ItemNames.bronzeBoots);

        coalHelmet = new ItemArmorFT(AM.coalArmor, ArmorType.helmet, ingotCoal, ItemNames.coalHelmet);
        coalChestplate = new ItemArmorFT(AM.coalArmor, ArmorType.chestplate, ingotCoal, ItemNames.coalChestplate);
        coalLeggings = new ItemArmorFT(AM.coalArmor, ArmorType.leggings, ingotCoal, ItemNames.coalLeggings);
        coalBoots = new ItemArmorFT(AM.coalArmor, ArmorType.boots, ingotCoal, ItemNames.coalBoots);

        glowstoneHelmet = new ItemArmorFT(AM.glowstoneArmor, ArmorType.helmet, ingotGlowstone, ItemNames.glowstoneHelmet);
        glowstoneChestplate = new ItemArmorFT(AM.glowstoneArmor, ArmorType.chestplate, ingotGlowstone, ItemNames.glowstoneChestplate);
        glowstoneLeggings = new ItemArmorFT(AM.glowstoneArmor, ArmorType.leggings, ingotGlowstone, ItemNames.glowstoneLeggings);
        glowstoneBoots = new ItemArmorFT(AM.glowstoneArmor, ArmorType.boots, ingotGlowstone, ItemNames.glowstoneBoots);

        adamantiumHelmet = new ItemArmorAdamantium(ArmorType.helmet, ItemNames.adamantiumHelmet);
        adamantiumChestplate = new ItemArmorAdamantium(ArmorType.chestplate, ItemNames.adamantiumChestplate);
        adamantiumLeggings = new ItemArmorAdamantium(ArmorType.leggings, ItemNames.adamantiumLeggings);
        adamantiumBoots = new ItemArmorAdamantium(ArmorType.boots, ItemNames.adamantiumBoots);

        redstoneHelmet = new ItemArmorFT(AM.redstoneArmor, ArmorType.helmet, gemRedstone, ItemNames.redstoneHelmet);
        redstoneChestplate = new ItemArmorFT(AM.redstoneArmor, ArmorType.chestplate, gemRedstone, ItemNames.redstoneChestplate);
        redstoneLeggings = new ItemArmorFT(AM.redstoneArmor, ArmorType.leggings, gemRedstone, ItemNames.redstoneLeggings);
        redstoneBoots = new ItemArmorFT(AM.redstoneArmor, ArmorType.boots, gemRedstone, ItemNames.redstoneBoots);

        bowQuartz = new ItemBowFT(TM.quartz, Items.quartz, ItemNames.bowQuartz[0]);
        bowObsidian = new ItemBowFT(TM.obsidian, ingotObsidian, ItemNames.bowObsidian[0]);
        bowEmerald = new ItemBowFT(TM.emerald, gemEmerald, ItemNames.bowEmerald[0]);
        bowLapis = new ItemBowFT(TM.lapis, gemLapis, ItemNames.bowLapis[0]);
        bowBronze = new ItemBowFT(TM.bronze, ingotBronze, ItemNames.bowBronze[0]);
        bowCoal = new ItemBowFT(TM.coal, ingotCoal, ItemNames.bowCoal[0]);
        bowGlowstone = new ItemBowFT(TM.glowstone, ingotGlowstone, ItemNames.bowGlowstone[0]);
        bowAdamantium = new ItemBowFT(TM.adamantium, ingotAdamantium, ItemNames.bowAdamantium[0]);
        bowSilk = new ItemBowFT(TM.silk, gemSilk, ItemNames.bowSilk[0]);
        bowRedstone = new ItemBowFT(TM.redstone, gemRedstone, ItemNames.bowRedstone[0]);

        quartzShears = new ItemShearsFT(TM.quartz, Items.quartz, ItemNames.quartzShears);
        obsidianShears = new ItemShearsFT(TM.obsidian, ingotObsidian, ItemNames.obsidianShears);
        emeraldShears = new ItemShearsFT(TM.emerald, gemEmerald, ItemNames.emeraldShears);
        lapisShears = new ItemShearsFT(TM.lapis, gemLapis, ItemNames.lapisShears);
        bronzeShears = new ItemShearsFT(TM.bronze, ingotBronze, ItemNames.bronzeShears);
        coalShears = new ItemShearsFT(TM.coal, ingotCoal, ItemNames.coalShears);
        glowstoneShears = new ItemShearsFT(TM.glowstone, ingotGlowstone, ItemNames.glowstoneShears);
        adamantiumShears = new ItemShearsFT(TM.adamantium, ingotAdamantium, ItemNames.adamantiumShears);
        silkShears = new ItemShearsFT(TM.silk, gemSilk, ItemNames.silkShears);
        redstoneShears = new ItemShearsFT(TM.redstone, gemRedstone, ItemNames.redstoneShears);

        stickFT = new ItemStickFT();
    }
}