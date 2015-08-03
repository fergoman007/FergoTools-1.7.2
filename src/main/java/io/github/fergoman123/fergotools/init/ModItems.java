package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.common.items.ItemExpCollector;
import io.github.fergoman123.fergotools.common.items.ItemExpShard;
import io.github.fergoman123.fergotools.item.*;
import io.github.fergoman123.fergotools.model.ModelResLocFT;
import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
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
    public static final ItemArmorFT lapisBoots = new ItemArmorLapis(ArmorType.boots, ItemNames.lapisBoots;

    public static final ItemArmorFT bronzeHelmet = new ItemArmorBronze(ArmorType.helmet, ItemNames.bronzeHelmet);
    public static final ItemArmorFT bronzeChestplate = new ItemArmorBronze(ArmorType.chestplate, ItemNames.bronzeChestplate);
    public static final ItemArmorFT bronzeLeggings = new ItemArmorBronze(ArmorType.leggings, ItemNames.bronzeLeggings);
    public static final ItemArmorFT bronzeBoots = new ItemArmorBronze(ArmorType.boots, ItemNames.bronzeBoots);

    public static final ItemArmorFT coalHelmet;
    public static final ItemArmorFT coalChestplate;
    public static final ItemArmorFT coalLeggings;
    public static final ItemArmorFT coalBoots;

    public static final ItemArmorFT glowstoneHelmet;
    public static final ItemArmorFT glowstoneChestplate;
    public static final ItemArmorFT glowstoneLeggings;
    public static final ItemArmorFT glowstoneBoots;

    public static final ItemArmorFT adamantiumHelmet;
    public static final ItemArmorFT adamantiumChestplate;
    public static final ItemArmorFT adamantiumLeggings;
    public static final ItemArmorFT adamantiumBoots;

    public static final ItemArmorFT redstoneHelmet;
    public static final ItemArmorFT redstoneChestplate;
    public static final ItemArmorFT redstoneLeggings;
    public static final ItemArmorFT redstoneBoots;

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
    }

    public static void registerModels() {
        register(ingotObsidian, new ModelResLocFT(ItemNames.ingotObsidian));
        register(gemEmerald, new ModelResLocFT(ItemNames.gemEmerald));
        register(gemLapis, new ModelResLocFT(ItemNames.gemLapis));
        register(ingotBronze, new ModelResLocFT(ItemNames.ingotBronze));
        register(ingotCoal, new ModelResLocFT(ItemNames.ingotCoal));
        register(ingotGlowstone, new ModelResLocFT(ItemNames.ingotGlowstone));
        register(ingotAdamantium, new ModelResLocFT(ItemNames.ingotAdamantium));
        register(gemSilk, new ModelResLocFT(ItemNames.gemSilk));
        register(gemRedstone, new ModelResLocFT(ItemNames.gemRedstone));

        register(gemExp, new ModelResLocFT(ItemNames.gemExp));
        register(gemExp2, new ModelResLocFT(ItemNames.gemExp2));
        register(gemExp3, new ModelResLocFT(ItemNames.gemExp3));

        for (int i = 0; i < ItemNames.staffExpVariants.length; i++) {
            Item[] staffs = new Item[]{staffExp, staffExp2, staffExp3};
            register(staffs[i], new ModelResLocFT(ItemNames.staffExpVariants[i]));
        }

        register(shardExp, new ModelResLocFT(ItemNames.shardExp));
        register(expCollector, new ModelResLocFT(ItemNames.expCollector));

        register(quartzPickaxe, new ModelResLocFT(ItemNames.quartzPickaxe));
        register(quartzShovel, new ModelResLocFT(ItemNames.quartzShovel));
        register(quartzAxe, new ModelResLocFT(ItemNames.quartzAxe));
        register(quartzHoe, new ModelResLocFT(ItemNames.quartzHoe));
        register(quartzSword, new ModelResLocFT(ItemNames.quartzSword));

        register(obsidianPickaxe, new ModelResLocFT(ItemNames.obsidianPickaxe));
        register(obsidianShovel, new ModelResLocFT(ItemNames.obsidianShovel));
        register(obsidianAxe, new ModelResLocFT(ItemNames.obsidianAxe));
        register(obsidianHoe, new ModelResLocFT(ItemNames.obsidianHoe));
        register(obsidianSword, new ModelResLocFT(ItemNames.obsidianSword));

        register(emeraldPickaxe, new ModelResLocFT(ItemNames.emeraldPickaxe));
        register(emeraldShovel, new ModelResLocFT(ItemNames.emeraldShovel));
        register(emeraldAxe, new ModelResLocFT(ItemNames.emeraldAxe));
        register(emeraldHoe, new ModelResLocFT(ItemNames.emeraldHoe));
        register(emeraldSword, new ModelResLocFT(ItemNames.emeraldSword));

        register(lapisPickaxe, new ModelResLocFT(ItemNames.lapisPickaxe));
        register(lapisShovel, new ModelResLocFT(ItemNames.lapisShovel));
        register(lapisAxe, new ModelResLocFT(ItemNames.lapisAxe));
        register(lapisHoe, new ModelResLocFT(ItemNames.lapisHoe));
        register(lapisSword, new ModelResLocFT(ItemNames.lapisSword));

        register(bronzePickaxe, new ModelResLocFT(ItemNames.bronzePickaxe));
        register(bronzeShovel, new ModelResLocFT(ItemNames.bronzeShovel));
        register(bronzeAxe, new ModelResLocFT(ItemNames.bronzeAxe));
        register(bronzeHoe, new ModelResLocFT(ItemNames.bronzeHoe));
        register(bronzeSword, new ModelResLocFT(ItemNames.bronzeSword));

        register(coalPickaxe, new ModelResLocFT(ItemNames.coalPickaxe));
        register(coalShovel, new ModelResLocFT(ItemNames.coalShovel));
        register(coalAxe, new ModelResLocFT(ItemNames.coalAxe));
        register(coalHoe, new ModelResLocFT(ItemNames.coalHoe));
        register(coalSword, new ModelResLocFT(ItemNames.coalSword));

        register(glowstonePickaxe, new ModelResLocFT(ItemNames.glowstonePickaxe));
        register(glowstoneShovel, new ModelResLocFT(ItemNames.glowstoneShovel));
        register(glowstoneAxe, new ModelResLocFT(ItemNames.glowstoneAxe));
        register(glowstoneHoe, new ModelResLocFT(ItemNames.glowstoneHoe));
        register(glowstoneSword, new ModelResLocFT(ItemNames.glowstoneSword));

        register(adamantiumPickaxe, new ModelResLocFT(ItemNames.adamantiumPickaxe));
        register(adamantiumShovel, new ModelResLocFT(ItemNames.adamantiumShovel));
        register(adamantiumAxe, new ModelResLocFT(ItemNames.adamantiumAxe));
        register(adamantiumHoe, new ModelResLocFT(ItemNames.adamantiumHoe));
        register(adamantiumSword, new ModelResLocFT(ItemNames.adamantiumSword));

        register(silkPickaxe, new ModelResLocFT(ItemNames.silkPickaxe));
        register(silkShovel, new ModelResLocFT(ItemNames.silkShovel));
        register(silkAxe, new ModelResLocFT(ItemNames.silkAxe));
        register(silkHoe, new ModelResLocFT(ItemNames.silkHoe));
        register(silkSword, new ModelResLocFT(ItemNames.silkSword));

        register(redstonePickaxe, new ModelResLocFT(ItemNames.redstonePickaxe));
        register(redstoneShovel, new ModelResLocFT(ItemNames.redstoneShovel));
        register(redstoneAxe, new ModelResLocFT(ItemNames.redstoneAxe));
        register(redstoneHoe, new ModelResLocFT(ItemNames.redstoneHoe));
        register(redstoneSword, new ModelResLocFT(ItemNames.redstoneSword));

        register(quartzHelmet, new ModelResLocFT(ItemNames.quartzHelmet));
        register(quartzChestplate, new ModelResLocFT(ItemNames.quartzChestplate));
        register(quartzLeggings, new ModelResLocFT(ItemNames.quartzLeggings));
        register(quartzBoots, new ModelResLocFT(ItemNames.quartzBoots));

        register(obsidianHelmet, new ModelResLocFT(ItemNames.obsidianHelmet));
        register(obsidianChestplate, new ModelResLocFT(ItemNames.obsidianChestplate));
        register(obsidianLeggings, new ModelResLocFT(ItemNames.obsidianLeggings));
        register(obsidianBoots, new ModelResLocFT(ItemNames.obsidianBoots));

        register(emeraldHelmet, new ModelResLocFT(ItemNames.emeraldHelmet));
        register(emeraldChestplate, new ModelResLocFT(ItemNames.emeraldChestplate));
        register(emeraldLeggings, new ModelResLocFT(ItemNames.emeraldLeggings));
        register(emeraldBoots, new ModelResLocFT(ItemNames.emeraldBoots));

        register(lapisHelmet, new ModelResLocFT(ItemNames.lapisHelmet));
        register(lapisChestplate, new ModelResLocFT(ItemNames.lapisChestplate));
        register(lapisLeggings, new ModelResLocFT(ItemNames.lapisLeggings));
        register(lapisBoots, new ModelResLocFT(ItemNames.lapisBoots));

        register(bronzeHelmet, new ModelResLocFT(ItemNames.bronzeHelmet));
        register(bronzeChestplate, new ModelResLocFT(ItemNames.bronzeChestplate));
        register(bronzeLeggings, new ModelResLocFT(ItemNames.bronzeLeggings));
        register(bronzeBoots, new ModelResLocFT(ItemNames.bronzeBoots));

        register(coalHelmet, new ModelResLocFT(ItemNames.coalHelmet));
        register(coalChestplate, new ModelResLocFT(ItemNames.coalChestplate));
        register(coalLeggings, new ModelResLocFT(ItemNames.coalLeggings));
        register(coalBoots, new ModelResLocFT(ItemNames.coalBoots));

        register(glowstoneHelmet, new ModelResLocFT(ItemNames.glowstoneHelmet));
        register(glowstoneChestplate, new ModelResLocFT(ItemNames.glowstoneChestplate));
        register(glowstoneLeggings, new ModelResLocFT(ItemNames.glowstoneLeggings));
        register(glowstoneBoots, new ModelResLocFT(ItemNames.glowstoneBoots));

        register(adamantiumHelmet, new ModelResLocFT(ItemNames.adamantiumHelmet));
        register(adamantiumChestplate, new ModelResLocFT(ItemNames.adamantiumChestplate));
        register(adamantiumLeggings, new ModelResLocFT(ItemNames.adamantiumLeggings));
        register(adamantiumBoots, new ModelResLocFT(ItemNames.adamantiumBoots));

        register(redstoneHelmet, new ModelResLocFT(ItemNames.redstoneHelmet));
        register(redstoneChestplate, new ModelResLocFT(ItemNames.redstoneChestplate));
        register(redstoneLeggings, new ModelResLocFT(ItemNames.redstoneLeggings));
        register(redstoneBoots, new ModelResLocFT(ItemNames.redstoneBoots));
    }

    private static void registerVariants(){
        addVariant();
    }

    public static void register(Item item, int meta, ModelResourceLocation model){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, model);
    }

    public static void register(Item item, ModelResourceLocation model){
        register(item, 0, model);
    }

    public static void addVariant(Item item, String variant){
        ModelBakery.addVariantName(item, "fergotools:" + variant);
    }
}
