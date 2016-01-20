package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.block.BlockMultiFT;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockFT extends ItemBlock{

    public ItemBlockFT(Block block) {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public int getMetadata(int metadata){
        return metadata;
    }

    public String getUnlocalizedName(ItemStack stack){
        BlockMultiFT blockMulti = (BlockMultiFT)this.block;
        int damage = stack.getItemDamage();
        return super.getUnlocalizedName() + "." + blockMulti.getSubNames()[damage];
    }
}
