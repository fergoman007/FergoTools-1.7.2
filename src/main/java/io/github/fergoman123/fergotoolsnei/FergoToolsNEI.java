package io.github.fergoman123.fergotoolsnei;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.helper.LogHelper;
import io.github.fergoman123.fergotoolsnei.nei.NEIFergoToolsConfig;
import io.github.fergoman123.fergoutil.lib.ModConstants;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Fergoman123.
 */
@Mod(modid = FergoToolsNEI.FergoToolsNEIInfo.modid, name = FergoToolsNEI.FergoToolsNEIInfo.name, version = FergoToolsNEI.FergoToolsNEIInfo.version, dependencies = ModConstants.dependency + ";required-after:FergoTools")
public class FergoToolsNEI
{
    public static final NEIFergoToolsConfig neiConfig = new NEIFergoToolsConfig();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        ModMetadata md = evt.getModMetadata();
        md.modId = FergoToolsNEIInfo.modid;
        md.name = FergoToolsNEIInfo.name;
        md.version = FergoToolsNEIInfo.version;
        md.authorList = FergoToolsNEIInfo.authorList;
        md.url = FergoToolsNEIInfo.url;
        md.updateUrl = FergoToolsNEIInfo.updateUrl;
        md.description = FergoToolsNEIInfo.description;
        md.logoFile = FergoToolsNEIInfo.logoFile;
        neiConfig.loadConfig();
    }

    public static final class FergoToolsNEIInfo
    {
        public static final String modid = "FergoToolsNEI";
        public static final String name = "Fergoman123's Tools NEI Plugin";
        public static final String version = "1.0.1";
        public static final String author = "Fergoman123";
        public static final List<String> authorList = Arrays.asList(author);
        public static final String url = "fergoman123.github.io";
        public static final String updateUrl = "fergoman123.github.io/fergotools.html";

        public static final String description = "Adds Not Enough Items functionality to FergoTools";

        public static final String logoFile = "/assets/fergotools/textures/art/logo.png";
    }
}
