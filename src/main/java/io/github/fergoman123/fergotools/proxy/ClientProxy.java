package io.github.fergoman123.fergotools.proxy;


import io.github.fergoman123.fergotools.event.OnLivingUpdateEvent;
import io.github.fergoman123.fergotools.event.OnPlayerLoggedInEvent;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;

public class ClientProxy extends CommonProxy
{

    @Override
    public void registerEventHandlers()
    {
        RegisterHelper.registerEvent(OnPlayerLoggedInEvent.instance);
        RegisterHelper.registerEvent(OnLivingUpdateEvent.instance);

    }
}
