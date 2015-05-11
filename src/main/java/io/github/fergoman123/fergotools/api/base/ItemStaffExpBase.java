package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.helper.NBTHelper;
import io.github.fergoman123.fergotools.helper.StaffExpHelper;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ItemStaffExpBase extends Item
{
    private int type;

    public ItemStaffExpBase(int type)
    {
        super();
        this.type = type;
        this.setCreativeTab(Tabs.tabFergoItems);
        this.setUnlocalizedName(ItemNames.staffExpVariants[type]);
    }

    @Override
    public String getUnlocalizedName() {
        return NameHelper.formatItemName(NameHelper.getModString(0), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return NameHelper.formatItemName(NameHelper.getModString(0), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack) {
        return stack.hasTagCompound();
    }

    public double getStoredExp(ItemStack stack)
    {
        if (stack.getTagCompound() == null)
        {
            stack.setTagCompound(new NBTTagCompound());
        }

        return NBTHelper.getDouble(stack, "StoredExp");
    }

    public void setStoredExp(ItemStack stack, double amount)
    {
        if (stack.getTagCompound() == null)
        {
            stack.setTagCompound(new NBTTagCompound());
        }

        NBTHelper.setDouble(stack, "StoredExp", amount);
    }

    public void addExp(ItemStack stack, double amount)
    {
        setStoredExp(stack, getStoredExp(stack) + amount);
    }

    public void removeExp(ItemStack stack, double amount)
    {
        double result = getStoredExp(stack) - amount;

        if (result < 0)
        {
            result = 0;
        }

        setStoredExp(stack, result);
    }

    @Override
    public double getDurabilityForDisplay(ItemStack stack) {
        double exp = this.getStoredExp(stack);

        if (exp == 0)
        {
            return 1.0D;
        }

        return 1.0D - exp / (double) StaffExpHelper.getMaxExp(this.getType());
    }

    public int getType() {
        return type;
    }
}
