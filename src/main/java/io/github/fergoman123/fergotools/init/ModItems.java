package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.base.*;
import io.github.fergoman123.fergotools.common.items.*;
import io.github.fergoman123.fergotools.common.items.bow.ItemBowBronze;
import io.github.fergoman123.fergotools.common.items.bow.ItemBowCoal;
import io.github.fergoman123.fergotools.common.items.bow.ItemBowGlowstone;
import io.github.fergoman123.fergotools.common.items.pickaxe.ItemQuartzPickaxe;
import io.github.fergoman123.fergotools.common.items.shovel.ItemQuartzShovel;
import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
    public static ItemFT ingotObsidian;
    public static ItemFT gemEmerald;
    public static ItemFT gemLapis;
    public static ItemFT ingotBronze;
    public static ItemFT ingotCoal;
    public static ItemFT ingotGlowstone;
    public static ItemFT ingotAdamantium;
    public static ItemFT gemSilk;
    public static ItemFT gemRedstone;
    public static ItemFT gemExp;
    public static ItemFT gemExp2;
    public static ItemFT gemExp3;

    public static ItemStaffExpBase staffExp;
    public static ItemStaffExpBase staffExp2;
    public static ItemStaffExpBase staffExp3;

    public static ItemFT shardExp;
    public static ItemFT expCollector;

    public static ItemPickaxeFT quartzPickaxe;
    public static ItemShovelFT quartzShovel;
    public static ItemAxeFT quartzAxe;
    public static ItemHoeFT quartzHoe;
    public static ItemSwordFT quartzSword;

    public static ItemPickaxeFT obsidianPickaxe;
    public static ItemShovelFT obsidianShovel;
    public static ItemAxeFT obsidianAxe;
    public static ItemHoeFT obsidianHoe;
    public static ItemSwordFT obsidianSword;

    public static ItemPickaxeFT emeraldPickaxe;
    public static ItemShovelFT emeraldShovel;
    public static ItemAxeFT emeraldAxe;
    public static ItemHoeFT emeraldHoe;
    public static ItemSwordFT emeraldSword;

    public static ItemPickaxeFT lapisPickaxe;
    public static ItemShovelFT lapisShovel;
    public static ItemAxeFT lapisAxe;
    public static ItemHoeFT lapisHoe;
    public static ItemSwordFT lapisSword;

    public static ItemPickaxeFT bronzePickaxe;
    public static ItemShovelFT bronzeShovel;
    public static ItemAxeFT bronzeAxe;
    public static ItemHoeFT bronzeHoe;
    public static ItemSwordFT bronzeSword;

    public static ItemPickaxeFT coalPickaxe;
    public static ItemShovelFT coalShovel;
    public static ItemAxeFT coalAxe;
    public static ItemHoeFT coalHoe;
    public static ItemSwordFT coalSword;

    public static ItemPickaxeFT glowstonePickaxe;
    public static ItemShovelFT glowstoneShovel;
    public static ItemAxeFT glowstoneAxe;
    public static ItemHoeFT glowstoneHoe;
    public static ItemSwordFT glowstoneSword;

    public static ItemPickaxeFT adamantiumPickaxe;
    public static ItemShovelFT adamantiumShovel;
    public static ItemAxeFT adamantiumAxe;
    public static ItemHoeFT adamantiumHoe;
    public static ItemSwordFT adamantiumSword;

    public static ItemPickaxeFT silkPickaxe;
    public static ItemShovelFT silkShovel;
    public static ItemAxeFT silkAxe;
    public static ItemHoeFT silkHoe;
    public static ItemSwordFT silkSword;

    public static ItemPickaxeFT redstonePickaxe;
    public static ItemShovelFT redstoneShovel;
    public static ItemAxeFT redstoneAxe;
    public static ItemHoeFT redstoneHoe;
    public static ItemSwordFT redstoneSword;

    public static ItemArmorFT quartzHelmet;
    public static ItemArmorFT quartzChestplate;
    public static ItemArmorFT quartzLeggings;
    public static ItemArmorFT quartzBoots;

    public static ItemArmorFT obsidianHelmet;
    public static ItemArmorFT obsidianChestplate;
    public static ItemArmorFT obsidianLeggings;
    public static ItemArmorFT obsidianBoots;

    public static ItemArmorFT emeraldHelmet;
    public static ItemArmorFT emeraldChestplate;
    public static ItemArmorFT emeraldLeggings;
    public static ItemArmorFT emeraldBoots;

    public static ItemArmorFT lapisHelmet;
    public static ItemArmorFT lapisChestplate;
    public static ItemArmorFT lapisLeggings;
    public static ItemArmorFT lapisBoots;

    public static ItemArmorFT bronzeHelmet;
    public static ItemArmorFT bronzeChestplate;
    public static ItemArmorFT bronzeLeggings;
    public static ItemArmorFT bronzeBoots;

    public static ItemArmorFT coalHelmet;
    public static ItemArmorFT coalChestplate;
    public static ItemArmorFT coalLeggings;
    public static ItemArmorFT coalBoots;

    public static ItemArmorFT glowstoneHelmet;
    public static ItemArmorFT glowstoneChestplate;
    public static ItemArmorFT glowstoneLeggings;
    public static ItemArmorFT glowstoneBoots;

    public static ItemArmorFT adamantiumHelmet;
    public static ItemArmorFT adamantiumChestplate;
    public static ItemArmorFT adamantiumLeggings;
    public static ItemArmorFT adamantiumBoots;

    public static ItemArmorFT redstoneHelmet;
    public static ItemArmorFT redstoneChestplate;
    public static ItemArmorFT redstoneLeggings;
    public static ItemArmorFT redstoneBoots;

    public static ItemBowFT bowQuartz;
    public static ItemBowFT bowObsidian;
    public static ItemBowFT bowEmerald;
    public static ItemBowFT bowLapis;
    public static ItemBowFT bowBronze;
    public static ItemBowFT bowCoal;
    public static ItemBowFT bowGlowstone;
    public static ItemBowFT bowAdamantium;
    public static ItemBowFT bowSilk;
    public static ItemBowFT bowRedstone;

    public static ItemShearsFT quartzShears;
    public static ItemShearsFT obsidianShears;
    public static ItemShearsFT emeraldShears;
    public static ItemShearsFT lapisShears;
    public static ItemShearsFT bronzeShears;
    public static ItemShearsFT coalShears;
    public static ItemShearsFT glowstoneShears;
    public static ItemShearsFT adamantiumShears;
    public static ItemShearsFT silkShears;
    public static ItemShearsFT redstoneShears;

    public static ItemMultiFT stickFT;

    public static void init()
    {
        ingotObsidian = new ItemFT(ItemNames.ingotObsidian);
        gemEmerald = new ItemFT(ItemNames.gemEmerald);
        gemLapis = new ItemFT(ItemNames.gemLapis);
        ingotBronze = new ItemFT(ItemNames.ingotBronze);
        ingotCoal = new ItemFT(ItemNames.ingotCoal);
        ingotGlowstone = new ItemFT(ItemNames.ingotGlowstone);
        ingotAdamantium = new ItemFT(ItemNames.ingotAdamantium);
        gemSilk = new ItemFT(ItemNames.gemSilk);
        gemRedstone = new ItemFT(ItemNames.gemRedstone);
        gemExp = new ItemGemExp();
        gemExp2 = new ItemGemExp2();
        gemExp3 = new ItemGemExp3();

        staffExp = new ItemStaffExp();
        staffExp2 = new ItemStaffExp2();
        staffExp3 = new ItemStaffExp3();

        shardExp = new ItemExpShard();
        expCollector = new ItemExpCollector();

        quartzPickaxe = new ItemQuartzPickaxe();
        quartzShovel = new ItemQuartzShovel();
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

        quartzHelmet = new ItemArmorFT(AM.quartzArmor, ArmorType.helmet, ItemNames.quartzHelmet);
        quartzChestplate = new ItemArmorFT(AM.quartzArmor, ArmorType.chestplate, ItemNames.quartzChestplate);
        quartzLeggings = new ItemArmorFT(AM.quartzArmor, ArmorType.leggings, ItemNames.quartzLeggings);
        quartzBoots = new ItemArmorFT(AM.quartzArmor, ArmorType.boots, ItemNames.quartzBoots);

        obsidianHelmet = new ItemArmorFT(AM.obsidianArmor, ArmorType.helmet, ItemNames.obsidianHelmet);
        obsidianChestplate = new ItemArmorFT(AM.obsidianArmor, ArmorType.chestplate, ItemNames.obsidianChestplate);
        obsidianLeggings = new ItemArmorFT(AM.obsidianArmor, ArmorType.leggings, ItemNames.obsidianLeggings);
        obsidianBoots = new ItemArmorFT(AM.obsidianArmor, ArmorType.boots, ItemNames.obsidianBoots);

        emeraldHelmet = new ItemArmorFT(AM.emeraldArmor, ArmorType.helmet, ItemNames.emeraldHelmet);
        emeraldChestplate = new ItemArmorFT(AM.emeraldArmor, ArmorType.chestplate, ItemNames.emeraldChestplate);
        emeraldLeggings = new ItemArmorFT(AM.emeraldArmor, ArmorType.leggings, ItemNames.emeraldLeggings);
        emeraldBoots = new ItemArmorFT(AM.emeraldArmor, ArmorType.boots, ItemNames.emeraldBoots);

        lapisHelmet = new ItemArmorFT(AM.lapisArmor, ArmorType.helmet, ItemNames.lapisHelmet);
        lapisChestplate = new ItemArmorFT(AM.lapisArmor, ArmorType.chestplate, ItemNames.lapisChestplate);
        lapisLeggings = new ItemArmorFT(AM.lapisArmor, ArmorType.leggings, ItemNames.lapisLeggings);
        lapisBoots = new ItemArmorFT(AM.lapisArmor, ArmorType.boots, ItemNames.lapisBoots);

        bronzeHelmet = new ItemArmorFT(AM.bronzeArmor, ArmorType.helmet, ItemNames.bronzeHelmet);
        bronzeChestplate = new ItemArmorFT(AM.bronzeArmor, ArmorType.chestplate, ItemNames.bronzeChestplate);
        bronzeLeggings = new ItemArmorFT(AM.bronzeArmor, ArmorType.leggings, ItemNames.bronzeLeggings);
        bronzeBoots = new ItemArmorFT(AM.bronzeArmor, ArmorType.boots, ItemNames.bronzeBoots);

        coalHelmet = new ItemArmorFT(AM.coalArmor, ArmorType.helmet, ItemNames.coalHelmet);
        coalChestplate = new ItemArmorFT(AM.coalArmor, ArmorType.chestplate, ItemNames.coalChestplate);
        coalLeggings = new ItemArmorFT(AM.coalArmor, ArmorType.leggings, ItemNames.coalLeggings);
        coalBoots = new ItemArmorFT(AM.coalArmor, ArmorType.boots, ItemNames.coalBoots);

        glowstoneHelmet = new ItemArmorFT(AM.glowstoneArmor, ArmorType.helmet, ItemNames.glowstoneHelmet);
        glowstoneChestplate = new ItemArmorFT(AM.glowstoneArmor, ArmorType.chestplate, ItemNames.glowstoneChestplate);
        glowstoneLeggings = new ItemArmorFT(AM.glowstoneArmor, ArmorType.leggings, ItemNames.glowstoneLeggings);
        glowstoneBoots = new ItemArmorFT(AM.glowstoneArmor, ArmorType.boots, ItemNames.glowstoneBoots);

        adamantiumHelmet = new ItemArmorFT(AM.adamantiumArmor, ArmorType.helmet, ItemNames.adamantiumHelmet);
        adamantiumChestplate = new ItemArmorFT(AM.adamantiumArmor, ArmorType.chestplate, ItemNames.adamantiumChestplate);
        adamantiumLeggings = new ItemArmorFT(AM.adamantiumArmor, ArmorType.leggings, ItemNames.adamantiumLeggings);
        adamantiumBoots = new ItemArmorFT(AM.adamantiumArmor, ArmorType.boots, ItemNames.adamantiumBoots);

        redstoneHelmet = new ItemArmorFT(AM.redstoneArmor, ArmorType.helmet, ItemNames.redstoneHelmet);
        redstoneChestplate = new ItemArmorFT(AM.redstoneArmor, ArmorType.chestplate, ItemNames.redstoneChestplate);
        redstoneLeggings = new ItemArmorFT(AM.redstoneArmor, ArmorType.leggings, ItemNames.redstoneLeggings);
        redstoneBoots = new ItemArmorFT(AM.redstoneArmor, ArmorType.boots, ItemNames.redstoneBoots);

        bowQuartz = new ItemBowFT(TM.quartz, ItemNames.bowQuartz);
        bowObsidian = new ItemBowFT(TM.obsidian, ItemNames.bowObsidian);
        bowEmerald = new ItemBowFT(TM.emerald, ItemNames.bowEmerald);
        bowLapis = new ItemBowFT(TM.lapis, ItemNames.bowLapis);
        bowBronze = new ItemBowBronze();
        bowCoal = new ItemBowCoal();
        bowGlowstone = new ItemBowGlowstone();
        bowAdamantium = new ItemBowFT(TM.adamantium, ItemNames.bowAdamantium);
        bowSilk = new ItemBowFT(TM.silk, ItemNames.bowSilk);
        bowRedstone = new ItemBowFT(TM.redstone, ItemNames.bowRedstone);

        quartzShears = new ItemShearsFT(TM.quartz, ItemNames.quartzShears);
        obsidianShears = new ItemShearsFT(TM.obsidian, ItemNames.obsidianShears);
        emeraldShears = new ItemShearsFT(TM.emerald, ItemNames.emeraldShears);
        lapisShears = new ItemShearsFT(TM.lapis, ItemNames.lapisShears);
        bronzeShears = new ItemShearsFT(TM.bronze, ItemNames.bronzeShears);
        coalShears = new ItemShearsFT(TM.coal, ItemNames.coalShears);
        glowstoneShears = new ItemShearsFT(TM.glowstone, ItemNames.glowstoneShears);
        adamantiumShears = new ItemShearsFT(TM.adamantium, ItemNames.adamantiumShears);
        silkShears = new ItemShearsFT(TM.silk, ItemNames.silkShears);
        redstoneShears = new ItemShearsFT(TM.redstone, ItemNames.redstoneShears);

        stickFT = new ItemStickFT();
    }

    public static void registerItems()
    {
        GameRegistry.registerItem(ingotObsidian, ItemNames.ingotObsidian);
        GameRegistry.registerItem(gemEmerald, ItemNames.gemEmerald);
        GameRegistry.registerItem(gemLapis, ItemNames.gemLapis);
        GameRegistry.registerItem(ingotBronze, ItemNames.ingotBronze);
        GameRegistry.registerItem(ingotCoal, ItemNames.ingotCoal);
        GameRegistry.registerItem(ingotGlowstone, ItemNames.ingotGlowstone);
        GameRegistry.registerItem(ingotAdamantium, ItemNames.ingotAdamantium);
        GameRegistry.registerItem(gemSilk, ItemNames.gemSilk);
        GameRegistry.registerItem(gemRedstone, ItemNames.gemRedstone);
        GameRegistry.registerItem(gemExp, ItemNames.gemExp);
        GameRegistry.registerItem(gemExp2, ItemNames.gemExp2);
        GameRegistry.registerItem(gemExp3, ItemNames.gemExp3);
        GameRegistry.registerItem(staffExp, ItemNames.staffExpVariants[0]);
        GameRegistry.registerItem(staffExp2, ItemNames.staffExpVariants[1]);
        GameRegistry.registerItem(staffExp3, ItemNames.staffExpVariants[2]);
        GameRegistry.registerItem(shardExp, ItemNames.shardExp);
        GameRegistry.registerItem(expCollector, ItemNames.expCollector);

        GameRegistry.registerItem(quartzPickaxe, ItemNames.quartzPickaxe);
        GameRegistry.registerItem(quartzShovel, ItemNames.quartzShovel);
        GameRegistry.registerItem(quartzAxe, ItemNames.quartzAxe);
        GameRegistry.registerItem(quartzHoe, ItemNames.quartzHoe);
        GameRegistry.registerItem(quartzSword, ItemNames.quartzSword);

        GameRegistry.registerItem(obsidianPickaxe, ItemNames.obsidianPickaxe);
        GameRegistry.registerItem(obsidianShovel, ItemNames.obsidianShovel);
        GameRegistry.registerItem(obsidianAxe, ItemNames.obsidianAxe);
        GameRegistry.registerItem(obsidianHoe, ItemNames.obsidianHoe);
        GameRegistry.registerItem(obsidianSword, ItemNames.obsidianSword);

        GameRegistry.registerItem(emeraldPickaxe, ItemNames.emeraldPickaxe);
        GameRegistry.registerItem(emeraldShovel, ItemNames.emeraldShovel);
        GameRegistry.registerItem(emeraldAxe, ItemNames.emeraldAxe);
        GameRegistry.registerItem(emeraldHoe, ItemNames.emeraldHoe);
        GameRegistry.registerItem(emeraldSword, ItemNames.emeraldSword);

        GameRegistry.registerItem(lapisPickaxe, ItemNames.lapisPickaxe);
        GameRegistry.registerItem(lapisShovel, ItemNames.lapisShovel);
        GameRegistry.registerItem(lapisAxe, ItemNames.lapisAxe);
        GameRegistry.registerItem(lapisHoe, ItemNames.lapisHoe);
        GameRegistry.registerItem(lapisSword, ItemNames.lapisSword);

        GameRegistry.registerItem(bronzePickaxe, ItemNames.bronzePickaxe);
        GameRegistry.registerItem(bronzeShovel, ItemNames.bronzeShovel);
        GameRegistry.registerItem(bronzeAxe, ItemNames.bronzeAxe);
        GameRegistry.registerItem(bronzeHoe, ItemNames.bronzeHoe);
        GameRegistry.registerItem(bronzeSword, ItemNames.bronzeSword);

        GameRegistry.registerItem(coalPickaxe, ItemNames.coalPickaxe);
        GameRegistry.registerItem(coalShovel, ItemNames.coalShovel);
        GameRegistry.registerItem(coalAxe, ItemNames.coalAxe);
        GameRegistry.registerItem(coalHoe, ItemNames.coalHoe);
        GameRegistry.registerItem(coalSword, ItemNames.coalSword);

        GameRegistry.registerItem(glowstonePickaxe, ItemNames.glowstonePickaxe);
        GameRegistry.registerItem(glowstoneShovel, ItemNames.glowstoneShovel);
        GameRegistry.registerItem(glowstoneAxe, ItemNames.glowstoneAxe);
        GameRegistry.registerItem(glowstoneHoe, ItemNames.glowstoneHoe);
        GameRegistry.registerItem(glowstoneSword, ItemNames.glowstoneSword);

        GameRegistry.registerItem(adamantiumPickaxe, ItemNames.adamantiumPickaxe);
        GameRegistry.registerItem(adamantiumShovel, ItemNames.adamantiumShovel);
        GameRegistry.registerItem(adamantiumAxe, ItemNames.adamantiumAxe);
        GameRegistry.registerItem(adamantiumHoe, ItemNames.adamantiumHoe);
        GameRegistry.registerItem(adamantiumSword, ItemNames.adamantiumSword);

        GameRegistry.registerItem(silkPickaxe, ItemNames.silkPickaxe);
        GameRegistry.registerItem(silkShovel, ItemNames.silkShovel);
        GameRegistry.registerItem(silkAxe, ItemNames.silkAxe);
        GameRegistry.registerItem(silkHoe, ItemNames.silkHoe);
        GameRegistry.registerItem(silkSword, ItemNames.silkSword);

        GameRegistry.registerItem(redstonePickaxe, ItemNames.redstonePickaxe);
        GameRegistry.registerItem(redstoneShovel, ItemNames.redstoneShovel);
        GameRegistry.registerItem(redstoneAxe, ItemNames.redstoneAxe);
        GameRegistry.registerItem(redstoneHoe, ItemNames.redstoneHoe);
        GameRegistry.registerItem(redstoneSword, ItemNames.redstoneSword);

        GameRegistry.registerItem(quartzHelmet, ItemNames.quartzHelmet);
        GameRegistry.registerItem(quartzChestplate, ItemNames.quartzChestplate);
        GameRegistry.registerItem(quartzLeggings, ItemNames.quartzLeggings);
        GameRegistry.registerItem(quartzBoots, ItemNames.quartzBoots);

        GameRegistry.registerItem(obsidianHelmet, ItemNames.obsidianHelmet);
        GameRegistry.registerItem(obsidianChestplate, ItemNames.obsidianChestplate);
        GameRegistry.registerItem(obsidianLeggings, ItemNames.obsidianLeggings);
        GameRegistry.registerItem(obsidianBoots, ItemNames.obsidianBoots);

        GameRegistry.registerItem(emeraldHelmet, ItemNames.emeraldHelmet);
        GameRegistry.registerItem(emeraldChestplate, ItemNames.emeraldChestplate);
        GameRegistry.registerItem(emeraldLeggings, ItemNames.emeraldLeggings);
        GameRegistry.registerItem(emeraldBoots, ItemNames.emeraldBoots);

        GameRegistry.registerItem(lapisHelmet, ItemNames.lapisHelmet);
        GameRegistry.registerItem(lapisChestplate, ItemNames.lapisChestplate);
        GameRegistry.registerItem(lapisLeggings, ItemNames.lapisLeggings);
        GameRegistry.registerItem(lapisBoots, ItemNames.lapisBoots);

        GameRegistry.registerItem(bronzeHelmet, ItemNames.bronzeHelmet);
        GameRegistry.registerItem(bronzeChestplate, ItemNames.bronzeChestplate);
        GameRegistry.registerItem(bronzeLeggings, ItemNames.bronzeLeggings);
        GameRegistry.registerItem(bronzeBoots, ItemNames.bronzeBoots);

        GameRegistry.registerItem(coalHelmet, ItemNames.coalHelmet);
        GameRegistry.registerItem(coalChestplate, ItemNames.coalChestplate);
        GameRegistry.registerItem(coalLeggings, ItemNames.coalLeggings);
        GameRegistry.registerItem(coalBoots, ItemNames.coalBoots);

        GameRegistry.registerItem(glowstoneHelmet, ItemNames.glowstoneHelmet);
        GameRegistry.registerItem(glowstoneChestplate, ItemNames.glowstoneChestplate);
        GameRegistry.registerItem(glowstoneLeggings, ItemNames.glowstoneLeggings);
        GameRegistry.registerItem(glowstoneBoots, ItemNames.glowstoneBoots);

        GameRegistry.registerItem(adamantiumHelmet, ItemNames.adamantiumHelmet);
        GameRegistry.registerItem(adamantiumChestplate, ItemNames.adamantiumChestplate);
        GameRegistry.registerItem(adamantiumLeggings, ItemNames.adamantiumLeggings);
        GameRegistry.registerItem(adamantiumBoots, ItemNames.adamantiumBoots);

        GameRegistry.registerItem(redstoneHelmet, ItemNames.redstoneHelmet);
        GameRegistry.registerItem(redstoneChestplate, ItemNames.redstoneChestplate);
        GameRegistry.registerItem(redstoneLeggings, ItemNames.redstoneLeggings);
        GameRegistry.registerItem(redstoneBoots, ItemNames.redstoneBoots);

        GameRegistry.registerItem(bowQuartz, ItemNames.bowQuartz[0]);
        GameRegistry.registerItem(bowObsidian, ItemNames.bowObsidian[0]);
        GameRegistry.registerItem(bowEmerald, ItemNames.bowEmerald[0]);
        GameRegistry.registerItem(bowLapis, ItemNames.bowLapis[0]);
        GameRegistry.registerItem(bowBronze, ItemNames.bowBronze[0]);
        GameRegistry.registerItem(bowCoal, ItemNames.bowCoal[0]);
        GameRegistry.registerItem(bowGlowstone, ItemNames.bowGlowstone[0]);
        GameRegistry.registerItem(bowAdamantium, ItemNames.bowAdamantium[0]);
        GameRegistry.registerItem(bowSilk, ItemNames.bowSilk[0]);
        GameRegistry.registerItem(bowRedstone, ItemNames.bowRedstone[0]);

        GameRegistry.registerItem(quartzShears, ItemNames.quartzShears);
        GameRegistry.registerItem(obsidianShears, ItemNames.obsidianShears);
        GameRegistry.registerItem(emeraldShears, ItemNames.emeraldShears);
        GameRegistry.registerItem(lapisShears, ItemNames.lapisShears);
        GameRegistry.registerItem(bronzeShears, ItemNames.bronzeShears);
        GameRegistry.registerItem(coalShears, ItemNames.coalShears);
        GameRegistry.registerItem(glowstoneShears, ItemNames.glowstoneShears);
        GameRegistry.registerItem(adamantiumShears, ItemNames.adamantiumShears);
        GameRegistry.registerItem(silkShears, ItemNames.silkShears);
        GameRegistry.registerItem(redstoneShears, ItemNames.redstoneShears);

        GameRegistry.registerItem(stickFT, ItemNames.stickFT);
    }
}
