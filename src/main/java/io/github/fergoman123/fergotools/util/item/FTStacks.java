 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.item;

import io.github.fergoman123.fergotools.init.FergoItems.*;
import io.github.fergoman123.fergotools.init.FergoBlocks.*;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergoutil.helper.ItemStackHelper;
import io.github.fergoman123.fergotools.furnaces.QuartzFurnace.BlockQuartzFurnace;
import io.github.fergoman123.fergotools.furnaces.ObsidianFurnace.BlockObsidianFurnace;
import io.github.fergoman123.fergotools.furnaces.EmeraldFurnace.BlockEmeraldFurnace;
import io.github.fergoman123.fergotools.furnaces.LapisFurnace.BlockLapisFurnace;
import io.github.fergoman123.fergotools.furnaces.BronzeFurnace.BlockBronzeFurnace;
import io.github.fergoman123.fergotools.furnaces.CoalFurnace.BlockCoalFurnace;
import io.github.fergoman123.fergotools.furnaces.GlowstoneFurnace.BlockGlowstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.AdamantiumFurnace.BlockAdamantiumFurnace;
import io.github.fergoman123.fergotools.furnaces.SilkFurnace.BlockSilkFurnace;
import io.github.fergoman123.fergotools.furnaces.RedstoneFurnace.BlockRedstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.Macerator.BlockMacerator;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import io.github.fergoman123.fergotools.block.*;

public class FTStacks {

    public static final ItemStack stickStack = new ItemStack(Items.stick);
    public static final ItemStack quartzStack = new ItemStack(Items.quartz);
    public static final ItemStack stringStack = new ItemStack(Items.string);
    public static final ItemStack quartzBlock = new ItemStack(Blocks.quartz_block);

    public static final ItemStack obsidianIngot9 = new ItemStack(ItemObsidianIngot.instance, 9);
    public static final ItemStack emeraldCrystal9 = new ItemStack(ItemEmeraldGem.instance, 9);
    public static final ItemStack lapisCrystal9 = new ItemStack(ItemLapisGem.instance, 9);
    public static final ItemStack bronzeIngot9 = new ItemStack(ItemBronzeIngot.instance, 9);
    public static final ItemStack adamantiumIngot9 = new ItemStack(ItemAdamantiumIngot.instance, 9);
    public static final ItemStack coalIngot9 = new ItemStack(ItemCoalIngot.instance, 9);
    public static final ItemStack glowstoneIngot9 = new ItemStack(ItemGlowstoneIngot.instance, 9);
    public static final ItemStack silkGem9 = new ItemStack(ItemSilkGem.instance, 9);
    public static final ItemStack expShard9 = new ItemStack(ItemExpShard.instance, 9);
    public static final ItemStack redstoneCrystal9 = new ItemStack(ItemRedstoneGem.instance, 9);

    public static final ItemStack expCollectorHalfStack = ItemStackHelper.getItemStack(ItemExpCollector.instance, 32);

    public static final ItemStack expShard5 = new ItemStack(ItemExpShard.instance, 5);

    public static final ItemStack obsidianIngot = new ItemStack(ItemObsidianIngot.instance);
    public static final ItemStack emeraldCrystal = new ItemStack(ItemEmeraldGem.instance);
    public static final ItemStack lapisCrystal = new ItemStack(ItemLapisGem.instance);
    public static final ItemStack bronzeIngot = new ItemStack(ItemBronzeIngot.instance);
    public static final ItemStack coalIngot = new ItemStack(ItemCoalIngot.instance);
    public static final ItemStack glowstoneIngot = new ItemStack(ItemGlowstoneIngot.instance);
    public static final ItemStack adamantiumIngot = new ItemStack(ItemAdamantiumIngot.instance);
    public static final ItemStack expShard = new ItemStack(ItemExpShard.instance);
    public static final ItemStack silkGem = new ItemStack(ItemSilkGem.instance);
    public static final ItemStack redCrystal = new ItemStack(ItemRedstoneGem.instance);
    public static final ItemStack expCollector = new ItemStack(ItemExpCollector.instance);

    public static final ItemStack blockObsidian = new ItemStack(BlockObsidianStorage.instance);
    public static final ItemStack blockEmeraldCrystal = new ItemStack(BlockEmeraldCrystal.instance);
    public static final ItemStack blockLapisCrystal = new ItemStack(BlockLapisCrystal.instance);
    public static final ItemStack blockBronze = new ItemStack(BlockBronze.instance);
    public static final ItemStack blockCoal = new ItemStack(BlockCoalStorage.instance);
    public static final ItemStack blockGlowstone = new ItemStack(BlockGlowstoneStorage.instance);
    public static final ItemStack blockExperience = new ItemStack(BlockExperience.instance);
    public static final ItemStack blockSilkGem = new ItemStack(BlockSilkGem.instance);
    public static final ItemStack blockAdamantium = new ItemStack(BlockAdamantium.instance);
    public static final ItemStack blockRedstone = new ItemStack(BlockRedstoneCrystal.instance);

    public static final ItemStack oreObsidian = new ItemStack(BlockOreObsidian.instance);
    public static final ItemStack oreEmeraldCrystal = new ItemStack(BlockOreEmeraldCrystal.instance);
    public static final ItemStack oreLapisCrystal = new ItemStack(BlockOreLapisCrystal.instance);
    public static final ItemStack oreBronze = new ItemStack(BlockOreBronze.instance);
    public static final ItemStack oreExperience = new ItemStack(BlockOreExperience.instance);
    public static final ItemStack oreAdamantium = new ItemStack(BlockOreAdamantium.instance);
    public static final ItemStack oreRedstoneCrystal = new ItemStack(BlockOreRedCrystal.instance);

    public static final ItemStack quartzPickaxe = new ItemStack(ItemQuartzPickaxe.instance);
    public static final ItemStack quartzShovel = new ItemStack(ItemQuartzShovel.instance);
    public static final ItemStack quartzAxe = new ItemStack(ItemQuartzAxe.instance);
    public static final ItemStack quartzHoe = new ItemStack(ItemQuartzHoe.instance);
    public static final ItemStack quartzSword = new ItemStack(ItemQuartzSword.instance);

    public static final ItemStack obsidianPickaxe = new ItemStack(ItemObsidianPickaxe.instance);
    public static final ItemStack obsidianShovel = new ItemStack(ItemObsidianShovel.instance);
    public static final ItemStack obsidianAxe = new ItemStack(ItemObsidianAxe.instance);
    public static final ItemStack obsidianHoe = new ItemStack(ItemObsidianHoe.instance);
    public static final ItemStack obsidianSword = new ItemStack(ItemObsidianSword.instance);

    public static final ItemStack emeraldPickaxe = new ItemStack(ItemEmeraldPickaxe.instance);
    public static final ItemStack emeraldShovel = new ItemStack(ItemEmeraldShovel.instance);
    public static final ItemStack emeraldAxe = new ItemStack(ItemEmeraldAxe.instance);
    public static final ItemStack emeraldHoe = new ItemStack(ItemEmeraldHoe.instance);
    public static final ItemStack emeraldSword = new ItemStack(ItemEmeraldSword.instance);

    public static final ItemStack lapisPickaxe = new ItemStack(ItemLapisPickaxe.instance);
    public static final ItemStack lapisShovel = new ItemStack(ItemLapisShovel.instance);
    public static final ItemStack lapisAxe = new ItemStack(ItemLapisAxe.instance);
    public static final ItemStack lapisHoe = new ItemStack(ItemLapisHoe.instance);
    public static final ItemStack lapisSword = new ItemStack(ItemLapisSword.instance);

    public static final ItemStack bronzePickaxe = new ItemStack(ItemBronzePickaxe.instance);
    public static final ItemStack bronzeShovel = new ItemStack(ItemBronzeShovel.instance);
    public static final ItemStack bronzeAxe = new ItemStack(ItemBronzeAxe.instance);
    public static final ItemStack bronzeHoe = new ItemStack(ItemBronzeHoe.instance);
    public static final ItemStack bronzeSword = new ItemStack(ItemBronzeSword.instance);

    public static final ItemStack coalPickaxe = new ItemStack(ItemCoalPickaxe.instance);
    public static final ItemStack coalShovel = new ItemStack(ItemCoalShovel.instance);
    public static final ItemStack coalAxe = new ItemStack(ItemCoalAxe.instance);
    public static final ItemStack coalHoe = new ItemStack(ItemCoalHoe.instance);
    public static final ItemStack coalSword = new ItemStack(ItemCoalSword.instance);

    public static final ItemStack glowstonePickaxe = new ItemStack(ItemRedstonePickaxe.instance);
    public static final ItemStack glowstoneShovel = new ItemStack(ItemRedstoneShovel.instance);
    public static final ItemStack glowstoneAxe = new ItemStack(ItemRedstoneAxe.instance);
    public static final ItemStack glowstoneHoe = new ItemStack(ItemRedstoneHoe.instance);
    public static final ItemStack glowstoneSword = new ItemStack(ItemRedstoneSword.instance);

    public static final ItemStack adamantiumPickaxe = new ItemStack(ItemAdamantiumPickaxe.instance);
    public static final ItemStack adamantiumShovel = new ItemStack(ItemAdamantiumShovel.instance);
    public static final ItemStack adamantiumAxe = new ItemStack(ItemAdamantiumAxe.instance);
    public static final ItemStack adamantiumHoe = new ItemStack(ItemAdamantiumHoe.instance);
    public static final ItemStack adamantiumSword = new ItemStack(ItemAdamantiumSword.instance);

    public static final ItemStack silkPickaxe = new ItemStack(ItemSilkPickaxe.instance);
    public static final ItemStack silkShovel = new ItemStack(ItemSilkShovel.instance);
    public static final ItemStack silkAxe = new ItemStack(ItemSilkAxe.instance);
    public static final ItemStack silkHoe = new ItemStack(ItemSilkHoe.instance);
    public static final ItemStack silkSword = new ItemStack(ItemSilkSword.instance);

    public static final ItemStack redstonePickaxe = new ItemStack(ItemRedstonePickaxe.instance);
    public static final ItemStack redstoneShovel = new ItemStack(ItemRedstoneShovel.instance);
    public static final ItemStack redstoneAxe = new ItemStack(ItemRedstoneAxe.instance);
    public static final ItemStack redstoneHoe = new ItemStack(ItemRedstoneHoe.instance);
    public static final ItemStack redstoneSword = new ItemStack(ItemRedstoneSword.instance);

    public static final ItemStack quartzFurnaceIdle = new ItemStack(BlockQuartzFurnace.instanceIdle);
    public static final ItemStack obsidianFurnaceIdle = new ItemStack(BlockObsidianFurnace.instanceIdle);
    public static final ItemStack emeraldCrystalFurnaceIdle = new ItemStack(BlockEmeraldFurnace.instanceIdle);
    public static final ItemStack lapisCrystalFurnaceIdle = new ItemStack(BlockLapisFurnace.instanceIdle);
    public static final ItemStack bronzeFurnaceIdle = new ItemStack(BlockBronzeFurnace.instanceIdle);
    public static final ItemStack coalFurnaceIdle = new ItemStack(BlockCoalFurnace.instanceIdle);
    public static final ItemStack glowstoneFurnaceIdle = new ItemStack(BlockGlowstoneFurnace.instanceIdle);
    public static final ItemStack adamantiumFurnaceIdle = new ItemStack(BlockAdamantiumFurnace.instanceIdle);
    public static final ItemStack silkFurnaceIdle = new ItemStack(BlockSilkFurnace.instanceIdle);
    public static final ItemStack redstoneFurnaceIdle = new ItemStack(BlockRedstoneFurnace.instanceIdle);
    public static final ItemStack maceratorIdle = new ItemStack(BlockMacerator.instanceIdle);

    public static final ItemStack quartzFurnaceActive = new ItemStack(BlockQuartzFurnace.instanceActive);
    public static final ItemStack obsidianFurnaceActive = new ItemStack(BlockObsidianFurnace.instanceActive);
    public static final ItemStack emeraldCrystalFurnaceActive = new ItemStack(BlockEmeraldFurnace.instanceActive);
    public static final ItemStack lapisCrystalFurnaceActive = new ItemStack(BlockLapisFurnace.instanceActive);
    public static final ItemStack bronzeFurnaceActive = new ItemStack(BlockBronzeFurnace.instanceActive);
    public static final ItemStack coalFurnaceActive = new ItemStack(BlockCoalFurnace.instanceActive);
    public static final ItemStack glowstoneFurnaceActive = new ItemStack(BlockGlowstoneFurnace.instanceActive);
    public static final ItemStack adamantiumFurnaceActive = new ItemStack(BlockAdamantiumFurnace.instanceActive);
    public static final ItemStack silkFurnaceActive = new ItemStack(BlockSilkFurnace.instanceActive);
    public static final ItemStack redstoneFurnaceActive = new ItemStack(BlockRedstoneFurnace.instanceActive);
    public static final ItemStack maceratorActive = new ItemStack(BlockMacerator.instanceActive);

    public static final ItemStack quartzHelmet = new ItemStack(ItemArmorQuartz.instanceHelmet);
    public static final ItemStack quartzChestplate = new ItemStack(ItemArmorQuartz.instanceChest);
    public static final ItemStack quartzLeggings = new ItemStack(ItemArmorQuartz.instanceLegs);
    public static final ItemStack quartzBoots = new ItemStack(ItemArmorQuartz.instanceBoots);

    public static final ItemStack obsidianHelmet = new ItemStack(ItemArmorObsidian.instanceHelmet);
    public static final ItemStack obsidianChestplate = new ItemStack(ItemArmorObsidian.instanceChest);
    public static final ItemStack obsidianLeggings = new ItemStack(ItemArmorObsidian.instanceLegs);
    public static final ItemStack obsidianBoots = new ItemStack(ItemArmorObsidian.instanceBoots);

    public static final ItemStack emeraldHelmet = new ItemStack(ItemArmorEmerald.instanceHelmet);
    public static final ItemStack emeraldChestplate = new ItemStack(ItemArmorEmerald.instanceChest);
    public static final ItemStack emeraldLeggings = new ItemStack(ItemArmorEmerald.instanceLegs);
    public static final ItemStack emeraldBoots = new ItemStack(ItemArmorEmerald.instanceBoots);

    public static final ItemStack lapisHelmet = new ItemStack(ItemArmorLapis.instanceHelmet);
    public static final ItemStack lapisChestplate = new ItemStack(ItemArmorLapis.instanceChest);
    public static final ItemStack lapisLeggings = new ItemStack(ItemArmorLapis.instanceLegs);
    public static final ItemStack lapisBoots = new ItemStack(ItemArmorLapis.instanceBoots);

    public static final ItemStack bronzeHelmet = new ItemStack(ItemArmorBronze.instanceHelmet);
    public static final ItemStack bronzeChestplate = new ItemStack(ItemArmorBronze.instanceChest);
    public static final ItemStack bronzeLeggings = new ItemStack(ItemArmorBronze.instanceLegs);
    public static final ItemStack bronzeBoots = new ItemStack(ItemArmorBronze.instanceBoots);

    public static final ItemStack coalHelmet = new ItemStack(ItemArmorCoal.instanceHelmet);
    public static final ItemStack coalChestplate = new ItemStack(ItemArmorCoal.instanceChest);
    public static final ItemStack coalLeggings = new ItemStack(ItemArmorCoal.instanceLegs);
    public static final ItemStack coalBoots = new ItemStack(ItemArmorCoal.instanceBoots);

    public static final ItemStack glowstoneHelmet = new ItemStack(ItemArmorGlowstone.instanceHelmet);
    public static final ItemStack glowstoneChestplate = new ItemStack(ItemArmorGlowstone.instanceChest);
    public static final ItemStack glowstoneLeggings = new ItemStack(ItemArmorGlowstone.instanceLegs);
    public static final ItemStack glowstoneBoots = new ItemStack(ItemArmorGlowstone.instanceBoots);

    public static final ItemStack redstoneHelmet = new ItemStack(ItemArmorRedstone.instanceHelmet);
    public static final ItemStack redstoneChestplate = new ItemStack(ItemArmorRedstone.instanceChest);
    public static final ItemStack redstoneLeggings = new ItemStack(ItemArmorRedstone.instanceLegs);
    public static final ItemStack redstoneBoots = new ItemStack(ItemArmorRedstone.instanceBoots);

    public static final ItemStack adamantiumHelmet = new ItemStack(ItemArmorAdamantium.instanceHelmet);
    public static final ItemStack adamantiumChestplate = new ItemStack(ItemArmorAdamantium.instanceChest);
    public static final ItemStack adamantiumLeggings = new ItemStack(ItemArmorAdamantium.instanceLegs);
    public static final ItemStack adamantiumBoots = new ItemStack(ItemArmorAdamantium.instanceBoots);

    public static final ItemStack quartzBow = new ItemStack(ItemQuartzBow.instance);
    public static final ItemStack obsidianBow = new ItemStack(ItemObsidianBow.instance);
    public static final ItemStack emeraldBow = new ItemStack(ItemEmeraldBow.instance);
    public static final ItemStack lapisBow = new ItemStack(ItemLapisBow.instance);
    public static final ItemStack bronzeBow = new ItemStack(ItemBronzeBow.instance);
    public static final ItemStack coalBow = new ItemStack(ItemCoalBow.instance);
    public static final ItemStack glowstoneBow = new ItemStack(ItemGlowstoneBow.instance);
    public static final ItemStack adamantiumBow = new ItemStack(ItemAdamantiumBow.instance);

    public static final ItemStack[] planks = new ItemStack[]
            {
                    new ItemStack(FTPlanks.instance, 4, 0),
                    new ItemStack(FTPlanks.instance, 4, 1),
                    new ItemStack(FTPlanks.instance, 4, 2),
                    new ItemStack(FTPlanks.instance, 4, 3),
                    new ItemStack(FTPlanks.instance, 4, 4),
                    new ItemStack(FTPlanks.instance, 4, 5),
                    new ItemStack(FTPlanks.instance, 4, 6),
                    new ItemStack(FTPlanks.instance, 4, 7),
                    new ItemStack(FTPlanks.instance, 4, 8)
            };

    public static final ItemStack[] logs = new ItemStack[]
            {
                    new ItemStack(FTLogs.instance, 1, 0),
                    new ItemStack(FTLogs.instance, 1, 1),
                    new ItemStack(FTLogs.instance, 1, 2),
                    new ItemStack(FTLogs.instance, 1, 3),
                    new ItemStack(FTLogs.instance, 1, 4),
                    new ItemStack(FTLogs.instance, 1, 5),
                    new ItemStack(FTLogs.instance, 1, 6),
                    new ItemStack(FTLogs.instance, 1, 7),
                    new ItemStack(FTLogs.instance, 1, 8)
            };
}
