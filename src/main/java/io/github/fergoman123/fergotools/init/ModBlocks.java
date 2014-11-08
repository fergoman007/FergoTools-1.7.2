package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.init.ItemBlocks.*;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.util.FTArrays;
import io.github.fergoman123.fergotools.util.FTIBArrays;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;

public class ModBlocks{
    public static FTContent con = new FTContent();

	public static void init()
	{
        for (int i = 0; i < BlockNames.ores.length; i++) {
            RegisterHelper.registerBlock(FTArrays.ores[i], FTIBArrays.ores[i], BlockNames.ores[i]);
        }

        for (int i = 0; i < BlockNames.blocks.length; i++) {
            RegisterHelper.registerBlock(FTArrays.blocks[i], FTIBArrays.blocks[i], BlockNames.blocks[i]);
        }

        RegisterHelper.registerBlock(con.blockFergoGlass, BlockNames.blockFergoGlass);

        for (int i = 0; i < BlockNames.furnaceIdle.length; i++) {
            RegisterHelper.registerBlock(FTArrays.furnaceIdle[i], FTIBArrays.furnaceIdle[i], BlockNames.furnaceIdle[i]);
        }

        for (int i = 0; i < BlockNames.furnaceActive.length; i++) {
            RegisterHelper.registerBlock(FTArrays.furnaceActive[i], FTIBArrays.furnaceActive[i], BlockNames.furnaceActive[i]);
        }

        for (int i = 0; i < BlockNames.logs.length; i++) {
            RegisterHelper.registerBlock(FTArrays.logs[i], FTIBArrays.logs[i], BlockNames.logs[i]);
        }

        for (int i = 0; i < BlockNames.planks.length; i++) {
            RegisterHelper.registerBlock(FTArrays.planks[i], FTIBArrays.planks[i], BlockNames.planks[i]);
        }

        for (int i = 0; i < BlockNames.stairs.length; i++) {
            RegisterHelper.registerBlock(FTArrays.stairs[i], FTIBArrays.stairs[i], BlockNames.stairs[i]);
        }


        for (int i = 0; i < BlockNames.workbenches.length; i++) {
            RegisterHelper.registerBlock(FTArrays.workbenches[i], BlockNames.workbenches[i]);
        }
    }
}