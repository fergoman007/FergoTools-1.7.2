/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.github.fergoman123.fergotools.api.content.FTContent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;

public class OnLivingUpdateEvent
{
    public static final OnLivingUpdateEvent instance = new OnLivingUpdateEvent();

    @SubscribeEvent
    public void onLivingUpdateEvent(LivingEvent.LivingUpdateEvent event)
    {
        if (event.entityLiving != null)
        {
            if (event.entityLiving instanceof EntityPlayer)
            {
                EntityPlayer player = (EntityPlayer)event.entityLiving;
                if (player.getCurrentArmor(2) != null)
                {
                    if (player.getCurrentArmor(2).getItem() == FTContent.adamantiumChestplate)
                    {
                        player.capabilities.allowFlying = true;// gives player flight
                    }
                }
                else if(!player.capabilities.isCreativeMode)
                {
                    player.capabilities.isFlying = false;
                    player.capabilities.allowFlying = false;
                }
            }
        }
    }
}
