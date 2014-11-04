package io.github.fergoman123.fergotools.util;

import io.github.fergoman123.fergotools.init.ItemBlocks.*;
import net.minecraft.item.ItemBlock;

@SuppressWarnings("unchecked")
public class FTIBArrays
{
    public static final Class<? extends ItemBlock>[] ores = new Class[]
            {
                    ItemBlockOreObsidian.class,
                    ItemBlockOreEmerald.class,
                    ItemBlockOreLapis.class,
                    ItemBlockOreBronze.class,
                    ItemBlockOreAdamantium.class,
                    ItemBlockOreCrystalRed.class,
                    ItemBlockOreExperience.class
            };

    public static final Class<? extends ItemBlock>[] blocks = new Class[]
            {
                    ItemBlockObsidian.class,
                    ItemBlockEmerald.class,
                    ItemBlockLapis.class,
                    ItemBlockBronze.class,
                    ItemBlockCoal.class,
                    ItemBlockGlowstone.class,
                    ItemBlockAdamantium.class,
                    ItemBlockSilkGem.class,
                    ItemBlockRedstoneCrystal.class,
                    ItemBlockExperience.class,
                    ItemBlockExpCollector.class
            };

    public static final Class<? extends ItemBlock>[] furnaceIdle = new Class[]
            {
                    ItemBlockQuartzFurnaceIdle.class,
                    ItemBlockObsidianFurnaceIdle.class,
                    ItemBlockEmeraldFurnaceIdle.class,
                    ItemBlockLapisFurnaceIdle.class,
                    ItemBlockBronzeFurnaceIdle.class,
                    ItemBlockCoalFurnaceIdle.class,
                    ItemBlockGlowstoneFurnaceIdle.class,
                    ItemBlockAdamantiumFurnaceIdle.class,
                    ItemBlockSilkFurnaceIdle.class,
                    ItemBlockRedstoneFurnaceIdle.class,
                    ItemBlockMaceratorIdle.class
            };

    public static final Class<? extends ItemBlock>[] furnaceActive = new Class[]
            {
                    ItemBlockQuartzFurnaceActive.class,
                    ItemBlockObsidianFurnaceActive.class,
                    ItemBlockEmeraldFurnaceActive.class,
                    ItemBlockLapisFurnaceActive.class,
                    ItemBlockBronzeFurnaceActive.class,
                    ItemBlockCoalFurnaceActive.class,
                    ItemBlockGlowstoneFurnaceActive.class,
                    ItemBlockAdamantiumFurnaceActive.class,
                    ItemBlockSilkFurnaceActive.class,
                    ItemBlockRedstoneFurnaceActive.class,
                    ItemBlockMaceratorActive.class
            };

    public static final Class<? extends ItemBlock>[] logs = new Class[]
            {
                    ItemBlockLogObsidian.class,
                    ItemBlockLogEmerald.class,
                    ItemBlockLogLapis.class,
                    ItemBlockLogBronze.class,
                    ItemBlockLogCoal.class,
                    ItemBlockLogGlowstone.class,
                    ItemBlockLogAdamantium.class,
                    ItemBlockLogSilk.class,
                    ItemBlockLogRedstone.class
            };

    public static final Class<? extends ItemBlock>[] planks = new Class[]
            {
                    ItemBlockPlankObsidian.class,
                    ItemBlockPlankEmerald.class,
                    ItemBlockPlankLapis.class,
                    ItemBlockPlankBronze.class,
                    ItemBlockPlankCoal.class,
                    ItemBlockPlankGlowstone.class,
                    ItemBlockPlankAdamantium.class,
                    ItemBlockPlankSilk.class,
                    ItemBlockPlankRedstone.class,
            };
}
