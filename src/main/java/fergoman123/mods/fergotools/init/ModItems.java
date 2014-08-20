package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.item.ItemExpCollector;
import fergoman123.mods.fergotools.item.armor.*;
import fergoman123.mods.fergotools.item.axe.*;
import fergoman123.mods.fergotools.item.bow.*;
import fergoman123.mods.fergotools.item.hoe.*;
import fergoman123.mods.fergotools.item.materials.*;
import fergoman123.mods.fergotools.item.pickaxe.*;
import fergoman123.mods.fergotools.item.shears.*;
import fergoman123.mods.fergotools.item.shovel.*;
import fergoman123.mods.fergotools.item.sword.*;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.base.ItemBowFT;
import fergoman123.mods.fergotools.util.base.ItemFT;
import fergoman123.mods.fergotools.util.tool.*;
import fergoman123.mods.fergoutil.helper.RegisterHelper;
import fergoman123.mods.fergoutil.item.Armor;
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

    public static final Item[] quartzToolList = new Item[]{quartzPickaxe, quartzShovel, quartzAxe, quartzHoe, quartzSword};
    public static final Item[] obsidianToolList = new Item[]{obsidianPickaxe, obsidianShovel, obsidianAxe, obsidianHoe, obsidianSword};
    public static final Item[] emeraldToolList = new Item[]{emeraldPickaxe, emeraldShovel, emeraldAxe, emeraldHoe, emeraldSword};
    public static final Item[] lapisToolList = new Item[]{lapisPickaxe, lapisShovel, lapisAxe, lapisHoe, lapisSword};
    public static final Item[] bronzeToolList = new Item[]{bronzePickaxe, bronzeShovel, bronzeAxe, bronzeHoe, bronzeSword};
    public static final Item[] coalToolList = new Item[]{coalPickaxe, coalShovel, coalAxe, coalHoe, coalSword};
    public static final Item[] glowstoneToolList = new Item[]{glowstonePickaxe, glowstoneShovel, glowstoneAxe, glowstoneHoe, glowstoneSword};
    public static final Item[] adamantiumToolList = new Item[]{adamantiumPickaxe, adamantiumShovel, adamantiumAxe, adamantiumHoe, adamantiumSword};
    public static final Item[] silkToolList = new Item[]{silkPickaxe, silkShovel, silkAxe, silkHoe, silkSword};
    public static final Item[] redstoneToolList = new Item[]{redstonePickaxe, redstoneShovel, redstoneAxe, redstoneHoe, redstoneSword};

    public static final ItemBowFT bowQuartz = new ItemQuartzBow();
    public static final ItemBowFT bowObsidian = new ItemObsidianBow();
    public static final ItemBowFT bowEmerald = new ItemEmeraldBow();
    public static final ItemBowFT bowLapis = new ItemLapisBow();
    public static final ItemBowFT bowBronze = new ItemBronzeBow();
    public static final ItemBowFT bowCoal = new ItemCoalBow();
    public static final ItemBowFT bowGlowstone = new ItemGlowstoneBow();
    public static final ItemBowFT bowAdamantium = new ItemAdamantiumBow();

    public static final Item[] bowList = new Item[]{bowQuartz, bowObsidian, bowEmerald, bowLapis, bowBronze, bowCoal, bowGlowstone, bowAdamantium};

    public static final ItemFT ingotObsidian = new ItemObsidianIngot();
    public static final ItemFT emeraldCrystal = new ItemEmeraldCrystal();
    public static final ItemFT lapisCrystal = new ItemLapisCrystal();
    public static final ItemFT ingotBronze = new ItemBronzeIngot();
    public static final ItemFT ingotCoal = new ItemCoalIngot();
    public static final ItemFT ingotGlowstone = new ItemGlowstoneIngot();
    public static final ItemFT ingotAdamantium = new ItemAdamantiumIngot();
    public static final ItemFT redstoneCrystal = new ItemRedstoneCrystal();
    public static final ItemFT silkGem = new ItemSilkGem();
    public static final ItemFT expShard = new ItemExpShard();
    public static final ItemFT expCollector = new ItemExpCollector();

    public static final Item[] itemsList = new Item[]{ingotObsidian, emeraldCrystal, lapisCrystal, ingotBronze, ingotCoal, ingotGlowstone, ingotAdamantium, redstoneCrystal, silkGem, expShard, expCollector};

    public static final ItemArmorFT quartzHelmet = new ItemArmorQuartz(Armor.EnumArmorType.HELMET);
    public static final ItemArmorFT quartzChestplate = new ItemArmorQuartz(Armor.EnumArmorType.CHEST);
    public static final ItemArmorFT quartzLeggings = new ItemArmorQuartz(Armor.EnumArmorType.LEGS);
    public static final ItemArmorFT quartzBoots = new ItemArmorQuartz(Armor.EnumArmorType.BOOTS);

    public static final ItemArmorFT obsidianHelmet = new ItemArmorObsidian(Armor.EnumArmorType.HELMET);
    public static final ItemArmorFT obsidianChestplate = new ItemArmorObsidian(Armor.EnumArmorType.CHEST);
    public static final ItemArmorFT obsidianLeggings = new ItemArmorObsidian(Armor.EnumArmorType.LEGS);
    public static final ItemArmorFT obsidianBoots = new ItemArmorObsidian(Armor.EnumArmorType.BOOTS);

    public static final ItemArmorFT emeraldHelmet = new ItemArmorEmerald(Armor.EnumArmorType.HELMET);
    public static final ItemArmorFT emeraldChestplate = new ItemArmorEmerald(Armor.EnumArmorType.CHEST);
    public static final ItemArmorFT emeraldLeggings = new ItemArmorEmerald(Armor.EnumArmorType.LEGS);
    public static final ItemArmorFT emeraldBoots = new ItemArmorEmerald(Armor.EnumArmorType.BOOTS);

    public static final ItemArmorFT lapisHelmet = new ItemArmorLapis(Armor.EnumArmorType.HELMET);
    public static final ItemArmorFT lapisChestplate = new ItemArmorLapis(Armor.EnumArmorType.CHEST);
    public static final ItemArmorFT lapisLeggings = new ItemArmorLapis(Armor.EnumArmorType.LEGS);
    public static final ItemArmorFT lapisBoots = new ItemArmorLapis(Armor.EnumArmorType.BOOTS);

    public static final ItemArmorFT bronzeHelmet = new ItemArmorBronze(Armor.EnumArmorType.HELMET);
    public static final ItemArmorFT bronzeChestplate = new ItemArmorBronze(Armor.EnumArmorType.CHEST);
    public static final ItemArmorFT bronzeLeggings = new ItemArmorBronze(Armor.EnumArmorType.LEGS);
    public static final ItemArmorFT bronzeBoots = new ItemArmorBronze(Armor.EnumArmorType.BOOTS);

    public static final ItemArmorFT coalHelmet = new ItemArmorCoal(Armor.EnumArmorType.HELMET);
    public static final ItemArmorFT coalChestplate = new ItemArmorCoal(Armor.EnumArmorType.CHEST);
    public static final ItemArmorFT coalLeggings = new ItemArmorCoal(Armor.EnumArmorType.LEGS);
    public static final ItemArmorFT coalBoots = new ItemArmorCoal(Armor.EnumArmorType.BOOTS);

    public static final ItemArmorFT glowstoneHelmet = new ItemArmorGlowstone(Armor.EnumArmorType.HELMET);
    public static final ItemArmorFT glowstoneChestplate = new ItemArmorGlowstone(Armor.EnumArmorType.CHEST);
    public static final ItemArmorFT glowstoneLeggings = new ItemArmorGlowstone(Armor.EnumArmorType.LEGS);
    public static final ItemArmorFT glowstoneBoots = new ItemArmorGlowstone(Armor.EnumArmorType.BOOTS);

    public static final ItemArmorFT redstoneHelmet = new ItemArmorRedstone(Armor.EnumArmorType.HELMET);
    public static final ItemArmorFT redstoneChestplate = new ItemArmorRedstone(Armor.EnumArmorType.CHEST);
    public static final ItemArmorFT redstoneLeggings = new ItemArmorRedstone(Armor.EnumArmorType.LEGS);
    public static final ItemArmorFT redstoneBoots = new ItemArmorRedstone(Armor.EnumArmorType.BOOTS);

    public static final ItemArmorFT adamantiumHelmet = new ItemArmorAdamantium(Armor.EnumArmorType.HELMET);
    public static final ItemArmorFT adamantiumChestplate = new ItemArmorAdamantium(Armor.EnumArmorType.CHEST);
    public static final ItemArmorFT adamantiumLeggings = new ItemArmorAdamantium(Armor.EnumArmorType.LEGS);
    public static final ItemArmorFT adamantiumBoots = new ItemArmorAdamantium(Armor.EnumArmorType.BOOTS);

    public static final Item[] quartzArmorList = new Item[]{quartzHelmet, quartzChestplate, quartzLeggings, quartzBoots};
    public static final Item[] obsidianArmorList = new Item[]{obsidianHelmet, obsidianChestplate, obsidianLeggings, obsidianBoots};
    public static final Item[] emeraldArmorList = new Item[]{emeraldHelmet, emeraldChestplate, emeraldLeggings, emeraldBoots};
    public static final Item[] lapisArmorList = new Item[]{lapisHelmet, lapisChestplate, lapisLeggings, lapisBoots};
    public static final Item[] bronzeArmorList = new Item[]{bronzeHelmet, bronzeChestplate, bronzeLeggings, bronzeBoots};
    public static final Item[] coalArmorList = new Item[]{coalHelmet, coalChestplate, coalLeggings, coalBoots};
    public static final Item[] glowstoneArmorList = new Item[]{glowstoneHelmet, glowstoneChestplate, glowstoneLeggings, glowstoneBoots};
    public static final Item[] redstoneArmorList = new Item[]{redstoneHelmet, redstoneChestplate, redstoneLeggings, redstoneBoots};
    public static final Item[] adamantiumArmorList = new Item[]{adamantiumHelmet, adamantiumChestplate, adamantiumLeggings, adamantiumBoots};

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
        RegisterHelper.registerItem(emeraldCrystal, Names.Items.emeraldCrystal);
        RegisterHelper.registerItem(lapisCrystal, Names.Items.lapisCrystal);
        RegisterHelper.registerItem(ingotBronze, Names.Items.ingotBronze);
        RegisterHelper.registerItem(ingotCoal, Names.Items.ingotCoal);
        RegisterHelper.registerItem(ingotGlowstone, Names.Items.ingotGlowstone);
        RegisterHelper.registerItem(ingotAdamantium, Names.Items.ingotAdamantium);
        RegisterHelper.registerItem(silkGem, Names.Items.silkGem);
        RegisterHelper.registerItem(redstoneCrystal, Names.Items.redstoneCrystal);
        RegisterHelper.registerItem(expShard, Names.Items.expShard);
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
    }
}
