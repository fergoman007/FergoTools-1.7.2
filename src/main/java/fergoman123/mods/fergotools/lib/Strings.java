package fergoman123.mods.fergotools.lib;

import fergoman123.mods.fergotools.helper.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Fergoman123 on 03/05/2014.
 */
public class Strings {

    public static final String png = ".png";
    public static final String dot = ".";

    public static final String ft = "ft";

    public static final String adamantiumToolMessage = "NOTE: Extremely Overpowered!";

    public static class ArmorStrings
    {
        public static final String quartzHelmet = "quartzHelmet";
        public static final String quartzChest = "quartzChestplate";
        public static final String quartzLegs = "quartzLeggings";
        public static final String quartzBoots = "quartzBoots";

        public static final String obsidianHelmet = "obsidianHelmet";
        public static final String obsidianChest = "obsidianChestplate";
        public static final String obsidianLegs = "obsidianLeggings";
        public static final String obsidianBoots = "obsidianBoots";

        public static final String emeraldHelmet = "emeraldHelmet";
        public static final String emeraldChest = "emeraldChestplate";
        public static final String emeraldLegs = "emeraldLeggings";
        public static final String emeraldBoots = "emeraldBoots";

        public static final String lapisHelmet = "lapisHelmet";
        public static final String lapisChest = "lapisChestplate";
        public static final String lapisLegs = "lapisLeggings";
        public static final String lapisBoots = "lapisBoots";

        public static final String bronzeHelmet = "bronzeHelmet";
        public static final String bronzeChest = "bronzeChestplate";
        public static final String bronzeLegs = "bronzeLeggings";
        public static final String bronzeBoots = "bronzeBoots";

        public static final String coalHelmet = "coalHelmet";
        public static final String coalChest = "coalChestplate";
        public static final String coalLegs = "coalLeggings";
        public static final String coalBoots = "coalBoots";

        public static final String glowstoneHelmet = "glowstoneHelmet";
        public static final String glowstoneChest = "glowstoneChestplate";
        public static final String glowstoneLegs = "glowstoneLeggings";
        public static final String glowstoneBoots = "glowstoneBoots";

        public static final String redstoneHelmet = "redstoneHelmet";
        public static final String redstoneChest = "redstoneChestplate";
        public static final String redstoneLegs = "redstoneLeggings";
        public static final String redstoneBoots = "redstoneBoots";

        public static final String adamantiumHelmet = "adamantiumHelmet";
        public static final String adamantiumChest = "adamantiumChestplate";
        public static final String adamantiumLegs = "adamantiumLeggings";
        public static final String adamantiumBoots = "adamantiumBoots";
    }


    public static class BlockStrings
    {
        public static final String oreExperience = "oreExperience";
        public static final String oreObsidian = "oreObsidian";
        public static final String oreEmeraldCrystal = "oreEmeraldCrystal";
        public static final String oreLapisCrystal = "oreLapisCrystal";
        public static final String oreBronze = "oreBronze";
        public static final String oreAdamantium = "oreAdamantium";
        public static final String oreRedstoneCrystal = "oreRedstoneCrystal";

        public static final String blockExperience = "blockExperience";
        public static final String blockObsidian = "blockObsidian";
        public static final String blockEmeraldCrystal = "blockEmeraldCrystal";
        public static final String blockLapisCrystal = "blockLapisCrystal";
        public static final String blockBronze = "blockBronze";
        public static final String blockCoal = "blockCoal";
        public static final String blockGlowstone = "blockGlowstone";
        public static final String blockAdamantium = "blockAdamantium";
        public static final String blockSilkGem = "blockSilkGem";
        public static final String blockRedstoneCrystal = "blockRedstoneCrystal";
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
        public static final String modPrefix = Reference.textureLoc;
        public static final String containerPrefix = "container." + modPrefix;

        public static final String containerQuartzFurnace = containerPrefix + "quartzFurnace";
        public static final String containerObsidianFurnace = containerPrefix + "obsidianFurnace";
        public static final String containerEmeraldCrystalFurnace = containerPrefix + "emeraldCrystalFurnace";
        public static final String containerLapisCrystalFurnace = containerPrefix + "lapisCrystalFurnace";
        public static final String containerBronzeFurnace = containerPrefix + "bronzeFurnace";
        public static final String containerCoalFurnace = containerPrefix + "coalFurnace";
        public static final String containerGlowstoneFurnace = containerPrefix + "glowstoneFurnace";
        public static final String containerAdamantiumFurnace = containerPrefix + "adamantiumFurnace";
        public static final String containerSilkFurnace = containerPrefix + "silkFurnace";
        public static final String containerRedstoneFurnace = containerPrefix + "redstoneFurnace";
        public static final String containerMacerator = containerPrefix + "macerator";

        public static final String containerInventory = "container.inventory";

        public static final String furnaceGuiTexture = "furnaceGui" + png;
        public static final String lapisFurnaceGui = "lapisFurnaceGui" + png;
        public static final String redstoneFurnaceGui = "redstoneFurnaceGui" + png;
        public static final String maceratorGui = "maceratorGui" + png;
        public static final String lapisFurnaceGuiLoc = Reference.dirGui + lapisFurnaceGui;
        public static final String redstoneFurnaceGuiLoc = Reference.dirGui + redstoneFurnaceGui;
        public static final String maceratorGuiLoc = Reference.dirGui + maceratorGui;
        public static final String vanillaFurnaceTexture = "textures/gui/container/furnace" + png;

        public static final ResourceLocation lapisFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(lapisFurnaceGuiLoc);
        public static final ResourceLocation redstoneFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(redstoneFurnaceGuiLoc);
        public static final ResourceLocation maceratorGuiTexture = ResourceLocationHelper.getModdedResourceLocation(maceratorGuiLoc);
        public static final ResourceLocation vanillaFurnace = ResourceLocationHelper.getVanillaResourceLocation(vanillaFurnaceTexture);
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
        public static final String adamantiumArmor = "adamantiumArmor";
    }

    public static class TabStrings
    {
        public static final String tabFergoTools = "tabFergoTools";
        public static final String tabFergoBlocks = "tabFergoBlocks";
        public static final String tabFergoFurnaces = "tabFergoFurnaces";
        public static final String tabFergoItems = "tabFergoItems";
        public static final String tabFergoArmor = "tabFergoArmor";
        public static final String tabFergoBows = "tabFergoBows";

        public static final String tabFergoToolsTranslated = "Fergoman123's Tools | Tools";
        public static final String tabFergoBlocksTranslated = "Fergoman123's Tools | Blocks";
        public static final String tabFergoFurnacesTranslated = "Fergoman123's Tools | Furnaces";
        public static final String tabFergoItemsTranslated = "Fergoman123's Tools | Items";
        public static final String tabFergoArmorTranslated = "Fergoman123's Tools | Armor";
        public static final String tabFergoBowsTranslated = "Fergoman123's Tools | Bows";
    }

    public static class TileStrings
    {
        public static final String tilePrefix = "tile.";

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
