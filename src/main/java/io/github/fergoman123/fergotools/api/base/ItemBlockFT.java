package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.reference.Assets;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemBlockFT extends ItemBlock{
    public ItemBlockFT(Block block) {
        super(block);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        tooltip.add(StatCollector.translateToLocal(Assets.Locale.oreDictName));
        tooltip.add(StatCollector.translateToLocal(this.block.getUnlocalizedName()));
    }
}
