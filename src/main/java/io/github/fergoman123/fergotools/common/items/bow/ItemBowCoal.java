package io.github.fergoman123.fergotools.common.items.bow;

import io.github.fergoman123.fergotools.api.base.ItemBowFT;
import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergotools.util.ModelHelper;
import io.github.fergoman123.fergotools.util.item.TM;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemBowCoal extends ItemBowFT{
    public ItemBowCoal() {
        super(TM.glowstone, ItemNames.bowCoal);
    }

    @Override
    public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining) {
        return ModelHelper.getBowModels(stack, ItemNames.bowCoal, player, useRemaining);
    }
}
