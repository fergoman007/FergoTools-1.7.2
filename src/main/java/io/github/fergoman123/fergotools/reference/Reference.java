/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.reference;

import io.github.fergoman123.fergoutil.helper.NameHelper;

/**
 * a list of reference strings
 */
public class Reference {

    public static final String textureLoc = NameHelper.getAssetsLocation(ModInfo.modid);
    public static final String textureLocGui = NameHelper.getAssetsLocationGui(ModInfo.modid);
    public static final String dirGui = "textures/gui/";
    public static final String dirArmor = "textures/armor/";

    public static final String clientProxyClass = "io.github.fergoman123.fergotools.proxy.ClientProxy";
    public static final String serverProxyClass = "io.github.fergoman123.fergotools.proxy.ServerProxy";
    public static final String guiFactoryClass = "io.github.fergoman123.fergotools.client.GuiFactory";
    		

}
