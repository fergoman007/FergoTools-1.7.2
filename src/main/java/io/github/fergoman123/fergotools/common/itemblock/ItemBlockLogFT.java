package io.github.fergoman123.fergotools.common.itemblock;

import io.github.fergoman123.fergotools.api.content.*;
import net.minecraft.block.*;
import net.minecraft.item.*;

public class ItemBlockLogFT extends ItemBlock
{
    public ItemBlockLogFT(Block block){
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    public String getUnlocalizedName(ItemStack stack){
        return super.getUnlocalizedName() + "." + WoodTypes.getLogName(stack.getItemDamage());
    }
}
