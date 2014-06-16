package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.item.armor.*;
import fergoman123.mods.fergotools.item.axe.*;
import fergoman123.mods.fergotools.item.bow.*;
import fergoman123.mods.fergotools.item.hoe.*;
import fergoman123.mods.fergotools.item.materials.*;
import fergoman123.mods.fergotools.item.pickaxe.*;
import fergoman123.mods.fergotools.item.shovel.*;
import fergoman123.mods.fergotools.item.sword.*;
import fergoman123.mods.fergotools.lib.Strings.ArmorStrings;
import fergoman123.mods.fergotools.lib.Strings.BowStrings;
import fergoman123.mods.fergotools.lib.Strings.ItemStrings;
import fergoman123.mods.fergotools.lib.Strings.ToolStrings;
import fergoman123.mods.fergotools.util.ItemArmorFT;
import fergoman123.mods.fergotools.util.ItemBowFT;
import fergoman123.mods.fergotools.util.ItemFT;
import fergoman123.mods.fergotools.util.tool.*;
import fergoman123.mods.fergoutil.helper.RegisterHelper;
import fergoman123.mods.fergoutil.item.ArmorType;

public class ModItems{

    public static ArmorType helmet = ArmorType.HELMET;
    public static ArmorType chestplate = ArmorType.CHEST;
    public static ArmorType leggings = ArmorType.LEGS;
    public static ArmorType boots = ArmorType.BOOTS;

    public static final PickaxeGeneric quartzPickaxe = ItemQuartzPickaxe.instance;
    public static final PickaxeGeneric obsidianPickaxe = ItemObsidianPickaxe.instance;
    public static final PickaxeGeneric emeraldPickaxe = ItemEmeraldPickaxe.instance;
    public static final PickaxeGeneric lapisPickaxe = ItemLapisPickaxe.instance;
    public static final PickaxeGeneric bronzePickaxe = ItemBronzePickaxe.instance;
    public static final PickaxeGeneric coalPickaxe = ItemCoalPickaxe.instance;
    public static final PickaxeGeneric glowstonePickaxe = ItemGlowstonePickaxe.instance;
    public static final PickaxeGeneric adamantiumPickaxe = ItemAdamantiumPickaxe.instance;
    public static final PickaxeGeneric silkPickaxe = ItemSilkPickaxe.instance;
    public static final PickaxeGeneric redstonePickaxe = ItemRedstonePickaxe.instance;

    public static final ShovelGeneric quartzShovel = ItemQuartzShovel.instance;
    public static final ShovelGeneric obsidianShovel = ItemObsidianShovel.instance;
    public static final ShovelGeneric emeraldShovel = ItemEmeraldShovel.instance;
    public static final ShovelGeneric lapisShovel = ItemLapisShovel.instance;
    public static final ShovelGeneric bronzeShovel = ItemBronzeShovel.instance;
    public static final ShovelGeneric coalShovel = ItemCoalShovel.instance;
    public static final ShovelGeneric glowstoneShovel = ItemGlowstoneShovel.instance;
    public static final ShovelGeneric adamantiumShovel = ItemAdamantiumShovel.instance;
    public static final ShovelGeneric silkShovel = ItemSilkShovel.instance;
    public static final ShovelGeneric redstoneShovel = ItemRedstoneShovel.instance;

    public static final AxeGeneric quartzAxe = ItemQuartzAxe.instance;
    public static final AxeGeneric obsidianAxe = ItemObsidianAxe.instance;
    public static final AxeGeneric emeraldAxe = ItemEmeraldAxe.instance;
    public static final AxeGeneric lapisAxe = ItemLapisAxe.instance;
    public static final AxeGeneric bronzeAxe = ItemBronzeAxe.instance;
    public static final AxeGeneric coalAxe = ItemCoalAxe.instance;
    public static final AxeGeneric glowstoneAxe = ItemGlowstoneAxe.instance;
    public static final AxeGeneric adamantiumAxe = ItemAdamantiumAxe.instance;
    public static final AxeGeneric silkAxe = ItemSilkAxe.instance;
    public static final AxeGeneric redstoneAxe = ItemRedstoneAxe.instance;

    public static final HoeGeneric quartzHoe = ItemQuartzHoe;
    public static final HoeGeneric obsidianHoe = ItemObsidianHoe;
    public static final HoeGeneric emeraldHoe = ItemEmeraldHoe;
    public static final HoeGeneric lapisHoe = ItemLapisHoe;
    public static final HoeGeneric bronzeHoe = ItemBronzeHoe;
    public static final HoeGeneric coalHoe = ItemCoalHoe;
    public static final HoeGeneric glowstoneHoe = ItemGlowstoneHoe;
    public static final HoeGeneric adamantiumHoe = ItemAdamantiumHoe;
    public static final HoeGeneric silkHoe = ItemSilkHoe;
    public static final HoeGeneric redstoneHoe = ItemRedstoneHoe;

    public static final SwordGeneric quartzSword = ItemQuartzSword;
    public static final SwordGeneric obsidianSword = ItemObsidianSword;
    public static final SwordGeneric emeraldSword = ItemEmeraldSword;
    public static final SwordGeneric lapisSword = ItemLapisSword;
    public static final SwordGeneric bronzeSword = ItemBronzeSword;
    public static final SwordGeneric coalSword = ItemCoalSword;
    public static final SwordGeneric glowstoneSword = ItemGlowstoneSword;
    public static final SwordGeneric adamantiumSword = ItemAdamantiumSword;
    public static final SwordGeneric silkSword = ItemSilkSword;
    public static final SwordGeneric redstoneSword = ItemRedstoneSword;

    public static final ItemFT obsidianIngot = ItemObsidianIngot;
    public static final ItemFT emeraldCrystal = ItemEmeraldCrystal;
    public static final ItemFT lapisCrystal = ItemLapisCrystal;
    public static final ItemFT bronzeIngot = ItemBronzeIngot;
    public static final ItemFT coalIngot = ItemCoalIngot;
    public static final ItemFT glowstoneIngot = ItemGlowstoneIngot;
    public static final ItemFT adamantiumIngot = ItemAdamantiumIngot;
    public static final ItemFT expShard = ItemExpShard;
    public static final ItemFT silkGem = ItemSilkGem;
    public static final ItemFT redstoneCrystal = ItemRedstoneCrystal;

    public static final ItemArmorFT quartzHelmet = ItemArmorQuartz(helmet);
    public static final ItemArmorFT obsidianHelmet = ItemArmorObsidian(helmet);
    public static final ItemArmorFT emeraldHelmet = ItemArmorEmerald(helmet);
    public static final ItemArmorFT lapisHelmet = ItemArmorLapis(helmet);
    public static final ItemArmorFT bronzeHelmet = ItemArmorBronze(helmet);
    public static final ItemArmorFT coalHelmet = ItemArmorCoal(helmet);
    public static final ItemArmorFT glowstoneHelmet = ItemArmorGlowstone(helmet);
    public static final ItemArmorFT redstoneHelmet = ItemArmorRedstone(helmet);

    public static final ItemArmorFT quartzChestplate = ItemArmorQuartz(chestplate);
    public static final ItemArmorFT obsidianChestplate = ItemArmorObsidian(chestplate);
    public static final ItemArmorFT emeraldChestplate = ItemArmorEmerald(chestplate);
    public static final ItemArmorFT lapisChestplate = ItemArmorLapis(chestplate);
    public static final ItemArmorFT bronzeChestplate = ItemArmorBronze(chestplate);
    public static final ItemArmorFT coalChestplate = ItemArmorCoal(chestplate);
    public static final ItemArmorFT glowstoneChestplate = ItemArmorGlowstone(chestplate);
    public static final ItemArmorFT redstoneChestplate = ItemArmorRedstone(chestplate);

    public static final ItemArmorFT quartzLeggings = ItemArmorQuartz(leggings);
    public static final ItemArmorFT obsidianLeggings = ItemArmorObsidian(leggings);
    public static final ItemArmorFT emeraldLeggings = ItemArmorEmerald(leggings);
    public static final ItemArmorFT lapisLeggings = ItemArmorLapis(leggings);
    public static final ItemArmorFT bronzeLeggings = ItemArmorBronze(leggings);
    public static final ItemArmorFT coalLeggings = ItemArmorCoal(leggings);
    public static final ItemArmorFT glowstoneLeggings = ItemArmorGlowstone(leggings);
    public static final ItemArmorFT redstoneLeggings = ItemArmorRedstone(leggings);

    public static final ItemArmorFT quartzBoots = ItemArmorQuartz(boots);
    public static final ItemArmorFT obsidianBoots = ItemArmorObsidian(boots);
    public static final ItemArmorFT emeraldBoots = ItemArmorEmerald(boots);
    public static final ItemArmorFT lapisBoots = ItemArmorLapis(boots);
    public static final ItemArmorFT bronzeBoots = ItemArmorBronze(boots);
    public static final ItemArmorFT coalBoots = ItemArmorCoal(boots);
    public static final ItemArmorFT glowstoneBoots = ItemArmorGlowstone(boots);
    public static final ItemArmorFT redstoneBoots = ItemArmorRedstone(boots);

    public static final ItemBowFT quartzBow = ItemQuartzBow;
    public static final ItemBowFT obsidianBow = ItemObsidianBow;
    public static final ItemBowFT emeraldBow = ItemEmeraldBow;
    public static final ItemBowFT lapisBow = ItemLapisBow;
    public static final ItemBowFT bronzeBow = ItemBronzeBow;
    public static final ItemBowFT coalBow = ItemCoalBow;
    public static final ItemBowFT glowstoneBow = ItemGlowstoneBow;
    public static final ItemBowFT adamantiumBow = ItemAdamantiumBow;

    public static void init()
	{
        RegisterHelper.registerItem(quartzPickaxe, ToolStrings.quartzPickaxe);
        RegisterHelper.registerItem(quartzShovel, ToolStrings.quartzShovel);
        RegisterHelper.registerItem(quartzAxe, ToolStrings.quartzAxe);
        RegisterHelper.registerItem(quartzHoe, ToolStrings.quartzHoe);
        RegisterHelper.registerItem(quartzSword, ToolStrings.quartzSword);

        RegisterHelper.registerItem(obsidianPickaxe, ToolStrings.obsidianPickaxe);
        RegisterHelper.registerItem(obsidianShovel, ToolStrings.obsidianShovel);
        RegisterHelper.registerItem(obsidianAxe, ToolStrings.obsidianAxe);
        RegisterHelper.registerItem(obsidianHoe, ToolStrings.obsidianHoe);
        RegisterHelper.registerItem(obsidianSword, ToolStrings.obsidianSword);

        RegisterHelper.registerItem(emeraldPickaxe, ToolStrings.emeraldPickaxe);
        RegisterHelper.registerItem(emeraldShovel, ToolStrings.emeraldShovel);
        RegisterHelper.registerItem(emeraldAxe, ToolStrings.emeraldAxe);
        RegisterHelper.registerItem(emeraldHoe, ToolStrings.emeraldHoe);
        RegisterHelper.registerItem(emeraldSword, ToolStrings.emeraldSword);

        RegisterHelper.registerItem(lapisPickaxe, ToolStrings.lapisPickaxe);
        RegisterHelper.registerItem(lapisShovel, ToolStrings.lapisShovel);
        RegisterHelper.registerItem(lapisAxe, ToolStrings.lapisAxe);
        RegisterHelper.registerItem(lapisHoe, ToolStrings.lapisHoe);
        RegisterHelper.registerItem(lapisSword, ToolStrings.lapisSword);

        RegisterHelper.registerItem(bronzePickaxe, ToolStrings.bronzePickaxe);
        RegisterHelper.registerItem(bronzeShovel, ToolStrings.bronzeShovel);
        RegisterHelper.registerItem(bronzeAxe, ToolStrings.bronzeAxe);
        RegisterHelper.registerItem(bronzeHoe, ToolStrings.bronzeHoe);
        RegisterHelper.registerItem(bronzeSword, ToolStrings.bronzeSword);

        RegisterHelper.registerItem(coalPickaxe, ToolStrings.coalPickaxe);
        RegisterHelper.registerItem(coalShovel, ToolStrings.coalShovel);
        RegisterHelper.registerItem(coalAxe, ToolStrings.coalAxe);
        RegisterHelper.registerItem(coalHoe, ToolStrings.coalHoe);
        RegisterHelper.registerItem(coalSword, ToolStrings.coalSword);

        RegisterHelper.registerItem(glowstonePickaxe, ToolStrings.glowstonePickaxe);
        RegisterHelper.registerItem(glowstoneShovel, ToolStrings.glowstoneShovel);
        RegisterHelper.registerItem(glowstoneAxe, ToolStrings.glowstoneAxe);
        RegisterHelper.registerItem(glowstoneHoe, ToolStrings.glowstoneHoe);
        RegisterHelper.registerItem(glowstoneSword, ToolStrings.glowstoneSword);

        RegisterHelper.registerItem(adamantiumPickaxe, ToolStrings.adamantiumPickaxe);
        RegisterHelper.registerItem(adamantiumShovel, ToolStrings.adamantiumShovel);
        RegisterHelper.registerItem(adamantiumAxe, ToolStrings.adamantiumAxe);
        RegisterHelper.registerItem(adamantiumHoe, ToolStrings.adamantiumHoe);
        RegisterHelper.registerItem(adamantiumSword, ToolStrings.adamantiumSword);

        RegisterHelper.registerItem(silkPickaxe, ToolStrings.silkPickaxe);
        RegisterHelper.registerItem(silkShovel, ToolStrings.silkShovel);
        RegisterHelper.registerItem(silkAxe, ToolStrings.silkAxe);
        RegisterHelper.registerItem(silkHoe, ToolStrings.silkHoe);
        RegisterHelper.registerItem(silkSword, ToolStrings.silkSword);

        RegisterHelper.registerItem(redstonePickaxe, ToolStrings.redstonePickaxe);
        RegisterHelper.registerItem(redstoneShovel, ToolStrings.redstoneShovel);
        RegisterHelper.registerItem(redstoneAxe, ToolStrings.redstoneAxe);
        RegisterHelper.registerItem(redstoneHoe, ToolStrings.redstoneHoe);
        RegisterHelper.registerItem(redstoneSword, ToolStrings.redstoneSword);

        RegisterHelper.registerItem(obsidianIngot, ItemStrings.ingotObsidian);
        RegisterHelper.registerItem(emeraldCrystal, ItemStrings.emeraldCrystal);
        RegisterHelper.registerItem(lapisCrystal, ItemStrings.lapisCrystal);
        RegisterHelper.registerItem(bronzeIngot, ItemStrings.ingotBronze);
        RegisterHelper.registerItem(coalIngot, ItemStrings.ingotCoal);
        RegisterHelper.registerItem(glowstoneIngot, ItemStrings.ingotGlowstone);
        RegisterHelper.registerItem(adamantiumIngot, ItemStrings.ingotAdamantium);
        RegisterHelper.registerItem(silkGem, ItemStrings.silkGem);
        RegisterHelper.registerItem(redstoneCrystal, ItemStrings.redstoneCrystal);
        RegisterHelper.registerItem(expShard, ItemStrings.expShard);

        RegisterHelper.registerItem(quartzHelmet, ArmorStrings.quartzHelmet);
        RegisterHelper.registerItem(quartzChestplate, ArmorStrings.quartzChest);
        RegisterHelper.registerItem(quartzLeggings, ArmorStrings.quartzLegs);
        RegisterHelper.registerItem(quartzBoots, ArmorStrings.quartzBoots);

        RegisterHelper.registerItem(obsidianHelmet, ArmorStrings.obsidianHelmet);
        RegisterHelper.registerItem(obsidianChestplate, ArmorStrings.obsidianChest);
        RegisterHelper.registerItem(obsidianLeggings, ArmorStrings.obsidianLegs);
        RegisterHelper.registerItem(obsidianBoots, ArmorStrings.obsidianBoots);

        RegisterHelper.registerItem(emeraldHelmet, ArmorStrings.emeraldHelmet);
        RegisterHelper.registerItem(emeraldChestplate, ArmorStrings.emeraldChest);
        RegisterHelper.registerItem(emeraldLeggings, ArmorStrings.emeraldLegs);
        RegisterHelper.registerItem(emeraldBoots, ArmorStrings.emeraldBoots);

        RegisterHelper.registerItem(lapisHelmet, ArmorStrings.lapisHelmet);
        RegisterHelper.registerItem(lapisChestplate, ArmorStrings.lapisChest);
        RegisterHelper.registerItem(lapisLeggings, ArmorStrings.lapisLegs);
        RegisterHelper.registerItem(lapisBoots, ArmorStrings.lapisBoots);

        RegisterHelper.registerItem(bronzeHelmet, ArmorStrings.bronzeHelmet);
        RegisterHelper.registerItem(bronzeChestplate, ArmorStrings.bronzeChest);
        RegisterHelper.registerItem(bronzeLeggings, ArmorStrings.bronzeLegs);
        RegisterHelper.registerItem(bronzeBoots, ArmorStrings.bronzeBoots);

        RegisterHelper.registerItem(coalHelmet, ArmorStrings.coalHelmet);
        RegisterHelper.registerItem(coalChestplate, ArmorStrings.coalChest);
        RegisterHelper.registerItem(coalLeggings, ArmorStrings.coalLegs);
        RegisterHelper.registerItem(coalBoots, ArmorStrings.coalBoots);

        RegisterHelper.registerItem(glowstoneHelmet, ArmorStrings.glowstoneHelmet);
        RegisterHelper.registerItem(glowstoneChestplate, ArmorStrings.glowstoneChest);
        RegisterHelper.registerItem(glowstoneLeggings, ArmorStrings.glowstoneLegs);
        RegisterHelper.registerItem(glowstoneBoots, ArmorStrings.glowstoneBoots);

        RegisterHelper.registerItem(redstoneHelmet, ArmorStrings.redstoneHelmet);
        RegisterHelper.registerItem(redstoneChestplate, ArmorStrings.redstoneChest);
        RegisterHelper.registerItem(redstoneLeggings, ArmorStrings.redstoneLegs);
        RegisterHelper.registerItem(redstoneBoots, ArmorStrings.redstoneBoots);

        RegisterHelper.registerItem(quartzBow, BowStrings.bowQuartz);
        RegisterHelper.registerItem(obsidianBow, BowStrings.bowObsidian);
        RegisterHelper.registerItem(emeraldBow, BowStrings.bowEmerald);
        RegisterHelper.registerItem(lapisBow, BowStrings.bowLapis);
        RegisterHelper.registerItem(bronzeBow, BowStrings.bowBronze);
        RegisterHelper.registerItem(coalBow, BowStrings.bowCoal);
        RegisterHelper.registerItem(glowstoneBow, BowStrings.bowGlowstone);
        RegisterHelper.registerItem(adamantiumBow, BowStrings.bowAdamantium);
	}
}
