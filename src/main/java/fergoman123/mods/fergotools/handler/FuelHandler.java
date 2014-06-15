package fergoman123.mods.fergotools.handler;

import cpw.mods.fml.common.IFuelHandler;
import fergoman123.mods.fergotools.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;

public class FuelHandler implements IFuelHandler {

    private static final ItemStack coal = new ItemStack(Items.coal);

    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem() == ModItems.coalIngot)
        {
            return 9 * TileEntityFurnace.getItemBurnTime(coal);
        }

        return 0;
    }
}
