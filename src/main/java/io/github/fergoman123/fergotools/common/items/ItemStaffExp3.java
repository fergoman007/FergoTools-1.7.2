package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.api.base.ItemStaffExpBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaffExp3 extends ItemStaffExpBase
{
    public ItemStaffExp3(){
        super(2);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (player.experienceLevel > 0 && player.isSneaking())
        {
            player.addExperienceLevel(-30);
            addExp(stack, 30);
        }
        else
        {
            player.addExperienceLevel(30);
            removeExp(stack, 30);
        }
        return stack;
    }
}
