package fergoman123.mods.fergotools.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import fergoman123.mods.fergotools.client.settings.KeyBindings;

public class ClientProxy extends CommonProxy
{

    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(KeyBindings.ftConfig);
    }
}
