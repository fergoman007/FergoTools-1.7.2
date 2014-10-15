package io.github.fergoman123.fergotools.reference;

import io.github.fergoman123.fergoutil.helper.NameHelper;

public class Reference {

    public static final String textureLoc = NameHelper.getAssetsLocation(ModInfo.modid);
    public static final String textureLocGui = NameHelper.getAssetsLocationGui(ModInfo.modid);
    public static final String dirGui = "textures/gui/";
    public static final String dirArmor = "textures/armor/";

    public static final String clientProxyClass = "io.github.fergoman123.fergotools.proxy.ClientProxy";
    public static final String serverProxyClass = "io.github.fergoman123.fergotools.proxy.ServerProxy";
    public static final String guiFactoryClass = "io.github.fergoman123.fergotools.client.GuiFactory";
    		

}
