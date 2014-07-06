package fergoman123.mods.fergotools.lib.strings;

import fergoman123.mods.fergotools.helper.ResourceLocationHelper;
import fergoman123.mods.fergotools.lib.Reference;
import net.minecraft.util.ResourceLocation;

public class GuiStrings
{
    public static final String modPrefix = Reference.textureLoc;
    public static final String containerPrefix = "container." + modPrefix;

    public static final String containerInventory = "container.inventory";

    public static final String furnaceGuiTexture = "furnaceGui.png";
    public static final String lapisFurnaceGui = "lapisFurnaceGui.png";
    public static final String redstoneFurnaceGui = "redstoneFurnaceGui.png";
    public static final String maceratorGui = "maceratorGui.png";
    public static final String lapisFurnaceGuiLoc = Reference.dirGui + lapisFurnaceGui;
    public static final String redstoneFurnaceGuiLoc = Reference.dirGui + redstoneFurnaceGui;
    public static final String maceratorGuiLoc = Reference.dirGui + maceratorGui;
    public static final String vanillaFurnaceTexture = "textures/gui/container/furnace.png";

    public static final ResourceLocation lapisFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(lapisFurnaceGuiLoc);
    public static final ResourceLocation redstoneFurnaceGuiTexture = ResourceLocationHelper.getModdedResourceLocation(redstoneFurnaceGuiLoc);
    public static final ResourceLocation maceratorGuiTexture = ResourceLocationHelper.getModdedResourceLocation(maceratorGuiLoc);
    public static final ResourceLocation vanillaFurnace = ResourceLocationHelper.getVanillaResourceLocation(vanillaFurnaceTexture);
}
