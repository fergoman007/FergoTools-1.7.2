package fergoman123.mods.fergotools.util;

import net.minecraft.util.ResourceLocation;

/**
 * Created by Fergoman123 on 03/05/2014.
 */
public class UtilResourceLocation {

    public static ResourceLocation getResourceLocation(String modid, String path)
    {
        return new ResourceLocation(modid, path);
    }
}
