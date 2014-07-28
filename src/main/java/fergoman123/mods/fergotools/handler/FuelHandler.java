package fergoman123.mods.fergotools.handler;

import cpw.mods.fml.common.IFuelHandler;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemCoalIngot;
import fergoman123.mods.fergotools.util.UtilBlockItem;
import fergoman123.mods.fergoutil.helper.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;

public class FuelHandler implements IFuelHandler {

    private static final ItemStack coal = new ItemStack(Items.coal);
    private static final ItemStack blockCoal = new ItemStack(Blocks.coal_block);

    private static final int coalIngotBurnTime = 9 * TileEntityFurnace.getItemBurnTime(coal);

    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem() == ModItems.ingotCoal)
        {
            return 9 * TileEntityFurnace.getItemBurnTime(coal);
        }

        if (fuel.getItem() == BlockHelper.getItemFromBlock(ModBlocks.blockCoal))
        {
            return 9 * TileEntityFurnace.getItemBurnTime(blockCoal);
        }

        return 0;
    }
}
