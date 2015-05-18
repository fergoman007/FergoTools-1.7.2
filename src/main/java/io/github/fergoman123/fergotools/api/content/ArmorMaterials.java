package io.github.fergoman123.fergotools.api.content;

import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public enum ArmorMaterials
{
    quartz("quartz", 1000, new int[]{4, 9, 7, 3}, ConfigHandler.enchantability, Items.quartz),
    obsidian("obsidian", 1500, new int[]{5, 10, 8, 4}, ConfigHandler.enchantability, ModItems.ingotObsidian),
    emerald("emerald", 2000, new int[]{6, 11, 9, 5}, ConfigHandler.enchantability, ModItems.gemEmerald),
    lapis("lapis", 2500, new int[]{7, 10, 12, 6}, ConfigHandler.enchantability, ModItems.gemLapis),
    bronze("bronze", 3000, new int[]{8, 11, 13, 7}, ConfigHandler.enchantability, ModItems.ingotBronze),
    coal("coal", 3500, new int[]{9, 12, 14, 8}, ConfigHandler.enchantability, ModItems.ingotCoal),
    glowstone("glowstone", 4000, new int[]{10, 13, 15, 9}, ConfigHandler.enchantability, ModItems.ingotGlowstone),
    redstone("redstone", 620, new int[]{2, 6, 5, 2}, ConfigHandler.enchantability, ModItems.gemRedstone),
    adamantium("adamantium", Integer.MAX_VALUE, new int[]{20, 20, 20, 20}, ConfigHandler.enchantability, ModItems.ingotAdamantium);

    private String name;
    private int maxDamage;
    private int[] reductAmounts;
    private int enchantability;
    private Item repairItem;

    private ArmorMaterials(String name, int maxDamage, int[] reductAmounts, int enchantability, Item repairItem)
    {
        this.name = name;
        this.maxDamage = maxDamage;
        this.reductAmounts = reductAmounts;
        this.enchantability = enchantability;
        this.repairItem = repairItem;
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

    public Item getRepairItem() {
        return repairItem;
    }
}
