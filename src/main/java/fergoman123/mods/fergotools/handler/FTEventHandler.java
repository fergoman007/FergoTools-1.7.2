package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.event.OnPlayerLoggedInEvent;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

public class FTEventHandler
{
    public static void registerEvents()
    {
        RegisterHelper.registerEvent(new OnPlayerLoggedInEvent());
    }
}
