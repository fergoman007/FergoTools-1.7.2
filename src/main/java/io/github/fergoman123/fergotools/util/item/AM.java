package io.github.fergoman123.fergotools.util.item;

import io.github.fergoman123.fergotools.api.content.ArmorMaterials;
import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.reference.ints.ArmorInts;
import io.github.fergoman123.fergotools.reference.strings.Material;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class AM {

    public static final ArmorMaterial quartzArmor = addArmorMaterial(ArmorMaterials.quartz);
    public static final ArmorMaterial obsidianArmor = addArmorMaterial(ArmorMaterials.obsidian);
    public static final ArmorMaterial emeraldArmor = addArmorMaterial(ArmorMaterials.emerald);
    public static final ArmorMaterial lapisArmor = addArmorMaterial(ArmorMaterials.lapis);
    public static final ArmorMaterial bronzeArmor = addArmorMaterial(ArmorMaterials.bronze);
    public static final ArmorMaterial coalArmor = addArmorMaterial(ArmorMaterials.coal);
    public static final ArmorMaterial glowstoneArmor = addArmorMaterial(ArmorMaterials.glowstone);
    public static final ArmorMaterial adamantiumArmor = addArmorMaterial(ArmorMaterials.adamantium);
    public static final ArmorMaterial redstoneArmor = addArmorMaterial(ArmorMaterials.redstone);

    public static ArmorMaterial addArmorMaterial(ArmorMaterials material) {
        return EnumHelper.addArmorMaterial(material.getName(), material.getName(), material.getMaxDamage(), material.getReductAmounts(), material.getEnchantability());
    }
}
