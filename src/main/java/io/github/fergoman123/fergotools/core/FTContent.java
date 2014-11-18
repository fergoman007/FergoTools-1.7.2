package io.github.fergoman123.fergotools.core;

import io.github.fergoman123.fergotools.core.block.BlockFergoGlass;
import io.github.fergoman123.fergotools.core.block.furnace.*;
import io.github.fergoman123.fergotools.core.block.log.*;
import io.github.fergoman123.fergotools.core.block.ore.*;
import io.github.fergoman123.fergotools.core.block.plank.*;
import io.github.fergoman123.fergotools.core.block.stair.*;
import io.github.fergoman123.fergotools.core.block.storage.*;
import io.github.fergoman123.fergotools.core.block.workbench.*;
import io.github.fergoman123.fergotools.core.item.armor.*;
import io.github.fergoman123.fergotools.core.item.axe.*;
import io.github.fergoman123.fergotools.core.item.bow.*;
import io.github.fergoman123.fergotools.core.item.exp.*;
import io.github.fergoman123.fergotools.core.item.hoe.*;
import io.github.fergoman123.fergotools.core.item.materials.*;
import io.github.fergoman123.fergotools.core.item.pickaxe.*;
import io.github.fergoman123.fergotools.core.item.shears.*;
import io.github.fergoman123.fergotools.core.item.shovel.*;
import io.github.fergoman123.fergotools.core.item.stick.*;
import io.github.fergoman123.fergotools.core.item.sword.*;
import io.github.fergoman123.fergotools.core.itemblock.block.*;
import io.github.fergoman123.fergotools.core.itemblock.furnaceactive.*;
import io.github.fergoman123.fergotools.core.itemblock.furnaceidle.*;
import io.github.fergoman123.fergotools.core.itemblock.log.*;
import io.github.fergoman123.fergotools.core.itemblock.ore.*;
import io.github.fergoman123.fergotools.core.itemblock.plank.*;
import io.github.fergoman123.fergotools.core.itemblock.stair.*;
import io.github.fergoman123.fergotools.core.tileentity.*;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.reference.strings.FurnaceType;
import io.github.fergoman123.fergotools.reference.strings.Tile;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT.ArmorNames;
import io.github.fergoman123.fergotools.util.item.Materials.Armor;
import io.github.fergoman123.fergotools.util.item.Materials.Tools;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import static io.github.fergoman123.fergoutil.helper.RegisterHelper.*;

public class FTContent
{
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

    public static Item shardExp;
    public static Item expCollector;

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

    public static Item bowQuartz;
    public static Item bowObsidian;
    public static Item bowEmerald;
    public static Item bowLapis;
    public static Item bowBronze;
    public static Item bowCoal;
    public static Item bowGlowstone;
    public static Item bowAdamantium;

    public static Item quartzShears;
    public static Item obsidianShears;
    public static Item emeraldShears;
    public static Item lapisShears;
    public static Item bronzeShears;
    public static Item coalShears;
    public static Item glowstoneShears;
    public static Item adamantiumShears;
    public static Item silkShears;
    public static Item redstoneShears;

    public static Item stickObsidian;
    public static Item stickEmerald;
    public static Item stickLapis;
    public static Item stickBronze;
    public static Item stickCoal;
    public static Item stickGlowstone;
    public static Item stickAdamantium;
    public static Item stickSilk;
    public static Item stickRedstone;

    public static Block oreExperience;
    public static Block oreObsidian;
    public static Block oreGemEmerald;
    public static Block oreGemLapis;
    public static Block oreBronze;
    public static Block oreAdamantium;
    public static Block oreRedstone;

    public static Block blockExperience;
    public static Block blockExpCollector;
    public static Block blockObsidian;
    public static Block blockEmerald;
    public static Block blockLapis;
    public static Block blockBronze;
    public static Block blockCoal;
    public static Block blockGlowstone;
    public static Block blockAdamantium;
    public static Block blockSilkGem;
    public static Block blockRedstone;

    public static Block quartzFurnaceIdle;
    public static Block obsidianFurnaceIdle;
    public static Block emeraldFurnaceIdle;
    public static Block lapisFurnaceIdle;
    public static Block bronzeFurnaceIdle;
    public static Block coalFurnaceIdle;
    public static Block glowstoneFurnaceIdle;
    public static Block adamantiumFurnaceIdle;
    public static Block silkFurnaceIdle;
    public static Block redstoneFurnaceIdle;
    public static Block maceratorIdle;

    public static Block quartzFurnaceActive;
    public static Block obsidianFurnaceActive;
    public static Block emeraldFurnaceActive;
    public static Block lapisFurnaceActive;
    public static Block bronzeFurnaceActive;
    public static Block coalFurnaceActive;
    public static Block glowstoneFurnaceActive;
    public static Block adamantiumFurnaceActive;
    public static Block silkFurnaceActive;
    public static Block redstoneFurnaceActive;
    public static Block maceratorActive;

    public static Block logObsidian;
    public static Block logEmerald;
    public static Block logLapis;
    public static Block logBronze;
    public static Block logCoal;
    public static Block logGlowstone;
    public static Block logAdamantium;
    public static Block logSilk;
    public static Block logRedstone;

    public static Block plankObsidian;
    public static Block plankEmerald;
    public static Block plankLapis;
    public static Block plankBronze;
    public static Block plankCoal;
    public static Block plankGlowstone;
    public static Block plankAdamantium;
    public static Block plankSilk;
    public static Block plankRedstone;

    public static Block stairObsidian;
    public static Block stairEmerald;
    public static Block stairLapis;
    public static Block stairBronze;
    public static Block stairCoal;
    public static Block stairGlowstone;
    public static Block stairAdamantium;
    public static Block stairSilk;
    public static Block stairRedstone;

    public static Block obsidianWorkbench;
    public static Block emeraldWorkbench;
    public static Block lapisWorkbench;
    public static Block bronzeWorkbench;
    public static Block coalWorkbench;
    public static Block glowstoneWorkbench;
    public static Block adamantiumWorkbench;
    public static Block silkWorkbench;
    public static Block redstoneWorkbench;

    public static Block blockFergoGlass;


    public static void init()
    {
        quartzPickaxe = new ItemQuartzPickaxe(Tools.quartz, Tools.quartz.getMaxUses(), ItemNames.quartzPickaxe);
        quartzShovel = new ItemQuartzShovel(Tools.quartz, Tools.quartz.getMaxUses(), ItemNames.quartzShovel);
        quartzAxe = new ItemQuartzAxe(Tools.quartz, Tools.quartz.getMaxUses(), ItemNames.quartzAxe);
        quartzHoe = new ItemQuartzHoe(Tools.quartz, Tools.quartz.getMaxUses(), ItemNames.quartzHoe);
        quartzSword = new ItemQuartzSword(Tools.quartz, Tools.quartz.getMaxUses(), ItemNames.quartzSword);

        obsidianPickaxe = new ItemObsidianPickaxe(Tools.obsidian, Tools.obsidian.getMaxUses(), ItemNames.obsidianPickaxe);
        obsidianShovel = new ItemObsidianShovel(Tools.obsidian, Tools.obsidian.getMaxUses(), ItemNames.obsidianShovel);
        obsidianAxe = new ItemObsidianAxe(Tools.obsidian, Tools.obsidian.getMaxUses(), ItemNames.obsidianAxe);
        obsidianHoe = new ItemObsidianHoe(Tools.obsidian, Tools.obsidian.getMaxUses(), ItemNames.obsidianHoe);
        obsidianSword = new ItemObsidianSword(Tools.obsidian, Tools.obsidian.getMaxUses(), ItemNames.obsidianSword);

        emeraldPickaxe = new ItemEmeraldPickaxe(Tools.emerald, Tools.emerald.getMaxUses(), ItemNames.emeraldPickaxe);
        emeraldShovel = new ItemEmeraldShovel(Tools.emerald, Tools.emerald.getMaxUses(), ItemNames.emeraldShovel);
        emeraldAxe = new ItemEmeraldAxe(Tools.emerald, Tools.emerald.getMaxUses(), ItemNames.emeraldAxe);
        emeraldHoe = new ItemEmeraldHoe(Tools.emerald, Tools.emerald.getMaxUses(), ItemNames.emeraldHoe);
        emeraldSword = new ItemEmeraldSword(Tools.emerald, Tools.emerald.getMaxUses(), ItemNames.emeraldSword);

        lapisPickaxe = new ItemLapisPickaxe(Tools.lapis, Tools.lapis.getMaxUses(), ItemNames.lapisPickaxe);
        lapisShovel = new ItemLapisShovel(Tools.lapis, Tools.lapis.getMaxUses(), ItemNames.lapisShovel);
        lapisAxe = new ItemLapisAxe(Tools.lapis, Tools.lapis.getMaxUses(), ItemNames.lapisAxe);
        lapisHoe = new ItemLapisHoe(Tools.lapis, Tools.lapis.getMaxUses(), ItemNames.lapisHoe);
        lapisSword = new ItemLapisSword(Tools.lapis, Tools.lapis.getMaxUses(), ItemNames.lapisSword);

        bronzePickaxe = new ItemBronzePickaxe(Tools.bronze, Tools.bronze.getMaxUses(), ItemNames.bronzePickaxe);
        bronzeShovel = new ItemBronzeShovel(Tools.bronze, Tools.bronze.getMaxUses(), ItemNames.bronzeShovel);
        bronzeAxe = new ItemBronzeAxe(Tools.bronze, Tools.bronze.getMaxUses(), ItemNames.bronzeAxe);
        bronzeHoe = new ItemBronzeHoe(Tools.bronze, Tools.bronze.getMaxUses(), ItemNames.bronzeHoe);
        bronzeSword = new ItemBronzeSword(Tools.bronze, Tools.bronze.getMaxUses(), ItemNames.bronzeSword);

        coalPickaxe = new ItemCoalPickaxe(Tools.coal, Tools.coal.getMaxUses(), ItemNames.coalPickaxe);
        coalShovel = new ItemCoalShovel(Tools.coal, Tools.coal.getMaxUses(), ItemNames.coalShovel);
        coalAxe = new ItemCoalAxe(Tools.coal, Tools.coal.getMaxUses(), ItemNames.coalAxe);
        coalHoe = new ItemCoalHoe(Tools.coal, Tools.coal.getMaxUses(), ItemNames.coalHoe);
        coalSword = new ItemCoalSword(Tools.coal, Tools.coal.getMaxUses(), ItemNames.coalSword);

        glowstonePickaxe = new ItemGlowstonePickaxe(Tools.glowstone, Tools.glowstone.getMaxUses(), ItemNames.glowstonePickaxe);
        glowstoneShovel = new ItemGlowstoneShovel(Tools.glowstone, Tools.glowstone.getMaxUses(), ItemNames.glowstoneShovel);
        glowstoneAxe = new ItemGlowstoneAxe(Tools.glowstone, Tools.glowstone.getMaxUses(), ItemNames.glowstoneAxe);
        glowstoneHoe = new ItemGlowstoneHoe(Tools.glowstone, Tools.glowstone.getMaxUses(), ItemNames.glowstoneHoe);
        glowstoneSword = new ItemGlowstoneSword(Tools.glowstone, Tools.glowstone.getMaxUses(), ItemNames.glowstoneSword);

        adamantiumPickaxe = new ItemAdamantiumPickaxe(Tools.adamantium, Tools.adamantium.getMaxUses(), ItemNames.adamantiumPickaxe);
        adamantiumShovel = new ItemAdamantiumShovel(Tools.adamantium, Tools.adamantium.getMaxUses(), ItemNames.adamantiumShovel);
        adamantiumAxe = new ItemAdamantiumAxe(Tools.adamantium, Tools.adamantium.getMaxUses(), ItemNames.adamantiumAxe);
        adamantiumHoe = new ItemAdamantiumHoe(Tools.adamantium, Tools.adamantium.getMaxUses(), ItemNames.adamantiumHoe);
        adamantiumSword = new ItemAdamantiumSword(Tools.adamantium, Tools.adamantium.getMaxUses(), ItemNames.adamantiumSword);

        silkPickaxe = new ItemSilkPickaxe(Tools.silk, Tools.silk.getMaxUses(), ItemNames.silkPickaxe);
        silkShovel = new ItemSilkShovel(Tools.silk, Tools.silk.getMaxUses(), ItemNames.silkShovel);
        silkAxe = new ItemSilkAxe(Tools.silk, Tools.silk.getMaxUses(), ItemNames.silkAxe);
        silkHoe = new ItemSilkHoe(Tools.silk, Tools.silk.getMaxUses(), ItemNames.silkHoe);
        silkSword = new ItemSilkSword(Tools.silk, Tools.silk.getMaxUses(), ItemNames.silkSword);

        redstonePickaxe = new ItemRedstonePickaxe(Tools.redstone, Tools.redstone.getMaxUses(), ItemNames.redstonePickaxe);
        redstoneShovel = new ItemRedstoneShovel(Tools.redstone, Tools.redstone.getMaxUses(), ItemNames.redstoneShovel);
        redstoneAxe = new ItemRedstoneAxe(Tools.redstone, Tools.redstone.getMaxUses(), ItemNames.redstoneAxe);
        redstoneHoe = new ItemRedstoneHoe(Tools.redstone, Tools.redstone.getMaxUses(), ItemNames.redstoneHoe);
        redstoneSword = new ItemRedstoneSword(Tools.redstone, Tools.redstone.getMaxUses(), ItemNames.redstoneSword);

        ingotObsidian = new ItemObsidianIngot(ItemNames.ingotObsidian);
        gemEmerald = new ItemEmeraldGem(ItemNames.gemEmerald);
        gemLapis = new ItemLapisGem(ItemNames.gemLapis);
        ingotBronze = new ItemBronzeIngot(ItemNames.ingotBronze);
        ingotCoal = new ItemCoalIngot(ItemNames.ingotCoal);
        ingotGlowstone = new ItemGlowstoneIngot(ItemNames.ingotGlowstone);
        ingotAdamantium = new ItemAdamantiumIngot(ItemNames.ingotAdamantium);
        gemSilk = new ItemSilkGem(ItemNames.gemSilk);
        gemRedstone = new ItemRedstoneGem(ItemNames.gemRedstone);
        gemExp = new ItemGemExp(ItemNames.gemExp);
        gemExp2 = new ItemGemExp2(ItemNames.gemExp2);
        gemExp3 = new ItemGemExp3(ItemNames.gemExp3);


        shardExp = new ItemExpShard(ItemNames.shardExp);
        expCollector = new ItemExpCollector(ItemNames.expCollector);

        staffExp = new ItemStaffExp(ItemNames.staffExp);

        quartzHelmet = new ItemArmorQuartz(ArmorNames.quartz, Armor.quartzArmor, ArmorType.HELMET);
        quartzChestplate = new ItemArmorQuartz(ArmorNames.quartz, Armor.quartzArmor, ArmorType.CHEST);
        quartzLeggings = new ItemArmorQuartz(ArmorNames.quartz, Armor.quartzArmor, ArmorType.LEGS);
        quartzBoots = new ItemArmorQuartz(ArmorNames.quartz, Armor.quartzArmor, ArmorType.BOOTS);

        obsidianHelmet = new ItemArmorObsidian(ArmorNames.obsidian, Armor.obsidianArmor, ArmorType.HELMET);
        obsidianChestplate = new ItemArmorObsidian(ArmorNames.obsidian, Armor.obsidianArmor, ArmorType.CHEST);
        obsidianLeggings = new ItemArmorObsidian(ArmorNames.obsidian, Armor.obsidianArmor, ArmorType.LEGS);
        obsidianBoots = new ItemArmorObsidian(ArmorNames.obsidian, Armor.obsidianArmor, ArmorType.BOOTS);

        emeraldHelmet = new ItemArmorEmerald(ArmorNames.emerald, Armor.emeraldArmor, ArmorType.HELMET);
        emeraldChestplate = new ItemArmorEmerald(ArmorNames.emerald, Armor.emeraldArmor, ArmorType.CHEST);
        emeraldLeggings = new ItemArmorEmerald(ArmorNames.emerald, Armor.emeraldArmor, ArmorType.LEGS);
        emeraldBoots = new ItemArmorEmerald(ArmorNames.emerald, Armor.emeraldArmor, ArmorType.BOOTS);

        lapisHelmet = new ItemArmorLapis(ArmorNames.lapis, Armor.lapisArmor, ArmorType.HELMET);
        lapisChestplate = new ItemArmorLapis(ArmorNames.lapis, Armor.lapisArmor, ArmorType.CHEST);
        lapisLeggings = new ItemArmorLapis(ArmorNames.lapis, Armor.lapisArmor, ArmorType.LEGS);
        lapisBoots = new ItemArmorLapis(ArmorNames.lapis, Armor.lapisArmor, ArmorType.BOOTS);

        bronzeHelmet = new ItemArmorBronze(ArmorNames.bronze, Armor.bronzeArmor, ArmorType.HELMET);
        bronzeChestplate = new ItemArmorBronze(ArmorNames.bronze, Armor.bronzeArmor, ArmorType.CHEST);
        bronzeLeggings = new ItemArmorBronze(ArmorNames.bronze, Armor.bronzeArmor, ArmorType.LEGS);
        bronzeBoots = new ItemArmorBronze(ArmorNames.bronze, Armor.bronzeArmor, ArmorType.BOOTS);

        coalHelmet = new ItemArmorCoal(ArmorNames.coal, Armor.coalArmor, ArmorType.HELMET);
        coalChestplate = new ItemArmorCoal(ArmorNames.coal, Armor.coalArmor, ArmorType.CHEST);
        coalLeggings = new ItemArmorCoal(ArmorNames.coal, Armor.coalArmor, ArmorType.LEGS);
        coalBoots = new ItemArmorCoal(ArmorNames.coal, Armor.coalArmor, ArmorType.BOOTS);

        glowstoneHelmet = new ItemArmorGlowstone(ArmorNames.glowstone, Armor.glowstoneArmor, ArmorType.HELMET);
        glowstoneChestplate = new ItemArmorGlowstone(ArmorNames.glowstone, Armor.glowstoneArmor, ArmorType.CHEST);
        glowstoneLeggings = new ItemArmorGlowstone(ArmorNames.glowstone, Armor.glowstoneArmor, ArmorType.LEGS);
        glowstoneBoots = new ItemArmorGlowstone(ArmorNames.glowstone, Armor.glowstoneArmor, ArmorType.BOOTS);

        adamantiumHelmet = new ItemArmorAdamantium(ArmorNames.adamantium, Armor.adamantiumArmor, ArmorType.HELMET);
        adamantiumChestplate = new ItemArmorAdamantium(ArmorNames.adamantium, Armor.adamantiumArmor, ArmorType.CHEST);
        adamantiumLeggings = new ItemArmorAdamantium(ArmorNames.adamantium, Armor.adamantiumArmor, ArmorType.LEGS);
        adamantiumBoots = new ItemArmorAdamantium(ArmorNames.adamantium, Armor.adamantiumArmor, ArmorType.BOOTS);

        redstoneHelmet = new ItemArmorRedstone(ArmorNames.redstone, Armor.redstoneArmor, ArmorType.HELMET);
        redstoneChestplate = new ItemArmorRedstone(ArmorNames.redstone, Armor.redstoneArmor, ArmorType.CHEST);
        redstoneLeggings = new ItemArmorRedstone(ArmorNames.redstone, Armor.redstoneArmor, ArmorType.LEGS);
        redstoneBoots = new ItemArmorRedstone(ArmorNames.redstone, Armor.redstoneArmor, ArmorType.BOOTS);

        bowQuartz = new ItemQuartzBow(Tools.quartz.getMaxUses(), ItemNames.bowQuartz);
        bowObsidian = new ItemObsidianBow(Tools.obsidian.getMaxUses(), ItemNames.bowObsidian);
        bowEmerald = new ItemEmeraldBow(Tools.emerald.getMaxUses(), ItemNames.bowEmerald);
        bowLapis = new ItemLapisBow(Tools.lapis.getMaxUses(), ItemNames.bowLapis);
        bowBronze = new ItemBronzeBow(Tools.bronze.getMaxUses(), ItemNames.bowBronze);
        bowCoal = new ItemCoalBow(Tools.coal.getMaxUses(), ItemNames.bowCoal);
        bowGlowstone = new ItemGlowstoneBow(Tools.glowstone.getMaxUses(), ItemNames.bowGlowstone);
        bowAdamantium = new ItemAdamantiumBow(Tools.adamantium.getMaxUses(), ItemNames.bowAdamantium);

        quartzShears = new ItemQuartzShears(Tools.quartz.getMaxUses(), ItemNames.quartzShears);
        obsidianShears = new ItemObsidianShears(Tools.obsidian.getMaxUses(), ItemNames.obsidianShears);
        emeraldShears = new ItemEmeraldShears(Tools.emerald.getMaxUses(), ItemNames.emeraldShears);
        lapisShears = new ItemLapisShears(Tools.lapis.getMaxUses(), ItemNames.lapisShears);
        bronzeShears = new ItemBronzeShears(Tools.bronze.getMaxUses(), ItemNames.bronzeShears);
        coalShears = new ItemCoalShears(Tools.coal.getMaxUses(), ItemNames.coalShears);
        glowstoneShears = new ItemGlowstoneShears(Tools.glowstone.getMaxUses(), ItemNames.glowstoneShears);
        adamantiumShears = new ItemAdamantiumShears(Tools.adamantium.getMaxUses(), ItemNames.adamantiumShears);
        silkShears = new ItemSilkShears(Tools.silk.getMaxUses(),ItemNames.silkShears);
        redstoneShears = new ItemRedstoneShears(Tools.redstone.getMaxUses(), ItemNames.redstoneShears);

        stickObsidian = new ItemStickObsidian(ItemNames.stickObsidian);
        stickEmerald = new ItemStickEmerald(ItemNames.stickEmerald);
        stickLapis = new ItemStickLapis(ItemNames.stickLapis);
        stickBronze = new ItemStickBronze(ItemNames.stickBronze);
        stickCoal = new ItemStickCoal(ItemNames.stickCoal);
        stickGlowstone = new ItemStickGlowstone(ItemNames.stickGlowstone);
        stickAdamantium = new ItemStickAdamantium(ItemNames.stickAdamantium);
        stickSilk = new ItemStickSilk(ItemNames.stickSilk);
        stickRedstone = new ItemStickRedstone(ItemNames.stickRedstone);

        oreExperience = new BlockOreExperience(Material.rock, BlockNames.oreExperience);
        oreObsidian = new BlockOreObsidian(Material.rock, BlockNames.oreObsidian);
        oreGemEmerald = new BlockOreEmerald(Material.rock, BlockNames.oreEmeraldCrystal);
        oreGemLapis = new BlockOreEmerald(Material.rock, BlockNames.oreLapisCrystal);
        oreBronze = new BlockOreBronze(Material.rock, BlockNames.oreBronze);
        oreAdamantium = new BlockOreAdamantium(Material.rock, BlockNames.oreAdamantium);
        oreRedstone = new BlockOreRedstone(Material.rock, BlockNames.oreCrystalRed);

        blockExperience = new BlockExperience(Material.iron, BlockNames.blockExperience);
        blockExpCollector = new BlockExpCollector(Material.iron, BlockNames.blockExpCollector);
        blockObsidian = new BlockObsidianStorage(Material.iron, BlockNames.blockObsidian);
        blockEmerald = new BlockEmeraldCrystal(Material.iron, BlockNames.blockEmeraldCrystal);
        blockLapis = new BlockLapisCrystal(Material.iron, BlockNames.blockLapisCrystal);
        blockBronze = new BlockBronze(Material.iron, BlockNames.blockBronze);
        blockCoal = new BlockCoalStorage(Material.iron, BlockNames.blockCoal);
        blockGlowstone = new BlockGlowstoneStorage(Material.iron, BlockNames.blockGlowstone);
        blockAdamantium = new BlockAdamantium(Material.iron, BlockNames.blockAdamantium);
        blockSilkGem = new BlockSilkGem(Material.iron, BlockNames.blockSilkGem);
        blockRedstone = new BlockRedstone(Material.iron, BlockNames.blockRedstoneCrystal);

        quartzFurnaceIdle = new BlockQuartzFurnace(false, Material.rock, FurnaceType.quartzFurnace).setCreativeTab(Tabs.tabFergoFurnaces);
        obsidianFurnaceIdle = new BlockObsidianFurnace(false, Material.iron, FurnaceType.obsidianFurnace).setCreativeTab(Tabs.tabFergoFurnaces);
        emeraldFurnaceIdle = new BlockEmeraldFurnace(false, Material.iron, FurnaceType.emeraldFurnace).setCreativeTab(Tabs.tabFergoFurnaces);
        lapisFurnaceIdle = new BlockLapisFurnace(false, Material.iron, FurnaceType.lapisFurnace).setCreativeTab(Tabs.tabFergoFurnaces);
        bronzeFurnaceIdle = new BlockBronzeFurnace(false, Material.iron, FurnaceType.bronzeFurnace).setCreativeTab(Tabs.tabFergoFurnaces);
        coalFurnaceIdle = new BlockCoalFurnace(false, Material.iron, FurnaceType.coalFurnace).setCreativeTab(Tabs.tabFergoFurnaces);
        glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false, Material.glass, FurnaceType.glowstoneFurnace).setCreativeTab(Tabs.tabFergoFurnaces);
        adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false, Material.iron, FurnaceType.adamantiumFurnace).setCreativeTab(Tabs.tabFergoFurnaces);
        silkFurnaceIdle = new BlockSilkFurnace(false, Material.iron, FurnaceType.silkFurnace).setCreativeTab(Tabs.tabFergoFurnaces);
        redstoneFurnaceIdle = new BlockRedstoneFurnace(false, Material.iron, FurnaceType.redstoneFurnace).setCreativeTab(Tabs.tabFergoFurnaces);
        maceratorIdle = new BlockMacerator(false, Material.iron, FurnaceType.macerator).setCreativeTab(Tabs.tabFergoFurnaces);

        quartzFurnaceActive = new BlockQuartzFurnace(true, Material.rock, FurnaceType.quartzFurnace).setLightLevel(0.875f);
        obsidianFurnaceActive = new BlockObsidianFurnace(true, Material.iron, FurnaceType.obsidianFurnace).setLightLevel(0.875f);
        emeraldFurnaceActive = new BlockEmeraldFurnace(true, Material.iron, FurnaceType.emeraldFurnace).setLightLevel(0.875f);
        lapisFurnaceActive = new BlockLapisFurnace(true, Material.iron, FurnaceType.lapisFurnace).setLightLevel(0.875f);
        bronzeFurnaceActive = new BlockBronzeFurnace(true, Material.iron, FurnaceType.bronzeFurnace).setLightLevel(0.875f);
        coalFurnaceActive = new BlockCoalFurnace(true, Material.iron, FurnaceType.coalFurnace).setLightLevel(0.875f);
        glowstoneFurnaceActive = new BlockGlowstoneFurnace(true, Material.glass, FurnaceType.glowstoneFurnace).setLightLevel(0.875f);
        adamantiumFurnaceActive = new BlockAdamantiumFurnace(true, Material.iron, FurnaceType.adamantiumFurnace).setLightLevel(0.875f);
        silkFurnaceActive = new BlockSilkFurnace(true, Material.iron, FurnaceType.silkFurnace).setLightLevel(0.875f);
        redstoneFurnaceActive = new BlockRedstoneFurnace(true, Material.iron, FurnaceType.redstoneFurnace).setLightLevel(0.875f);
        maceratorActive = new BlockMacerator(true, Material.iron, FurnaceType.macerator).setLightLevel(0.875f);

        logObsidian = new BlockLogObsidian(BlockNames.logObsidian);
        logEmerald = new BlockLogEmerald(BlockNames.logEmerald);
        logLapis = new BlockLogLapis(BlockNames.logLapis);
        logBronze = new BlockLogBronze(BlockNames.logBronze);
        logCoal = new BlockLogCoal(BlockNames.logCoal);
        logGlowstone = new BlockLogGlowstone(BlockNames.logGlowstone);
        logAdamantium = new BlockLogAdamantium(BlockNames.logAdamantium);
        logSilk = new BlockLogSilk(BlockNames.logSilk);
        logRedstone = new BlockLogRedstone(BlockNames.logRedstone);

        plankObsidian = new BlockPlankObsidian(BlockNames.plankObsidian);
        plankEmerald = new BlockPlankEmerald(BlockNames.plankEmerald);
        plankLapis = new BlockPlankLapis(BlockNames.plankLapis);
        plankBronze = new BlockPlankBronze(BlockNames.plankBronze);
        plankCoal = new BlockPlankCoal(BlockNames.plankCoal);
        plankGlowstone = new BlockPlankGlowstone(BlockNames.plankGlowstone);
        plankAdamantium = new BlockPlankAdamantium(BlockNames.plankAdamantium);
        plankSilk = new BlockPlankSilk(BlockNames.plankSilk);
        plankRedstone = new BlockPlankRedstone(BlockNames.plankRedstone);

        stairObsidian = new BlockStairObsidian(plankObsidian, BlockNames.stairObsidian);
        stairEmerald = new BlockStairEmerald(plankEmerald, BlockNames.stairEmerald);
        stairLapis = new BlockStairLapis(plankLapis, BlockNames.stairLapis);
        stairBronze = new BlockStairBronze(plankBronze, BlockNames.stairBronze);
        stairCoal = new BlockStairCoal(plankCoal, BlockNames.stairCoal);
        stairGlowstone = new BlockStairGlowstone(plankGlowstone, BlockNames.stairGlowstone);
        stairAdamantium = new BlockStairAdamantium(plankAdamantium, BlockNames.stairAdamantium);
        stairSilk = new BlockStairSilk(plankSilk, BlockNames.stairSilk);
        stairRedstone = new BlockStairRedstone(plankRedstone, BlockNames.stairRedstone);

        obsidianWorkbench = new BlockObsidianWorkbench(BlockNames.obsidianWorkbench);
        emeraldWorkbench = new BlockEmeraldWorkbench(BlockNames.emeraldWorkbench);
        lapisWorkbench = new BlockLapisWorkbench(BlockNames.lapisWorkbench);
        bronzeWorkbench = new BlockBronzeWorkbench(BlockNames.bronzeWorkbench);
        coalWorkbench = new BlockCoalWorkbench(BlockNames.coalWorkbench);
        glowstoneWorkbench = new BlockGlowstoneWorkbench(BlockNames.glowstoneWorkbench);
        adamantiumWorkbench = new BlockAdamantiumWorkbench(BlockNames.adamantiumWorkbench);
        silkWorkbench = new BlockSilkWorkbench(BlockNames.silkWorkbench);
        redstoneWorkbench = new BlockRedstoneWorkbench(BlockNames.redstoneWorkbench);

        blockFergoGlass = new BlockFergoGlass(BlockNames.blockFergoGlass);
    }

    public static void registerItems()
    {
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

        registerItem(shardExp, ItemNames.shardExp);
        registerItem(expCollector, ItemNames.expCollector);

        registerItem(staffExp, ItemNames.staffExp);

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

        registerItem(bowQuartz, ItemNames.bowQuartz);
        registerItem(bowObsidian, ItemNames.bowObsidian);
        registerItem(bowEmerald, ItemNames.bowEmerald);
        registerItem(bowLapis, ItemNames.bowLapis);
        registerItem(bowBronze, ItemNames.bowBronze);
        registerItem(bowCoal, ItemNames.bowCoal);
        registerItem(bowGlowstone, ItemNames.bowGlowstone);
        registerItem(bowAdamantium, ItemNames.bowAdamantium);

        registerItem(quartzShears, ItemNames.quartzShears);
        registerItem(obsidianShears, ItemNames.obsidianShears);
        registerItem(emeraldShears, ItemNames.emeraldShears);
        registerItem(lapisShears, ItemNames.lapisShears);
        registerItem(bronzeShears, ItemNames.bronzeShears);
        registerItem(coalShears, ItemNames.coalShears);
        registerItem(glowstoneShears, ItemNames.glowstoneShears);
        registerItem(adamantiumShears, ItemNames.adamantiumShears);
        registerItem(silkShears, ItemNames.silkShears);
        registerItem(redstoneShears, ItemNames.redstoneShears);

        registerItem(stickObsidian, ItemNames.stickObsidian);
        registerItem(stickEmerald,  ItemNames.stickEmerald);
        registerItem(stickLapis, ItemNames.stickLapis);
        registerItem(stickBronze, ItemNames.stickBronze);
        registerItem(stickCoal, ItemNames.stickCoal);
        registerItem(stickGlowstone, ItemNames.stickGlowstone);
        registerItem(stickAdamantium, ItemNames.stickAdamantium);
        registerItem(stickSilk, ItemNames.stickSilk);
        registerItem(stickRedstone, ItemNames.stickRedstone);
    }

    public static void registerBlocks()
    {
        registerBlock(oreExperience, ItemBlockOreExperience.class, BlockNames.oreExperience);
        registerBlock(oreObsidian, ItemBlockOreObsidian.class, BlockNames.oreObsidian);
        registerBlock(oreGemEmerald, ItemBlockOreEmerald.class, BlockNames.oreEmeraldCrystal);
        registerBlock(oreGemLapis, ItemBlockOreLapis.class, BlockNames.oreLapisCrystal);
        registerBlock(oreBronze, ItemBlockOreBronze.class, BlockNames.oreBronze);
        registerBlock(oreAdamantium, ItemBlockOreAdamantium.class, BlockNames.oreAdamantium);
        registerBlock(oreRedstone, ItemBlockOreRedstone.class, BlockNames.oreCrystalRed);

        registerBlock(blockExperience, ItemBlockExperience.class, BlockNames.blockExperience);
        registerBlock(blockObsidian, ItemBlockObsidian.class, BlockNames.blockObsidian);
        registerBlock(blockEmerald, ItemBlockEmerald.class, BlockNames.blockEmeraldCrystal);
        registerBlock(blockLapis, ItemBlockLapis.class, BlockNames.blockLapisCrystal);
        registerBlock(blockBronze, ItemBlockBronze.class, BlockNames.blockBronze);
        registerBlock(blockCoal, ItemBlockCoal.class, BlockNames.blockCoal);
        registerBlock(blockGlowstone, ItemBlockGlowstone.class, BlockNames.blockGlowstone);
        registerBlock(blockAdamantium, ItemBlockAdamantium.class, BlockNames.blockAdamantium);
        registerBlock(blockSilkGem, ItemBlockSilkGem.class, BlockNames.blockSilkGem);
        registerBlock(blockRedstone, ItemBlockRedstone.class, BlockNames.blockRedstoneCrystal);
        registerBlock(blockExpCollector, ItemBlockExpCollector.class, BlockNames.blockExpCollector);

        registerBlock(quartzFurnaceIdle, ItemBlockQuartzFurnaceIdle.class, BlockNames.quartzFurnaceIdle);
        registerBlock(obsidianFurnaceIdle, ItemBlockObsidianFurnaceIdle.class, BlockNames.obsidianFurnaceIdle);
        registerBlock(emeraldFurnaceIdle, ItemBlockEmeraldFurnaceIdle.class, BlockNames.emeraldFurnaceIdle);
        registerBlock(lapisFurnaceIdle, ItemBlockLapisFurnaceIdle.class, BlockNames.lapisFurnaceIdle);
        registerBlock(bronzeFurnaceIdle, ItemBlockBronzeFurnaceIdle.class, BlockNames.bronzeFurnaceIdle);
        registerBlock(coalFurnaceIdle, ItemBlockCoalFurnaceIdle.class, BlockNames.coalFurnaceIdle);
        registerBlock(glowstoneFurnaceIdle, ItemBlockGlowstoneFurnaceIdle.class, BlockNames.glowstoneFurnaceIdle);
        registerBlock(adamantiumFurnaceIdle, ItemBlockAdamantiumFurnaceIdle.class, BlockNames.adamantiumFurnaceIdle);
        registerBlock(silkFurnaceIdle, ItemBlockSilkFurnaceIdle.class, BlockNames.silkFurnaceIdle);
        registerBlock(redstoneFurnaceIdle, ItemBlockRedstoneFurnaceIdle.class, BlockNames.redstoneFurnaceIdle);
        registerBlock(maceratorIdle, ItemBlockMaceratorIdle.class, BlockNames.maceratorIdle);

        registerBlock(quartzFurnaceActive, ItemBlockQuartzFurnaceActive.class, BlockNames.quartzFurnaceActive);
        registerBlock(obsidianFurnaceActive, ItemBlockObsidianFurnaceActive.class, BlockNames.obsidianFurnaceActive);
        registerBlock(emeraldFurnaceActive, ItemBlockEmeraldFurnaceActive.class, BlockNames.emeraldFurnaceActive);
        registerBlock(lapisFurnaceActive, ItemBlockLapisFurnaceActive.class, BlockNames.lapisFurnaceActive);
        registerBlock(bronzeFurnaceActive, ItemBlockBronzeFurnaceActive.class, BlockNames.bronzeFurnaceActive);
        registerBlock(coalFurnaceActive, ItemBlockCoalFurnaceActive.class, BlockNames.coalFurnaceActive);
        registerBlock(glowstoneFurnaceActive, ItemBlockGlowstoneFurnaceActive.class, BlockNames.glowstoneFurnaceActive);
        registerBlock(adamantiumFurnaceActive, ItemBlockAdamantiumFurnaceActive.class, BlockNames.adamantiumFurnaceActive);
        registerBlock(silkFurnaceActive, ItemBlockSilkFurnaceActive.class, BlockNames.silkFurnaceActive);
        registerBlock(redstoneFurnaceActive, ItemBlockRedstoneFurnaceActive.class, BlockNames.redstoneFurnaceActive);
        registerBlock(maceratorActive, ItemBlockMaceratorActive.class, BlockNames.maceratorActive);

        registerBlock(logObsidian, ItemBlockLogObsidian.class, BlockNames.logObsidian);
        registerBlock(logEmerald, ItemBlockLogEmerald.class, BlockNames.logEmerald);
        registerBlock(logLapis, ItemBlockLogLapis.class, BlockNames.logLapis);
        registerBlock(logBronze, ItemBlockLogBronze.class, BlockNames.logBronze);
        registerBlock(logCoal, ItemBlockLogCoal.class, BlockNames.logCoal);
        registerBlock(logGlowstone, ItemBlockLogGlowstone.class, BlockNames.logGlowstone);
        registerBlock(logAdamantium, ItemBlockLogAdamantium.class, BlockNames.logAdamantium);
        registerBlock(logSilk, ItemBlockLogSilk.class, BlockNames.logSilk);
        registerBlock(logRedstone, ItemBlockLogRedstone.class, BlockNames.logRedstone);

        registerBlock(plankObsidian, ItemBlockPlankObsidian.class, BlockNames.plankObsidian);
        registerBlock(plankEmerald, ItemBlockPlankEmerald.class, BlockNames.plankEmerald);
        registerBlock(plankLapis, ItemBlockPlankLapis.class, BlockNames.plankLapis);
        registerBlock(plankBronze, ItemBlockPlankBronze.class, BlockNames.plankBronze);
        registerBlock(plankCoal, ItemBlockPlankCoal.class, BlockNames.plankCoal);
        registerBlock(plankGlowstone, ItemBlockPlankGlowstone.class, BlockNames.plankGlowstone);
        registerBlock(plankAdamantium, ItemBlockPlankAdamantium.class, BlockNames.plankAdamantium);
        registerBlock(plankSilk, ItemBlockPlankSilk.class, BlockNames.plankSilk);
        registerBlock(plankRedstone, ItemBlockPlankRedstone.class, BlockNames.plankRedstone);

        registerBlock(stairObsidian, ItemBlockStairObsidian.class, BlockNames.stairObsidian);
        registerBlock(stairEmerald, ItemBlockStairEmerald.class, BlockNames.stairEmerald);
        registerBlock(stairLapis, ItemBlockStairLapis.class, BlockNames.stairLapis);
        registerBlock(stairBronze, ItemBlockStairBronze.class, BlockNames.stairBronze);
        registerBlock(stairCoal, ItemBlockStairCoal.class, BlockNames.stairCoal);
        registerBlock(stairGlowstone, ItemBlockStairGlowstone.class, BlockNames.stairGlowstone);
        registerBlock(stairAdamantium, ItemBlockStairAdamantium.class, BlockNames.stairAdamantium);
        registerBlock(stairSilk, ItemBlockStairSilk.class, BlockNames.stairSilk);
        registerBlock(stairRedstone, ItemBlockStairRedstone.class, BlockNames.stairRedstone);

        registerBlock(obsidianWorkbench, BlockNames.obsidianWorkbench);
        registerBlock(emeraldWorkbench, BlockNames.emeraldWorkbench);
        registerBlock(lapisWorkbench, BlockNames.lapisWorkbench);
        registerBlock(bronzeWorkbench, BlockNames.bronzeWorkbench);
        registerBlock(coalWorkbench, BlockNames.coalWorkbench);
        registerBlock(glowstoneWorkbench, BlockNames.glowstoneWorkbench);
        registerBlock(adamantiumWorkbench, BlockNames.adamantiumWorkbench);
        registerBlock(silkWorkbench, BlockNames.silkWorkbench);
        registerBlock(redstoneWorkbench, BlockNames.redstoneWorkbench);

        registerBlock(blockFergoGlass, BlockNames.blockFergoGlass);
    }

    public static void registerTileEntities()
    {
        registerTileEntity(TileEntityQuartzFurnace.class, Tile.quartzFurnaceTile);
        registerTileEntity(TileEntityObsidianFurnace.class, Tile.obsidianFurnaceTile);
        registerTileEntity(TileEntityEmeraldFurnace.class, Tile.emeraldFurnaceTile);
        registerTileEntity(TileEntityLapisFurnace.class, Tile.lapisFurnaceTile);
        registerTileEntity(TileEntityBronzeFurnace.class, Tile.bronzeFurnaceTile);
        registerTileEntity(TileEntityCoalFurnace.class, Tile.coalFurnaceTile);
        registerTileEntity(TileEntityGlowstoneFurnace.class, Tile.glowstoneFurnaceTile);
        registerTileEntity(TileEntityAdamantiumFurnace.class, Tile.adamantiumFurnaceTile);
        registerTileEntity(TileEntitySilkFurnace.class, Tile.silkFurnaceTile);
        registerTileEntity(TileEntityRedstoneFurnace.class, Tile.redstoneFurnaceTile);
        registerTileEntity(TileEntityMacerator.class, Tile.maceratorTile);
    }


}
