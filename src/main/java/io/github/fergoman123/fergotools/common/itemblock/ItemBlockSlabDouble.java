package io.github.fergoman123.fergotools.common.itemblock;

import io.github.fergoman123.fergotools.api.content.*;
import io.github.fergoman123.fergoutil.item.*;
import net.minecraft.block.*;
import net.minecraft.item.*;

public class ItemBlockSlabDouble extends ItemBlockVariants {
    public ItemBlockSlabDouble(Block block) {
        super(block);
    }

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + WoodTypes.getSlabName(stack.getItemDamage(), true);
	}
}
