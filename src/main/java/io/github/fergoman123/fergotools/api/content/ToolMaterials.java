package io.github.fergoman123.fergotools.api.content;

import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static java.lang.Integer.MAX_VALUE;

public enum ToolMaterials
{
    quartz("quartz", 3, 1000000, 15f, 20f, ConfigHandler.enchantability, new ItemStack(Items.quartz)),
    obsidian("obsidian", 3, 100000, 10f, 10f, ConfigHandler.enchantability, new ItemStack(ModItems.ingotObsidian)),
    emerald("emerald", 3, 10000, 8f, 5f, ConfigHandler.enchantability, new ItemStack(ModItems.gemEmerald)),
    lapis("lapis", 3, 5000, 5f, 4f, ConfigHandler.enchantability, new ItemStack(ModItems.gemLapis)),
    bronze("bronze", 3, 2500, 4f, 2f, ConfigHandler.enchantability, new ItemStack(ModItems.ingotBronze)),
    coal("coal", 3, 1900, 9f, 7f, ConfigHandler.enchantability, new ItemStack(ModItems.ingotCoal)),
    glowstone("glowstone", 3, 2000, 3.5f, 6f, ConfigHandler.enchantability, new ItemStack(ModItems.ingotGlowstone)),
    adamantium("adamantium", 3, MAX_VALUE, 20f, 1000f, ConfigHandler.enchantability, new ItemStack(ModItems.ingotAdamantium)),
    silk("silk", 3, 2500, 5f, 5f, ConfigHandler.enchantability, new ItemStack(ModItems.gemSilk)),
    redstone("redstone", 3, 750, 7.5f, 2.5f, ConfigHandler.enchantability, new ItemStack(ModItems.gemRedstone)),
    donator("donator", 3, 20000, 10f, 10f, ConfigHandler.enchantability, new ItemStack(Items.diamond));

    private static final ToolMaterials[] TYPES = new ToolMaterials[values().length];

    private String name;
    private int harvestLevel;
    private int maxDamage;
    private float efficiency;
    private float damageVsEntity;
    private int enchantability;
    private ItemStack repairItemStack;

    private ToolMaterials(String name, int harvestLevel, int maxDamage, float efficiency, float damageVsEntity, int enchantability, ItemStack repairItemStack)
    {
        this.name = name;
        this.harvestLevel = harvestLevel;
        this.maxDamage = maxDamage;
        this.efficiency = efficiency;
        this.damageVsEntity = damageVsEntity;
        this.enchantability = enchantability;
        this.repairItemStack = repairItemStack;
    }

    public String getName() {
        return name;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public float getEfficiency() {
        return efficiency;
    }

    public float getDamageVsEntity() {
        return damageVsEntity;
    }

    public int getEnchantability() {
        return enchantability;
    }

    public ItemStack getRepairItemStack() {
        return repairItemStack;
    }

    public ToolMaterials[] getMaterials()
    {
        return TYPES;
    }
}
