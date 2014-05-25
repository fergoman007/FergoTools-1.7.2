package fergoman123.mods.fergotools.lib;
import fergoman123.mods.fergotools.lib.Strings.*;

public class Textures {

    public static class ArmorTextures
    {
        public static final String one = "_1";
        public static final String two = "_2";

        public static final String[] renderNum = {one, two};

        public static final int helmetSlot = 0;
        public static final int chestSlot = 1;
        public static final int legSlot = 2;
        public static final int bootSlot = 3;
        public static final int[] armorSlots = {helmetSlot, chestSlot, legSlot, bootSlot};

        public static final String quartzArmorRender1 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.quartzToolMat + renderNum[0] + Strings.png;
        public static final String quartzArmorRender2 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.quartzToolMat + renderNum[1] + Strings.png;

        public static final String obsidianArmorRender1 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.obsidianToolMat + renderNum[0] + Strings.png;
        public static final String obsidianArmorRender2 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.obsidianToolMat + renderNum[1] + Strings.png;

        public static final String emeraldArmorRender1 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.emeraldToolMat + renderNum[0] + Strings.png;
        public static final String emeraldArmorRender2 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.emeraldToolMat + renderNum[1] + Strings.png;

        public static final String lapisArmorRender1 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.lapisToolMat + renderNum[0] + Strings.png;
        public static final String lapisArmorRender2 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.lapisToolMat + renderNum[1] + Strings.png;

        public static final String bronzeArmorRender1 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.bronzeToolMat + renderNum[0] + Strings.png;
        public static final String bronzeArmorRender2 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.bronzeToolMat + renderNum[1] + Strings.png;

        public static final String coalArmorRender1 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.coalToolMat + renderNum[0] + Strings.png;
        public static final String coalArmorRender2 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.coalToolMat + renderNum[1] + Strings.png;

        public static final String glowstoneArmorRender1 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.glowstoneToolMat + renderNum[0] + Strings.png;
        public static final String glowstoneArmorRender2 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.glowstoneToolMat + renderNum[1] + Strings.png;

        public static final String redstoneArmorRender1 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.redstoneToolMat + renderNum[0] + Strings.png;
        public static final String redstoneArmorRender2 = Reference.textureLoc + Reference.dirArmor + MaterialStrings.redstoneToolMat + renderNum[1] + Strings.png;

        public static final String quartzHelmet = Reference.textureLoc + ArmorKeys.quartzArmorKey[armorSlots[0]];
        public static final String quartzChestplate = Reference.textureLoc + ArmorKeys.quartzArmorKey[armorSlots[1]];
        public static final String quartzLeggings = Reference.textureLoc + ArmorKeys.quartzArmorKey[armorSlots[2]];
        public static final String quartzBoots = Reference.textureLoc + ArmorKeys.quartzArmorKey[armorSlots[3]];

        public static final String obsidianHelmet = Reference.textureLoc + ArmorKeys.obsidianArmorKey[armorSlots[0]];
        public static final String obsidianChestplate = Reference.textureLoc + ArmorKeys.obsidianArmorKey[armorSlots[1]];
        public static final String obsidianLeggings = Reference.textureLoc + ArmorKeys.obsidianArmorKey[armorSlots[2]];
        public static final String obsidianBoots = Reference.textureLoc + ArmorKeys.obsidianArmorKey[armorSlots[3]];

        public static final String emeraldHelmet = Reference.textureLoc + ArmorKeys.emeraldArmorKey[armorSlots[0]];
        public static final String emeraldChestplate = Reference.textureLoc + ArmorKeys.emeraldArmorKey[armorSlots[1]];
        public static final String emeraldLeggings = Reference.textureLoc + ArmorKeys.emeraldArmorKey[armorSlots[2]];
        public static final String emeraldBoots = Reference.textureLoc + ArmorKeys.emeraldArmorKey[armorSlots[3]];

        public static final String lapisHelmet = Reference.textureLoc + ArmorKeys.lapisArmorKey[armorSlots[0]];
        public static final String lapisChestplate = Reference.textureLoc + ArmorKeys.lapisArmorKey[armorSlots[1]];
        public static final String lapisLeggings = Reference.textureLoc + ArmorKeys.lapisArmorKey[armorSlots[2]];
        public static final String lapisBoots = Reference.textureLoc + ArmorKeys.lapisArmorKey[armorSlots[3]];

        public static final String bronzeHelmet = Reference.textureLoc + ArmorKeys.bronzeArmorKey[armorSlots[0]];
        public static final String bronzeChestplate = Reference.textureLoc + ArmorKeys.bronzeArmorKey[armorSlots[1]];
        public static final String bronzeLeggings = Reference.textureLoc + ArmorKeys.bronzeArmorKey[armorSlots[2]];
        public static final String bronzeBoots = Reference.textureLoc + ArmorKeys.bronzeArmorKey[armorSlots[3]];

        public static final String coalHelmet = Reference.textureLoc + ArmorKeys.coalArmorKey[armorSlots[0]];
        public static final String coalChestplate = Reference.textureLoc + ArmorKeys.coalArmorKey[armorSlots[1]];
        public static final String coalLeggings = Reference.textureLoc + ArmorKeys.coalArmorKey[armorSlots[2]];
        public static final String coalBoots = Reference.textureLoc + ArmorKeys.coalArmorKey[armorSlots[3]];

        public static final String glowstoneHelmet = Reference.textureLoc + ArmorKeys.glowstoneArmorKey[armorSlots[0]];
        public static final String glowstoneChestplate = Reference.textureLoc + ArmorKeys.glowstoneArmorKey[armorSlots[1]];
        public static final String glowstoneLeggings = Reference.textureLoc + ArmorKeys.glowstoneArmorKey[armorSlots[2]];
        public static final String glowstoneBoots = Reference.textureLoc + ArmorKeys.glowstoneArmorKey[armorSlots[3]];

        public static final String redstoneHelmet = Reference.textureLoc + ArmorKeys.redstoneArmorKey[armorSlots[0]];
        public static final String redstoneChestplate = Reference.textureLoc + ArmorKeys.redstoneArmorKey[armorSlots[1]];
        public static final String redstoneLeggings = Reference.textureLoc + ArmorKeys.redstoneArmorKey[armorSlots[2]];
        public static final String redstoneBoots = Reference.textureLoc + ArmorKeys.redstoneArmorKey[armorSlots[3]];
    }

    public static class BlockTextures
    {
        public static final String oreExperience =  Reference.textureLoc + BlockStrings.oreExperience;
        public static final String oreObsidian =  Reference.textureLoc + BlockStrings.oreObsidian;
        public static final String oreEmeraldCrystal =  Reference.textureLoc + BlockStrings.oreEmeraldCrystal;
        public static final String oreLapisCrystal =  Reference.textureLoc + BlockStrings.oreLapisCrystal;
        public static final String oreBronze =  Reference.textureLoc + BlockStrings.oreBronze;
        public static final String oreAdamantium = Reference.textureLoc +  BlockStrings.oreAdamantium;
        public static final String oreRedstone = Reference.textureLoc + BlockStrings.oreRedstoneCrystal;

        public static final String blockExperience = Reference.textureLoc +  BlockStrings.blockExperience;
        public static final String blockObsidian =  Reference.textureLoc + BlockStrings.blockObsidian;
        public static final String blockEmeraldCrystal = Reference.textureLoc + BlockStrings.blockEmeraldCrystal;
        public static final String blockLapisCrystal =  Reference.textureLoc + BlockStrings.blockLapisCrystal;
        public static final String blockBronze =  Reference.textureLoc + BlockStrings.blockBronze;
        public static final String blockCoal =  Reference.textureLoc + BlockStrings.blockCoal;
        public static final String blockGlowstone =  Reference.textureLoc + BlockStrings.blockGlowstone;
        public static final String blockAdamantium =  Reference.textureLoc + BlockStrings.blockAdamantium;
        public static final String blockSilkGem = Reference.textureLoc + BlockStrings.blockSilkGem;
        public static final String blockRedstone = Reference.textureLoc + BlockStrings.blockRedstoneCrystal;
    }

    public static class BowTextures
    {
        public static final String zero = "_0";
        public static final String one = "_1";
        public static final String two = "_2";
        public static final String three = "_3";

        public static final String[] bowNum = {zero, one, two, three};

        public static final String quartzBowStandy = Reference.textureLoc + BowStrings.bowQuartz + bowNum[0];
        public static final String quartzBowPull1 = Reference.textureLoc + BowStrings.bowQuartz + bowNum[1];
        public static final String quartzBowPull2 = Reference.textureLoc + BowStrings.bowQuartz + bowNum[2];
        public static final String quartzBowPull3 = Reference.textureLoc + BowStrings.bowQuartz + bowNum[3];

        public static final String obsidianBowStandy = Reference.textureLoc + BowStrings.bowObsidian + bowNum[0];
        public static final String obsidianBowPull1 = Reference.textureLoc + BowStrings.bowObsidian + bowNum[1];
        public static final String obsidianBowPull2 = Reference.textureLoc + BowStrings.bowObsidian + bowNum[1];
        public static final String obsidianBowPull3 = Reference.textureLoc + BowStrings.bowObsidian + bowNum[3];

        public static final String emeraldBowStandy = Reference.textureLoc + BowStrings.bowEmerald + bowNum[0];
        public static final String emeraldBowPull1 = Reference.textureLoc + BowStrings.bowEmerald + bowNum[1];
        public static final String emeraldBowPull2 = Reference.textureLoc + BowStrings.bowEmerald + bowNum[1];
        public static final String emeraldBowPull3 = Reference.textureLoc + BowStrings.bowEmerald + bowNum[3];

        public static final String lapisBowStandy = Reference.textureLoc + BowStrings.bowLapis + bowNum[0];
        public static final String lapisBowPull1 = Reference.textureLoc + BowStrings.bowLapis + bowNum[1];
        public static final String lapisBowPull2 = Reference.textureLoc + BowStrings.bowLapis + bowNum[1];
        public static final String lapisBowPull3 = Reference.textureLoc + BowStrings.bowLapis + bowNum[3];

        public static final String bronzeBowStandy = Reference.textureLoc + BowStrings.bowBronze + bowNum[0];
        public static final String bronzeBowPull1 = Reference.textureLoc + BowStrings.bowBronze + bowNum[1];
        public static final String bronzeBowPull2 = Reference.textureLoc + BowStrings.bowBronze + bowNum[1];
        public static final String bronzeBowPull3 = Reference.textureLoc + BowStrings.bowBronze + bowNum[3];

        public static final String coalBowStandy = Reference.textureLoc + BowStrings.bowCoal + bowNum[0];
        public static final String coalBowPull1 = Reference.textureLoc + BowStrings.bowCoal + bowNum[1];
        public static final String coalBowPull2 = Reference.textureLoc + BowStrings.bowCoal + bowNum[1];
        public static final String coalBowPull3 = Reference.textureLoc + BowStrings.bowCoal + bowNum[3];

        public static final String glowstoneBowStandy = Reference.textureLoc + BowStrings.bowGlowstone + bowNum[0];
        public static final String glowstoneBowPull1 = Reference.textureLoc + BowStrings.bowGlowstone + bowNum[1];
        public static final String glowstoneBowPull2 = Reference.textureLoc + BowStrings.bowGlowstone + bowNum[1];
        public static final String glowstoneBowPull3 = Reference.textureLoc + BowStrings.bowGlowstone + bowNum[3];

        public static final String adamantiumBowStandy = Reference.textureLoc + BowStrings.bowAdamantium + bowNum[0];
        public static final String adamantiumBowPull1 = Reference.textureLoc + BowStrings.bowAdamantium + bowNum[1];
        public static final String adamantiumBowPull2 = Reference.textureLoc + BowStrings.bowAdamantium + bowNum[1];
        public static final String adamantiumBowPull3 = Reference.textureLoc + BowStrings.bowAdamantium + bowNum[3];
    }

    public static class FurnaceTextures
    {
        public static final String quartzFurnaceIdle = FurnaceStrings.quartzFurnaceIdle;
        public static final String quartzFurnaceActive = FurnaceStrings.quartzFurnaceActive;
        public static final String quartzFurnaceSide = Reference.textureLoc + FurnaceStrings.quartzFurnaceSide;

        public static final String obsidianFurnaceIdle = FurnaceStrings.obsidianFurnaceIdle;
        public static final String obsidianFurnaceActive = FurnaceStrings.obsidianFurnaceActive;

        public static final String emeraldCrystalFurnaceIdle = FurnaceStrings.emeraldCrystalFurnaceIdle;
        public static final String emeraldCrystalFurnaceActive = FurnaceStrings.emeraldCrystalFurnaceActive;

        public static final String lapisCrystalFurnaceIdle = FurnaceStrings.lapisCrystalFurnaceIdle;
        public static final String lapisCrystalFurnaceActive = FurnaceStrings.lapisCrystalFurnaceActive;

        public static final String bronzeFurnaceIdle = FurnaceStrings.bronzeFurnaceIdle;
        public static final String bronzeFurnaceActive = FurnaceStrings.bronzeFurnaceActive;

        public static final String coalFurnaceIdle = FurnaceStrings.coalFurnaceIdle;
        public static final String coalFurnaceActive = FurnaceStrings.coalFurnaceActive;

        public static final String glowstoneFurnaceIdle = FurnaceStrings.glowstoneFurnaceIdle;
        public static final String glowstoneFurnaceActive = FurnaceStrings.glowstoneFurnaceActive;

        public static final String adamantiumFurnaceIdle = FurnaceStrings.adamantiumFurnaceIdle;
        public static final String adamantiumFurnaceActive = FurnaceStrings.adamantiumFurnaceActive;

        public static final String silkFurnaceIdle = FurnaceStrings.silkFurnaceIdle;
        public static final String silkFurnaceActive = FurnaceStrings.silkFurnaceActive;

        public static final String redstoneFurnaceIdle = FurnaceStrings.redstoneFurnaceIdle;
        public static final String redstoneFurnaceActive = FurnaceStrings.redstoneFurnaceActive;
    }

    public static class ItemTextures
    {
        public static final String obsidianIngot = Reference.textureLoc + ItemStrings.materials[0];
        public static final String emeraldCrystal = Reference.textureLoc + ItemStrings.materials[1];
        public static final String lapisCrystal = Reference.textureLoc + ItemStrings.materials[2];
        public static final String bronzeIngot = Reference.textureLoc + ItemStrings.materials[3];
        public static final String coalIngot = Reference.textureLoc + ItemStrings.materials[4];
        public static final String glowstoneIngot = Reference.textureLoc + ItemStrings.materials[5];
        public static final String adamantiumIngot = Reference.textureLoc + ItemStrings.materials[6];
        public static final String expShard = Reference.textureLoc + ItemStrings.materials[7];
        public static final String silkGem = Reference.textureLoc + ItemStrings.materials[8];
        public static final String redstoneCrystal = Reference.textureLoc + ItemStrings.materials[9];
    }

    public static class ToolTextures
    {
        public static final String quartzPickaxe = Reference.textureLoc + ToolStrings.quartzPickaxe;
        public static final String quartzShovel = Reference.textureLoc + ToolStrings.quartzShovel;
        public static final String quartzAxe = Reference.textureLoc + ToolStrings.quartzAxe;
        public static final String quartzHoe = Reference.textureLoc + ToolStrings.quartzHoe;
        public static final String quartzSword = Reference.textureLoc + ToolStrings.quartzSword;

        public static final String obsidianPickaxe = Reference.textureLoc + ToolStrings.obsidianPickaxe;
        public static final String obsidianShovel = Reference.textureLoc + ToolStrings.obsidianShovel;
        public static final String obsidianAxe = Reference.textureLoc + ToolStrings.obsidianAxe;
        public static final String obsidianHoe = Reference.textureLoc + ToolStrings.obsidianHoe;
        public static final String obsidianSword = Reference.textureLoc + ToolStrings.obsidianSword;

        public static final String emeraldPickaxe = Reference.textureLoc + ToolStrings.emeraldPickaxe;
        public static final String emeraldShovel = Reference.textureLoc + ToolStrings.emeraldShovel;
        public static final String emeraldAxe = Reference.textureLoc + ToolStrings.emeraldAxe;
        public static final String emeraldHoe = Reference.textureLoc + ToolStrings.emeraldHoe;
        public static final String emeraldSword = Reference.textureLoc + ToolStrings.emeraldSword;

        public static final String lapisPickaxe = Reference.textureLoc + ToolStrings.lapisPickaxe;
        public static final String lapisShovel = Reference.textureLoc + ToolStrings.lapisShovel;
        public static final String lapisAxe = Reference.textureLoc + ToolStrings.lapisAxe;
        public static final String lapisHoe = Reference.textureLoc + ToolStrings.lapisHoe;
        public static final String lapisSword = Reference.textureLoc + ToolStrings.lapisSword;

        public static final String bronzePickaxe = Reference.textureLoc + ToolStrings.bronzePickaxe;
        public static final String bronzeShovel = Reference.textureLoc + ToolStrings.bronzeShovel;
        public static final String bronzeAxe = Reference.textureLoc + ToolStrings.bronzeAxe;
        public static final String bronzeHoe = Reference.textureLoc + ToolStrings.bronzeHoe;
        public static final String bronzeSword = Reference.textureLoc + ToolStrings.bronzeSword;

        public static final String coalPickaxe = Reference.textureLoc + ToolStrings.coalPickaxe;
        public static final String coalShovel = Reference.textureLoc + ToolStrings.coalShovel;
        public static final String coalAxe = Reference.textureLoc + ToolStrings.coalAxe;
        public static final String coalHoe = Reference.textureLoc + ToolStrings.coalHoe;
        public static final String coalSword = Reference.textureLoc + ToolStrings.coalSword;

        public static final String glowstonePickaxe = Reference.textureLoc + ToolStrings.glowstonePickaxe;
        public static final String glowstoneShovel = Reference.textureLoc + ToolStrings.glowstoneShovel;
        public static final String glowstoneAxe = Reference.textureLoc + ToolStrings.glowstoneAxe;
        public static final String glowstoneHoe = Reference.textureLoc + ToolStrings.glowstoneHoe;
        public static final String glowstoneSword = Reference.textureLoc + ToolStrings.glowstoneSword;

        public static final String adamantiumPickaxe = Reference.textureLoc + Strings.ToolStrings.adamantiumPickaxe;
        public static final String adamantiumShovel = Reference.textureLoc + Strings.ToolStrings.adamantiumShovel;
        public static final String adamantiumAxe = Reference.textureLoc + Strings.ToolStrings.adamantiumAxe;
        public static final String adamantiumHoe = Reference.textureLoc + Strings.ToolStrings.adamantiumHoe;
        public static final String adamantiumSword = Reference.textureLoc + Strings.ToolStrings.adamantiumSword;

        public static final String silkPickaxe = Reference.textureLoc + Strings.ToolStrings.silkPickaxe;
        public static final String silkShovel = Reference.textureLoc + Strings.ToolStrings.silkShovel;
        public static final String silkAxe = Reference.textureLoc + Strings.ToolStrings.silkAxe;
        public static final String silkHoe = Reference.textureLoc + Strings.ToolStrings.silkHoe;
        public static final String silkSword = Reference.textureLoc + Strings.ToolStrings.silkSword;

        public static final String redstonePickaxe = Reference.textureLoc + Strings.ToolStrings.redstonePickaxe;
        public static final String redstoneShovel = Reference.textureLoc + Strings.ToolStrings.redstoneShovel;
        public static final String redstoneAxe = Reference.textureLoc + Strings.ToolStrings.redstoneAxe;
        public static final String redstoneHoe = Reference.textureLoc + Strings.ToolStrings.redstoneHoe;
        public static final String redstoneSword = Reference.textureLoc + Strings.ToolStrings.redstoneSword;
    }


}
