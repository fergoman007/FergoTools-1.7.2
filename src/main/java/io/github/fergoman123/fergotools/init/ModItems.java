package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.common.items.ItemExpCollector;
import io.github.fergoman123.fergotools.common.items.ItemExpShard;
import io.github.fergoman123.fergotools.item.ItemArmorAdamantium;
import io.github.fergoman123.fergotools.item.ItemArmorBronze;
import io.github.fergoman123.fergotools.item.ItemArmorCoal;
import io.github.fergoman123.fergotools.item.ItemArmorEmerald;
import io.github.fergoman123.fergotools.item.ItemArmorFT;
import io.github.fergoman123.fergotools.item.ItemArmorGlowstone;
import io.github.fergoman123.fergotools.item.ItemArmorLapis;
import io.github.fergoman123.fergotools.item.ItemArmorObsidian;
import io.github.fergoman123.fergotools.item.ItemArmorQuartz;
import io.github.fergoman123.fergotools.item.ItemArmorRedstone;
import io.github.fergoman123.fergotools.item.ItemAxeFT;
import io.github.fergoman123.fergotools.item.ItemBowFT;
import io.github.fergoman123.fergotools.item.ItemFT;
import io.github.fergoman123.fergotools.item.ItemGemExpBase;
import io.github.fergoman123.fergotools.item.ItemHoeFT;
import io.github.fergoman123.fergotools.item.ItemMultiFT;
import io.github.fergoman123.fergotools.item.ItemPickaxeFT;
import io.github.fergoman123.fergotools.item.ItemShearsFT;
import io.github.fergoman123.fergotools.item.ItemShovelFT;
import io.github.fergoman123.fergotools.item.ItemStaffExpBase;
import io.github.fergoman123.fergotools.item.ItemSwordFT;
import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemFT ingotObsidian = new ItemFT(ItemNames.ingotObsidian);
    public static final ItemFT gemEmerald = new ItemFT(ItemNames.gemEmerald);
    public static final ItemFT gemLapis = new ItemFT(ItemNames.gemLapis);
    public static final ItemFT ingotBronze = new ItemFT(ItemNames.ingotBronze);
    public static final ItemFT ingotCoal = new ItemFT(ItemNames.ingotCoal);
    public static final ItemFT ingotGlowstone = new ItemFT(ItemNames.ingotGlowstone);
    public static final ItemFT ingotAdamantium = new ItemFT(ItemNames.ingotAdamantium);
    public static final ItemFT gemSilk = new ItemFT(ItemNames.gemSilk);
    public static final ItemFT gemRedstone = new ItemFT(ItemNames.gemRedstone);

    public static final ItemGemExpBase gemExp = new ItemGemExpBase(0);
    public static final ItemGemExpBase gemExp2 = new ItemGemExpBase(1);
    public static final ItemGemExpBase gemExp3 = new ItemGemExpBase(2);

    public static final ItemStaffExpBase staffExp = new ItemStaffExpBase(0);
    public static final ItemStaffExpBase staffExp2 = new ItemStaffExpBase(1);
    public static final ItemStaffExpBase staffExp3 = new ItemStaffExpBase(2);

    public static final ItemFT shardExp = new ItemExpShard();
    public static final ItemFT expCollector = new ItemExpCollector();

    public static final ItemPickaxeFT quartzPickaxe = new ItemPickaxeFT(TM.quartz, ItemNames.quartzPickaxe);
    public static final ItemShovelFT quartzShovel = new ItemShovelFT(TM.quartz, ItemNames.quartzShovel);
    public static final ItemAxeFT quartzAxe = new ItemAxeFT(TM.quartz, ItemNames.quartzAxe);
    public static final ItemHoeFT quartzHoe = new ItemHoeFT(TM.quartz, ItemNames.quartzHoe);
    public static final ItemSwordFT quartzSword = new ItemSwordFT(TM.quartz, ItemNames.quartzSword);

    public static final ItemPickaxeFT obsidianPickaxe = new ItemPickaxeFT(TM.obsidian, ItemNames.obsidianPickaxe);
    public static final ItemShovelFT obsidianShovel = new ItemShovelFT(TM.obsidian, ItemNames.obsidianShovel);
    public static final ItemAxeFT obsidianAxe = new ItemAxeFT(TM.obsidian, ItemNames.obsidianAxe);
    public static final ItemHoeFT obsidianHoe = new ItemHoeFT(TM.obsidian, ItemNames.obsidianHoe);
    public static final ItemSwordFT obsidianSword = new ItemSwordFT(TM.obsidian, ItemNames.obsidianSword);

    public static final ItemPickaxeFT emeraldPickaxe = new ItemPickaxeFT(TM.emerald, ItemNames.emeraldPickaxe);
    public static final ItemShovelFT emeraldShovel = new ItemShovelFT(TM.emerald, ItemNames.emeraldShovel);
    public static final ItemAxeFT emeraldAxe = new ItemAxeFT(TM.emerald, ItemNames.emeraldAxe);
    public static final ItemHoeFT emeraldHoe = new ItemHoeFT(TM.emerald, ItemNames.emeraldHoe);
    public static final ItemSwordFT emeraldSword = new ItemSwordFT(TM.emerald, ItemNames.emeraldSword);

    public static final ItemPickaxeFT lapisPickaxe = new ItemPickaxeFT(TM.lapis, ItemNames.lapisPickaxe);
    public static final ItemShovelFT lapisShovel = new ItemShovelFT(TM.lapis, ItemNames.lapisShovel);
    public static final ItemAxeFT lapisAxe = new ItemAxeFT(TM.lapis, ItemNames.lapisAxe);
    public static final ItemHoeFT lapisHoe = new ItemHoeFT(TM.lapis, ItemNames.lapisHoe);
    public static final ItemSwordFT lapisSword = new ItemSwordFT(TM.lapis, ItemNames.lapisSword);

    public static final ItemPickaxeFT bronzePickaxe = new ItemPickaxeFT(TM.bronze, ItemNames.bronzePickaxe);
    public static final ItemShovelFT bronzeShovel = new ItemShovelFT(TM.bronze, ItemNames.bronzeShovel);
    public static final ItemAxeFT bronzeAxe = new ItemAxeFT(TM.bronze, ItemNames.bronzeAxe);
    public static final ItemHoeFT bronzeHoe = new ItemHoeFT(TM.bronze, ItemNames.bronzeHoe);
    public static final ItemSwordFT bronzeSword = new ItemSwordFT(TM.bronze, ItemNames.bronzeSword);

    public static final ItemPickaxeFT coalPickaxe = new ItemPickaxeFT(TM.coal, ItemNames.coalPickaxe);
    public static final ItemShovelFT coalShovel = new ItemShovelFT(TM.coal, ItemNames.coalShovel);
    public static final ItemAxeFT coalAxe = new ItemAxeFT(TM.coal, ItemNames.coalAxe);
    public static final ItemHoeFT coalHoe = new ItemHoeFT(TM.coal, ItemNames.coalHoe);
    public static final ItemSwordFT coalSword = new ItemSwordFT(TM.coal, ItemNames.coalSword);

    public static final ItemPickaxeFT glowstonePickaxe = new ItemPickaxeFT(TM.glowstone, ItemNames.glowstonePickaxe);
    public static final ItemShovelFT glowstoneShovel = new ItemShovelFT(TM.glowstone, ItemNames.glowstoneShovel);
    public static final ItemAxeFT glowstoneAxe = new ItemAxeFT(TM.glowstone, ItemNames.glowstoneAxe);
    public static final ItemHoeFT glowstoneHoe = new ItemHoeFT(TM.glowstone, ItemNames.glowstoneHoe);
    public static final ItemSwordFT glowstoneSword = new ItemSwordFT(TM.glowstone, ItemNames.glowstoneSword);

    public static final ItemPickaxeFT adamantiumPickaxe = new ItemPickaxeFT(TM.adamantium, ItemNames.adamantiumPickaxe);
    public static final ItemShovelFT adamantiumShovel = new ItemShovelFT(TM.adamantium, ItemNames.adamantiumShovel);
    public static final ItemAxeFT adamantiumAxe = new ItemAxeFT(TM.adamantium, ItemNames.adamantiumAxe);
    public static final ItemHoeFT adamantiumHoe = new ItemHoeFT(TM.adamantium, ItemNames.adamantiumHoe);
    public static final ItemSwordFT adamantiumSword = new ItemSwordFT(TM.adamantium, ItemNames.adamantiumSword);

    public static final ItemPickaxeFT silkPickaxe = new ItemPickaxeFT(TM.silk, ItemNames.silkPickaxe);
    public static final ItemShovelFT silkShovel = new ItemShovelFT(TM.silk, ItemNames.silkShovel);
    public static final ItemAxeFT silkAxe = new ItemAxeFT(TM.silk, ItemNames.silkAxe);
    public static final ItemHoeFT silkHoe = new ItemHoeFT(TM.silk, ItemNames.silkHoe);
    public static final ItemSwordFT silkSword = new ItemSwordFT(TM.silk, ItemNames.silkSword);

    public static final ItemPickaxeFT redstonePickaxe = new ItemPickaxeFT(TM.redstone, ItemNames.redstonePickaxe);
    public static final ItemShovelFT redstoneShovel = new ItemShovelFT(TM.redstone, ItemNames.redstoneShovel);
    public static final ItemAxeFT redstoneAxe = new ItemAxeFT(TM.redstone, ItemNames.redstoneAxe);
    public static final ItemHoeFT redstoneHoe = new ItemHoeFT(TM.redstone, ItemNames.redstoneHoe);
    public static final ItemSwordFT redstoneSword = new ItemSwordFT(TM.redstone, ItemNames.redstoneSword);

    public static final ItemArmorFT quartzHelmet = new ItemArmorQuartz(ArmorType.helmet, ItemNames.quartzHelmet);
    public static final ItemArmorFT quartzChestplate = new ItemArmorQuartz(ArmorType.chestplate, ItemNames.quartzChestplate);
    public static final ItemArmorFT quartzLeggings = new ItemArmorQuartz(ArmorType.leggings, ItemNames.quartzLeggings);
    public static final ItemArmorFT quartzBoots = new ItemArmorQuartz(ArmorType.boots, ItemNames.quartzBoots);

    public static final ItemArmorFT obsidianHelmet = new ItemArmorObsidian(ArmorType.helmet, ItemNames.obsidianHelmet);
    public static final ItemArmorFT obsidianChestplate = new ItemArmorObsidian(ArmorType.chestplate, ItemNames.obsidianChestplate);
    public static final ItemArmorFT obsidianLeggings = new ItemArmorObsidian(ArmorType.leggings, ItemNames.obsidianLeggings);
    public static final ItemArmorFT obsidianBoots = new ItemArmorObsidian(ArmorType.boots, ItemNames.obsidianBoots);

    public static final ItemArmorFT emeraldHelmet = new ItemArmorEmerald(ArmorType.helmet, ItemNames.emeraldHelmet);
    public static final ItemArmorFT emeraldChestplate = new ItemArmorEmerald(ArmorType.chestplate, ItemNames.emeraldChestplate);
    public static final ItemArmorFT emeraldLeggings = new ItemArmorEmerald(ArmorType.leggings, ItemNames.emeraldLeggings);
    public static final ItemArmorFT emeraldBoots = new ItemArmorEmerald(ArmorType.boots, ItemNames.emeraldBoots);

    public static final ItemArmorFT lapisHelmet = new ItemArmorLapis(ArmorType.helmet, ItemNames.lapisHelmet);
    public static final ItemArmorFT lapisChestplate = new ItemArmorLapis(ArmorType.chestplate, ItemNames.lapisChestplate);
    public static final ItemArmorFT lapisLeggings = new ItemArmorLapis(ArmorType.leggings, ItemNames.lapisLeggings);
    public static final ItemArmorFT lapisBoots = new ItemArmorLapis(ArmorType.boots, ItemNames.lapisBoots);

    public static final ItemArmorFT bronzeHelmet = new ItemArmorBronze(ArmorType.helmet, ItemNames.bronzeHelmet);
    public static final ItemArmorFT bronzeChestplate = new ItemArmorBronze(ArmorType.chestplate, ItemNames.bronzeChestplate);
    public static final ItemArmorFT bronzeLeggings = new ItemArmorBronze(ArmorType.leggings, ItemNames.bronzeLeggings);
    public static final ItemArmorFT bronzeBoots = new ItemArmorBronze(ArmorType.boots, ItemNames.bronzeBoots);

    public static final ItemArmorFT coalHelmet = new ItemArmorCoal(ArmorType.helmet, ItemNames.coalHelmet);
    public static final ItemArmorFT coalChestplate = new ItemArmorCoal(ArmorType.chestplate, ItemNames.coalChestplate);
    public static final ItemArmorFT coalLeggings = new ItemArmorCoal(ArmorType.leggings, ItemNames.coalLeggings);
    public static final ItemArmorFT coalBoots = new ItemArmorCoal(ArmorType.boots, ItemNames.coalBoots);

    public static final ItemArmorFT glowstoneHelmet = new ItemArmorGlowstone(ArmorType.helmet, ItemNames.glowstoneHelmet);
    public static final ItemArmorFT glowstoneChestplate = new ItemArmorGlowstone(ArmorType.chestplate, ItemNames.glowstoneChestplate);
    public static final ItemArmorFT glowstoneLeggings = new ItemArmorGlowstone(ArmorType.leggings, ItemNames.glowstoneLeggings);
    public static final ItemArmorFT glowstoneBoots = new ItemArmorGlowstone(ArmorType.boots, ItemNames.glowstoneBoots);

    public static final ItemArmorFT adamantiumHelmet = new ItemArmorAdamantium(ArmorType.helmet, ItemNames.adamantiumHelmet);
    public static final ItemArmorFT adamantiumChestplate = new ItemArmorAdamantium(ArmorType.chestplate, ItemNames.adamantiumChestplate);
    public static final ItemArmorFT adamantiumLeggings = new ItemArmorAdamantium(ArmorType.leggings, ItemNames.adamantiumLeggings);
    public static final ItemArmorFT adamantiumBoots = new ItemArmorAdamantium(ArmorType.boots, ItemNames.adamantiumBoots);

    public static final ItemArmorFT redstoneHelmet = new ItemArmorRedstone(ArmorType.helmet, ItemNames.redstoneHelmet);
    public static final ItemArmorFT redstoneChestplate = new ItemArmorRedstone(ArmorType.chestplate, ItemNames.redstoneChestplate);
    public static final ItemArmorFT redstoneLeggings = new ItemArmorRedstone(ArmorType.leggings, ItemNames.redstoneLeggings);
    public static final ItemArmorFT redstoneBoots = new ItemArmorRedstone(ArmorType.boots, ItemNames.redstoneBoots);

    public static final ItemBowFT bowQuartz = new ItemBowFT(TM.quartz, ItemNames.bowQuartz);
    public static final ItemBowFT bowObsidian = new ItemBowFT(TM.obsidian, ItemNames.bowObsidian);
    public static final ItemBowFT bowEmerald = new ItemBowFT(TM.emerald, ItemNames.bowEmerald);
    public static final ItemBowFT bowLapis = new ItemBowFT(TM.lapis, ItemNames.bowLapis);
    public static final ItemBowFT bowBronze = new ItemBowFT(TM.bronze, ItemNames.bowBronze);
    public static final ItemBowFT bowCoal = new ItemBowFT(TM.coal, ItemNames.bowCoal);
    public static final ItemBowFT bowGlowstone = new ItemBowFT(TM.glowstone, ItemNames.bowGlowstone);
    public static final ItemBowFT bowAdamantium = new ItemBowFT(TM.adamantium, ItemNames.bowAdamantium);
    public static final ItemBowFT bowSilk = new ItemBowFT(TM.silk, ItemNames.bowSilk);
    public static final ItemBowFT bowRedstone = new ItemBowFT(TM.redstone, ItemNames.bowRedstone);

    public static final ItemShearsFT quartzShears = new ItemShearsFT(TM.quartz, ItemNames.quartzShears);
    public static final ItemShearsFT obsidianShears = new ItemShearsFT(TM.obsidian, ItemNames.obsidianShears);
    public static final ItemShearsFT emeraldShears = new ItemShearsFT(TM.emerald, ItemNames.emeraldShears);
    public static final ItemShearsFT lapisShears = new ItemShearsFT(TM.lapis, ItemNames.lapisShears);
    public static final ItemShearsFT bronzeShears = new ItemShearsFT(TM.bronze, ItemNames.bronzeShears);
    public static final ItemShearsFT coalShears = new ItemShearsFT(TM.coal, ItemNames.coalShears);
    public static final ItemShearsFT glowstoneShears = new ItemShearsFT(TM.glowstone, ItemNames.glowstoneShears);
    public static final ItemShearsFT adamantiumShears = new ItemShearsFT(TM.adamantium, ItemNames.adamantiumShears);
    public static final ItemShearsFT silkShears = new ItemShearsFT(TM.silk, ItemNames.silkShears);
    public static final ItemShearsFT redstoneShears = new ItemShearsFT(TM.redstone, ItemNames.redstoneShears);

    public static final ItemMultiFT stickFT = new ItemMultiFT(ItemNames.sticks, ItemNames.stickFT);

    public void register() {
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

        GameRegistry.registerItem(staffExp, ItemNames.staffExp);
        GameRegistry.registerItem(staffExp2, ItemNames.staffExp2);
        GameRegistry.registerItem(staffExp3, ItemNames.staffExp3);

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

        GameRegistry.registerItem(bowQuartz, ItemNames.bowQuartz);
        GameRegistry.registerItem(bowObsidian, ItemNames.bowObsidian);
        GameRegistry.registerItem(bowEmerald, ItemNames.bowEmerald);
        GameRegistry.registerItem(bowLapis, ItemNames.bowLapis);
        GameRegistry.registerItem(bowBronze, ItemNames.bowBronze);
        GameRegistry.registerItem(bowCoal, ItemNames.bowCoal);
        GameRegistry.registerItem(bowGlowstone, ItemNames.bowGlowstone);
        GameRegistry.registerItem(bowAdamantium, ItemNames.bowAdamantium);
        GameRegistry.registerItem(bowSilk, ItemNames.bowSilk);
        GameRegistry.registerItem(bowRedstone, ItemNames.bowRedstone);

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


        registerModels();
        registerVariants();
    }

    private void registerModels() {
        register(ingotObsidian, "fergotools:ingotObsidian");
        register(gemEmerald, "fergotools:gemEmerald");
        register(gemLapis, "fergotools:gemLapis");
        register(ingotBronze, "fergotools:ingotBronze");
        register(ingotCoal, "fergotools:ingotCoal");
        register(ingotGlowstone, "fergotools:ingotGlowstone");
        register(ingotAdamantium, "fergotools:ingotAdamantium");
        register(gemSilk, "fergotools:gemSilk");
        register(gemRedstone, "fergotools:gemRedstone");

        register(gemExp, "fergotools:gemExp");
        register(gemExp2, "fergotools:gemExp2");
        register(gemExp3, "fergotools:gemExp3");

        register(staffExp, "fergotools:staffExp");
        register(staffExp2, "fergotools:staffExp2");
        register(staffExp3, "fergotools:staffExp3");

        register(shardExp, "fergotools:shardExp");
        register(expCollector, "fergotools:expCollector");

        register(quartzPickaxe, "fergotools:quartzPickaxe");
        register(quartzShovel, "fergotools:quartzShovel");
        register(quartzAxe, "fergotools:quartzAxe");
        register(quartzHoe, "fergotools:quartzHoe");
        register(quartzSword, "fergotools:quartzSword");

        register(obsidianPickaxe, "fergotools:obsidianPickaxe");
        register(obsidianShovel, "fergotools:obsidianShovel");
        register(obsidianAxe, "fergotools:obsidianAxe");
        register(obsidianHoe, "fergotools:obsidianHoe");
        register(obsidianSword, "fergotools:obsidianSword");

        register(emeraldPickaxe, "fergotools:emeraldPickaxe");
        register(emeraldShovel, "fergotools:emeraldShovel");
        register(emeraldAxe, "fergotools:emeraldAxe");
        register(emeraldHoe, "fergotools:emeraldHoe");
        register(emeraldSword, "fergotools:emeraldSword");

        register(lapisPickaxe, "fergotools:lapisPickaxe");
        register(lapisShovel, "fergotools:lapisShovel");
        register(lapisAxe, "fergotools:lapisAxe");
        register(lapisHoe, "fergotools:lapisHoe");
        register(lapisSword, "fergotools:lapisSword");

        register(bronzePickaxe, "fergotools:bronzePickaxe");
        register(bronzeShovel, "fergotools:bronzeShovel");
        register(bronzeAxe, "fergotools:bronzeAxe");
        register(bronzeHoe, "fergotools:bronzeHoe");
        register(bronzeSword, "fergotools:bronzeSword");

        register(coalPickaxe, "fergotools:coalPickaxe");
        register(coalShovel, "fergotools:coalShovel");
        register(coalAxe, "fergotools:coalAxe");
        register(coalHoe, "fergotools:coalHoe");
        register(coalSword, "fergotools:coalSword");

        register(glowstonePickaxe, "fergotools:glowstonePickaxe");
        register(glowstoneShovel, "fergotools:glowstoneShovel");
        register(glowstoneAxe, "fergotools:glowstoneAxe");
        register(glowstoneHoe, "fergotools:glowstoneHoe");
        register(glowstoneSword, "fergotools:glowstoneSword");

        register(adamantiumPickaxe, "fergotools:adamantiumPickaxe");
        register(adamantiumShovel, "fergotools:adamantiumShovel");
        register(adamantiumAxe, "fergotools:adamantiumAxe");
        register(adamantiumHoe, "fergotools:adamantiumHoe");
        register(adamantiumSword, "fergotools:adamantiumSword");

        register(silkPickaxe, "fergotools:silkPickaxe");
        register(silkShovel, "fergotools:silkShovel");
        register(silkAxe, "fergotools:silkAxe");
        register(silkHoe, "fergotools:silkHoe");
        register(silkSword, "fergotools:silkSword");

        register(redstonePickaxe, "fergotools:redstonePickaxe");
        register(redstoneShovel, "fergotools:redstoneShovel");
        register(redstoneAxe, "fergotools:redstoneAxe");
        register(redstoneHoe, "fergotools:redstoneHoe");
        register(redstoneSword, "fergotools:redstoneSword");

        register(quartzHelmet, "fergotools:quartzHelmet");
        register(quartzChestplate, "fergotools:quartzChestplate");
        register(quartzLeggings, "fergotools:quartzLeggings");
        register(quartzBoots, "fergotools:quartzBoots");

        register(obsidianHelmet, "fergotools:obsidianHelmet");
        register(obsidianChestplate, "fergotools:obsidianChestplate");
        register(obsidianLeggings, "fergotools:obsidianLeggings");
        register(obsidianBoots, "fergotools:obsidianBoots");

        register(emeraldHelmet, "fergotools:emeraldHelmet");
        register(emeraldChestplate, "fergotools:emeraldChestplate");
        register(emeraldLeggings, "fergotools:emeraldLeggings");
        register(emeraldBoots, "fergotools:emeraldBoots");

        register(lapisHelmet, "fergotools:lapisHelmet");
        register(lapisChestplate, "fergotools:lapisChestplate");
        register(lapisLeggings, "fergotools:lapisLeggings");
        register(lapisBoots, "fergotools:lapisBoots");

        register(bronzeHelmet, "fergotools:bronzeHelmet");
        register(bronzeChestplate, "fergotools:bronzeChestplate");
        register(bronzeLeggings, "fergotools:bronzeLeggings");
        register(bronzeBoots, "fergotools:bronzeBoots");

        register(coalHelmet, "fergotools:coalHelmet");
        register(coalChestplate, "fergotools:coalChestplate");
        register(coalLeggings, "fergotools:coalLeggings");
        register(coalBoots, "fergotools:coalBoots");

        register(glowstoneHelmet, "fergotools:glowstoneHelmet");
        register(glowstoneChestplate, "fergotools:glowstoneChestplate");
        register(glowstoneLeggings, "fergotools:glowstoneLeggings");
        register(glowstoneBoots, "fergotools:glowstoneBoots");

        register(adamantiumHelmet, "fergotools:adamantiumHelmet");
        register(adamantiumChestplate, "fergotools:adamantiumChestplate");
        register(adamantiumLeggings, "fergotools:adamantiumLeggings");
        register(adamantiumBoots, "fergotools:adamantiumBoots");

        register(redstoneHelmet, "fergotools:redstoneHelmet");
        register(redstoneChestplate, "fergotools:redstoneChestplate");
        register(redstoneLeggings, "fergotools:redstoneLeggings");
        register(redstoneBoots, "fergotools:redstoneBoots");

        register(bowQuartz, "fergotools:bowQuartz");
        register(bowObsidian, "fergotools:bowObsidian");
        register(bowEmerald, "fergotools:bowEmerald");
        register(bowLapis, "fergotools:bowLapis");
        register(bowBronze, "fergotools:bowBronze");
        register(bowCoal, "fergotools:bowCoal");
        register(bowGlowstone, "fergotools:bowGlowstone");
        register(bowAdamantium, "fergotools:bowAdamantium");
        register(bowSilk, "fergotools:bowSilk");
        register(bowRedstone, "fergotools:bowRedstone");

        register(quartzShears, "fergotools:quartzShears");
        register(obsidianShears, "fergotools:obsidianShears");
        register(emeraldShears, "fergotools:emeraldShears");
        register(lapisShears, "fergotools:lapisShears");
        register(bronzeShears, "fergotools:bronzeShears");
        register(coalShears, "fergotools:coalShears");
        register(glowstoneShears, "fergotools:glowstoneShears");
        register(adamantiumShears, "fergotools:adamantiumShears");
        register(silkShears, "fergotools:silkShears");
        register(redstoneShears, "fergotools:redstoneShears");

        register(stickFT, 0, "fergotools:stickObsidian");
        register(stickFT, 1, "fergotools:stickEmerald");
        register(stickFT, 2, "fergotools:stickLapis");
        register(stickFT, 3, "fergotools:stickBronze");
        register(stickFT, 4, "fergotools:stickCoal");
        register(stickFT, 5, "fergotools:stickGlowstone");
        register(stickFT, 6, "fergotools:stickAdamantium");
        register(stickFT, 7, "fergotools:stickSilk");
        register(stickFT, 8, "fergotools:stickRedstone");
    }

    private void registerVariants() {
        ModelBakery.addVariantName(ingotObsidian, "fergotools:ingotObsidian");
        ModelBakery.addVariantName(gemEmerald, "fergotools:gemEmerald");
        ModelBakery.addVariantName(gemLapis, "fergotools:gemLapis");
        ModelBakery.addVariantName(ingotBronze, "fergotools:ingotBronze");
        ModelBakery.addVariantName(ingotCoal, "fergotools:ingotCoal");
        ModelBakery.addVariantName(ingotGlowstone, "fergotools:ingotGlowstone");
        ModelBakery.addVariantName(ingotAdamantium, "fergotools:ingotAdamantium");
        ModelBakery.addVariantName(gemSilk, "fergotools:gemSilk");
        ModelBakery.addVariantName(gemRedstone, "fergotools:gemRedstone");

        ModelBakery.addVariantName(gemExp, "fergotools:gemExp");
        ModelBakery.addVariantName(gemExp2, "fergotools:gemExp2");
        ModelBakery.addVariantName(gemExp3, "fergotools:gemExp3");

        ModelBakery.addVariantName(staffExp, "fergotools:staffExp");
        ModelBakery.addVariantName(staffExp2, "fergotools:staffExp2");
        ModelBakery.addVariantName(staffExp3, "fergotools:staffExp3");

        ModelBakery.addVariantName(shardExp, "fergotools:shardExp");
        ModelBakery.addVariantName(expCollector, "fergotools:expCollector");

        ModelBakery.addVariantName(quartzPickaxe, "fergotools:quartzPickaxe");
        ModelBakery.addVariantName(quartzShovel, "fergotools:quartzShovel");
        ModelBakery.addVariantName(quartzAxe, "fergotools:quartzAxe");
        ModelBakery.addVariantName(quartzHoe, "fergotools:quartzHoe");
        ModelBakery.addVariantName(quartzSword, "fergotools:quartzSword");

        ModelBakery.addVariantName(obsidianPickaxe, "fergotools:obsidianPickaxe");
        ModelBakery.addVariantName(obsidianShovel, "fergotools:obsidianShovel");
        ModelBakery.addVariantName(obsidianAxe, "fergotools:obsidianAxe");
        ModelBakery.addVariantName(obsidianHoe, "fergotools:obsidianHoe");
        ModelBakery.addVariantName(obsidianSword, "fergotools:obsidianSword");

        ModelBakery.addVariantName(emeraldPickaxe, "fergotools:emeraldPickaxe");
        ModelBakery.addVariantName(emeraldShovel, "fergotools:emeraldShovel");
        ModelBakery.addVariantName(emeraldAxe, "fergotools:emeraldAxe");
        ModelBakery.addVariantName(emeraldHoe, "fergotools:emeraldHoe");
        ModelBakery.addVariantName(emeraldSword, "fergotools:emeraldSword");

        ModelBakery.addVariantName(lapisPickaxe, "fergotools:lapisPickaxe");
        ModelBakery.addVariantName(lapisShovel, "fergotools:lapisShovel");
        ModelBakery.addVariantName(lapisAxe, "fergotools:lapisAxe");
        ModelBakery.addVariantName(lapisHoe, "fergotools:lapisHoe");
        ModelBakery.addVariantName(lapisSword, "fergotools:lapisSword");

        ModelBakery.addVariantName(bronzePickaxe, "fergotools:bronzePickaxe");
        ModelBakery.addVariantName(bronzeShovel, "fergotools:bronzeShovel");
        ModelBakery.addVariantName(bronzeAxe, "fergotools:bronzeAxe");
        ModelBakery.addVariantName(bronzeHoe, "fergotools:bronzeHoe");
        ModelBakery.addVariantName(bronzeSword, "fergotools:bronzeSword");

        ModelBakery.addVariantName(coalPickaxe, "fergotools:coalPickaxe");
        ModelBakery.addVariantName(coalShovel, "fergotools:coalShovel");
        ModelBakery.addVariantName(coalAxe, "fergotools:coalAxe");
        ModelBakery.addVariantName(coalHoe, "fergotools:coalHoe");
        ModelBakery.addVariantName(coalSword, "fergotools:coalSword");

        ModelBakery.addVariantName(glowstonePickaxe, "fergotools:glowstonePickaxe");
        ModelBakery.addVariantName(glowstoneShovel, "fergotools:glowstoneShovel");
        ModelBakery.addVariantName(glowstoneAxe, "fergotools:glowstoneAxe");
        ModelBakery.addVariantName(glowstoneHoe, "fergotools:glowstoneHoe");
        ModelBakery.addVariantName(glowstoneSword, "fergotools:glowstoneSword");

        ModelBakery.addVariantName(adamantiumPickaxe, "fergotools:adamantiumPickaxe");
        ModelBakery.addVariantName(adamantiumShovel, "fergotools:adamantiumShovel");
        ModelBakery.addVariantName(adamantiumAxe, "fergotools:adamantiumAxe");
        ModelBakery.addVariantName(adamantiumHoe, "fergotools:adamantiumHoe");
        ModelBakery.addVariantName(adamantiumSword, "fergotools:adamantiumSword");

        ModelBakery.addVariantName(silkPickaxe, "fergotools:silkPickaxe");
        ModelBakery.addVariantName(silkShovel, "fergotools:silkShovel");
        ModelBakery.addVariantName(silkAxe, "fergotools:silkAxe");
        ModelBakery.addVariantName(silkHoe, "fergotools:silkHoe");
        ModelBakery.addVariantName(silkSword, "fergotools:silkSword");

        ModelBakery.addVariantName(redstonePickaxe, "fergotools:redstonePickaxe");
        ModelBakery.addVariantName(redstoneShovel, "fergotools:redstoneShovel");
        ModelBakery.addVariantName(redstoneAxe, "fergotools:redstoneAxe");
        ModelBakery.addVariantName(redstoneHoe, "fergotools:redstoneHoe");
        ModelBakery.addVariantName(redstoneSword, "fergotools:redstoneSword");

        ModelBakery.addVariantName(quartzHelmet, "fergotools:quartzHelmet");
        ModelBakery.addVariantName(quartzChestplate, "fergotools:quartzChestplate");
        ModelBakery.addVariantName(quartzLeggings, "fergotools:quartzLeggings");
        ModelBakery.addVariantName(quartzBoots, "fergotools:quartzBoots");

        ModelBakery.addVariantName(obsidianHelmet, "fergotools:obsidianHelmet");
        ModelBakery.addVariantName(obsidianChestplate, "fergotools:obsidianChestplate");
        ModelBakery.addVariantName(obsidianLeggings, "fergotools:obsidianLeggings");
        ModelBakery.addVariantName(obsidianBoots, "fergotools:obsidianBoots");

        ModelBakery.addVariantName(emeraldHelmet, "fergotools:emeraldHelmet");
        ModelBakery.addVariantName(emeraldChestplate, "fergotools:emeraldChestplate");
        ModelBakery.addVariantName(emeraldLeggings, "fergotools:emeraldLeggings");
        ModelBakery.addVariantName(emeraldBoots, "fergotools:emeraldBoots");

        ModelBakery.addVariantName(lapisHelmet, "fergotools:lapisHelmet");
        ModelBakery.addVariantName(lapisChestplate, "fergotools:lapisChestplate");
        ModelBakery.addVariantName(lapisLeggings, "fergotools:lapisLeggings");
        ModelBakery.addVariantName(lapisBoots, "fergotools:lapisBoots");

        ModelBakery.addVariantName(bronzeHelmet, "fergotools:bronzeHelmet");
        ModelBakery.addVariantName(bronzeChestplate, "fergotools:bronzeChestplate");
        ModelBakery.addVariantName(bronzeLeggings, "fergotools:bronzeLeggings");
        ModelBakery.addVariantName(bronzeBoots, "fergotools:bronzeBoots");

        ModelBakery.addVariantName(coalHelmet, "fergotools:coalHelmet");
        ModelBakery.addVariantName(coalChestplate, "fergotools:coalChestplate");
        ModelBakery.addVariantName(coalLeggings, "fergotools:coalLeggings");
        ModelBakery.addVariantName(coalBoots, "fergotools:coalBoots");

        ModelBakery.addVariantName(glowstoneHelmet, "fergotools:glowstoneHelmet");
        ModelBakery.addVariantName(glowstoneChestplate, "fergotools:glowstoneChestplate");
        ModelBakery.addVariantName(glowstoneLeggings, "fergotools:glowstoneLeggings");
        ModelBakery.addVariantName(glowstoneBoots, "fergotools:glowstoneBoots");

        ModelBakery.addVariantName(adamantiumHelmet, "fergotools:adamantiumHelmet");
        ModelBakery.addVariantName(adamantiumChestplate, "fergotools:adamantiumChestplate");
        ModelBakery.addVariantName(adamantiumLeggings, "fergotools:adamantiumLeggings");
        ModelBakery.addVariantName(adamantiumBoots, "fergotools:adamantiumBoots");

        ModelBakery.addVariantName(redstoneHelmet, "fergotools:redstoneHelmet");
        ModelBakery.addVariantName(redstoneChestplate, "fergotools:redstoneChestplate");
        ModelBakery.addVariantName(redstoneLeggings, "fergotools:redstoneLeggings");
        ModelBakery.addVariantName(redstoneBoots, "fergotools:redstoneBoots");

        ModelBakery.addVariantName(bowQuartz, "fergotools:bowQuartz");
        ModelBakery.addVariantName(bowObsidian, "fergotools:bowObsidian");
        ModelBakery.addVariantName(bowEmerald, "fergotools:bowEmerald");
        ModelBakery.addVariantName(bowLapis, "fergotools:bowLapis");
        ModelBakery.addVariantName(bowBronze, "fergotools:bowBronze");
        ModelBakery.addVariantName(bowCoal, "fergotools:bowCoal");
        ModelBakery.addVariantName(bowGlowstone, "fergotools:bowGlowstone");
        ModelBakery.addVariantName(bowAdamantium, "fergotools:bowAdamantium");
        ModelBakery.addVariantName(bowSilk, "fergotools:bowSilk");
        ModelBakery.addVariantName(bowRedstone, "fergotools:bowRedstone");

        ModelBakery.addVariantName(quartzShears, "fergotools:quartzShears");
        ModelBakery.addVariantName(obsidianShears, "fergotools:obsidianShears");
        ModelBakery.addVariantName(emeraldShears, "fergotools:emeraldShears");
        ModelBakery.addVariantName(lapisShears, "fergotools:lapisShears");
        ModelBakery.addVariantName(bronzeShears, "fergotools:bronzeShears");
        ModelBakery.addVariantName(coalShears, "fergotools:coalShears");
        ModelBakery.addVariantName(glowstoneShears, "fergotools:glowstoneShears");
        ModelBakery.addVariantName(adamantiumShears, "fergotools:adamantiumShears");
        ModelBakery.addVariantName(silkShears, "fergotools:silkShears");
        ModelBakery.addVariantName(redstoneShears, "fergotools:redstoneShears");

        ModelBakery.addVariantName(stickFT, "fergotools:stickObsidian");
        ModelBakery.addVariantName(stickFT, "fergotools:stickEmerald");
        ModelBakery.addVariantName(stickFT, "fergotools:stickLapis");
        ModelBakery.addVariantName(stickFT, "fergotools:stickBronze");
        ModelBakery.addVariantName(stickFT, "fergotools:stickCoal");
        ModelBakery.addVariantName(stickFT, "fergotools:stickGlowstone");
        ModelBakery.addVariantName(stickFT, "fergotools:stickAdamantium");
        ModelBakery.addVariantName(stickFT, "fergotools:stickSilk");
        ModelBakery.addVariantName(stickFT, "fergotools:stickRedstone");
    }

    public static void register(Item item, int meta, String model) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(model, "inventory"));
    }

    public static void register(Item item, String model) {
        register(item, 0, model);
    }
}
