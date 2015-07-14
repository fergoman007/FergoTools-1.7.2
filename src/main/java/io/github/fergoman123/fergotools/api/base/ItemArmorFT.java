/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemArmorFT extends ItemArmor {
    private ArmorMaterial material;
    private ArmorType type;

    public ItemArmorFT(ArmorMaterial material, ArmorType type, String name) {
        super(material, 0, type.ordinal());
        this.setMaxDamage(material.getDurability(type.ordinal()));
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setUnlocalizedName("ft." + name);
        this.material = material;
        this.type = type;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (slot == ArmorType.helmet.ordinal() || slot == ArmorType.chestplate.ordinal() || slot == ArmorType.boots.ordinal()) {
            return "fergotools:textures/models/armor/" + this.material.getName() + "_1";
        } else if (slot == ArmorType.leggings.ordinal()) {
            return "fergotools:textures/models/armor/" + this.material.getName() + "_2";
        } else {
            return null;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List list, boolean advanced) {
        list.add(StatCollector.translateToLocal("ft.tooltip.armormat") + " " + this.material.getName());
        if (this.type == ArmorType.helmet) {
            list.add(StatCollector.translateToLocal("ft.tooltip.uses") + " " + this.material.getDamageReductionAmount(0));
            list.add(StatCollector.translateToLocal("ft.tooltip.reduct") + " " + this.material.getDamageReductionAmount(0));
        }

        if (this.type == ArmorType.chestplate) {
            list.add(StatCollector.translateToLocal("ft.tooltip.uses") + " " + this.material.getDamageReductionAmount(1));
            list.add(StatCollector.translateToLocal("ft.tooltip.reduct") + " " + this.material.getDamageReductionAmount(1));
        }

        if (this.type == ArmorType.leggings) {
            list.add(StatCollector.translateToLocal("ft.tooltip.uses") + " " + this.material.getDamageReductionAmount(2));
            list.add(StatCollector.translateToLocal("ft.tooltip.reduct") + " " + this.material.getDamageReductionAmount(2));
        }

        if (this.type == ArmorType.boots) {
            list.add(StatCollector.translateToLocal("ft.tooltip.uses") + " " + this.material.getDamageReductionAmount(3));
            list.add(StatCollector.translateToLocal("ft.tooltip.reduct") + " " + this.material.getDamageReductionAmount(3));
        }
        list.add(StatCollector.translateToLocal("ft.tooltip.ench") + " " + this.material.getEnchantability());
        list.add(StatCollector.translateToLocal("ft.tooltip.rpitem") + " " + Item.itemRegistry.getNameForObject(this.material.getRepairItem()));
    }
}
