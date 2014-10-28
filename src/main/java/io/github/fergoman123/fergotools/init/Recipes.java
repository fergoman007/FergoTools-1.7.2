package io.github.fergoman123.fergotools.init;

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
import io.github.fergoman123.fergotools.init.FergoItems.*;
import io.github.fergoman123.fergotools.init.FergoBlocks.*;
import static net.minecraft.init.Items.*;
import static net.minecraft.init.Blocks.*;
import static net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE;

public class Recipes
{
    public static void init()
    {
        RecipeHelper.addShapelessRecipe(new ItemStack(ItemObsidianIngot.instance, 9), new ItemStack(BlockObsidianStorage.instance));
        RecipeHelper.addShapelessRecipe(new ItemStack(ItemEmeraldGem.instance, 9), new ItemStack(BlockEmeraldCrystal.instance));
        RecipeHelper.addShapelessRecipe(new ItemStack(ItemLapisGem.instance, 9), new ItemStack(BlockLapisCrystal.instance));
        RecipeHelper.addShapelessRecipe(new ItemStack(ItemBronzeIngot.instance, 9), new ItemStack(BlockBronze.instance));
        RecipeHelper.addShapelessRecipe(new ItemStack(ItemAdamantiumIngot.instance, 9), new ItemStack(BlockAdamantium.instance));
        RecipeHelper.addShapelessRecipe(new ItemStack(ItemCoalIngot.instance, 9), new ItemStack(BlockCoalStorage.instance));
        RecipeHelper.addShapelessRecipe(new ItemStack(ItemGlowstoneIngot.instance, 9), new ItemStack(BlockGlowstoneStorage.instance));
        RecipeHelper.addShapelessRecipe(new ItemStack(ItemExpShard.instance, 9), new ItemStack(BlockExperience.instance));
        RecipeHelper.addShapelessRecipe(new ItemStack(ItemSilkGem.instance, 9), new ItemStack(BlockSilkGem.instance));
        RecipeHelper.addShapelessRecipe(new ItemStack(ItemExpCollector.instance, 9), new ItemStack(BlockExpCollector.instance));

        RecipeHelper.addRecipe(new ItemStack(ItemSilkGem.instance), new Object[]{" x ", "xyx", " x ", 'x', diamond, 'y', new ItemStack(wool, 1, WILDCARD_VALUE)});
        RecipeHelper.addRecipe(new ItemStack(ItemExpCollector.instance, 32), new Object[]{"xxx", "xyx", "xxx", 'x', ItemExpShard.instance, 'y', diamond});

        RecipeHelper.addRecipe(new ItemStack(BlockObsidianStorage.instance), RecipeList.blockObsidian);
        RecipeHelper.addRecipe(new ItemStack(BlockEmeraldCrystal.instance),  RecipeList.blockEmeraldCrystal);
        RecipeHelper.addRecipe(new ItemStack(BlockLapisCrystal.instance), RecipeList.blockLapisCrystal);
        RecipeHelper.addRecipe(new ItemStack(BlockBronze.instance), RecipeList.blockBronze);
        RecipeHelper.addRecipe(new ItemStack(BlockCoalStorage.instance), RecipeList.blockCoal);
        RecipeHelper.addRecipe(new ItemStack(BlockGlowstoneStorage.instance), RecipeList.blockGlowstone);
        RecipeHelper.addRecipe(new ItemStack(BlockAdamantium.instance), RecipeList.blockAdamantium);
        RecipeHelper.addRecipe(new ItemStack(BlockExperience.instance), RecipeList.blockExperience);
        RecipeHelper.addRecipe(new ItemStack(BlockSilkGem.instance), RecipeList.blockSilkGem);
        RecipeHelper.addRecipe(new ItemStack(BlockRedstoneCrystal.instance), RecipeList.blockRedstone);

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

        RecipeHelper.addBlockSmelting(BlockOreObsidian.instance, FTStacks.obsidianIngot, 2.5f);
        RecipeHelper.addBlockSmelting(BlockOreEmeraldCrystal.instance, FTStacks.emeraldCrystal, 2.5f);
        RecipeHelper.addBlockSmelting(BlockOreLapisCrystal.instance, FTStacks.lapisCrystal, 2.5f);
        RecipeHelper.addBlockSmelting(BlockOreBronze.instance, FTStacks.bronzeIngot, 2.5f);
        RecipeHelper.addBlockSmelting(Blocks.coal_block, FTStacks.coalIngot, 2.5f);
        RecipeHelper.addBlockSmelting(Blocks.glowstone, FTStacks.glowstoneIngot, 2.5f);
        RecipeHelper.addBlockSmelting(BlockOreAdamantium.instance, FTStacks.adamantiumIngot, 2.5f);
        RecipeHelper.addBlockSmelting(BlockOreExperience.instance, FTStacks.expShard5, 2.5f);
        RecipeHelper.addBlockSmelting(BlockOreRedCrystal.instance, FTStacks.redCrystal, 2.5f);



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

        RecipeHelper.addShapelessRecipe(FTStacks.planks[0], FTStacks.logs[0]);
        RecipeHelper.addShapelessRecipe(FTStacks.planks[0], FTStacks.logs[1]);
        RecipeHelper.addShapelessRecipe(FTStacks.planks[0], FTStacks.logs[2]);
        RecipeHelper.addShapelessRecipe(FTStacks.planks[0], FTStacks.logs[3]);
        RecipeHelper.addShapelessRecipe(FTStacks.planks[0], FTStacks.logs[4]);
        RecipeHelper.addShapelessRecipe(FTStacks.planks[0], FTStacks.logs[5]);
        RecipeHelper.addShapelessRecipe(FTStacks.planks[0], FTStacks.logs[6]);
        RecipeHelper.addShapelessRecipe(FTStacks.planks[0], FTStacks.logs[7]);
        RecipeHelper.addShapelessRecipe(FTStacks.planks[0], FTStacks.logs[8]);

        RecipeHelper.addRecipe(new ItemStack(BlockObsidianWorkbench.instance), RecipeList.obsidianWorkbench);
        RecipeHelper.addRecipe(new ItemStack(BlockEmeraldWorkbench.instance), RecipeList.emeraldWorkbench);
        RecipeHelper.addRecipe(new ItemStack(BlockLapisWorkbench.instance), RecipeList.lapisWorkbench);
        RecipeHelper.addRecipe(new ItemStack(BlockBronzeWorkbench.instance), RecipeList.bronzeWorkbench);
        RecipeHelper.addRecipe(new ItemStack(BlockCoalWorkbench.instance), RecipeList.coalWorkbench);
        RecipeHelper.addRecipe(new ItemStack(BlockGlowstoneWorkbench.instance), RecipeList.glowstoneWorkbench);
        RecipeHelper.addRecipe(new ItemStack(BlockAdamantiumWorkbench.instance), RecipeList.adamantiumWorkbench);
        RecipeHelper.addRecipe(new ItemStack(BlockSilkWorkbench.instance), RecipeList.silkWorkbench);
        RecipeHelper.addRecipe(new ItemStack(BlockRedstoneWorkbench.instance), RecipeList.redstoneWorkbench);
    }
}
