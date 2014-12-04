 /*
   * Fergoman123's Tools
   * Copyright (c) 2014 fergoman123.
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the GNU Lesser Public License v2.1
   * which accompanies this distribution, and is available at
   * http://www.gnu.org/licenses/gpl-3.0.html
   */

package io.github.fergoman123.fergotools.core.item.armor;

import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.reference.Ints;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.ArmorTooltipLocale;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public final class ItemArmorCoal extends ItemArmorFT
{
    public ItemArmorCoal(ArmorType type) {
        super(ArmorNames.coal, Materials.Armor.coalArmor, type);
    }

    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
    {
        return repairItem.isItemEqual(new ItemStack(FTContent.ingotCoal)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    @Override
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
        if (armor.getItem() == FTContent.coalHelmet || armor.getItem() == FTContent.coalChestplate || armor.getItem() == FTContent.coalBoots)
        {
            return Textures.coalArmorLayer1;
        }

        if (armor.getItem() == FTContent.coalLeggings)
        {
            return Textures.coalArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        if (stack.getItem() == FTContent.coalHelmet)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.coalReduct[0]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.coalChestplate)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.coalReduct[1]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.coalLeggings)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.coalReduct[2]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.coalBoots)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.coalReduct[3]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }
}
