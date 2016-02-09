package io.github.fergoman123.fergotools.material;

import io.github.fergoman123.fergotools.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterials {

    public static final ArmorMaterial quartzArmor = addArmorMaterial("quartz", 1000, new int[]{4, 9, 7, 3}, 30, new ItemStack(Items.quartz));
    public static final ArmorMaterial obsidianArmor = addArmorMaterial("obsidian", 1500, new int[]{5, 10, 8, 4}, 30, new ItemStack(ModItems.ingotObsidian));
    public static final ArmorMaterial emeraldArmor = addArmorMaterial("emerald", 2000, new int[]{6, 11, 13, 7}, 30, new ItemStack(ModItems.gemEmerald));
    public static final ArmorMaterial lapisArmor = addArmorMaterial("lapis", 2500, new int[]{7, 10, 12, 6}, 30, new ItemStack(ModItems.gemLapis));
    public static final ArmorMaterial bronzeArmor = addArmorMaterial("bronze", 3000, new int[]{8, 11, 13, 7}, 30, new ItemStack(ModItems.ingotBronze));
    public static final ArmorMaterial coalArmor = addArmorMaterial("coal", 3500, new int[]{9, 12, 14, 8}, 30, new ItemStack(ModItems.ingotCoal));
    public static final ArmorMaterial glowstoneArmor = addArmorMaterial("glowstone", 4000, new int[]{10, 13, 15, 9}, 30, new ItemStack(ModItems.ingotGlowstone));
    public static final ArmorMaterial adamantiumArmor = addArmorMaterial("adamantium", Integer.MAX_VALUE, new int[]{20, 20, 20, 20}, 30, new ItemStack(ModItems.ingotAdamantium));
    public static final ArmorMaterial redstoneArmor = addArmorMaterial("redstone", 620, new int[]{2, 6, 5, 2}, 30, new ItemStack(ModItems.gemRedstone));


    private static ArmorMaterial addArmorMaterial(String name, int maxDamageFactor, int[] reductionAmounts, int ench, ItemStack repairItem){
        ArmorMaterial material = EnumHelper.addArmorMaterial(name, name, maxDamageFactor, reductionAmounts, ench);
        material.customCraftingMaterial = repairItem.getItem();
        return material;
    }
}
