 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.item;


 import io.github.fergoman123.fergotools.init.FTItems;
 import io.github.fergoman123.fergoutil.helper.RecipeHelper;
 import net.minecraft.init.Blocks;
 import net.minecraft.init.Items;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.oredict.OreDictionary;

 public class RecipeList {

    public static final char charX = 'x';
    public static final char charY = 'y';
    public static final int wildcard = OreDictionary.WILDCARD_VALUE;

    // Blocks
    public static final Object[] blockObsidian = new Object[]{RecipeHelper.getBlockRecipe(), charX, FTStacks.obsidianIngot};
    public static final Object[] blockEmeraldCrystal = new Object[]{RecipeHelper.getBlockRecipe(), charX, FTStacks.emeraldCrystal};
    public static final Object[] blockLapisCrystal = new Object[]{RecipeHelper.getBlockRecipe(), charX, FTStacks.lapisCrystal};
    public static final Object[] blockBronze = new Object[]{RecipeHelper.getBlockRecipe(), charX, FTStacks.bronzeIngot};
    public static final Object[] blockCoal = new Object[]{RecipeHelper.getBlockRecipe(), charX, FTStacks.coalIngot};
    public static final Object[] blockGlowstone = new Object[]{RecipeHelper.getBlockRecipe(), charX,  FTStacks.glowstoneIngot};
    public static final Object[] blockAdamantium = new Object[]{RecipeHelper.getBlockRecipe(), charX, FTStacks.adamantiumIngot};
    public static final Object[] blockExperience = new Object[]{RecipeHelper.getBlockRecipe(), charX, FTStacks.expShard};
    public static final Object[] blockSilkGem = new Object[]{RecipeHelper.getBlockRecipe(), charX, FTStacks.silkGem};
    public static final Object[] blockRedstone = new Object[]{RecipeHelper.getBlockRecipe(), charX, FTStacks.redCrystal};

    // Furnaces
    public static final Object[] quartzFurnace = new Object[]{RecipeHelper.getFurnaceRecipe(), charX, FTStacks.quartzBlock};
    public static final Object[] obsidianFurnace = new Object[]{RecipeHelper.getFurnaceRecipe(), charX, FTStacks.blockObsidian};
    public static final Object[] emeraldCrystalFurnace = new Object[]{RecipeHelper.getFurnaceRecipe(), charX, FTStacks.blockEmeraldCrystal};
    public static final Object[] lapisCrystalFurnace = new Object[]{RecipeHelper.getFurnaceRecipe(), charX, FTStacks.blockLapisCrystal};
    public static final Object[] bronzeFurnace = new Object[]{RecipeHelper.getFurnaceRecipe(), charX, FTStacks.blockBronze};
    public static final Object[] coalFurnace = new Object[]{RecipeHelper.getFurnaceRecipe(), charX, FTStacks.blockCoal};
    public static final Object[] glowstoneFurnace = new Object[]{RecipeHelper.getFurnaceRecipe(), charX, FTStacks.blockGlowstone};
    public static final Object[] adamantiumFurnace = new Object[]{RecipeHelper.getFurnaceRecipe(), charX, FTStacks.blockAdamantium};
    public static final Object[] silkFurnace = new Object[]{RecipeHelper.getFurnaceRecipe(), charX, FTStacks.blockSilkGem};
    public static final Object[] redstoneFurnace = new Object[]{RecipeHelper.getFurnaceRecipe(), charX, FTStacks.blockRedstone};
    public static final Object[] macerator = new Object[]{"xxx", "xyx", "xxx", charX, FTStacks.blockAdamantium, charY, new ItemStack(Blocks.iron_block)};
    // Tools
    public static final Object[] quartzPickaxe = new Object[]{RecipeHelper.getPickaxeRecipe(), charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzShovel = new Object[]{RecipeHelper.getShovelRecipe(), charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzAxe = new Object[]{RecipeHelper.getAxeRecipe(), charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzHoe = new Object[]{RecipeHelper.getHoeRecipe(), charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzSword = new Object[]{RecipeHelper.getSwordRecipe(), charX, FTStacks.quartzStack, charY, FTStacks.stickStack};

    public static final Object[] obsidianPickaxe = new Object[]{RecipeHelper.getPickaxeRecipe(), charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianShovel = new Object[]{RecipeHelper.getShovelRecipe(), charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianAxe = new Object[]{RecipeHelper.getAxeRecipe(), charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianHoe = new Object[]{RecipeHelper.getHoeRecipe(), charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianSword = new Object[]{RecipeHelper.getSwordRecipe(), charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};

    public static final Object[] emeraldPickaxe = new Object[]{RecipeHelper.getPickaxeRecipe(), charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldShovel = new Object[]{RecipeHelper.getShovelRecipe(), charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldAxe = new Object[]{RecipeHelper.getAxeRecipe(), charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldHoe = new Object[]{RecipeHelper.getHoeRecipe(), charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldSword = new Object[]{RecipeHelper.getSwordRecipe(), charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};

    public static final Object[] lapisPickaxe = new Object[]{RecipeHelper.getPickaxeRecipe(), charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisShovel = new Object[]{RecipeHelper.getShovelRecipe(), charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisAxe = new Object[]{RecipeHelper.getAxeRecipe(), charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisHoe = new Object[]{RecipeHelper.getHoeRecipe(), charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisSword = new Object[]{RecipeHelper.getSwordRecipe(), charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};

    public static final Object[] bronzePickaxe = new Object[]{RecipeHelper.getPickaxeRecipe(), charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeShovel = new Object[]{RecipeHelper.getShovelRecipe(), charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeAxe = new Object[]{RecipeHelper.getAxeRecipe(), charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeHoe = new Object[]{RecipeHelper.getHoeRecipe(), charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeSword = new Object[]{RecipeHelper.getSwordRecipe(), charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};

    public static final Object[] coalPickaxe = new Object[]{RecipeHelper.getPickaxeRecipe(), charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalShovel = new Object[]{RecipeHelper.getShovelRecipe(), charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalAxe = new Object[]{RecipeHelper.getAxeRecipe(), charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalHoe = new Object[]{RecipeHelper.getHoeRecipe(), charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalSword = new Object[]{RecipeHelper.getSwordRecipe(), charX, FTStacks.coalIngot, charY, FTStacks.stickStack};

    public static final Object[] glowstonePickaxe = new Object[]{RecipeHelper.getPickaxeRecipe(), charX , FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneShovel = new Object[]{RecipeHelper.getShovelRecipe(), charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneAxe = new Object[]{RecipeHelper.getAxeRecipe(), charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneHoe = new Object[]{RecipeHelper.getHoeRecipe(), charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneSword = new Object[]{RecipeHelper.getSwordRecipe(), charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};

    public static final Object[] adamantiumPickaxe = new Object[]{RecipeHelper.getPickaxeRecipe(), charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumShovel = new Object[]{RecipeHelper.getShovelRecipe(), charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumAxe = new Object[]{RecipeHelper.getAxeRecipe(), charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumHoe = new Object[]{RecipeHelper.getHoeRecipe(), charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumSword = new Object[]{RecipeHelper.getSwordRecipe(), charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};

    public static final Object[] silkPickaxe = new Object[]{RecipeHelper.getPickaxeRecipe(), charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkShovel = new Object[]{RecipeHelper.getShovelRecipe(), charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkAxe = new Object[]{RecipeHelper.getAxeRecipe(), charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkHoe = new Object[]{RecipeHelper.getHoeRecipe(), charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkSword = new Object[]{RecipeHelper.getSwordRecipe(), charX, FTStacks.silkGem, charY, FTStacks.stickStack};

    public static final Object[] redstonePickaxe = new Object[]{RecipeHelper.getPickaxeRecipe(), charX, FTStacks.redCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneShovel = new Object[]{RecipeHelper.getShovelRecipe(), charX, FTStacks.redCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneAxe = new Object[]{RecipeHelper.getAxeRecipe(), charX, FTStacks.redCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneHoe = new Object[]{RecipeHelper.getHoeRecipe(), charX, FTStacks.redCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneSword = new Object[]{RecipeHelper.getSwordRecipe(), charX, FTStacks.redCrystal, charY, FTStacks.stickStack};

    // Armor
    public static final Object[] quartzHelmet = new Object[]{RecipeHelper.getHelmetRecipe(), charX, FTStacks.quartzStack};
    public static final Object[] quartzChestplate = new Object[]{RecipeHelper.getChestplateRecipe(), charX, FTStacks.quartzStack};
    public static final Object[] quartzLeggings = new Object[]{RecipeHelper.getLeggingsRecipe(), charX, FTStacks.quartzStack};
    public static final Object[] quartzBoots = new Object[]{RecipeHelper.getBootsRecipe(), charX, FTStacks.quartzStack};

    public static final Object[] obsidianHelmet = new Object[]{RecipeHelper.getHelmetRecipe(), charX, FTStacks.obsidianIngot};
    public static final Object[] obsidianChestplate = new Object[]{RecipeHelper.getChestplateRecipe(), charX, FTStacks.obsidianIngot};
    public static final Object[] obsidianLeggings = new Object[]{RecipeHelper.getLeggingsRecipe(), charX, FTStacks.obsidianIngot};
    public static final Object[] obsidianBoots = new Object[]{RecipeHelper.getBootsRecipe(), charX, FTStacks.obsidianIngot};

    public static final Object[] emeraldHelmet = new Object[]{RecipeHelper.getHelmetRecipe(), charX, FTStacks.emeraldCrystal};
    public static final Object[] emeraldChestplate = new Object[]{RecipeHelper.getChestplateRecipe(), charX, FTStacks.emeraldCrystal};
    public static final Object[] emeraldLeggings = new Object[]{RecipeHelper.getLeggingsRecipe(), charX, FTStacks.emeraldCrystal};
    public static final Object[] emeraldBoots = new Object[]{RecipeHelper.getBootsRecipe(), charX, FTStacks.emeraldCrystal};

    public static final Object[] lapisHelmet = new Object[]{RecipeHelper.getHelmetRecipe(), charX, FTStacks.lapisCrystal};
    public static final Object[] lapisChestplate = new Object[]{RecipeHelper.getChestplateRecipe(), charX, FTStacks.lapisCrystal};
    public static final Object[] lapisLeggings = new Object[]{RecipeHelper.getLeggingsRecipe(), charX, FTStacks.lapisCrystal};
    public static final Object[] lapisBoots = new Object[]{RecipeHelper.getBootsRecipe(), charX, FTStacks.lapisCrystal};

    public static final Object[] bronzeHelmet = new Object[]{RecipeHelper.getHelmetRecipe(), charX, FTStacks.bronzeIngot};
    public static final Object[] bronzeChestplate = new Object[]{RecipeHelper.getChestplateRecipe(), charX, FTStacks.bronzeIngot};
    public static final Object[] bronzeLeggings = new Object[]{RecipeHelper.getLeggingsRecipe(), charX, FTStacks.bronzeIngot};
    public static final Object[] bronzeBoots = new Object[]{RecipeHelper.getBootsRecipe(), charX, FTStacks.bronzeIngot};

    public static final Object[] coalHelmet = new Object[]{RecipeHelper.getHelmetRecipe(), charX, FTStacks.coalIngot};
    public static final Object[] coalChestplate = new Object[]{RecipeHelper.getChestplateRecipe(), charX, FTStacks.coalIngot};
    public static final Object[] coalLeggings = new Object[]{RecipeHelper.getLeggingsRecipe(), charX, FTStacks.coalIngot};
    public static final Object[] coalBoots = new Object[]{RecipeHelper.getBootsRecipe(), charX, FTStacks.coalIngot};

    public static final Object[] glowstoneHelmet = new Object[]{RecipeHelper.getHelmetRecipe(), charX, FTStacks.glowstoneIngot};
    public static final Object[] glowstoneChestplate = new Object[]{RecipeHelper.getChestplateRecipe(), charX, FTStacks.glowstoneIngot};
    public static final Object[] glowstoneLeggings = new Object[]{RecipeHelper.getLeggingsRecipe(), charX, FTStacks.glowstoneIngot};
    public static final Object[] glowstoneBoots = new Object[]{RecipeHelper.getBootsRecipe(), charX, FTStacks.glowstoneIngot};

    public static final Object[] redstoneHelmet = new Object[]{RecipeHelper.getHelmetRecipe(), charX, FTStacks.redCrystal};
    public static final Object[] redstoneChestplate = new Object[]{RecipeHelper.getChestplateRecipe(), charX, FTStacks.redCrystal};
    public static final Object[] redstoneLeggings = new Object[]{RecipeHelper.getLeggingsRecipe(), charX, FTStacks.redCrystal};
    public static final Object[] redstoneBoots = new Object[]{RecipeHelper.getBootsRecipe(), charX, FTStacks.redCrystal};

    public static final Object[] adamantiumHelmet = new Object[]{RecipeHelper.getHelmetRecipe(), 'x', FTStacks.adamantiumIngot};
    public static final Object[] adamantiumChestplate = new Object[]{RecipeHelper.getChestplateRecipe(), charX, FTStacks.adamantiumIngot};
    public static final Object[] adamantiumLeggings = new Object[]{RecipeHelper.getLeggingsRecipe(), charX, FTStacks.adamantiumIngot};
    public static final Object[] adamantiumBoots = new Object[]{RecipeHelper.getBootsRecipe(), charX, FTStacks.adamantiumIngot};

    public static final Object[] silkGem = new Object[]{" x ", "xyx", " x ", charX, Items.diamond, charY, new ItemStack(Blocks.wool, 1, wildcard)};
    public static final Object[] expCollector = new Object[]{"xxx", "xyx", "xxx", 'x', FTItems.ItemExpShard.instance, 'y', Items.diamond};

    // Bows
    public static final Object[] quartzBow = new Object[]{RecipeHelper.getBowRecipe(), charY, FTStacks.quartzStack, charX, FTStacks.stringStack};
    public static final Object[] obsidianBow = new Object[]{RecipeHelper.getBowRecipe(), charY, FTStacks.obsidianIngot, charX, FTStacks.stringStack};
    public static final Object[] emeraldBow = new Object[]{RecipeHelper.getBowRecipe(), charY, FTStacks.emeraldCrystal, charX, FTStacks.stringStack};
    public static final Object[] lapisBow = new Object[]{RecipeHelper.getBowRecipe(), charY, FTStacks.lapisCrystal, charX, FTStacks.stringStack};
    public static final Object[] bronzeBow = new Object[]{RecipeHelper.getBowRecipe(), charY, FTStacks.bronzeIngot, charX, FTStacks.stringStack};
    public static final Object[] coalBow = new Object[]{RecipeHelper.getBowRecipe(), charY, FTStacks.coalIngot, charX, FTStacks.stringStack};
    public static final Object[] glowstoneBow = new Object[]{RecipeHelper.getBowRecipe(), charY, FTStacks.glowstoneIngot, charX, FTStacks.stringStack};
    public static final Object[] adamantiumBow = new Object[]{RecipeHelper.getBowRecipe(), charY, FTStacks.adamantiumIngot, charX, FTStacks.stringStack};

    public static final Object[] obsidianWorkbench = new Object[]{"xx", "xx", 'x', FTStacks.planks[0]};
    public static final Object[] emeraldWorkbench = new Object[]{"xx", "xx", 'x', FTStacks.planks[1]};
    public static final Object[] lapisWorkbench = new Object[]{"xx", "xx", 'x', FTStacks.planks[2]};
    public static final Object[] bronzeWorkbench = new Object[]{"xx", "xx", 'x', FTStacks.planks[3]};
    public static final Object[] coalWorkbench = new Object[]{"xx", "xx", 'x', FTStacks.planks[4]};
    public static final Object[] glowstoneWorkbench = new Object[]{"xx", "xx", 'x', FTStacks.planks[5]};
    public static final Object[] adamantiumWorkbench = new Object[]{"xx", "xx", 'x', FTStacks.planks[6]};
    public static final Object[] silkWorkbench = new Object[]{"xx", "xx", 'x', FTStacks.planks[7]};
    public static final Object[] redstoneWorkbench = new Object[]{"xx", "xx", 'x', FTStacks.planks[8]};
}
