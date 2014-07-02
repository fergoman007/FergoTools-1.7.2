package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.block.ore.*;
import fergoman123.mods.fergotools.block.storage.BlockExperience;
import fergoman123.mods.fergotools.util.item.UtilItemStack;
import fergoman123.mods.fergotools.util.item.UtilRecipeList;
import fergoman123.mods.fergoutil.helper.RecipeHelper;
import net.minecraft.init.Blocks;

public class Recipes
{
    public static void init()
    {
        RecipeHelper.addShapelessRecipe(UtilItemStack.obsidianIngot9, UtilItemStack.blockObsidian);
        RecipeHelper.addShapelessRecipe(UtilItemStack.emeraldCrystal9, UtilItemStack.blockEmeraldCrystal);
        RecipeHelper.addShapelessRecipe(UtilItemStack.lapisCrystal9, UtilItemStack.blockLapisCrystal);
        RecipeHelper.addShapelessRecipe(UtilItemStack.bronzeIngot9, UtilItemStack.blockBronze);
        RecipeHelper.addShapelessRecipe(UtilItemStack.adamantiumIngot9, UtilItemStack.blockAdamantium);
        RecipeHelper.addShapelessRecipe(UtilItemStack.coalIngot9, UtilItemStack.blockCoal);
        RecipeHelper.addShapelessRecipe(UtilItemStack.glowstoneIngot9, UtilItemStack.blockGlowstone);
        RecipeHelper.addShapelessRecipe(UtilItemStack.expBottle9, UtilItemStack.blockExperience);
        RecipeHelper.addShapelessRecipe(UtilItemStack.silkGem9, UtilItemStack.blockSilkGem);

        RecipeHelper.addShapelessRecipe(UtilItemStack.expShard9, UtilItemStack.expBottle);


        RecipeHelper.addShapedRecipe(UtilItemStack.blockObsidian, UtilRecipeList.blockObsidian);
        RecipeHelper.addShapedRecipe(UtilItemStack.blockEmeraldCrystal, UtilRecipeList.blockEmeraldCrystal);
        RecipeHelper.addShapedRecipe(UtilItemStack.blockLapisCrystal, UtilRecipeList.blockLapisCrystal);
        RecipeHelper.addShapedRecipe(UtilItemStack.blockBronze, UtilRecipeList.blockBronze);
        RecipeHelper.addShapedRecipe(UtilItemStack.blockCoal, UtilRecipeList.blockCoal);
        RecipeHelper.addShapedRecipe(UtilItemStack.blockGlowstone, UtilRecipeList.blockGlowstone);
        RecipeHelper.addShapedRecipe(UtilItemStack.blockAdamantium, UtilRecipeList.blockAdamantium);
        RecipeHelper.addShapedRecipe(UtilItemStack.blockExperience, UtilRecipeList.blockExperience);
        RecipeHelper.addShapedRecipe(UtilItemStack.blockSilkGem, UtilRecipeList.blockSilkGem);
        RecipeHelper.addShapedRecipe(UtilItemStack.blockRedstone, UtilRecipeList.blockRedstone);

        RecipeHelper.addShapedRecipe(UtilItemStack.expBottle, UtilRecipeList.expBottle);

        RecipeHelper.addShapedRecipe(UtilItemStack.quartzPickaxe, UtilRecipeList.quartzPickaxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.quartzShovel, UtilRecipeList.quartzShovel);
        RecipeHelper.addShapedRecipe(UtilItemStack.quartzAxe, UtilRecipeList.quartzAxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.quartzHoe, UtilRecipeList.quartzHoe);
        RecipeHelper.addShapedRecipe(UtilItemStack.quartzSword, UtilRecipeList.quartzSword);

        RecipeHelper.addShapedRecipe(UtilItemStack.obsidianPickaxe, UtilRecipeList.obsidianPickaxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.obsidianShovel, UtilRecipeList.obsidianShovel);
        RecipeHelper.addShapedRecipe(UtilItemStack.obsidianAxe, UtilRecipeList.obsidianAxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.obsidianHoe, UtilRecipeList.obsidianHoe);
        RecipeHelper.addShapedRecipe(UtilItemStack.obsidianSword, UtilRecipeList.obsidianSword);

        RecipeHelper.addShapedRecipe(UtilItemStack.emeraldPickaxe, UtilRecipeList.emeraldPickaxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.emeraldShovel, UtilRecipeList.emeraldShovel);
        RecipeHelper.addShapedRecipe(UtilItemStack.emeraldAxe, UtilRecipeList.emeraldAxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.emeraldHoe, UtilRecipeList.emeraldHoe);
        RecipeHelper.addShapedRecipe(UtilItemStack.emeraldSword, UtilRecipeList.emeraldSword);

        RecipeHelper.addShapedRecipe(UtilItemStack.lapisPickaxe, UtilRecipeList.lapisPickaxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.lapisShovel, UtilRecipeList.lapisShovel);
        RecipeHelper.addShapedRecipe(UtilItemStack.lapisAxe, UtilRecipeList.lapisAxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.lapisHoe, UtilRecipeList.lapisHoe);
        RecipeHelper.addShapedRecipe(UtilItemStack.lapisSword, UtilRecipeList.lapisSword);

        RecipeHelper.addShapedRecipe(UtilItemStack.bronzePickaxe, UtilRecipeList.bronzePickaxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.bronzeShovel, UtilRecipeList.bronzeShovel);
        RecipeHelper.addShapedRecipe(UtilItemStack.bronzeAxe, UtilRecipeList.bronzeAxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.bronzeHoe, UtilRecipeList.bronzeHoe);
        RecipeHelper.addShapedRecipe(UtilItemStack.bronzeSword, UtilRecipeList.bronzeSword);

        RecipeHelper.addShapedRecipe(UtilItemStack.coalPickaxe, UtilRecipeList.coalPickaxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.coalShovel, UtilRecipeList.coalShovel);
        RecipeHelper.addShapedRecipe(UtilItemStack.coalAxe, UtilRecipeList.coalAxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.coalHoe, UtilRecipeList.coalHoe);
        RecipeHelper.addShapedRecipe(UtilItemStack.coalSword, UtilRecipeList.coalSword);

        RecipeHelper.addShapedRecipe(UtilItemStack.adamantiumPickaxe, UtilRecipeList.adamantiumPickaxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.adamantiumShovel, UtilRecipeList.adamantiumShovel);
        RecipeHelper.addShapedRecipe(UtilItemStack.adamantiumAxe, UtilRecipeList.adamantiumAxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.adamantiumHoe, UtilRecipeList.adamantiumHoe);
        RecipeHelper.addShapedRecipe(UtilItemStack.adamantiumSword, UtilRecipeList.adamantiumSword);

        RecipeHelper.addShapedRecipe(UtilItemStack.glowstonePickaxe, UtilRecipeList.glowstonePickaxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.glowstoneShovel, UtilRecipeList.glowstoneShovel);
        RecipeHelper.addShapedRecipe(UtilItemStack.glowstoneAxe, UtilRecipeList.glowstoneAxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.glowstoneHoe, UtilRecipeList.glowstoneHoe);
        RecipeHelper.addShapedRecipe(UtilItemStack.glowstoneSword, UtilRecipeList.glowstoneSword);

        RecipeHelper.addShapedRecipe(UtilItemStack.silkPickaxe, UtilRecipeList.silkPickaxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.silkShovel, UtilRecipeList.silkShovel);
        RecipeHelper.addShapedRecipe(UtilItemStack.silkAxe, UtilRecipeList.silkAxe);
        RecipeHelper.addShapedRecipe(UtilItemStack.silkHoe, UtilRecipeList.silkHoe);
        RecipeHelper.addShapedRecipe(UtilItemStack.silkSword, UtilRecipeList.silkSword);

        RecipeHelper.addShapedRecipe(UtilItemStack.quartzFurnace, UtilRecipeList.quartzFurnace);
        RecipeHelper.addShapedRecipe(UtilItemStack.obsidianFurnace, UtilRecipeList.obsidianFurnace);
        RecipeHelper.addShapedRecipe(UtilItemStack.emeraldCrystalFurnace, UtilRecipeList.emeraldCrystalFurnace);
        RecipeHelper.addShapedRecipe(UtilItemStack.lapisCrystalFurnace, UtilRecipeList.lapisCrystalFurnace);
        RecipeHelper.addShapedRecipe(UtilItemStack.bronzeFurnace, UtilRecipeList.bronzeFurnace);
        RecipeHelper.addShapedRecipe(UtilItemStack.adamantiumFurnace, UtilRecipeList.adamantiumFurnace);
        RecipeHelper.addShapedRecipe(UtilItemStack.coalFurnace, UtilRecipeList.coalFurnace);
        RecipeHelper.addShapedRecipe(UtilItemStack.glowstoneFurnace, UtilRecipeList.glowstoneFurnace);
        RecipeHelper.addShapedRecipe(UtilItemStack.adamantiumFurnace, UtilRecipeList.adamantiumFurnace);
        RecipeHelper.addShapedRecipe(UtilItemStack.silkFurnace, UtilRecipeList.silkFurnace);
        RecipeHelper.addShapedRecipe(UtilItemStack.redstoneFurnace, UtilRecipeList.redstoneFurnace);
        RecipeHelper.addShapedRecipe(UtilItemStack.macerator, UtilRecipeList.macerator);

        RecipeHelper.addBlockSmelting(BlockOreObsidian.instance, UtilItemStack.obsidianIngot, 2.5f);
        RecipeHelper.addBlockSmelting(BlockOreEmeraldCrystal.instance, UtilItemStack.emeraldCrystal, 2.5f);
        RecipeHelper.addBlockSmelting(BlockOreLapisCrystal.instance, UtilItemStack.lapisCrystal, 2.5f);
        RecipeHelper.addBlockSmelting(BlockOreBronze.instance, UtilItemStack.bronzeIngot, 2.5f);
        RecipeHelper.addBlockSmelting(Blocks.coal_block, UtilItemStack.coalIngot, 2.5f);
        RecipeHelper.addBlockSmelting(Blocks.glowstone, UtilItemStack.glowstoneIngot, 2.5f);
        RecipeHelper.addBlockSmelting(BlockOreAdamantium.instance, UtilItemStack.adamantiumIngot, 2.5f);
        RecipeHelper.addBlockSmelting(BlockExperience.instance, UtilItemStack.expShard5, 2.5f);



        RecipeHelper.addShapedRecipe(UtilItemStack.quartzHelmet, UtilRecipeList.quartzHelmet);
        RecipeHelper.addShapedRecipe(UtilItemStack.quartzChestplate, UtilRecipeList.quartzChestplate);
        RecipeHelper.addShapedRecipe(UtilItemStack.quartzLeggings, UtilRecipeList.quartzLeggings);
        RecipeHelper.addShapedRecipe(UtilItemStack.quartzBoots, UtilRecipeList.quartzBoots);

        RecipeHelper.addShapedRecipe(UtilItemStack.obsidianHelmet, UtilRecipeList.obsidianHelmet);
        RecipeHelper.addShapedRecipe(UtilItemStack.obsidianChestplate, UtilRecipeList.obsidianChestplate);
        RecipeHelper.addShapedRecipe(UtilItemStack.obsidianLeggings, UtilRecipeList.obsidianLeggings);
        RecipeHelper.addShapedRecipe(UtilItemStack.obsidianBoots, UtilRecipeList.obsidianBoots);

        RecipeHelper.addShapedRecipe(UtilItemStack.emeraldHelmet, UtilRecipeList.emeraldHelmet);
        RecipeHelper.addShapedRecipe(UtilItemStack.emeraldChestplate, UtilRecipeList.emeraldChestplate);
        RecipeHelper.addShapedRecipe(UtilItemStack.emeraldLeggings, UtilRecipeList.emeraldLeggings);
        RecipeHelper.addShapedRecipe(UtilItemStack.emeraldBoots, UtilRecipeList.emeraldBoots);

        RecipeHelper.addShapedRecipe(UtilItemStack.lapisHelmet, UtilRecipeList.lapisHelmet);
        RecipeHelper.addShapedRecipe(UtilItemStack.lapisChestplate, UtilRecipeList.lapisChestplate);
        RecipeHelper.addShapedRecipe(UtilItemStack.lapisLeggings, UtilRecipeList.lapisLeggings);
        RecipeHelper.addShapedRecipe(UtilItemStack.lapisBoots, UtilRecipeList.lapisBoots);


        RecipeHelper.addShapedRecipe(UtilItemStack.bronzeHelmet, UtilRecipeList.bronzeHelmet);
        RecipeHelper.addShapedRecipe(UtilItemStack.bronzeChestplate, UtilRecipeList.bronzeChestplate);
        RecipeHelper.addShapedRecipe(UtilItemStack.bronzeLeggings, UtilRecipeList.bronzeLeggings);
        RecipeHelper.addShapedRecipe(UtilItemStack.bronzeBoots, UtilRecipeList.bronzeBoots);

        RecipeHelper.addShapedRecipe(UtilItemStack.coalHelmet, UtilRecipeList.coalHelmet);
        RecipeHelper.addShapedRecipe(UtilItemStack.coalChestplate, UtilRecipeList.coalChestplate);
        RecipeHelper.addShapedRecipe(UtilItemStack.coalLeggings, UtilRecipeList.coalLeggings);
        RecipeHelper.addShapedRecipe(UtilItemStack.coalBoots, UtilRecipeList.coalBoots);

        RecipeHelper.addShapedRecipe(UtilItemStack.glowstoneHelmet, UtilRecipeList.glowstoneHelmet);
        RecipeHelper.addShapedRecipe(UtilItemStack.glowstoneChestplate, UtilRecipeList.glowstoneChestplate);
        RecipeHelper.addShapedRecipe(UtilItemStack.glowstoneLeggings, UtilRecipeList.glowstoneLeggings);
        RecipeHelper.addShapedRecipe(UtilItemStack.glowstoneBoots, UtilRecipeList.glowstoneBoots);

        RecipeHelper.addShapedRecipe(UtilItemStack.redstoneHelmet, UtilRecipeList.redstoneHelmet);
        RecipeHelper.addShapedRecipe(UtilItemStack.redstoneChestplate, UtilRecipeList.redstoneChestplate);
        RecipeHelper.addShapedRecipe(UtilItemStack.redstoneLeggings, UtilRecipeList.redstoneLeggings);
        RecipeHelper.addShapedRecipe(UtilItemStack.redstoneBoots, UtilRecipeList.redstoneBoots);

        RecipeHelper.addShapedRecipe(UtilItemStack.quartzBow, UtilRecipeList.quartzBow);
        RecipeHelper.addShapedRecipe(UtilItemStack.obsidianBow, UtilRecipeList.obsidianBow);
        RecipeHelper.addShapedRecipe(UtilItemStack.emeraldBow, UtilRecipeList.emeraldBow);
        RecipeHelper.addShapedRecipe(UtilItemStack.lapisBow, UtilRecipeList.lapisBow);
        RecipeHelper.addShapedRecipe(UtilItemStack.bronzeBow, UtilRecipeList.bronzeBow);
        RecipeHelper.addShapedRecipe(UtilItemStack.coalBow, UtilRecipeList.coalBow);
        RecipeHelper.addShapedRecipe(UtilItemStack.glowstoneBow, UtilRecipeList.glowstoneBow);
        RecipeHelper.addShapedRecipe(UtilItemStack.adamantiumBow, UtilRecipeList.adamantiumBow);
    }
}
