package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.api.base.ItemStaffExpBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaffExp2 extends ItemStaffExpBase
{
    public ItemStaffExp2() {
        super(1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (player.experienceLevel > 0 && player.isSneaking())
        {
            player.addExperienceLevel(-10);
            addExp(stack, 10);
        }
        else
        {
            player.addExperienceLevel(10);
            removeExp(stack, 10);
        }
        return stack;
    }
}
