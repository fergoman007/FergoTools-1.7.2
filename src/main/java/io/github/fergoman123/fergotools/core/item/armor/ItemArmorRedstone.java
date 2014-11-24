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
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public final class ItemArmorRedstone extends ItemArmorFT
{
    public ItemArmorRedstone(String armorName, ArmorMaterial material, ArmorType type) {
        super(armorName, material, type);
    }

    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
    {
        return repairItem.isItemEqual(new ItemStack(FTContent.gemRedstone)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    @Override
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
        if (armor.getItem() == FTContent.redstoneHelmet || armor.getItem() == FTContent.redstoneChestplate || armor.getItem() == FTContent.redstoneBoots)
        {
            return Textures.redstoneArmorLayer1;
        }

        if (armor.getItem() == FTContent.redstoneLeggings)
        {
            return Textures.redstoneArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        if (stack.getItem() == FTContent.redstoneHelmet)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.redstoneReduct[0]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.redstoneChestplate)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.redstoneReduct[1]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.redstoneLeggings)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.redstoneReduct[2]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.redstoneBoots)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.redstoneReduct[3]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }
}
