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
import io.github.fergoman123.fergotools.helper.LogHelper;
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
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.List;

public final class ItemArmorQuartz extends ItemArmorFT
{
    public ItemArmorQuartz(ArmorType type) {
        super(ArmorNames.quartz, Materials.Armor.quartzArmor, type);
    }

    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
    {
        return repairItem.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    @Override
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
        if (armor.getItem() == FTContent.quartzHelmet || armor.getItem() == FTContent.quartzChestplate || armor.getItem() == FTContent.quartzBoots)
        {
            return Textures.quartzArmorLayer1;
        }

        if (armor.getItem() == FTContent.quartzLeggings)
        {
            return Textures.quartzArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        if (stack.getItem() == FTContent.quartzHelmet)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.quartzReduct[0]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.quartzChestplate)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.quartzReduct[1]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.quartzLeggings)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.quartzReduct[2]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.quartzBoots)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.quartzReduct[3]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }
}
