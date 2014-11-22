package io.github.fergoman123.fergotools.recipes;

import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.crafting.ow.CraftingManagerOW;
import io.github.fergoman123.fergotools.util.item.FTStacks;
import io.github.fergoman123.fergotools.util.item.RecipeList;
import net.minecraft.block.BlockColored;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Fergoman123.
 */
public class ObsidianWorkbenchRecipes
{
    private static final String[] pickaxeRecipe = {"XXX", " # ", " # "};
    private static final String[] shovelRecipe = {"X", "#", "#"};
    private static final String[] axeRecipe = {"XX", "X#", " #"};
    private static final String[] hoeRecipe = {"XX", " #", " #"};
    private static final String[] swordRecipe = {"X", "X", "#"};

    private static final String[] helmetRecipe = {"XXX", "X X"};
    private static final String[] chestplateRecipe = {"X X", "XXX", "XXX"};
    private static final String[] leggingsRecipe = {"XXX", "X X", "X X"};
    private static final String[] bootsRecipe = {"X X", "X X"};

    private static final String[] blockRecipe = {"###", "###", "###"};

    public static void initRecipes()
    {
        // vanilla
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.wooden_pickaxe), new Object[]{pickaxeRecipe, 'X', Blocks.planks, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.stone_pickaxe), new Object[]{pickaxeRecipe, 'X', Blocks.cobblestone, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.iron_pickaxe), new Object[]{pickaxeRecipe, 'X', Items.iron_ingot, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.diamond_pickaxe), new Object[]{pickaxeRecipe, 'X', Items.diamond, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_pickaxe), new Object[]{pickaxeRecipe, 'X', Items.gold_ingot, '#', Items.stick});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.wooden_shovel), new Object[]{shovelRecipe, 'X', Blocks.planks, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.stone_shovel), new Object[]{shovelRecipe, 'X', Blocks.cobblestone, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.iron_shovel), new Object[]{shovelRecipe, 'X', Items.iron_ingot, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.diamond_shovel), new Object[]{shovelRecipe, 'X', Items.diamond, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_shovel), new Object[]{shovelRecipe, 'X', Items.gold_ingot, '#', Items.stick});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.wooden_axe), new Object[]{axeRecipe, 'X', Blocks.planks, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.stone_axe), new Object[]{axeRecipe, 'X', Blocks.cobblestone, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.iron_axe), new Object[]{axeRecipe, 'X', Items.iron_ingot, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.diamond_axe), new Object[]{axeRecipe, 'X', Items.diamond, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_axe), new Object[]{axeRecipe, 'X', Items.gold_ingot, '#', Items.stick});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.wooden_hoe), new Object[]{hoeRecipe, 'X', Blocks.planks, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.stone_hoe), new Object[]{hoeRecipe, 'X', Blocks.cobblestone, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.iron_hoe), new Object[]{hoeRecipe, 'X', Items.iron_ingot, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.diamond_hoe), new Object[]{hoeRecipe, 'X', Items.diamond, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_hoe), new Object[]{hoeRecipe, 'X', Items.gold_ingot, '#', Items.stick});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.wooden_sword), new Object[]{swordRecipe, 'X', Blocks.planks, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.stone_sword), new Object[]{swordRecipe, 'X', Blocks.cobblestone, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.iron_sword), new Object[]{swordRecipe, 'X', Items.iron_ingot, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.diamond_sword), new Object[]{swordRecipe, 'X', Items.diamond, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_sword), new Object[]{swordRecipe, 'X', Items.gold_ingot, '#', Items.stick});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.iron_block), new Object[]{blockRecipe, '#', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.gold_block), new Object[]{blockRecipe, '#', Items.gold_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.diamond_block), new Object[]{blockRecipe, '#', Items.diamond});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.lapis_block), new Object[]{blockRecipe, '#', new ItemStack(Items.dye, 1, 4)});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.gold_ingot), new Object[]{blockRecipe, '#', Items.gold_nugget});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.gold_nugget, 9), new Object[]{"#", '#', Items.gold_ingot});

        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.mushroom_stew), new Object[]{Blocks.brown_mushroom, Blocks.red_mushroom, Items.bowl});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.cookie, 8), new Object[]{"#X#", 'X', new ItemStack(Items.dye, 1, 3), '#', Items.wheat});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.melon_block), new Object[]{"MMM", "MMM", "MMM", 'M', Items.melon});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.melon_seeds), new Object[]{"M", 'M', Items.melon});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.pumpkin_seeds), new Object[]{"M", 'M', Blocks.pumpkin});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.pumpkin_pie), new Object[]{Blocks.pumpkin, Items.sugar, Items.egg});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.fermented_spider_eye), new Object[]{Items.spider_eye, Blocks.brown_mushroom, Items.sugar});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.blaze_powder, 2), new Object[]{Items.blaze_rod});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.magma_cream), new Object[]{Items.blaze_powder, Items.slime_ball});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.iron_ingot, 9), new Object[]{"#", '#', Blocks.iron_block});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.gold_ingot, 9), new Object[]{"#", '#', Blocks.gold_block});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.diamond, 9), new Object[]{"#", '#', Blocks.diamond_block});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.dye, 9, 4), new Object[]{"#", '#', Blocks.lapis_block});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.chest), new Object[]{"###", "# #", "###", '#', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.trapped_chest), new Object[]{"#-", '#', Blocks.chest, '-', Blocks.tripwire_hook});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.ender_chest), new Object[]{"###", "#E#", "###", '#', Blocks.obsidian, 'E', Items.ender_eye});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.furnace), new Object[]{"###", "# #", "###", '#', Blocks.cobblestone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.crafting_table), new Object[]{"##", "##", '#', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.sandstone), new Object[]{"##", "##", '#', new ItemStack(Blocks.sand, 1, 0)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.sandstone, 4, 2), new Object[]{"##", "##", '#', Blocks.sandstone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.sandstone, 1, 1), new Object[]{"#", "#", '#', new ItemStack(Blocks.stone_slab, 1, 1)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.quartz_block, 1, 1), new Object[]{"#", "#", '#', new ItemStack(Blocks.stone_slab, 1, 7)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.quartz_block, 2, 2), new Object[]{"#", "#", '#', new ItemStack(Blocks.quartz_block, 1, 0)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stonebrick, 4), new Object[]{"##", "##", '#', Blocks.stone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.iron_bars, 16), new Object[]{"###", "###", '#', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.glass_pane, 16), new Object[]{"###", "###", '#', Blocks.glass});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.redstone_lamp, 1), new Object[]{" R ", "RGR", " R ", 'R', Items.redstone, 'G', Blocks.glowstone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.beacon, 1), new Object[]{"GGG", "GSG", "OOO", 'G', Blocks.glass, 'S', Items.nether_star, 'O', Blocks.obsidian});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.nether_brick, 1), new Object[]{"NN", "NN", 'N', Items.netherbrick});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.leather_helmet), new Object[]{helmetRecipe, 'X', Items.leather});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.chainmail_helmet), new Object[]{helmetRecipe, 'X', Blocks.fire});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.iron_helmet), new Object[]{helmetRecipe, 'X', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.diamond_helmet), new Object[]{helmetRecipe, 'X', Items.diamond});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_helmet), new Object[]{helmetRecipe, 'X', Items.gold_ingot});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.leather_chestplate), new Object[]{chestplateRecipe, 'X', Items.leather});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.chainmail_chestplate), new Object[]{chestplateRecipe, 'X', Blocks.fire});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.iron_chestplate), new Object[]{chestplateRecipe, 'X', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.diamond_chestplate), new Object[]{chestplateRecipe, 'X', Items.diamond});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_chestplate), new Object[]{chestplateRecipe, 'X', Items.gold_ingot});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.leather_leggings), new Object[]{leggingsRecipe, 'X', Items.leather});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.chainmail_leggings), new Object[]{leggingsRecipe, 'X', Blocks.fire});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.iron_leggings), new Object[]{leggingsRecipe, 'X', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.diamond_leggings), new Object[]{leggingsRecipe, 'X', Items.diamond});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_leggings), new Object[]{leggingsRecipe, 'X', Items.gold_ingot});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.leather_boots), new Object[]{bootsRecipe, 'X', Items.leather});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.chainmail_boots), new Object[]{bootsRecipe, 'X', Blocks.fire});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.iron_boots), new Object[]{bootsRecipe, 'X', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.diamond_boots), new Object[]{bootsRecipe, 'X', Items.diamond});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_boots), new Object[]{bootsRecipe, 'X', Items.gold_ingot});

        for (int i = 0; i < 16; i++) {
            CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Blocks.wool, 1, BlockColored.func_150031_c(i)), new Object[] {new ItemStack(Items.dye, 1, i), new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 0)});
            CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stained_hardened_clay, 8, BlockColored.func_150031_c(i)), new Object[] {"###", "#X#", "###", '#', new ItemStack(Blocks.hardened_clay), 'X', new ItemStack(Items.dye, 1, i)});
            CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stained_glass, 8, BlockColored.func_150031_c(i)), new Object[] {"###", "#X#", "###", '#', new ItemStack(Blocks.glass), 'X', new ItemStack(Items.dye, 1, i)});
            CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stained_glass_pane, 16, i), new Object[] {"###", "###", '#', new ItemStack(Blocks.stained_glass, 1, i)});
            CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.carpet, 3, i), new Object[] {"##", '#', new ItemStack(Blocks.wool, 1, i)});
        }

        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 1, 11), new Object[] {new ItemStack(Blocks.yellow_flower, 1, 0)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 1, 1), new Object[] {new ItemStack(Blocks.red_flower, 1, 0)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 3, 15), new Object[] {Items.bone});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new Object[] {new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 15)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 14), new Object[] {new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 11)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 10), new Object[] {new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 15)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 8), new Object[] {new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 15)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 7), new Object[] {new ItemStack(Items.dye, 1, 8), new ItemStack(Items.dye, 1, 15)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 3, 7), new Object[] {new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 15), new ItemStack(Items.dye, 1, 15)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 12), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 15)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 6), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 2)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 5), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 13), new Object[] {new ItemStack(Items.dye, 1, 5), new ItemStack(Items.dye, 1, 9)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 3, 13), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 9)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 4, 13), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 15)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 1, 12), new Object[] {new ItemStack(Blocks.red_flower, 1, 1)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 1, 13), new Object[] {new ItemStack(Blocks.red_flower, 1, 2)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 1, 7), new Object[] {new ItemStack(Blocks.red_flower, 1, 3)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 1, 1), new Object[] {new ItemStack(Blocks.red_flower, 1, 4)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 1, 14), new Object[] {new ItemStack(Blocks.red_flower, 1, 5)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 1, 7), new Object[] {new ItemStack(Blocks.red_flower, 1, 6)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 1, 9), new Object[] {new ItemStack(Blocks.red_flower, 1, 7)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 1, 7), new Object[] {new ItemStack(Blocks.red_flower, 1, 8)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 11), new Object[] {new ItemStack(Blocks.double_plant, 1, 0)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 13), new Object[] {new ItemStack(Blocks.double_plant, 1, 1)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 1), new Object[] {new ItemStack(Blocks.double_plant, 1, 4)});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new Object[] {new ItemStack(Blocks.double_plant, 1, 5)});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.paper, 3), new Object[]{"###", '#', Items.reeds});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.book, 1), new Object[]{Items.paper, Items.paper, Items.paper, Items.leather});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.writable_book, 1), new Object[]{Items.book, new ItemStack(Items.dye, 1, 0), Items.feather});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.fence, 2), new Object[]{"###", "###", '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.cobblestone_wall, 6, 0), new Object[]{"###", "###", '#', Blocks.cobblestone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.cobblestone_wall, 6, 1), new Object[]{"###", "###", '#', Blocks.mossy_cobblestone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.nether_brick_fence, 6), new Object[]{"###", "###", '#', Blocks.nether_brick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.fence_gate, 1), new Object[]{"#W#", "#W#", '#', Items.stick, 'W', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.jukebox, 1), new Object[]{"###", "#X#", "###", '#', Blocks.planks, 'X', Items.diamond});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.lead, 2), new Object[]{"~~ ", "~O ", "  ~", '~', Items.string, 'O', Items.slime_ball});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.noteblock, 1), new Object[]{"###", "#X#", "###", '#', Blocks.planks, 'X', Items.redstone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.bookshelf, 1), new Object[]{"###", "XXX", "###", '#', Blocks.planks, 'X', Items.book});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.snow, 1), new Object[]{"##", "##", '#', Items.snowball});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.snow_layer, 6), new Object[]{"###", '#', Blocks.snow});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.clay, 1), new Object[]{"##", "##", '#', Items.clay_ball});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.brick_block, 1), new Object[]{"##", "##", '#', Items.brick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.glowstone, 1), new Object[]{"##", "##", '#', Items.glowstone_dust});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.quartz_block, 1), new Object[]{"##", "##", '#', Items.quartz});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{"##", "##", '#', Items.string});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.tnt, 1), new Object[]{"X#X", "#X#", "X#X", 'X', Items.gunpowder, '#', Blocks.sand});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stone_slab, 6, 3), new Object[]{"###", '#', Blocks.cobblestone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stone_slab, 6, 0), new Object[]{"###", '#', Blocks.stone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stone_slab, 6, 1), new Object[]{"###", '#', Blocks.sandstone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stone_slab, 6, 4), new Object[]{"###", '#', Blocks.brick_block});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stone_slab, 6, 5), new Object[]{"###", '#', Blocks.stonebrick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stone_slab, 6, 6), new Object[]{"###", '#', Blocks.nether_brick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stone_slab, 6, 7), new Object[]{"###", '#', Blocks.quartz_block});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.wooden_slab, 6, 0), new Object[]{"###", '#', new ItemStack(Blocks.planks, 1, 0)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.wooden_slab, 6, 2), new Object[]{"###", '#', new ItemStack(Blocks.planks, 1, 2)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.wooden_slab, 6, 1), new Object[]{"###", '#', new ItemStack(Blocks.planks, 1, 1)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.wooden_slab, 6, 3), new Object[]{"###", '#', new ItemStack(Blocks.planks, 1, 3)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.wooden_slab, 6, 4), new Object[]{"###", '#', new ItemStack(Blocks.planks, 1, 4)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.wooden_slab, 6, 5), new Object[]{"###", '#', new ItemStack(Blocks.planks, 1, 5)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.ladder, 3), new Object[]{"# #", "###", "# #", '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.wooden_door, 1), new Object[]{"##", "##", "##", '#', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.trapdoor, 2), new Object[]{"###", "###", '#', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.iron_door, 1), new Object[]{"##", "##", "##", '#', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.sign, 3), new Object[]{"###", "###", " X ", '#', Blocks.planks, 'X', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.cake, 1), new Object[]{"AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.sugar, 'C', Items.wheat, 'E', Items.egg});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.sugar, 1), new Object[]{"#", '#', Items.reeds});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.planks, 4, 0), new Object[]{"#", '#', new ItemStack(Blocks.log, 1, 0)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.planks, 4, 1), new Object[]{"#", '#', new ItemStack(Blocks.log, 1, 1)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.planks, 4, 2), new Object[]{"#", '#', new ItemStack(Blocks.log, 1, 2)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.planks, 4, 3), new Object[]{"#", '#', new ItemStack(Blocks.log, 1, 3)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.planks, 4, 4), new Object[]{"#", '#', new ItemStack(Blocks.log2, 1, 0)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.planks, 4, 5), new Object[]{"#", '#', new ItemStack(Blocks.log2, 1, 1)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.stick, 4), new Object[]{"#", "#", '#', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.torch, 4), new Object[]{"X", "#", 'X', Items.coal, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.torch, 4), new Object[]{"X", "#", 'X', new ItemStack(Items.coal, 1, 1), '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.bowl, 4), new Object[]{"# #", " # ", '#', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.glass_bottle, 3), new Object[]{"# #", " # ", '#', Blocks.glass});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.rail, 16), new Object[]{"X X", "X#X", "X X", 'X', Items.iron_ingot, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.golden_rail, 6), new Object[]{"X X", "X#X", "XRX", 'X', Items.gold_ingot, 'R', Items.redstone, '#', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.activator_rail, 6), new Object[]{"XSX", "X#X", "XSX", 'X', Items.iron_ingot, '#', Blocks.redstone_torch, 'S', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.detector_rail, 6), new Object[]{"X X", "X#X", "XRX", 'X', Items.iron_ingot, 'R', Items.redstone, '#', Blocks.stone_pressure_plate});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.minecart, 1), new Object[]{"# #", "###", '#', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.cauldron, 1), new Object[]{"# #", "# #", "###", '#', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.brewing_stand, 1), new Object[]{" B ", "###", '#', Blocks.cobblestone, 'B', Items.blaze_rod});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.lit_pumpkin, 1), new Object[]{"A", "B", 'A', Blocks.pumpkin, 'B', Blocks.torch});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.chest_minecart, 1), new Object[]{"A", "B", 'A', Blocks.chest, 'B', Items.minecart});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.furnace_minecart, 1), new Object[]{"A", "B", 'A', Blocks.furnace, 'B', Items.minecart});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.tnt_minecart, 1), new Object[]{"A", "B", 'A', Blocks.tnt, 'B', Items.minecart});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.hopper_minecart, 1), new Object[]{"A", "B", 'A', Blocks.hopper, 'B', Items.minecart});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.boat, 1), new Object[]{"# #", "###", '#', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.bucket, 1), new Object[]{"# #", " # ", '#', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.flower_pot, 1), new Object[]{"# #", " # ", '#', Items.brick});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.flint_and_steel, 1), new Object[]{new ItemStack(Items.iron_ingot, 1), new ItemStack(Items.flint, 1)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.bread, 1), new Object[]{"###", '#', Items.wheat});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.oak_stairs, 4), new Object[]{"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 0)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.birch_stairs, 4), new Object[]{"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 2)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.spruce_stairs, 4), new Object[]{"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 1)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.jungle_stairs, 4), new Object[]{"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 3)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.acacia_stairs, 4), new Object[]{"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 4)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.dark_oak_stairs, 4), new Object[]{"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 5)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.fishing_rod, 1), new Object[]{"  #", " #X", "# X", '#', Items.stick, 'X', Items.string});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.carrot_on_a_stick, 1), new Object[]{"# ", " X", '#', Items.fishing_rod, 'X', Items.carrot}).func_92100_c();
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stone_stairs, 4), new Object[]{"#  ", "## ", "###", '#', Blocks.cobblestone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.brick_stairs, 4), new Object[]{"#  ", "## ", "###", '#', Blocks.brick_block});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stone_brick_stairs, 4), new Object[]{"#  ", "## ", "###", '#', Blocks.stonebrick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.nether_brick_stairs, 4), new Object[]{"#  ", "## ", "###", '#', Blocks.nether_brick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.sandstone_stairs, 4), new Object[]{"#  ", "## ", "###", '#', Blocks.sandstone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.quartz_stairs, 4), new Object[]{"#  ", "## ", "###", '#', Blocks.quartz_block});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.painting, 1), new Object[]{"###", "#X#", "###", '#', Items.stick, 'X', Blocks.wool});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.item_frame, 1), new Object[]{"###", "#X#", "###", '#', Items.stick, 'X', Items.leather});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_apple, 1, 0), new Object[]{"###", "#X#", "###", '#', Items.gold_ingot, 'X', Items.apple});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_apple, 1, 1), new Object[]{"###", "#X#", "###", '#', Blocks.gold_block, 'X', Items.apple});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.golden_carrot, 1, 0), new Object[]{"###", "#X#", "###", '#', Items.gold_nugget, 'X', Items.carrot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.speckled_melon, 1), new Object[]{"###", "#X#", "###", '#', Items.gold_nugget, 'X', Items.melon});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.lever, 1), new Object[]{"X", "#", '#', Blocks.cobblestone, 'X', Items.stick});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.tripwire_hook, 2), new Object[]{"I", "S", "#", '#', Blocks.planks, 'S', Items.stick, 'I', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.redstone_torch, 1), new Object[]{"X", "#", '#', Items.stick, 'X', Items.redstone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.repeater, 1), new Object[]{"#X#", "III", '#', Blocks.redstone_torch, 'X', Items.redstone, 'I', Blocks.stone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.comparator, 1), new Object[]{" # ", "#X#", "III", '#', Blocks.redstone_torch, 'X', Items.quartz, 'I', Blocks.stone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.clock, 1), new Object[]{" # ", "#X#", " # ", '#', Items.gold_ingot, 'X', Items.redstone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.compass, 1), new Object[]{" # ", "#X#", " # ", '#', Items.iron_ingot, 'X', Items.redstone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.map, 1), new Object[]{"###", "#X#", "###", '#', Items.paper, 'X', Items.compass});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stone_button, 1), new Object[]{"#", '#', Blocks.stone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.wooden_button, 1), new Object[]{"#", '#', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.stone_pressure_plate, 1), new Object[]{"##", '#', Blocks.stone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.wooden_pressure_plate, 1), new Object[]{"##", '#', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.heavy_weighted_pressure_plate, 1), new Object[]{"##", '#', Items.iron_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.light_weighted_pressure_plate, 1), new Object[]{"##", '#', Items.gold_ingot});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.dispenser, 1), new Object[]{"###", "#X#", "#R#", '#', Blocks.cobblestone, 'X', Items.bow, 'R', Items.redstone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.dropper, 1), new Object[]{"###", "# #", "#R#", '#', Blocks.cobblestone, 'R', Items.redstone});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.piston, 1), new Object[]{"TTT", "#X#", "#R#", '#', Blocks.cobblestone, 'X', Items.iron_ingot, 'R', Items.redstone, 'T', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.sticky_piston, 1), new Object[]{"S", "P", 'S', Items.slime_ball, 'P', Blocks.piston});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Items.bed, 1), new Object[]{"###", "XXX", '#', Blocks.wool, 'X', Blocks.planks});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.enchanting_table, 1), new Object[]{" B ", "D#D", "###", '#', Blocks.obsidian, 'B', Items.book, 'D', Items.diamond});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.anvil, 1), new Object[]{"III", " i ", "iii", 'I', Blocks.iron_block, 'i', Items.iron_ingot});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.ender_eye, 1), new Object[]{Items.ender_pearl, Items.blaze_powder});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.fire_charge, 3), new Object[]{Items.gunpowder, Items.blaze_powder, Items.coal});
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(Items.fire_charge, 3), new Object[]{Items.gunpowder, Items.blaze_powder, new ItemStack(Items.coal, 1, 1)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.daylight_detector), new Object[]{"GGG", "QQQ", "WWW", 'G', Blocks.glass, 'Q', Items.quartz, 'W', Blocks.wooden_slab});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(Blocks.hopper), new Object[]{"I I", "ICI", " I ", 'I', Items.iron_ingot, 'C', Blocks.chest});

        // mod
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.ingotObsidian, 9), new ItemStack(FTContent.blockObsidian));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.gemEmerald, 9), new ItemStack(FTContent.blockEmerald));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.gemLapis, 9), new ItemStack(FTContent.blockLapis));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.ingotBronze, 9), new ItemStack(FTContent.blockBronze));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.ingotAdamantium, 9), new ItemStack(FTContent.blockAdamantium));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.ingotCoal, 9), new ItemStack(FTContent.blockCoal));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.ingotGlowstone, 9), new ItemStack(FTContent.blockGlowstone));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.shardExp, 9), new ItemStack(FTContent.blockExperience));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.gemSilk, 9), new ItemStack(FTContent.blockSilkGem));

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.gemSilk), RecipeList.silkGem);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.expCollector), RecipeList.expCollector);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.staffExp, 1, 0), new Object[]{" y", "x ", 'x', Items.stick, 'y', FTContent.expCollector});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.staffExp, 1, 1), new Object[]{"xxx", "xyx", "xxx", 'x', FTContent.expCollector, 'y', new ItemStack(FTContent.staffExp, 1, 0)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.staffExp, 1, 2), new Object[]{"xxx", "xyx", "xxx", 'x', FTContent.expCollector, 'y', new ItemStack(FTContent.staffExp, 1, 1)});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockObsidian), RecipeList.blockObsidian);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockEmerald), RecipeList.blockEmeraldCrystal);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockLapis), RecipeList.blockLapisCrystal);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockBronze), RecipeList.blockBronze);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockCoal), RecipeList.blockCoal);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockGlowstone), RecipeList.blockGlowstone);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockAdamantium), RecipeList.blockAdamantium);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockExperience), RecipeList.blockExperience);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockSilkGem), RecipeList.blockSilkGem);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockRedstone), RecipeList.blockRedstone);

        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.ingotObsidian), new ItemStack(FTContent.blockObsidian));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.gemEmerald, 9), new ItemStack(FTContent.blockEmerald));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.gemLapis, 9), new ItemStack(FTContent.blockLapis));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.ingotBronze, 9), new ItemStack(FTContent.blockBronze));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.ingotAdamantium, 9), new ItemStack(FTContent.blockAdamantium));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.ingotCoal, 9), new ItemStack(FTContent.blockCoal));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.ingotGlowstone, 9), new ItemStack(FTContent.blockGlowstone));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.shardExp, 9), new ItemStack(FTContent.blockExperience));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.gemSilk, 9), new ItemStack(FTContent.blockSilkGem));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.expCollector, 9), new ItemStack(FTContent.blockExpCollector));

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.gemSilk), new Object[]{" x ", "xyx", " x ", 'x', Items.diamond, 'y', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE)});
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.expCollector, 32), new Object[]{"xxx", "xyx", "xxx", 'x', FTContent.shardExp, 'y', Items.diamond});

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockObsidian), RecipeList.blockObsidian);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockEmerald), RecipeList.blockEmeraldCrystal);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockLapis), RecipeList.blockLapisCrystal);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockBronze), RecipeList.blockBronze);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockCoal), RecipeList.blockCoal);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockGlowstone), RecipeList.blockGlowstone);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockAdamantium), RecipeList.blockAdamantium);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockExperience), RecipeList.blockExperience);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockSilkGem), RecipeList.blockSilkGem);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.blockRedstone), RecipeList.blockRedstone);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzPickaxe, RecipeList.quartzPickaxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzShovel, RecipeList.quartzShovel);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzAxe, RecipeList.quartzAxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzHoe, RecipeList.quartzHoe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzSword, RecipeList.quartzSword);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzPickaxe, RecipeList.quartzPickaxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzShovel, RecipeList.quartzShovel);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzAxe, RecipeList.quartzAxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzHoe, RecipeList.quartzHoe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzSword, RecipeList.quartzSword);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.obsidianPickaxe, RecipeList.obsidianPickaxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.obsidianShovel, RecipeList.obsidianShovel);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.obsidianAxe, RecipeList.obsidianAxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.obsidianHoe, RecipeList.obsidianHoe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.obsidianSword, RecipeList.obsidianSword);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.emeraldPickaxe, RecipeList.emeraldPickaxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.emeraldShovel, RecipeList.emeraldShovel);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.emeraldAxe, RecipeList.emeraldAxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.emeraldHoe, RecipeList.emeraldHoe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.emeraldSword, RecipeList.emeraldSword);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.lapisPickaxe, RecipeList.lapisPickaxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.lapisShovel, RecipeList.lapisShovel);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.lapisAxe, RecipeList.lapisAxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.lapisHoe, RecipeList.lapisHoe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.lapisSword, RecipeList.lapisSword);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.bronzePickaxe, RecipeList.bronzePickaxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.bronzeShovel, RecipeList.bronzeShovel);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.bronzeAxe, RecipeList.bronzeAxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.bronzeHoe, RecipeList.bronzeHoe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.bronzeSword, RecipeList.bronzeSword);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.coalPickaxe, RecipeList.coalPickaxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.coalShovel, RecipeList.coalShovel);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.coalAxe, RecipeList.coalAxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.coalHoe, RecipeList.coalHoe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.coalSword, RecipeList.coalSword);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumPickaxe, RecipeList.adamantiumPickaxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumShovel, RecipeList.adamantiumShovel);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumAxe, RecipeList.adamantiumAxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumHoe, RecipeList.adamantiumHoe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumSword, RecipeList.adamantiumSword);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.glowstonePickaxe, RecipeList.glowstonePickaxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.glowstoneShovel, RecipeList.glowstoneShovel);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.glowstoneAxe, RecipeList.glowstoneAxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.glowstoneHoe, RecipeList.glowstoneHoe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.glowstoneSword, RecipeList.glowstoneSword);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.silkPickaxe, RecipeList.silkPickaxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.silkShovel, RecipeList.silkShovel);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.silkAxe, RecipeList.silkAxe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.silkHoe, RecipeList.silkHoe);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.silkSword, RecipeList.silkSword);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzFurnaceIdle, RecipeList.quartzFurnace);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.obsidianFurnaceIdle, RecipeList.obsidianFurnace);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.emeraldCrystalFurnaceIdle, RecipeList.emeraldCrystalFurnace);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.lapisCrystalFurnaceIdle, RecipeList.lapisCrystalFurnace);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.bronzeFurnaceIdle, RecipeList.bronzeFurnace);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumFurnaceIdle, RecipeList.adamantiumFurnace);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.coalFurnaceIdle, RecipeList.coalFurnace);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.glowstoneFurnaceIdle, RecipeList.glowstoneFurnace);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumFurnaceIdle, RecipeList.adamantiumFurnace);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.silkFurnaceIdle, RecipeList.silkFurnace);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.redstoneFurnaceIdle, RecipeList.redstoneFurnace);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.maceratorIdle, RecipeList.macerator);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzHelmet, RecipeList.quartzHelmet);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzChestplate, RecipeList.quartzChestplate);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzLeggings, RecipeList.quartzLeggings);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzBoots, RecipeList.quartzBoots);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.obsidianHelmet, RecipeList.obsidianHelmet);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.obsidianChestplate, RecipeList.obsidianChestplate);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.obsidianLeggings, RecipeList.obsidianLeggings);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.obsidianBoots, RecipeList.obsidianBoots);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.emeraldHelmet, RecipeList.emeraldHelmet);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.emeraldChestplate, RecipeList.emeraldChestplate);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.emeraldLeggings, RecipeList.emeraldLeggings);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.emeraldBoots, RecipeList.emeraldBoots);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.lapisHelmet, RecipeList.lapisHelmet);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.lapisChestplate, RecipeList.lapisChestplate);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.lapisLeggings, RecipeList.lapisLeggings);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.lapisBoots, RecipeList.lapisBoots);


        CraftingManagerOW.getInstance().addRecipe(FTStacks.bronzeHelmet, RecipeList.bronzeHelmet);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.bronzeChestplate, RecipeList.bronzeChestplate);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.bronzeLeggings, RecipeList.bronzeLeggings);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.bronzeBoots, RecipeList.bronzeBoots);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.coalHelmet, RecipeList.coalHelmet);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.coalChestplate, RecipeList.coalChestplate);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.coalLeggings, RecipeList.coalLeggings);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.coalBoots, RecipeList.coalBoots);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.glowstoneHelmet, RecipeList.glowstoneHelmet);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.glowstoneChestplate, RecipeList.glowstoneChestplate);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.glowstoneLeggings, RecipeList.glowstoneLeggings);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.glowstoneBoots, RecipeList.glowstoneBoots);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.redstoneHelmet, RecipeList.redstoneHelmet);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.redstoneChestplate, RecipeList.redstoneChestplate);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.redstoneLeggings, RecipeList.redstoneLeggings);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.redstoneBoots, RecipeList.redstoneBoots);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumHelmet, RecipeList.adamantiumHelmet);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumChestplate, RecipeList.adamantiumChestplate);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumLeggings, RecipeList.adamantiumLeggings);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumBoots, RecipeList.adamantiumBoots);

        CraftingManagerOW.getInstance().addRecipe(FTStacks.quartzBow, RecipeList.quartzBow);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.obsidianBow, RecipeList.obsidianBow);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.emeraldBow, RecipeList.emeraldBow);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.lapisBow, RecipeList.lapisBow);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.bronzeBow, RecipeList.bronzeBow);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.coalBow, RecipeList.coalBow);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.glowstoneBow, RecipeList.glowstoneBow);
        CraftingManagerOW.getInstance().addRecipe(FTStacks.adamantiumBow, RecipeList.adamantiumBow);

        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.plankObsidian, 4), new ItemStack(FTContent.logObsidian));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.plankEmerald, 4), new ItemStack(FTContent.logEmerald));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.plankLapis, 4), new ItemStack(FTContent.logLapis));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.plankBronze, 4), new ItemStack(FTContent.logBronze));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.plankCoal, 4), new ItemStack(FTContent.logCoal));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.plankGlowstone, 4), new ItemStack(FTContent.logGlowstone));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.plankAdamantium, 4), new ItemStack(FTContent.logAdamantium));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.plankSilk, 4), new ItemStack(FTContent.logSilk));
        CraftingManagerOW.getInstance().addShapelessRecipe(new ItemStack(FTContent.plankRedstone, 4), new ItemStack(FTContent.logRedstone));

        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.obsidianWorkbench), RecipeList.obsidianWorkbench);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.emeraldWorkbench), RecipeList.emeraldWorkbench);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.lapisWorkbench), RecipeList.lapisWorkbench);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.bronzeWorkbench), RecipeList.bronzeWorkbench);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.coalWorkbench), RecipeList.coalWorkbench);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.glowstoneWorkbench), RecipeList.glowstoneWorkbench);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.adamantiumWorkbench), RecipeList.adamantiumWorkbench);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.silkWorkbench), RecipeList.silkWorkbench);
        CraftingManagerOW.getInstance().addRecipe(new ItemStack(FTContent.redstoneWorkbench), RecipeList.redstoneWorkbench);
    }
}
