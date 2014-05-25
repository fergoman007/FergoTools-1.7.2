package fergoman123.mods.fergotools.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fergoman123.mods.fergotools.network.proxy.CommonProxy;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class ClientProxy extends CommonProxy {
    public int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
}
