package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.api.base.ItemStaffExpBase;
import io.github.fergoman123.fergotools.helper.StaffExpHelper;
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
        if(getStoredExp(stack) > StaffExpHelper.getMaxExp(this.getType()))
        {
            setStoredExp(stack, StaffExpHelper.getMaxExp(this.getType()));
        }

        if (getStoredExp(stack) == StaffExpHelper.getMaxExp(this.getType()) || getStoredExp(stack) == 0)
        {
            return stack;
        }
        else
        {
            if (player.experienceLevel > 5 && !player.isSneaking())
            {
                player.addExperienceLevel(-5);
                addExp(stack, 5);
            }
            else
            {
                player.addExperienceLevel(5);
                removeExp(stack, 5);
            }
        }
        return stack;
    }
}
