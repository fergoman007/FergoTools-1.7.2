package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.AchievementFT;
import io.github.fergoman123.fergotools.info.ModInfo;
import io.github.fergoman123.fergoutil.achievement.AchievementHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class ModAchievements
{
    public static AchievementPage fergoTools;
    public static Achievement oreCoal;
    public static Achievement oreIron;
    public static Achievement oreGold;
    public static Achievement oreDiamond;
    public static Achievement oreEmerald;
    public static Achievement oreLapis;
    public static Achievement oreExperience;
    public static Achievement oreObsidian;
    public static Achievement oreGemEmerald;
    public static Achievement oreGemLapis;
    public static Achievement oreBronze;
    public static Achievement oreAdamantium;
    public static Achievement oreGemRedstone;

    public static void init()
    {
        oreCoal = getAchievement("oreCoal", 0, 0, Items.coal, null);
        oreIron = getAchievement("oreIron", 1, 0, Items.iron_ingot, null);
        oreGold = getAchievement("oreGold", 2, 0, Items.gold_ingot, null);
        oreDiamond = getAchievement("oreDiamond", 3, 0, Items.diamond, null);
        oreEmerald = getAchievement("oreEmerald", 4, 0, Items.emerald, null);
        oreLapis = getAchievement("oreLapis", 5, 0, new ItemStack(Items.dye, 1, 4), null);
        oreExperience = getAchievement("oreExperience", 6, 0, ModItems.shardExp, null);
        oreObsidian = getAchievement("oreObsidian", 7, 0, ModItems.ingotObsidian, null);
        oreGemEmerald = getAchievement("oreGemEmerald", 8, 0, ModItems.gemEmerald, null);
        oreGemLapis = getAchievement("oreGemLapis", 9, 0, ModItems.gemLapis, null);
        oreBronze = getAchievement("oreBronze", 10, 0, ModItems.ingotBronze, null);
        oreAdamantium = getAchievement("oreAdamantium", 11, 0, ModItems.ingotAdamantium, null);
        oreGemRedstone = getAchievement("oreGemRedstone", 12, 0, ModItems.gemRedstone, null);

        fergoTools = AchievementHelper.getAchievementPage(ModInfo.modid.toLowerCase(), "Fergoman123's Tools", new Achievement[]{oreCoal, oreIron, oreGold, oreDiamond, oreEmerald, oreExperience, oreObsidian, oreGemEmerald, oreGemLapis, oreBronze, oreAdamantium, oreGemRedstone});
    }

    public static Achievement getAchievement(String name, int column, int row, Item displayItem, Achievement parent)
    {
        return new AchievementFT(name, name, column, row, displayItem, parent);
    }

    public static Achievement getAchievement(String name, int column, int row, Block displayBlock, Achievement parent)
    {
        return new AchievementFT(name, name, column, row, displayBlock, parent);
    }

    public static Achievement getAchievement(String name, int column, int row, ItemStack displayItemStack, Achievement parent)
    {
        return new AchievementFT(name, name, column, row, displayItemStack, parent);
    }
}
