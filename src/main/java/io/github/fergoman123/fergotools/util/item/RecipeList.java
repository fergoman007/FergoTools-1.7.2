 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.item;


 import io.github.fergoman123.fergotools.api.content.FTContent;
 import io.github.fergoman123.fergoutil.helper.RecipeHelper;
 import net.minecraft.init.Blocks;
 import net.minecraft.init.Items;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.oredict.OreDictionary;

 /**
  * this class is a list of recipes for
  * FergoTools
  */
 public class RecipeList {

    public static final char charX = 'x';
    public static final char charY = 'y';
    public static final int wildcard = OreDictionary.WILDCARD_VALUE;

    public static final String[] blockRecipe = {"xxx", "xxx", "xxx"};
    public static final String[] furnaceRecipe = {"xxx", "x x", "xxx"};

    // Blocks
    public static final Object[] blockObsidian = new Object[]{blockRecipe[0], blockRecipe[1], blockRecipe[2], charX, FTStacks.obsidianIngot};
    public static final Object[] blockEmeraldCrystal = new Object[]{blockRecipe[0], blockRecipe[1], blockRecipe[2], charX, FTStacks.emeraldCrystal};
    public static final Object[] blockLapisCrystal = new Object[]{blockRecipe[0], blockRecipe[1], blockRecipe[2], charX, FTStacks.lapisCrystal};
    public static final Object[] blockBronze = new Object[]{blockRecipe[0], blockRecipe[1], blockRecipe[2], charX, FTStacks.bronzeIngot};
    public static final Object[] blockCoal = new Object[]{blockRecipe[0], blockRecipe[1], blockRecipe[2], charX, FTStacks.coalIngot};
    public static final Object[] blockGlowstone = new Object[]{blockRecipe[0], blockRecipe[1], blockRecipe[2], charX,  FTStacks.glowstoneIngot};
    public static final Object[] blockAdamantium = new Object[]{blockRecipe[0], blockRecipe[1], blockRecipe[2], charX, FTStacks.adamantiumIngot};
    public static final Object[] blockExperience = new Object[]{blockRecipe[0], blockRecipe[1], blockRecipe[2], charX, FTStacks.expShard};
    public static final Object[] blockSilkGem = new Object[]{blockRecipe[0], blockRecipe[1], blockRecipe[2], charX, FTStacks.silkGem};
    public static final Object[] blockRedstone = new Object[]{blockRecipe[0], blockRecipe[1], blockRecipe[2], charX, FTStacks.redCrystal};

    // Furnaces
    public static final Object[] quartzFurnace = new Object[]{furnaceRecipe[0], furnaceRecipe[1], furnaceRecipe[2], charX, FTStacks.quartzBlock};
    public static final Object[] obsidianFurnace = new Object[]{furnaceRecipe[0], furnaceRecipe[1], furnaceRecipe[2], charX, FTStacks.blockObsidian};
    public static final Object[] emeraldCrystalFurnace = new Object[]{furnaceRecipe[0], furnaceRecipe[1], furnaceRecipe[2], charX, FTStacks.blockEmeraldCrystal};
    public static final Object[] lapisCrystalFurnace = new Object[]{furnaceRecipe[0], furnaceRecipe[1], furnaceRecipe[2], charX, FTStacks.blockLapisCrystal};
    public static final Object[] bronzeFurnace = new Object[]{furnaceRecipe[0], furnaceRecipe[1], furnaceRecipe[2], charX, FTStacks.blockBronze};
    public static final Object[] coalFurnace = new Object[]{furnaceRecipe[0], furnaceRecipe[1], furnaceRecipe[2], charX, FTStacks.blockCoal};
    public static final Object[] glowstoneFurnace = new Object[]{furnaceRecipe[0], furnaceRecipe[1], furnaceRecipe[2], charX, FTStacks.blockGlowstone};
    public static final Object[] adamantiumFurnace = new Object[]{furnaceRecipe[0], furnaceRecipe[1], furnaceRecipe[2], charX, FTStacks.blockAdamantium};
    public static final Object[] silkFurnace = new Object[]{furnaceRecipe[0], furnaceRecipe[1], furnaceRecipe[2], charX, FTStacks.blockSilkGem};
    public static final Object[] redstoneFurnace = new Object[]{furnaceRecipe[0], furnaceRecipe[1], furnaceRecipe[2], charX, FTStacks.blockRedstone};
    public static final Object[] macerator = new Object[]{"xxx", "xyx", "xxx", charX, FTStacks.blockAdamantium, charY, new ItemStack(Blocks.iron_block)};
    // Tools
    public static final Object[] quartzPickaxe = new Object[]{"xxx", " y ", " y ", charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzShovel = new Object[]{"x", "y", "y", charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzAxe = new Object[]{"xx", "xy", " y", charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzHoe = new Object[]{"xx", " y", " y", charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzSword = new Object[]{"x", "x", "y", charX, FTStacks.quartzStack, charY, FTStacks.stickStack};

    public static final Object[] obsidianPickaxe = new Object[]{"xxx", " y ", " y ", charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianShovel = new Object[]{"x", "y", "y", charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianAxe = new Object[]{"xx", "xy", " y", charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianHoe = new Object[]{"xx", " y", " y", charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianSword = new Object[]{"x", "x", "y", charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};

    public static final Object[] emeraldPickaxe = new Object[]{"xxx", " y ", " y ", charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldShovel = new Object[]{"x", "y", "y", charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldAxe = new Object[]{"xx", "xy", " y", charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldHoe = new Object[]{"xx", " y", " y", charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldSword = new Object[]{"x", "x", "y", charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};

    public static final Object[] lapisPickaxe = new Object[]{"xxx", " y ", " y ", charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisShovel = new Object[]{"x", "y", "y", charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisAxe = new Object[]{"xx", "xy", " y", charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisHoe = new Object[]{"xx", " y", " y", charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisSword = new Object[]{"x", "x", "y", charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};

    public static final Object[] bronzePickaxe = new Object[]{"xxx", " y ", " y ", charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeShovel = new Object[]{"x", "y", "y", charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeAxe = new Object[]{"xx", "xy", " y", charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeHoe = new Object[]{"xx", " y", " y", charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeSword = new Object[]{"x", "x", "y", charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};

    public static final Object[] coalPickaxe = new Object[]{"xxx", " y ", " y ", charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalShovel = new Object[]{"x", "y", "y", charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalAxe = new Object[]{"xx", "xy", " y", charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalHoe = new Object[]{"xx", " y", " y", charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalSword = new Object[]{"x", "x", "y", charX, FTStacks.coalIngot, charY, FTStacks.stickStack};

    public static final Object[] glowstonePickaxe = new Object[]{"xxx", " y ", " y ", charX , FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneShovel = new Object[]{"x", "y", "y", charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneAxe = new Object[]{"xx", "xy", " y", charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneHoe = new Object[]{"xx", " y", " y", charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneSword = new Object[]{"x", "x", "y", charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};

    public static final Object[] adamantiumPickaxe = new Object[]{"xxx", " y ", " y ", charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumShovel = new Object[]{"x", "y", "y", charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumAxe = new Object[]{"xx", "xy", " y", charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumHoe = new Object[]{"xx", " y", " y", charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumSword = new Object[]{"x", "x", "y", charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};

    public static final Object[] silkPickaxe = new Object[]{"xxx", " y ", " y ", charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkShovel = new Object[]{"x", "y", "y", charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkAxe = new Object[]{"xx", "xy", " y", charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkHoe = new Object[]{"xx", " y", " y", charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkSword = new Object[]{"x", "x", "y", charX, FTStacks.silkGem, charY, FTStacks.stickStack};

    public static final Object[] redstonePickaxe = new Object[]{"xxx", " y ", " y ", charX, FTStacks.redCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneShovel = new Object[]{"x", "y", "y", charX, FTStacks.redCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneAxe = new Object[]{"xx", "xy", " y", charX, FTStacks.redCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneHoe = new Object[]{"xx", " y", " y", charX, FTStacks.redCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneSword = new Object[]{"x", "x", "y", charX, FTStacks.redCrystal, charY, FTStacks.stickStack};

    // Armor
    public static final Object[] quartzHelmet = new Object[]{"xxx", "x x", charX, FTStacks.quartzStack};
    public static final Object[] quartzChestplate = new Object[]{"x x", "xxx", "xxx", charX, FTStacks.quartzStack};
    public static final Object[] quartzLeggings = new Object[]{"xxx", "x x", "x x", charX, FTStacks.quartzStack};
    public static final Object[] quartzBoots = new Object[]{"x x", "x x", charX, FTStacks.quartzStack};

    public static final Object[] obsidianHelmet = new Object[]{"xxx", "x  x", charX, FTStacks.obsidianIngot};
    public static final Object[] obsidianChestplate = new Object[]{"x x", "xxx", "xxx", charX, FTStacks.obsidianIngot};
    public static final Object[] obsidianLeggings = new Object[]{"xxx", "x x", "x x", charX, FTStacks.obsidianIngot};
    public static final Object[] obsidianBoots = new Object[]{"x x", "x x", charX, FTStacks.obsidianIngot};

    public static final Object[] emeraldHelmet = new Object[]{"xxx", "x  x", charX, FTStacks.emeraldCrystal};
    public static final Object[] emeraldChestplate = new Object[]{"x x", "xxx", "xxx", charX, FTStacks.emeraldCrystal};
    public static final Object[] emeraldLeggings = new Object[]{"xxx", "x x", "x x", charX, FTStacks.emeraldCrystal};
    public static final Object[] emeraldBoots = new Object[]{"x x", "x x", charX, FTStacks.emeraldCrystal};

    public static final Object[] lapisHelmet = new Object[]{"xxx", "x  x", charX, FTStacks.lapisCrystal};
    public static final Object[] lapisChestplate = new Object[]{"x x", "xxx", "xxx", charX, FTStacks.lapisCrystal};
    public static final Object[] lapisLeggings = new Object[]{"xxx", "x x", "x x", charX, FTStacks.lapisCrystal};
    public static final Object[] lapisBoots = new Object[]{"x x", "x x", charX, FTStacks.lapisCrystal};

    public static final Object[] bronzeHelmet = new Object[]{"xxx", "x  x", charX, FTStacks.bronzeIngot};
    public static final Object[] bronzeChestplate = new Object[]{"x x", "xxx", "xxx", charX, FTStacks.bronzeIngot};
    public static final Object[] bronzeLeggings = new Object[]{"xxx", "x x", "x x", charX, FTStacks.bronzeIngot};
    public static final Object[] bronzeBoots = new Object[]{"x x", "x x", charX, FTStacks.bronzeIngot};

    public static final Object[] coalHelmet = new Object[]{"xxx", "x  x", charX, FTStacks.coalIngot};
    public static final Object[] coalChestplate = new Object[]{"x x", "xxx", "xxx", charX, FTStacks.coalIngot};
    public static final Object[] coalLeggings = new Object[]{"xxx", "x x", "x x", charX, FTStacks.coalIngot};
    public static final Object[] coalBoots = new Object[]{"x x", "x x", charX, FTStacks.coalIngot};

    public static final Object[] glowstoneHelmet = new Object[]{"xxx", "x  x", charX, FTStacks.glowstoneIngot};
    public static final Object[] glowstoneChestplate = new Object[]{"x x", "xxx", "xxx", charX, FTStacks.glowstoneIngot};
    public static final Object[] glowstoneLeggings = new Object[]{"xxx", "x x", "x x", charX, FTStacks.glowstoneIngot};
    public static final Object[] glowstoneBoots = new Object[]{"x x", "x x", charX, FTStacks.glowstoneIngot};

    public static final Object[] redstoneHelmet = new Object[]{"xxx", "x  x", charX, FTStacks.redCrystal};
    public static final Object[] redstoneChestplate = new Object[]{"x x", "xxx", "xxx", charX, FTStacks.redCrystal};
    public static final Object[] redstoneLeggings = new Object[]{"xxx", "x x", "x x", charX, FTStacks.redCrystal};
    public static final Object[] redstoneBoots = new Object[]{"x x", "x x", charX, FTStacks.redCrystal};

    public static final Object[] adamantiumHelmet = new Object[]{"xxx", "x  x", 'x', FTStacks.adamantiumIngot};
    public static final Object[] adamantiumChestplate = new Object[]{"x x", "xxx", "xxx", charX, FTStacks.adamantiumIngot};
    public static final Object[] adamantiumLeggings = new Object[]{"xxx", "x x", "x x", charX, FTStacks.adamantiumIngot};
    public static final Object[] adamantiumBoots = new Object[]{"x x", "x x", charX, FTStacks.adamantiumIngot};

    public static final Object[] silkGem = new Object[]{" x ", "xyx", " x ", charX, Items.diamond, charY, new ItemStack(Blocks.wool, 1, wildcard)};
    public static final Object[] expCollector = new Object[]{"xxx", "xyx", "xxx", 'x', FTContent.shardExp, 'y', Items.diamond};

    // Bows
    public static final Object[] quartzBow = new Object[]{"xy", "x y", "xy", charY, FTStacks.quartzStack, charX, FTStacks.stringStack};
    public static final Object[] obsidianBow = new Object[]{"xy", "x y", "xy", charY, FTStacks.obsidianIngot, charX, FTStacks.stringStack};
    public static final Object[] emeraldBow = new Object[]{"xy", "x y", "xy", charY, FTStacks.emeraldCrystal, charX, FTStacks.stringStack};
    public static final Object[] lapisBow = new Object[]{"xy", "x y", "xy", charY, FTStacks.lapisCrystal, charX, FTStacks.stringStack};
    public static final Object[] bronzeBow = new Object[]{"xy", "x y", "xy", charY, FTStacks.bronzeIngot, charX, FTStacks.stringStack};
    public static final Object[] coalBow = new Object[]{"xy", "x y", "xy", charY, FTStacks.coalIngot, charX, FTStacks.stringStack};
    public static final Object[] glowstoneBow = new Object[]{"xy", "x y", "xy", charY, FTStacks.glowstoneIngot, charX, FTStacks.stringStack};
    public static final Object[] adamantiumBow = new Object[]{"xy", "x y", "xy", charY, FTStacks.adamantiumIngot, charX, FTStacks.stringStack};

    public static final Object[] obsidianWorkbench = new Object[]{"xx", "xx", 'x', FTContent.plankObsidian};
    public static final Object[] emeraldWorkbench = new Object[]{"xx", "xx", 'x', FTContent.plankEmerald};
    public static final Object[] lapisWorkbench = new Object[]{"xx", "xx", 'x', FTContent.plankLapis};
    public static final Object[] bronzeWorkbench = new Object[]{"xx", "xx", 'x', FTContent.plankBronze};
    public static final Object[] coalWorkbench = new Object[]{"xx", "xx", 'x', FTContent.plankCoal};
    public static final Object[] glowstoneWorkbench = new Object[]{"xx", "xx", 'x', FTContent.plankGlowstone};
    public static final Object[] adamantiumWorkbench = new Object[]{"xx", "xx", 'x', FTContent.plankAdamantium};
    public static final Object[] silkWorkbench = new Object[]{"xx", "xx", 'x', FTContent.plankSilk};
    public static final Object[] redstoneWorkbench = new Object[]{"xx", "xx", 'x', FTContent.plankRedstone};
}
