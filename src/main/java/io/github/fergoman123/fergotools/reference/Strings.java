package io.github.fergoman123.fergotools.reference;

public class Strings
{
    public static final class Material
    {
        public static final String quartzToolMat = "quartz";
        public static final String obsidianToolMat = "obsidian";
        public static final String emeraldToolMat = "emerald";
        public static final String lapisToolMat = "lapis";
        public static final String bronzeToolMat = "bronze";
        public static final String glowstoneToolMat = "glowstone";
        public static final String coalToolMat = "coal";
        public static final String adamantiumToolMat = "adamantium";
        public static final String donatorToolMat = "donator";
        public static final String silkToolMat = "silk";
        public static final String redstoneToolMat = "redstone";

        public static final String quartzArmor = "quartzArmor";
        public static final String obsidianArmor = "obsidianArmor";
        public static final String emeraldArmor = "emeraldArmor";
        public static final String lapisArmor = "lapisArmor";
        public static final String bronzeArmor = "bronzeArmor";
        public static final String coalArmor = "coalArmor";
        public static final String glowstoneArmor = "glowstoneArmor";
        public static final String redstoneArmor = "redstoneArmor";
        public static final String adamantiumArmor = "adamantiumArmor";
    }

    public static final class Tab
    {
        public static final String tabFergoTools = "FergoTools:tabFergoTools";
        public static final String tabFergoBlocks = "FergoTools:tabFergoBlocks";
        public static final String tabFergoFurnaces = "FergoTools:tabFergoFurnaces";
        public static final String tabFergoItems = "FergoTools:tabFergoItems";
        public static final String tabFergoArmor = "FergoTools:tabFergoArmor";
        public static final String tabFergoBows = "FergoTools:tabFergoBows";
        public static final String tabFergoShears = "FergoTools:tabFergoShears";
        public static final String tabFergoWood = "FergoTools:tabFergoWood";
        public static final String tabFergoCT = "FergoTools:tabFergoCT";
    }

    public static final class Tile
    {
        public static final String tilePrefix = "tile.FergoTools:";

        public static final String burnTime = "BurnTime";
        public static final String cookTime = "CookTime";

        public static final String customName = "CustomName";
        public static final String slot = "Slot";
        public static final String items = "Items";

        public static final String quartzFurnaceTile = tilePrefix + "QuartzFurnace";
        public static final String obsidianFurnaceTile = tilePrefix + "ObsidianFurnace";
        public static final String emeraldCrystalFurnaceTile = tilePrefix + "EmeraldCrystalFurnace";
        public static final String lapisCrystalFurnaceTile = tilePrefix + "LapisCrystalFurnace";
        public static final String bronzeFurnaceTile = tilePrefix + "BronzeFurnace";
        public static final String coalFurnaceTile = tilePrefix + "CoalFurnace";
        public static final String glowstoneFurnaceTile = tilePrefix + "GlowstoneFurnace";
        public static final String adamantiumFurnaceTile = tilePrefix + "AdamantiumFurnace";
        public static final String silkFurnaceTile = tilePrefix + "SilkFurnace";
        public static final String redstoneFurnaceTile = tilePrefix + "RedstoneFurnace";
        public static final String maceratorTile = tilePrefix + "Macerator";

        public static final String[] tileList =
                {
                        quartzFurnaceTile,
                        obsidianFurnaceTile,
                        emeraldCrystalFurnaceTile,
                        lapisCrystalFurnaceTile,
                        bronzeFurnaceTile,
                        coalFurnaceTile,
                        glowstoneFurnaceTile,
                        adamantiumFurnaceTile,
                        silkFurnaceTile,
                        redstoneFurnaceTile,
                        maceratorTile
                };
    }

    public static final class FurnaceType
    {
        public static final String quartzFurnace = "quartzFurnace";
        public static final String obsidianFurnace = "obsidianFurnace";
        public static final String emeraldFurnace = "emeraldFurnace";
        public static final String lapisFurnace = "lapisFurnace";
        public static final String bronzeFurnace = "bronzeFurnace";
        public static final String coalFurnace = "coalFurnace";
        public static final String glowstoneFurnace = "glowstoneFurnace";
        public static final String adamantiumFurnace = "adamantiumFurnace";
        public static final String silkFurnace = "silkFurnace";
        public static final String redstoneFurnace = "redstoneFurnace";
        public static final String macerator = "macerator";
    }

    public static final class Messages
    {
        public static final String preInitMessage = "Pre Initialising Mod";
        public static final String initMessage = "Initialising Registration";
        public static final String postInitMessage = "Mod Loaded";
        public static final String serverStartedMessage = "Server Started";
    }

    public static final class OtherStrings
    {
        public static final String itemForLocalization = "item.%s%s";
        public static final String itemMetadataLocalization = "item.%s%s.%s";
        public static final String blockForLocalization = "tile.%s%s";
    }
}
