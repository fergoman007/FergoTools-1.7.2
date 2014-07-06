package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.block.ore.*;
import fergoman123.mods.fergotools.lib.strings.BlockStrings;
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

        RegisterHelper.registerOre(BlockStrings.oreObsidian, BlockOreObsidian.instance);
        RegisterHelper.registerOre(BlockStrings.oreEmeraldCrystal, BlockOreEmeraldCrystal.instance);
        RegisterHelper.registerOre(BlockStrings.oreLapisCrystal, BlockOreLapisCrystal.instance);
        RegisterHelper.registerOre(BlockStrings.oreBronze, BlockOreBronze.instance);
        RegisterHelper.registerOre(BlockStrings.oreExperience, BlockOreExperience.instance);
        RegisterHelper.registerOre(BlockStrings.oreAdamantium, BlockOreAdamantium.instance);
        RegisterHelper.registerOre(BlockStrings.oreRedstoneCrystal, BlockOreRedstoneCrystal.instance);
    }
}

