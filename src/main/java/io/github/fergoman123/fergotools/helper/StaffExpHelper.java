package io.github.fergoman123.fergotools.helper;

import io.github.fergoman123.fergotools.item.ItemStaffExpBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class StaffExpHelper
{
    public static final int[] levelMaxes = new int[]{50, 150, 300};

    public static int addExp(ItemStack stack, int amount, int tier){
        ItemStaffExpBase staffExp = (ItemStaffExpBase)stack.getItem();
        if((amount < 0) || (stack.stackSize > 1) || (staffExp.getType() > tier)){
            return 0;
        }
        NBTTagCompound nbt = getOrCreateNBTData(stack);
        int newExp = nbt.getInteger("charge");

        amount = Math.min(amount, staffExp.getMaxExp() - newExp);
        newExp += amount;
        if(newExp > 0){
            nbt.setInteger("charge", newExp);
        } else {
            nbt.removeTag("charge");
            if(nbt.hasNoTags())
                stack.setTagCompound(null);
        }
        return amount;
    }

    public static int removeExp(ItemStack stack, int amount, int tier){
        ItemStaffExpBase staffExp = (ItemStaffExpBase)stack.getItem();
        if((amount < 0) || (stack.stackSize > 1) || (staffExp.getType() > tier)){
            return 0;
        }
        NBTTagCompound nbt = getOrCreateNBTData(stack);
        int newExp = nbt.getInteger("charge");

        amount = Math.min(amount, staffExp.getMaxExp() - newExp);
        newExp -= amount;
        if(newExp > 0){
            nbt.setInteger("charge", newExp);
        } else {
            nbt.removeTag("charge");
            if(nbt.hasNoTags())
                stack.setTagCompound(null);
        }
        return amount;
    }

    public static NBTTagCompound getOrCreateNBTData(ItemStack stack){
        NBTTagCompound ret = stack.getTagCompound();
        if (ret == null){
            ret = new NBTTagCompound();
            stack.setTagCompound(ret);
        }
        return ret;
    }
}
