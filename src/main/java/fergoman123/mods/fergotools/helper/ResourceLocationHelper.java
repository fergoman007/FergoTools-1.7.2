package fergoman123.mods.fergotools.helper;

import fergoman123.mods.fergotools.lib.Reference;
import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper {

    public static ResourceLocation getModdedResourceLocation(String modid, String path)
    {
        return new ResourceLocation(modid, path);
    }

    public static ResourceLocation getModdedResourceLocation(String path)
    {
        return getModdedResourceLocation(Reference.textureLocGui, path);
    }

    public static ResourceLocation getVanillaResourceLocation(String path)
    {
        return new ResourceLocation(path);
    }
}
