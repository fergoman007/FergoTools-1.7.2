package io.github.fergoman123.fergotools.info;

import net.minecraft.util.ResourceLocation;
import io.github.fergoman123.fergotools.info.FurnaceConstants.Gui;

public class Textures
{
    public static final ResourceLocation quartzFurnaceGui = getFurnaceGuiTexture(Gui.quartzFurnace);
    public static final ResourceLocation obsidianFurnaceGui = getFurnaceGuiTexture(Gui.obsidianFurnace);
    public static final ResourceLocation emeraldFurnaceGui = getFurnaceGuiTexture(Gui.emeraldFurnace);
    public static final ResourceLocation lapisFurnaceGui = getFurnaceGuiTexture(Gui.lapisFurnace);
    public static final ResourceLocation bronzeFurnaceGui = getFurnaceGuiTexture(Gui.bronzeFurnace);
    public static final ResourceLocation coalFurnaceGui = getFurnaceGuiTexture(Gui.coalFurnace);
    public static final ResourceLocation glowstoneFurnaceGui = getFurnaceGuiTexture(Gui.glowstoneFurnace);
    public static final ResourceLocation adamantiumFurnaceGui = getFurnaceGuiTexture(Gui.adamantiumFurnace);
    public static final ResourceLocation silkFurnaceGui = getFurnaceGuiTexture(Gui.silkFurnace);
    public static final ResourceLocation redstoneFurnaceGui = getFurnaceGuiTexture(Gui.redstoneFurnace);
    public static final ResourceLocation maceratorGui = getFurnaceGuiTexture(Gui.macerator);

    public static final ResourceLocation vanillaFurnaceGui = new ResourceLocation("textures/gui/container/furnace.png");

    public static ResourceLocation getFurnaceGuiTexture(String texture)
    {
        return new ResourceLocation("fergotools", "textures/gui/furnace/" + texture + ".png");
    }


}
