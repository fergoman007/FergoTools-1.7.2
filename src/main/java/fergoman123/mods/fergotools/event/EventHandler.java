 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergotools.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import fergoman123.mods.fergotools.client.FTGuiConfig;
import fergoman123.mods.fergotools.helper.LogHelper;

public class EventHandler
{
    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerLoggedInEvent evt)
    {
        LogHelper.info(evt.player.getDisplayName() + " has Logged In!!");
        LogHelper.info("FergoTools Successfully Added Into Game");
    }
}
