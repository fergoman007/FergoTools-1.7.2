package io.github.fergoman123.fergotools.init;


import cpw.mods.fml.common.Mod;
import io.github.fergoman123.fergotools.util.item.FTStacks;
import io.github.fergoman123.fergotools.util.item.RecipeList;
import io.github.fergoman123.fergoutil.helper.RecipeHelper;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import static io.github.fergoman123.fergotools.init.ModBlocks.*;
import static io.github.fergoman123.fergotools.init.ModItems.*;
import static net.minecraft.init.Items.*;
import static net.minecraft.init.Blocks.*;
import static net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE;

public class Recipes
{
    public static void init()
    {
        RecipeHelper.addShapelessRecipe(new ItemStack(ingotObsidian, 9), new ItemStack(blockObsidian));
        RecipeHelper.addShapelessRecipe(new ItemStack(gemEmerald, 9), new ItemStack(blockEmeraldCrystal));
        RecipeHelper.addShapelessRecipe(new ItemStack(gemLapis, 9), new ItemStack(blockLapisCrystal));
        RecipeHelper.addShapelessRecipe(new ItemStack(ingotBronze, 9), new ItemStack(blockBronze));
        RecipeHelper.addShapelessRecipe(new ItemStack(ingotAdamantium, 9), new ItemStack(blockAdamantium));
        RecipeHelper.addShapelessRecipe(new ItemStack(ingotCoal, 9), new ItemStack(blockCoal));
        RecipeHelper.addShapelessRecipe(new ItemStack(ingotGlowstone, 9), new ItemStack(blockGlowstone));
        RecipeHelper.addShapelessRecipe(new ItemStack(shardExp, 9), new ItemStack(blockExperience));
        RecipeHelper.addShapelessRecipe(new ItemStack(gemSilk, 9), new ItemStack(blockSilkGem));
        RecipeHelper.addShapelessRecipe(new ItemStack(expCollector, 9), new ItemStack(blockExpCollector));

        RecipeHelper.addRecipe(new ItemStack(gemSilk), new Object[]{" x ", "xyx", " x ", 'x', diamond, 'y', new ItemStack(wool, 1, WILDCARD_VALUE)});
        RecipeHelper.addRecipe(new ItemStack(expCollector, 32), new Object[]{"xxx", "xyx", "xxx", 'x', shardExp, 'y', diamond});

        RecipeHelper.addRecipe(new ItemStack(blockObsidian), RecipeList.blockObsidian);
        RecipeHelper.addRecipe(new ItemStack(blockEmeraldCrystal),  RecipeList.blockEmeraldCrystal);
        RecipeHelper.addRecipe(new ItemStack(blockLapisCrystal), RecipeList.blockLapisCrystal);
        RecipeHelper.addRecipe(new ItemStack(blockBronze), RecipeList.blockBronze);
        RecipeHelper.addRecipe(new ItemStack(blockCoal), RecipeList.blockCoal);
        RecipeHelper.addRecipe(new ItemStack(blockGlowstone), RecipeList.blockGlowstone);
        RecipeHelper.addRecipe(new ItemStack(blockAdamantium), RecipeList.blockAdamantium);
        RecipeHelper.addRecipe(new ItemStack(blockExperience), RecipeList.blockExperience);
        RecipeHelper.addRecipe(new ItemStack(blockSilkGem), RecipeList.blockSilkGem);
        RecipeHelper.addRecipe(new ItemStack(blockRedstoneCrystal), RecipeList.blockRedstone);

        RecipeHelper.addRecipe(new ItemStack(quartzPickaxe), RecipeList.quartzPickaxe);
        RecipeHelper.addRecipe(new ItemStack(quartzShovel), RecipeList.quartzShovel);
        RecipeHelper.addRecipe(new ItemStack(quartzAxe), RecipeList.quartzAxe);
        RecipeHelper.addRecipe(new ItemStack(quartzHoe), RecipeList.quartzHoe);
        RecipeHelper.addRecipe(new ItemStack(quartzSword), RecipeList.quartzSword);

        RecipeHelper.addRecipe(FTStacks.quartzPickaxe, RecipeList.quartzPickaxe);
        RecipeHelper.addRecipe(FTStacks.quartzShovel, RecipeList.quartzShovel);
        RecipeHelper.addRecipe(FTStacks.quartzAxe, RecipeList.quartzAxe);
        RecipeHelper.addRecipe(FTStacks.quartzHoe, RecipeList.quartzHoe);
        RecipeHelper.addRecipe(FTStacks.quartzSword, RecipeList.quartzSword);

        RecipeHelper.addRecipe(FTStacks.obsidianPickaxe, RecipeList.obsidianPickaxe);
        RecipeHelper.addRecipe(FTStacks.obsidianShovel, RecipeList.obsidianShovel);
        RecipeHelper.addRecipe(FTStacks.obsidianAxe, RecipeList.obsidianAxe);
        RecipeHelper.addRecipe(FTStacks.obsidianHoe, RecipeList.obsidianHoe);
        RecipeHelper.addRecipe(FTStacks.obsidianSword, RecipeList.obsidianSword);

        RecipeHelper.addRecipe(FTStacks.emeraldPickaxe, RecipeList.emeraldPickaxe);
        RecipeHelper.addRecipe(FTStacks.emeraldShovel, RecipeList.emeraldShovel);
        RecipeHelper.addRecipe(FTStacks.emeraldAxe, RecipeList.emeraldAxe);
        RecipeHelper.addRecipe(FTStacks.emeraldHoe, RecipeList.emeraldHoe);
        RecipeHelper.addRecipe(FTStacks.emeraldSword, RecipeList.emeraldSword);

        RecipeHelper.addRecipe(FTStacks.lapisPickaxe, RecipeList.lapisPickaxe);
        RecipeHelper.addRecipe(FTStacks.lapisShovel, RecipeList.lapisShovel);
        RecipeHelper.addRecipe(FTStacks.lapisAxe, RecipeList.lapisAxe);
        RecipeHelper.addRecipe(FTStacks.lapisHoe, RecipeList.lapisHoe);
        RecipeHelper.addRecipe(FTStacks.lapisSword, RecipeList.lapisSword);

        RecipeHelper.addRecipe(FTStacks.bronzePickaxe, RecipeList.bronzePickaxe);
        RecipeHelper.addRecipe(FTStacks.bronzeShovel, RecipeList.bronzeShovel);
        RecipeHelper.addRecipe(FTStacks.bronzeAxe, RecipeList.bronzeAxe);
        RecipeHelper.addRecipe(FTStacks.bronzeHoe, RecipeList.bronzeHoe);
        RecipeHelper.addRecipe(FTStacks.bronzeSword, RecipeList.bronzeSword);

        RecipeHelper.addRecipe(FTStacks.coalPickaxe, RecipeList.coalPickaxe);
        RecipeHelper.addRecipe(FTStacks.coalShovel, RecipeList.coalShovel);
        RecipeHelper.addRecipe(FTStacks.coalAxe, RecipeList.coalAxe);
        RecipeHelper.addRecipe(FTStacks.coalHoe, RecipeList.coalHoe);
        RecipeHelper.addRecipe(FTStacks.coalSword, RecipeList.coalSword);

        RecipeHelper.addRecipe(FTStacks.adamantiumPickaxe, RecipeList.adamantiumPickaxe);
        RecipeHelper.addRecipe(FTStacks.adamantiumShovel, RecipeList.adamantiumShovel);
        RecipeHelper.addRecipe(FTStacks.adamantiumAxe, RecipeList.adamantiumAxe);
        RecipeHelper.addRecipe(FTStacks.adamantiumHoe, RecipeList.adamantiumHoe);
        RecipeHelper.addRecipe(FTStacks.adamantiumSword, RecipeList.adamantiumSword);

        RecipeHelper.addRecipe(FTStacks.glowstonePickaxe, RecipeList.glowstonePickaxe);
        RecipeHelper.addRecipe(FTStacks.glowstoneShovel, RecipeList.glowstoneShovel);
        RecipeHelper.addRecipe(FTStacks.glowstoneAxe, RecipeList.glowstoneAxe);
        RecipeHelper.addRecipe(FTStacks.glowstoneHoe, RecipeList.glowstoneHoe);
        RecipeHelper.addRecipe(FTStacks.glowstoneSword, RecipeList.glowstoneSword);

        RecipeHelper.addRecipe(FTStacks.silkPickaxe, RecipeList.silkPickaxe);
        RecipeHelper.addRecipe(FTStacks.silkShovel, RecipeList.silkShovel);
        RecipeHelper.addRecipe(FTStacks.silkAxe, RecipeList.silkAxe);
        RecipeHelper.addRecipe(FTStacks.silkHoe, RecipeList.silkHoe);
        RecipeHelper.addRecipe(FTStacks.silkSword, RecipeList.silkSword);

        RecipeHelper.addRecipe(FTStacks.quartzFurnaceIdle, RecipeList.quartzFurnace);
        RecipeHelper.addRecipe(FTStacks.obsidianFurnaceIdle, RecipeList.obsidianFurnace);
        RecipeHelper.addRecipe(FTStacks.emeraldCrystalFurnaceIdle, RecipeList.emeraldCrystalFurnace);
        RecipeHelper.addRecipe(FTStacks.lapisCrystalFurnaceIdle, RecipeList.lapisCrystalFurnace);
        RecipeHelper.addRecipe(FTStacks.bronzeFurnaceIdle, RecipeList.bronzeFurnace);
        RecipeHelper.addRecipe(FTStacks.adamantiumFurnaceIdle, RecipeList.adamantiumFurnace);
        RecipeHelper.addRecipe(FTStacks.coalFurnaceIdle, RecipeList.coalFurnace);
        RecipeHelper.addRecipe(FTStacks.glowstoneFurnaceIdle, RecipeList.glowstoneFurnace);
        RecipeHelper.addRecipe(FTStacks.adamantiumFurnaceIdle, RecipeList.adamantiumFurnace);
        RecipeHelper.addRecipe(FTStacks.silkFurnaceIdle, RecipeList.silkFurnace);
        RecipeHelper.addRecipe(FTStacks.redstoneFurnaceIdle, RecipeList.redstoneFurnace);
        RecipeHelper.addRecipe(FTStacks.maceratorIdle, RecipeList.macerator);

        RecipeHelper.addBlockSmelting(ModBlocks.oreObsidian, FTStacks.obsidianIngot, 2.5f);
        RecipeHelper.addBlockSmelting(ModBlocks.oreEmeraldCrystal, FTStacks.emeraldCrystal, 2.5f);
        RecipeHelper.addBlockSmelting(ModBlocks.oreLapisCrystal, FTStacks.lapisCrystal, 2.5f);
        RecipeHelper.addBlockSmelting(ModBlocks.oreBronze, FTStacks.bronzeIngot, 2.5f);
        RecipeHelper.addBlockSmelting(Blocks.coal_block, FTStacks.coalIngot, 2.5f);
        RecipeHelper.addBlockSmelting(Blocks.glowstone, FTStacks.glowstoneIngot, 2.5f);
        RecipeHelper.addBlockSmelting(ModBlocks.oreAdamantium, FTStacks.adamantiumIngot, 2.5f);
        RecipeHelper.addBlockSmelting(ModBlocks.oreExperience, FTStacks.expShard5, 2.5f);
        RecipeHelper.addBlockSmelting(ModBlocks.oreCrystalRed, FTStacks.redCrystal, 2.5f);



        RecipeHelper.addRecipe(FTStacks.quartzHelmet, RecipeList.quartzHelmet);
        RecipeHelper.addRecipe(FTStacks.quartzChestplate, RecipeList.quartzChestplate);
        RecipeHelper.addRecipe(FTStacks.quartzLeggings, RecipeList.quartzLeggings);
        RecipeHelper.addRecipe(FTStacks.quartzBoots, RecipeList.quartzBoots);

        RecipeHelper.addRecipe(FTStacks.obsidianHelmet, RecipeList.obsidianHelmet);
        RecipeHelper.addRecipe(FTStacks.obsidianChestplate, RecipeList.obsidianChestplate);
        RecipeHelper.addRecipe(FTStacks.obsidianLeggings, RecipeList.obsidianLeggings);
        RecipeHelper.addRecipe(FTStacks.obsidianBoots, RecipeList.obsidianBoots);

        RecipeHelper.addRecipe(FTStacks.emeraldHelmet, RecipeList.emeraldHelmet);
        RecipeHelper.addRecipe(FTStacks.emeraldChestplate, RecipeList.emeraldChestplate);
        RecipeHelper.addRecipe(FTStacks.emeraldLeggings, RecipeList.emeraldLeggings);
        RecipeHelper.addRecipe(FTStacks.emeraldBoots, RecipeList.emeraldBoots);

        RecipeHelper.addRecipe(FTStacks.lapisHelmet, RecipeList.lapisHelmet);
        RecipeHelper.addRecipe(FTStacks.lapisChestplate, RecipeList.lapisChestplate);
        RecipeHelper.addRecipe(FTStacks.lapisLeggings, RecipeList.lapisLeggings);
        RecipeHelper.addRecipe(FTStacks.lapisBoots, RecipeList.lapisBoots);


        RecipeHelper.addRecipe(FTStacks.bronzeHelmet, RecipeList.bronzeHelmet);
        RecipeHelper.addRecipe(FTStacks.bronzeChestplate, RecipeList.bronzeChestplate);
        RecipeHelper.addRecipe(FTStacks.bronzeLeggings, RecipeList.bronzeLeggings);
        RecipeHelper.addRecipe(FTStacks.bronzeBoots, RecipeList.bronzeBoots);

        RecipeHelper.addRecipe(FTStacks.coalHelmet, RecipeList.coalHelmet);
        RecipeHelper.addRecipe(FTStacks.coalChestplate, RecipeList.coalChestplate);
        RecipeHelper.addRecipe(FTStacks.coalLeggings, RecipeList.coalLeggings);
        RecipeHelper.addRecipe(FTStacks.coalBoots, RecipeList.coalBoots);

        RecipeHelper.addRecipe(FTStacks.glowstoneHelmet, RecipeList.glowstoneHelmet);
        RecipeHelper.addRecipe(FTStacks.glowstoneChestplate, RecipeList.glowstoneChestplate);
        RecipeHelper.addRecipe(FTStacks.glowstoneLeggings, RecipeList.glowstoneLeggings);
        RecipeHelper.addRecipe(FTStacks.glowstoneBoots, RecipeList.glowstoneBoots);

        RecipeHelper.addRecipe(FTStacks.redstoneHelmet, RecipeList.redstoneHelmet);
        RecipeHelper.addRecipe(FTStacks.redstoneChestplate, RecipeList.redstoneChestplate);
        RecipeHelper.addRecipe(FTStacks.redstoneLeggings, RecipeList.redstoneLeggings);
        RecipeHelper.addRecipe(FTStacks.redstoneBoots, RecipeList.redstoneBoots);

        RecipeHelper.addRecipe(FTStacks.adamantiumHelmet, RecipeList.adamantiumHelmet);
        RecipeHelper.addRecipe(FTStacks.adamantiumChestplate, RecipeList.adamantiumChestplate);
        RecipeHelper.addRecipe(FTStacks.adamantiumLeggings, RecipeList.adamantiumLeggings);
        RecipeHelper.addRecipe(FTStacks.adamantiumBoots, RecipeList.adamantiumBoots);

        RecipeHelper.addRecipe(FTStacks.quartzBow, RecipeList.quartzBow);
        RecipeHelper.addRecipe(FTStacks.obsidianBow, RecipeList.obsidianBow);
        RecipeHelper.addRecipe(FTStacks.emeraldBow, RecipeList.emeraldBow);
        RecipeHelper.addRecipe(FTStacks.lapisBow, RecipeList.lapisBow);
        RecipeHelper.addRecipe(FTStacks.bronzeBow, RecipeList.bronzeBow);
        RecipeHelper.addRecipe(FTStacks.coalBow, RecipeList.coalBow);
        RecipeHelper.addRecipe(FTStacks.glowstoneBow, RecipeList.glowstoneBow);
        RecipeHelper.addRecipe(FTStacks.adamantiumBow, RecipeList.adamantiumBow);

        RecipeHelper.addShapelessRecipe(new ItemStack(ModBlocks.plankObsidian, 4), new ItemStack(ModBlocks.logObsidian));
        RecipeHelper.addShapelessRecipe(new ItemStack(ModBlocks.plankEmerald, 4), new ItemStack(ModBlocks.logEmerald));
        RecipeHelper.addShapelessRecipe(new ItemStack(ModBlocks.plankLapis, 4), new ItemStack(ModBlocks.logLapis));
        RecipeHelper.addShapelessRecipe(new ItemStack(ModBlocks.plankBronze, 4), new ItemStack(ModBlocks.logBronze));
        RecipeHelper.addShapelessRecipe(new ItemStack(ModBlocks.plankCoal, 4), new ItemStack(ModBlocks.logCoal));
        RecipeHelper.addShapelessRecipe(new ItemStack(ModBlocks.plankGlowstone, 4), new ItemStack(ModBlocks.logGlowstone));
        RecipeHelper.addShapelessRecipe(new ItemStack(ModBlocks.plankAdamantium, 4), new ItemStack(ModBlocks.logAdamantium));
        RecipeHelper.addShapelessRecipe(new ItemStack(ModBlocks.plankSilk, 4), new ItemStack(ModBlocks.logSilk));
        RecipeHelper.addShapelessRecipe(new ItemStack(ModBlocks.plankRedstone, 4), new ItemStack(ModBlocks.logRedstone));

        RecipeHelper.addRecipe(new ItemStack(ModBlocks.obsidianWorkbench), RecipeList.obsidianWorkbench);
        RecipeHelper.addRecipe(new ItemStack(ModBlocks.obsidianWorkbench), RecipeList.emeraldWorkbench);
        RecipeHelper.addRecipe(new ItemStack(ModBlocks.obsidianWorkbench), RecipeList.lapisWorkbench);
        RecipeHelper.addRecipe(new ItemStack(ModBlocks.obsidianWorkbench), RecipeList.bronzeWorkbench);
        RecipeHelper.addRecipe(new ItemStack(ModBlocks.obsidianWorkbench), RecipeList.coalWorkbench);
        RecipeHelper.addRecipe(new ItemStack(ModBlocks.obsidianWorkbench), RecipeList.glowstoneWorkbench);
        RecipeHelper.addRecipe(new ItemStack(ModBlocks.obsidianWorkbench), RecipeList.adamantiumWorkbench);
        RecipeHelper.addRecipe(new ItemStack(ModBlocks.obsidianWorkbench), RecipeList.silkWorkbench);
        RecipeHelper.addRecipe(new ItemStack(ModBlocks.obsidianWorkbench), RecipeList.redstoneWorkbench);
    }
}
