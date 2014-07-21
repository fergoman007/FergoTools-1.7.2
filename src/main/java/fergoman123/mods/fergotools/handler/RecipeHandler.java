package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.block.ore.*;
import fergoman123.mods.fergotools.util.item.FTStacks;
import fergoman123.mods.fergotools.util.item.UtilRecipeList;
import fergoman123.mods.fergoutil.helper.RecipeHelper;
import net.minecraft.init.Blocks;

public class RecipeHandler {

    public static void init()
    {
        initRecipes();
    }

    public static final float xp = 2.5f;
	
	public static void initRecipes()
	{
		RecipeHelper.addShapelessRecipe(FTStacks.obsidianIngot9, FTStacks.blockObsidian);
        RecipeHelper.addShapelessRecipe(FTStacks.emeraldCrystal9, FTStacks.blockEmeraldCrystal);
        RecipeHelper.addShapelessRecipe(FTStacks.lapisCrystal9, FTStacks.blockLapisCrystal);
        RecipeHelper.addShapelessRecipe(FTStacks.bronzeIngot9, FTStacks.blockBronze);
        RecipeHelper.addShapelessRecipe(FTStacks.adamantiumIngot9, FTStacks.blockAdamantium);
        RecipeHelper.addShapelessRecipe(FTStacks.coalIngot9, FTStacks.blockCoal);
        RecipeHelper.addShapelessRecipe(FTStacks.glowstoneIngot9, FTStacks.blockGlowstone);
        RecipeHelper.addShapelessRecipe(FTStacks.expShard9, FTStacks.blockExperience);
        RecipeHelper.addShapelessRecipe(FTStacks.silkGem9, FTStacks.blockSilkGem);
        RecipeHelper.addShapelessRecipe(FTStacks.redstoneCrystal9, FTStacks.blockRedstone);

        
        RecipeHelper.addShapedRecipe(FTStacks.blockObsidian, UtilRecipeList.blockObsidian);
        RecipeHelper.addShapedRecipe(FTStacks.blockEmeraldCrystal, UtilRecipeList.blockEmeraldCrystal);
        RecipeHelper.addShapedRecipe(FTStacks.blockLapisCrystal, UtilRecipeList.blockLapisCrystal);
        RecipeHelper.addShapedRecipe(FTStacks.blockBronze, UtilRecipeList.blockBronze);
        RecipeHelper.addShapedRecipe(FTStacks.blockCoal, UtilRecipeList.blockCoal);
        RecipeHelper.addShapedRecipe(FTStacks.blockGlowstone, UtilRecipeList.blockGlowstone);
        RecipeHelper.addShapedRecipe(FTStacks.blockAdamantium, UtilRecipeList.blockAdamantium);
        RecipeHelper.addShapedRecipe(FTStacks.blockExperience, UtilRecipeList.blockExperience);
        RecipeHelper.addShapedRecipe(FTStacks.blockSilkGem, UtilRecipeList.blockSilkGem);
        RecipeHelper.addShapedRecipe(FTStacks.blockRedstone, UtilRecipeList.blockRedstone);
        
        RecipeHelper.addShapedRecipe(FTStacks.blockExperience, UtilRecipeList.blockExperience);

        RecipeHelper.addShapedRecipe(FTStacks.expCollectorHalfStack, UtilRecipeList.expCollector);
       
        RecipeHelper.addShapedRecipe(FTStacks.quartzPickaxe, UtilRecipeList.quartzPickaxe);
        RecipeHelper.addShapedRecipe(FTStacks.quartzShovel, UtilRecipeList.quartzShovel);
        RecipeHelper.addShapedRecipe(FTStacks.quartzAxe, UtilRecipeList.quartzAxe);
        RecipeHelper.addShapedRecipe(FTStacks.quartzHoe, UtilRecipeList.quartzHoe);
        RecipeHelper.addShapedRecipe(FTStacks.quartzSword, UtilRecipeList.quartzSword);

        RecipeHelper.addShapedRecipe(FTStacks.obsidianPickaxe, UtilRecipeList.obsidianPickaxe);
        RecipeHelper.addShapedRecipe(FTStacks.obsidianShovel, UtilRecipeList.obsidianShovel);
        RecipeHelper.addShapedRecipe(FTStacks.obsidianAxe, UtilRecipeList.obsidianAxe);
        RecipeHelper.addShapedRecipe(FTStacks.obsidianHoe, UtilRecipeList.obsidianHoe);
        RecipeHelper.addShapedRecipe(FTStacks.obsidianSword, UtilRecipeList.obsidianSword);

        RecipeHelper.addShapedRecipe(FTStacks.emeraldPickaxe, UtilRecipeList.emeraldPickaxe);
        RecipeHelper.addShapedRecipe(FTStacks.emeraldShovel, UtilRecipeList.emeraldShovel);
        RecipeHelper.addShapedRecipe(FTStacks.emeraldAxe, UtilRecipeList.emeraldAxe);
        RecipeHelper.addShapedRecipe(FTStacks.emeraldHoe, UtilRecipeList.emeraldHoe);
        RecipeHelper.addShapedRecipe(FTStacks.emeraldSword, UtilRecipeList.emeraldSword);

        RecipeHelper.addShapedRecipe(FTStacks.lapisPickaxe, UtilRecipeList.lapisPickaxe);
        RecipeHelper.addShapedRecipe(FTStacks.lapisShovel, UtilRecipeList.lapisShovel);
        RecipeHelper.addShapedRecipe(FTStacks.lapisAxe, UtilRecipeList.lapisAxe);
        RecipeHelper.addShapedRecipe(FTStacks.lapisHoe, UtilRecipeList.lapisHoe);
        RecipeHelper.addShapedRecipe(FTStacks.lapisSword, UtilRecipeList.lapisSword);

        RecipeHelper.addShapedRecipe(FTStacks.bronzePickaxe, UtilRecipeList.bronzePickaxe);
        RecipeHelper.addShapedRecipe(FTStacks.bronzeShovel, UtilRecipeList.bronzeShovel);
        RecipeHelper.addShapedRecipe(FTStacks.bronzeAxe, UtilRecipeList.bronzeAxe);
        RecipeHelper.addShapedRecipe(FTStacks.bronzeHoe, UtilRecipeList.bronzeHoe);
        RecipeHelper.addShapedRecipe(FTStacks.bronzeSword, UtilRecipeList.bronzeSword);

        RecipeHelper.addShapedRecipe(FTStacks.coalPickaxe, UtilRecipeList.coalPickaxe);
        RecipeHelper.addShapedRecipe(FTStacks.coalShovel, UtilRecipeList.coalShovel);
        RecipeHelper.addShapedRecipe(FTStacks.coalAxe, UtilRecipeList.coalAxe);
        RecipeHelper.addShapedRecipe(FTStacks.coalHoe, UtilRecipeList.coalHoe);
        RecipeHelper.addShapedRecipe(FTStacks.coalSword, UtilRecipeList.coalSword);

        RecipeHelper.addShapedRecipe(FTStacks.adamantiumPickaxe, UtilRecipeList.adamantiumPickaxe);
        RecipeHelper.addShapedRecipe(FTStacks.adamantiumShovel, UtilRecipeList.adamantiumShovel);
        RecipeHelper.addShapedRecipe(FTStacks.adamantiumAxe, UtilRecipeList.adamantiumAxe);
        RecipeHelper.addShapedRecipe(FTStacks.adamantiumHoe, UtilRecipeList.adamantiumHoe);
        RecipeHelper.addShapedRecipe(FTStacks.adamantiumSword, UtilRecipeList.adamantiumSword);

        RecipeHelper.addShapedRecipe(FTStacks.glowstonePickaxe, UtilRecipeList.glowstonePickaxe);
        RecipeHelper.addShapedRecipe(FTStacks.glowstoneShovel, UtilRecipeList.glowstoneShovel);
        RecipeHelper.addShapedRecipe(FTStacks.glowstoneAxe, UtilRecipeList.glowstoneAxe);
        RecipeHelper.addShapedRecipe(FTStacks.glowstoneHoe, UtilRecipeList.glowstoneHoe);
        RecipeHelper.addShapedRecipe(FTStacks.glowstoneSword, UtilRecipeList.glowstoneSword);

        RecipeHelper.addShapedRecipe(FTStacks.silkPickaxe, UtilRecipeList.silkPickaxe);
        RecipeHelper.addShapedRecipe(FTStacks.silkShovel, UtilRecipeList.silkShovel);
        RecipeHelper.addShapedRecipe(FTStacks.silkAxe, UtilRecipeList.silkAxe);
        RecipeHelper.addShapedRecipe(FTStacks.silkHoe, UtilRecipeList.silkHoe);
        RecipeHelper.addShapedRecipe(FTStacks.silkSword, UtilRecipeList.silkSword);

        RecipeHelper.addShapedRecipe(FTStacks.quartzFurnaceIdle, UtilRecipeList.quartzFurnace);
        RecipeHelper.addShapedRecipe(FTStacks.obsidianFurnaceIdle, UtilRecipeList.obsidianFurnace);
        RecipeHelper.addShapedRecipe(FTStacks.emeraldCrystalFurnaceIdle, UtilRecipeList.emeraldCrystalFurnace);
        RecipeHelper.addShapedRecipe(FTStacks.lapisCrystalFurnaceIdle, UtilRecipeList.lapisCrystalFurnace);
        RecipeHelper.addShapedRecipe(FTStacks.bronzeFurnaceIdle, UtilRecipeList.bronzeFurnace);
        RecipeHelper.addShapedRecipe(FTStacks.adamantiumFurnaceIdle, UtilRecipeList.adamantiumFurnace);
        RecipeHelper.addShapedRecipe(FTStacks.coalFurnaceIdle, UtilRecipeList.coalFurnace);
        RecipeHelper.addShapedRecipe(FTStacks.glowstoneFurnaceIdle, UtilRecipeList.glowstoneFurnace);
        RecipeHelper.addShapedRecipe(FTStacks.adamantiumFurnaceIdle, UtilRecipeList.adamantiumFurnace);
        RecipeHelper.addShapedRecipe(FTStacks.silkFurnaceIdle, UtilRecipeList.silkFurnace);
        RecipeHelper.addShapedRecipe(FTStacks.redstoneFurnaceIdle, UtilRecipeList.redstoneFurnace);

        RecipeHelper.addBlockSmelting(BlockOreObsidian.instance, FTStacks.obsidianIngot, xp);
        RecipeHelper.addBlockSmelting(BlockOreEmeraldCrystal.instance, FTStacks.emeraldCrystal, xp);
        RecipeHelper.addBlockSmelting(BlockOreLapisCrystal.instance, FTStacks.lapisCrystal, xp);
        RecipeHelper.addBlockSmelting(BlockOreBronze.instance, FTStacks.bronzeIngot, xp);
        RecipeHelper.addBlockSmelting(Blocks.coal_block, FTStacks.coalIngot, xp);
        RecipeHelper.addBlockSmelting(Blocks.glowstone, FTStacks.glowstoneIngot, xp);
        RecipeHelper.addBlockSmelting(BlockOreAdamantium.instance, FTStacks.adamantiumIngot, xp);
        RecipeHelper.addBlockSmelting(BlockOreExperience.instance, FTStacks.expShard5, xp);

        RecipeHelper.addBlockSmelting(BlockOreRedstoneCrystal.instance, FTStacks.redstoneCrystal, xp);
		
		RecipeHelper.addShapedRecipe(FTStacks.quartzHelmet, UtilRecipeList.quartzHelmet);
		RecipeHelper.addShapedRecipe(FTStacks.quartzChestplate, UtilRecipeList.quartzChestplate);
		RecipeHelper.addShapedRecipe(FTStacks.quartzLeggings, UtilRecipeList.quartzLeggings);
		RecipeHelper.addShapedRecipe(FTStacks.quartzBoots, UtilRecipeList.quartzBoots);
		
		RecipeHelper.addShapedRecipe(FTStacks.obsidianHelmet, UtilRecipeList.obsidianHelmet);
		RecipeHelper.addShapedRecipe(FTStacks.obsidianChestplate, UtilRecipeList.obsidianChestplate);
		RecipeHelper.addShapedRecipe(FTStacks.obsidianLeggings, UtilRecipeList.obsidianLeggings);
		RecipeHelper.addShapedRecipe(FTStacks.obsidianBoots, UtilRecipeList.obsidianBoots);
		
		RecipeHelper.addShapedRecipe(FTStacks.emeraldHelmet, UtilRecipeList.emeraldHelmet);
		RecipeHelper.addShapedRecipe(FTStacks.emeraldChestplate, UtilRecipeList.emeraldChestplate);
		RecipeHelper.addShapedRecipe(FTStacks.emeraldLeggings, UtilRecipeList.emeraldLeggings);
		RecipeHelper.addShapedRecipe(FTStacks.emeraldBoots, UtilRecipeList.emeraldBoots);

		RecipeHelper.addShapedRecipe(FTStacks.lapisHelmet, UtilRecipeList.lapisHelmet);
		RecipeHelper.addShapedRecipe(FTStacks.lapisChestplate, UtilRecipeList.lapisChestplate);
		RecipeHelper.addShapedRecipe(FTStacks.lapisLeggings, UtilRecipeList.lapisLeggings);
		RecipeHelper.addShapedRecipe(FTStacks.lapisBoots, UtilRecipeList.lapisBoots);


		RecipeHelper.addShapedRecipe(FTStacks.bronzeHelmet, UtilRecipeList.bronzeHelmet);
		RecipeHelper.addShapedRecipe(FTStacks.bronzeChestplate, UtilRecipeList.bronzeChestplate);
		RecipeHelper.addShapedRecipe(FTStacks.bronzeLeggings, UtilRecipeList.bronzeLeggings);
		RecipeHelper.addShapedRecipe(FTStacks.bronzeBoots, UtilRecipeList.bronzeBoots);

		RecipeHelper.addShapedRecipe(FTStacks.coalHelmet, UtilRecipeList.coalHelmet);
		RecipeHelper.addShapedRecipe(FTStacks.coalChestplate, UtilRecipeList.coalChestplate);
		RecipeHelper.addShapedRecipe(FTStacks.coalLeggings, UtilRecipeList.coalLeggings);
		RecipeHelper.addShapedRecipe(FTStacks.coalBoots, UtilRecipeList.coalBoots);

		RecipeHelper.addShapedRecipe(FTStacks.glowstoneHelmet, UtilRecipeList.glowstoneHelmet);
		RecipeHelper.addShapedRecipe(FTStacks.glowstoneChestplate, UtilRecipeList.glowstoneChestplate);
		RecipeHelper.addShapedRecipe(FTStacks.glowstoneLeggings, UtilRecipeList.glowstoneLeggings);
		RecipeHelper.addShapedRecipe(FTStacks.glowstoneBoots, UtilRecipeList.glowstoneBoots);

        RecipeHelper.addShapedRecipe(FTStacks.redstoneHelmet, UtilRecipeList.redstoneHelmet);
        RecipeHelper.addShapedRecipe(FTStacks.redstoneChestplate, UtilRecipeList.redstoneChestplate);
        RecipeHelper.addShapedRecipe(FTStacks.redstoneLeggings, UtilRecipeList.redstoneLeggings);
        RecipeHelper.addShapedRecipe(FTStacks.redstoneBoots, UtilRecipeList.redstoneBoots);

		RecipeHelper.addShapedRecipe(FTStacks.quartzBow, UtilRecipeList.quartzBow);
		RecipeHelper.addShapedRecipe(FTStacks.obsidianBow, UtilRecipeList.obsidianBow);
		RecipeHelper.addShapedRecipe(FTStacks.emeraldBow, UtilRecipeList.emeraldBow);
		RecipeHelper.addShapedRecipe(FTStacks.lapisBow, UtilRecipeList.lapisBow);
		RecipeHelper.addShapedRecipe(FTStacks.bronzeBow, UtilRecipeList.bronzeBow);
		RecipeHelper.addShapedRecipe(FTStacks.coalBow, UtilRecipeList.coalBow);
		RecipeHelper.addShapedRecipe(FTStacks.glowstoneBow, UtilRecipeList.glowstoneBow);
		RecipeHelper.addShapedRecipe(FTStacks.adamantiumBow, UtilRecipeList.adamantiumBow);
	}
}
