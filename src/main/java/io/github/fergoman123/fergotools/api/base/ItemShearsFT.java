/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.api.base;


import java.util.List;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemShearsFT extends ItemShears {
	private ToolMaterial material;
	
    public ItemShearsFT(ToolMaterial material, String name) {
    	super();
    	this.setMaxDamage(material.getMaxUses());
    	this.setUnlocalizedName("ft." + name);
    	this.material = material;
    }
    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List list, boolean advanced) {
    	list.add(StatCollector.translateToLocal("ft.tooltip.toolmat") + " " + this.material.toString());
    	list.add(StatCollector.translateToLocal("ft.tooltip.uses") + " " + NameHelper.getDurabilityString(stack));
    }
}
