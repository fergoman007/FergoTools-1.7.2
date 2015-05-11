package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.base.*;
import io.github.fergoman123.fergotools.common.items.ItemExpShard;
import io.github.fergoman123.fergotools.common.items.ItemStaffExp;
import io.github.fergoman123.fergotools.common.items.ItemStaffExp2;
import io.github.fergoman123.fergotools.common.items.ItemStaffExp3;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.VariantNameFT;
import io.github.fergoman123.fergotools.util.item.AM;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemShearsFT;
import io.github.fergoman123.fergoutil.item.ArmorType;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

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

    public static Item quartzPickaxe;
    public static Item quartzShovel;
    public static Item quartzAxe;
    public static Item quartzHoe;
    public static Item quartzSword;

    public static Item obsidianPickaxe;
    public static Item obsidianShovel;
    public static Item obsidianAxe;
    public static Item obsidianHoe;
    public static Item obsidianSword;

    public static Item emeraldPickaxe;
    public static Item emeraldShovel;
    public static Item emeraldAxe;
    public static Item emeraldHoe;
    public static Item emeraldSword;

    public static Item lapisPickaxe;
    public static Item lapisShovel;
    public static Item lapisAxe;
    public static Item lapisHoe;
    public static Item lapisSword;

    public static Item bronzePickaxe;
    public static Item bronzeShovel;
    public static Item bronzeAxe;
    public static Item bronzeHoe;
    public static Item bronzeSword;

    public static Item coalPickaxe;
    public static Item coalShovel;
    public static Item coalAxe;
    public static Item coalHoe;
    public static Item coalSword;

    public static Item glowstonePickaxe;
    public static Item glowstoneShovel;
    public static Item glowstoneAxe;
    public static Item glowstoneHoe;
    public static Item glowstoneSword;

    public static Item adamantiumPickaxe;
    public static Item adamantiumShovel;
    public static Item adamantiumAxe;
    public static Item adamantiumHoe;
    public static Item adamantiumSword;

    public static Item silkPickaxe;
    public static Item silkShovel;
    public static Item silkAxe;
    public static Item silkHoe;
    public static Item silkSword;

    public static Item redstonePickaxe;
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

        adamantiumHelmet = new ItemArmorFT(AM.adamantiumArmor, ArmorType.helmet, ingotAdamantium, ItemNames.adamantiumHelmet);
        adamantiumChestplate = new ItemArmorFT(AM.adamantiumArmor, ArmorType.chestplate, ingotAdamantium, ItemNames.adamantiumChestplate);
        adamantiumLeggings = new ItemArmorFT(AM.adamantiumArmor, ArmorType.leggings, ingotAdamantium, ItemNames.adamantiumLeggings);
        adamantiumBoots = new ItemArmorFT(AM.adamantiumArmor, ArmorType.boots, ingotAdamantium, ItemNames.adamantiumBoots);

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
        obsidianShears = new ;
        emeraldShears;
        lapisShears;
        bronzeShears;
        coalShears;
        glowstoneShears;
        adamantiumShears;
        silkShears;
        redstoneShears;

        stickFT;
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
    }

    public static void registerModels()
    {
        registerModel(ingotObsidian, 0, ItemNames.ingotObsidian);
        registerModel(gemEmerald, 0, ItemNames.gemEmerald);
        registerModel(gemLapis, 0, ItemNames.gemLapis);
        registerModel(ingotBronze, 0, ItemNames.ingotBronze);
        registerModel(ingotCoal, 0, ItemNames.ingotCoal);
        registerModel(ingotGlowstone, 0, ItemNames.ingotGlowstone);
        registerModel(ingotAdamantium, 0, ItemNames.ingotAdamantium);
        registerModel(gemSilk, 0, ItemNames.gemSilk);
        registerModel(gemRedstone, 0, ItemNames.gemRedstone);
        registerModel(gemExp, 0, ItemNames.gemExp);
        registerModel(gemExp2, 0, ItemNames.gemExp2);
        registerModel(gemExp3, 0, ItemNames.gemExp3);

    }

    public static void registerItem(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
    }

    public static void registerModel(Item item, int meta, String name){
        ModelHelper.getItemModelMesher().register(item, meta, new ModelResLocFT(name));
        ModelBakery.addVariantName(item, new VariantNameFT(name).getFullName());
    }
}
