package io.github.fergoman123.fergotools.material;

import io.github.fergoman123.fergotools.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import static net.minecraft.item.Item.ToolMaterial;

public class ToolMaterials {

    public static final ToolMaterial quartz = addToolMaterial("quartz", 3, 1000000, 15f, 20f, 30, new ItemStack(Items.quartz));
    public static final ToolMaterial obsidian = addToolMaterial("obsidian", 3, 100000, 10f, 10f, 30, new ItemStack(ModItems.ingotObsidian));
    public static final ToolMaterial emerald = addToolMaterial("emerald", 3, 10000, 8f, 5f, 30, new ItemStack(ModItems.gemEmerald));
    public static final ToolMaterial lapis = addToolMaterial("lapis", 3, 5000, 5f, 4f, 30, new ItemStack(ModItems.gemLapis));
    public static final ToolMaterial bronze = addToolMaterial("bronze", 3, 2500, 4f, 2f, 30, new ItemStack(ModItems.ingotBronze));
    public static final ToolMaterial coal = addToolMaterial("coal", 3, 1900, 9f, 7f, 30, new ItemStack(ModItems.ingotCoal));
    public static final ToolMaterial glowstone = addToolMaterial("glowstone", 3, 2000, 3.5f, 6f, 30, new ItemStack(ModItems.ingotGlowstone));
    public static final ToolMaterial adamantium = addToolMaterial("adamantium", 3, Integer.MAX_VALUE, 20f, 1000f, 30, new ItemStack(ModItems.ingotAdamantium));
    public static final ToolMaterial donator = addToolMaterial("donator", 3, 20000, 10f, 10f, 30, new ItemStack(Items.iron_ingot));
    public static final ToolMaterial silk = addToolMaterial("silk", 3, 2500, 5f, 5f, 30, new ItemStack(ModItems.gemSilk));
    public static final ToolMaterial redstone = addToolMaterial("redstone", 3, 750, 7.5f, 2.5f, 30, new ItemStack(ModItems.gemRedstone));

    private static ToolMaterial addToolMaterial(String name, int harvestLvl, int maxUses, float eff, float damage, int ench, ItemStack repairItem) {
        ToolMaterial material = EnumHelper.addToolMaterial(name, harvestLvl, maxUses, eff, damage, ench);
        material.setRepairItem(repairItem);
        return material;
    }
}
