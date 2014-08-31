package fergoman123.mods.fergotools.proxy;

import fergoman123.mods.fergotools.event.EventHandler;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

public class ClientProxy extends CommonProxy
{

    @Override
    public void registerKeyBindings() {

    }

    @Override
    public void registerEventHandlers()
    {
        RegisterHelper.registerEvent(new EventHandler());

    }
}
