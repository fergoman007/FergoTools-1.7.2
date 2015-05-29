package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.api.base.ItemStaffExpBase;
import io.github.fergoman123.fergotools.helper.StaffExpHelper;
import io.github.fergoman123.fergotools.reference.ItemInfos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaffExp2 extends ItemStaffExpBase
{
    public ItemStaffExp2() {
        super(1, ItemInfos.staffExp2);
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
            if (player.experienceLevel > 10 && !player.isSneaking())
            {
                player.addExperienceLevel(-10);
                addExp(stack, 10);
            }
            else
            {
                player.addExperienceLevel(10);
                removeExp(stack, 10);
            }
        }
        return stack;
    }
}
