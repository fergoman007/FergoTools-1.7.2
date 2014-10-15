package io.github.fergoman123.fergotools.util;

import io.github.fergoman123.fergotools.furnaces.QuartzFurnace.TileEntityQuartzFurnace;
import io.github.fergoman123.fergotools.furnaces.ObsidianFurnace.TileEntityObsidianFurnace;
import io.github.fergoman123.fergotools.furnaces.EmeraldFurnace.TileEntityEmeraldFurnace;
import io.github.fergoman123.fergotools.furnaces.LapisFurnace.TileEntityLapisFurnace;
import io.github.fergoman123.fergotools.furnaces.BronzeFurnace.TileEntityBronzeFurnace;
import io.github.fergoman123.fergotools.furnaces.CoalFurnace.TileEntityCoalFurnace;
import io.github.fergoman123.fergotools.furnaces.GlowstoneFurnace.TileEntityGlowstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.AdamantiumFurnace.TileEntityAdamantiumFurnace;
import io.github.fergoman123.fergotools.furnaces.SilkFurnace.TileEntitySilkFurnace;
import io.github.fergoman123.fergotools.furnaces.RedstoneFurnace.TileEntityRedstoneFurnace;
import io.github.fergoman123.fergotools.furnaces.Macerator.TileEntityMacerator;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import io.github.fergoman123.fergotools.item.block.ore.*;
import io.github.fergoman123.fergotools.item.block.storage.*;
import io.github.fergoman123.fergotools.item.block.furnaceidle.*;
import io.github.fergoman123.fergotools.item.block.furnaceactive.*;

@SuppressWarnings("unchecked")
public class Utils
{
    public static final Class<? extends ItemBlock>[] ores = new Class[]
            {
                    ItemBlockOreExperience.class,
                    ItemBlockOreObsidian.class,
                    ItemBlockOreEmeraldCrystal.class,
                    ItemBlockOreLapisCrystal.class,
                    ItemBlockOreBronze.class,
                    ItemBlockOreAdamantium.class,
                    ItemBlockOreCrystalRed.class
            };

    public static final Class<? extends ItemBlock>[] blocks = new Class[]
            {
                    ItemBlockExperience.class,
                    ItemBlockObsidian.class,
                    ItemBlockEmeraldCrystal.class,
                    ItemBlockLapisCrystal.class,
                    ItemBlockBronze.class,
                    ItemBlockCoal.class,
                    ItemBlockGlowstone.class,
                    ItemBlockAdamantium.class,
                    ItemBlockSilkGem.class,
                    ItemBlockRedstoneCrystal.class
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

    public static final Class<? extends TileEntity>[] tileEntityList = new Class[]
            {
                    TileEntityQuartzFurnace.class,
                    TileEntityObsidianFurnace.class,
                    TileEntityEmeraldFurnace.class,
                    TileEntityLapisFurnace.class,
                    TileEntityBronzeFurnace.class,
                    TileEntityCoalFurnace.class,
                    TileEntityGlowstoneFurnace.class,
                    TileEntityAdamantiumFurnace.class,
                    TileEntitySilkFurnace.class,
                    TileEntityRedstoneFurnace.class,
                    TileEntityMacerator.class
            };
}
