package fergoman123.mods.fergotools.init;

import net.minecraftforge.fluids.Fluid;

/**
 * Created by Fergoman123 on 25/05/2014.
 */
public class ModFluids {

    public static Fluid liquidExpShard;

    public static void initFluids()
    {
        liquidExpShard = new Fluid("liquidExpShard");
    }
}
