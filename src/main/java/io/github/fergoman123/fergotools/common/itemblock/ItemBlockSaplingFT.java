package io.github.fergoman123.fergotools.common.itemblock;

import io.github.fergoman123.fergotools.api.content.*;
import io.github.fergoman123.fergoutil.item.*;
import net.minecraft.block.*;
import net.minecraft.item.*;

public class ItemBlockSaplingFT extends ItemBlockVariants{
    public ItemBlockSaplingFT(Block block) {
        super(block);
    }
    
    public String getUnlocalizedName(ItemStack stack){
    	return super.getUnlocalizedName() + "." + WoodTypes.getSaplingName(stack.getItemDamage());
    }
}
