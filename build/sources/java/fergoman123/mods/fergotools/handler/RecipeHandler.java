package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.recipe.UtilItemStack;
import fergoman123.mods.fergotools.util.recipe.UtilRecipeList;
import fergoman123.mods.fergoutil.helper.RecipeHelper;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class RecipeHandler {

    public static void init()
    {
        initRecipes();
        initSmeltingRecipes();
    }

    public static final float xp = 2.5f;
	
	public static void initRecipes()
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

        
        RecipeHelper.addRecipe(UtilItemStack.blockObsidian, UtilRecipeList.blockObsidian);
        RecipeHelper.addRecipe(UtilItemStack.blockEmeraldCrystal, UtilRecipeList.blockEmeraldCrystal);
        RecipeHelper.addRecipe(UtilItemStack.blockLapisCrystal, UtilRecipeList.blockLapisCrystal);
        RecipeHelper.addRecipe(UtilItemStack.blockBronze, UtilRecipeList.blockBronze);
        RecipeHelper.addRecipe(UtilItemStack.blockCoal, UtilRecipeList.blockCoal);
        RecipeHelper.addRecipe(UtilItemStack.blockGlowstone, UtilRecipeList.blockGlowstone);
        RecipeHelper.addRecipe(UtilItemStack.blockAdamantium, UtilRecipeList.blockAdamantium);
        RecipeHelper.addRecipe(UtilItemStack.blockExperience, UtilRecipeList.blockExperience);
        RecipeHelper.addRecipe(UtilItemStack.blockSilkGem, UtilRecipeList.blockSilkGem);
        RecipeHelper.addRecipe(UtilItemStack.blockRedstone, UtilRecipeList.blockRedstone);
        
        RecipeHelper.addRecipe(UtilItemStack.expBottle, UtilRecipeList.expBottle);
       
        RecipeHelper.addRecipe(UtilItemStack.quartzPickaxe, UtilRecipeList.quartzPickaxe);
        RecipeHelper.addRecipe(UtilItemStack.quartzShovel, UtilRecipeList.quartzShovel);
        RecipeHelper.addRecipe(UtilItemStack.quartzAxe, UtilRecipeList.quartzAxe);
        RecipeHelper.addRecipe(UtilItemStack.quartzHoe, UtilRecipeList.quartzHoe);
        RecipeHelper.addRecipe(UtilItemStack.quartzSword, UtilRecipeList.quartzSword);

        RecipeHelper.addRecipe(UtilItemStack.obsidianPickaxe, UtilRecipeList.obsidianPickaxe);
        RecipeHelper.addRecipe(UtilItemStack.obsidianShovel, UtilRecipeList.obsidianShovel);
        RecipeHelper.addRecipe(UtilItemStack.obsidianAxe, UtilRecipeList.obsidianAxe);
        RecipeHelper.addRecipe(UtilItemStack.obsidianHoe, UtilRecipeList.obsidianHoe);
        RecipeHelper.addRecipe(UtilItemStack.obsidianSword, UtilRecipeList.obsidianSword);

        RecipeHelper.addRecipe(UtilItemStack.emeraldPickaxe, UtilRecipeList.emeraldPickaxe);
        RecipeHelper.addRecipe(UtilItemStack.emeraldShovel, UtilRecipeList.emeraldShovel);
        RecipeHelper.addRecipe(UtilItemStack.emeraldAxe, UtilRecipeList.emeraldAxe);
        RecipeHelper.addRecipe(UtilItemStack.emeraldHoe, UtilRecipeList.emeraldHoe);
        RecipeHelper.addRecipe(UtilItemStack.emeraldSword, UtilRecipeList.emeraldSword);

        RecipeHelper.addRecipe(UtilItemStack.lapisPickaxe, UtilRecipeList.lapisPickaxe);
        RecipeHelper.addRecipe(UtilItemStack.lapisShovel, UtilRecipeList.lapisShovel);
        RecipeHelper.addRecipe(UtilItemStack.lapisAxe, UtilRecipeList.lapisAxe);
        RecipeHelper.addRecipe(UtilItemStack.lapisHoe, UtilRecipeList.lapisHoe);
        RecipeHelper.addRecipe(UtilItemStack.lapisSword, UtilRecipeList.lapisSword);

        RecipeHelper.addRecipe(UtilItemStack.bronzePickaxe, UtilRecipeList.bronzePickaxe);
        RecipeHelper.addRecipe(UtilItemStack.bronzeShovel, UtilRecipeList.bronzeShovel);
        RecipeHelper.addRecipe(UtilItemStack.bronzeAxe, UtilRecipeList.bronzeAxe);
        RecipeHelper.addRecipe(UtilItemStack.bronzeHoe, UtilRecipeList.bronzeHoe);
        RecipeHelper.addRecipe(UtilItemStack.bronzeSword, UtilRecipeList.bronzeSword);

        RecipeHelper.addRecipe(UtilItemStack.coalPickaxe, UtilRecipeList.coalPickaxe);
        RecipeHelper.addRecipe(UtilItemStack.coalShovel, UtilRecipeList.coalShovel);
        RecipeHelper.addRecipe(UtilItemStack.coalAxe, UtilRecipeList.coalAxe);
        RecipeHelper.addRecipe(UtilItemStack.coalHoe, UtilRecipeList.coalHoe);
        RecipeHelper.addRecipe(UtilItemStack.coalSword, UtilRecipeList.coalSword);

        RecipeHelper.addRecipe(UtilItemStack.adamantiumPickaxe, UtilRecipeList.adamantiumPickaxe);
        RecipeHelper.addRecipe(UtilItemStack.adamantiumShovel, UtilRecipeList.adamantiumShovel);
        RecipeHelper.addRecipe(UtilItemStack.adamantiumAxe, UtilRecipeList.adamantiumAxe);
        RecipeHelper.addRecipe(UtilItemStack.adamantiumHoe, UtilRecipeList.adamantiumHoe);
        RecipeHelper.addRecipe(UtilItemStack.adamantiumSword, UtilRecipeList.adamantiumSword);

        RecipeHelper.addRecipe(UtilItemStack.glowstonePickaxe, UtilRecipeList.glowstonePickaxe);
        RecipeHelper.addRecipe(UtilItemStack.glowstoneShovel, UtilRecipeList.glowstoneShovel);
        RecipeHelper.addRecipe(UtilItemStack.glowstoneAxe, UtilRecipeList.glowstoneAxe);
        RecipeHelper.addRecipe(UtilItemStack.glowstoneHoe, UtilRecipeList.glowstoneHoe);
        RecipeHelper.addRecipe(UtilItemStack.glowstoneSword, UtilRecipeList.glowstoneSword);

        RecipeHelper.addRecipe(UtilItemStack.silkPickaxe, UtilRecipeList.silkPickaxe);
        RecipeHelper.addRecipe(UtilItemStack.silkShovel, UtilRecipeList.silkShovel);
        RecipeHelper.addRecipe(UtilItemStack.silkAxe, UtilRecipeList.silkAxe);
        RecipeHelper.addRecipe(UtilItemStack.silkHoe, UtilRecipeList.silkHoe);
        RecipeHelper.addRecipe(UtilItemStack.silkSword, UtilRecipeList.silkSword);

        RecipeHelper.addRecipe(UtilItemStack.quartzFurnace, UtilRecipeList.quartzFurnace);
        RecipeHelper.addRecipe(UtilItemStack.obsidianFurnace, UtilRecipeList.obsidianFurnace);
        RecipeHelper.addRecipe(UtilItemStack.emeraldCrystalFurnace, UtilRecipeList.emeraldCrystalFurnace);
        RecipeHelper.addRecipe(UtilItemStack.lapisCrystalFurnace, UtilRecipeList.lapisCrystalFurnace);
        RecipeHelper.addRecipe(UtilItemStack.bronzeFurnace, UtilRecipeList.bronzeFurnace);
        RecipeHelper.addRecipe(UtilItemStack.adamantiumFurnace, UtilRecipeList.adamantiumFurnace);
        RecipeHelper.addRecipe(UtilItemStack.coalFurnace, UtilRecipeList.coalFurnace);
        RecipeHelper.addRecipe(UtilItemStack.glowstoneFurnace, UtilRecipeList.glowstoneFurnace);
        RecipeHelper.addRecipe(UtilItemStack.adamantiumFurnace, UtilRecipeList.adamantiumFurnace);
        RecipeHelper.addRecipe(UtilItemStack.silkFurnace, UtilRecipeList.silkFurnace);
        RecipeHelper.addRecipe(UtilItemStack.redstoneFurnace, UtilRecipeList.redstoneFurnace);

        RecipeHelper.addBlockSmelting(ModBlocks.oreObsidian, UtilItemStack.obsidianIngot, xp);
        RecipeHelper.addBlockSmelting(ModBlocks.oreEmeraldCrystal, UtilItemStack.emeraldCrystal, xp);
        RecipeHelper.addBlockSmelting(ModBlocks.oreLapisCrystal, UtilItemStack.lapisCrystal, xp);
        RecipeHelper.addBlockSmelting(ModBlocks.oreBronze, UtilItemStack.bronzeIngot, xp);
        RecipeHelper.addBlockSmelting(Blocks.coal_block, UtilItemStack.coalIngot, xp);
        RecipeHelper.addBlockSmelting(Blocks.glowstone, UtilItemStack.glowstoneIngot, xp);
        RecipeHelper.addBlockSmelting(ModBlocks.oreAdamantium, UtilItemStack.adamantiumIngot, xp);
        RecipeHelper.addBlockSmelting(ModBlocks.oreExperience, UtilItemStack.expShard5, xp);


		
		RecipeHelper.addRecipe(UtilItemStack.quartzHelmet, UtilRecipeList.quartzHelmet);
		RecipeHelper.addRecipe(UtilItemStack.quartzChestplate, UtilRecipeList.quartzChestplate);
		RecipeHelper.addRecipe(UtilItemStack.quartzLeggings, UtilRecipeList.quartzLeggings);
		RecipeHelper.addRecipe(UtilItemStack.quartzBoots, UtilRecipeList.quartzBoots);
		
		RecipeHelper.addRecipe(new ItemStack(ModItems.obsidianHelmet), UtilRecipeList.obsidianHelmet);
		RecipeHelper.addRecipe(new ItemStack(ModItems.obsidianChestplate), UtilRecipeList.obsidianChestplate);
		RecipeHelper.addRecipe(new ItemStack(ModItems.obsidianLeggings), UtilRecipeList.obsidianLeggings);
		RecipeHelper.addRecipe(new ItemStack(ModItems.obsidianBoots), UtilRecipeList.obsidianBoots);
		
		RecipeHelper.addRecipe(UtilItemStack.emeraldHelmet, UtilRecipeList.emeraldHelmet);
		RecipeHelper.addRecipe(UtilItemStack.emeraldChestplate, UtilRecipeList.emeraldChestplate);
		RecipeHelper.addRecipe(UtilItemStack.emeraldLeggings, UtilRecipeList.emeraldLeggings);
		RecipeHelper.addRecipe(UtilItemStack.emeraldBoots, UtilRecipeList.emeraldBoots);

		RecipeHelper.addRecipe(UtilItemStack.lapisHelmet, UtilRecipeList.lapisHelmet);
		RecipeHelper.addRecipe(UtilItemStack.lapisChestplate, UtilRecipeList.lapisChestplate);
		RecipeHelper.addRecipe(UtilItemStack.lapisLeggings, UtilRecipeList.lapisLeggings);
		RecipeHelper.addRecipe(UtilItemStack.lapisBoots, UtilRecipeList.lapisBoots);


		RecipeHelper.addRecipe(UtilItemStack.bronzeHelmet, UtilRecipeList.bronzeHelmet);
		RecipeHelper.addRecipe(UtilItemStack.bronzeChestplate, UtilRecipeList.bronzeChestplate);
		RecipeHelper.addRecipe(UtilItemStack.bronzeLeggings, UtilRecipeList.bronzeLeggings);
		RecipeHelper.addRecipe(UtilItemStack.bronzeBoots, UtilRecipeList.bronzeBoots);

		RecipeHelper.addRecipe(UtilItemStack.coalHelmet, UtilRecipeList.coalHelmet);
		RecipeHelper.addRecipe(UtilItemStack.coalChestplate, UtilRecipeList.coalChestplate);
		RecipeHelper.addRecipe(UtilItemStack.coalLeggings, UtilRecipeList.coalLeggings);
		RecipeHelper.addRecipe(UtilItemStack.coalBoots, UtilRecipeList.coalBoots);

		RecipeHelper.addRecipe(UtilItemStack.glowstoneHelmet, UtilRecipeList.glowstoneHelmet);
		RecipeHelper.addRecipe(UtilItemStack.glowstoneChestplate, UtilRecipeList.glowstoneChestplate);
		RecipeHelper.addRecipe(UtilItemStack.glowstoneLeggings, UtilRecipeList.glowstoneLeggings);
		RecipeHelper.addRecipe(UtilItemStack.glowstoneBoots, UtilRecipeList.glowstoneBoots);

        RecipeHelper.addRecipe(UtilItemStack.redstoneHelmet, UtilRecipeList.redstoneHelmet);
        RecipeHelper.addRecipe(UtilItemStack.redstoneChestplate, UtilRecipeList.redstoneChestplate);
        RecipeHelper.addRecipe(UtilItemStack.redstoneLeggings, UtilRecipeList.redstoneLeggings);
        RecipeHelper.addRecipe(UtilItemStack.redstoneBoots, UtilRecipeList.redstoneBoots);

		RecipeHelper.addRecipe(UtilItemStack.quartzBow, UtilRecipeList.quartzBow);
		RecipeHelper.addRecipe(UtilItemStack.obsidianBow, UtilRecipeList.obsidianBow);
		RecipeHelper.addRecipe(UtilItemStack.emeraldBow, UtilRecipeList.emeraldBow);
		RecipeHelper.addRecipe(UtilItemStack.lapisBow, UtilRecipeList.lapisBow);
		RecipeHelper.addRecipe(UtilItemStack.bronzeBow, UtilRecipeList.bronzeBow);
		RecipeHelper.addRecipe(UtilItemStack.coalBow, UtilRecipeList.coalBow);
		RecipeHelper.addRecipe(UtilItemStack.glowstoneBow, UtilRecipeList.glowstoneBow);
		RecipeHelper.addRecipe(UtilItemStack.adamantiumBow, UtilRecipeList.adamantiumBow);
	}

    public static void initSmeltingRecipes()
    {
        RecipeHelper.addBlockSmelting(ModBlocks.oreExperience, UtilItemStack.expShard5, 1.0f);
        RecipeHelper.addBlockSmelting(ModBlocks.oreObsidian, UtilItemStack.obsidianIngot, 1.0f);
        RecipeHelper.addBlockSmelting(ModBlocks.oreEmeraldCrystal, UtilItemStack.emeraldCrystal, 1.0f);
        RecipeHelper.addBlockSmelting(ModBlocks.oreLapisCrystal, UtilItemStack.lapisCrystal, 1.0f);
        RecipeHelper.addBlockSmelting(ModBlocks.oreBronze, UtilItemStack.bronzeIngot, 1.0f);
        RecipeHelper.addBlockSmelting(Blocks.coal_block, UtilItemStack.coalIngot, 1.0f);
        RecipeHelper.addBlockSmelting(Blocks.glowstone, UtilItemStack.glowstoneIngot, 1.0f);
        RecipeHelper.addBlockSmelting(ModBlocks.oreAdamantium, UtilItemStack.adamantiumIngot, 1.0f);
    }
}
