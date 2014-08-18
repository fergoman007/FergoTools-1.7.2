package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.proxy.ClientProxy;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.GuiHandler;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

public class RegHandler {

    public static WorldGenerationHandler worldGenHandler = new WorldGenerationHandler();
    public static GuiHandler guiHandler = new GuiHandler();
    public static FuelHandler fuel = new FuelHandler();

    public static void init() {
        RegisterHelper.registerGuiHandler(FergoTools.instance, guiHandler);
        RegisterHelper.registerWorldGen(worldGenHandler, 0);
        RegisterHelper.registerFuelHandler(fuel);
    }

    public static void registerOres()
    {
        RegisterHelper.registerOre(Names.Blocks.oreObsidian, ModBlocks.oreObsidian);
        RegisterHelper.registerOre(Names.Blocks.oreEmeraldCrystal, ModBlocks.oreEmeraldCrystal);
        RegisterHelper.registerOre(Names.Blocks.oreLapisCrystal, ModBlocks.oreLapisCrystal);
        RegisterHelper.registerOre(Names.Blocks.oreBronze, ModBlocks.oreBronze);
        RegisterHelper.registerOre(Names.Blocks.oreExperience, ModBlocks.oreExperience);
        RegisterHelper.registerOre(Names.Blocks.oreAdamantium, ModBlocks.oreAdamantium);
        RegisterHelper.registerOre(Names.Blocks.oreRedCrystal, ModBlocks.oreRedCrystal);
    }
}

