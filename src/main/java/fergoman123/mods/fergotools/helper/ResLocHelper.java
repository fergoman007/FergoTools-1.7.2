package fergoman123.mods.fergotools.helper;

import fergoman123.mods.fergotools.lib.ModInfo;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Fergoman123 on 20/05/2014.
 */
public class ResLocHelper
{
    public static ResourceLocation getResourceLocation(String modid, String path)
    {
        return new ResourceLocation(modid, path);
    }

    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(ModInfo.modid.toLowerCase(), path);
    }
}
