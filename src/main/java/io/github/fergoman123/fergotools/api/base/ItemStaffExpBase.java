package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.helper.NBTHelper;
import io.github.fergoman123.fergotools.helper.StaffExpHelper;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.ItemInfo;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ItemStaffExpBase extends Item
{
    private int type;
    private ItemInfo info;

    public ItemStaffExpBase(int type, ItemInfo info)
    {
        super();
        this.type = type;
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setUnlocalizedName(info.getName());
        this.info = info;
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

    public int getStoredExp(ItemStack stack)
    {
        if (stack.getTagCompound() == null)
        {
            stack.setTagCompound(new NBTTagCompound());
        }

        return NBTHelper.getInt(stack, "StoredExp");
    }

    public void setStoredExp(ItemStack stack, int amount)
    {
        if (stack.getTagCompound() == null)
        {
            stack.setTagCompound(new NBTTagCompound());
        }

        NBTHelper.setInteger(stack, "StoredExp", amount);
    }

    public void addExp(ItemStack stack, int amount)
    {
        setStoredExp(stack, getStoredExp(stack) + amount);
    }

    public void removeExp(ItemStack stack, int amount)
    {
        int result = getStoredExp(stack) - amount;

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

    public ItemInfo getInfo() {
        return info;
    }

    public ModelResourceLocation getModel()
    {
        return new ModelResourceLocation(getInfo().getModel(), "inventory");
    }
}
