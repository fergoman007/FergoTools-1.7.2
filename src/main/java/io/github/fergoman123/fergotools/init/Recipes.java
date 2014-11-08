package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.util.item.FTStacks;
import io.github.fergoman123.fergotools.util.item.RecipeList;
import io.github.fergoman123.fergotools.workbenches.ObsidianWorkbench.BlockObsidianWorkbench;
import io.github.fergoman123.fergotools.workbenches.EmeraldWorkbench.BlockEmeraldWorkbench;
import io.github.fergoman123.fergotools.workbenches.LapisWorkbench.BlockLapisWorkbench;
import io.github.fergoman123.fergotools.workbenches.BronzeWorkbench.BlockBronzeWorkbench;
import io.github.fergoman123.fergotools.workbenches.CoalWorkbench.BlockCoalWorkbench;
import io.github.fergoman123.fergotools.workbenches.GlowstoneWorkbench.BlockGlowstoneWorkbench;
import io.github.fergoman123.fergotools.workbenches.AdamantiumWorkbench.BlockAdamantiumWorkbench;
import io.github.fergoman123.fergotools.workbenches.SilkWorkbench.BlockSilkWorkbench;
import io.github.fergoman123.fergotools.workbenches.RedstoneWorkbench.BlockRedstoneWorkbench;
import io.github.fergoman123.fergoutil.helper.RecipeHelper;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import io.github.fergoman123.fergotools.init.FTItems.*;
import io.github.fergoman123.fergotools.init.FTBlocks.*;
import static net.minecraft.init.Items.*;
import static net.minecraft.init.Blocks.*;
import static net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE;

public class Recipes
{
    public static void init()
    {
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.ingotObsidian, 9), new ItemStack(FTContent.blockObsidian));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.gemEmerald, 9), new ItemStack(FTContent.blockEmerald));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.gemLapis, 9), new ItemStack(FTContent.blockLapis));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.ingotBronze, 9), new ItemStack(FTContent.blockBronze));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.ingotAdamantium, 9), new ItemStack(FTContent.blockAdamantium));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.ingotCoal, 9), new ItemStack(FTContent.blockCoal));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.ingotGlowstone, 9), new ItemStack(FTContent.blockGlowstone));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.shardExp, 9), new ItemStack(FTContent.blockExperience));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.gemSilk, 9), new ItemStack(FTContent.blockSilkGem));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.expCollector, 9), new ItemStack(FTContent.blockExpCollector));

        RecipeHelper.addRecipe(new ItemStack(FTContent.gemSilk), RecipeList.silkGem);
        RecipeHelper.addRecipe(new ItemStack(FTContent.expCollector, 1, FTContent.expCollector.getMaxDamage() - 1), RecipeList.expCollector);

        RecipeHelper.addRecipe(new ItemStack(FTContent.blockObsidian), RecipeList.blockObsidian);
        RecipeHelper.addRecipe(new ItemStack(FTContent.blockEmerald),  RecipeList.blockEmeraldCrystal);
        RecipeHelper.addRecipe(new ItemStack(FTContent.blockLapis), RecipeList.blockLapisCrystal);
        RecipeHelper.addRecipe(new ItemStack(FTContent.blockBronze), RecipeList.blockBronze);
        RecipeHelper.addRecipe(new ItemStack(FTContent.blockCoal), RecipeList.blockCoal);
        RecipeHelper.addRecipe(new ItemStack(FTContent.blockGlowstone), RecipeList.blockGlowstone);
        RecipeHelper.addRecipe(new ItemStack(FTContent.blockAdamantium), RecipeList.blockAdamantium);
        RecipeHelper.addRecipe(new ItemStack(FTContent.blockExperience), RecipeList.blockExperience);
        RecipeHelper.addRecipe(new ItemStack(FTContent.blockSilkGem), RecipeList.blockSilkGem);
        RecipeHelper.addRecipe(new ItemStack(FTContent.blockRedstone), RecipeList.blockRedstone);

        RecipeHelper.addRecipe(FTStacks.quartzPickaxe, RecipeList.quartzPickaxe);
        RecipeHelper.addRecipe(FTStacks.quartzShovel, RecipeList.quartzShovel);
        RecipeHelper.addRecipe(FTStacks.quartzAxe, RecipeList.quartzAxe);
        RecipeHelper.addRecipe(FTStacks.quartzHoe, RecipeList.quartzHoe);
        RecipeHelper.addRecipe(FTStacks.quartzSword, RecipeList.quartzSword);

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

        RecipeHelper.addBlockSmelting(FTContent.oreObsidian, FTStacks.obsidianIngot, 2.5f);
        RecipeHelper.addBlockSmelting(FTContent.oreGemEmerald, FTStacks.emeraldCrystal, 2.5f);
        RecipeHelper.addBlockSmelting(FTContent.oreGemLapis, FTStacks.lapisCrystal, 2.5f);
        RecipeHelper.addBlockSmelting(FTContent.oreBronze, FTStacks.bronzeIngot, 2.5f);
        RecipeHelper.addBlockSmelting(Blocks.coal_block, FTStacks.coalIngot, 2.5f);
        RecipeHelper.addBlockSmelting(Blocks.glowstone, FTStacks.glowstoneIngot, 2.5f);
        RecipeHelper.addBlockSmelting(FTContent.oreAdamantium, FTStacks.adamantiumIngot, 2.5f);
        RecipeHelper.addBlockSmelting(FTContent.oreExperience, FTStacks.expShard5, 2.5f);
        RecipeHelper.addBlockSmelting(FTContent.oreRedCrystal, FTStacks.redCrystal, 2.5f);



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

        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.plankObsidian), new ItemStack(FTContent.logObsidian));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.plankEmerald), new ItemStack(FTContent.logEmerald));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.plankLapis), new ItemStack(FTContent.logLapis));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.plankBronze), new ItemStack(FTContent.logBronze));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.plankCoal), new ItemStack(FTContent.logCoal));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.plankGlowstone), new ItemStack(FTContent.logGlowstone));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.plankAdamantium), new ItemStack(FTContent.logAdamantium));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.plankSilk), new ItemStack(FTContent.logSilk));
        RecipeHelper.addShapelessRecipe(new ItemStack(FTContent.plankRedstone), new ItemStack(FTContent.logRedstone));

        RecipeHelper.addRecipe(new ItemStack(FTContent.obsidianWorkbench), RecipeList.obsidianWorkbench);
        RecipeHelper.addRecipe(new ItemStack(FTContent.emeraldWorkbench), RecipeList.emeraldWorkbench);
        RecipeHelper.addRecipe(new ItemStack(FTContent.lapisWorkbench), RecipeList.lapisWorkbench);
        RecipeHelper.addRecipe(new ItemStack(FTContent.bronzeWorkbench), RecipeList.bronzeWorkbench);
        RecipeHelper.addRecipe(new ItemStack(FTContent.coalWorkbench), RecipeList.coalWorkbench);
        RecipeHelper.addRecipe(new ItemStack(FTContent.glowstoneWorkbench), RecipeList.glowstoneWorkbench);
        RecipeHelper.addRecipe(new ItemStack(FTContent.adamantiumWorkbench), RecipeList.adamantiumWorkbench);
        RecipeHelper.addRecipe(new ItemStack(FTContent.silkWorkbench), RecipeList.silkWorkbench);
        RecipeHelper.addRecipe(new ItemStack(FTContent.redstoneWorkbench), RecipeList.redstoneWorkbench);
    }
}
