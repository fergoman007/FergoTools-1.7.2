package io.github.fergoman123.fergotools.common.itemblock;

import io.github.fergoman123.fergotools.api.content.*;
import io.github.fergoman123.fergotools.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

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
