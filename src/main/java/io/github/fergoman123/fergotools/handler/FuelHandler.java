 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.handler;

 import net.minecraftforge.fml.common.IFuelHandler;
 import io.github.fergoman123.fergotools.api.content.FTContent;
 import net.minecraft.init.Blocks;
 import net.minecraft.init.Items;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 import net.minecraft.tileentity.TileEntityFurnace;

public class FuelHandler implements IFuelHandler {

    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem() == FTContent.ingotCoal)
        {
            return 9 * TileEntityFurnace.getItemBurnTime(new ItemStack(Items.coal));
        }

        if (fuel.getItem() == Item.getItemFromBlock(FTContent.blockCoal))
        {
            return 9 * TileEntityFurnace.getItemBurnTime(new ItemStack(Blocks.coal_block));
        }

        return 0;
    }
}
