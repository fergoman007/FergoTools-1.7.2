/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.item.ArmorType;
import io.github.fergoman123.fergoutil.item.ItemArmorFergo;

public class ItemArmorFT extends ItemArmorFergo
{
    public ItemArmorFT(ArmorMaterial material, ArmorType type, String name) {
        super(material, 0, FergoTools.tabFergoTools, type, name);
    }
}
