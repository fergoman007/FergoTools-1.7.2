package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.api.ItemFT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemExpShard extends ItemFT
{
    public ItemExpShard(String name) {
        super(name);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
        playerIn.addExperienceLevel(1);
        itemStackIn.stackSize--;
        return itemStackIn;
    }
}
