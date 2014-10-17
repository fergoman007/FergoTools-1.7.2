package io.github.fergoman123.fergotools.init;


import io.github.fergoman123.fergotools.item.FTSticks.*;
import io.github.fergoman123.fergotools.item.ItemExpCollector;
import io.github.fergoman123.fergotools.item.armor.*;
import io.github.fergoman123.fergotools.item.axe.*;
import io.github.fergoman123.fergotools.item.bow.*;
import io.github.fergoman123.fergotools.item.hoe.*;
import io.github.fergoman123.fergotools.item.materials.*;
import io.github.fergoman123.fergotools.item.pickaxe.*;
import io.github.fergoman123.fergotools.item.shears.*;
import io.github.fergoman123.fergotools.item.shovel.*;
import io.github.fergoman123.fergotools.item.sword.*;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.base.ItemBowFT;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import io.github.fergoman123.fergotools.util.base.ItemStickFT;
import io.github.fergoman123.fergotools.util.tool.*;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.item.Item;

public class ModItems
{
    public static final ItemPickaxeFT quartzPickaxe = new ItemQuartzPickaxe();
    public static final ItemShovelFT quartzShovel = new ItemQuartzShovel();
    public static final ItemAxeFT quartzAxe = new ItemQuartzAxe();
    public static final ItemHoeFT quartzHoe = new ItemQuartzHoe();
    public static final ItemSwordFT quartzSword = new ItemQuartzSword();

    public static final ItemPickaxeFT obsidianPickaxe = new ItemObsidianPickaxe();
    public static final ItemShovelFT obsidianShovel = new ItemObsidianShovel();
    public static final ItemAxeFT obsidianAxe = new ItemObsidianAxe();
    public static final ItemHoeFT obsidianHoe = new ItemObsidianHoe();
    public static final ItemSwordFT obsidianSword = new ItemObsidianSword();

    public static final ItemPickaxeFT emeraldPickaxe = new ItemEmeraldPickaxe();
    public static final ItemShovelFT emeraldShovel = new ItemEmeraldShovel();
    public static final ItemAxeFT emeraldAxe = new ItemEmeraldAxe();
    public static final ItemHoeFT emeraldHoe = new ItemEmeraldHoe();
    public static final ItemSwordFT emeraldSword = new ItemEmeraldSword();

    public static final ItemPickaxeFT lapisPickaxe = new ItemLapisPickaxe();
    public static final ItemShovelFT lapisShovel = new ItemLapisShovel();
    public static final ItemAxeFT lapisAxe = new ItemLapisAxe();
    public static final ItemHoeFT lapisHoe = new ItemLapisHoe();
    public static final ItemSwordFT lapisSword = new ItemLapisSword();

    public static final ItemPickaxeFT bronzePickaxe = new ItemBronzePickaxe();
    public static final ItemShovelFT bronzeShovel = new ItemBronzeShovel();
    public static final ItemAxeFT bronzeAxe = new ItemBronzeAxe();
    public static final ItemHoeFT bronzeHoe = new ItemBronzeHoe();
    public static final ItemSwordFT bronzeSword = new ItemBronzeSword();

    public static final ItemPickaxeFT coalPickaxe = new ItemCoalPickaxe();
    public static final ItemShovelFT coalShovel = new ItemCoalShovel();
    public static final ItemAxeFT coalAxe = new ItemCoalAxe();
    public static final ItemHoeFT coalHoe = new ItemCoalHoe();
    public static final ItemSwordFT coalSword = new ItemCoalSword();

    public static final ItemPickaxeFT glowstonePickaxe = new ItemGlowstonePickaxe();
    public static final ItemShovelFT glowstoneShovel = new ItemGlowstoneShovel();
    public static final ItemAxeFT glowstoneAxe = new ItemGlowstoneAxe();
    public static final ItemHoeFT glowstoneHoe = new ItemGlowstoneHoe();
    public static final ItemSwordFT glowstoneSword = new ItemGlowstoneSword();

    public static final ItemPickaxeFT adamantiumPickaxe = new ItemAdamantiumPickaxe();
    public static final ItemShovelFT adamantiumShovel = new ItemAdamantiumShovel();
    public static final ItemAxeFT adamantiumAxe = new ItemAdamantiumAxe();
    public static final ItemHoeFT adamantiumHoe = new ItemAdamantiumHoe();
    public static final ItemSwordFT adamantiumSword = new ItemAdamantiumSword();

    public static final ItemPickaxeFT silkPickaxe = new ItemSilkPickaxe();
    public static final ItemShovelFT silkShovel = new ItemSilkShovel();
    public static final ItemAxeFT silkAxe = new ItemSilkAxe();
    public static final ItemHoeFT silkHoe = new ItemSilkHoe();
    public static final ItemSwordFT silkSword = new ItemSilkSword();

    public static final ItemPickaxeFT redstonePickaxe = new ItemRedstonePickaxe();
    public static final ItemShovelFT redstoneShovel = new ItemRedstoneShovel();
    public static final ItemAxeFT redstoneAxe = new ItemRedstoneAxe();
    public static final ItemHoeFT redstoneHoe = new ItemRedstoneHoe();
    public static final ItemSwordFT redstoneSword = new ItemRedstoneSword();

    public static final ItemShearsFT quartzShears = new ItemQuartzShears();
    public static final ItemShearsFT obsidianShears = new ItemObsidianShears();
    public static final ItemShearsFT emeraldShears = new ItemEmeraldShears();
    public static final ItemShearsFT lapisShears = new ItemLapisShears();
    public static final ItemShearsFT bronzeShears = new ItemBronzeShears();
    public static final ItemShearsFT coalShears = new ItemCoalShears();
    public static final ItemShearsFT glowstoneShears = new ItemGlowstoneShears();
    public static final ItemShearsFT adamantiumShears = new ItemAdamantiumShears();
    public static final ItemShearsFT silkShears = new ItemSilkShears();
    public static final ItemShearsFT redstoneShears = new ItemRedstoneShears();

    public static final ItemBowFT bowQuartz = new ItemQuartzBow();
    public static final ItemBowFT bowObsidian = new ItemObsidianBow();
    public static final ItemBowFT bowEmerald = new ItemEmeraldBow();
    public static final ItemBowFT bowLapis = new ItemLapisBow();
    public static final ItemBowFT bowBronze = new ItemBronzeBow();
    public static final ItemBowFT bowCoal = new ItemCoalBow();
    public static final ItemBowFT bowGlowstone = new ItemGlowstoneBow();
    public static final ItemBowFT bowAdamantium = new ItemAdamantiumBow();

    public static final ItemFT ingotObsidian = new ItemObsidianIngot();
    public static final ItemFT gemEmerald = new ItemEmeraldGem();
    public static final ItemFT gemLapis = new ItemLapisGem();
    public static final ItemFT ingotBronze = new ItemBronzeIngot();
    public static final ItemFT ingotCoal = new ItemCoalIngot();
    public static final ItemFT ingotGlowstone = new ItemGlowstoneIngot();
    public static final ItemFT ingotAdamantium = new ItemAdamantiumIngot();
    public static final ItemFT gemSilk = new ItemSilkGem();
    public static final ItemFT gemRedstone = new ItemRedstoneGem();
    public static final ItemFT shardExp = new ItemExpShard();

    public static final ItemFT expCollector = new ItemExpCollector();

    public static final Item[] materials = new Item[]{ingotObsidian, gemEmerald, gemLapis, ingotBronze, ingotCoal,ingotGlowstone, ingotAdamantium,gemSilk, gemRedstone, shardExp};

    public static final ItemArmorFT quartzHelmet = new ItemArmorQuartz(ArmorType.HELMET);
    public static final ItemArmorFT quartzChestplate = new ItemArmorQuartz(ArmorType.CHEST);
    public static final ItemArmorFT quartzLeggings = new ItemArmorQuartz(ArmorType.LEGS);
    public static final ItemArmorFT quartzBoots = new ItemArmorQuartz(ArmorType.BOOTS);

    public static final ItemArmorFT obsidianHelmet = new ItemArmorObsidian(ArmorType.HELMET);
    public static final ItemArmorFT obsidianChestplate = new ItemArmorObsidian(ArmorType.CHEST);
    public static final ItemArmorFT obsidianLeggings = new ItemArmorObsidian(ArmorType.LEGS);
    public static final ItemArmorFT obsidianBoots = new ItemArmorObsidian(ArmorType.BOOTS);

    public static final ItemArmorFT emeraldHelmet = new ItemArmorEmerald(ArmorType.HELMET);
    public static final ItemArmorFT emeraldChestplate = new ItemArmorEmerald(ArmorType.CHEST);
    public static final ItemArmorFT emeraldLeggings = new ItemArmorEmerald(ArmorType.LEGS);
    public static final ItemArmorFT emeraldBoots = new ItemArmorEmerald(ArmorType.BOOTS);

    public static final ItemArmorFT lapisHelmet = new ItemArmorLapis(ArmorType.HELMET);
    public static final ItemArmorFT lapisChestplate = new ItemArmorLapis(ArmorType.CHEST);
    public static final ItemArmorFT lapisLeggings = new ItemArmorLapis(ArmorType.LEGS);
    public static final ItemArmorFT lapisBoots = new ItemArmorLapis(ArmorType.BOOTS);

    public static final ItemArmorFT bronzeHelmet = new ItemArmorBronze(ArmorType.HELMET);
    public static final ItemArmorFT bronzeChestplate = new ItemArmorBronze(ArmorType.CHEST);
    public static final ItemArmorFT bronzeLeggings = new ItemArmorBronze(ArmorType.LEGS);
    public static final ItemArmorFT bronzeBoots = new ItemArmorBronze(ArmorType.BOOTS);

    public static final ItemArmorFT coalHelmet = new ItemArmorCoal(ArmorType.HELMET);
    public static final ItemArmorFT coalChestplate = new ItemArmorCoal(ArmorType.CHEST);
    public static final ItemArmorFT coalLeggings = new ItemArmorCoal(ArmorType.LEGS);
    public static final ItemArmorFT coalBoots = new ItemArmorCoal(ArmorType.BOOTS);

    public static final ItemArmorFT glowstoneHelmet = new ItemArmorGlowstone(ArmorType.HELMET);
    public static final ItemArmorFT glowstoneChestplate = new ItemArmorGlowstone(ArmorType.CHEST);
    public static final ItemArmorFT glowstoneLeggings = new ItemArmorGlowstone(ArmorType.LEGS);
    public static final ItemArmorFT glowstoneBoots = new ItemArmorGlowstone(ArmorType.BOOTS);

    public static final ItemArmorFT redstoneHelmet = new ItemArmorRedstone(ArmorType.HELMET);
    public static final ItemArmorFT redstoneChestplate = new ItemArmorRedstone(ArmorType.CHEST);
    public static final ItemArmorFT redstoneLeggings = new ItemArmorRedstone(ArmorType.LEGS);
    public static final ItemArmorFT redstoneBoots = new ItemArmorRedstone(ArmorType.BOOTS);

    public static final ItemArmorFT adamantiumHelmet = new ItemArmorAdamantium(ArmorType.HELMET);
    public static final ItemArmorFT adamantiumChestplate = new ItemArmorAdamantium(ArmorType.CHEST);
    public static final ItemArmorFT adamantiumLeggings = new ItemArmorAdamantium(ArmorType.LEGS);
    public static final ItemArmorFT adamantiumBoots = new ItemArmorAdamantium(ArmorType.BOOTS);

    public static final ItemStickFT stickObsidian = new ItemStickObsidian();
    public static final ItemStickFT stickEmerald = new ItemStickEmerald();
    public static final ItemStickFT stickLapis = new ItemStickLapis();
    public static final ItemStickFT stickBronze = new ItemStickBronze();
    public static final ItemStickFT stickCoal = new ItemStickCoal();
    public static final ItemStickFT stickGlowstone = new ItemStickGlowstone();
    public static final ItemStickFT stickAdamantium = new ItemStickAdamantium();
    public static final ItemStickFT stickSilk = new ItemStickSilk();
    public static final ItemStickFT stickRedstone = new ItemStickRedstone();

    public static final Item[] sticks = new Item[]{stickObsidian, stickEmerald, stickLapis, stickBronze, stickCoal, stickGlowstone, stickAdamantium, stickSilk, stickRedstone};

    public static void init()
	{
        RegisterHelper.registerItem(quartzPickaxe, ItemNames.quartzPickaxe);
        RegisterHelper.registerItem(quartzShovel, ItemNames.quartzShovel);
        RegisterHelper.registerItem(quartzAxe, ItemNames.quartzAxe);
        RegisterHelper.registerItem(quartzHoe, ItemNames.quartzHoe);
        RegisterHelper.registerItem(quartzSword, ItemNames.quartzSword);

        RegisterHelper.registerItem(obsidianPickaxe, ItemNames.obsidianPickaxe);
        RegisterHelper.registerItem(obsidianShovel, ItemNames.obsidianShovel);
        RegisterHelper.registerItem(obsidianAxe, ItemNames.obsidianAxe);
        RegisterHelper.registerItem(obsidianHoe, ItemNames.obsidianHoe);
        RegisterHelper.registerItem(obsidianSword, ItemNames.obsidianSword);

        RegisterHelper.registerItem(emeraldPickaxe, ItemNames.emeraldPickaxe);
        RegisterHelper.registerItem(emeraldShovel, ItemNames.emeraldShovel);
        RegisterHelper.registerItem(emeraldAxe, ItemNames.emeraldAxe);
        RegisterHelper.registerItem(emeraldHoe, ItemNames.emeraldHoe);
        RegisterHelper.registerItem(emeraldSword, ItemNames.emeraldSword);

        RegisterHelper.registerItem(lapisPickaxe, ItemNames.lapisPickaxe);
        RegisterHelper.registerItem(lapisShovel, ItemNames.lapisShovel);
        RegisterHelper.registerItem(lapisAxe, ItemNames.lapisAxe);
        RegisterHelper.registerItem(lapisHoe, ItemNames.lapisHoe);
        RegisterHelper.registerItem(lapisSword, ItemNames.lapisSword);

        RegisterHelper.registerItem(bronzePickaxe, ItemNames.bronzePickaxe);
        RegisterHelper.registerItem(bronzeShovel, ItemNames.bronzeShovel);
        RegisterHelper.registerItem(bronzeAxe, ItemNames.bronzeAxe);
        RegisterHelper.registerItem(bronzeHoe, ItemNames.bronzeHoe);
        RegisterHelper.registerItem(bronzeSword, ItemNames.bronzeSword);

        RegisterHelper.registerItem(coalPickaxe, ItemNames.coalPickaxe);
        RegisterHelper.registerItem(coalShovel, ItemNames.coalShovel);
        RegisterHelper.registerItem(coalAxe, ItemNames.coalAxe);
        RegisterHelper.registerItem(coalHoe, ItemNames.coalHoe);
        RegisterHelper.registerItem(coalSword, ItemNames.coalSword);

        RegisterHelper.registerItem(glowstonePickaxe, ItemNames.glowstonePickaxe);
        RegisterHelper.registerItem(glowstoneShovel, ItemNames.glowstoneShovel);
        RegisterHelper.registerItem(glowstoneAxe, ItemNames.glowstoneAxe);
        RegisterHelper.registerItem(glowstoneHoe, ItemNames.glowstoneHoe);
        RegisterHelper.registerItem(glowstoneSword, ItemNames.glowstoneSword);

        RegisterHelper.registerItem(adamantiumPickaxe, ItemNames.adamantiumPickaxe);
        RegisterHelper.registerItem(adamantiumShovel, ItemNames.adamantiumShovel);
        RegisterHelper.registerItem(adamantiumAxe, ItemNames.adamantiumAxe);
        RegisterHelper.registerItem(adamantiumHoe, ItemNames.adamantiumHoe);
        RegisterHelper.registerItem(adamantiumSword, ItemNames.adamantiumSword);

        RegisterHelper.registerItem(silkPickaxe, ItemNames.silkPickaxe);
        RegisterHelper.registerItem(silkShovel, ItemNames.silkShovel);
        RegisterHelper.registerItem(silkAxe, ItemNames.silkAxe);
        RegisterHelper.registerItem(silkHoe, ItemNames.silkHoe);
        RegisterHelper.registerItem(silkSword, ItemNames.silkSword);

        RegisterHelper.registerItem(redstonePickaxe, ItemNames.redstonePickaxe);
        RegisterHelper.registerItem(redstoneShovel, ItemNames.redstoneShovel);
        RegisterHelper.registerItem(redstoneAxe, ItemNames.redstoneAxe);
        RegisterHelper.registerItem(redstoneHoe, ItemNames.redstoneHoe);
        RegisterHelper.registerItem(redstoneSword, ItemNames.redstoneSword);

        RegisterHelper.registerItem(ingotObsidian, ItemNames.ingotObsidian);
        RegisterHelper.registerItem(gemEmerald, ItemNames.gemEmerald);
        RegisterHelper.registerItem(gemLapis, ItemNames.gemLapis);
        RegisterHelper.registerItem(ingotBronze, ItemNames.ingotBronze);
        RegisterHelper.registerItem(ingotCoal, ItemNames.ingotCoal);
        RegisterHelper.registerItem(ingotGlowstone, ItemNames.ingotGlowstone);
        RegisterHelper.registerItem(ingotAdamantium, ItemNames.ingotAdamantium);
        RegisterHelper.registerItem(gemSilk, ItemNames.gemSilk);
        RegisterHelper.registerItem(gemRedstone, ItemNames.gemRedstone);
        RegisterHelper.registerItem(shardExp, ItemNames.shardExp);
        RegisterHelper.registerItem(expCollector, ItemNames.expCollector);

        RegisterHelper.registerItem(quartzHelmet, ItemNames.quartzHelmet);
        RegisterHelper.registerItem(quartzChestplate, ItemNames.quartzChest);
        RegisterHelper.registerItem(quartzLeggings, ItemNames.quartzLegs);
        RegisterHelper.registerItem(quartzBoots, ItemNames.quartzBoots);

        RegisterHelper.registerItem(obsidianHelmet, ItemNames.obsidianHelmet);
        RegisterHelper.registerItem(obsidianChestplate, ItemNames.obsidianChest);
        RegisterHelper.registerItem(obsidianLeggings, ItemNames.obsidianLegs);
        RegisterHelper.registerItem(obsidianBoots, ItemNames.obsidianBoots);

        RegisterHelper.registerItem(emeraldHelmet, ItemNames.emeraldHelmet);
        RegisterHelper.registerItem(emeraldChestplate, ItemNames.emeraldChest);
        RegisterHelper.registerItem(emeraldLeggings, ItemNames.emeraldLegs);
        RegisterHelper.registerItem(emeraldBoots, ItemNames.emeraldBoots);

        RegisterHelper.registerItem(lapisHelmet, ItemNames.lapisHelmet);
        RegisterHelper.registerItem(lapisChestplate, ItemNames.lapisChest);
        RegisterHelper.registerItem(lapisLeggings, ItemNames.lapisLegs);
        RegisterHelper.registerItem(lapisBoots, ItemNames.lapisBoots);

        RegisterHelper.registerItem(bronzeHelmet, ItemNames.bronzeHelmet);
        RegisterHelper.registerItem(bronzeChestplate, ItemNames.bronzeChest);
        RegisterHelper.registerItem(bronzeLeggings, ItemNames.bronzeLegs);
        RegisterHelper.registerItem(bronzeBoots, ItemNames.bronzeBoots);

        RegisterHelper.registerItem(coalHelmet, ItemNames.coalHelmet);
        RegisterHelper.registerItem(coalChestplate, ItemNames.coalChest);
        RegisterHelper.registerItem(coalLeggings, ItemNames.coalLegs);
        RegisterHelper.registerItem(coalBoots, ItemNames.coalBoots);

        RegisterHelper.registerItem(glowstoneHelmet, ItemNames.glowstoneHelmet);
        RegisterHelper.registerItem(glowstoneChestplate, ItemNames.glowstoneChest);
        RegisterHelper.registerItem(glowstoneLeggings, ItemNames.glowstoneLegs);
        RegisterHelper.registerItem(glowstoneBoots, ItemNames.glowstoneBoots);

        RegisterHelper.registerItem(redstoneHelmet, ItemNames.redstoneHelmet);
        RegisterHelper.registerItem(redstoneChestplate, ItemNames.redstoneChest);
        RegisterHelper.registerItem(redstoneLeggings, ItemNames.redstoneLegs);
        RegisterHelper.registerItem(redstoneBoots, ItemNames.redstoneBoots);

        RegisterHelper.registerItem(adamantiumHelmet, ItemNames.adamantiumHelmet);
        RegisterHelper.registerItem(adamantiumChestplate, ItemNames.adamantiumChest);
        RegisterHelper.registerItem(adamantiumLeggings, ItemNames.adamantiumLegs);
        RegisterHelper.registerItem(adamantiumBoots, ItemNames.adamantiumBoots);

        RegisterHelper.registerItem(bowQuartz, ItemNames.bowQuartz);
        RegisterHelper.registerItem(bowObsidian, ItemNames.bowObsidian);
        RegisterHelper.registerItem(bowEmerald, ItemNames.bowEmerald);
        RegisterHelper.registerItem(bowLapis, ItemNames.bowLapis);
        RegisterHelper.registerItem(bowBronze, ItemNames.bowBronze);
        RegisterHelper.registerItem(bowCoal, ItemNames.bowCoal);
        RegisterHelper.registerItem(bowGlowstone, ItemNames.bowGlowstone);
        RegisterHelper.registerItem(bowAdamantium, ItemNames.bowAdamantium);

        RegisterHelper.registerItem(quartzShears, ItemNames.quartzShears);
        RegisterHelper.registerItem(obsidianShears, ItemNames.obsidianShears);
        RegisterHelper.registerItem(emeraldShears, ItemNames.emeraldShears);
        RegisterHelper.registerItem(lapisShears, ItemNames.lapisShears);
        RegisterHelper.registerItem(bronzeShears, ItemNames.bronzeShears);
        RegisterHelper.registerItem(coalShears, ItemNames.coalShears);
        RegisterHelper.registerItem(glowstoneShears, ItemNames.glowstoneShears);
        RegisterHelper.registerItem(adamantiumShears, ItemNames.adamantiumShears);
        RegisterHelper.registerItem(silkShears, ItemNames.silkShears);
        RegisterHelper.registerItem(redstoneShears, ItemNames.redstoneShears);

        RegisterHelper.registerItem(stickObsidian, ItemNames.stickObsidian);
        RegisterHelper.registerItem(stickEmerald, ItemNames.stickEmerald);
        RegisterHelper.registerItem(stickLapis, ItemNames.stickLapis);
        RegisterHelper.registerItem(stickBronze, ItemNames.stickBronze);
        RegisterHelper.registerItem(stickCoal, ItemNames.stickCoal);
        RegisterHelper.registerItem(stickGlowstone, ItemNames.stickGlowstone);
        RegisterHelper.registerItem(stickAdamantium, ItemNames.stickAdamantium);
        RegisterHelper.registerItem(stickSilk, ItemNames.stickSilk);
        RegisterHelper.registerItem(stickRedstone, ItemNames.stickRedstone);
    }
}
