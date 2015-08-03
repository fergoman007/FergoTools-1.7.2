package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.item.ItemFT;
import io.github.fergoman123.fergotools.reference.ItemNames;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemExpShard extends ItemFT
{
    public ItemExpShard() {
        super(ItemNames.shardExp);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
        playerIn.addExperienceLevel(1);
        itemStackIn.stackSize--;
        return itemStackIn;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
