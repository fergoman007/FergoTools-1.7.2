package fergoman123.mods.fergotools.util.item;

import fergoman123.mods.fergotools.util.item.UtilRecipe.RecipeArray;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 06/05/2014.
 */
public class UtilRecipeList {

    public static final char charX = 'x';
    public static final char charY = 'y';

    // Blocks
    public static final Object[] blockObsidian = new Object[]{RecipeArray.getBlockRecipe(), charX, UtilItemStack.obsidianIngot};
    public static final Object[] blockEmeraldCrystal = new Object[]{RecipeArray.getBlockRecipe(), charX, UtilItemStack.emeraldCrystal};
    public static final Object[] blockLapisCrystal = new Object[]{RecipeArray.getBlockRecipe(), charX, UtilItemStack.lapisCrystal};
    public static final Object[] blockBronze = new Object[]{RecipeArray.getBlockRecipe(), charX, UtilItemStack.bronzeIngot};
    public static final Object[] blockCoal = new Object[]{RecipeArray.getBlockRecipe(), charX, UtilItemStack.coalIngot};
    public static final Object[] blockGlowstone = new Object[]{RecipeArray.getBlockRecipe(), charX,  UtilItemStack.glowstoneIngot};
    public static final Object[] blockAdamantium = new Object[]{RecipeArray.getBlockRecipe(), charX, UtilItemStack.adamantiumIngot};
    public static final Object[] blockExperience = new Object[]{RecipeArray.getBlockRecipe(), charX, UtilItemStack.expBottle};
    public static final Object[] blockSilkGem = new Object[]{RecipeArray.getBlockRecipe(), charX, UtilItemStack.silkGem};
    public static final Object[] blockRedstone = new Object[]{RecipeArray.getBlockRecipe(), charX, UtilItemStack.redstoneCrystal};

    // Furnaces
    public static final Object[] quartzFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, UtilItemStack.quartzBlock};
    public static final Object[] obsidianFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, UtilItemStack.blockObsidian};
    public static final Object[] emeraldCrystalFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, UtilItemStack.blockEmeraldCrystal};
    public static final Object[] lapisCrystalFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, UtilItemStack.blockLapisCrystal};
    public static final Object[] bronzeFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, UtilItemStack.blockBronze};
    public static final Object[] coalFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, UtilItemStack.blockCoal};
    public static final Object[] glowstoneFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, UtilItemStack.blockGlowstone};
    public static final Object[] adamantiumFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, UtilItemStack.blockAdamantium};
    public static final Object[] silkFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, UtilItemStack.blockSilkGem};
    public static final Object[] redstoneFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, UtilItemStack.blockRedstone};
    public static final Object[] macerator = new Object[]{"xxx", "xyx", "xxx", charX, UtilItemStack.blockAdamantium, charY, new ItemStack(Blocks.iron_block)};
    // Tools
    public static final Object[] quartzPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, UtilItemStack.quartzStack, charY, UtilItemStack.stickStack};
    public static final Object[] quartzShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, UtilItemStack.quartzStack, charY, UtilItemStack.stickStack};
    public static final Object[] quartzAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, UtilItemStack.quartzStack, charY, UtilItemStack.stickStack};
    public static final Object[] quartzHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, UtilItemStack.quartzStack, charY, UtilItemStack.stickStack};
    public static final Object[] quartzSword = new Object[]{RecipeArray.getSwordRecipe(), charX, UtilItemStack.quartzStack, charY, UtilItemStack.stickStack};

    public static final Object[] obsidianPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, UtilItemStack.obsidianIngot, charY, UtilItemStack.stickStack};
    public static final Object[] obsidianShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, UtilItemStack.obsidianIngot, charY, UtilItemStack.stickStack};
    public static final Object[] obsidianAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, UtilItemStack.obsidianIngot, charY, UtilItemStack.stickStack};
    public static final Object[] obsidianHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, UtilItemStack.obsidianIngot, charY, UtilItemStack.stickStack};
    public static final Object[] obsidianSword = new Object[]{RecipeArray.getSwordRecipe(), charX, UtilItemStack.obsidianIngot, charY, UtilItemStack.stickStack};

    public static final Object[] emeraldPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, UtilItemStack.emeraldCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] emeraldShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, UtilItemStack.emeraldCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] emeraldAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, UtilItemStack.emeraldCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] emeraldHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, UtilItemStack.emeraldCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] emeraldSword = new Object[]{RecipeArray.getSwordRecipe(), charX, UtilItemStack.emeraldCrystal, charY, UtilItemStack.stickStack};

    public static final Object[] lapisPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, UtilItemStack.lapisCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] lapisShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, UtilItemStack.lapisCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] lapisAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, UtilItemStack.lapisCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] lapisHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, UtilItemStack.lapisCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] lapisSword = new Object[]{RecipeArray.getSwordRecipe(), charX, UtilItemStack.lapisCrystal, charY, UtilItemStack.stickStack};

    public static final Object[] bronzePickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, UtilItemStack.bronzeIngot, charY, UtilItemStack.stickStack};
    public static final Object[] bronzeShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, UtilItemStack.bronzeIngot, charY, UtilItemStack.stickStack};
    public static final Object[] bronzeAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, UtilItemStack.bronzeIngot, charY, UtilItemStack.stickStack};
    public static final Object[] bronzeHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, UtilItemStack.bronzeIngot, charY, UtilItemStack.stickStack};
    public static final Object[] bronzeSword = new Object[]{RecipeArray.getSwordRecipe(), charX, UtilItemStack.bronzeIngot, charY, UtilItemStack.stickStack};

    public static final Object[] coalPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, UtilItemStack.coalIngot, charY, UtilItemStack.stickStack};
    public static final Object[] coalShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, UtilItemStack.coalIngot, charY, UtilItemStack.stickStack};
    public static final Object[] coalAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, UtilItemStack.coalIngot, charY, UtilItemStack.stickStack};
    public static final Object[] coalHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, UtilItemStack.coalIngot, charY, UtilItemStack.stickStack};
    public static final Object[] coalSword = new Object[]{RecipeArray.getSwordRecipe(), charX, UtilItemStack.coalIngot, charY, UtilItemStack.stickStack};

    public static final Object[] glowstonePickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX ,UtilItemStack.glowstoneIngot, charY, UtilItemStack.stickStack};
    public static final Object[] glowstoneShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, UtilItemStack.glowstoneIngot, charY, UtilItemStack.stickStack};
    public static final Object[] glowstoneAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, UtilItemStack.glowstoneIngot, charY, UtilItemStack.stickStack};
    public static final Object[] glowstoneHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, UtilItemStack.glowstoneIngot, charY, UtilItemStack.stickStack};
    public static final Object[] glowstoneSword = new Object[]{RecipeArray.getSwordRecipe(), charX, UtilItemStack.glowstoneIngot, charY, UtilItemStack.stickStack};

    public static final Object[] adamantiumPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, UtilItemStack.adamantiumIngot, charY, UtilItemStack.stickStack};
    public static final Object[] adamantiumShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, UtilItemStack.adamantiumIngot, charY, UtilItemStack.stickStack};
    public static final Object[] adamantiumAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, UtilItemStack.adamantiumIngot, charY, UtilItemStack.stickStack};
    public static final Object[] adamantiumHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, UtilItemStack.adamantiumIngot, charY, UtilItemStack.stickStack};
    public static final Object[] adamantiumSword = new Object[]{RecipeArray.getSwordRecipe(), charX, UtilItemStack.adamantiumIngot, charY, UtilItemStack.stickStack};

    public static final Object[] silkPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, UtilItemStack.silkGem, charY, UtilItemStack.stickStack};
    public static final Object[] silkShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, UtilItemStack.silkGem, charY, UtilItemStack.stickStack};
    public static final Object[] silkAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, UtilItemStack.silkGem, charY, UtilItemStack.stickStack};
    public static final Object[] silkHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, UtilItemStack.silkGem, charY, UtilItemStack.stickStack};
    public static final Object[] silkSword = new Object[]{RecipeArray.getSwordRecipe(), charX, UtilItemStack.silkGem, charY, UtilItemStack.stickStack};

    public static final Object[] redstonePickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, UtilItemStack.redstoneCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] redstoneShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, UtilItemStack.redstoneCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] redstoneAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, UtilItemStack.redstoneCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] redstoneHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, UtilItemStack.redstoneCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] redstoneSword = new Object[]{RecipeArray.getSwordRecipe(), charX, UtilItemStack.redstoneCrystal, charY, UtilItemStack.stickStack};

    // Items
    public static final Object[] expBottle = new Object[]{RecipeArray.getBlockRecipe(), charX, UtilItemStack.expShard};

    // Armor
    public static final Object[] quartzHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, UtilItemStack.quartzStack};
    public static final Object[] quartzChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, UtilItemStack.quartzStack};
    public static final Object[] quartzLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, UtilItemStack.quartzStack};
    public static final Object[] quartzBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, UtilItemStack.quartzStack};

    public static final Object[] obsidianHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, UtilItemStack.obsidianIngot};
    public static final Object[] obsidianChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, UtilItemStack.obsidianIngot};
    public static final Object[] obsidianLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, UtilItemStack.obsidianIngot};
    public static final Object[] obsidianBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, UtilItemStack.obsidianIngot};

    public static final Object[] emeraldHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, UtilItemStack.emeraldCrystal};
    public static final Object[] emeraldChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, UtilItemStack.emeraldCrystal};
    public static final Object[] emeraldLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, UtilItemStack.emeraldCrystal};
    public static final Object[] emeraldBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, UtilItemStack.emeraldCrystal};

    public static final Object[] lapisHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, UtilItemStack.lapisCrystal};
    public static final Object[] lapisChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, UtilItemStack.lapisCrystal};
    public static final Object[] lapisLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, UtilItemStack.lapisCrystal};
    public static final Object[] lapisBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, UtilItemStack.lapisCrystal};

    public static final Object[] bronzeHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, UtilItemStack.bronzeIngot};
    public static final Object[] bronzeChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, UtilItemStack.bronzeIngot};
    public static final Object[] bronzeLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, UtilItemStack.bronzeIngot};
    public static final Object[] bronzeBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, UtilItemStack.bronzeIngot};

    public static final Object[] coalHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, UtilItemStack.coalIngot};
    public static final Object[] coalChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, UtilItemStack.coalIngot};
    public static final Object[] coalLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, UtilItemStack.coalIngot};
    public static final Object[] coalBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, UtilItemStack.coalIngot};

    public static final Object[] glowstoneHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, UtilItemStack.glowstoneIngot};
    public static final Object[] glowstoneChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, UtilItemStack.glowstoneIngot};
    public static final Object[] glowstoneLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, UtilItemStack.glowstoneIngot};
    public static final Object[] glowstoneBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, UtilItemStack.glowstoneIngot};

    public static final Object[] redstoneHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, UtilItemStack.redstoneCrystal};
    public static final Object[] redstoneChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, UtilItemStack.redstoneCrystal};
    public static final Object[] redstoneLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, UtilItemStack.redstoneCrystal};
    public static final Object[] redstoneBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, UtilItemStack.redstoneCrystal};

    // Bows
    public static final Object[] quartzBow = new Object[]{RecipeArray.getBowRecipe(), charY, UtilItemStack.quartzStack, charX, UtilItemStack.stringStack};
    public static final Object[] obsidianBow = new Object[]{RecipeArray.getBowRecipe(), charY, UtilItemStack.obsidianIngot, charX, UtilItemStack.stringStack};
    public static final Object[] emeraldBow = new Object[]{RecipeArray.getBowRecipe(), charY, UtilItemStack.emeraldCrystal, charX, UtilItemStack.stringStack};
    public static final Object[] lapisBow = new Object[]{RecipeArray.getBowRecipe(), charY, UtilItemStack.lapisCrystal, charX, UtilItemStack.stringStack};
    public static final Object[] bronzeBow = new Object[]{RecipeArray.getBowRecipe(), charY, UtilItemStack.bronzeIngot, charX, UtilItemStack.stringStack};
    public static final Object[] coalBow = new Object[]{RecipeArray.getBowRecipe(), charY, UtilItemStack.coalIngot, charX, UtilItemStack.stringStack};
    public static final Object[] glowstoneBow = new Object[]{RecipeArray.getBowRecipe(), charY, UtilItemStack.glowstoneIngot, charX, UtilItemStack.stringStack};
    public static final Object[] adamantiumBow = new Object[]{RecipeArray.getBowRecipe(), charY, UtilItemStack.adamantiumIngot, charX, UtilItemStack.stringStack};
}
