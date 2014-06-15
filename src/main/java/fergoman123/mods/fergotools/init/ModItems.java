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

    public static final PickaxeGeneric quartzPickaxe = new ItemQuartzPickaxe();
    public static final PickaxeGeneric obsidianPickaxe = new ItemObsidianPickaxe();
    public static final PickaxeGeneric emeraldPickaxe = new ItemEmeraldPickaxe();
    public static final PickaxeGeneric lapisPickaxe = new ItemLapisPickaxe();
    public static final PickaxeGeneric bronzePickaxe = new ItemBronzePickaxe();
    public static final PickaxeGeneric coalPickaxe = new ItemCoalPickaxe();
    public static final PickaxeGeneric glowstonePickaxe = new ItemGlowstonePickaxe();
    public static final PickaxeGeneric adamantiumPickaxe = new ItemAdamantiumPickaxe();
    public static final PickaxeGeneric silkPickaxe = new ItemSilkPickaxe();
    public static final PickaxeGeneric redstonePickaxe = new ItemRedstonePickaxe();

    public static final ShovelGeneric quartzShovel = new ItemQuartzShovel();
    public static final ShovelGeneric obsidianShovel = new ItemObsidianShovel();
    public static final ShovelGeneric emeraldShovel = new ItemEmeraldShovel();
    public static final ShovelGeneric lapisShovel = new ItemLapisShovel();
    public static final ShovelGeneric bronzeShovel = new ItemBronzeShovel();
    public static final ShovelGeneric coalShovel = new ItemCoalShovel();
    public static final ShovelGeneric glowstoneShovel = new ItemGlowstoneShovel();
    public static final ShovelGeneric adamantiumShovel = new ItemAdamantiumShovel();
    public static final ShovelGeneric silkShovel = new ItemSilkShovel();
    public static final ShovelGeneric redstoneShovel = new ItemRedstoneShovel();

    public static final AxeGeneric quartzAxe = new ItemQuartzAxe();
    public static final AxeGeneric obsidianAxe = new ItemObsidianAxe();
    public static final AxeGeneric emeraldAxe = new ItemEmeraldAxe();
    public static final AxeGeneric lapisAxe = new ItemLapisAxe();
    public static final AxeGeneric bronzeAxe = new ItemBronzeAxe();
    public static final AxeGeneric coalAxe = new ItemCoalAxe();
    public static final AxeGeneric glowstoneAxe = new ItemGlowstoneAxe();
    public static final AxeGeneric adamantiumAxe = new ItemAdamantiumAxe();
    public static final AxeGeneric silkAxe = new ItemSilkAxe();
    public static final AxeGeneric redstoneAxe = new ItemRedstoneAxe();

    public static final HoeGeneric quartzHoe = new ItemQuartzHoe();
    public static final HoeGeneric obsidianHoe = new ItemObsidianHoe();
    public static final HoeGeneric emeraldHoe = new ItemEmeraldHoe();
    public static final HoeGeneric lapisHoe = new ItemLapisHoe();
    public static final HoeGeneric bronzeHoe = new ItemBronzeHoe();
    public static final HoeGeneric coalHoe = new ItemCoalHoe();
    public static final HoeGeneric glowstoneHoe = new ItemGlowstoneHoe();
    public static final HoeGeneric adamantiumHoe = new ItemAdamantiumHoe();
    public static final HoeGeneric silkHoe = new ItemSilkHoe();
    public static final HoeGeneric redstoneHoe = new ItemRedstoneHoe();

    public static final SwordGeneric quartzSword = new ItemQuartzSword();
    public static final SwordGeneric obsidianSword = new ItemObsidianSword();
    public static final SwordGeneric emeraldSword = new ItemEmeraldSword();
    public static final SwordGeneric lapisSword = new ItemLapisSword();
    public static final SwordGeneric bronzeSword = new ItemBronzeSword();
    public static final SwordGeneric coalSword = new ItemCoalSword();
    public static final SwordGeneric glowstoneSword = new ItemGlowstoneSword();
    public static final SwordGeneric adamantiumSword = new ItemAdamantiumSword();
    public static final SwordGeneric silkSword = new ItemSilkSword();
    public static final SwordGeneric redstoneSword = new ItemRedstoneSword();

    public static final ItemFT obsidianIngot = new ItemObsidianIngot();
    public static final ItemFT emeraldCrystal = new ItemEmeraldCrystal();
    public static final ItemFT lapisCrystal = new ItemLapisCrystal();
    public static final ItemFT bronzeIngot = new ItemBronzeIngot();
    public static final ItemFT coalIngot = new ItemCoalIngot();
    public static final ItemFT glowstoneIngot = new ItemGlowstoneIngot();
    public static final ItemFT adamantiumIngot = new ItemAdamantiumIngot();
    public static final ItemFT expShard = new ItemExpShard();
    public static final ItemFT silkGem = new ItemSilkGem();
    public static final ItemFT redstoneCrystal = new ItemRedstoneCrystal();

    public static final ItemArmorFT quartzHelmet = new ItemArmorQuartz(helmet);
    public static final ItemArmorFT obsidianHelmet = new ItemArmorObsidian(helmet);
    public static final ItemArmorFT emeraldHelmet = new ItemArmorEmerald(helmet);
    public static final ItemArmorFT lapisHelmet = new ItemArmorLapis(helmet);
    public static final ItemArmorFT bronzeHelmet = new ItemArmorBronze(helmet);
    public static final ItemArmorFT coalHelmet = new ItemArmorCoal(helmet);
    public static final ItemArmorFT glowstoneHelmet = new ItemArmorGlowstone(helmet);
    public static final ItemArmorFT redstoneHelmet = new ItemArmorRedstone(helmet);

    public static final ItemArmorFT quartzChestplate = new ItemArmorQuartz(chestplate);
    public static final ItemArmorFT obsidianChestplate = new ItemArmorObsidian(chestplate);
    public static final ItemArmorFT emeraldChestplate = new ItemArmorEmerald(chestplate);
    public static final ItemArmorFT lapisChestplate = new ItemArmorLapis(chestplate);
    public static final ItemArmorFT bronzeChestplate = new ItemArmorBronze(chestplate);
    public static final ItemArmorFT coalChestplate = new ItemArmorCoal(chestplate);
    public static final ItemArmorFT glowstoneChestplate = new ItemArmorGlowstone(chestplate);
    public static final ItemArmorFT redstoneChestplate = new ItemArmorRedstone(chestplate);

    public static final ItemArmorFT quartzLeggings = new ItemArmorQuartz(leggings);
    public static final ItemArmorFT obsidianLeggings = new ItemArmorObsidian(leggings);
    public static final ItemArmorFT emeraldLeggings = new ItemArmorEmerald(leggings);
    public static final ItemArmorFT lapisLeggings = new ItemArmorLapis(leggings);
    public static final ItemArmorFT bronzeLeggings = new ItemArmorBronze(leggings);
    public static final ItemArmorFT coalLeggings = new ItemArmorCoal(leggings);
    public static final ItemArmorFT glowstoneLeggings = new ItemArmorGlowstone(leggings);
    public static final ItemArmorFT redstoneLeggings = new ItemArmorRedstone(leggings);

    public static final ItemArmorFT quartzBoots = new ItemArmorQuartz(boots);
    public static final ItemArmorFT obsidianBoots = new ItemArmorObsidian(boots);
    public static final ItemArmorFT emeraldBoots = new ItemArmorEmerald(boots);
    public static final ItemArmorFT lapisBoots = new ItemArmorLapis(boots);
    public static final ItemArmorFT bronzeBoots = new ItemArmorBronze(boots);
    public static final ItemArmorFT coalBoots = new ItemArmorCoal(boots);
    public static final ItemArmorFT glowstoneBoots = new ItemArmorGlowstone(boots);
    public static final ItemArmorFT redstoneBoots = new ItemArmorRedstone(boots);

    public static final ItemBowFT quartzBow = new ItemQuartzBow();
    public static final ItemBowFT obsidianBow = new ItemObsidianBow();
    public static final ItemBowFT emeraldBow = new ItemEmeraldBow();
    public static final ItemBowFT lapisBow = new ItemLapisBow();
    public static final ItemBowFT bronzeBow = new ItemBronzeBow();
    public static final ItemBowFT coalBow = new ItemCoalBow();
    public static final ItemBowFT glowstoneBow = new ItemGlowstoneBow();
    public static final ItemBowFT adamantiumBow = new ItemAdamantiumBow();

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
