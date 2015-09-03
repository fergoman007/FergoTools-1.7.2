package io.github.fergoman123.fergotools.common.itemblock;

import io.github.fergoman123.fergotools.api.content.*;
import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import net.minecraft.block.Block;
import net.minecraft.item.*;

public class ItemBlockStorageFT extends ItemBlockVariants
{
    public ItemBlockStorageFT(Block block) {
        super(block);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
    	return super.getUnlocalizedName() + "." + StorageTypes.values()[stack.getItemDamage()].getName();
    }
}
