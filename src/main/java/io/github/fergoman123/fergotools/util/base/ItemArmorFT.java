/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public abstract class ItemArmorFT extends ItemArmor
{

    public static final class ArmorNames
    {
        public static final String quartz = "quartz";
        public static final String obsidian = "obsidian";
        public static final String emerald = "emerald";
        public static final String lapis = "lapis";
        public static final String bronze = "bronze";
        public static final String coal = "coal";
        public static final String glowstone = "glowstone";
        public static final String redstone = "redstone";
        public static final String adamantium = "adamantium";
    }

    /**
     * main armor constructor
     * @param armorName the base name of the armor
     * @param material the armor material
     * @param type the type of armor (0 = Helmet, 1 = Chestplate, 2 = Leggings, 3 = Boots)
     */
    public ItemArmorFT(String armorName, ArmorMaterial material, ArmorType type)
    {
        super(material, 1, type.ordinal());
        this.setUnlocalizedName(armorName);
        this.setCreativeTab(Tabs.tabFergoArmor);
        this.setMaxStackSize(1);
        this.setTextureName(String.format("%s%s%s", Reference.textureLoc, armorName, getArmorTypeName(this.armorType)));
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), getArmorTypeName(this.armorType));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)), getArmorTypeName(stack.getItem()));
    }

    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon(String.format("%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    /**
     * gets the type of armor base on the armor slot
     * @param slot the slot
     * @return the armor type (Helmet, Chestplate, Leggings, Boots)
     */
    protected String getArmorTypeName(int slot)
    {
        if (slot == 0)
        {
            return "Helmet";
        }
        else if (slot == 1)
        {
            return "Chestplate";
        }
        else if (slot == 2)
        {
            return "Leggings";
        }
        else
        {
            return "Boots";
        }
    }

    /**
     * gets the armor type based on item
     * @param item the item
     * @return the armor type
     */
    protected String getArmorTypeName(Item item)
    {
        if (item instanceof ItemArmor)
        {
            ItemArmor itemArmor = (ItemArmor) item;
            return getArmorTypeName(itemArmor.armorType);
        }
        return "";
    }
}
