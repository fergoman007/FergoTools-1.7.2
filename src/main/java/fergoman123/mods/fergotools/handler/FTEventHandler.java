package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.event.EventHandler.OnKeyPressedEvent;
import fergoman123.mods.fergotools.event.EventHandler.OnPlayerLoggedInEvent;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

public class FTEventHandler
{
    public static void registerEvents()
    {
        RegisterHelper.registerEvent(new OnPlayerLoggedInEvent());
        RegisterHelper.registerEvent(new OnKeyPressedEvent());
    }
}
