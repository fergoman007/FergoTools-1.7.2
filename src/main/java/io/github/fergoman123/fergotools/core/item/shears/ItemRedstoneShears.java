/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.item.shears;

import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemShearsFT;

public final class ItemRedstoneShears extends ItemShearsFT
{

    public ItemRedstoneShears(String itemName) {
        super(Materials.Tools.redstone.getMaxUses(), itemName);
    }
}
