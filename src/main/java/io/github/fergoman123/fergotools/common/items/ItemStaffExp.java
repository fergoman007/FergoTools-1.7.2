package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.api.base.ItemStaffExpBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaffExp extends ItemStaffExpBase
{
    public ItemStaffExp() {
        super(0);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (player.experienceLevel > 0 && player.isSneaking())
        {
            player.addExperienceLevel(-5);
            addExp(stack, 5);
        }
        else
        {
            player.addExperienceLevel(5);
            removeExp(stack, 5);
        }
        return stack;
    }
}
