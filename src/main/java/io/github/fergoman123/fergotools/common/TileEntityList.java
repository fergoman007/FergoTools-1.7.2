package io.github.fergoman123.fergotools.common;

import io.github.fergoman123.fergotools.common.furnace.*;
import net.minecraft.tileentity.TileEntity;

public class TileEntityList
{
    public static final Class<? extends TileEntity> quartzFurnace = QuartzFurnace.TileQuartzFurnace.class;
    public static final Class<? extends TileEntity> obsidianFurnace = ObsidianFurnace.TileObsidianFurnace.class;
    public static final Class<? extends TileEntity> emeraldFurnace = EmeraldFurnace.TileEmeraldFurnace.class;
    public static final Class<? extends TileEntity> lapisFurnace = LapisFurnace.TileLapisFurnace.class;
    public static final Class<? extends TileEntity> bronzeFurnace = BronzeFurnace.TileBronzeFurnace.class;
    public static final Class<? extends TileEntity> coalFurnace = CoalFurnace.TileCoalFurnace.class;
    public static final Class<? extends TileEntity> glowstoneFurnace = GlowstoneFurnace.TileGlowstoneFurnace.class;
    public static final Class<? extends TileEntity> adamantiumFurnace = AdamantiumFurnace.TileAdamantiumFurnace.class;
    public static final Class<? extends TileEntity> silkFurnace = SilkFurnace.TileSilkFurnace.class;
    public static final Class<? extends TileEntity> redstoneFurnace = RedstoneFurnace.TileRedstoneFurnace.class;
    public static final Class<? extends TileEntity> macerator = Macerator.TileMacerator.class;

    public static final Class<? extends TileEntity>[] tiles = new Class[]{quartzFurnace, obsidianFurnace, emeraldFurnace, lapisFurnace, bronzeFurnace, coalFurnace, glowstoneFurnace, adamantiumFurnace, silkFurnace, redstoneFurnace, macerator};

    public static final TileEntityList instance = new TileEntityList();

    public static TileEntityList getInstance() {
        return instance;
    }
}
