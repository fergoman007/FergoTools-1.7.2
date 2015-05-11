package io.github.fergoman123.fergotools.api.content;

import io.github.fergoman123.fergotools.config.ConfigHandler;

public enum ArmorMaterials
{
    quartz("quartz", 1000, new int[]{4, 9, 7, 3}, ConfigHandler.enchantability),
    obsidian("obsidian", 1500, new int[]{5, 10, 8, 4}, ConfigHandler.enchantability),
    emerald("emerald", 2000, new int[]{6, 11, 9, 5}, ConfigHandler.enchantability),
    lapis("lapis", 2500, new int[]{7, 10, 12, 6}, ConfigHandler.enchantability),
    bronze("bronze", 3000, new int[]{8, 11, 13, 7}, ConfigHandler.enchantability),
    coal("coal", 3500, new int[]{9, 12, 14, 8}, ConfigHandler.enchantability),
    glowstone("glowstone", 4000, new int[]{10, 13, 15, 9}, ConfigHandler.enchantability),
    redstone("redstone", 620, new int[]{2, 6, 5, 2}, ConfigHandler.enchantability),
    adamantium("adamantium", Integer.MAX_VALUE, new int[]{20, 20, 20, 20}, ConfigHandler.enchantability);

    private String name;
    private int maxDamage;
    private int[] reductAmounts;
    private int enchantability;

    private ArmorMaterials(String name, int maxDamage, int[] reductAmounts, int enchantability)
    {
        this.name = name;
        this.maxDamage = maxDamage;
        this.reductAmounts = reductAmounts;
        this.enchantability = enchantability;
    }

    public String getName() {
        return name;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int[] getReductAmounts() {
        return reductAmounts;
    }

    public int getEnchantability() {
        return enchantability;
    }
}
