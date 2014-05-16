package fergoman123.mods.fergotools.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class ClientProxy extends CommonProxy{
    public int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
}
