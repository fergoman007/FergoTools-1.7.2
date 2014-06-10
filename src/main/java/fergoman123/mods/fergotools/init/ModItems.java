package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.item.armor.*;
import fergoman123.mods.fergotools.item.axe.*;
import fergoman123.mods.fergotools.item.bow.*;
import fergoman123.mods.fergotools.item.hoe.*;
import fergoman123.mods.fergotools.item.materials.*;
import fergoman123.mods.fergotools.item.pickaxe.*;
import fergoman123.mods.fergotools.item.shovel.*;
import fergoman123.mods.fergotools.item.sword.*;
import fergoman123.mods.fergotools.lib.Strings;
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
        RegisterHelper.registerItem(ModItems.quartzPickaxe, Strings.ToolStrings.quartzPickaxe);
        RegisterHelper.registerItem(ModItems.quartzShovel, Strings.ToolStrings.quartzShovel);
        RegisterHelper.registerItem(ModItems.quartzAxe, Strings.ToolStrings.quartzAxe);
        RegisterHelper.registerItem(ModItems.quartzHoe, Strings.ToolStrings.quartzHoe);
        RegisterHelper.registerItem(ModItems.quartzSword, Strings.ToolStrings.quartzSword);

        RegisterHelper.registerItem(ModItems.obsidianPickaxe, Strings.ToolStrings.obsidianPickaxe);
        RegisterHelper.registerItem(ModItems.obsidianShovel, Strings.ToolStrings.obsidianShovel);
        RegisterHelper.registerItem(ModItems.obsidianAxe, Strings.ToolStrings.obsidianAxe);
        RegisterHelper.registerItem(ModItems.obsidianHoe, Strings.ToolStrings.obsidianHoe);
        RegisterHelper.registerItem(ModItems.obsidianSword, Strings.ToolStrings.obsidianSword);

        RegisterHelper.registerItem(ModItems.emeraldPickaxe, Strings.ToolStrings.emeraldPickaxe);
        RegisterHelper.registerItem(ModItems.emeraldShovel, Strings.ToolStrings.emeraldShovel);
        RegisterHelper.registerItem(ModItems.emeraldAxe, Strings.ToolStrings.emeraldAxe);
        RegisterHelper.registerItem(ModItems.emeraldHoe, Strings.ToolStrings.emeraldHoe);
        RegisterHelper.registerItem(ModItems.emeraldSword, Strings.ToolStrings.emeraldSword);

        RegisterHelper.registerItem(ModItems.lapisPickaxe, Strings.ToolStrings.lapisPickaxe);
        RegisterHelper.registerItem(ModItems.lapisShovel, Strings.ToolStrings.lapisShovel);
        RegisterHelper.registerItem(ModItems.lapisAxe, Strings.ToolStrings.lapisAxe);
        RegisterHelper.registerItem(ModItems.lapisHoe, Strings.ToolStrings.lapisHoe);
        RegisterHelper.registerItem(ModItems.lapisSword, Strings.ToolStrings.lapisSword);

        RegisterHelper.registerItem(ModItems.bronzePickaxe, Strings.ToolStrings.bronzePickaxe);
        RegisterHelper.registerItem(ModItems.bronzeShovel, Strings.ToolStrings.bronzeShovel);
        RegisterHelper.registerItem(ModItems.bronzeAxe, Strings.ToolStrings.bronzeAxe);
        RegisterHelper.registerItem(ModItems.bronzeHoe, Strings.ToolStrings.bronzeHoe);
        RegisterHelper.registerItem(ModItems.bronzeSword, Strings.ToolStrings.bronzeSword);

        RegisterHelper.registerItem(ModItems.coalPickaxe, Strings.ToolStrings.coalPickaxe);
        RegisterHelper.registerItem(ModItems.coalShovel, Strings.ToolStrings.coalShovel);
        RegisterHelper.registerItem(ModItems.coalAxe, Strings.ToolStrings.coalAxe);
        RegisterHelper.registerItem(ModItems.coalHoe, Strings.ToolStrings.coalHoe);
        RegisterHelper.registerItem(ModItems.coalSword, Strings.ToolStrings.coalSword);

        RegisterHelper.registerItem(ModItems.glowstonePickaxe, Strings.ToolStrings.glowstonePickaxe);
        RegisterHelper.registerItem(ModItems.glowstoneShovel, Strings.ToolStrings.glowstoneShovel);
        RegisterHelper.registerItem(ModItems.glowstoneAxe, Strings.ToolStrings.glowstoneAxe);
        RegisterHelper.registerItem(ModItems.glowstoneHoe, Strings.ToolStrings.glowstoneHoe);
        RegisterHelper.registerItem(ModItems.glowstoneSword, Strings.ToolStrings.glowstoneSword);

        RegisterHelper.registerItem(ModItems.adamantiumPickaxe, Strings.ToolStrings.adamantiumPickaxe);
        RegisterHelper.registerItem(ModItems.adamantiumShovel, Strings.ToolStrings.adamantiumShovel);
        RegisterHelper.registerItem(ModItems.adamantiumAxe, Strings.ToolStrings.adamantiumAxe);
        RegisterHelper.registerItem(ModItems.adamantiumHoe, Strings.ToolStrings.adamantiumHoe);
        RegisterHelper.registerItem(ModItems.adamantiumSword, Strings.ToolStrings.adamantiumSword);

        RegisterHelper.registerItem(ModItems.silkPickaxe, Strings.ToolStrings.silkPickaxe);
        RegisterHelper.registerItem(ModItems.silkShovel, Strings.ToolStrings.silkShovel);
        RegisterHelper.registerItem(ModItems.silkAxe, Strings.ToolStrings.silkAxe);
        RegisterHelper.registerItem(ModItems.silkHoe, Strings.ToolStrings.silkHoe);
        RegisterHelper.registerItem(ModItems.silkSword, Strings.ToolStrings.silkSword);

        RegisterHelper.registerItem(ModItems.redstonePickaxe, Strings.ToolStrings.redstonePickaxe);
        RegisterHelper.registerItem(ModItems.redstoneShovel, Strings.ToolStrings.redstoneShovel);
        RegisterHelper.registerItem(ModItems.redstoneAxe, Strings.ToolStrings.redstoneAxe);
        RegisterHelper.registerItem(ModItems.redstoneHoe, Strings.ToolStrings.redstoneHoe);
        RegisterHelper.registerItem(ModItems.redstoneSword, Strings.ToolStrings.redstoneSword);

        RegisterHelper.registerItem(ModItems.obsidianIngot, Strings.ItemStrings.ingotObsidian);
        RegisterHelper.registerItem(ModItems.emeraldCrystal, Strings.ItemStrings.emeraldCrystal);
        RegisterHelper.registerItem(ModItems.lapisCrystal, Strings.ItemStrings.lapisCrystal);
        RegisterHelper.registerItem(ModItems.bronzeIngot, Strings.ItemStrings.ingotBronze);
        RegisterHelper.registerItem(ModItems.coalIngot, Strings.ItemStrings.ingotCoal);
        RegisterHelper.registerItem(ModItems.glowstoneIngot, Strings.ItemStrings.ingotGlowstone);
        RegisterHelper.registerItem(ModItems.adamantiumIngot, Strings.ItemStrings.ingotAdamantium);
        RegisterHelper.registerItem(ModItems.silkGem, Strings.ItemStrings.silkGem);
        RegisterHelper.registerItem(ModItems.redstoneCrystal, Strings.ItemStrings.redstoneCrystal);
        RegisterHelper.registerItem(ModItems.expShard, Strings.ItemStrings.expShard);

        RegisterHelper.registerItem(ModItems.quartzHelmet, Strings.ArmorStrings.quartzHelmet);
        RegisterHelper.registerItem(ModItems.quartzChestplate, Strings.ArmorStrings.quartzChest);
        RegisterHelper.registerItem(ModItems.quartzLeggings, Strings.ArmorStrings.quartzLegs);
        RegisterHelper.registerItem(ModItems.quartzBoots, Strings.ArmorStrings.quartzBoots);

        RegisterHelper.registerItem(ModItems.obsidianHelmet, Strings.ArmorStrings.obsidianHelmet);
        RegisterHelper.registerItem(ModItems.obsidianChestplate, Strings.ArmorStrings.obsidianChest);
        RegisterHelper.registerItem(ModItems.obsidianLeggings, Strings.ArmorStrings.obsidianLegs);
        RegisterHelper.registerItem(ModItems.obsidianBoots, Strings.ArmorStrings.obsidianBoots);

        RegisterHelper.registerItem(ModItems.emeraldHelmet, Strings.ArmorStrings.emeraldHelmet);
        RegisterHelper.registerItem(ModItems.emeraldChestplate, Strings.ArmorStrings.emeraldChest);
        RegisterHelper.registerItem(ModItems.emeraldLeggings, Strings.ArmorStrings.emeraldLegs);
        RegisterHelper.registerItem(ModItems.emeraldBoots, Strings.ArmorStrings.emeraldBoots);

        RegisterHelper.registerItem(ModItems.lapisHelmet, Strings.ArmorStrings.lapisHelmet);
        RegisterHelper.registerItem(ModItems.lapisChestplate, Strings.ArmorStrings.lapisChest);
        RegisterHelper.registerItem(ModItems.lapisLeggings, Strings.ArmorStrings.lapisLegs);
        RegisterHelper.registerItem(ModItems.lapisBoots, Strings.ArmorStrings.lapisBoots);

        RegisterHelper.registerItem(ModItems.bronzeHelmet, Strings.ArmorStrings.bronzeHelmet);
        RegisterHelper.registerItem(ModItems.bronzeChestplate, Strings.ArmorStrings.bronzeChest);
        RegisterHelper.registerItem(ModItems.bronzeLeggings, Strings.ArmorStrings.bronzeLegs);
        RegisterHelper.registerItem(ModItems.bronzeBoots, Strings.ArmorStrings.bronzeBoots);

        RegisterHelper.registerItem(ModItems.coalHelmet, Strings.ArmorStrings.coalHelmet);
        RegisterHelper.registerItem(ModItems.coalChestplate, Strings.ArmorStrings.coalChest);
        RegisterHelper.registerItem(ModItems.coalLeggings, Strings.ArmorStrings.coalLegs);
        RegisterHelper.registerItem(ModItems.coalBoots, Strings.ArmorStrings.coalBoots);

        RegisterHelper.registerItem(ModItems.glowstoneHelmet, Strings.ArmorStrings.glowstoneHelmet);
        RegisterHelper.registerItem(ModItems.glowstoneChestplate, Strings.ArmorStrings.glowstoneChest);
        RegisterHelper.registerItem(ModItems.glowstoneLeggings, Strings.ArmorStrings.glowstoneLegs);
        RegisterHelper.registerItem(ModItems.glowstoneBoots, Strings.ArmorStrings.glowstoneBoots);

        RegisterHelper.registerItem(ModItems.redstoneHelmet, Strings.ArmorStrings.redstoneHelmet);
        RegisterHelper.registerItem(ModItems.redstoneChestplate, Strings.ArmorStrings.redstoneChest);
        RegisterHelper.registerItem(ModItems.redstoneLeggings, Strings.ArmorStrings.redstoneLegs);
        RegisterHelper.registerItem(ModItems.redstoneBoots, Strings.ArmorStrings.redstoneBoots);

        RegisterHelper.registerItem(ModItems.quartzBow, Strings.BowStrings.bowQuartz);
        RegisterHelper.registerItem(ModItems.obsidianBow, Strings.BowStrings.bowObsidian);
        RegisterHelper.registerItem(ModItems.emeraldBow, Strings.BowStrings.bowEmerald);
        RegisterHelper.registerItem(ModItems.lapisBow, Strings.BowStrings.bowLapis);
        RegisterHelper.registerItem(ModItems.bronzeBow, Strings.BowStrings.bowBronze);
        RegisterHelper.registerItem(ModItems.coalBow, Strings.BowStrings.bowCoal);
        RegisterHelper.registerItem(ModItems.glowstoneBow, Strings.BowStrings.bowGlowstone);
        RegisterHelper.registerItem(ModItems.adamantiumBow, Strings.BowStrings.bowAdamantium);
	}
}
