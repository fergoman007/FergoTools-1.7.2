package fergoman123.mods.fergotools.reference;

import fergoman123.mods.fergoutil.helper.NameHelper;

public class Reference {

    public static final String textureLoc = NameHelper.getAssetsLocation(ModInfo.modid);
    public static final String textureLocGui = NameHelper.getAssetsLocationGui(ModInfo.modid);
    public static final String dirGui = "textures/gui/";
    public static final String dirArmor = "textures/armor/";

    public static final String clientProxyClass = "fergoman123.mods.fergotools.proxy.ClientProxy";
    public static final String serverProxyClass = "fergoman123.mods.fergotools.proxy.ServerProxy";
    public static final String guiFactoryClass = "fergoman123.mods.fergotools.client.GuiFactory";
    		

}
