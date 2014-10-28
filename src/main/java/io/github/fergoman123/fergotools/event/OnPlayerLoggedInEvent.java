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
