package fergoman123.mods.fergotools.util.item;

import fergoman123.mods.fergotools.util.recipe.UtilItemStack;
import fergoman123.mods.fergotools.util.recipe.UtilRecipe;

/**
 * Created by Fergoman123 on 06/05/2014.
 */
public class UtilRecipeList {

    public static final char charX = 'x';
    public static final char charY = 'y';

    // Blocks
    public static final Object[] blockObsidian = new Object[]{UtilRecipe.blockRecipe, charX, UtilItemStack.obsidianIngot};
    public static final Object[] blockEmeraldCrystal = new Object[]{UtilRecipe.blockRecipe, charX, UtilItemStack.emeraldCrystal};
    public static final Object[] blockLapisCrystal = new Object[]{UtilRecipe.blockRecipe, charX, UtilItemStack.lapisCrystal};
    public static final Object[] blockBronze = new Object[]{UtilRecipe.blockRecipe, charX, UtilItemStack.bronzeIngot};
    public static final Object[] blockCoal = new Object[]{UtilRecipe.blockRecipe, charX, UtilItemStack.coalIngot};
    public static final Object[] blockGlowstone = new Object[]{UtilRecipe.blockRecipe, charX,  UtilItemStack.glowstoneIngot};
    public static final Object[] blockAdamantium = new Object[]{UtilRecipe.blockRecipe, charX, UtilItemStack.adamantiumIngot};
    public static final Object[] blockExperience = new Object[]{UtilRecipe.blockRecipe, charX, UtilItemStack.expBottle};
    public static final Object[] blockSilkGem = new Object[]{UtilRecipe.blockRecipe, charX, UtilItemStack.silkGem};
    public static final Object[] blockRedstone = new Object[]{UtilRecipe.blockRecipe, charX, UtilItemStack.redstoneCrystal};

    // Furnaces
    public static final Object[] quartzFurnace = new Object[]{UtilRecipe.furnaceRecipe, charX, UtilItemStack.quartzBlock};
    public static final Object[] obsidianFurnace = new Object[]{UtilRecipe.furnaceRecipe, charX, UtilItemStack.blockObsidian};
    public static final Object[] emeraldCrystalFurnace = new Object[]{UtilRecipe.furnaceRecipe, charX, UtilItemStack.blockEmeraldCrystal};
    public static final Object[] lapisCrystalFurnace = new Object[]{UtilRecipe.furnaceRecipe, charX, UtilItemStack.blockLapisCrystal};
    public static final Object[] bronzeFurnace = new Object[]{UtilRecipe.furnaceRecipe, charX, UtilItemStack.blockBronze};
    public static final Object[] coalFurnace = new Object[]{UtilRecipe.furnaceRecipe, charX, UtilItemStack.blockCoal};
    public static final Object[] glowstoneFurnace = new Object[]{UtilRecipe.furnaceRecipe, charX, UtilItemStack.blockGlowstone};
    public static final Object[] adamantiumFurnace = new Object[]{UtilRecipe.furnaceRecipe, charX, UtilItemStack.blockAdamantium};
    public static final Object[] silkFurnace = new Object[]{UtilRecipe.furnaceRecipe, charX, UtilItemStack.blockSilkGem};
    public static final Object[] redstoneFurnace = new Object[]{UtilRecipe.furnaceRecipe, charX, UtilItemStack.blockRedstone};

    // Tools
    public static final Object[] quartzPickaxe = new Object[]{UtilRecipe.pickaxeRecipe, charX, UtilItemStack.quartzStack, charY, UtilItemStack.stickStack};
    public static final Object[] quartzShovel = new Object[]{UtilRecipe.shovelRecipe, charX, UtilItemStack.quartzStack, charY, UtilItemStack.stickStack};
    public static final Object[] quartzAxe = new Object[]{UtilRecipe.axeRecipe, charX, UtilItemStack.quartzStack, charY, UtilItemStack.stickStack};
    public static final Object[] quartzHoe = new Object[]{UtilRecipe.hoeRecipe, charX, UtilItemStack.quartzStack, charY, UtilItemStack.stickStack};
    public static final Object[] quartzSword = new Object[]{UtilRecipe.swordRecipe, charX, UtilItemStack.quartzStack, charY, UtilItemStack.stickStack};

    public static final Object[] obsidianPickaxe = new Object[]{UtilRecipe.pickaxeRecipe, charX, UtilItemStack.obsidianIngot, charY, UtilItemStack.stickStack};
    public static final Object[] obsidianShovel = new Object[]{UtilRecipe.shovelRecipe, charX, UtilItemStack.obsidianIngot, charY, UtilItemStack.stickStack};
    public static final Object[] obsidianAxe = new Object[]{UtilRecipe.axeRecipe, charX, UtilItemStack.obsidianIngot, charY, UtilItemStack.stickStack};
    public static final Object[] obsidianHoe = new Object[]{UtilRecipe.hoeRecipe, charX, UtilItemStack.obsidianIngot, charY, UtilItemStack.stickStack};
    public static final Object[] obsidianSword = new Object[]{UtilRecipe.swordRecipe, charX, UtilItemStack.obsidianIngot, charY, UtilItemStack.stickStack};

    public static final Object[] emeraldPickaxe = new Object[]{UtilRecipe.pickaxeRecipe, charX, UtilItemStack.emeraldCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] emeraldShovel = new Object[]{UtilRecipe.shovelRecipe, charX, UtilItemStack.emeraldCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] emeraldAxe = new Object[]{UtilRecipe.axeRecipe, charX, UtilItemStack.emeraldCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] emeraldHoe = new Object[]{UtilRecipe.hoeRecipe, charX, UtilItemStack.emeraldCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] emeraldSword = new Object[]{UtilRecipe.swordRecipe, charX, UtilItemStack.emeraldCrystal, charY, UtilItemStack.stickStack};

    public static final Object[] lapisPickaxe = new Object[]{UtilRecipe.pickaxeRecipe, charX, UtilItemStack.lapisCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] lapisShovel = new Object[]{UtilRecipe.shovelRecipe, charX, UtilItemStack.lapisCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] lapisAxe = new Object[]{UtilRecipe.axeRecipe, charX, UtilItemStack.lapisCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] lapisHoe = new Object[]{UtilRecipe.hoeRecipe, charX, UtilItemStack.lapisCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] lapisSword = new Object[]{UtilRecipe.swordRecipe, charX, UtilItemStack.lapisCrystal, charY, UtilItemStack.stickStack};

    public static final Object[] bronzePickaxe = new Object[]{UtilRecipe.pickaxeRecipe, charX, UtilItemStack.bronzeIngot, charY, UtilItemStack.stickStack};
    public static final Object[] bronzeShovel = new Object[]{UtilRecipe.shovelRecipe, charX, UtilItemStack.bronzeIngot, charY, UtilItemStack.stickStack};
    public static final Object[] bronzeAxe = new Object[]{UtilRecipe.axeRecipe, charX, UtilItemStack.bronzeIngot, charY, UtilItemStack.stickStack};
    public static final Object[] bronzeHoe = new Object[]{UtilRecipe.hoeRecipe, charX, UtilItemStack.bronzeIngot, charY, UtilItemStack.stickStack};
    public static final Object[] bronzeSword = new Object[]{UtilRecipe.swordRecipe, charX, UtilItemStack.bronzeIngot, charY, UtilItemStack.stickStack};

    public static final Object[] coalPickaxe = new Object[]{UtilRecipe.pickaxeRecipe, charX, UtilItemStack.coalIngot, charY, UtilItemStack.stickStack};
    public static final Object[] coalShovel = new Object[]{UtilRecipe.shovelRecipe, charX, UtilItemStack.coalIngot, charY, UtilItemStack.stickStack};
    public static final Object[] coalAxe = new Object[]{UtilRecipe.axeRecipe, charX, UtilItemStack.coalIngot, charY, UtilItemStack.stickStack};
    public static final Object[] coalHoe = new Object[]{UtilRecipe.hoeRecipe, charX, UtilItemStack.coalIngot, charY, UtilItemStack.stickStack};
    public static final Object[] coalSword = new Object[]{UtilRecipe.swordRecipe, charX, UtilItemStack.coalIngot, charY, UtilItemStack.stickStack};

    public static final Object[] glowstonePickaxe = new Object[]{UtilRecipe.pickaxeRecipe, charX ,UtilItemStack.glowstoneIngot, charY, UtilItemStack.stickStack};
    public static final Object[] glowstoneShovel = new Object[]{UtilRecipe.shovelRecipe, charX, UtilItemStack.glowstoneIngot, charY, UtilItemStack.stickStack};
    public static final Object[] glowstoneAxe = new Object[]{UtilRecipe.axeRecipe, charX, UtilItemStack.glowstoneIngot, charY, UtilItemStack.stickStack};
    public static final Object[] glowstoneHoe = new Object[]{UtilRecipe.hoeRecipe, charX, UtilItemStack.glowstoneIngot, charY, UtilItemStack.stickStack};
    public static final Object[] glowstoneSword = new Object[]{UtilRecipe.swordRecipe, charX, UtilItemStack.glowstoneIngot, charY, UtilItemStack.stickStack};

    public static final Object[] adamantiumPickaxe = new Object[]{UtilRecipe.pickaxeRecipe, charX, UtilItemStack.adamantiumIngot, charY, UtilItemStack.stickStack};
    public static final Object[] adamantiumShovel = new Object[]{UtilRecipe.shovelRecipe, charX, UtilItemStack.adamantiumIngot, charY, UtilItemStack.stickStack};
    public static final Object[] adamantiumAxe = new Object[]{UtilRecipe.axeRecipe, charX, UtilItemStack.adamantiumIngot, charY, UtilItemStack.stickStack};
    public static final Object[] adamantiumHoe = new Object[]{UtilRecipe.hoeRecipe, charX, UtilItemStack.adamantiumIngot, charY, UtilItemStack.stickStack};
    public static final Object[] adamantiumSword = new Object[]{UtilRecipe.swordRecipe, charX, UtilItemStack.adamantiumIngot, charY, UtilItemStack.stickStack};

    public static final Object[] silkPickaxe = new Object[]{UtilRecipe.pickaxeRecipe, charX, UtilItemStack.silkGem, charY, UtilItemStack.stickStack};
    public static final Object[] silkShovel = new Object[]{UtilRecipe.shovelRecipe, charX, UtilItemStack.silkGem, charY, UtilItemStack.stickStack};
    public static final Object[] silkAxe = new Object[]{UtilRecipe.axeRecipe, charX, UtilItemStack.silkGem, charY, UtilItemStack.stickStack};
    public static final Object[] silkHoe = new Object[]{UtilRecipe.hoeRecipe, charX, UtilItemStack.silkGem, charY, UtilItemStack.stickStack};
    public static final Object[] silkSword = new Object[]{UtilRecipe.swordRecipe, charX, UtilItemStack.silkGem, charY, UtilItemStack.stickStack};

    public static final Object[] redstonePickaxe = new Object[]{UtilRecipe.pickaxeRecipe, charX, UtilItemStack.redstoneCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] redstoneShovel = new Object[]{UtilRecipe.shovelRecipe, charX, UtilItemStack.redstoneCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] redstoneAxe = new Object[]{UtilRecipe.axeRecipe, charX, UtilItemStack.redstoneCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] redstoneHoe = new Object[]{UtilRecipe.hoeRecipe, charX, UtilItemStack.redstoneCrystal, charY, UtilItemStack.stickStack};
    public static final Object[] redstoneSword = new Object[]{UtilRecipe.swordRecipe, charX, UtilItemStack.redstoneCrystal, charY, UtilItemStack.stickStack};

    // Items
    public static final Object[] expBottle = new Object[]{UtilRecipe.blockRecipe, charX, UtilItemStack.expShard};

    // Armor
    public static final Object[] quartzHelmet = new Object[]{UtilRecipe.helmetRecipe, charX, UtilItemStack.quartzStack};
    public static final Object[] quartzChestplate = new Object[]{UtilRecipe.chestplateRecipe, charX, UtilItemStack.quartzStack};
    public static final Object[] quartzLeggings = new Object[]{UtilRecipe.leggingsRecipe, charX, UtilItemStack.quartzStack};
    public static final Object[] quartzBoots = new Object[]{UtilRecipe.bootsRecipe, charX, UtilItemStack.quartzStack};

    public static final Object[] obsidianHelmet = new Object[]{UtilRecipe.helmetRecipe, charX, UtilItemStack.obsidianIngot};
    public static final Object[] obsidianChestplate = new Object[]{UtilRecipe.chestplateRecipe, charX, UtilItemStack.obsidianIngot};
    public static final Object[] obsidianLeggings = new Object[]{UtilRecipe.leggingsRecipe, charX, UtilItemStack.obsidianIngot};
    public static final Object[] obsidianBoots = new Object[]{UtilRecipe.bootsRecipe, charX, UtilItemStack.obsidianIngot};

    public static final Object[] emeraldHelmet = new Object[]{UtilRecipe.helmetRecipe, charX, UtilItemStack.emeraldCrystal};
    public static final Object[] emeraldChestplate = new Object[]{UtilRecipe.chestplateRecipe, charX, UtilItemStack.emeraldCrystal};
    public static final Object[] emeraldLeggings = new Object[]{UtilRecipe.leggingsRecipe, charX, UtilItemStack.emeraldCrystal};
    public static final Object[] emeraldBoots = new Object[]{UtilRecipe.bootsRecipe, charX, UtilItemStack.emeraldCrystal};

    public static final Object[] lapisHelmet = new Object[]{UtilRecipe.helmetRecipe, charX, UtilItemStack.lapisCrystal};
    public static final Object[] lapisChestplate = new Object[]{UtilRecipe.chestplateRecipe, charX, UtilItemStack.lapisCrystal};
    public static final Object[] lapisLeggings = new Object[]{UtilRecipe.leggingsRecipe, charX, UtilItemStack.lapisCrystal};
    public static final Object[] lapisBoots = new Object[]{UtilRecipe.bootsRecipe, charX, UtilItemStack.lapisCrystal};

    public static final Object[] bronzeHelmet = new Object[]{UtilRecipe.helmetRecipe, charX, UtilItemStack.bronzeIngot};
    public static final Object[] bronzeChestplate = new Object[]{UtilRecipe.chestplateRecipe, charX, UtilItemStack.bronzeIngot};
    public static final Object[] bronzeLeggings = new Object[]{UtilRecipe.leggingsRecipe, charX, UtilItemStack.bronzeIngot};
    public static final Object[] bronzeBoots = new Object[]{UtilRecipe.bootsRecipe, charX, UtilItemStack.bronzeIngot};

    public static final Object[] coalHelmet = new Object[]{UtilRecipe.helmetRecipe, charX, UtilItemStack.coalIngot};
    public static final Object[] coalChestplate = new Object[]{UtilRecipe.chestplateRecipe, charX, UtilItemStack.coalIngot};
    public static final Object[] coalLeggings = new Object[]{UtilRecipe.leggingsRecipe, charX, UtilItemStack.coalIngot};
    public static final Object[] coalBoots = new Object[]{UtilRecipe.bootsRecipe, charX, UtilItemStack.coalIngot};

    public static final Object[] glowstoneHelmet = new Object[]{UtilRecipe.helmetRecipe, charX, UtilItemStack.glowstoneIngot};
    public static final Object[] glowstoneChestplate = new Object[]{UtilRecipe.chestplateRecipe, charX, UtilItemStack.glowstoneIngot};
    public static final Object[] glowstoneLeggings = new Object[]{UtilRecipe.leggingsRecipe, charX, UtilItemStack.glowstoneIngot};
    public static final Object[] glowstoneBoots = new Object[]{UtilRecipe.bootsRecipe, charX, UtilItemStack.glowstoneIngot};

    public static final Object[] redstoneHelmet = new Object[]{UtilRecipe.helmetRecipe, charX, UtilItemStack.redstoneCrystal};
    public static final Object[] redstoneChestplate = new Object[]{UtilRecipe.chestplateRecipe, charX, UtilItemStack.redstoneCrystal};
    public static final Object[] redstoneLeggings = new Object[]{UtilRecipe.leggingsRecipe, charX, UtilItemStack.redstoneCrystal};
    public static final Object[] redstoneBoots = new Object[]{UtilRecipe.bootsRecipe, charX, UtilItemStack.redstoneCrystal};

    // Bowa
    public static final Object[] quartzBow = new Object[]{UtilRecipe.bowRecipe, charY, UtilItemStack.quartzStack, charX, UtilItemStack.stringStack};
    public static final Object[] obsidianBow = new Object[]{UtilRecipe.bowRecipe, charY, UtilItemStack.obsidianIngot, charX, UtilItemStack.stringStack};
    public static final Object[] emeraldBow = new Object[]{UtilRecipe.bowRecipe, charY, UtilItemStack.emeraldCrystal, charX, UtilItemStack.stringStack};
    public static final Object[] lapisBow = new Object[]{UtilRecipe.bowRecipe, charY, UtilItemStack.lapisCrystal, charX, UtilItemStack.stringStack};
    public static final Object[] bronzeBow = new Object[]{UtilRecipe.bowRecipe, charY, UtilItemStack.bronzeIngot, charX, UtilItemStack.stringStack};
    public static final Object[] coalBow = new Object[]{UtilRecipe.bowRecipe, charY, UtilItemStack.coalIngot, charX, UtilItemStack.stringStack};
    public static final Object[] glowstoneBow = new Object[]{UtilRecipe.bowRecipe, charY, UtilItemStack.glowstoneIngot, charX, UtilItemStack.stringStack};
    public static final Object[] adamantiumBow = new Object[]{UtilRecipe.bowRecipe, charY, UtilItemStack.adamantiumIngot, charX, UtilItemStack.stringStack};
}
