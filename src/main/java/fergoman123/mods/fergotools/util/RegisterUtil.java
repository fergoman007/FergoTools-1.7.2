package fergoman123.mods.fergotools.util;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Fergoman123 on 17/03/14.
 */
public class RegisterUtil {

    public static void registerBlock(Block block, String name)
    {
            GameRegistry.registerBlock(block, name);
    }

    public static void registerItem(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
    }

    public static void registerTileEntity(Class <? extends TileEntity> tileClass, String tileName)
    {
        GameRegistry.registerTileEntity(tileClass, tileName);
    }

    public static void registerGuiHandler(Object mod, IGuiHandler handler)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(mod, handler);
    }

    public static void registerWorldGenerator(IWorldGenerator generator, int modGenWeight)
    {
        GameRegistry.registerWorldGenerator(generator, modGenWeight);
    }
}
