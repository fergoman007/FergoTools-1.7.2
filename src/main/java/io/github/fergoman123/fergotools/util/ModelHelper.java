/*
 * Fergoman123's Tools
 * Copyright (c) 2014-2015 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.util;

import io.github.fergoman123.fergotools.api.base.ItemBowFT;
import io.github.fergoman123.fergotools.api.base.ModelResLocFT;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ModelHelper
{
    public static ModelResourceLocation getBowModels(ItemStack stack, String bowName, EntityPlayer player, int usesRemaining){
        ModelResLocFT model = new ModelResLocFT(bowName);
        boolean[] isRemaining = new boolean[]{usesRemaining >= 18, usesRemaining > 13, usesRemaining > 0};
        if (stack.getItem() instanceof ItemBowFT && player.getItemInUse() != null){
            if (isRemaining[0]){
                model = new ModelResLocFT(bowName + "_2");
            } else if (isRemaining[1]){
                model = new ModelResLocFT(bowName + "_1");
            } else if (isRemaining[2]){
                model = new ModelResLocFT(bowName + "_0");
            }
        }
        return model;
    }

    public static void registerBowItem(ItemBowFT bow, String bowName){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bow, 0, new ModelResLocFT(bowName));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bow, 0, new ModelResLocFT(bowName + "_0"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bow, 0, new ModelResLocFT(bowName + "_1"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bow, 0, new ModelResLocFT(bowName + "_2"));
        ModelBakery.addVariantName(bow, bowName);
        ModelBakery.addVariantName(bow, bowName + "_0");
        ModelBakery.addVariantName(bow, bowName + "_1");
        ModelBakery.addVariantName(bow, bowName + "_2");
    }
}
