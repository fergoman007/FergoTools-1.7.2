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
import io.github.fergoman123.fergotools.util.PotionList;
import io.github.fergoman123.fergotools.util.base.ItemArmorFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public final class ItemArmorAdamantium extends ItemArmorFT
{

    public ItemArmorAdamantium(String armorName, ArmorMaterial material, ArmorType type) {
        super(armorName, material, type);
    }

    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem)
    {
        return repairItem.isItemEqual(new ItemStack(FTContent.ingotAdamantium)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    @Override
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
        if (armor.getItem() == FTContent.adamantiumHelmet || armor.getItem() == FTContent.adamantiumChestplate || armor.getItem() == FTContent.adamantiumBoots)
        {
            return Textures.adamantiumArmorLayer1;
        }

        if (armor.getItem() == FTContent.adamantiumLeggings)
        {
            return Textures.adamantiumArmorLayer2;
        }
        else
        {
            return null;
        }
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
    {
        ItemStack helmet = player.getCurrentArmor(3);
        ItemStack chest = player.getCurrentArmor(2);
        ItemStack legs = player.getCurrentArmor(1);
        ItemStack boots = player.getCurrentArmor(0);

        if (helmet != null) {
            if (helmet.getItem() == FTContent.adamantiumHelmet) {
                player.addPotionEffect(PotionList.waterBreathing);
                player.addPotionEffect(PotionList.saturation);
            }
        }

        if (chest != null)
        {
            if (chest.getItem() == FTContent.adamantiumChestplate)
            {
                player.addPotionEffect(PotionList.absorption);
            }
        }

        if (legs != null)
        {
            if (legs.getItem() == FTContent.adamantiumLeggings)
            {
                player.addPotionEffect(PotionList.jump);
            }
        }

        if (boots != null)
        {
            if (boots.getItem() == FTContent.adamantiumBoots)
            {
                player.addPotionEffect(PotionList.moveSpeed);
            }
        }
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        if (stack.getItem() == FTContent.adamantiumHelmet)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.adamantiumReduct[0]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.adamantiumAbilities[0]));
        }
        else if (stack.getItem() == FTContent.adamantiumChestplate)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.adamantiumReduct[1]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.adamantiumAbilities[0]));
        }
        else if (stack.getItem() == FTContent.adamantiumLeggings)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.adamantiumReduct[2]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.adamantiumAbilities[0]));
        }
        else if (stack.getItem() == FTContent.adamantiumBoots)
        {
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.reductAmount) + " " + Ints.Armor.adamantiumReduct[3]);
            list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translateToLocal(ArmorTooltipLocale.adamantiumAbilities[0]));
        }
    }
}
