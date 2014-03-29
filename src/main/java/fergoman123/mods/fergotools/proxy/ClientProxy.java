package fergoman123.mods.fergotools.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fergoman123.mods.fergotools.handler.EventHandler;
import fergoman123.mods.fergotools.handler.GuiHandler;

public class ClientProxy extends CommonProxy{
	
	public static GuiHandler handler = new GuiHandler();
	public static EventHandler event = new EventHandler();
	
	public int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
	
	

}
