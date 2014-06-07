package fergoman123.mods.fergotools.util;

import fergoman123.mods.fergotools.lib.Reference;
import net.minecraft.util.ResourceLocation;

public class UtilResourceLocation {

    public static ResourceLocation getResourceLocation(String modid, String path)
    {
        return new ResourceLocation(modid, path);
    }

    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(Reference.textureLocGui, path);
    }
}
