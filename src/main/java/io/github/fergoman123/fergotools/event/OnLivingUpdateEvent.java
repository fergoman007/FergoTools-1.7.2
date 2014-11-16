package io.github.fergoman123.fergotools.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.github.fergoman123.fergotools.core.FTContent;
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
