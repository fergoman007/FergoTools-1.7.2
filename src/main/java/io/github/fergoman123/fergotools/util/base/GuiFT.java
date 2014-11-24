/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergoutil.client.gui.FergoGuiContainer;
import net.minecraft.inventory.Container;

public abstract class GuiFT extends FergoGuiContainer{

    /**
     * main constuctor
     * @param container the containe that the gui
     *                  is connected to.
     */
    public GuiFT(Container container) {
        super(container);
    }
}
