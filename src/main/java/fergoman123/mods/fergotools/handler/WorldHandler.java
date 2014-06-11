package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.block.BlockPortalFT;
import fergoman123.mods.fergotools.biome.BiomeGenFTPlains;
import fergoman123.mods.fergotools.item.ItemFTIgnitor;
import fergoman123.mods.fergotools.world.provider.WorldProviderFT;
import fergoman123.mods.fergoutil.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.DimensionManager;

public class WorldHandler {

    public static BiomeGenBase ftDensePlains;
    public static int dimId = 27;
    public static Class<? extends WorldProvider> provider = WorldProviderFT.class;

    public static Block portal;
    public static Item ignitor;

    public static void init()
    {
        portal = new BlockPortalFT();
        ignitor = new ItemFTIgnitor();

        ftDensePlains = new BiomeGenFTPlains(50);

        DimensionManager.registerProviderType(dimId, provider, true);
        DimensionManager.registerDimension(dimId, dimId);

        BiomeDictionary.registerBiomeType(ftDensePlains, BiomeDictionary.Type.PLAINS);
        RegisterHelper.registerBlock(portal, "blockPortalFT");
        RegisterHelper.registerItem(ignitor, "ignitor");
    }
}
