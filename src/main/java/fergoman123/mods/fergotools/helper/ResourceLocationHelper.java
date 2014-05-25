package fergoman123.mods.fergotools.helper;

import fergoman123.mods.fergotools.lib.Reference;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Fergoman123 on 23/05/2014.
 */
public class ResourceLocationHelper {

    public static ResourceLocation getResourceLocation(String modid, String path)
    {
        return new ResourceLocation(modid, path);
    }

    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(Reference.textureLocGui, path);
    }
}
