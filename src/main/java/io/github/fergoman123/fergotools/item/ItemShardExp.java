package io.github.fergoman123.fergotools.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemShardExp extends Item {

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        playerIn.addExperienceLevel(1);
        stack.stackSize--;
        return stack;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
