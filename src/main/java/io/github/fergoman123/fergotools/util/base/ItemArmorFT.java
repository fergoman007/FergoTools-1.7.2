/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.helper.ItemHelper;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import io.github.fergoman123.fergoutil.item.ItemArmorFergo;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemArmorFT extends ItemArmor
{
    public Item repairItem;
    public String texture;

    public ItemArmorFT(ArmorMaterial material, ArmorType type, Item repairItem, String texture)
    {
        super(material, 1, type.ordinal());
        this.repairItem = repairItem;
        this.texture = texture;
        this.setCreativeTab(Tabs.tabFergoArmor);
    }

    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
    {
        return repairItem.isItemEqual(new ItemStack(this.repairItem)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (slot == ArmorType.HELMET.ordinal() || slot == ArmorType.CHEST.ordinal() || slot == ArmorType.BOOTS.ordinal())
        {
            return String.format("%stextures/armor/%s/%s_2", Reference.textureLoc, this.texture, this.texture);
        }

        if (slot == ArmorType.LEGS.ordinal())
        {
            return String.format("%stextures/armor/%s/%s_2", Reference.textureLoc, this.texture, this.texture);
        }
        else
        {
            return null;
        }
    }

    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon(String.format
                ("%s%s/%s/%s", Reference.textureLoc, "armor", this.texture, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
    }

    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b)
    {
        if (this.armorType == ArmorType.HELMET.ordinal())
        {
            list.add("Reduction Amount :" + this.getArmorMaterial().getDamageReductionAmount(0));
            list.add(NameHelper.getDurabilityString(stack));
        }

        if (this.armorType == ArmorType.CHEST.ordinal())
        {
            list.add("Reduction Amount :" + this.getArmorMaterial().getDamageReductionAmount(1));
            list.add(NameHelper.getDurabilityString(stack));
        }

        if (this.armorType == ArmorType.LEGS.ordinal())
        {
            list.add("Reduction Amount :" + this.getArmorMaterial().getDamageReductionAmount(2));
            list.add(NameHelper.getDurabilityString(stack));
        }

        if (this.armorType == ArmorType.BOOTS.ordinal())
        {
            list.add("Reduction Amount :" + this.getArmorMaterial().getDamageReductionAmount(3));
            list.add(NameHelper.getDurabilityString(stack));
        }
    }
}
