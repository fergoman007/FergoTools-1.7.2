package io.github.fergoman123.fergotools.core;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.furnaces.AdamantiumFurnace.BlockAdamantiumFurnace;
import io.github.fergoman123.fergotools.furnaces.BronzeFurnace.BlockBronzeFurnace;
import io.github.fergoman123.fergotools.furnaces.CoalFurnace.BlockCoalFurnace;
import io.github.fergoman123.fergotools.furnaces.EmeraldFurnace.BlockEmeraldFurnace;
import io.github.fergoman123.fergotools.furnaces.GlowstoneFurnace.BlockGlowstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.LapisFurnace.BlockLapisFurnace;
import io.github.fergoman123.fergotools.furnaces.Macerator.BlockMacerator;
import io.github.fergoman123.fergotools.furnaces.ObsidianFurnace.BlockObsidianFurnace;
import io.github.fergoman123.fergotools.furnaces.QuartzFurnace.BlockQuartzFurnace;
import io.github.fergoman123.fergotools.furnaces.RedstoneFurnace.BlockRedstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.SilkFurnace.BlockSilkFurnace;
import io.github.fergoman123.fergotools.init.FTBlocks.*;
import io.github.fergoman123.fergotools.init.FTItems.*;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.reference.strings.FurnaceType;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT.ArmorNames;
import io.github.fergoman123.fergotools.util.item.Materials.Armor;
import io.github.fergoman123.fergotools.util.item.Materials.Tools;
import io.github.fergoman123.fergotools.workbenches.AdamantiumWorkbench.BlockAdamantiumWorkbench;
import io.github.fergoman123.fergotools.workbenches.BronzeWorkbench.BlockBronzeWorkbench;
import io.github.fergoman123.fergotools.workbenches.CoalWorkbench.BlockCoalWorkbench;
import io.github.fergoman123.fergotools.workbenches.EmeraldWorkbench.BlockEmeraldWorkbench;
import io.github.fergoman123.fergotools.workbenches.GlowstoneWorkbench.BlockGlowstoneWorkbench;
import io.github.fergoman123.fergotools.workbenches.LapisWorkbench.BlockLapisWorkbench;
import io.github.fergoman123.fergotools.workbenches.ObsidianWorkbench.BlockObsidianWorkbench;
import io.github.fergoman123.fergotools.workbenches.RedstoneWorkbench.BlockRedstoneWorkbench;
import io.github.fergoman123.fergotools.workbenches.SilkWorkbench.BlockSilkWorkbench;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

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
    public static Block oreRedCrystal;

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

        shardExp = new ItemExpShard(ItemNames.shardExp);
        expCollector = new ItemExpCollector(ItemNames.expCollector);

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
        oreGemEmerald = new BlockOreEmeraldCrystal(Material.rock, BlockNames.oreEmeraldCrystal);
        oreGemLapis = new BlockOreEmeraldCrystal(Material.rock, BlockNames.oreLapisCrystal);
        oreBronze = new BlockOreBronze(Material.rock, BlockNames.oreBronze);
        oreAdamantium = new BlockOreAdamantium(Material.rock, BlockNames.oreAdamantium);
        oreRedCrystal = new BlockOreRedCrystal(Material.rock, BlockNames.oreCrystalRed);

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
        blockRedstone = new BlockRedstoneCrystal(Material.iron, BlockNames.blockRedstoneCrystal);

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
}
