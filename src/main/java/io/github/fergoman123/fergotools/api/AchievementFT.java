package io.github.fergoman123.fergotools.api;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;

public class AchievementFT extends Achievement
{

    public AchievementFT(String localizedName, String name, int column, int row, Item displayItem, Achievement needAchievement) {
        super("fergotools.achievement." + localizedName, name, column, row, displayItem, needAchievement);
    }

    public AchievementFT(String localizedName, String name, int column, int row, Block displayBlock, Achievement neededAchievement) {
        super("fergotools.achievement." + localizedName, name, column, row, displayBlock, neededAchievement);
    }

    public AchievementFT(String localizedName, String name, int column, int row, ItemStack displayItemStack, Achievement neededAchievement) {
        super("fergotools.achievement." + localizedName, name, column, row, displayItemStack, neededAchievement);
    }
}
