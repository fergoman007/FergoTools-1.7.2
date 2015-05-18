/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.proxy;


import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.event.AdamantiumArmorEvent;
import io.github.fergoman123.fergotools.event.ItemToolTipEvent;
import io.github.fergoman123.fergotools.event.OnPlayerLoggedInEvent;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;

public class ClientProxy extends CommonProxy
{

    @Override
    public void registerTileEntities() {

    }

    @Override
    public void registerRenderers() {

    }

    @Override
    public void registerEventHandlers()
    {
        RegisterHelper.registerEvent(OnPlayerLoggedInEvent.instance);
        RegisterHelper.registerEvent(AdamantiumArmorEvent.instance);
        RegisterHelper.registerEvent(ConfigHandler.instance);
        RegisterHelper.registerEvent(ItemToolTipEvent.instance);
    }
}
