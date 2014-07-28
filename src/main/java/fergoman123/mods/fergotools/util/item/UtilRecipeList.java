package fergoman123.mods.fergotools.util.item;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemExpShard;
import fergoman123.mods.fergotools.util.item.UtilRecipe.RecipeArray;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class UtilRecipeList {

    public static final char charX = 'x';
    public static final char charY = 'y';
    public static final int wildcard = OreDictionary.WILDCARD_VALUE;

    // Blocks
    public static final Object[] blockObsidian = new Object[]{RecipeArray.getBlockRecipe(), charX, FTStacks.obsidianIngot};
    public static final Object[] blockEmeraldCrystal = new Object[]{RecipeArray.getBlockRecipe(), charX, FTStacks.emeraldCrystal};
    public static final Object[] blockLapisCrystal = new Object[]{RecipeArray.getBlockRecipe(), charX, FTStacks.lapisCrystal};
    public static final Object[] blockBronze = new Object[]{RecipeArray.getBlockRecipe(), charX, FTStacks.bronzeIngot};
    public static final Object[] blockCoal = new Object[]{RecipeArray.getBlockRecipe(), charX, FTStacks.coalIngot};
    public static final Object[] blockGlowstone = new Object[]{RecipeArray.getBlockRecipe(), charX,  FTStacks.glowstoneIngot};
    public static final Object[] blockAdamantium = new Object[]{RecipeArray.getBlockRecipe(), charX, FTStacks.adamantiumIngot};
    public static final Object[] blockExperience = new Object[]{RecipeArray.getBlockRecipe(), charX, FTStacks.expShard};
    public static final Object[] blockSilkGem = new Object[]{RecipeArray.getBlockRecipe(), charX, FTStacks.silkGem};
    public static final Object[] blockRedstone = new Object[]{RecipeArray.getBlockRecipe(), charX, FTStacks.redstoneCrystal};

    // Furnaces
    public static final Object[] quartzFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, FTStacks.quartzBlock};
    public static final Object[] obsidianFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, FTStacks.blockObsidian};
    public static final Object[] emeraldCrystalFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, FTStacks.blockEmeraldCrystal};
    public static final Object[] lapisCrystalFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, FTStacks.blockLapisCrystal};
    public static final Object[] bronzeFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, FTStacks.blockBronze};
    public static final Object[] coalFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, FTStacks.blockCoal};
    public static final Object[] glowstoneFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, FTStacks.blockGlowstone};
    public static final Object[] adamantiumFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, FTStacks.blockAdamantium};
    public static final Object[] silkFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, FTStacks.blockSilkGem};
    public static final Object[] redstoneFurnace = new Object[]{RecipeArray.getFurnaceRecipe(), charX, FTStacks.blockRedstone};
    public static final Object[] macerator = new Object[]{"xxx", "xyx", "xxx", charX, FTStacks.blockAdamantium, charY, new ItemStack(Blocks.iron_block)};
    // Tools
    public static final Object[] quartzPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, FTStacks.quartzStack, charY, FTStacks.stickStack};
    public static final Object[] quartzSword = new Object[]{RecipeArray.getSwordRecipe(), charX, FTStacks.quartzStack, charY, FTStacks.stickStack};

    public static final Object[] obsidianPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};
    public static final Object[] obsidianSword = new Object[]{RecipeArray.getSwordRecipe(), charX, FTStacks.obsidianIngot, charY, FTStacks.stickStack};

    public static final Object[] emeraldPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};
    public static final Object[] emeraldSword = new Object[]{RecipeArray.getSwordRecipe(), charX, FTStacks.emeraldCrystal, charY, FTStacks.stickStack};

    public static final Object[] lapisPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};
    public static final Object[] lapisSword = new Object[]{RecipeArray.getSwordRecipe(), charX, FTStacks.lapisCrystal, charY, FTStacks.stickStack};

    public static final Object[] bronzePickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};
    public static final Object[] bronzeSword = new Object[]{RecipeArray.getSwordRecipe(), charX, FTStacks.bronzeIngot, charY, FTStacks.stickStack};

    public static final Object[] coalPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, FTStacks.coalIngot, charY, FTStacks.stickStack};
    public static final Object[] coalSword = new Object[]{RecipeArray.getSwordRecipe(), charX, FTStacks.coalIngot, charY, FTStacks.stickStack};

    public static final Object[] glowstonePickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX , FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};
    public static final Object[] glowstoneSword = new Object[]{RecipeArray.getSwordRecipe(), charX, FTStacks.glowstoneIngot, charY, FTStacks.stickStack};

    public static final Object[] adamantiumPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};
    public static final Object[] adamantiumSword = new Object[]{RecipeArray.getSwordRecipe(), charX, FTStacks.adamantiumIngot, charY, FTStacks.stickStack};

    public static final Object[] silkPickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, FTStacks.silkGem, charY, FTStacks.stickStack};
    public static final Object[] silkSword = new Object[]{RecipeArray.getSwordRecipe(), charX, FTStacks.silkGem, charY, FTStacks.stickStack};

    public static final Object[] redstonePickaxe = new Object[]{RecipeArray.getPickaxeRecipe(), charX, FTStacks.redstoneCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneShovel = new Object[]{RecipeArray.getShovelRecipe(), charX, FTStacks.redstoneCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneAxe = new Object[]{RecipeArray.getAxeRecipe(), charX, FTStacks.redstoneCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneHoe = new Object[]{RecipeArray.getHoeRecipe(), charX, FTStacks.redstoneCrystal, charY, FTStacks.stickStack};
    public static final Object[] redstoneSword = new Object[]{RecipeArray.getSwordRecipe(), charX, FTStacks.redstoneCrystal, charY, FTStacks.stickStack};

    // Armor
    public static final Object[] quartzHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, FTStacks.quartzStack};
    public static final Object[] quartzChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, FTStacks.quartzStack};
    public static final Object[] quartzLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, FTStacks.quartzStack};
    public static final Object[] quartzBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, FTStacks.quartzStack};

    public static final Object[] obsidianHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, FTStacks.obsidianIngot};
    public static final Object[] obsidianChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, FTStacks.obsidianIngot};
    public static final Object[] obsidianLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, FTStacks.obsidianIngot};
    public static final Object[] obsidianBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, FTStacks.obsidianIngot};

    public static final Object[] emeraldHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, FTStacks.emeraldCrystal};
    public static final Object[] emeraldChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, FTStacks.emeraldCrystal};
    public static final Object[] emeraldLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, FTStacks.emeraldCrystal};
    public static final Object[] emeraldBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, FTStacks.emeraldCrystal};

    public static final Object[] lapisHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, FTStacks.lapisCrystal};
    public static final Object[] lapisChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, FTStacks.lapisCrystal};
    public static final Object[] lapisLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, FTStacks.lapisCrystal};
    public static final Object[] lapisBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, FTStacks.lapisCrystal};

    public static final Object[] bronzeHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, FTStacks.bronzeIngot};
    public static final Object[] bronzeChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, FTStacks.bronzeIngot};
    public static final Object[] bronzeLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, FTStacks.bronzeIngot};
    public static final Object[] bronzeBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, FTStacks.bronzeIngot};

    public static final Object[] coalHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, FTStacks.coalIngot};
    public static final Object[] coalChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, FTStacks.coalIngot};
    public static final Object[] coalLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, FTStacks.coalIngot};
    public static final Object[] coalBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, FTStacks.coalIngot};

    public static final Object[] glowstoneHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, FTStacks.glowstoneIngot};
    public static final Object[] glowstoneChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, FTStacks.glowstoneIngot};
    public static final Object[] glowstoneLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, FTStacks.glowstoneIngot};
    public static final Object[] glowstoneBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, FTStacks.glowstoneIngot};

    public static final Object[] redstoneHelmet = new Object[]{RecipeArray.getHelmetRecipe(), charX, FTStacks.redstoneCrystal};
    public static final Object[] redstoneChestplate = new Object[]{RecipeArray.getChestplateRecipe(), charX, FTStacks.redstoneCrystal};
    public static final Object[] redstoneLeggings = new Object[]{RecipeArray.getLeggingsRecipe(), charX, FTStacks.redstoneCrystal};
    public static final Object[] redstoneBoots = new Object[]{RecipeArray.getBootsRecipe(), charX, FTStacks.redstoneCrystal};

    public static final Object[] silkGem = new Object[]{" x ", "xyx", " x ", charX, Items.diamond, charY, new ItemStack(Blocks.wool, 1, wildcard)};
    public static final Object[] expCollector = new Object[]{"xxx", "xyx", "xxx", 'x', ModItems.expShard, 'y', Items.diamond};

    // Bows
    public static final Object[] quartzBow = new Object[]{RecipeArray.getBowRecipe(), charY, FTStacks.quartzStack, charX, FTStacks.stringStack};
    public static final Object[] obsidianBow = new Object[]{RecipeArray.getBowRecipe(), charY, FTStacks.obsidianIngot, charX, FTStacks.stringStack};
    public static final Object[] emeraldBow = new Object[]{RecipeArray.getBowRecipe(), charY, FTStacks.emeraldCrystal, charX, FTStacks.stringStack};
    public static final Object[] lapisBow = new Object[]{RecipeArray.getBowRecipe(), charY, FTStacks.lapisCrystal, charX, FTStacks.stringStack};
    public static final Object[] bronzeBow = new Object[]{RecipeArray.getBowRecipe(), charY, FTStacks.bronzeIngot, charX, FTStacks.stringStack};
    public static final Object[] coalBow = new Object[]{RecipeArray.getBowRecipe(), charY, FTStacks.coalIngot, charX, FTStacks.stringStack};
    public static final Object[] glowstoneBow = new Object[]{RecipeArray.getBowRecipe(), charY, FTStacks.glowstoneIngot, charX, FTStacks.stringStack};
    public static final Object[] adamantiumBow = new Object[]{RecipeArray.getBowRecipe(), charY, FTStacks.adamantiumIngot, charX, FTStacks.stringStack};
}
