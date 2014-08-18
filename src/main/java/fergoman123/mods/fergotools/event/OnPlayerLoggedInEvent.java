package fergoman123.mods.fergotools.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import fergoman123.mods.fergotools.helper.LogHelper;

public class OnPlayerLoggedInEvent
{
    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent evt)
    {
        LogHelper.info(evt.player.getDisplayName() + " has Logged In!!");
        LogHelper.info("FergoTools Successfully Added Into Game");
    }
}
