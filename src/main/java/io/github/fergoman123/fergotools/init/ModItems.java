package io.github.fergoman123.fergotools.init;


import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import io.github.fergoman123.fergotools.item.FTSticks.*;
import io.github.fergoman123.fergotools.item.ItemExpCollector;
import io.github.fergoman123.fergotools.item.axe.*;
import io.github.fergoman123.fergotools.item.bow.*;
import io.github.fergoman123.fergotools.item.hoe.*;
import io.github.fergoman123.fergotools.item.materials.*;
import io.github.fergoman123.fergotools.item.pickaxe.*;
import io.github.fergoman123.fergotools.item.shears.*;
import io.github.fergoman123.fergotools.item.sword.*;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.base.ItemBowFT;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import io.github.fergoman123.fergotools.util.base.ItemStickFT;
import io.github.fergoman123.fergotools.util.tool.*;
import io.github.fergoman123.fergotools.item.shovel.*;
import io.github.fergoman123.fergotools.item.armor.*;
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
        RegisterHelper.registerItem(quartzPickaxe, Names.Items.quartzPickaxe);
        RegisterHelper.registerItem(quartzShovel, Names.Items.quartzShovel);
        RegisterHelper.registerItem(quartzAxe, Names.Items.quartzAxe);
        RegisterHelper.registerItem(quartzHoe, Names.Items.quartzHoe);
        RegisterHelper.registerItem(quartzSword, Names.Items.quartzSword);

        RegisterHelper.registerItem(obsidianPickaxe, Names.Items.obsidianPickaxe);
        RegisterHelper.registerItem(obsidianShovel, Names.Items.obsidianShovel);
        RegisterHelper.registerItem(obsidianAxe, Names.Items.obsidianAxe);
        RegisterHelper.registerItem(obsidianHoe, Names.Items.obsidianHoe);
        RegisterHelper.registerItem(obsidianSword, Names.Items.obsidianSword);

        RegisterHelper.registerItem(emeraldPickaxe, Names.Items.emeraldPickaxe);
        RegisterHelper.registerItem(emeraldShovel, Names.Items.emeraldShovel);
        RegisterHelper.registerItem(emeraldAxe, Names.Items.emeraldAxe);
        RegisterHelper.registerItem(emeraldHoe, Names.Items.emeraldHoe);
        RegisterHelper.registerItem(emeraldSword, Names.Items.emeraldSword);

        RegisterHelper.registerItem(lapisPickaxe, Names.Items.lapisPickaxe);
        RegisterHelper.registerItem(lapisShovel, Names.Items.lapisShovel);
        RegisterHelper.registerItem(lapisAxe, Names.Items.lapisAxe);
        RegisterHelper.registerItem(lapisHoe, Names.Items.lapisHoe);
        RegisterHelper.registerItem(lapisSword, Names.Items.lapisSword);

        RegisterHelper.registerItem(bronzePickaxe, Names.Items.bronzePickaxe);
        RegisterHelper.registerItem(bronzeShovel, Names.Items.bronzeShovel);
        RegisterHelper.registerItem(bronzeAxe, Names.Items.bronzeAxe);
        RegisterHelper.registerItem(bronzeHoe, Names.Items.bronzeHoe);
        RegisterHelper.registerItem(bronzeSword, Names.Items.bronzeSword);

        RegisterHelper.registerItem(coalPickaxe, Names.Items.coalPickaxe);
        RegisterHelper.registerItem(coalShovel, Names.Items.coalShovel);
        RegisterHelper.registerItem(coalAxe, Names.Items.coalAxe);
        RegisterHelper.registerItem(coalHoe, Names.Items.coalHoe);
        RegisterHelper.registerItem(coalSword, Names.Items.coalSword);

        RegisterHelper.registerItem(glowstonePickaxe, Names.Items.glowstonePickaxe);
        RegisterHelper.registerItem(glowstoneShovel, Names.Items.glowstoneShovel);
        RegisterHelper.registerItem(glowstoneAxe, Names.Items.glowstoneAxe);
        RegisterHelper.registerItem(glowstoneHoe, Names.Items.glowstoneHoe);
        RegisterHelper.registerItem(glowstoneSword, Names.Items.glowstoneSword);

        RegisterHelper.registerItem(adamantiumPickaxe, Names.Items.adamantiumPickaxe);
        RegisterHelper.registerItem(adamantiumShovel, Names.Items.adamantiumShovel);
        RegisterHelper.registerItem(adamantiumAxe, Names.Items.adamantiumAxe);
        RegisterHelper.registerItem(adamantiumHoe, Names.Items.adamantiumHoe);
        RegisterHelper.registerItem(adamantiumSword, Names.Items.adamantiumSword);

        RegisterHelper.registerItem(silkPickaxe, Names.Items.silkPickaxe);
        RegisterHelper.registerItem(silkShovel, Names.Items.silkShovel);
        RegisterHelper.registerItem(silkAxe, Names.Items.silkAxe);
        RegisterHelper.registerItem(silkHoe, Names.Items.silkHoe);
        RegisterHelper.registerItem(silkSword, Names.Items.silkSword);

        RegisterHelper.registerItem(redstonePickaxe, Names.Items.redstonePickaxe);
        RegisterHelper.registerItem(redstoneShovel, Names.Items.redstoneShovel);
        RegisterHelper.registerItem(redstoneAxe, Names.Items.redstoneAxe);
        RegisterHelper.registerItem(redstoneHoe, Names.Items.redstoneHoe);
        RegisterHelper.registerItem(redstoneSword, Names.Items.redstoneSword);

        RegisterHelper.registerItem(ingotObsidian, Names.Items.ingotObsidian);
        RegisterHelper.registerItem(gemEmerald, Names.Items.gemEmerald);
        RegisterHelper.registerItem(gemLapis, Names.Items.gemLapis);
        RegisterHelper.registerItem(ingotBronze, Names.Items.ingotBronze);
        RegisterHelper.registerItem(ingotCoal, Names.Items.ingotCoal);
        RegisterHelper.registerItem(ingotGlowstone, Names.Items.ingotGlowstone);
        RegisterHelper.registerItem(ingotAdamantium, Names.Items.ingotAdamantium);
        RegisterHelper.registerItem(gemSilk, Names.Items.gemSilk);
        RegisterHelper.registerItem(gemRedstone, Names.Items.gemRedstone);
        RegisterHelper.registerItem(shardExp, Names.Items.shardExp);
        RegisterHelper.registerItem(expCollector, Names.Items.expCollector);

        RegisterHelper.registerItem(quartzHelmet, Names.Items.quartzHelmet);
        RegisterHelper.registerItem(quartzChestplate, Names.Items.quartzChest);
        RegisterHelper.registerItem(quartzLeggings, Names.Items.quartzLegs);
        RegisterHelper.registerItem(quartzBoots, Names.Items.quartzBoots);

        RegisterHelper.registerItem(obsidianHelmet, Names.Items.obsidianHelmet);
        RegisterHelper.registerItem(obsidianChestplate, Names.Items.obsidianChest);
        RegisterHelper.registerItem(obsidianLeggings, Names.Items.obsidianLegs);
        RegisterHelper.registerItem(obsidianBoots, Names.Items.obsidianBoots);

        RegisterHelper.registerItem(emeraldHelmet, Names.Items.emeraldHelmet);
        RegisterHelper.registerItem(emeraldChestplate, Names.Items.emeraldChest);
        RegisterHelper.registerItem(emeraldLeggings, Names.Items.emeraldLegs);
        RegisterHelper.registerItem(emeraldBoots, Names.Items.emeraldBoots);

        RegisterHelper.registerItem(lapisHelmet, Names.Items.lapisHelmet);
        RegisterHelper.registerItem(lapisChestplate, Names.Items.lapisChest);
        RegisterHelper.registerItem(lapisLeggings, Names.Items.lapisLegs);
        RegisterHelper.registerItem(lapisBoots, Names.Items.lapisBoots);

        RegisterHelper.registerItem(bronzeHelmet, Names.Items.bronzeHelmet);
        RegisterHelper.registerItem(bronzeChestplate, Names.Items.bronzeChest);
        RegisterHelper.registerItem(bronzeLeggings, Names.Items.bronzeLegs);
        RegisterHelper.registerItem(bronzeBoots, Names.Items.bronzeBoots);

        RegisterHelper.registerItem(coalHelmet, Names.Items.coalHelmet);
        RegisterHelper.registerItem(coalChestplate, Names.Items.coalChest);
        RegisterHelper.registerItem(coalLeggings, Names.Items.coalLegs);
        RegisterHelper.registerItem(coalBoots, Names.Items.coalBoots);

        RegisterHelper.registerItem(glowstoneHelmet, Names.Items.glowstoneHelmet);
        RegisterHelper.registerItem(glowstoneChestplate, Names.Items.glowstoneChest);
        RegisterHelper.registerItem(glowstoneLeggings, Names.Items.glowstoneLegs);
        RegisterHelper.registerItem(glowstoneBoots, Names.Items.glowstoneBoots);

        RegisterHelper.registerItem(redstoneHelmet, Names.Items.redstoneHelmet);
        RegisterHelper.registerItem(redstoneChestplate, Names.Items.redstoneChest);
        RegisterHelper.registerItem(redstoneLeggings, Names.Items.redstoneLegs);
        RegisterHelper.registerItem(redstoneBoots, Names.Items.redstoneBoots);

        RegisterHelper.registerItem(adamantiumHelmet, Names.Items.adamantiumHelmet);
        RegisterHelper.registerItem(adamantiumChestplate, Names.Items.adamantiumChest);
        RegisterHelper.registerItem(adamantiumLeggings, Names.Items.adamantiumLegs);
        RegisterHelper.registerItem(adamantiumBoots, Names.Items.adamantiumBoots);

        RegisterHelper.registerItem(bowQuartz, Names.Items.bowQuartz);
        RegisterHelper.registerItem(bowObsidian, Names.Items.bowObsidian);
        RegisterHelper.registerItem(bowEmerald, Names.Items.bowEmerald);
        RegisterHelper.registerItem(bowLapis, Names.Items.bowLapis);
        RegisterHelper.registerItem(bowBronze, Names.Items.bowBronze);
        RegisterHelper.registerItem(bowCoal, Names.Items.bowCoal);
        RegisterHelper.registerItem(bowGlowstone, Names.Items.bowGlowstone);
        RegisterHelper.registerItem(bowAdamantium, Names.Items.bowAdamantium);

        RegisterHelper.registerItem(quartzShears, Names.Items.quartzShears);
        RegisterHelper.registerItem(obsidianShears, Names.Items.obsidianShears);
        RegisterHelper.registerItem(emeraldShears, Names.Items.emeraldShears);
        RegisterHelper.registerItem(lapisShears, Names.Items.lapisShears);
        RegisterHelper.registerItem(bronzeShears, Names.Items.bronzeShears);
        RegisterHelper.registerItem(coalShears, Names.Items.coalShears);
        RegisterHelper.registerItem(glowstoneShears, Names.Items.glowstoneShears);
        RegisterHelper.registerItem(adamantiumShears, Names.Items.adamantiumShears);
        RegisterHelper.registerItem(silkShears, Names.Items.silkShears);
        RegisterHelper.registerItem(redstoneShears, Names.Items.redstoneShears);

        RegisterHelper.registerItem(stickObsidian, Names.Items.stickObsidian);
        RegisterHelper.registerItem(stickEmerald, Names.Items.stickEmerald);
        RegisterHelper.registerItem(stickLapis, Names.Items.stickLapis);
        RegisterHelper.registerItem(stickBronze, Names.Items.stickBronze);
        RegisterHelper.registerItem(stickCoal, Names.Items.stickCoal);
        RegisterHelper.registerItem(stickGlowstone, Names.Items.stickGlowstone);
        RegisterHelper.registerItem(stickAdamantium, Names.Items.stickAdamantium);
        RegisterHelper.registerItem(stickSilk, Names.Items.stickSilk);
        RegisterHelper.registerItem(stickRedstone, Names.Items.stickRedstone);
    }
}
