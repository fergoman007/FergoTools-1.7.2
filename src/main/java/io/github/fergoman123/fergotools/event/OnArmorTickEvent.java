/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.event;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergoutil.util.PotionList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnArmorTickEvent
{
    public static final OnArmorTickEvent instance = new OnArmorTickEvent();

    @SubscribeEvent
    public void onArmorTick(LivingEvent.LivingUpdateEvent event)
    {
        if (event.entityLiving != null)
        {
            if (event.entityLiving instanceof EntityPlayer)
            {
                EntityPlayer player = (EntityPlayer)event.entityLiving;

                ItemStack helmet = player.getCurrentArmor(3);
                ItemStack chest = player.getCurrentArmor(2);
                ItemStack legs = player.getCurrentArmor(1);
                ItemStack boots = player.getCurrentArmor(0);

                if (helmet != null)
                {
                    if (chest.getItem() == ModItems.adamantiumHelmet)
                    {
                        player.addPotionEffect(PotionList.waterBreathing);
                        player.addPotionEffect(PotionList.saturation);
                    }
                }

                if (chest != null)
                {
                    if (chest.getItem() == ModItems.adamantiumChestplate)
                    {
                        player.capabilities.allowFlying = true;// gives player flight
                        player.addPotionEffect(PotionList.absorption);
                    }
                }
                else if(!player.capabilities.isCreativeMode)
                {
                    player.capabilities.isFlying = false;
                    player.capabilities.allowFlying = false;
                }

                if (legs != null)
                {
                    if (legs.getItem() == ModItems.adamantiumLeggings)
                    {
                        player.addPotionEffect(PotionList.jump);
                    }
                }

                if (boots != null)
                {
                    if (boots.getItem() == ModItems.adamantiumBoots)
                    {
                        player.addPotionEffect(PotionList.moveSpeed);
                    }
                }
            }
        }
    }
}
