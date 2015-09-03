package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.common.items.ItemExpCollector;
import io.github.fergoman123.fergotools.common.items.ItemExpShard;
import io.github.fergoman123.fergotools.item.*;
import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
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
        ItemFT[] items = new ItemFT[]{ingotObsidian, gemEmerald, gemLapis, ingotBronze, ingotCoal, ingotGlowstone, ingotAdamantium, gemSilk, gemRedstone};

        for(ItemFT item : items) {
            GameRegistry.registerItem(item, item.getName());
            RegisterHelper.getModelMesher().register(item, 0, createModel(item.getName()));
            ModelBakery.addVariantName(item, createVariant(item.getName()));
        }

        ItemFT[] expGems = new ItemFT[]{gemExp, gemExp2, gemExp3};

        for(ItemFT item : expGems){
            GameRegistry.registerItem(item, item.getName());
            RegisterHelper.getModelMesher().register(item, 0, createModel(item.getName()));
            ModelBakery.addVariantName(item, createVariant(item.getName()));
        }

        ItemFT[] expStaffs = new ItemFT[]{staffExp, staffExp2, staffExp3};

        for(ItemFT item : expStaffs){
            GameRegistry.registerItem(item, item.getName());
            RegisterHelper.getModelMesher().register(item, 0, createModel(item.getName()));
            ModelBakery.addVariantName(item, createVariant(item.getName()));
        }

        GameRegistry.registerItem(quartzPickaxe, quartzPickaxe.getName());
        GameRegistry.registerItem(quartzShovel, quartzShovel.getName());
        GameRegistry.registerItem(quartzAxe, quartzAxe.getName());
        GameRegistry.registerItem(quartzHoe, quartzHoe.getName());
        GameRegistry.registerItem(quartzSword, quartzSword.getName());
        RegisterHelper.getModelMesher().register(quartzPickaxe, 0, createModel(quartzPickaxe.getName()));
        RegisterHelper.getModelMesher().register(quartzShovel, 0, createModel(quartzShovel.getName()));
        RegisterHelper.getModelMesher().register(quartzAxe, 0, createModel(quartzAxe.getName()));
        RegisterHelper.getModelMesher().register(quartzHoe, 0, createModel(quartzHoe.getName()));
        RegisterHelper.getModelMesher().register(quartzSword, 0, createModel(quartzSword.getName()));
        ModelBakery.addVariantName(quartzPickaxe, createVariant(quartzPickaxe.getName()));
        ModelBakery.addVariantName(quartzShovel, createVariant(quartzShovel.getName()));
        ModelBakery.addVariantName(quartzAxe, createVariant(quartzAxe.getName()));
        ModelBakery.addVariantName(quartzHoe, createVariant(quartzHoe.getName()));
        ModelBakery.addVariantName(quartzSword, createVariant(quartzSword.getName()));

        GameRegistry.registerItem(obsidianPickaxe, obsidianPickaxe.getName());
        GameRegistry.registerItem(obsidianShovel, obsidianShovel.getName());
        GameRegistry.registerItem(obsidianAxe, obsidianAxe.getName());
        GameRegistry.registerItem(obsidianHoe, obsidianHoe.getName());
        GameRegistry.registerItem(obsidianSword, obsidianSword.getName());
        RegisterHelper.getModelMesher().register(obsidianPickaxe, 0, createModel(obsidianPickaxe.getName()));
        RegisterHelper.getModelMesher().register(obsidianShovel, 0, createModel(obsidianShovel.getName()));
        RegisterHelper.getModelMesher().register(obsidianAxe, 0, createModel(obsidianAxe.getName()));
        RegisterHelper.getModelMesher().register(obsidianHoe, 0, createModel(obsidianHoe.getName()));
        RegisterHelper.getModelMesher().register(obsidianSword, 0, createModel(obsidianSword.getName()));
        ModelBakery.addVariantName(obsidianPickaxe, createVariant(obsidianPickaxe.getName()));
        ModelBakery.addVariantName(obsidianShovel, createVariant(obsidianShovel.getName()));
        ModelBakery.addVariantName(obsidianAxe, createVariant(obsidianAxe.getName()));
        ModelBakery.addVariantName(obsidianHoe, createVariant(obsidianHoe.getName()));
        ModelBakery.addVariantName(obsidianSword, createVariant(obsidianSword.getName()));

        GameRegistry.registerItem(emeraldPickaxe, emeraldPickaxe.getName());
        GameRegistry.registerItem(emeraldShovel, emeraldShovel.getName());
        GameRegistry.registerItem(emeraldAxe, emeraldAxe.getName());
        GameRegistry.registerItem(emeraldHoe, emeraldHoe.getName());
        GameRegistry.registerItem(emeraldSword, emeraldSword.getName());
        RegisterHelper.getModelMesher().register(emeraldPickaxe, 0, createModel(emeraldPickaxe.getName()));
        RegisterHelper.getModelMesher().register(emeraldShovel, 0, createModel(emeraldShovel.getName()));
        RegisterHelper.getModelMesher().register(emeraldAxe, 0, createModel(emeraldAxe.getName()));
        RegisterHelper.getModelMesher().register(emeraldHoe, 0, createModel(emeraldHoe.getName()));
        RegisterHelper.getModelMesher().register(emeraldSword, 0, createModel(emeraldSword.getName()));
        ModelBakery.addVariantName(emeraldPickaxe, createVariant(emeraldPickaxe.getName()));
        ModelBakery.addVariantName(emeraldShovel, createVariant(emeraldShovel.getName()));
        ModelBakery.addVariantName(emeraldAxe, createVariant(emeraldAxe.getName()));
        ModelBakery.addVariantName(emeraldHoe, createVariant(emeraldHoe.getName()));
        ModelBakery.addVariantName(emeraldSword, createVariant(emeraldSword.getName()));

        GameRegistry.registerItem(lapisPickaxe, lapisPickaxe.getName());
        GameRegistry.registerItem(lapisShovel, lapisShovel.getName());
        GameRegistry.registerItem(lapisAxe, lapisAxe.getName());
        GameRegistry.registerItem(lapisHoe, lapisHoe.getName());
        GameRegistry.registerItem(lapisSword, lapisSword.getName());
        RegisterHelper.getModelMesher().register(lapisPickaxe, 0, createModel(lapisPickaxe.getName()));
        RegisterHelper.getModelMesher().register(lapisShovel, 0, createModel(lapisShovel.getName()));
        RegisterHelper.getModelMesher().register(lapisAxe, 0, createModel(lapisAxe.getName()));
        RegisterHelper.getModelMesher().register(lapisHoe, 0, createModel(lapisHoe.getName()));
        RegisterHelper.getModelMesher().register(lapisSword, 0, createModel(lapisSword.getName()));
        ModelBakery.addVariantName(lapisPickaxe, createVariant(lapisPickaxe.getName()));
        ModelBakery.addVariantName(lapisShovel, createVariant(lapisShovel.getName()));
        ModelBakery.addVariantName(lapisAxe, createVariant(lapisAxe.getName()));
        ModelBakery.addVariantName(lapisHoe, createVariant(lapisHoe.getName()));
        ModelBakery.addVariantName(lapisSword, createVariant(lapisSword.getName()));

        GameRegistry.registerItem(bronzePickaxe, bronzePickaxe.getName());
        GameRegistry.registerItem(bronzeShovel, bronzeShovel.getName());
        GameRegistry.registerItem(bronzeAxe, bronzeAxe.getName());
        GameRegistry.registerItem(bronzeHoe, bronzeHoe.getName());
        GameRegistry.registerItem(bronzeSword, bronzeSword.getName());
        RegisterHelper.getModelMesher().register(bronzePickaxe, 0, createModel(bronzePickaxe.getName()));
        RegisterHelper.getModelMesher().register(bronzeShovel, 0, createModel(bronzeShovel.getName()));
        RegisterHelper.getModelMesher().register(bronzeAxe, 0, createModel(bronzeAxe.getName()));
        RegisterHelper.getModelMesher().register(bronzeHoe, 0, createModel(bronzeHoe.getName()));
        RegisterHelper.getModelMesher().register(bronzeSword, 0, createModel(bronzeSword.getName()));
        ModelBakery.addVariantName(bronzePickaxe, createVariant(bronzePickaxe.getName()));
        ModelBakery.addVariantName(bronzeShovel, createVariant(bronzeShovel.getName()));
        ModelBakery.addVariantName(bronzeAxe, createVariant(bronzeAxe.getName()));
        ModelBakery.addVariantName(bronzeHoe, createVariant(bronzeHoe.getName()));
        ModelBakery.addVariantName(bronzeSword, createVariant(bronzeSword.getName()));

        GameRegistry.registerItem(coalPickaxe, coalPickaxe.getName());
        GameRegistry.registerItem(coalShovel, coalShovel.getName());
        GameRegistry.registerItem(coalAxe, coalAxe.getName());
        GameRegistry.registerItem(coalHoe, coalHoe.getName());
        GameRegistry.registerItem(coalSword, coalSword.getName());
        RegisterHelper.getModelMesher().register(coalPickaxe, 0, createModel(coalPickaxe.getName()));
        RegisterHelper.getModelMesher().register(coalShovel, 0, createModel(coalShovel.getName()));
        RegisterHelper.getModelMesher().register(coalAxe, 0, createModel(coalAxe.getName()));
        RegisterHelper.getModelMesher().register(coalHoe, 0, createModel(coalHoe.getName()));
        RegisterHelper.getModelMesher().register(coalSword, 0, createModel(coalSword.getName()));
        ModelBakery.addVariantName(coalPickaxe, createVariant(coalPickaxe.getName()));
        ModelBakery.addVariantName(coalShovel, createVariant(coalShovel.getName()));
        ModelBakery.addVariantName(coalAxe, createVariant(coalAxe.getName()));
        ModelBakery.addVariantName(coalHoe, createVariant(coalHoe.getName()));
        ModelBakery.addVariantName(coalSword, createVariant(coalSword.getName()));

        GameRegistry.registerItem(glowstonePickaxe, glowstonePickaxe.getName());
        GameRegistry.registerItem(glowstoneShovel, glowstoneShovel.getName());
        GameRegistry.registerItem(glowstoneAxe, glowstoneAxe.getName());
        GameRegistry.registerItem(glowstoneHoe, glowstoneHoe.getName());
        GameRegistry.registerItem(glowstoneSword, glowstoneSword.getName());
        RegisterHelper.getModelMesher().register(glowstonePickaxe, 0, createModel(glowstonePickaxe.getName()));
        RegisterHelper.getModelMesher().register(glowstoneShovel, 0, createModel(glowstoneShovel.getName()));
        RegisterHelper.getModelMesher().register(glowstoneAxe, 0, createModel(glowstoneAxe.getName()));
        RegisterHelper.getModelMesher().register(glowstoneHoe, 0, createModel(glowstoneHoe.getName()));
        RegisterHelper.getModelMesher().register(glowstoneSword, 0, createModel(glowstoneSword.getName()));
        ModelBakery.addVariantName(glowstonePickaxe, createVariant(glowstonePickaxe.getName()));
        ModelBakery.addVariantName(glowstoneShovel, createVariant(glowstoneShovel.getName()));
        ModelBakery.addVariantName(glowstoneAxe, createVariant(glowstoneAxe.getName()));
        ModelBakery.addVariantName(glowstoneHoe, createVariant(glowstoneHoe.getName()));
        ModelBakery.addVariantName(glowstoneSword, createVariant(glowstoneSword.getName()));

        GameRegistry.registerItem(adamantiumPickaxe, adamantiumPickaxe.getName());
        GameRegistry.registerItem(adamantiumShovel, adamantiumShovel.getName());
        GameRegistry.registerItem(adamantiumAxe, adamantiumAxe.getName());
        GameRegistry.registerItem(adamantiumHoe, adamantiumHoe.getName());
        GameRegistry.registerItem(adamantiumSword, adamantiumSword.getName());
        RegisterHelper.getModelMesher().register(adamantiumPickaxe, 0, createModel(adamantiumPickaxe.getName()));
        RegisterHelper.getModelMesher().register(adamantiumShovel, 0, createModel(adamantiumShovel.getName()));
        RegisterHelper.getModelMesher().register(adamantiumAxe, 0, createModel(adamantiumAxe.getName()));
        RegisterHelper.getModelMesher().register(adamantiumHoe, 0, createModel(adamantiumHoe.getName()));
        RegisterHelper.getModelMesher().register(adamantiumSword, 0, createModel(adamantiumSword.getName()));
        ModelBakery.addVariantName(adamantiumPickaxe, createVariant(adamantiumPickaxe.getName()));
        ModelBakery.addVariantName(adamantiumShovel, createVariant(adamantiumShovel.getName()));
        ModelBakery.addVariantName(adamantiumAxe, createVariant(adamantiumAxe.getName()));
        ModelBakery.addVariantName(adamantiumHoe, createVariant(adamantiumHoe.getName()));
        ModelBakery.addVariantName(adamantiumSword, createVariant(adamantiumSword.getName()));

        GameRegistry.registerItem(silkPickaxe, silkPickaxe.getName());
        GameRegistry.registerItem(silkShovel, silkShovel.getName());
        GameRegistry.registerItem(silkAxe, silkAxe.getName());
        GameRegistry.registerItem(silkHoe, silkHoe.getName());
        GameRegistry.registerItem(silkSword, silkSword.getName());
        RegisterHelper.getModelMesher().register(silkPickaxe, 0, createModel(silkPickaxe.getName()));
        RegisterHelper.getModelMesher().register(silkShovel, 0, createModel(silkShovel.getName()));
        RegisterHelper.getModelMesher().register(silkAxe, 0, createModel(silkAxe.getName()));
        RegisterHelper.getModelMesher().register(silkHoe, 0, createModel(silkHoe.getName()));
        RegisterHelper.getModelMesher().register(silkSword, 0, createModel(silkSword.getName()));
        ModelBakery.addVariantName(silkPickaxe, createVariant(silkPickaxe.getName()));
        ModelBakery.addVariantName(silkShovel, createVariant(silkShovel.getName()));
        ModelBakery.addVariantName(silkAxe, createVariant(silkAxe.getName()));
        ModelBakery.addVariantName(silkHoe, createVariant(silkHoe.getName()));
        ModelBakery.addVariantName(silkSword, createVariant(silkSword.getName()));

        GameRegistry.registerItem(redstonePickaxe, redstonePickaxe.getName());
        GameRegistry.registerItem(redstoneShovel, redstoneShovel.getName());
        GameRegistry.registerItem(redstoneAxe, redstoneAxe.getName());
        GameRegistry.registerItem(redstoneHoe, redstoneHoe.getName());
        GameRegistry.registerItem(redstoneSword, redstoneSword.getName());
        RegisterHelper.getModelMesher().register(redstonePickaxe, 0, createModel(redstonePickaxe.getName()));
        RegisterHelper.getModelMesher().register(redstoneShovel, 0, createModel(redstoneShovel.getName()));
        RegisterHelper.getModelMesher().register(redstoneAxe, 0, createModel(redstoneAxe.getName()));
        RegisterHelper.getModelMesher().register(redstoneHoe, 0, createModel(redstoneHoe.getName()));
        RegisterHelper.getModelMesher().register(redstoneSword, 0, createModel(redstoneSword.getName()));
        ModelBakery.addVariantName(redstonePickaxe, createVariant(redstonePickaxe.getName()));
        ModelBakery.addVariantName(redstoneShovel, createVariant(redstoneShovel.getName()));
        ModelBakery.addVariantName(redstoneAxe, createVariant(redstoneAxe.getName()));
        ModelBakery.addVariantName(redstoneHoe, createVariant(redstoneHoe.getName()));
        ModelBakery.addVariantName(redstoneSword, createVariant(redstoneSword.getName()));


        

        lapisHelmet.register();
        quartzChestplate.register();
        quartzLeggings.register();
        quartzBoots.register();

        obsidianHelmet.register();
        obsidianChestplate.register();
        obsidianLeggings.register();
        obsidianBoots.register();

        emeraldHelmet.register();
        emeraldChestplate.register();
        emeraldLeggings.register();
        emeraldBoots.register();

        lapisHelmet.register();
        lapisChestplate.register();
        lapisLeggings.register();
        lapisBoots.register();

        bronzeHelmet.register();
        bronzeChestplate.register();
        bronzeLeggings.register();
        bronzeBoots.register();

        coalHelmet.register();
        coalChestplate.register();
        coalLeggings.register();
        coalBoots.register();

        glowstoneHelmet.register();
        glowstoneChestplate.register();
        glowstoneLeggings.register();
        glowstoneBoots.register();

        adamantiumHelmet.register();
        adamantiumChestplate.register();
        adamantiumLeggings.register();
        adamantiumBoots.register();

        redstoneHelmet.register();
        redstoneChestplate.register();
        redstoneLeggings.register();
        redstoneBoots.register();

        ItemBowFT[] bows = new ItemBowFT[]{bowObsidian, bowEmerald, bowLapis, bowBronze, bowCoal, bowGlowstone, bowAdamantium, bowSilk, bowRedstone};

        for(ItemBowFT item : bows){
            GameRegistry.registerItem(item, item.getName());
            RegisterHelper.getModelMesher().register(item, 0, createModel(item.getName()));
        }

        ItemShearsFT[] shears = new ItemShearsFT[]{quartzShears, obsidianShears, emeraldShears, lapisShears, bronzeShears, coalShears, glowstoneShears, adamantiumShears, silkShears, redstoneShears};

        for(ItemShearsFT item : shears){
            GameRegistry.registerItem(item, item.getName());
            RegisterHelper.getModelMesher().register(item, 0, createModel(item.getName()));
            ModelBakery.addVariantName(item, createVariant(item.getName()));
        }

        for (int i = 0; i < stickFT.getSubNames().length; i++) {
            GameRegistry.registerItem(stickFT, stickFT.getName());
            RegisterHelper.getModelMesher().register(stickFT, i, createModel(stickFT.getSubNames()[i]));
            ModelBakery.addVariantName(stickFT, stickFT.getSubNames()[i]);
        }
    }

    private static ModelResourceLocation createModel(String model){
        return new ModelResourceLocation("fergotools:" + model, "inventory");
    }

    public static String createVariant(String model){
        return "fergotools:" + model;
    }
}
