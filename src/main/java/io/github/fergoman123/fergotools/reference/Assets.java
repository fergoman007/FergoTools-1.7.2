package io.github.fergoman123.fergotools.reference;

import io.github.fergoman123.fergotools.util.ResLocFT;

public class Assets {

    public static final class Locale{
        public static final String toolMat = getToolTip("toolmat");
        public static final String uses = getToolTip("uses");
        public static final String hl = getToolTip("hl");
        public static final String eff = getToolTip("eff");
        public static final String dve = getToolTip("dve");
        public static final String ench = getToolTip("ftench");
        public static final String rpitem = getToolTip("rpitem");

        public static final String containerQuartzFurnace = getContainerTooltip("quartzFurnace");
        public static final String containerObsidianFurnace = getContainerTooltip("obsidianFurnace");
        public static final String containerEmeraldFurnace = getContainerTooltip("emeraldFurnace");
        public static final String containerLapisFurnace = getContainerTooltip("lapisFurnace");
        public static final String containerBronzeFurnace = getContainerTooltip("bronzeFurnace");
        public static final String containerCoalFurnace = getContainerTooltip("coalFurnace");
        public static final String containerGlowstoneFurnace = getContainerTooltip("glowstoneFurnace");
        public static final String containerAdamantiumFurnace = getContainerTooltip("adamantiumFurnace");
        public static final String containerSilkFurnace = getContainerTooltip("silkFurnace");
        public static final String containerRedstoneFurnace = getContainerTooltip("redstoneFurnace");
        public static final String containerMacerator = getContainerTooltip("macerator");

        public static final String containerObsidianWorkbench = getContainerTooltip("obsidianWorkbench");
        public static final String containerEmeraldWorkbench = getContainerTooltip("emeraldWorkbench");
        public static final String containerLapisWorkbench = getContainerTooltip("lapisWorkbench");
        public static final String containerBronzeWorkbench = getContainerTooltip("BronzeWorkbench");
        public static final String containerCoalWorkbench = getContainerTooltip("coalWorkbench");
        public static final String containergGlowstoneWorkbench = getContainerTooltip("glowstoneWorkbench");
        public static final String containerAdamantiumWorkbench = getContainerTooltip("adamantiumWorkbench");
        public static final String containerSilkWorkbench = getContainerTooltip("silkWorkbench");
        public static final String containerRedstoneWorkbench = getContainerTooltip("redstoneWorkbench");

        public static final String oreDictName = "ft.oredict.name";

        public static String getToolTip(String tooltip){
            return "ft.tooltip." + tooltip;
        }
        public static String getContainerTooltip(String invName){
            return "ft.container." + invName;
        }
    }

    public static final class GuiTextures{
        public static final ResLocFT quartzFurnaceGui = getFurnaceGui("quartzFurnace");
        public static final ResLocFT obsidianFurnaceGui = getFurnaceGui("obsidianFurnace");
        public static final ResLocFT emeraldFurnaceGui = getFurnaceGui("emeraldFurnace");
        public static final ResLocFT lapisFurnaceGui = getFurnaceGui("lapisFurnace");
        public static final ResLocFT bronzeFurnaceGui = getFurnaceGui("bronzeFurnace");
        public static final ResLocFT coalFurnaceGui = getFurnaceGui("coalFurnace");
        public static final ResLocFT glowstoneFurnaceGui = getFurnaceGui("glowstoneFurnace");
        public static final ResLocFT adamantiumFurnace = getFurnaceGui("adamantiumFurnace");
        public static final ResLocFT silkFurnace = getFurnaceGui("silkFurnace");
        public static final ResLocFT redstoneFurnace = getFurnaceGui("redstoneFurnace");
        public static final ResLocFT macerator = getFurnaceGui("macerator");

        public static final ResLocFT obsidianWorkbenchGui = getWorkbenchGui("obsidianWorkbench");
        public static final ResLocFT emeraldWorkbenchGui = getWorkbenchGui("emeraldWorkbench");
        public static final ResLocFT lapisWorkbenchGuiTexture = getWorkbenchGui("lapisWorkbench");
        public static final ResLocFT bronzeWorkbenchGuiTexture = getWorkbenchGui("BronzeWorkbench");
        public static final ResLocFT coalWorkbenchGuiTexture = getWorkbenchGui("coalWorkbench");
        public static final ResLocFT glowstoneWorkbenchGuiTexture = getWorkbenchGui("glowstoneWorkbench");
        public static final ResLocFT adamantiumWorkbenchGui = getWorkbenchGui("adamantiumWorkbench");
        public static final ResLocFT silkWorkbenchGuiTexture = getWorkbenchGui("silkWorkbench");
        public static final ResLocFT redstoneWorkbenchGui = getWorkbenchGui("redstoneWorkbench");
    }

    public static ResLocFT getFurnaceGui(String textureName){
        return new ResLocFT("textures/gui/furnace/" + textureName + ".png");
    }

    public static ResLocFT getWorkbenchGui(String textureName){
        return new ResLocFT("textures/gui/workbench/" + textureName + ".png");
    }
}
