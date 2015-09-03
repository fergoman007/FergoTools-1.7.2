package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.api.content.*;
import io.github.fergoman123.fergoutil.item.*;
import net.minecraft.block.*;
import net.minecraft.item.*;

public class ItemBlockPlankFT extends ItemBlockVariants {

	public ItemBlockPlankFT(Block block) {
		super(block);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + WoodTypes.getPlankName(stack.getItemDamage());
	}

}
