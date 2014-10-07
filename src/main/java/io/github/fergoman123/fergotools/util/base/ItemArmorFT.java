package io.github.fergoman123.fergotools.util.base;

import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.item.ItemArmor;

public abstract class ItemArmorFT extends ItemArmor
{

    public static final class ArmorNames
    {
        public static final String quartz = "quartz";
        public static final String obsidian = "obsidian";
        public static final String emerald = "emerald";
        public static final String lapis = "lapis";
        public static final String bronze = "bronze";
        public static final String coal = "coal";
        public static final String glowstone = "glowstone";
        public static final String redstone = "redstone";
        public static final String adamantium = "adamantium";
    }

    public ItemArmorFT(String armorName, ArmorMaterial material, ArmorType type)
    {
        super(material, 1, type.ordinal());
        this.setUnlocalizedName(armorName);
//        this.set
    }


}
