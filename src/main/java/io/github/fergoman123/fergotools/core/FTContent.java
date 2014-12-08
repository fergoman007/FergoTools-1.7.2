/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core;

import cpw.mods.fml.common.registry.GameRegistry;
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
import io.github.fergoman123.fergotools.core.itemblock.ItemBlockFergoGlass;
import io.github.fergoman123.fergotools.core.itemblock.block.*;
import io.github.fergoman123.fergotools.core.itemblock.furnaceactive.*;
import io.github.fergoman123.fergotools.core.itemblock.furnaceidle.*;
import io.github.fergoman123.fergotools.core.itemblock.log.*;
import io.github.fergoman123.fergotools.core.itemblock.ore.*;
import io.github.fergoman123.fergotools.core.itemblock.plank.*;
import io.github.fergoman123.fergotools.core.itemblock.stair.*;
import io.github.fergoman123.fergotools.core.tileentity.*;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.reference.strings.FurnaceType;
import io.github.fergoman123.fergotools.reference.strings.Tile;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;

/**
 * this class is the core of FergoTools.
 * this is where all of the blocks, items
 * and tile entities are registered
 */
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
        quartzPickaxe = new ItemQuartzPickaxe(ItemNames.quartzPickaxe);
        quartzShovel = new ItemQuartzShovel(ItemNames.quartzShovel);
        quartzAxe = new ItemQuartzAxe(ItemNames.quartzAxe);
        quartzHoe = new ItemQuartzHoe(ItemNames.quartzHoe);
        quartzSword = new ItemQuartzSword(ItemNames.quartzSword);

        obsidianPickaxe = new ItemObsidianPickaxe(ItemNames.obsidianPickaxe);
        obsidianShovel = new ItemObsidianShovel(ItemNames.obsidianShovel);
        obsidianAxe = new ItemObsidianAxe(ItemNames.obsidianAxe);
        obsidianHoe = new ItemObsidianHoe(ItemNames.obsidianHoe);
        obsidianSword = new ItemObsidianSword(ItemNames.obsidianSword);

        emeraldPickaxe = new ItemEmeraldPickaxe(ItemNames.emeraldPickaxe);
        emeraldShovel = new ItemEmeraldShovel(ItemNames.emeraldShovel);
        emeraldAxe = new ItemEmeraldAxe(ItemNames.emeraldAxe);
        emeraldHoe = new ItemEmeraldHoe(ItemNames.emeraldHoe);
        emeraldSword = new ItemEmeraldSword(ItemNames.emeraldSword);

        lapisPickaxe = new ItemLapisPickaxe(ItemNames.lapisPickaxe);
        lapisShovel = new ItemLapisShovel(ItemNames.lapisShovel);
        lapisAxe = new ItemLapisAxe(ItemNames.lapisAxe);
        lapisHoe = new ItemLapisHoe(ItemNames.lapisHoe);
        lapisSword = new ItemLapisSword(ItemNames.lapisSword);

        bronzePickaxe = new ItemBronzePickaxe(ItemNames.bronzePickaxe);
        bronzeShovel = new ItemBronzeShovel(ItemNames.bronzeShovel);
        bronzeAxe = new ItemBronzeAxe(ItemNames.bronzeAxe);
        bronzeHoe = new ItemBronzeHoe(ItemNames.bronzeHoe);
        bronzeSword = new ItemBronzeSword(ItemNames.bronzeSword);

        coalPickaxe = new ItemCoalPickaxe(ItemNames.coalPickaxe);
        coalShovel = new ItemCoalShovel(ItemNames.coalShovel);
        coalAxe = new ItemCoalAxe(ItemNames.coalAxe);
        coalHoe = new ItemCoalHoe(ItemNames.coalHoe);
        coalSword = new ItemCoalSword(ItemNames.coalSword);

        glowstonePickaxe = new ItemGlowstonePickaxe(ItemNames.glowstonePickaxe);
        glowstoneShovel = new ItemGlowstoneShovel(ItemNames.glowstoneShovel);
        glowstoneAxe = new ItemGlowstoneAxe(ItemNames.glowstoneAxe);
        glowstoneHoe = new ItemGlowstoneHoe(ItemNames.glowstoneHoe);
        glowstoneSword = new ItemGlowstoneSword(ItemNames.glowstoneSword);

        adamantiumPickaxe = new ItemAdamantiumPickaxe(ItemNames.adamantiumPickaxe);
        adamantiumShovel = new ItemAdamantiumShovel(ItemNames.adamantiumShovel);
        adamantiumAxe = new ItemAdamantiumAxe(ItemNames.adamantiumAxe);
        adamantiumHoe = new ItemAdamantiumHoe(ItemNames.adamantiumHoe);
        adamantiumSword = new ItemAdamantiumSword(ItemNames.adamantiumSword);

        silkPickaxe = new ItemSilkPickaxe(ItemNames.silkPickaxe);
        silkShovel = new ItemSilkShovel(ItemNames.silkShovel);
        silkAxe = new ItemSilkAxe(ItemNames.silkAxe);
        silkHoe = new ItemSilkHoe(ItemNames.silkHoe);
        silkSword = new ItemSilkSword(ItemNames.silkSword);

        redstonePickaxe = new ItemRedstonePickaxe(ItemNames.redstonePickaxe);
        redstoneShovel = new ItemRedstoneShovel(ItemNames.redstoneShovel);
        redstoneAxe = new ItemRedstoneAxe(ItemNames.redstoneAxe);
        redstoneHoe = new ItemRedstoneHoe(ItemNames.redstoneHoe);
        redstoneSword = new ItemRedstoneSword(ItemNames.redstoneSword);

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

        staffExp = new ItemStaffExp(ItemNames.staffExp);

        shardExp = new ItemExpShard(ItemNames.shardExp);
        expCollector = new ItemExpCollector(ItemNames.expCollector);

        quartzHelmet = new ItemArmorQuartz(ArmorType.HELMET);
        quartzChestplate = new ItemArmorQuartz(ArmorType.CHEST);
        quartzLeggings = new ItemArmorQuartz(ArmorType.LEGS);
        quartzBoots = new ItemArmorQuartz(ArmorType.BOOTS);

        obsidianHelmet = new ItemArmorObsidian(ArmorType.HELMET);
        obsidianChestplate = new ItemArmorObsidian(ArmorType.CHEST);
        obsidianLeggings = new ItemArmorObsidian(ArmorType.LEGS);
        obsidianBoots = new ItemArmorObsidian(ArmorType.BOOTS);

        emeraldHelmet = new ItemArmorEmerald(ArmorType.HELMET);
        emeraldChestplate = new ItemArmorEmerald(ArmorType.CHEST);
        emeraldLeggings = new ItemArmorEmerald(ArmorType.LEGS);
        emeraldBoots = new ItemArmorEmerald(ArmorType.BOOTS);

        lapisHelmet = new ItemArmorLapis(ArmorType.HELMET);
        lapisChestplate = new ItemArmorLapis(ArmorType.CHEST);
        lapisLeggings = new ItemArmorLapis(ArmorType.LEGS);
        lapisBoots = new ItemArmorLapis(ArmorType.BOOTS);

        bronzeHelmet = new ItemArmorBronze(ArmorType.HELMET);
        bronzeChestplate = new ItemArmorBronze(ArmorType.CHEST);
        bronzeLeggings = new ItemArmorBronze(ArmorType.LEGS);
        bronzeBoots = new ItemArmorBronze(ArmorType.BOOTS);

        coalHelmet = new ItemArmorCoal(ArmorType.HELMET);
        coalChestplate = new ItemArmorCoal(ArmorType.CHEST);
        coalLeggings = new ItemArmorCoal(ArmorType.LEGS);
        coalBoots = new ItemArmorCoal(ArmorType.BOOTS);

        glowstoneHelmet = new ItemArmorGlowstone(ArmorType.HELMET);
        glowstoneChestplate = new ItemArmorGlowstone(ArmorType.CHEST);
        glowstoneLeggings = new ItemArmorGlowstone(ArmorType.LEGS);
        glowstoneBoots = new ItemArmorGlowstone(ArmorType.BOOTS);

        adamantiumHelmet = new ItemArmorAdamantium(ArmorType.HELMET);
        adamantiumChestplate = new ItemArmorAdamantium(ArmorType.CHEST);
        adamantiumLeggings = new ItemArmorAdamantium(ArmorType.LEGS);
        adamantiumBoots = new ItemArmorAdamantium(ArmorType.BOOTS);

        redstoneHelmet = new ItemArmorRedstone(ArmorType.HELMET);
        redstoneChestplate = new ItemArmorRedstone(ArmorType.CHEST);
        redstoneLeggings = new ItemArmorRedstone(ArmorType.LEGS);
        redstoneBoots = new ItemArmorRedstone(ArmorType.BOOTS);

        bowQuartz = new ItemQuartzBow(ItemNames.bowQuartz);
        bowObsidian = new ItemObsidianBow(ItemNames.bowObsidian);
        bowEmerald = new ItemEmeraldBow(ItemNames.bowEmerald);
        bowLapis = new ItemLapisBow(ItemNames.bowLapis);
        bowBronze = new ItemBronzeBow(ItemNames.bowBronze);
        bowCoal = new ItemCoalBow(ItemNames.bowCoal);
        bowGlowstone = new ItemGlowstoneBow(ItemNames.bowGlowstone);
        bowAdamantium = new ItemAdamantiumBow(ItemNames.bowAdamantium);

        quartzShears = new ItemQuartzShears(ItemNames.quartzShears);
        obsidianShears = new ItemObsidianShears(ItemNames.obsidianShears);
        emeraldShears = new ItemEmeraldShears(ItemNames.emeraldShears);
        lapisShears = new ItemLapisShears(ItemNames.lapisShears);
        bronzeShears = new ItemBronzeShears(ItemNames.bronzeShears);
        coalShears = new ItemCoalShears(ItemNames.coalShears);
        glowstoneShears = new ItemGlowstoneShears(ItemNames.glowstoneShears);
        adamantiumShears = new ItemAdamantiumShears(ItemNames.adamantiumShears);
        silkShears = new ItemSilkShears(ItemNames.silkShears);
        redstoneShears = new ItemRedstoneShears(ItemNames.redstoneShears);

        stickObsidian = new ItemStickObsidian(ItemNames.stickObsidian);
        stickEmerald = new ItemStickEmerald(ItemNames.stickEmerald);
        stickLapis = new ItemStickLapis(ItemNames.stickLapis);
        stickBronze = new ItemStickBronze(ItemNames.stickBronze);
        stickCoal = new ItemStickCoal(ItemNames.stickCoal);
        stickGlowstone = new ItemStickGlowstone(ItemNames.stickGlowstone);
        stickAdamantium = new ItemStickAdamantium(ItemNames.stickAdamantium);
        stickSilk = new ItemStickSilk(ItemNames.stickSilk);
        stickRedstone = new ItemStickRedstone(ItemNames.stickRedstone);

        oreExperience = new BlockOreExperience(BlockNames.oreExperience);
        oreObsidian = new BlockOreObsidian(BlockNames.oreObsidian);
        oreGemEmerald = new BlockOreEmerald(BlockNames.oreLapisCrystal);
        oreGemLapis = new BlockOreLapis(BlockNames.oreEmeraldCrystal);
        oreBronze = new BlockOreBronze(BlockNames.oreBronze);
        oreAdamantium = new BlockOreAdamantium(BlockNames.oreAdamantium);
        oreRedstone = new BlockOreRedstone(BlockNames.oreCrystalRed);

        blockExperience = new BlockExperience(BlockNames.blockExperience);
        blockExpCollector = new BlockExpCollector(BlockNames.blockExpCollector);
        blockObsidian = new BlockObsidianStorage(BlockNames.blockObsidian);
        blockEmerald = new BlockEmeraldCrystal(BlockNames.blockEmeraldCrystal);
        blockLapis = new BlockLapisCrystal(BlockNames.blockLapisCrystal);
        blockBronze = new BlockBronze(BlockNames.blockBronze);
        blockCoal = new BlockCoalStorage(BlockNames.blockCoal);
        blockGlowstone = new BlockGlowstoneStorage(BlockNames.blockGlowstone);
        blockAdamantium = new BlockAdamantium(BlockNames.blockAdamantium);
        blockSilkGem = new BlockSilkGem(BlockNames.blockSilkGem);
        blockRedstone = new BlockRedstone(BlockNames.blockRedstoneCrystal);

        quartzFurnaceIdle = new BlockQuartzFurnace(false);
        obsidianFurnaceIdle = new BlockObsidianFurnace(false);
        emeraldFurnaceIdle = new BlockEmeraldFurnace(false);
        lapisFurnaceIdle = new BlockLapisFurnace(false);
        bronzeFurnaceIdle = new BlockBronzeFurnace(false);
        coalFurnaceIdle = new BlockCoalFurnace(false);
        glowstoneFurnaceIdle = new BlockGlowstoneFurnace(false);
        adamantiumFurnaceIdle = new BlockAdamantiumFurnace(false);
        silkFurnaceIdle = new BlockSilkFurnace(false);
        redstoneFurnaceIdle = new BlockRedstoneFurnace(false);
        maceratorIdle = new BlockMacerator(false);

        quartzFurnaceActive = new BlockQuartzFurnace(true);
        obsidianFurnaceActive = new BlockObsidianFurnace(true);
        emeraldFurnaceActive = new BlockEmeraldFurnace(true);
        lapisFurnaceActive = new BlockLapisFurnace(true);
        bronzeFurnaceActive = new BlockBronzeFurnace(true);
        coalFurnaceActive = new BlockCoalFurnace(true);
        glowstoneFurnaceActive = new BlockGlowstoneFurnace(true);
        adamantiumFurnaceActive = new BlockAdamantiumFurnace(true);
        silkFurnaceActive = new BlockSilkFurnace(true);
        redstoneFurnaceActive = new BlockRedstoneFurnace(true);
        maceratorActive = new BlockMacerator(true);

        logObsidian = new BlockLogObsidian(BlockNames.logObsidian);
        logEmerald = new BlockLogObsidian(BlockNames.logEmerald);
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

        stairObsidian = new BlockStairObsidian(BlockNames.stairObsidian);
        stairEmerald = new BlockStairEmerald(BlockNames.stairEmerald);
        stairLapis = new BlockStairLapis(BlockNames.stairLapis);
        stairBronze = new BlockStairBronze(BlockNames.stairBronze);
        stairCoal = new BlockStairCoal(BlockNames.stairCoal);
        stairGlowstone = new BlockStairGlowstone(BlockNames.stairGlowstone);
        stairAdamantium = new BlockStairAdamantium(BlockNames.stairAdamantium);
        stairSilk = new BlockStairSilk(BlockNames.stairSilk);
        stairRedstone = new BlockStairRedstone(BlockNames.stairRedstone);

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

    public static void mainRegistry()
    {
        registerItems();
        registerBlocks();
    }

    /**
     * this registers all of the items
     */
    private static void registerItems()
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

    /**
     * this registers all of the blocks
     */
    private static void registerBlocks()
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

        registerBlock(blockFergoGlass, ItemBlockFergoGlass.class, BlockNames.blockFergoGlass);
    }

    /**
     * this registers all of the tile entities
     * for the mod
     */
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

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemclass, String name)
    {
        RegisterHelper.registerBlock(block, itemclass, name);
    }

    public static void registerBlock(Block block, String name)
    {
        RegisterHelper.registerBlock(block, name);
    }

    public static void registerItem(Item item, String name)
    {
        RegisterHelper.registerItem(item, name);
    }

    public static void registerTileEntity(Class<? extends TileEntity> tileClass, String id)
    {
        RegisterHelper.registerTileEntity(tileClass, id);
    }


}
