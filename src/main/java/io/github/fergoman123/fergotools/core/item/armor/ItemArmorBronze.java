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

public final class ItemArmorBronze extends ItemArmorFT {
    public ItemArmorBronze(ArmorType type) {
        super(ArmorNames.bronze, Materials.Armor.bronzeArmor, type);
    }

    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
    {
        return repairItem.isItemEqual(new ItemStack(FTContent.ingotBronze)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    @Override
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
        if (armor.getItem() == FTContent.bronzeHelmet || armor.getItem() == FTContent.bronzeChestplate || armor.getItem() == FTContent.bronzeBoots)
        {
            return Textures.bronzeArmorLayer1;
        }

        if (armor.getItem() == FTContent.bronzeLeggings)
        {
            return Textures.bronzeArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        if (stack.getItem() == FTContent.bronzeHelmet)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.bronzeReduct[0]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.bronzeChestplate)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.bronzeReduct[1]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.bronzeLeggings)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.bronzeReduct[2]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
        else if (stack.getItem() == FTContent.bronzeBoots)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.bronzeReduct[3]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
        }
    }
}
