package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.tileentity.*;
import fergoman123.mods.fergoutil.helper.RegisterHelper;
import net.minecraft.tileentity.TileEntity;

public class ModTiles {

    public static Class<? extends TileEntity> quartzFurnaceClass = TileEntityQuartzFurnace.class;
    public static Class<? extends TileEntity> obsidianFurnaceClass = TileEntityObsidianFurnace.class;
    public static Class<? extends TileEntity> emeraldCrystalFurnaceClass = TileEntityEmeraldCrystalFurnace.class;
    public static Class<? extends TileEntity> lapisCrystalClass = TileEntityLapisCrystalFurnace.class;
    public static Class<? extends TileEntity> bronzeFurnaceClass = TileEntityBronzeFurnace.class;
    public static Class<? extends TileEntity> coalFurnaceClass = TileEntityCoalFurnace.class;
    public static Class<? extends TileEntity> glowstoneFurnaceClass = TileEntityGlowstoneFurnace.class;
    public static Class<? extends TileEntity> adamantiumFurnaceClass = TileEntityAdamantiumFurnace.class;
    public static Class<? extends TileEntity> silkFurnaceClass = TileEntitySilkFurnace.class;
    public static Class<? extends TileEntity> redstoneFurnaceClass = TileEntityRedstoneFurnace.class;
    public static Class<? extends TileEntity> maceratorClass = TileEntityMacerator.class;

    public static final TileEntity quartzFurnace = new TileEntityQuartzFurnace();
    public static final TileEntity obsidianFurnace = new TileEntityObsidianFurnace();
    public static final TileEntity emeraldFurnace = new TileEntityEmeraldCrystalFurnace();
    public static final TileEntity lapisFurnace = new TileEntityLapisCrystalFurnace();
    public static final TileEntity bronzeFurnace = new TileEntityBronzeFurnace();
    public static final TileEntity coalFurnace = new TileEntityCoalFurnace();
    public static final TileEntity glowstoneFurnace = new TileEntityGlowstoneFurnace();
    public static final TileEntity adamantiumFurnace = new TileEntityAdamantiumFurnace();
    public static final TileEntity silkFurnace = new TileEntitySilkFurnace();
    public static final TileEntity redstoneFurnace = new TileEntityRedstoneFurnace();
    public static final TileEntity macerator = new TileEntityMacerator();

    public static void init()
    {
        RegisterHelper.registerTileEntity(quartzFurnaceClass, Strings.TileStrings.quartzFurnaceTile);
        RegisterHelper.registerTileEntity(obsidianFurnaceClass, Strings.TileStrings.obsidianFurnaceTile);
        RegisterHelper.registerTileEntity(emeraldCrystalFurnaceClass, Strings.TileStrings.emeraldCrystalFurnaceTile);
        RegisterHelper.registerTileEntity(lapisCrystalClass, Strings.TileStrings.lapisCrystalFurnaceTile);
        RegisterHelper.registerTileEntity(bronzeFurnaceClass, Strings.TileStrings.bronzeFurnaceTile);
        RegisterHelper.registerTileEntity(coalFurnaceClass, Strings.TileStrings.coalFurnaceTile);
        RegisterHelper.registerTileEntity(glowstoneFurnaceClass, Strings.TileStrings.glowstoneFurnaceTile);
        RegisterHelper.registerTileEntity(adamantiumFurnaceClass, Strings.TileStrings.adamantiumFurnaceTile);
        RegisterHelper.registerTileEntity(silkFurnaceClass, Strings.TileStrings.silkFurnaceTile);
        RegisterHelper.registerTileEntity(redstoneFurnaceClass, Strings.TileStrings.redstoneFurnaceTile);
        RegisterHelper.registerTileEntity(maceratorClass, Strings.TileStrings.maceratorTile);
    }
}
