package fergoman123.mods.fergotools.lib;

/**
 * Created by Fergoman123 on 03/05/2014.
 */
import fergoman123.mods.fergotools.lib.Strings.BlockStrings;
import fergoman123.mods.fergotools.lib.Strings.BowStrings;

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

        public static final String quartzArmorRender1 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.quartzToolMat + renderNum[0] + Strings.png;
        public static final String quartzArmorRender2 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.quartzToolMat + renderNum[1] + Strings.png;

        public static final String obsidianArmorRender1 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.obsidianToolMat + renderNum[0] + Strings.png;
        public static final String obsidianArmorRender2 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.obsidianToolMat + renderNum[1] + Strings.png;

        public static final String emeraldArmorRender1 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.emeraldToolMat + renderNum[0] + Strings.png;
        public static final String emeraldArmorRender2 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.emeraldToolMat + renderNum[1] + Strings.png;

        public static final String lapisArmorRender1 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.lapisToolMat + renderNum[0] + Strings.png;
        public static final String lapisArmorRender2 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.lapisToolMat + renderNum[1] + Strings.png;

        public static final String bronzeArmorRender1 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.bronzeToolMat + renderNum[0] + Strings.png;
        public static final String bronzeArmorRender2 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.bronzeToolMat + renderNum[1] + Strings.png;

        public static final String coalArmorRender1 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.coalToolMat + renderNum[0] + Strings.png;
        public static final String coalArmorRender2 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.coalToolMat + renderNum[1] + Strings.png;

        public static final String glowstoneArmorRender1 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.glowstoneToolMat + renderNum[0] + Strings.png;
        public static final String glowstoneArmorRender2 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.glowstoneToolMat + renderNum[1] + Strings.png;

        public static final String redstoneArmorRender1 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.redstoneToolMat + renderNum[0] + Strings.png;
        public static final String redstoneArmorRender2 = Reference.textureLoc + Reference.dirArmor + Strings.MaterialStrings.redstoneToolMat + renderNum[1] + Strings.png;

        public static final String quartzHelmet = Reference.textureLoc + Strings.ArmorStrings.quartzArmorKey[armorSlots[0]];
        public static final String quartzChestplate = Reference.textureLoc + Strings.ArmorStrings.quartzArmorKey[armorSlots[1]];
        public static final String quartzLeggings = Reference.textureLoc + Strings.ArmorStrings.quartzArmorKey[armorSlots[2]];
        public static final String quartzBoots = Reference.textureLoc + Strings.ArmorStrings.quartzArmorKey[armorSlots[3]];

        public static final String obsidianHelmet = Reference.textureLoc + Strings.ArmorStrings.obsidianArmorKey[armorSlots[0]];
        public static final String obsidianChestplate = Reference.textureLoc + Strings.ArmorStrings.obsidianArmorKey[armorSlots[1]];
        public static final String obsidianLeggings = Reference.textureLoc + Strings.ArmorStrings.obsidianArmorKey[armorSlots[2]];
        public static final String obsidianBoots = Reference.textureLoc + Strings.ArmorStrings.obsidianArmorKey[armorSlots[3]];

        public static final String emeraldHelmet = Reference.textureLoc + Strings.ArmorStrings.emeraldArmorKey[armorSlots[0]];
        public static final String emeraldChestplate = Reference.textureLoc + Strings.ArmorStrings.emeraldArmorKey[armorSlots[1]];
        public static final String emeraldLeggings = Reference.textureLoc + Strings.ArmorStrings.emeraldArmorKey[armorSlots[2]];
        public static final String emeraldBoots = Reference.textureLoc + Strings.ArmorStrings.emeraldArmorKey[armorSlots[3]];

        public static final String lapisHelmet = Reference.textureLoc + Strings.ArmorStrings.lapisArmorKey[armorSlots[0]];
        public static final String lapisChestplate = Reference.textureLoc + Strings.ArmorStrings.lapisArmorKey[armorSlots[1]];
        public static final String lapisLeggings = Reference.textureLoc + Strings.ArmorStrings.lapisArmorKey[armorSlots[2]];
        public static final String lapisBoots = Reference.textureLoc + Strings.ArmorStrings.lapisArmorKey[armorSlots[3]];

        public static final String bronzeHelmet = Reference.textureLoc + Strings.ArmorStrings.bronzeArmorKey[armorSlots[0]];
        public static final String bronzeChestplate = Reference.textureLoc + Strings.ArmorStrings.bronzeArmorKey[armorSlots[1]];
        public static final String bronzeLeggings = Reference.textureLoc + Strings.ArmorStrings.bronzeArmorKey[armorSlots[2]];
        public static final String bronzeBoots = Reference.textureLoc + Strings.ArmorStrings.bronzeArmorKey[armorSlots[3]];

        public static final String coalHelmet = Reference.textureLoc + Strings.ArmorStrings.coalArmorKey[armorSlots[0]];
        public static final String coalChestplate = Reference.textureLoc + Strings.ArmorStrings.coalArmorKey[armorSlots[1]];
        public static final String coalLeggings = Reference.textureLoc + Strings.ArmorStrings.coalArmorKey[armorSlots[2]];
        public static final String coalBoots = Reference.textureLoc + Strings.ArmorStrings.coalArmorKey[armorSlots[3]];

        public static final String glowstoneHelmet = Reference.textureLoc + Strings.ArmorStrings.glowstoneArmorKey[armorSlots[0]];
        public static final String glowstoneChestplate = Reference.textureLoc + Strings.ArmorStrings.glowstoneArmorKey[armorSlots[1]];
        public static final String glowstoneLeggings = Reference.textureLoc + Strings.ArmorStrings.glowstoneArmorKey[armorSlots[2]];
        public static final String glowstoneBoots = Reference.textureLoc + Strings.ArmorStrings.glowstoneArmorKey[armorSlots[3]];

        public static final String redstoneHelmet = Reference.textureLoc + Strings.ArmorStrings.redstoneArmorKey[armorSlots[0]];
        public static final String redstoneChestplate = Reference.textureLoc + Strings.ArmorStrings.redstoneArmorKey[armorSlots[1]];
        public static final String redstoneLeggings = Reference.textureLoc + Strings.ArmorStrings.redstoneArmorKey[armorSlots[2]];
        public static final String redstoneBoots = Reference.textureLoc + Strings.ArmorStrings.redstoneArmorKey[armorSlots[3]];
    }

    public static class BlockTextures
    {
        public static final String oreExperience =  Reference.textureLoc + BlockStrings.oreExperience;
        public static final String oreObsidian =  Reference.textureLoc + BlockStrings.oreObsidian;
        public static final String oreEmeraldCrystal =  Reference.textureLoc + BlockStrings.oreEmeraldCrystal;
        public static final String oreLapisCrystal =  Reference.textureLoc + BlockStrings.oreLapisCrystal;
        public static final String oreBronze =  Reference.textureLoc + BlockStrings.oreBronze;
        public static final String oreAdamantium = Reference.textureLoc +  BlockStrings.oreAdamantium;
        public static final String oreRedstone = Reference.textureLoc + BlockStrings.oreRedstone;

        public static final String blockExperience = Reference.textureLoc +  BlockStrings.blockExperience;
        public static final String blockObsidian =  Reference.textureLoc + BlockStrings.blockObsidian;
        public static final String blockEmeraldCrystal = Reference.textureLoc + BlockStrings.blockEmeraldCrystal;
        public static final String blockLapisCrystal =  Reference.textureLoc + BlockStrings.blockLapisCrystal;
        public static final String blockBronze =  Reference.textureLoc + BlockStrings.blockBronze;
        public static final String blockCoal =  Reference.textureLoc + BlockStrings.blockCoal;
        public static final String blockGlowstone =  Reference.textureLoc + BlockStrings.blockGlowstone;
        public static final String blockAdamantium =  Reference.textureLoc + BlockStrings.blockAdamantium;
        public static final String blockSilkGem = Reference.textureLoc + BlockStrings.blockSilkGem;
        public static final String blockRedstone = Reference.textureLoc + BlockStrings.blockRedstone;
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
        public static final String quartzFurnaceIdle = Strings.FurnaceStrings.quartzFurnaceIdle;
        public static final String quartzFurnaceActive = Strings.FurnaceStrings.quartzFurnaceActive;
        public static final String quartzFurnaceSide = Reference.textureLoc + Strings.FurnaceStrings.quartzFurnaceSide;

        public static final String obsidianFurnaceIdle = Strings.FurnaceStrings.obsidianFurnaceIdle;
        public static final String obsidianFurnaceActive = Strings.FurnaceStrings.obsidianFurnaceActive;

        public static final String emeraldCrystalFurnaceIdle = Strings.FurnaceStrings.emeraldCrystalFurnaceIdle;
        public static final String emeraldCrystalFurnaceActive = Strings.FurnaceStrings.emeraldCrystalFurnaceActive;

        public static final String lapisCrystalFurnaceIdle = Strings.FurnaceStrings.lapisCrystalFurnaceIdle;
        public static final String lapisCrystalFurnaceActive = Strings.FurnaceStrings.lapisCrystalFurnaceActive;

        public static final String bronzeFurnaceIdle = Strings.FurnaceStrings.bronzeFurnaceIdle;
        public static final String bronzeFurnaceActive = Strings.FurnaceStrings.bronzeFurnaceActive;

        public static final String coalFurnaceIdle = Strings.FurnaceStrings.coalFurnaceIdle;
        public static final String coalFurnaceActive = Strings.FurnaceStrings.coalFurnaceActive;

        public static final String glowstoneFurnaceIdle = Strings.FurnaceStrings.glowstoneFurnaceIdle;
        public static final String glowstoneFurnaceActive = Strings.FurnaceStrings.glowstoneFurnaceActive;

        public static final String adamantiumFurnaceIdle = Strings.FurnaceStrings.adamantiumFurnaceIdle;
        public static final String adamantiumFurnaceActive = Strings.FurnaceStrings.adamantiumFurnaceActive;

        public static final String silkFurnaceIdle = Strings.FurnaceStrings.silkFurnaceIdle;
        public static final String silkFurnaceActive = Strings.FurnaceStrings.silkFurnaceActive;

        public static final String redstoneFurnaceIdle = Strings.FurnaceStrings.redstoneFurnaceIdle;
        public static final String redstoneFurnaceActive = Strings.FurnaceStrings.redstoneFurnaceActive;
    }

    public static class ItemTextures
    {
        public static final String obsidianIngot = Reference.textureLoc + Strings.ItemStrings.materials[0];
        public static final String emeraldCrystal = Reference.textureLoc + Strings.ItemStrings.materials[1];
        public static final String lapisCrystal = Reference.textureLoc + Strings.ItemStrings.materials[2];
        public static final String bronzeIngot = Reference.textureLoc + Strings.ItemStrings.materials[3];
        public static final String coalIngot = Reference.textureLoc + Strings.ItemStrings.materials[4];
        public static final String glowstoneIngot = Reference.textureLoc + Strings.ItemStrings.materials[5];
        public static final String adamantiumIngot = Reference.textureLoc + Strings.ItemStrings.materials[6];
        public static final String expShard = Reference.textureLoc + Strings.ItemStrings.materials[7];
        public static final String silkGem = Reference.textureLoc + Strings.ItemStrings.materials[8];
        public static final String redstoneCrystal = Reference.textureLoc + Strings.ItemStrings.materials[9];
    }

    public static class ToolTextures
    {
        public static final String quartzPickaxe = Reference.textureLoc + Strings.ToolStrings.quartzPickaxe;
        public static final String quartzShovel = Reference.textureLoc + Strings.ToolStrings.quartzShovel;
        public static final String quartzAxe = Reference.textureLoc + Strings.ToolStrings.quartzAxe;
        public static final String quartzHoe = Reference.textureLoc + Strings.ToolStrings.quartzHoe;
        public static final String quartzSword = Reference.textureLoc + Strings.ToolStrings.quartzSword;

        public static final String obsidianPickaxe = Reference.textureLoc + Strings.ToolStrings.obsidianPickaxe;
        public static final String obsidianShovel = Reference.textureLoc + Strings.ToolStrings.obsidianShovel;
        public static final String obsidianAxe = Reference.textureLoc + Strings.ToolStrings.obsidianAxe;
        public static final String obsidianHoe = Reference.textureLoc + Strings.ToolStrings.obsidianHoe;
        public static final String obsidianSword = Reference.textureLoc + Strings.ToolStrings.obsidianSword;

        public static final String emeraldPickaxe = Reference.textureLoc + Strings.ToolStrings.emeraldPickaxe;
        public static final String emeraldShovel = Reference.textureLoc + Strings.ToolStrings.emeraldShovel;
        public static final String emeraldAxe = Reference.textureLoc + Strings.ToolStrings.emeraldAxe;
        public static final String emeraldHoe = Reference.textureLoc + Strings.ToolStrings.emeraldHoe;
        public static final String emeraldSword = Reference.textureLoc + Strings.ToolStrings.emeraldSword;

        public static final String lapisPickaxe = Reference.textureLoc + Strings.ToolStrings.lapisPickaxe;
        public static final String lapisShovel = Reference.textureLoc + Strings.ToolStrings.lapisShovel;
        public static final String lapisAxe = Reference.textureLoc + Strings.ToolStrings.lapisAxe;
        public static final String lapisHoe = Reference.textureLoc + Strings.ToolStrings.lapisHoe;
        public static final String lapisSword = Reference.textureLoc + Strings.ToolStrings.lapisSword;

        public static final String bronzePickaxe = Reference.textureLoc + Strings.ToolStrings.bronzePickaxe;
        public static final String bronzeShovel = Reference.textureLoc + Strings.ToolStrings.bronzeShovel;
        public static final String bronzeAxe = Reference.textureLoc + Strings.ToolStrings.bronzeAxe;
        public static final String bronzeHoe = Reference.textureLoc + Strings.ToolStrings.bronzeHoe;
        public static final String bronzeSword = Reference.textureLoc + Strings.ToolStrings.bronzeSword;

        public static final String coalPickaxe = Reference.textureLoc + Strings.ToolStrings.coalPickaxe;
        public static final String coalShovel = Reference.textureLoc + Strings.ToolStrings.coalShovel;
        public static final String coalAxe = Reference.textureLoc + Strings.ToolStrings.coalAxe;
        public static final String coalHoe = Reference.textureLoc + Strings.ToolStrings.coalHoe;
        public static final String coalSword = Reference.textureLoc + Strings.ToolStrings.coalSword;

        public static final String glowstonePickaxe = Reference.textureLoc + Strings.ToolStrings.glowstonePickaxe;
        public static final String glowstoneShovel = Reference.textureLoc + Strings.ToolStrings.glowstoneShovel;
        public static final String glowstoneAxe = Reference.textureLoc + Strings.ToolStrings.glowstoneAxe;
        public static final String glowstoneHoe = Reference.textureLoc + Strings.ToolStrings.glowstoneHoe;
        public static final String glowstoneSword = Reference.textureLoc + Strings.ToolStrings.glowstoneSword;

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
