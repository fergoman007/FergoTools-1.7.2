package io.github.fergoman123.fergotools.util.base;

import fergoman123.mods.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemStickFT extends Item
{
    public ItemStickFT()
    {
        super();
        this.setMaxStackSize(64);
        this.setNoRepair();
        this.setCreativeTab(Tabs.tabFergoWood);
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon(String.format("%s%s%s", Reference.textureLoc, "stick/", NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
    }
}
