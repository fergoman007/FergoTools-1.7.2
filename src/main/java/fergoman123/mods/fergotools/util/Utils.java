package fergoman123.mods.fergotools.util;

import fergoman123.mods.fergotools.furnaces.QuartzFurnace.TileEntityQuartzFurnace;
import fergoman123.mods.fergotools.furnaces.ObsidianFurnace.TileEntityObsidianFurnace;
import fergoman123.mods.fergotools.furnaces.EmeraldFurnace.TileEntityEmeraldFurnace;
import fergoman123.mods.fergotools.furnaces.LapisFurnace.TileEntityLapisFurnace;
import fergoman123.mods.fergotools.furnaces.BronzeFurnace.TileEntityBronzeFurnace;
import fergoman123.mods.fergotools.furnaces.CoalFurnace.TileEntityCoalFurnace;
import fergoman123.mods.fergotools.furnaces.GlowstoneFurnace.TileEntityGlowstoneFurnace;
import fergoman123.mods.fergotools.furnaces.AdamantiumFurnace.TileEntityAdamantiumFurnace;
import fergoman123.mods.fergotools.furnaces.SilkFurnace.TileEntitySilkFurnace;
import fergoman123.mods.fergotools.furnaces.RedstoneFurnace.TileEntityRedstoneFurnace;
import fergoman123.mods.fergotools.furnaces.Macerator.TileEntityMacerator;

import fergoman123.mods.fergotools.item.block.furnaceactive.*;
import fergoman123.mods.fergotools.item.block.furnaceidle.*;
import fergoman123.mods.fergotools.item.block.ore.*;
import fergoman123.mods.fergotools.item.block.storage.*;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;

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
