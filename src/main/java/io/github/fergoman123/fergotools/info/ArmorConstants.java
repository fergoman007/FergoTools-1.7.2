package io.github.fergoman123.fergotools.info;

public class ArmorConstants
{
    public static final class Types
    {
        public static final String quartzArmor = "Quartz";
        public static final String obsidianArmor = "Obsidian";
        public static final String emeraldArmor = "Emerald";
        public static final String lapisArmor = "Lapis";
        public static final String bronzeArmor = "Bronze";
        public static final String coalArmor = "Coal";
        public static final String glowstoneArmor = "Glowstone";
        public static final String redstoneArmor = "Redstone";
        public static final String adamantiumArmor = "Adamantium";
    }

    public static final class MaxDamage
    {
        public static final int quartzArmorMaxDamage = 1000;
        public static final int obsidianArmorMaxDamage = 1500;
        public static final int emeraldArmorMaxDamage = 2000;
        public static final int lapisArmorMaxDamage = 2500;
        public static final int bronzeArmorMaxDamage = 3000;
        public static final int coalArmorMaxDamage = 3500;
        public static final int glowstoneArmorMaxDamage = 4000;
        public static final int redstoneArmorMaxDamage = 620;
        public static final int adamantiumArmorMaxDamage = (int)Double.POSITIVE_INFINITY;
    }

    public static final class Reduction
    {
        public static final int[] quartzReduct = new int[]{4, 9, 7, 3};
        public static final int[] obsidianReduct = new int[]{5, 10, 8, 4};
        public static final int[] emeraldReduct = new int[]{6, 11, 9, 5};
        public static final int[] lapisReduct = new int[]{7, 10, 12, 6};
        public static final int[] bronzeReduct = new int[]{8, 11, 13, 7};
        public static final int[] coalReduct = new int[]{9, 12, 14, 8};
        public static final int[] glowstoneReduct = new int[]{10, 13, 15, 9};
        public static final int[] redstoneReduct = new int[]{2, 6, 5, 2};
        public static final int[] adamantiumReduct = new int[]{20, 20, 20, 20};
    }
}
