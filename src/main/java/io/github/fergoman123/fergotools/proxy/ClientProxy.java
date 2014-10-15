package io.github.fergoman123.fergotools.proxy;


import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergotools.event.EventHandler;

public class ClientProxy extends CommonProxy
{

    @Override
    public void registerEventHandlers()
    {
        RegisterHelper.registerEvent(new EventHandler());

    }
}
