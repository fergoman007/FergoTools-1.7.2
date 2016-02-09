package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.block.BlockStorageFT;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockStorageFT extends ItemBlock{
    public ItemBlockStorageFT(Block block){
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + BlockStorageFT.EnumType.getNames()[stack.getItemDamage()];
    }
}
