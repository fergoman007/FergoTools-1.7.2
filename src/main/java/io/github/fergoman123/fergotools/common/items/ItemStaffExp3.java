package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.api.base.ItemStaffExpBase;
import io.github.fergoman123.fergotools.helper.StaffExpHelper;
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
        if(getStoredExp(stack) > StaffExpHelper.getMaxExp(this.getType()))
        {
            setStoredExp(stack, StaffExpHelper.getMaxExp(this.getType()));
        }

        if (getStoredExp(stack) == StaffExpHelper.getMaxExp(this.getType()))
        {
            return stack;
        }
        else
        {
            if (player.experienceLevel > 30 && !player.isSneaking())
            {
                player.addExperienceLevel(-30);
                addExp(stack, 30);
            }
            else
            {
                player.addExperienceLevel(30);
                removeExp(stack, 30);
            }
        }
        return stack;
    }
}
