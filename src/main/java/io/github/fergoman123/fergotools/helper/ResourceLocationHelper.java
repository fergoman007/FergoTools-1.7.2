/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.helper;

import io.github.fergoman123.fergotools.reference.gui.Reference;
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
}
