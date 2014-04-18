package fergoman123.mods.fergotools.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.Recipes;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipesHandler {
	
	public static void init()
	{
		addShapelessRecipe(new ItemStack(ModItems.obsidianIngot, 9), new ItemStack(ModBlocks.blockObsidian));
        addShapelessRecipe(new ItemStack(ModItems.emeraldCrystal, 9), new ItemStack(ModBlocks.blockEmeraldCrystal));
        addShapelessRecipe(new ItemStack(ModItems.lapisCrystal, 9), new ItemStack(ModBlocks.blockLapisCrystal));
        addShapelessRecipe(new ItemStack(ModItems.bronzeIngot, 9), new ItemStack(ModBlocks.blockBronze));
        addShapelessRecipe(new ItemStack(ModItems.adamantiumIngot, 9), new ItemStack(ModBlocks.blockAdamantium));
        addShapelessRecipe(new ItemStack(ModItems.coalIngot, 9), new ItemStack(ModBlocks.blockCoal));
        addShapelessRecipe(new ItemStack(ModItems.glowstoneIngot, 9), new ItemStack(ModBlocks.blockGlowstone));
        addShapelessRecipe(new ItemStack(Items.experience_bottle, 9), new ItemStack(ModBlocks.blockExperience));
        addShapelessRecipe(new ItemStack(ModItems.silkGem, 9), new ItemStack(ModBlocks.blockSilkGem));
       
        addShapelessRecipe(new ItemStack(ModItems.expShard, 9), new ItemStack(Items.experience_bottle));

        
        addRecipe(new ItemStack(ModBlocks.blockObsidian), Recipes.blockObsidian);
        addRecipe(new ItemStack(ModBlocks.blockEmeraldCrystal), Recipes.blockEmeraldCrystal);
        addRecipe(new ItemStack(ModBlocks.blockLapisCrystal), Recipes.blockLapisCrystal);
        addRecipe(new ItemStack(ModBlocks.blockBronze), Recipes.blockBronze);
        addRecipe(new ItemStack(ModBlocks.blockAdamantium), Recipes.blockAdamantium);
        addRecipe(new ItemStack(ModBlocks.blockCoal), Recipes.blockCoal);
        addRecipe(new ItemStack(ModBlocks.blockGlowstone), Recipes.blockGlowstone);
        addRecipe(new ItemStack(ModBlocks.blockExperience), Recipes.blockExperience);
        addRecipe(new ItemStack(ModBlocks.blockSilkGem), Recipes.blockSilkGem);
        
        addRecipe(new ItemStack(Items.experience_bottle), Recipes.expBottle);
       
        addRecipe(new ItemStack(ModItems.quartzPickaxe), Recipes.quartzPickaxe);
        addRecipe(new ItemStack(ModItems.quartzShovel), Recipes.quartzShovel);
        addRecipe(new ItemStack(ModItems.quartzAxe), Recipes.quartzAxe);
        addRecipe(new ItemStack(ModItems.quartzHoe), Recipes.quartzHoe);
        addRecipe(new ItemStack(ModItems.quartzSword), Recipes.quartzSword);

        addRecipe(new ItemStack(ModItems.obsidianPickaxe), Recipes.obsidianPickaxe);
        addRecipe(new ItemStack(ModItems.obsidianShovel), Recipes.obsidianShovel);
        addRecipe(new ItemStack(ModItems.obsidianAxe), Recipes.obsidianAxe);
        addRecipe(new ItemStack(ModItems.obsidianHoe), Recipes.obsidianHoe);
        addRecipe(new ItemStack(ModItems.obsidianSword), Recipes.obsidianSword);

        addRecipe(new ItemStack(ModItems.emeraldPickaxe), Recipes.emeraldPickaxe);
        addRecipe(new ItemStack(ModItems.emeraldShovel), Recipes.emeraldShovel);
        addRecipe(new ItemStack(ModItems.emeraldAxe), Recipes.emeraldAxe);
        addRecipe(new ItemStack(ModItems.emeraldHoe), Recipes.emeraldHoe);
        addRecipe(new ItemStack(ModItems.emeraldSword), Recipes.emeraldSword);

        addRecipe(new ItemStack(ModItems.lapisPickaxe), Recipes.lapisPickaxe);
        addRecipe(new ItemStack(ModItems.lapisShovel), Recipes.lapisShovel);
        addRecipe(new ItemStack(ModItems.lapisAxe), Recipes.lapisAxe);
        addRecipe(new ItemStack(ModItems.lapisHoe), Recipes.lapisHoe);
        addRecipe(new ItemStack(ModItems.lapisSword), Recipes.lapisSword);

        addRecipe(new ItemStack(ModItems.bronzePickaxe), Recipes.bronzePickaxe);
        addRecipe(new ItemStack(ModItems.bronzeShovel), Recipes.bronzeShovel);
        addRecipe(new ItemStack(ModItems.bronzeAxe), Recipes.bronzeAxe);
        addRecipe(new ItemStack(ModItems.bronzeHoe), Recipes.bronzeHoe);
        addRecipe(new ItemStack(ModItems.bronzeSword), Recipes.bronzeSword);

        addRecipe(new ItemStack(ModItems.coalPickaxe), Recipes.coalPickaxe);
        addRecipe(new ItemStack(ModItems.coalShovel), Recipes.coalShovel);
        addRecipe(new ItemStack(ModItems.coalAxe), Recipes.coalAxe);
        addRecipe(new ItemStack(ModItems.coalHoe), Recipes.coalHoe);
        addRecipe(new ItemStack(ModItems.coalSword), Recipes.coalSword);

        addRecipe(new ItemStack(ModItems.adamantiumPickaxe), Recipes.adamantiumPickaxe);
        addRecipe(new ItemStack(ModItems.adamantiumShovel), Recipes.adamantiumShovel);
        addRecipe(new ItemStack(ModItems.adamantiumAxe), Recipes.adamantiumAxe);
        addRecipe(new ItemStack(ModItems.adamantiumHoe), Recipes.adamantiumHoe);
        addRecipe(new ItemStack(ModItems.adamantiumSword), Recipes.adamantiumSword);

        addRecipe(new ItemStack(ModItems.glowstonePickaxe), Recipes.glowstonePickaxe);
        addRecipe(new ItemStack(ModItems.glowstoneShovel), Recipes.glowstoneShovel);
        addRecipe(new ItemStack(ModItems.glowstoneAxe), Recipes.glowstoneAxe);
        addRecipe(new ItemStack(ModItems.glowstoneHoe), Recipes.glowstoneHoe);
        addRecipe(new ItemStack(ModItems.glowstoneSword), Recipes.glowstoneSword);

        addRecipe(new ItemStack(ModItems.silkPickaxe), Recipes.silkPickaxe);
        addRecipe(new ItemStack(ModItems.silkShovel), Recipes.silkShovel);
        addRecipe(new ItemStack(ModItems.silkAxe), Recipes.silkAxe);
        addRecipe(new ItemStack(ModItems.silkHoe), Recipes.silkHoe);
        addRecipe(new ItemStack(ModItems.silkSword), Recipes.silkSword);
        
        addRecipe(new ItemStack(ModBlocks.bronzeFurnaceIdle), Recipes.glowstoneFurnace);
        addRecipe(new ItemStack(ModBlocks.obsidianFurnaceIdle), Recipes.obsidianFurnace);
        addRecipe(new ItemStack(ModBlocks.emeraldCrystalFurnaceIdle), Recipes.emeraldCrystalFurnace);
        addRecipe(new ItemStack(ModBlocks.lapisCrystalFurnaceIdle), Recipes.lapisCrystalFurnace);
        addRecipe(new ItemStack(ModBlocks.bronzeFurnaceIdle), Recipes.bronzeFurnace);
        addRecipe(new ItemStack(ModBlocks.adamantiumFurnaceIdle), Recipes.adamantiumFurnace);
        addRecipe(new ItemStack(ModBlocks.coalFurnaceIdle), Recipes.coalFurnace);
        addRecipe(new ItemStack(ModBlocks.glowstoneFurnaceIdle), Recipes.glowstoneFurnace);

        addSmelting(ModBlocks.oreObsidian, new ItemStack(ModItems.obsidianIngot), 2.5f);
        addSmelting(ModBlocks.oreEmeraldCrystal, new ItemStack(ModItems.emeraldCrystal), 2.5f);
        addSmelting(ModBlocks.oreLapisCrystal, new ItemStack(ModItems.lapisCrystal), 2.5f);
        addSmelting(ModBlocks.oreBronze, new ItemStack(ModItems.bronzeIngot), 2.5f);
        addSmelting(Blocks.coal_block, new ItemStack(ModItems.coalIngot), 2.5f);
        addSmelting(Blocks.glowstone, new ItemStack(ModItems.glowstoneIngot), 2.5f);
        addSmelting(ModBlocks.oreAdamantium, new ItemStack(ModItems.adamantiumIngot), 2.5f);
        addSmelting(ModBlocks.oreExperience, new ItemStack(ModItems.expShard, 5), 2.5f);


		
		addRecipe(new ItemStack(ModItems.quartzHelmet), Recipes.quartzHelmet);
		addRecipe(new ItemStack(ModItems.quartzChestplate), Recipes.quartzChestplate);
		addRecipe(new ItemStack(ModItems.quartzLeggings), Recipes.quartzLeggings);
		addRecipe(new ItemStack(ModItems.quartzBoots), Recipes.quartzBoots);
		
		addRecipe(new ItemStack(ModItems.obsidianHelmet), Recipes.obsidianHelmet);
		addRecipe(new ItemStack(ModItems.obsidianChestplate), Recipes.obsidianChestplate);
		addRecipe(new ItemStack(ModItems.obsidianLeggings), Recipes.obsidianLeggings);
		addRecipe(new ItemStack(ModItems.obsidianBoots), Recipes.obsidianBoots);
		
		addRecipe(new ItemStack(ModItems.emeraldHelmet), Recipes.emeraldHelmet);
		addRecipe(new ItemStack(ModItems.emeraldChestplate), Recipes.emeraldChestplate);
		addRecipe(new ItemStack(ModItems.emeraldLeggings), Recipes.emeraldLeggings);
		addRecipe(new ItemStack(ModItems.emeraldBoots), Recipes.emeraldBoots);

		addRecipe(new ItemStack(ModItems.lapisHelmet), Recipes.lapisHelmet);
		addRecipe(new ItemStack(ModItems.lapisChestplate), Recipes.lapisChestplate);
		addRecipe(new ItemStack(ModItems.lapisLeggings), Recipes.lapisLeggings);
		addRecipe(new ItemStack(ModItems.lapisBoots), Recipes.lapisBoots);


		addRecipe(new ItemStack(ModItems.bronzeHelmet), Recipes.bronzeHelmet);
		addRecipe(new ItemStack(ModItems.bronzeChestplate), Recipes.bronzeChestplate);
		addRecipe(new ItemStack(ModItems.bronzeLeggings), Recipes.bronzeLeggings);
		addRecipe(new ItemStack(ModItems.bronzeBoots), Recipes.bronzeBoots);

		addRecipe(new ItemStack(ModItems.coalHelmet), Recipes.coalHelmet);
		addRecipe(new ItemStack(ModItems.coalChestplate), Recipes.coalChestplate);
		addRecipe(new ItemStack(ModItems.coalLeggings), Recipes.coalLeggings);
		addRecipe(new ItemStack(ModItems.coalBoots), Recipes.coalBoots1);

		addRecipe(new ItemStack(ModItems.glowstoneHelmet), Recipes.glowstoneHelmet);
		addRecipe(new ItemStack(ModItems.glowstoneChestplate), Recipes.glowstoneChestplate);
		addRecipe(new ItemStack(ModItems.glowstoneLeggings), Recipes.glowstoneLeggings);
		addRecipe(new ItemStack(ModItems.glowstoneBoots), Recipes.glowstoneBoots);

		addRecipe(new ItemStack(ModItems.quartzBow), Recipes.quartzBow);
		addRecipe(new ItemStack(ModItems.obsidianBow), Recipes.obsidianBow);
		addRecipe(new ItemStack(ModItems.emeraldBow), Recipes.emeraldBow);
		addRecipe(new ItemStack(ModItems.lapisBow), Recipes.lapisBow);
		addRecipe(new ItemStack(ModItems.bronzeBow), Recipes.bronzeBow);
		addRecipe(new ItemStack(ModItems.coalBow), Recipes.coalBow);
		addRecipe(new ItemStack(ModItems.glowstoneBow), Recipes.glowstoneBow);
		addRecipe(new ItemStack(ModItems.adamantiumBow), Recipes.adamantiumBow);
		
	}
	
	public static void addRecipe(ItemStack output, Object[] recipe)
	{
		GameRegistry.addRecipe(output, recipe);
	}
	
	public static void addShapelessRecipe(ItemStack output, ItemStack input)
	{
		GameRegistry.addShapelessRecipe(output, input);
	}

    public static void addSmelting(Block block, ItemStack stack, float xp)
    {
        GameRegistry.addSmelting(block, stack, xp);
    }
}
