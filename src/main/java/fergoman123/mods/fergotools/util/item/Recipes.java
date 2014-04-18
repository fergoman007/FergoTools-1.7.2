package fergoman123.mods.fergotools.util.item;

import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class Recipes {

    public static final String[] recipePickaxe = new String[]{"xxx", " y ", " y "};
    public static final String[] recipeShovel =  new String[]{"x", "y", "y"};
    public static final String[] recipeAxe = new String[]{"xx", "xy", " y"};
    public static final String[] recipeHoe = new String[]{"xx", " y", " y"};
    public static final String[] recipeSword = new String[]{"x", "x", "y"};
    public static final String[] recipeBow = new String[]{" #X", "# X", " #X"};

    public static final String[] recipeBlock = new String[]{"xxx", "xxx", "xxx"};
    public static final String[] recipeFurnace = new String[]{"xxx", "x x", "xxx"};

    public static final String[] recipeHelmet = new String[]{"xxx", "x x"};
    public static final String[] recipeChestplate = new String[]{"x x", "xxx", "xxx"};
    public static final String[] recipeLeggings = new String[]{"xxx", "x x", "x x"};
    public static final String[] recipeBoots = new String[]{"x x", "x x"};



    public static final Object[] blockObsidian = new Object[]{recipeBlock, 'x', new ItemStack(ModItems.obsidianIngot)};
    public static final Object[] blockEmeraldCrystal = new Object[]{recipeBlock, 'x', new ItemStack(ModItems.emeraldCrystal)};
    public static final Object[] blockLapisCrystal = new Object[]{recipeBlock, 'x', new ItemStack(ModItems.lapisCrystal)};
    public static final Object[] blockBronze = new Object[]{recipeBlock, 'x', new ItemStack(ModItems.bronzeIngot)};
    public static final Object[] blockCoal = new Object[]{recipeBlock, 'x', new ItemStack(ModItems.coalIngot)};
    public static final Object[] blockGlowstone = new Object[]{recipeBlock, 'x', new ItemStack(ModItems.glowstoneIngot)};
    public static final Object[] blockAdamantium = new Object[]{recipeBlock, 'x', new ItemStack(ModItems.adamantiumIngot)};
    public static final Object[] blockExperience = new Object[]{recipeBlock, 'x', new ItemStack(Items.experience_bottle)};
    public static final Object[] blockSilkGem = new Object[]{recipeBlock, 'x', new ItemStack(ModItems.silkGem)};
    public static final Object[] blockRedstone = new Object[]{recipeBlock, 'x', new ItemStack(ModItems.redstoneCrystal)};

    public static final Object[] expBottle = new Object[]{recipeBlock, 'x', new ItemStack(ModItems.expShard)};

    public static final Object[] quartzPickaxe = new Object[]{recipePickaxe, 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)};
    public static final Object[] quartzShovel = new Object[]{recipeShovel, 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)};
    public static final Object[] quartzAxe = new Object[]{recipeAxe, 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)};
    public static final Object[] quartzHoe = new Object[]{recipeHoe, 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)};
    public static final Object[] quartzSword = new Object[]{recipeSword, 'x', new ItemStack(Items.quartz), 'y', new ItemStack(Items.stick)};

    public static final Object[] obsidianPickaxe = new Object[]{recipePickaxe, 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] obsidianShovel = new Object[]{recipeShovel, 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] obsidianAxe = new Object[]{recipeAxe, 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] obsidianHoe = new Object[]{recipeHoe, 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] obsidianSword = new Object[]{recipeSword, 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick)};

    public static final Object[] emeraldPickaxe = new Object[]{recipePickaxe, 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] emeraldShovel = new Object[]{recipeShovel, 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] emeraldAxe = new Object[]{recipeAxe, 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] emeraldHoe = new Object[]{recipeHoe, 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] emeraldSword = new Object[]{recipeSword, 'x', new ItemStack(ModItems.emeraldCrystal), 'y', new ItemStack(Items.stick)};

    public static final Object[] lapisPickaxe = new Object[]{recipePickaxe, 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] lapisShovel = new Object[]{recipeShovel, 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] lapisAxe = new Object[]{recipeAxe, 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] lapisHoe = new Object[]{recipeHoe, 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] lapisSword = new Object[]{recipeSword, 'x', new ItemStack(ModItems.lapisCrystal), 'y', new ItemStack(Items.stick)};

    public static final Object[] bronzePickaxe = new Object[]{recipePickaxe, 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] bronzeShovel = new Object[]{recipeShovel, 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] bronzeAxe = new Object[]{recipeAxe, 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] bronzeHoe = new Object[]{recipeHoe, 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] bronzeSword = new Object[]{recipeSword, 'x', new ItemStack(ModItems.bronzeIngot), 'y', new ItemStack(Items.stick)};

    public static final Object[] coalPickaxe = new Object[]{recipePickaxe, 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] coalShovel = new Object[]{recipeShovel, 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] coalAxe = new Object[]{recipeAxe, 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] coalHoe = new Object[]{recipeHoe, 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] coalSword = new Object[]{recipeSword, 'x', new ItemStack(ModItems.coalIngot), 'y', new ItemStack(Items.stick)};

    public static final Object[] glowstonePickaxe = new Object[]{recipePickaxe, 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] glowstoneShovel = new Object[]{recipeShovel, 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] glowstoneAxe = new Object[]{recipeAxe, 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] glowstoneHoe = new Object[]{recipeHoe, 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] glowstoneSword = new Object[]{recipeSword, 'x', new ItemStack(ModItems.glowstoneIngot), 'y', new ItemStack(Items.stick)};

    public static final Object[] adamantiumPickaxe = new Object[]{recipePickaxe, 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] adamantiumShovel = new Object[]{recipeShovel, 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] adamantiumAxe = new Object[]{recipeAxe, 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] adamantiumHoe = new Object[]{recipeHoe, 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)};
    public static final Object[] adamantiumSword = new Object[]{recipeSword, 'x', new ItemStack(ModItems.adamantiumIngot), 'y', new ItemStack(Items.stick)};

    public static final Object[] silkPickaxe = new Object[]{recipePickaxe, 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)};
    public static final Object[] silkShovel = new Object[]{recipeShovel, 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)};
    public static final Object[] silkAxe = new Object[]{recipeAxe, 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)};
    public static final Object[] silkHoe = new Object[]{recipeHoe, 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)};
    public static final Object[] silkSword = new Object[]{recipeSword, 'x', new ItemStack(ModItems.silkGem), 'y', new ItemStack(Items.stick)};

    public static final Object[] redstonePickaxe = new Object[]{recipePickaxe, 'x', new ItemStack(ModItems.redstoneCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] redstoneShovel = new Object[]{recipeShovel, 'x', new ItemStack(ModItems.redstoneCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] redstoneAxe = new Object[]{recipeAxe, 'x', new ItemStack(ModItems.redstoneCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] redstoneHoe = new Object[]{recipeHoe, 'x', new ItemStack(ModItems.redstoneCrystal), 'y', new ItemStack(Items.stick)};
    public static final Object[] redstoneSword = new Object[]{recipeSword, 'x', new ItemStack(ModItems.redstoneCrystal), 'y', new ItemStack(Items.stick)};

    public static final Object[] quartzFurnace = new Object[]{recipeFurnace, 'x', new ItemStack(Blocks.quartz_block, 1, 0)};
    public static final Object[] obsidianFurnace = new Object[]{recipeFurnace, 'x', new ItemStack(ModBlocks.blockObsidian)};
    public static final Object[] emeraldCrystalFurnace = new Object[]{recipeFurnace, 'x', new ItemStack(ModBlocks.blockEmeraldCrystal)};
    public static final Object[] lapisCrystalFurnace = new Object[]{recipeFurnace, 'x', new ItemStack(ModBlocks.blockEmeraldCrystal)};
    public static final Object[] bronzeFurnace = new Object[]{recipeFurnace, 'x', new ItemStack(ModBlocks.blockBronze)};
    public static final Object[] coalFurnace = new Object[]{recipeFurnace, 'x', new ItemStack(ModBlocks.blockCoal)};
    public static final Object[] glowstoneFurnace = new Object[]{recipeFurnace, 'x', new ItemStack(ModBlocks.blockGlowstone)};
    public static final Object[] adamantiumFurnace = new Object[]{recipeFurnace, 'x', new ItemStack(ModBlocks.blockAdamantium)};
    public static final Object[] redstoneFurnace = new Object[]{recipeFurnace, 'x', new ItemStack(ModBlocks.blockRedstone)};

    public static final Object[] quartzHelmet = new Object[]{recipeHelmet, 'x', Items.quartz};
    public static final Object[] quartzChestplate = new Object[]{recipeChestplate, 'x', Items.quartz};
    public static final Object[] quartzLeggings = new Object[]{recipeLeggings, 'x', Items.quartz};
    public static final Object[] quartzBoots = new Object[]{recipeBoots, 'x', Items.quartz};

    public static final Object[] obsidianHelmet = new Object[]{recipeHelmet, 'x', ModItems.obsidianIngot};
    public static final Object[] obsidianChestplate = new Object[]{recipeChestplate, 'x', ModItems.obsidianIngot};
    public static final Object[] obsidianLeggings = new Object[]{recipeLeggings, 'x', ModItems.obsidianIngot};
    public static final Object[] obsidianBoots = new Object[]{recipeBoots, 'x', ModItems.obsidianIngot};

    public static final Object[] emeraldHelmet = new Object[]{recipeHelmet, 'x', ModItems.emeraldCrystal};
    public static final Object[] emeraldChestplate = new Object[]{recipeChestplate, 'x', ModItems.emeraldCrystal};
    public static final Object[] emeraldLeggings = new Object[]{recipeHelmet, "x x", 'x', ModItems.emeraldCrystal};
    public static final Object[] emeraldBoots = new Object[]{recipeBoots, 'x', ModItems.emeraldCrystal};

    public static final Object[] lapisHelmet = new Object[]{recipeHelmet, 'x', ModItems.lapisCrystal};
    public static final Object[] lapisChestplate = new Object[]{recipeChestplate, 'x', ModItems.lapisCrystal};
    public static final Object[] lapisLeggings = new Object[]{recipeLeggings, 'x', ModItems.lapisCrystal};
    public static final Object[] lapisBoots = new Object[]{recipeBoots, 'x', ModItems.lapisCrystal};


    public static final Object[] bronzeHelmet = new Object[]{recipeHelmet, 'x', ModItems.bronzeIngot};
    public static final Object[] bronzeChestplate = new Object[]{recipeChestplate, 'x', ModItems.bronzeIngot};
    public static final Object[] bronzeLeggings = new Object[]{recipeLeggings, 'x', ModItems.bronzeIngot};
    public static final Object[] bronzeBoots = new Object[]{recipeBoots, 'x', ModItems.bronzeIngot};

    public static final Object[] coalHelmet = new Object[]{recipeHelmet, 'x', ModItems.coalIngot};
    public static final Object[] coalChestplate = new Object[]{recipeChestplate, 'x', ModItems.coalIngot};
    public static final Object[] coalLeggings = new Object[]{recipeLeggings, 'x', ModItems.coalIngot};
    public static final Object[] coalBoots1 = new Object[]{recipeBoots, 'x', ModItems.coalIngot};

    public static final Object[] glowstoneHelmet = new Object[]{recipeHelmet, 'x', ModItems.glowstoneIngot};
    public static final Object[] glowstoneChestplate = new Object[]{recipeChestplate, 'x', ModItems.glowstoneIngot};
    public static final Object[] glowstoneLeggings = new Object[]{recipeLeggings, 'x', ModItems.glowstoneIngot};
    public static final Object[] glowstoneBoots = new Object[]{recipeBoots, 'x', ModItems.glowstoneIngot};

    public static final Object[] redstoneHelmet = new Object[]{recipeHelmet, 'x', ModItems.redstoneCrystal};
    public static final Object[] redstoneChestplate = new Object[]{recipeChestplate, 'x', ModItems.redstoneCrystal};
    public static final Object[] redstoneLeggings = new Object[]{recipeLeggings, 'x', ModItems.redstoneCrystal};
    public static final Object[] redstoneBoots = new Object[]{recipeBoots, 'x', ModItems.redstoneCrystal};

    public static final Object[] quartzBow = new Object[]{recipeBow, 'X', Items.string, '#', Items.quartz};
    public static final Object[] obsidianBow =  new Object[]{recipeBow, 'X', Items.string, '#', ModItems.obsidianIngot};
    public static final Object[] emeraldBow = new Object[]{recipeBow, 'X', Items.string, '#', ModItems.emeraldCrystal};
    public static final Object[] lapisBow = new Object[]{recipeBow, 'X', Items.string, '#', ModItems.lapisCrystal};
    public static final Object[] bronzeBow = new Object[]{recipeBow, 'X', Items.string, '#', ModItems.bronzeIngot};
    public static final Object[] coalBow = new Object[]{recipeBow, 'X', Items.string, '#', ModItems.coalIngot};
    public static final Object[] glowstoneBow = new Object[]{recipeBow, 'X', Items.string, '#', ModItems.glowstoneIngot};
    public static final Object[] adamantiumBow = new Object[]{recipeBow, 'X', Items.string, '#', ModItems.adamantiumIngot};
    public static final Object[] redstoneBow = new Object[]{recipeBow, 'X', Items.string, '#', ModItems.redstoneCrystal};


}
