package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.proxy.ClientProxy;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

public class RegHandler {

    public static EventHandler event = new EventHandler();
    public static ClientProxy handler = new ClientProxy();
    public static FuelHandler fuel = new FuelHandler();

    public static void init() {
        RegisterHelper.registerGuiHandler(FergoTools.instance, handler);
        RegisterHelper.registerWorldGen(event, 0);
        RegisterHelper.registerFuelHandler(fuel);
    }
}

