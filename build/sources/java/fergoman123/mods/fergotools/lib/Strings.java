package fergoman123.mods.fergotools.lib;

/**
 * Created by Fergoman123 on 03/05/2014.
 */
public class Strings {

    public static final String png = ".png";
    public static final String dot = ".";

    public static final String ft = "ft";

    public static final String adamantiumToolMessage = "NOTE: Extremely Overpowered!";

    public static class ArmorLocalizer
    {
        public static final String quartzArmor = ft + dot + "quartzArmor";
        public static final String obsidianArmor = ft + dot + "obsidianArmor";
        public static final String emeraldArmor = ft + dot + "emeraldArmor";
        public static final String lapisArmor = ft + dot + "lapisArmor";
        public static final String bronzeArmor = ft + dot + "bronzeArmor";
        public static final String coalArmor = ft + dot + "coalArmor";
        public static final String glowstoneArmor = ft + dot + "glowstoneArmor";
        public static final String redstoneArmor = ft + dot + "redstoneArmor";

        public static final String ftQuartzArmor = quartzArmor + dot;
        public static final String ftObsidianArmor = obsidianArmor + dot;
        public static final String ftEmeraldArmor = emeraldArmor + dot;
        public static final String ftLapisArmor = lapisArmor + dot;
        public static final String ftBronzeArmor = bronzeArmor + dot;
        public static final String ftCoalArmor = coalArmor + dot;
        public static final String ftGlowstoneArmor = glowstoneArmor + dot;
        public static final String ftRedstoneArmor = redstoneArmor + dot;

        public static final String helmet = "helmet";
        public static final String chest = "chest";
        public static final String legs = "legs";
        public static final String boots = "boots";
        public static final String[] armorTypes = {helmet, chest, legs, boots};
    }


    public static class ArmorStrings
    {
        public static ArmorLocalizer locale;

        public static final String quartzHelmet = locale.ftQuartzArmor + locale.helmet;
        public static final String quartzChest = locale.ftQuartzArmor + locale.chest;
        public static final String quartzLegs = locale.ftQuartzArmor + locale.legs;
        public static final String quartzBoots = locale.ftQuartzArmor + locale.boots;

        public static final String obsidianHelmet = locale.ftObsidianArmor + locale.helmet;
        public static final String obsidianChest = locale.ftObsidianArmor + locale.chest;
        public static final String obsidianLegs = locale.ftObsidianArmor + locale.legs;
        public static final String obsidianBoots = locale.ftObsidianArmor + locale.boots;

        public static final String emeraldHelmet = locale.ftEmeraldArmor + locale.helmet;
        public static final String emeraldChest = locale.ftEmeraldArmor + locale.chest;
        public static final String emeraldLegs = locale.ftEmeraldArmor + locale.legs;
        public static final String emeraldBoots = locale.ftEmeraldArmor + locale.boots;

        public static final String lapisHelmet = locale.ftLapisArmor + locale.helmet;
        public static final String lapisChest = locale.ftLapisArmor + locale.chest;
        public static final String lapisLegs = locale.ftLapisArmor + locale.legs;
        public static final String lapisBoots = locale.ftLapisArmor + locale.boots;

        public static final String bronzeHelmet = locale.ftBronzeArmor + locale.helmet;
        public static final String bronzeChest = locale.ftBronzeArmor + locale.chest;
        public static final String bronzeLegs = locale.ftBronzeArmor + locale.legs;
        public static final String bronzeBoots = locale.ftBronzeArmor + locale.boots;

        public static final String coalHelmet = locale.ftCoalArmor + locale.helmet;
        public static final String coalChest = locale.ftCoalArmor + locale.chest;
        public static final String coalLegs = locale.ftCoalArmor + locale.legs;
        public static final String coalBoots = locale.ftCoalArmor + locale.boots;

        public static final String glowstoneHelmet = locale.ftGlowstoneArmor + locale.helmet;
        public static final String glowstoneChest = locale.ftGlowstoneArmor + locale.chest;
        public static final String glowstoneLegs = locale.ftGlowstoneArmor + locale.legs;
        public static final String glowstoneBoots = locale.ftGlowstoneArmor + locale.boots;

        public static final String redstoneHelmet = locale.ftRedstoneArmor + locale.helmet;
        public static final String redstoneChest = locale.ftRedstoneArmor + locale.chest;
        public static final String redstoneLegs = locale.ftRedstoneArmor + locale.legs;
        public static final String redstoneBoots = locale.ftRedstoneArmor + locale.boots;
    }

    public static class ArmorKeys
    {
        public static final String[] quartzArmorKey = {"quartzHelmet", "quartzChestplate", "quartzLeggings", "quartzBoots"};

        public static final String[] obsidianArmorKey = {"obsidianHelmet", "obsidianChestplate", "obsidianLeggings", "obsidianBoots"};

        public static final String[] emeraldArmorKey = {"emeraldHelmet", "emeraldChestplate", "emeraldLeggings", "emeraldBoots"};

        public static final String[] lapisArmorKey = {"lapisHelmet", "lapisChestplate", "lapisLeggings", "lapisBoots"};

        public static final String[] bronzeArmorKey = {"bronzeHelmet", "bronzeChestplate", "bronzeLeggings", "bronzeBoots"};

        public static final String[] coalArmorKey = {"coalHelmet", "coalChestplate", "coalLeggings", "coalBoots"};

        public static final String[] glowstoneArmorKey = {"glowstoneHelmet", "glowstoneChestplate", "glowstoneLeggings", "glowstoneBoots"};

        public static final String[] redstoneArmorKey = {"redstoneHelmet", "redstoneChestplate", "redstoneLeggings", "redstoneBoots"};
    }


    public static class BlockStrings
    {
        public static final String oreExperience = "oreExperience";
        public static final String oreObsidian = "oreObsidian";
        public static final String oreEmeraldCrystal = "oreEmeraldCrystal";
        public static final String oreLapisCrystal = "oreLapisCrystal";
        public static final String oreBronze = "oreBronze";
        public static final String oreAdamantium = "oreAdamantium";
        public static final String oreRedstone = "oreRedstoneCrystal";

        public static final String[] ores = {oreExperience, oreObsidian, oreEmeraldCrystal, oreLapisCrystal, oreBronze, oreAdamantium, oreRedstone};

        public static final String blockExperience = "blockExperience";
        public static final String blockObsidian = "blockObsidian";
        public static final String blockEmeraldCrystal = "blockEmeraldCrystal";
        public static final String blockLapisCrystal = "blockLapisCrystal";
        public static final String blockBronze = "blockBronze";
        public static final String blockCoal = "blockCoal";
        public static final String blockGlowstone = "blockGlowstone";
        public static final String blockAdamantium = "blockAdamantium";
        public static final String blockSilkGem = "blockSilkGem";
        public static final String blockRedstone = "blockRedstoneCrystal";

        public static final String[] blocks =
                {
                        blockExperience,
                        blockObsidian,
                        blockEmeraldCrystal,
                        blockLapisCrystal,
                        blockBronze,
                        blockCoal,
                        blockGlowstone,
                        blockAdamantium,
                        blockSilkGem,
                        blockRedstone
                };
    }

    public static class BowStrings
    {
        public static final String bowQuartz = "bowQuartz";
        public static final String bowObsidian = "bowObsidian";
        public static final String bowEmerald = "bowEmerald";
        public static final String bowLapis = "bowLapis";
        public static final String bowBronze = "bowBronze";
        public static final String bowCoal = "bowCoal";
        public static final String bowGlowstone = "bowGlowstone";
        public static final String bowAdamantium = "bowAdamantium";
        public static final String bowSilk = "bowSilk";
        public static final String bowRedstone = "bowRedstone";
    }

    public static class FurnaceStrings
    {
        public static final String quartzFurnaceIdle = "quartzFurnaceIdle";
        public static final String quartzFurnaceActive = "quartzFurnaceActive";
        public static final String quartzFurnaceSide = "quartzFurnaceSide";

        public static final String obsidianFurnaceIdle = "obsidianFurnaceIdle";
        public static final String obsidianFurnaceActive = "obsidianFurnaceActive";

        public static final String emeraldCrystalFurnaceIdle = "emeraldCrystalFurnaceIdle";
        public static final String emeraldCrystalFurnaceActive = "emeraldCrystalFurnaceActive";

        public static final String lapisCrystalFurnaceIdle = "lapisCrystalFurnaceIdle";
        public static final String lapisCrystalFurnaceActive = "lapisCrystalFurnaceActive";

        public static final String bronzeFurnaceIdle = "bronzeFurnaceIdle";
        public static final String bronzeFurnaceActive = "bronzeFurnaceActive";

        public static final String coalFurnaceIdle = "coalFurnaceIdle";
        public static final String coalFurnaceActive = "coalFurnaceActive";

        public static final String glowstoneFurnaceIdle = "glowstoneFurnaceIdle";
        public static final String glowstoneFurnaceActive = "glowstoneFurnaceActive";

        public static final String adamantiumFurnaceIdle = "adamantiumFurnaceIdle";
        public static final String adamantiumFurnaceActive = "adamantiumFurnaceActive";

        public static final String silkFurnaceIdle = "silkFurnaceIdle";
        public static final String silkFurnaceActive = "silkFurnaceActive";

        public static final String redstoneFurnaceIdle = "redstoneFurnaceIdle";
        public static final String redstoneFurnaceActive = "redstoneFurnaceActive";

        public static final String maceratorIdle = "maceratorIdle";
        public static final String maceratorActive = "maceratorActive";
    }

    public static class GuiStrings
    {
        public static final String containerQuartzFurnace = "container.quartzFurnace";
        public static final String containerObsidianFurnace = "container.obsidianFurnace";
        public static final String containerEmeraldCrystalFurnace = "container.emeraldCrystalFurnace";
        public static final String containerLapisCrystalFurnace = "container.lapisCrystalFurnace";
        public static final String containerBronzeFurnace = "container.bronzeFurnace";
        public static final String containerCoalFurnace = "container.coalFurnace";
        public static final String containerGlowstoneFurnace = "container.glowstoneFurnace";
        public static final String containerAdamantiumFurnace = "container.adamantiumFurnace";
        public static final String containerSilkFurnace = "container.silkFurnace";
        public static final String containerRedstoneFurnace = "container.redstoneFurnace";
        public static final String containerMacerator = "container.macerator";

        public static final String containerInventory = "container.inventory";
        public static final String furnaceGuiTexture = "furnaceGui" + png;
        public static final String lapisFurnaceGui = "lapisFurnaceGui" + png;
        public static final String vanillaFurnace = "textures/gui/container/furnace" + png;
    }

    public static class ItemStrings
    {
        public static final String ingotObsidian = "ingotObsidian";
        public static final String emeraldCrystal = "emeraldCrystal";
        public static final String lapisCrystal = "lapisCrystal";
        public static final String ingotBronze = "ingotBronze";
        public static final String ingotCoal ="ingotCoal";
        public static final String ingotGlowstone = "ingotGlowstone";
        public static final String ingotAdamantium = "ingotAdamantium";
        public static final String expShard = "expShard";
        public static final String silkGem = "silkGem";
        public static final String redstoneCrystal = "redstoneCrystal";

        public static final String[] materials =
                {
                        ingotObsidian,//0
                        emeraldCrystal,//1
                        lapisCrystal,//2
                        ingotBronze,//3
                        ingotCoal,//4
                        ingotGlowstone,//5
                        ingotAdamantium,//6
                        expShard,//7
                        silkGem,//8
                        redstoneCrystal//9
                };
    }

    public static class MaterialStrings
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
    }

    public static class TabStrings
    {
        public static final String tabFergoTools = "tabFergoTools";
        public static final String tabFergoBlocks = "tabFergoBlocks";
        public static final String tabFergoFurnaces = "tabFergoFurnaces";
        public static final String tabFergoItems = "tabFergoItems";
        public static final String tabFergoArmor = "tabFergoArmor";
        public static final String tabFergoBows = "tabFergoBows";
    }

    public static class TileStrings
    {
        public static final String tilePrefix = "tile.";

        public static final String burnTime = "BurnTime";
        public static final String cookTime = "CookTime";

        public static final String customName = "CustomName";
        public static final String slot = "Slot";
        public static final String items = "Items";
    }

    public static class ToolStrings
    {
        public static final String quartzPickaxe = "quartzPickaxe";
        public static final String quartzShovel = "quartzShovel";
        public static final String quartzAxe = "quartzAxe";
        public static final String quartzHoe = "quartzHoe";
        public static final String quartzSword = "quartzSword";

        public static final String obsidianPickaxe = "obsidianPickaxe";
        public static final String obsidianShovel = "obsidianShovel";
        public static final String obsidianAxe = "obsidianAxe";
        public static final String obsidianHoe = "obsidianHoe";
        public static final String obsidianSword = "obsidianSword";

        public static final String emeraldPickaxe = "emeraldPickaxe";
        public static final String emeraldShovel = "emeraldShovel";
        public static final String emeraldAxe = "emeraldAxe";
        public static final String emeraldHoe = "emeraldHoe";
        public static final String emeraldSword = "emeraldSword";

        public static final String lapisPickaxe = "lapisPickaxe";
        public static final String lapisShovel = "lapisShovel";
        public static final String lapisAxe = "lapisAxe";
        public static final String lapisHoe = "lapisHoe";
        public static final String lapisSword = "lapisSword";

        public static final String bronzePickaxe = "bronzePickaxe";
        public static final String bronzeShovel = "bronzeShovel";
        public static final String bronzeAxe = "bronzeAxe";
        public static final String bronzeHoe = "bronzeHoe";
        public static final String bronzeSword = "bronzeSword";

        public static final String glowstonePickaxe = "glowstonePickaxe";
        public static final String glowstoneShovel = "glowstoneShovel";
        public static final String glowstoneAxe = "glowstoneAxe";
        public static final String glowstoneHoe = "glowstoneHoe";
        public static final String glowstoneSword = "glowstoneSword";

        public static final String coalPickaxe = "coalPickaxe";
        public static final String coalShovel = "coalShovel";
        public static final String coalAxe = "coalAxe";
        public static final String coalHoe = "coalHoe";
        public static final String coalSword = "coalSword";

        public static final String adamantiumPickaxe = "adamantiumPickaxe";
        public static final String adamantiumShovel = "adamantiumShovel";
        public static final String adamantiumAxe = "adamantiumAxe";
        public static final String adamantiumHoe = "adamantiumHoe";
        public static final String adamantiumSword = "adamantiumSword";

        public static final String silkPickaxe = "silkPickaxe";
        public static final String silkShovel = "silkShovel";
        public static final String silkAxe = "silkAxe";
        public static final String silkHoe = "silkHoe";
        public static final String silkSword = "silkSword";

        public static final String redstonePickaxe = "redstonePickaxe";
        public static final String redstoneShovel = "redstoneShovel";
        public static final String redstoneAxe = "redstoneAxe";
        public static final String redstoneHoe = "redstoneHoe";
        public static final String redstoneSword = "redstoneSword";

        public static final String[] donator = {};
    }
}
