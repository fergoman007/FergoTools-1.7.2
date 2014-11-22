package io.github.fergoman123.fergotools.reference;

import io.github.fergoman123.fergotools.helper.ResourceLocationHelper;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import net.minecraft.util.ResourceLocation;

public class Textures
{
    public static final String resourcePrefix = ModInfo.modid.toLowerCase() + ":";

    public static final String armorSheetLocation = "textures/armor/";
    public static final String guiSheetLocation = "textures/gui/";

    public static final String guiWorkbench = "workbench/";
    public static final String guiFurnace = "furnace/";

    public static final String ctSide = "Side";
    public static final String ctTop = "Top";
    public static final String ctFront = "Front";

    public static final String ctmLoc = "ctm/glass/";
    public static final String ctLocSide = "ct/side/";
    public static final String ctLocTop = "ct/top/";
    public static final String ctLocFront =  "ct/front/";
    public static final String woodLoc = "wood/";
    public static final String stickLoc = "stick/";
    public static final String saplingLoc = "sapling/";

    public static final String png = ".png";

    public static final ResourceLocation quartzFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiFurnace + "quartzFurnace" + png);
    public static final ResourceLocation obsidianFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiFurnace + "obsidianFurnace" + png);
    public static final ResourceLocation emeraldFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiFurnace + "emeraldFurnace" + png);
    public static final ResourceLocation lapisFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiFurnace + "lapisFurnace" + png);
    public static final ResourceLocation bronzeFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiFurnace + "bronzeFurnace" + png);
    public static final ResourceLocation coalFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiFurnace + "coalFurnace" + png);
    public static final ResourceLocation glowstoneFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiFurnace + "glowstoneFurnace" + png);
    public static final ResourceLocation adamantiumFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiFurnace + "adamantiumFurnace" + png);
    public static final ResourceLocation silkFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiFurnace + "silkFurnace" + png);
    public static final ResourceLocation redstoneFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiFurnace + "redstoneFurnace" + png);
    public static final ResourceLocation maceratorGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiFurnace + "macerator" + png);

    public static final ResourceLocation obsidianWorkbenchGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiWorkbench + "obsidianWorkbench" + png);
    public static final ResourceLocation emeraldWorkbenchGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiWorkbench + "emeraldWorkbench" + png);
    public static final ResourceLocation lapisWorkbenchGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiWorkbench + "lapisWorkbench" + png);
    public static final ResourceLocation bronzeWorkbenchGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiWorkbench + "BronzeWorkbench" + png);
    public static final ResourceLocation coalWorkbenchGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiWorkbench + "coalWorkbench" + png);
    public static final ResourceLocation glowstoneWorkbenchGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiWorkbench + "glowstoneWorkbench" + png);
    public static final ResourceLocation adamantiumWorkbenchGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiWorkbench + "adamantiumWorkbench" + png);
    public static final ResourceLocation silkWorkbenchGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiWorkbench + "silkWorkbench" + png);
    public static final ResourceLocation redstoneWorkbenchGuiTexture = ResourceLocationHelper.getModdedResourceLocation(guiSheetLocation + guiWorkbench + "redstoneWorkbench" + png);

    public static final String quartzArmorLayer1 = resourcePrefix + armorSheetLocation + "quartz_1" + png;
    public static final String obsidianArmorLayer1 = resourcePrefix + armorSheetLocation + "obsidian_1" + png;
    public static final String emeraldArmorLayer1 = resourcePrefix + armorSheetLocation + "emerald_1" + png;
    public static final String lapisArmorLayer1 = resourcePrefix + armorSheetLocation + "lapis_1" + png;
    public static final String bronzeArmorLayer1 = resourcePrefix + armorSheetLocation + "bronze_1" + png;
    public static final String coalArmorLayer1 = resourcePrefix + armorSheetLocation + "coal_1" + png;
    public static final String glowstoneArmorLayer1 = resourcePrefix + armorSheetLocation + "glowstone_1" + png;
    public static final String adamantiumArmorLayer1 = resourcePrefix + armorSheetLocation + "adamantium_1" + png;
    public static final String redstoneArmorLayer1 = resourcePrefix + armorSheetLocation + "redstone_1" + png;

    public static final String quartzArmorLayer2 = resourcePrefix + armorSheetLocation + "quartz_2" + png;
    public static final String obsidianArmorLayer2 = resourcePrefix + armorSheetLocation + "obsidian_2" + png;
    public static final String emeraldArmorLayer2 = resourcePrefix + armorSheetLocation + "emerald_2" + png;
    public static final String lapisArmorLayer2 = resourcePrefix + armorSheetLocation + "lapis_2" + png;
    public static final String bronzeArmorLayer2 = resourcePrefix + armorSheetLocation + "bronze_2" + png;
    public static final String coalArmorLayer2 = resourcePrefix + armorSheetLocation + "coal_2" + png;
    public static final String glowstoneArmorLayer2 = resourcePrefix + armorSheetLocation + "glowstone_2" + png;
    public static final String adamantiumArmorLayer2 = resourcePrefix + armorSheetLocation + "adamantium_2" + png;
    public static final String redstoneArmorLayer2 = resourcePrefix + armorSheetLocation + "redstone_2" + png;

    public static final String quartzBowStandy = resourcePrefix + ItemNames.bowQuartz + "_0";
    public static final String quartzBowPull1 = resourcePrefix + ItemNames.bowQuartz + "_1";
    public static final String quartzBowPull2 = resourcePrefix + ItemNames.bowQuartz + "_2";
    public static final String quartzBowPull3 = resourcePrefix + ItemNames.bowQuartz + "_3";

    public static final String obsidianBowStandy = resourcePrefix + ItemNames.bowObsidian + "_0";
    public static final String obsidianBowPull1 = resourcePrefix + ItemNames.bowObsidian + "_1";
    public static final String obsidianBowPull2 = resourcePrefix + ItemNames.bowObsidian + "_2";
    public static final String obsidianBowPull3 = resourcePrefix + ItemNames.bowObsidian + "_3";

    public static final String emeraldBowStandy = resourcePrefix + ItemNames.bowEmerald + "_0";
    public static final String emeraldBowPull1 = resourcePrefix + ItemNames.bowEmerald + "_1";
    public static final String emeraldBowPull2 = resourcePrefix + ItemNames.bowEmerald + "_2";
    public static final String emeraldBowPull3 = resourcePrefix + ItemNames.bowEmerald + "_3";

    public static final String lapisBowStandy = resourcePrefix + ItemNames.bowLapis + "_0";
    public static final String lapisBowPull1 = resourcePrefix + ItemNames.bowLapis + "_1";
    public static final String lapisBowPull2 = resourcePrefix + ItemNames.bowLapis + "_2";
    public static final String lapisBowPull3 = resourcePrefix + ItemNames.bowLapis + "_3";

    public static final String bronzeBowStandy = resourcePrefix + ItemNames.bowBronze + "_0";
    public static final String bronzeBowPull1 = resourcePrefix + ItemNames.bowBronze + "_1";
    public static final String bronzeBowPull2 = resourcePrefix + ItemNames.bowBronze + "_2";
    public static final String bronzeBowPull3 = resourcePrefix + ItemNames.bowBronze + "_3";

    public static final String coalBowStandy = resourcePrefix + ItemNames.bowCoal + "_0";
    public static final String coalBowPull1 = resourcePrefix + ItemNames.bowCoal + "_1";
    public static final String coalBowPull2 = resourcePrefix + ItemNames.bowCoal + "_2";
    public static final String coalBowPull3 = resourcePrefix + ItemNames.bowCoal + "_3";

    public static final String glowstoneBowStandy = resourcePrefix + ItemNames.bowGlowstone + "_0";
    public static final String glowstoneBowPull1 = resourcePrefix + ItemNames.bowGlowstone + "_1";
    public static final String glowstoneBowPull2 = resourcePrefix + ItemNames.bowGlowstone + "_2";
    public static final String glowstoneBowPull3 = resourcePrefix + ItemNames.bowGlowstone + "_3";

    public static final String adamantiumBowStandy = resourcePrefix + ItemNames.bowAdamantium + "_0";
    public static final String adamantiumBowPull1 = resourcePrefix + ItemNames.bowAdamantium + "_1";
    public static final String adamantiumBowPull2 = resourcePrefix + ItemNames.bowAdamantium + "_2";
    public static final String adamantiumBowPull3 = resourcePrefix + ItemNames.bowAdamantium + "_3";

    public static final String blockFergoGlass = BlockNames.blockFergoGlass;
    public static final String blockFergoGlass0 = blockFergoGlass + "_0";
    public static final String blockFergoGlass1 = blockFergoGlass + "_1";
    public static final String blockFergoGlass2 = blockFergoGlass + "_2";
    public static final String blockFergoGlass3 = blockFergoGlass + "_3";
    public static final String blockFergoGlass4 = blockFergoGlass + "_4";
    public static final String blockFergoGlass5 = blockFergoGlass + "_5";
    public static final String blockFergoGlass6 = blockFergoGlass + "_6";
    public static final String blockFergoGlass7 = blockFergoGlass + "_7";
    public static final String blockFergoGlass8 = blockFergoGlass + "_8";
    public static final String blockFergoGlass9 = blockFergoGlass + "_9";
    public static final String blockFergoGlass10 = blockFergoGlass + "_10";
    public static final String blockFergoGlass11 = blockFergoGlass + "_11";
    public static final String blockFergoGlass12 = blockFergoGlass + "_12";
    public static final String blockFergoGlass13 = blockFergoGlass + "_13";
    public static final String blockFergoGlass14 = blockFergoGlass + "_14";

    public static final String[] blockFergoGlassTex =
            {
                    blockFergoGlass,
                    blockFergoGlass0,
                    blockFergoGlass1,
                    blockFergoGlass2,
                    blockFergoGlass3,
                    blockFergoGlass4,
                    blockFergoGlass5,
                    blockFergoGlass6,
                    blockFergoGlass7,
                    blockFergoGlass8,
                    blockFergoGlass9,
                    blockFergoGlass10,
                    blockFergoGlass11,
                    blockFergoGlass12,
                    blockFergoGlass13,
                    blockFergoGlass14
            };

    public static final String[] obsidianWorkbenchTextures =
            {
                    Reference.textureLoc + ctLocSide + BlockNames.obsidianWorkbench + ctSide,
                    Reference.textureLoc + ctLocTop + BlockNames.obsidianWorkbench + ctTop,
                    Reference.textureLoc + ctLocFront + BlockNames.obsidianWorkbench + ctFront
            };

    public static final String[] emeraldWorkbenchTextures =
            {
                    Reference.textureLoc + ctLocSide + BlockNames.emeraldWorkbench + ctSide,
                    Reference.textureLoc + ctLocTop + BlockNames.emeraldWorkbench + ctTop,
                    Reference.textureLoc + ctLocFront + BlockNames.emeraldWorkbench + ctFront
            };

    public static final String[] lapisWorkbenchTextures =
            {
                    Reference.textureLoc + ctLocSide + BlockNames.lapisWorkbench + ctSide,
                    Reference.textureLoc + ctLocTop + BlockNames.lapisWorkbench + ctTop,
                    Reference.textureLoc + ctLocFront + BlockNames.lapisWorkbench + ctFront
            };

    public static final String[] bronzeWorkbenchTextures =
            {
                    Reference.textureLoc + ctLocSide + BlockNames.bronzeWorkbench + ctSide,
                    Reference.textureLoc + ctLocTop + BlockNames.bronzeWorkbench + ctTop,
                    Reference.textureLoc + ctLocFront + BlockNames.bronzeWorkbench + ctFront
            };

    public static final String[] coalWorkbenchTextures =
            {
                    Reference.textureLoc + ctLocSide + BlockNames.coalWorkbench + ctSide,
                    Reference.textureLoc + ctLocTop + BlockNames.coalWorkbench + ctTop,
                    Reference.textureLoc + ctLocFront + BlockNames.coalWorkbench + ctFront
            };

    public static final String[] glowstoneWorkbenchTextures =
            {
                    Reference.textureLoc + ctLocSide + BlockNames.glowstoneWorkbench + ctSide,
                    Reference.textureLoc + ctLocTop + BlockNames.glowstoneWorkbench + ctTop,
                    Reference.textureLoc + ctLocFront + BlockNames.glowstoneWorkbench + ctFront
            };

    public static final String[] adamantiumWorkbenchTextures =
            {
                    Reference.textureLoc + ctLocSide + BlockNames.adamantiumWorkbench + ctSide,
                    Reference.textureLoc + ctLocTop + BlockNames.adamantiumWorkbench + ctTop,
                    Reference.textureLoc + ctLocFront + BlockNames.adamantiumWorkbench + ctFront
            };

    public static final String[] silkWorkbenchTextures =
            {
                    Reference.textureLoc + ctLocSide + BlockNames.silkWorkbench + ctSide,
                    Reference.textureLoc + ctLocTop + BlockNames.silkWorkbench + ctTop,
                    Reference.textureLoc + ctLocFront + BlockNames.silkWorkbench + ctFront
            };

    public static final String[] redstoneWorkbenchTextures =
            {
                    Reference.textureLoc + ctLocSide + BlockNames.redstoneWorkbench + ctSide,
                    Reference.textureLoc + ctLocTop + BlockNames.redstoneWorkbench + ctTop,
                    Reference.textureLoc + ctLocFront + BlockNames.redstoneWorkbench + ctFront
            };

    public static final String logObsidian = Reference.textureLoc + woodLoc + BlockNames.logObsidian;
    public static final String logEmerald = Reference.textureLoc + woodLoc + BlockNames.logEmerald;
    public static final String logLapis = Reference.textureLoc + woodLoc + BlockNames.logLapis;
    public static final String logBronze = Reference.textureLoc + woodLoc + BlockNames.logBronze;
    public static final String logCoal = Reference.textureLoc + woodLoc + BlockNames.logCoal;
    public static final String logGlowstone = Reference.textureLoc + woodLoc + BlockNames.logGlowstone;
    public static final String logAdamantium = Reference.textureLoc + woodLoc + BlockNames.logAdamantium;
    public static final String logSilk = Reference.textureLoc + woodLoc + BlockNames.logSilk;
    public static final String logRedstone = Reference.textureLoc + woodLoc + BlockNames.logRedstone;

    public static final String[] logSides = {logObsidian, logEmerald, logLapis, logBronze, logCoal, logGlowstone, logAdamantium, logSilk, logRedstone};

    public static final String logObsidianTop = Reference.textureLoc + woodLoc + BlockNames.logObsidian + ctTop;
    public static final String logEmeraldTop = Reference.textureLoc + woodLoc + BlockNames.logEmerald + ctTop;
    public static final String logLapisTop = Reference.textureLoc + woodLoc + BlockNames.logLapis + ctTop;
    public static final String logBronzeTop = Reference.textureLoc + woodLoc + BlockNames.logBronze + ctTop;
    public static final String logCoalTop = Reference.textureLoc + woodLoc + BlockNames.logCoal + ctTop;
    public static final String logGlowstoneTop = Reference.textureLoc + woodLoc + BlockNames.logGlowstone + ctTop;
    public static final String logAdamantiumTop = Reference.textureLoc + woodLoc + BlockNames.logAdamantium + ctTop;
    public static final String logSilkTop = Reference.textureLoc + woodLoc + BlockNames.logSilk + ctTop;
    public static final String logRedstoneTop = Reference.textureLoc + woodLoc + BlockNames.logRedstone + ctTop;
    public static final String[] logTops = {logObsidianTop, logEmeraldTop, logLapisTop, logBronzeTop, logCoalTop, logGlowstoneTop, logAdamantiumTop, logSilkTop, logRedstoneTop};

    public static final String plankObsidian = Reference.textureLoc + woodLoc + BlockNames.plankObsidian;
    public static final String plankEmerald = Reference.textureLoc + woodLoc + BlockNames.plankEmerald;
    public static final String plankLapis = Reference.textureLoc + woodLoc + BlockNames.plankLapis;
    public static final String plankBronze = Reference.textureLoc + woodLoc + BlockNames.plankBronze;
    public static final String plankCoal = Reference.textureLoc + woodLoc + BlockNames.plankCoal;
    public static final String plankGlowstone = Reference.textureLoc + woodLoc + BlockNames.plankGlowstone;
    public static final String plankAdamantium = Reference.textureLoc + woodLoc + BlockNames.plankAdamantium;
    public static final String plankSilk = Reference.textureLoc + woodLoc + BlockNames.plankSilk;
    public static final String plankRedstone = Reference.textureLoc + woodLoc + BlockNames.plankRedstone;

    public static final String[] planks = {plankObsidian, plankEmerald, plankLapis, plankBronze, plankCoal, plankGlowstone, plankAdamantium, plankSilk, plankRedstone};

    public static final String leavesObsidianNormal = "FergoTools:leaves/normal/leavesObsidian";
    public static final String leavesEmeraldNormal = "FergoTools:leaves/normal/leavesEmerald";
    public static final String leavesLapisNormal = "FergoTools:leaves/normal/leavesLapis";
    public static final String leavesBronzeNormal = "FergoTools:leaves/normal/leavesBronze";
    public static final String leavesCoalNormal = "FergoTools:leaves/normal/leavesCoal";
    public static final String leavesGlowstoneNormal = "FergoTools:leaves/normal/leavesGlowstone";
    public static final String leavesAdamantiumNormal = "FergoTools:leaves/normal/leavesAdamantium";
    public static final String leavesSilkNormal = "FergoTools:leaves/normal/leavesSilk";
    public static final String leavesRedstoneNormal = "FergoTools:leaves/normal/leavesRedstone";

    public static final String[] leavesNormal = {leavesObsidianNormal, leavesEmeraldNormal, leavesLapisNormal, leavesBronzeNormal, leavesCoalNormal, leavesGlowstoneNormal, leavesAdamantiumNormal, leavesSilkNormal, leavesRedstoneNormal};

    public static final String leavesObsidianOpaque = "FergoTools:leaves/opaque/leavesObsidianOpaque";
    public static final String leavesEmeraldOpaque = "FergoTools:leaves/opaque/leavesObsidianOpaque";
    public static final String leavesLapisOpaque = "FergoTools:leaves/opaque/leavesObsidianOpaque";
    public static final String leavesBronzeOpaque = "FergoTools:leaves/opaque/leavesObsidianOpaque";
    public static final String leavesCoalOpaque = "FergoTools:leaves/opaque/leavesObsidianOpaque";
    public static final String leavesGlowstoneOpaque = "FergoTools:leaves/opaque/leavesObsidianOpaque";
    public static final String leavesAdamantiumOpaque = "FergoTools:leaves/opaque/leavesObsidianOpaque";
    public static final String leavesSilkOpaque = "FergoTools:leaves/opaque/leavesObsidianOpaque";
    public static final String leavesRedstoneOpaque = "FergoTools:leaves/opaque/leavesObsidianOpaque";

    public static final String[] leavesOpaque = {leavesObsidianOpaque, leavesEmeraldOpaque, leavesLapisOpaque, leavesBronzeOpaque, leavesCoalOpaque, leavesGlowstoneOpaque, leavesAdamantiumOpaque, leavesSilkOpaque, leavesRedstoneOpaque};





}
