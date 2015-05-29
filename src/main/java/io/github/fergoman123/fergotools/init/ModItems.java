package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.base.*;
import io.github.fergoman123.fergotools.common.items.*;
import io.github.fergoman123.fergotools.reference.ItemInfos;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.VariantNameFT;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemShearsFT;
import io.github.fergoman123.fergoutil.item.ArmorType;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
    public static Item ingotObsidian;
    public static Item gemEmerald;
    public static Item gemLapis;
    public static Item ingotBronze;
    public static Item ingotCoal;
    public static Item ingotGlowstone;
    public static Item ingotAdamantium;
    public static Item gemSilk;
    public static Item gemRedstone;
    public static Item gemExp;
    public static Item gemExp2;
    public static Item gemExp3;

    public static Item staffExp;
    public static Item staffExp2;
    public static Item staffExp3;

    public static Item shardExp;
    public static Item expCollector;

    public static ItemPickaxeFT quartzPickaxe;
    public static Item quartzShovel;
    public static Item quartzAxe;
    public static Item quartzHoe;
    public static Item quartzSword;

    public static ItemPickaxeFT obsidianPickaxe;
    public static Item obsidianShovel;
    public static Item obsidianAxe;
    public static Item obsidianHoe;
    public static Item obsidianSword;

    public static ItemPickaxeFT emeraldPickaxe;
    public static Item emeraldShovel;
    public static Item emeraldAxe;
    public static Item emeraldHoe;
    public static Item emeraldSword;

    public static ItemPickaxeFT lapisPickaxe;
    public static Item lapisShovel;
    public static Item lapisAxe;
    public static Item lapisHoe;
    public static Item lapisSword;

    public static ItemPickaxeFT bronzePickaxe;
    public static Item bronzeShovel;
    public static Item bronzeAxe;
    public static Item bronzeHoe;
    public static Item bronzeSword;

    public static ItemPickaxeFT coalPickaxe;
    public static Item coalShovel;
    public static Item coalAxe;
    public static Item coalHoe;
    public static Item coalSword;

    public static ItemPickaxeFT glowstonePickaxe;
    public static Item glowstoneShovel;
    public static Item glowstoneAxe;
    public static Item glowstoneHoe;
    public static Item glowstoneSword;

    public static ItemPickaxeFT adamantiumPickaxe;
    public static Item adamantiumShovel;
    public static Item adamantiumAxe;
    public static Item adamantiumHoe;
    public static Item adamantiumSword;

    public static ItemPickaxeFT silkPickaxe;
    public static Item silkShovel;
    public static Item silkAxe;
    public static Item silkHoe;
    public static Item silkSword;

    public static ItemPickaxeFT redstonePickaxe;
    public static Item redstoneShovel;
    public static Item redstoneAxe;
    public static Item redstoneHoe;
    public static Item redstoneSword;

    public static Item quartzHelmet;
    public static Item quartzChestplate;
    public static Item quartzLeggings;
    public static Item quartzBoots;

    public static Item obsidianHelmet;
    public static Item obsidianChestplate;
    public static Item obsidianLeggings;
    public static Item obsidianBoots;

    public static Item emeraldHelmet;
    public static Item emeraldChestplate;
    public static Item emeraldLeggings;
    public static Item emeraldBoots;

    public static Item lapisHelmet;
    public static Item lapisChestplate;
    public static Item lapisLeggings;
    public static Item lapisBoots;

    public static Item bronzeHelmet;
    public static Item bronzeChestplate;
    public static Item bronzeLeggings;
    public static Item bronzeBoots;

    public static Item coalHelmet;
    public static Item coalChestplate;
    public static Item coalLeggings;
    public static Item coalBoots;

    public static Item glowstoneHelmet;
    public static Item glowstoneChestplate;
    public static Item glowstoneLeggings;
    public static Item glowstoneBoots;

    public static Item adamantiumHelmet;
    public static Item adamantiumChestplate;
    public static Item adamantiumLeggings;
    public static Item adamantiumBoots;

    public static Item redstoneHelmet;
    public static Item redstoneChestplate;
    public static Item redstoneLeggings;
    public static Item redstoneBoots;

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
        ingotObsidian = new ItemFT(ItemInfos.ingotObsidian);
        gemEmerald = new ItemFT(ItemInfos.gemEmerald);
        gemLapis = new ItemFT(ItemInfos.gemLapis);
        ingotBronze = new ItemFT(ItemInfos.ingotBronze);
        ingotCoal = new ItemFT(ItemInfos.ingotCoal);
        ingotGlowstone = new ItemFT(ItemInfos.ingotGlowstone);
        ingotAdamantium = new ItemFT(ItemInfos.ingotAdamantium);
        gemSilk = new ItemFT(ItemInfos.gemSilk);
        gemRedstone = new ItemFT(ItemInfos.gemRedstone);
        gemExp = new ItemFT(ItemInfos.gemExp);
        gemExp2 = new ItemFT(ItemInfos.gemExp2);
        gemExp3 = new ItemFT(ItemInfos.gemExp3);

        staffExp = new ItemStaffExp();
        staffExp2 = new ItemStaffExp2();
        staffExp3 = new ItemStaffExp3();

        shardExp = new ItemExpShard();
        expCollector = new ItemFT(ItemInfos.expCollector);

        quartzPickaxe = new ItemPickaxeFT(ItemInfos.quartzPickaxe);
        quartzShovel = new ItemShovelFT(ItemInfos.quartzShovel);
        quartzAxe = new ItemAxeFT(ItemInfos.quartzAxe);
        quartzHoe = new ItemHoeFT(ItemInfos.quartzHoe);
        quartzSword = new ItemSwordFT(ItemInfos.quartzSword);

        obsidianPickaxe = new ItemPickaxeFT(ItemInfos.obsidianPickaxe);
        obsidianShovel = new ItemShovelFT(ItemInfos.obsidianShovel);
        obsidianAxe = new ItemAxeFT(ItemInfos.obsidianAxe);
        obsidianHoe = new ItemHoeFT(ItemInfos.obsidianHoe);
        obsidianSword = new ItemSwordFT(ItemInfos.obsidianSword);

        emeraldPickaxe = new ItemPickaxeFT(ItemInfos.emeraldPickaxe);
        emeraldShovel = new ItemShovelFT(ItemInfos.emeraldShovel);
        emeraldAxe = new ItemAxeFT(ItemInfos.emeraldAxe);
        emeraldHoe = new ItemHoeFT(ItemInfos.emeraldHoe);
        emeraldSword = new ItemSwordFT(ItemInfos.emeraldSword);

        lapisPickaxe = new ItemPickaxeFT(ItemInfos.lapisPickaxe);
        lapisShovel = new ItemShovelFT(ItemInfos.lapisShovel);
        lapisAxe = new ItemAxeFT(ItemInfos.lapisAxe);
        lapisHoe = new ItemHoeFT(ItemInfos.lapisHoe);
        lapisSword = new ItemSwordFT(ItemInfos.lapisSword);

        bronzePickaxe = new ItemPickaxeFT(ItemInfos.bronzePickaxe);
        bronzeShovel = new ItemShovelFT(ItemInfos.bronzeShovel);
        bronzeAxe = new ItemAxeFT(ItemInfos.bronzeAxe);
        bronzeHoe = new ItemHoeFT(ItemInfos.bronzeHoe);
        bronzeSword = new ItemSwordFT(ItemInfos.bronzeSword);

        coalPickaxe = new ItemPickaxeFT(ItemInfos.coalPickaxe);
        coalShovel = new ItemShovelFT(ItemInfos.coalShovel);
        coalAxe = new ItemAxeFT(ItemInfos.coalAxe);
        coalHoe = new ItemHoeFT(ItemInfos.coalHoe);
        coalSword = new ItemSwordFT(ItemInfos.coalSword);

        glowstonePickaxe = new ItemPickaxeFT(ItemInfos.glowstonePickaxe);
        glowstoneShovel = new ItemShovelFT(ItemInfos.glowstoneShovel);
        glowstoneAxe = new ItemAxeFT(ItemInfos.glowstoneAxe);
        glowstoneHoe = new ItemHoeFT(ItemInfos.glowstoneHoe);
        glowstoneSword = new ItemSwordFT(ItemInfos.glowstoneSword);

        adamantiumPickaxe = new ItemPickaxeFT(ItemInfos.adamantiumPickaxe);
        adamantiumShovel = new ItemShovelFT(ItemInfos.adamantiumShovel);
        adamantiumAxe = new ItemAxeFT(ItemInfos.adamantiumAxe);
        adamantiumHoe = new ItemHoeFT(ItemInfos.adamantiumHoe);
        adamantiumSword = new ItemSwordFT(ItemInfos.adamantiumSword);

        silkPickaxe = new ItemPickaxeFT(ItemInfos.silkPickaxe);
        silkShovel = new ItemShovelFT(ItemInfos.silkShovel);
        silkAxe = new ItemAxeFT(ItemInfos.silkAxe);
        silkHoe = new ItemHoeFT(ItemInfos.silkHoe);
        silkSword = new ItemSwordFT(ItemInfos.silkSword);

        redstonePickaxe = new ItemPickaxeFT(ItemInfos.redstonePickaxe);
        redstoneShovel = new ItemShovelFT(ItemInfos.redstoneShovel);
        redstoneAxe = new ItemAxeFT(ItemInfos.redstoneAxe);
        redstoneHoe = new ItemHoeFT(ItemInfos.redstoneHoe);
        redstoneSword = new ItemSwordFT(ItemInfos.redstoneSword);

        quartzHelmet = new ItemArmorFT(ItemInfos.quartzHelmet);
        quartzChestplate = new ItemArmorFT(ItemInfos.quartzChestplate);
        quartzLeggings = new ItemArmorFT(ItemInfos.quartzLeggings);
        quartzBoots = new ItemArmorFT(ItemInfos.quartzBoots);

        obsidianHelmet = new ItemArmorFT(ItemInfos.obsidianHelmet);
        obsidianChestplate = new ItemArmorFT(ItemInfos.obsidianChestplate);
        obsidianLeggings = new ItemArmorFT(ItemInfos.obsidianLeggings);
        obsidianBoots = new ItemArmorFT(ItemInfos.obsidianBoots);

        emeraldHelmet = new ItemArmorFT(ItemInfos.emeraldHelmet);
        emeraldChestplate = new ItemArmorFT(ItemInfos.emeraldChestplate);
        emeraldLeggings = new ItemArmorFT(ItemInfos.emeraldLeggings);
        emeraldBoots = new ItemArmorFT(ItemInfos.emeraldBoots);

        lapisHelmet = new ItemArmorFT(ItemInfos.lapisHelmet);
        lapisChestplate = new ItemArmorFT(ItemInfos.lapisChestplate);
        lapisLeggings = new ItemArmorFT(ItemInfos.lapisLeggings);
        lapisBoots = new ItemArmorFT(ItemInfos.lapisBoots);

        bronzeHelmet = new ItemArmorFT(ItemInfos.bronzeHelmet);
        bronzeChestplate = new ItemArmorFT(ItemInfos.bronzeChestplate);
        bronzeLeggings = new ItemArmorFT(ItemInfos.bronzeLeggings);
        bronzeBoots = new ItemArmorFT(ItemInfos.bronzeBoots);

        coalHelmet = new ItemArmorFT(ItemInfos.coalHelmet);
        coalChestplate = new ItemArmorFT(ItemInfos.coalChestplate);
        coalLeggings = new ItemArmorFT(ItemInfos.coalLeggings);
        coalBoots = new ItemArmorFT(ItemInfos.coalBoots);

        glowstoneHelmet = new ItemArmorFT(ItemInfos.glowstoneHelmet);
        glowstoneChestplate = new ItemArmorFT(ItemInfos.glowstoneChestplate);
        glowstoneLeggings = new ItemArmorFT(ItemInfos.glowstoneLeggings);
        glowstoneBoots = new ItemArmorFT(ItemInfos.glowstoneBoots);

        adamantiumHelmet = new ItemArmorFT(ItemInfos.adamantiumHelmet);
        adamantiumChestplate = new ItemArmorFT(ItemInfos.adamantiumChestplate);
        adamantiumLeggings = new ItemArmorFT(ItemInfos.adamantiumLeggings);
        adamantiumBoots = new ItemArmorFT(ItemInfos.adamantiumBoots);

        redstoneHelmet = new ItemArmorFT(ItemInfos.redstoneHelmet);
        redstoneChestplate = new ItemArmorFT(ItemInfos.redstoneChestplate);
        redstoneLeggings = new ItemArmorFT(ItemInfos.redstoneLeggings);
        redstoneBoots = new ItemArmorFT(ItemInfos.redstoneBoots);

        bowQuartz = new ItemBowFT(ItemInfos.bowQuartz);
        bowObsidian = new ItemBowFT(ItemInfos.bowObsidian);
        bowEmerald = new ItemBowFT(ItemInfos.bowEmerald);
        bowLapis = new ItemBowFT(ItemInfos.bowLapis);
        bowBronze = new ItemBowFT(ItemInfos.bowBronze);
        bowCoal = new ItemBowFT(ItemInfos.bowCoal);
        bowGlowstone = new ItemBowFT(ItemInfos.bowGlowstone);
        bowAdamantium = new ItemBowFT(ItemInfos.bowAdamantium);
        bowSilk = new ItemBowFT(ItemInfos.bowSilk);
        bowRedstone = new ItemBowFT(ItemInfos.bowRedstone);

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

    public static void registerItems()
    {
        registerItem(ingotObsidian, ItemNames.ingotObsidian);
        registerItem(gemEmerald, ItemNames.gemEmerald);
        registerItem(gemLapis, ItemNames.gemLapis);
        registerItem(ingotBronze, ItemNames.ingotBronze);
        registerItem(ingotCoal, ItemNames.ingotCoal);
        registerItem(ingotGlowstone, ItemNames.ingotGlowstone);
        registerItem(ingotAdamantium, ItemNames.ingotAdamantium);
        registerItem(gemSilk, ItemNames.gemSilk);
        registerItem(gemRedstone, ItemNames.gemRedstone);
        registerItem(gemExp, ItemNames.gemExp);
        registerItem(gemExp2, ItemNames.gemExp2);
        registerItem(gemExp3, ItemNames.gemExp3);
        registerItem(staffExp, ItemNames.staffExpVariants[0]);
        registerItem(staffExp2, ItemNames.staffExpVariants[1]);
        registerItem(staffExp3, ItemNames.staffExpVariants[2]);
        registerItem(shardExp, ItemNames.shardExp);
        registerItem(expCollector, ItemNames.expCollector);

        registerItem(quartzPickaxe, ItemNames.quartzPickaxe);
        registerItem(quartzShovel, ItemNames.quartzShovel);
        registerItem(quartzAxe, ItemNames.quartzAxe);
        registerItem(quartzHoe, ItemNames.quartzHoe);
        registerItem(quartzSword, ItemNames.quartzSword);

        registerItem(obsidianPickaxe, ItemNames.obsidianPickaxe);
        registerItem(obsidianShovel, ItemNames.obsidianShovel);
        registerItem(obsidianAxe, ItemNames.obsidianAxe);
        registerItem(obsidianHoe, ItemNames.obsidianHoe);
        registerItem(obsidianSword, ItemNames.obsidianSword);

        registerItem(emeraldPickaxe, ItemNames.emeraldPickaxe);
        registerItem(emeraldShovel, ItemNames.emeraldShovel);
        registerItem(emeraldAxe, ItemNames.emeraldAxe);
        registerItem(emeraldHoe, ItemNames.emeraldHoe);
        registerItem(emeraldSword, ItemNames.emeraldSword);

        registerItem(lapisPickaxe, ItemNames.lapisPickaxe);
        registerItem(lapisShovel, ItemNames.lapisShovel);
        registerItem(lapisAxe, ItemNames.lapisAxe);
        registerItem(lapisHoe, ItemNames.lapisHoe);
        registerItem(lapisSword, ItemNames.lapisSword);

        registerItem(bronzePickaxe, ItemNames.bronzePickaxe);
        registerItem(bronzeShovel, ItemNames.bronzeShovel);
        registerItem(bronzeAxe, ItemNames.bronzeAxe);
        registerItem(bronzeHoe, ItemNames.bronzeHoe);
        registerItem(bronzeSword, ItemNames.bronzeSword);

        registerItem(coalPickaxe, ItemNames.coalPickaxe);
        registerItem(coalShovel, ItemNames.coalShovel);
        registerItem(coalAxe, ItemNames.coalAxe);
        registerItem(coalHoe, ItemNames.coalHoe);
        registerItem(coalSword, ItemNames.coalSword);

        registerItem(glowstonePickaxe, ItemNames.glowstonePickaxe);
        registerItem(glowstoneShovel, ItemNames.glowstoneShovel);
        registerItem(glowstoneAxe, ItemNames.glowstoneAxe);
        registerItem(glowstoneHoe, ItemNames.glowstoneHoe);
        registerItem(glowstoneSword, ItemNames.glowstoneSword);

        registerItem(adamantiumPickaxe, ItemNames.adamantiumPickaxe);
        registerItem(adamantiumShovel, ItemNames.adamantiumShovel);
        registerItem(adamantiumAxe, ItemNames.adamantiumAxe);
        registerItem(adamantiumHoe, ItemNames.adamantiumHoe);
        registerItem(adamantiumSword, ItemNames.adamantiumSword);

        registerItem(silkPickaxe, ItemNames.silkPickaxe);
        registerItem(silkShovel, ItemNames.silkShovel);
        registerItem(silkAxe, ItemNames.silkAxe);
        registerItem(silkHoe, ItemNames.silkHoe);
        registerItem(silkSword, ItemNames.silkSword);

        registerItem(redstonePickaxe, ItemNames.redstonePickaxe);
        registerItem(redstoneShovel, ItemNames.redstoneShovel);
        registerItem(redstoneAxe, ItemNames.redstoneAxe);
        registerItem(redstoneHoe, ItemNames.redstoneHoe);
        registerItem(redstoneSword, ItemNames.redstoneSword);

        registerItem(quartzHelmet, ItemNames.quartzHelmet);
        registerItem(quartzChestplate, ItemNames.quartzChestplate);
        registerItem(quartzLeggings, ItemNames.quartzLeggings);
        registerItem(quartzBoots, ItemNames.quartzBoots);

        registerItem(obsidianHelmet, ItemNames.obsidianHelmet);
        registerItem(obsidianChestplate, ItemNames.obsidianChestplate);
        registerItem(obsidianLeggings, ItemNames.obsidianLeggings);
        registerItem(obsidianBoots, ItemNames.obsidianBoots);

        registerItem(emeraldHelmet, ItemNames.emeraldHelmet);
        registerItem(emeraldChestplate, ItemNames.emeraldChestplate);
        registerItem(emeraldLeggings, ItemNames.emeraldLeggings);
        registerItem(emeraldBoots, ItemNames.emeraldBoots);

        registerItem(lapisHelmet, ItemNames.lapisHelmet);
        registerItem(lapisChestplate, ItemNames.lapisChestplate);
        registerItem(lapisLeggings, ItemNames.lapisLeggings);
        registerItem(lapisBoots, ItemNames.lapisBoots);

        registerItem(bronzeHelmet, ItemNames.bronzeHelmet);
        registerItem(bronzeChestplate, ItemNames.bronzeChestplate);
        registerItem(bronzeLeggings, ItemNames.bronzeLeggings);
        registerItem(bronzeBoots, ItemNames.bronzeBoots);

        registerItem(coalHelmet, ItemNames.coalHelmet);
        registerItem(coalChestplate, ItemNames.coalChestplate);
        registerItem(coalLeggings, ItemNames.coalLeggings);
        registerItem(coalBoots, ItemNames.coalBoots);

        registerItem(glowstoneHelmet, ItemNames.glowstoneHelmet);
        registerItem(glowstoneChestplate, ItemNames.glowstoneChestplate);
        registerItem(glowstoneLeggings, ItemNames.glowstoneLeggings);
        registerItem(glowstoneBoots, ItemNames.glowstoneBoots);

        registerItem(adamantiumHelmet, ItemNames.adamantiumHelmet);
        registerItem(adamantiumChestplate, ItemNames.adamantiumChestplate);
        registerItem(adamantiumLeggings, ItemNames.adamantiumLeggings);
        registerItem(adamantiumBoots, ItemNames.adamantiumBoots);

        registerItem(redstoneHelmet, ItemNames.redstoneHelmet);
        registerItem(redstoneChestplate, ItemNames.redstoneChestplate);
        registerItem(redstoneLeggings, ItemNames.redstoneLeggings);
        registerItem(redstoneBoots, ItemNames.redstoneBoots);

        registerItem(bowQuartz, ItemNames.bowQuartz[0]);
        registerItem(bowObsidian, ItemNames.bowObsidian[0]);
        registerItem(bowEmerald, ItemNames.bowEmerald[0]);
        registerItem(bowLapis, ItemNames.bowLapis[0]);
        registerItem(bowBronze, ItemNames.bowBronze[0]);
        registerItem(bowCoal, ItemNames.bowCoal[0]);
        registerItem(bowGlowstone, ItemNames.bowGlowstone[0]);
        registerItem(bowAdamantium, ItemNames.bowAdamantium[0]);
        registerItem(bowSilk, ItemNames.bowSilk[0]);
        registerItem(bowRedstone, ItemNames.bowRedstone[0]);

        registerItem(quartzShears, ItemNames.quartzShears);
        registerItem(obsidianShears, ItemNames.obsidianShears);
        registerItem(emeraldShears, ItemNames.emeraldShears);
        registerItem(lapisShears, ItemNames.lapisShears);
        registerItem(bronzeShears, ItemNames.bronzeShears);
        registerItem(coalShears, ItemNames.coalShears);
        registerItem(glowstoneShears, ItemNames.glowstoneShears);
        registerItem(adamantiumShears, ItemNames.adamantiumShears);
        registerItem(silkShears, ItemNames.silkShears);
        registerItem(redstoneShears, ItemNames.redstoneShears);

        registerItem(stickFT, ItemNames.stickFT);
    }

    public static void registerModels()
    {
        registerModel(ingotObsidian, ItemNames.ingotObsidian);
        registerModel(gemEmerald, ItemNames.gemEmerald);
        registerModel(gemLapis, ItemNames.gemLapis);
        registerModel(ingotBronze, ItemNames.ingotBronze);
        registerModel(ingotCoal, ItemNames.ingotCoal);
        registerModel(ingotGlowstone, ItemNames.ingotGlowstone);
        registerModel(ingotAdamantium, ItemNames.ingotAdamantium);
        registerModel(gemSilk, ItemNames.gemSilk);
        registerModel(gemRedstone, ItemNames.gemRedstone);
        registerModel(gemExp, ItemNames.gemExp);
        registerModel(gemExp2, ItemNames.gemExp2);
        registerModel(gemExp3, ItemNames.gemExp3);
        registerModel(staffExp, ItemNames.staffExpVariants[0]);
        registerModel(staffExp2, ItemNames.staffExpVariants[1]);
        registerModel(staffExp3, ItemNames.staffExpVariants[2]);
        registerModel(shardExp, ItemNames.shardExp);
        registerModel(expCollector, ItemNames.expCollector);

        registerModel(quartzPickaxe, ItemNames.quartzPickaxe);
        registerModel(quartzShovel, ItemNames.quartzShovel);
        registerModel(quartzAxe, ItemNames.quartzAxe);
        registerModel(quartzHoe, ItemNames.quartzHoe);
        registerModel(quartzSword, ItemNames.quartzSword);

        registerModel(obsidianPickaxe, ItemNames.obsidianPickaxe);
        registerModel(obsidianShovel, ItemNames.obsidianShovel);
        registerModel(obsidianAxe, ItemNames.obsidianAxe);
        registerModel(obsidianHoe, ItemNames.obsidianHoe);
        registerModel(obsidianSword, ItemNames.obsidianSword);

        registerModel(emeraldPickaxe, ItemNames.emeraldPickaxe);
        registerModel(emeraldShovel, ItemNames.emeraldShovel);
        registerModel(emeraldAxe, ItemNames.emeraldAxe);
        registerModel(emeraldHoe, ItemNames.emeraldHoe);
        registerModel(emeraldSword, ItemNames.emeraldSword);

        registerModel(lapisPickaxe, ItemNames.lapisPickaxe);
        registerModel(lapisShovel, ItemNames.lapisShovel);
        registerModel(lapisAxe, ItemNames.lapisAxe);
        registerModel(lapisHoe, ItemNames.lapisHoe);
        registerModel(lapisSword, ItemNames.lapisSword);

        registerModel(bronzePickaxe, ItemNames.bronzePickaxe);
        registerModel(bronzeShovel, ItemNames.bronzeShovel);
        registerModel(bronzeAxe, ItemNames.bronzeAxe);
        registerModel(bronzeHoe, ItemNames.bronzeHoe);
        registerModel(bronzeSword, ItemNames.bronzeSword);

        registerModel(coalPickaxe, ItemNames.coalPickaxe);
        registerModel(coalShovel, ItemNames.coalShovel);
        registerModel(coalAxe, ItemNames.coalAxe);
        registerModel(coalHoe, ItemNames.coalHoe);
        registerModel(coalSword, ItemNames.coalSword);

        registerModel(glowstonePickaxe, ItemNames.glowstonePickaxe);
        registerModel(glowstoneShovel, ItemNames.glowstoneShovel);
        registerModel(glowstoneAxe, ItemNames.glowstoneAxe);
        registerModel(glowstoneHoe, ItemNames.glowstoneHoe);
        registerModel(glowstoneSword, ItemNames.glowstoneSword);

        registerModel(adamantiumPickaxe, ItemNames.adamantiumPickaxe);
        registerModel(adamantiumShovel, ItemNames.adamantiumShovel);
        registerModel(adamantiumAxe, ItemNames.adamantiumAxe);
        registerModel(adamantiumHoe, ItemNames.adamantiumHoe);
        registerModel(adamantiumSword, ItemNames.adamantiumSword);

        registerModel(silkPickaxe, ItemNames.silkPickaxe);
        registerModel(silkShovel, ItemNames.silkShovel);
        registerModel(silkAxe, ItemNames.silkAxe);
        registerModel(silkHoe, ItemNames.silkHoe);
        registerModel(silkSword, ItemNames.silkSword);

        registerModel(redstonePickaxe, ItemNames.redstonePickaxe);
        registerModel(redstoneShovel, ItemNames.redstoneShovel);
        registerModel(redstoneAxe, ItemNames.redstoneAxe);
        registerModel(redstoneHoe, ItemNames.redstoneHoe);
        registerModel(redstoneSword, ItemNames.redstoneSword);

        registerModel(quartzHelmet, ItemNames.quartzHelmet);
        registerModel(quartzChestplate, ItemNames.quartzChestplate);
        registerModel(quartzLeggings, ItemNames.quartzLeggings);
        registerModel(quartzBoots, ItemNames.quartzBoots);

        registerModel(obsidianHelmet, ItemNames.obsidianHelmet);
        registerModel(obsidianChestplate, ItemNames.obsidianChestplate);
        registerModel(obsidianLeggings, ItemNames.obsidianLeggings);
        registerModel(obsidianBoots, ItemNames.obsidianBoots);

        registerModel(emeraldHelmet, ItemNames.emeraldHelmet);
        registerModel(emeraldChestplate, ItemNames.emeraldChestplate);
        registerModel(emeraldLeggings, ItemNames.emeraldLeggings);
        registerModel(emeraldBoots, ItemNames.emeraldBoots);

        registerModel(lapisHelmet, ItemNames.lapisHelmet);
        registerModel(lapisChestplate, ItemNames.lapisChestplate);
        registerModel(lapisLeggings, ItemNames.lapisLeggings);
        registerModel(lapisBoots, ItemNames.lapisBoots);

        registerModel(bronzeHelmet, ItemNames.bronzeHelmet);
        registerModel(bronzeChestplate, ItemNames.bronzeChestplate);
        registerModel(bronzeLeggings, ItemNames.bronzeLeggings);
        registerModel(bronzeBoots, ItemNames.bronzeBoots);

        registerModel(coalHelmet, ItemNames.coalHelmet);
        registerModel(coalChestplate, ItemNames.coalChestplate);
        registerModel(coalLeggings, ItemNames.coalLeggings);
        registerModel(coalBoots, ItemNames.coalBoots);

        registerModel(glowstoneHelmet, ItemNames.glowstoneHelmet);
        registerModel(glowstoneChestplate, ItemNames.glowstoneChestplate);
        registerModel(glowstoneLeggings, ItemNames.glowstoneLeggings);
        registerModel(glowstoneBoots, ItemNames.glowstoneBoots);

        registerModel(adamantiumHelmet, ItemNames.adamantiumHelmet);
        registerModel(adamantiumChestplate, ItemNames.adamantiumChestplate);
        registerModel(adamantiumLeggings, ItemNames.adamantiumLeggings);
        registerModel(adamantiumBoots, ItemNames.adamantiumBoots);

        registerModel(redstoneHelmet, ItemNames.redstoneHelmet);
        registerModel(redstoneChestplate, ItemNames.redstoneChestplate);
        registerModel(redstoneLeggings, ItemNames.redstoneLeggings);
        registerModel(redstoneBoots, ItemNames.redstoneBoots);

        registerModel(bowQuartz, ItemNames.bowQuartz[0]);
        registerModel(bowQuartz, ItemNames.bowQuartz[1]);
        registerModel(bowQuartz, ItemNames.bowQuartz[2]);
        registerModel(bowQuartz, ItemNames.bowQuartz[3]);

        registerModel(bowObsidian, ItemNames.bowObsidian[0]);
        registerModel(bowObsidian, ItemNames.bowObsidian[1]);
        registerModel(bowObsidian, ItemNames.bowObsidian[2]);
        registerModel(bowObsidian, ItemNames.bowObsidian[3]);

        registerModel(bowEmerald, ItemNames.bowEmerald[0]);
        registerModel(bowEmerald, ItemNames.bowEmerald[1]);
        registerModel(bowEmerald, ItemNames.bowEmerald[2]);
        registerModel(bowEmerald, ItemNames.bowEmerald[3]);

        registerModel(bowLapis, ItemNames.bowLapis[0]);
        registerModel(bowLapis, ItemNames.bowLapis[1]);
        registerModel(bowLapis, ItemNames.bowLapis[2]);
        registerModel(bowLapis, ItemNames.bowLapis[3]);

        registerModel(bowBronze, ItemNames.bowBronze[0]);
        registerModel(bowBronze, ItemNames.bowBronze[1]);
        registerModel(bowBronze, ItemNames.bowBronze[2]);
        registerModel(bowBronze, ItemNames.bowBronze[3]);

        registerModel(bowCoal, ItemNames.bowCoal[0]);
        registerModel(bowCoal, ItemNames.bowCoal[1]);
        registerModel(bowCoal, ItemNames.bowCoal[2]);
        registerModel(bowCoal, ItemNames.bowCoal[3]);

        registerModel(bowGlowstone, ItemNames.bowGlowstone[0]);
        registerModel(bowGlowstone, ItemNames.bowGlowstone[1]);
        registerModel(bowGlowstone, ItemNames.bowGlowstone[2]);
        registerModel(bowGlowstone, ItemNames.bowGlowstone[3]);

        registerModel(bowAdamantium, ItemNames.bowAdamantium[0]);
        registerModel(bowAdamantium, ItemNames.bowAdamantium[1]);
        registerModel(bowAdamantium, ItemNames.bowAdamantium[2]);
        registerModel(bowAdamantium, ItemNames.bowAdamantium[3]);

        registerModel(bowSilk, ItemNames.bowSilk[0]);
        registerModel(bowSilk, ItemNames.bowSilk[1]);
        registerModel(bowSilk, ItemNames.bowSilk[2]);
        registerModel(bowSilk, ItemNames.bowSilk[3]);

        registerModel(bowRedstone, ItemNames.bowRedstone[0]);
        registerModel(bowRedstone, ItemNames.bowRedstone[1]);
        registerModel(bowRedstone, ItemNames.bowRedstone[2]);
        registerModel(bowRedstone, ItemNames.bowRedstone[3]);

        registerModel(quartzShears, ItemNames.quartzShears);
        registerModel(obsidianShears, ItemNames.obsidianShears);
        registerModel(emeraldShears, ItemNames.emeraldShears);
        registerModel(lapisShears, ItemNames.lapisShears);
        registerModel(bronzeShears, ItemNames.bronzeShears);
        registerModel(coalShears, ItemNames.coalShears);
        registerModel(glowstoneShears, ItemNames.glowstoneShears);
        registerModel(adamantiumShears, ItemNames.adamantiumShears);
        registerModel(silkShears, ItemNames.silkShears);
        registerModel(redstoneShears, ItemNames.redstoneShears);

        registerModel(stickFT, 0, ItemNames.sticks[0]);
        registerModel(stickFT, 1, ItemNames.sticks[1]);
        registerModel(stickFT, 2, ItemNames.sticks[2]);
        registerModel(stickFT, 3, ItemNames.sticks[3]);
        registerModel(stickFT, 4, ItemNames.sticks[4]);
        registerModel(stickFT, 5, ItemNames.sticks[5]);
        registerModel(stickFT, 6, ItemNames.sticks[6]);
        registerModel(stickFT, 7, ItemNames.sticks[7]);
        registerModel(stickFT, 8, ItemNames.sticks[8]);

    }

    public static void registerItem(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
    }

    public static void registerModel(Item item, int meta, String name){
        ModelHelper.getItemModelMesher().register(item, meta, new ModelResLocFT(name));
        ModelBakery.addVariantName(item, new VariantNameFT(name).getFullName());
    }

    public static void registerModel(Item item, String name)
    {
        registerModel(item, 0, name);
    }
}
