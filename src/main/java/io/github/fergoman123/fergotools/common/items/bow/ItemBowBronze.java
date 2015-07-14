package io.github.fergoman123.fergotools.common.items.bow;

import io.github.fergoman123.fergotools.api.base.ItemBowFT;
import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergotools.util.ModelHelper;
import io.github.fergoman123.fergotools.util.item.TM;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemBowBronze extends ItemBowFT {
    public ItemBowBronze(){
        super(TM.bronze, ItemNames.bowBronze);
    }

    @Override
    public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining) {
        return ModelHelper.getBowModels(stack, ItemNames.bowBronze, player, useRemaining);
    }
}
