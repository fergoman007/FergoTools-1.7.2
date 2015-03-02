package io.github.fergoman123.fergotools.common.handler;

import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler
{
    public static final FuelHandler instance = new FuelHandler();

    @Override
    public int getBurnTime(ItemStack fuel) {

        ItemStack coal = new ItemStack(Items.coal, 1, 0);
        ItemStack coalBlock = new ItemStack(Blocks.coal_block);
        ItemStack ingotCoal = new ItemStack(ModItems.ingotCoal);
        ItemStack blockCoal = new ItemStack(ModBlocks.blockCoal);

        if (fuel == ingotCoal)
        {
            return 9 * TileEntityFurnace.getItemBurnTime(coal);
        }
        else if (fuel == blockCoal)
        {
            return 9 * TileEntityFurnace.getItemBurnTime(coalBlock);
        }
        else
        {
            return 0;
        }
    }
}
