/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import io.github.fergoman123.fergotools.helper.LogHelper;

public class OnPlayerLoggedInEvent
{
    public static final OnPlayerLoggedInEvent instance = new OnPlayerLoggedInEvent();

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent evt)
    {
        LogHelper.info(evt.player.getDisplayName() + " has Logged In!!");
        LogHelper.info("FergoTools Successfully Added Into Game");
    }
}
