package fergoman123.mods.fergotools.handler;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import fergoman123.mods.fergotools.block.ModBlocks;
import fergoman123.mods.fergotools.item.ModItems;

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
       
        addShapelessRecipe(new ItemStack(ModItems.expShard, 9), new ItemStack(Items.experience_bottle));
        
        addRecipe(new ItemStack(ModBlocks.blockObsidian), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.obsidianIngot)});
        addRecipe(new ItemStack(ModBlocks.blockEmeraldCrystal), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.emeraldCrystal)});
        addRecipe(new ItemStack(ModBlocks.blockLapisCrystal), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.lapisCrystal)});
        addRecipe(new ItemStack(ModBlocks.blockBronze), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.bronzeIngot)});
        addRecipe(new ItemStack(ModBlocks.blockAdamantium), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.adamantiumIngot)});
        addRecipe(new ItemStack(ModBlocks.blockCoal), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.coalIngot)});
        addRecipe(new ItemStack(ModBlocks.blockGlowstone), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.glowstoneIngot)});
        addRecipe(new ItemStack(ModBlocks.blockExperience), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(Items.experience_bottle)});
        
        addRecipe(new ItemStack(Items.experience_bottle), new Object[]{"xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.expShard)});
       
        addRecipe(new ItemStack(ModItems.quartzPickaxe), new Object[]{"xxx", " y ", " y ", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.quartzShovel), new Object[]{"x  ", "y  ", "y  ", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.quartzAxe), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.quartzHoe), new Object[]{"xx ", " y ", " y ", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.quartzSword), new Object[]{"x  ", "x  ", "y  ", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.quartzSword), new Object[]{" x ", " x ", " y ", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.quartzSword), new Object[]{"  x", "  x", "  y", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)});
        
        addRecipe(new ItemStack(ModItems.obsidianPickaxe), new Object[]{"xxx", " y ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.obsidianShovel), new Object[]{"x  ", "y  ", "y  ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.obsidianShovel), new Object[]{" x ", " y ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.obsidianShovel), new Object[]{"  x", "  y", "  y", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.obsidianAxe), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.obsidianAxe), new Object[]{" xx", " yx", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.obsidianHoe), new Object[]{"xx ", " y ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.obsidianHoe), new Object[]{" xx", " y ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.obsidianSword), new Object[]{"x  ", "x  ", "y  ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.obsidianSword), new Object[]{" x ", " x ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.obsidianSword), new Object[]{"  x", "  x", "  y", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)});
        
        addRecipe(new ItemStack(ModItems.emeraldPickaxe), new Object[]{"xxx", " y ", " y ", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.emeraldShovel), new Object[]{"x  ", "y  ", "y  ", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.emeraldShovel), new Object[]{" x ", " y ", " y ", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.emeraldShovel), new Object[]{"  x", "  y", "  y", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.emeraldAxe), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.emeraldAxe), new Object[]{" xx", " yx", " y ", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.emeraldAxe), new Object[]{"xx ", "yx ", "y  ", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.emeraldHoe), new Object[]{"xx ", " y ", " y ", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.emeraldHoe), new Object[]{" xx", " y ", " y ", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.emeraldSword), new Object[]{"x  ", "x  ", "y  ", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.emeraldSword), new Object[]{" x ", " x ", " y ", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.emeraldSword), new Object[]{"  x", "  x", "  y", 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)});
        
        addRecipe(new ItemStack(ModItems.lapisPickaxe), new Object[]{"xxx", " y ", " y ", 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.lapisShovel), new Object[]{"x  ", "y  ", "y  ", 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.lapisShovel), new Object[]{" x ", " y ", " y ", 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.lapisShovel), new Object[]{"  x", "  y", "  y", 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.lapisAxe), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.lapisAxe), new Object[]{" xx", " yx", " y ", 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.lapisHoe), new Object[]{"xx ", " y ", " y ", 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.lapisHoe), new Object[]{" xx", " y ", " y ", 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.lapisSword), new Object[]{"x  ", "x  ", "y  ", 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.lapisSword), new Object[]{" x ", " x ", " y ", 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.lapisSword), new Object[]{"  x", "  x", "  y", 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)});
        
        addRecipe(new ItemStack(ModItems.bronzePickaxe), new Object[]{"xxx", " y ", " y ", 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.bronzeShovel), new Object[]{"x  ", "y  ", "y  ", 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.bronzeShovel), new Object[]{" x ", " y ", " y ", 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.bronzeShovel), new Object[]{"  x", "  y", "  y", 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.bronzeAxe), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.bronzeAxe), new Object[]{" xx", " yx", " y ", 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.bronzeHoe), new Object[]{"xx ", " y ", " y ", 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.bronzeHoe), new Object[]{" xx", " y ", " y ", 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.bronzeSword), new Object[]{"x  ", "x  ", "y  ", 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.bronzeSword), new Object[]{" x ", " x ", " y ", 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.bronzeSword), new Object[]{"  x", "  x", "  y", 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)});
        
        addRecipe(new ItemStack(ModItems.coalPickaxe), new Object[]{"xxx", " y ", " y ", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalShovel), new Object[]{"x  ", "y  ", "y  ", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalShovel), new Object[]{" x ", " y ", " y ", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalShovel), new Object[]{"  x", "  y", "  y", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalAxe), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalAxe), new Object[]{" xx", " yx", " y ", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalAxe), new Object[]{"xx ", "yx ", "y  ", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalHoe), new Object[]{"xx ", " y ", " y ", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalHoe), new Object[]{" xx", " y ", " y ", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalHoe), new Object[]{"xx ", "y  ", "y  ", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalSword), new Object[]{"x  ", "x  ", "y  ", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalSword), new Object[]{" x ", " x ", " y ", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.coalSword), new Object[]{"  x", "  x", "  y", 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)});
        
        addRecipe(new ItemStack(ModItems.adamantiumPickaxe), new Object[]{"xxx", " y ", " y ", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumShovel), new Object[]{"x  ", "y  ", "y  ", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumShovel), new Object[]{" x ", " y ", " y ", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumShovel), new Object[]{"  x", "  y", "  y", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumAxe), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumAxe), new Object[]{" xx", " yx", " y ", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumAxe), new Object[]{"xx ", "yx ", "y  ", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumHoe), new Object[]{"xx ", " y ", " y ", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumHoe), new Object[]{" xx", " y ", " y ", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumHoe), new Object[]{"xx ", "y  ", "y  ", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumSword), new Object[]{"x  ", "x  ", "y  ", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumSword), new Object[]{" x ", " x ", " y ", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.adamantiumSword), new Object[]{"  x", "  x", "  y", 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)});
        
        addRecipe(new ItemStack(ModItems.glowstonePickaxe), new Object[]{"xxx", " y ", " y ", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneShovel), new Object[]{"x  ", "y  ", "y  ", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneShovel), new Object[]{" x ", " y ", " y ", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneShovel), new Object[]{"  x", "  y", "  y", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneAxe), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneAxe), new Object[]{" xx", " yx", " y ", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneAxe), new Object[]{"xx ", "yx ", "y  ", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneHoe), new Object[]{"xx ", " y ", " y ", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneHoe), new Object[]{" xx", " y ", " y ", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneHoe), new Object[]{"xx ", "y  ", "y  ", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneSword), new Object[]{"x  ", "x  ", "y  ", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneSword), new Object[]{" x ", " x ", " y ", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.glowstoneSword), new Object[]{"  x", "  x", "  y", 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)});
        
        addRecipe(new ItemStack(ModItems.silkPickaxe), new Object[]{"xxx", " y ", " y ", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkShovel), new Object[]{"x  ", "y  ", "y  ", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkShovel), new Object[]{" x ", " y ", " y ", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkShovel), new Object[]{"  x", "  y", "  y", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkAxe), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkAxe), new Object[]{" xx", " yx", " y ", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkAxe), new Object[]{"xx ", "yx ", "y  ", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkHoe), new Object[]{"xx ", " y ", " y ", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkHoe), new Object[]{" xx", " y ", " y ", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkHoe), new Object[]{"xx ", "y  ", "y  ", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkSword), new Object[]{"x  ", "x  ", "y  ", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkSword), new Object[]{" x ", " x ", " y ", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        addRecipe(new ItemStack(ModItems.silkSword), new Object[]{"  x", "  x", "  y", 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)});
        
        addRecipe(new ItemStack(ModBlocks.quartzFurnaceIdle), new Object[]{"xxx", "x x", "xxx", 'x', new ItemStack(Blocks.quartz_block, 1, 0)});
        addRecipe(new ItemStack(ModBlocks.obsidianFurnaceIdle), new Object[]{"xxx", "x x", "xxx", 'x', new ItemStack(ModBlocks.blockObsidian)});
        addRecipe(new ItemStack(ModBlocks.emeraldCrystalFurnaceIdle), new Object[]{"xxx", "x x", "xxx", 'x', new ItemStack(ModBlocks.blockEmeraldCrystal)});
        addRecipe(new ItemStack(ModBlocks.lapisCrystalFurnaceIdle), new Object[]{"xxx", "x x", "xxx", 'x', new ItemStack(ModBlocks.blockLapisCrystal)});
        addRecipe(new ItemStack(ModBlocks.bronzeFurnaceIdle), new Object[]{"xxx", "x x", "xxx", 'x', new ItemStack(ModBlocks.blockBronze)});
        addRecipe(new ItemStack(ModBlocks.adamantiumFurnaceIdle), new Object[]{"xxx", "x x", "xxx", 'x', new ItemStack(ModBlocks.blockAdamantium)});
        addRecipe(new ItemStack(ModBlocks.coalFurnaceIdle), new Object[]{"xxx", "x x", "xxx", 'x', new ItemStack(ModBlocks.blockCoal)});
        addRecipe(new ItemStack(ModBlocks.glowstoneFurnaceIdle), new Object[]{"xxx", "x x", "xxx", 'x', new ItemStack(ModBlocks.blockGlowstone)});

        addSmelting(ModBlocks.oreObsidian, new ItemStack(ModItems.obsidianIngot), 2.5f);
        addSmelting(ModBlocks.oreEmeraldCrystal, new ItemStack(ModItems.emeraldCrystal), 2.5f);
        addSmelting(ModBlocks.oreLapisCrystal, new ItemStack(ModItems.lapisCrystal), 2.5f);
        addSmelting(ModBlocks.oreBronze, new ItemStack(ModItems.bronzeIngot), 2.5f);
        addSmelting(Blocks.coal_block, new ItemStack(ModItems.coalIngot), 2.5f);
        addSmelting(Blocks.glowstone, new ItemStack(ModItems.glowstoneIngot), 2.5f);
        addSmelting(ModBlocks.oreAdamantium, new ItemStack(ModItems.adamantiumIngot), 2.5f);
        addSmelting(ModBlocks.oreExperience, new ItemStack(ModItems.expShard, 5), 2.5f);


		
		addRecipe(new ItemStack(ModItems.quartzHelmet), new Object[]{"xxx", "x x", 'x', Items.quartz});
		addRecipe(new ItemStack(ModItems.quartzChestplate), new Object[]{"x x", "xxx", "xxx", 'x', Items.quartz});
		addRecipe(new ItemStack(ModItems.quartzLeggings), new Object[]{"xxx", "x x", "x x", 'x', Items.quartz});
		addRecipe(new ItemStack(ModItems.quartzBoots), new Object[]{"x x", "x x", 'x', Items.quartz});
		
		addRecipe(new ItemStack(ModItems.obsidianHelmet), new Object[]{"xxx", "x x", 'x', ModItems.obsidianIngot});
		addRecipe(new ItemStack(ModItems.obsidianChestplate), new Object[]{"x x", "xxx", "xxx", 'x', ModItems.obsidianIngot});
		addRecipe(new ItemStack(ModItems.obsidianLeggings), new Object[]{"xxx", "x x", "x x", 'x', ModItems.obsidianIngot});
		addRecipe(new ItemStack(ModItems.obsidianBoots), new Object[]{"x x", "x x", 'x', ModItems.obsidianIngot});
		
		addRecipe(new ItemStack(ModItems.emeraldHelmet), new Object[]{"xxx", "x x", 'x', ModItems.emeraldCrystal});
		addRecipe(new ItemStack(ModItems.emeraldChestplate), new Object[]{"x x", "xxx", "xxx", 'x', ModItems.emeraldCrystal});
		addRecipe(new ItemStack(ModItems.emeraldLeggings), new Object[]{"xxx", "x x", "x x", 'x', ModItems.emeraldCrystal});
		addRecipe(new ItemStack(ModItems.emeraldBoots), new Object[]{"x x", "x x", 'x', ModItems.emeraldCrystal});
		
		addRecipe(new ItemStack(ModItems.lapisHelmet), new Object[]{"xxx", "x x", 'x', ModItems.lapisCrystal});
		addRecipe(new ItemStack(ModItems.lapisChestplate), new Object[]{"x x", "xxx", "xxx", 'x', ModItems.lapisCrystal});
		addRecipe(new ItemStack(ModItems.lapisLeggings), new Object[]{"xxx", "x x", "x x", 'x', ModItems.lapisCrystal});
		addRecipe(new ItemStack(ModItems.lapisBoots), new Object[]{"x x", "x x", 'x', ModItems.lapisCrystal});
		
		
		addRecipe(new ItemStack(ModItems.bronzeHelmet), new Object[]{"xxx", "x x", 'x', ModItems.bronzeIngot});
		addRecipe(new ItemStack(ModItems.bronzeChestplate), new Object[]{"x x", "xxx", "xxx", 'x', ModItems.bronzeIngot});
		addRecipe(new ItemStack(ModItems.bronzeLeggings), new Object[]{"xxx", "x x", "x x", 'x', ModItems.bronzeIngot});
		addRecipe(new ItemStack(ModItems.bronzeBoots), new Object[]{"x x", "x x", 'x', ModItems.bronzeIngot});
		
		addRecipe(new ItemStack(ModItems.coalHelmet), new Object[]{"xxx", "x x", "   ", 'x', ModItems.coalIngot});
		addRecipe(new ItemStack(ModItems.coalHelmet), new Object[]{"   ", "xxx", "x x", 'x', new ItemStack(ModItems.coalIngot)});
		addRecipe(new ItemStack(ModItems.coalChestplate), new Object[]{"x x", "xxx", "xxx", 'x', ModItems.coalIngot});
		addRecipe(new ItemStack(ModItems.coalLeggings), new Object[]{"xxx", "x x", "x x", 'x', ModItems.coalIngot});
		addRecipe(new ItemStack(ModItems.coalBoots), new Object[]{"x x", "x x", "   ", 'x', ModItems.coalIngot});
		addRecipe(new ItemStack(ModItems.coalBoots), new Object[]{"   ", "x x", "x x", 'x', new ItemStack(ModItems.coalIngot)});
		
		addRecipe(new ItemStack(ModItems.glowstoneHelmet), new Object[]{"xxx", "x x", 'x', ModItems.glowstoneIngot});
		addRecipe(new ItemStack(ModItems.glowstoneChestplate), new Object[]{"x x", "xxx", "xxx", 'x', ModItems.glowstoneIngot});
		addRecipe(new ItemStack(ModItems.glowstoneLeggings), new Object[]{"xxx", "x x", "x x", 'x', ModItems.glowstoneIngot});
		addRecipe(new ItemStack(ModItems.glowstoneBoots), new Object[]{"x x", "x x", 'x', ModItems.glowstoneIngot});
		
		addRecipe(new ItemStack(ModItems.quartzBow), new Object[]{" #X", "# X", " #X", 'X', Items.string, '#', Items.quartz});
		addRecipe(new ItemStack(ModItems.obsidianBow), new Object[]{" #X", "# X", " #X", 'X', Items.string, '#', ModItems.obsidianIngot});
//		addRecipe(new ItemStack(ModItems.emeraldBow), new Object[]{" #X", "# X", " #X", 'X', Item.silk, '#', ModItems.emeraldCrystal});
//		addRecipe(new ItemStack(ModItems.lapisBow), new Object[]{" #X", "# X", " #X", 'X', Item.silk, '#', ModItems.lapisCrystal});
//		addRecipe(new ItemStack(ModItems.bronzeBow), new Object[]{" #X", "# X", " #X", 'X', Item.silk, '#', ModItems.bronzeIngot});
//		addRecipe(new ItemStack(ModItems.coalBow), new Object[]{" #X", "# X", " #X", 'X', Item.silk, '#', ModItems.coalIngot});
//		addRecipe(new ItemStack(ModItems.glowstoneBow), new Object[]{" #X", "# X", " #X", 'X', Item.silk, '#', ModItems.glowstoneIngot});
//		addRecipe(new ItemStack(ModItems.adamantiumBow), new Object[]{" #X", "# X", " #X", 'X', Item.silk, '#', ModItems.adamantiumIngot});
		
	}
	
	public static void addRecipe(ItemStack output, Object... recipe)
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

    public static void addSmelting(Item item, ItemStack stack, float xp)
    {
        GameRegistry.addSmelting(item, stack, xp);
    }

}
