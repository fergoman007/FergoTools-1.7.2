package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.lib.Strings.BlockStrings;
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

        RegisterHelper.registerOre(BlockStrings.oreObsidian, ModBlocks.oreObsidian);
        RegisterHelper.registerOre(BlockStrings.oreEmeraldCrystal, ModBlocks.oreEmeraldCrystal);
        RegisterHelper.registerOre(BlockStrings.oreLapisCrystal, ModBlocks.oreLapisCrystal);
        RegisterHelper.registerOre(BlockStrings.oreBronze, ModBlocks.oreBronze);
        RegisterHelper.registerOre(BlockStrings.oreExperience, ModBlocks.oreExperience);
        RegisterHelper.registerOre(BlockStrings.oreAdamantium, ModBlocks.oreAdamantium);
        RegisterHelper.registerOre(BlockStrings.oreRedstoneCrystal, ModBlocks.oreRedstoneCrystal);
    }
}

