package io.github.fergoman123.fergotools.proxy;


import fergoman123.mods.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergotools.event.EventHandler;

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
