package fergoman123.mods.fergotools.util;

import fergoman123.mods.fergotools.init.ModBlocks;
import net.minecraft.item.Item;

import static fergoman123.mods.fergoutil.helper.FurnaceHelper.getItemFromBlock;

/**
 * Created by Fergoman123 on 15/05/2014.
 */
public class UtilBlockItem {

    public static Item itemOreObsidian = getItemFromBlock(ModBlocks.oreObsidian);
    public static Item itemOreEmeraldCrystal =  getItemFromBlock(ModBlocks.oreEmeraldCrystal);
    public static Item itemOreLapisCrystal =  getItemFromBlock(ModBlocks.oreLapisCrystal);
    public static Item itemOreBronze =  getItemFromBlock(ModBlocks.oreBronze);
    public static Item itemOreAdamantium =  getItemFromBlock(ModBlocks.oreAdamantium);
    public static Item itemOreExperience = getItemFromBlock(ModBlocks.oreExperience);

    public static Item itemQuartzFurnace = getItemFromBlock(ModBlocks.quartzFurnaceIdle);
    public static Item itemEmeraldcrystalFurnace = getItemFromBlock(ModBlocks.emeraldCrystalFurnaceIdle);
    public static Item itemLapiscrystalFurnace = getItemFromBlock(ModBlocks.lapisCrystalFurnaceIdle);
    public static Item itemBronzeFurnace = getItemFromBlock(ModBlocks.bronzeFurnaceIdle);
    public static Item itemCoalFurnace = getItemFromBlock(ModBlocks.coalFurnaceActive);
    public static Item itemGlowstoneFurnace = getItemFromBlock(ModBlocks.glowstoneFurnaceIdle);
    public static Item itemAdamantiumFurnace = getItemFromBlock(ModBlocks.adamantiumFurnaceIdle);
    public static Item itemSilkFurnace = getItemFromBlock(ModBlocks.silkFurnaceIdle);
    public static Item itemRedstoneFurnace = getItemFromBlock(ModBlocks.redstoneFurnaceIdle);
}
