 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.tool;


 import fergoman123.mods.fergoutil.helper.NameHelper;
 import io.github.fergoman123.fergotools.creativetab.Tabs;
 import net.minecraft.item.ItemShears;
 import net.minecraft.item.ItemStack;

 public abstract class ItemShearsFT extends ItemShears
{
    public ItemShearsFT(int maxUses)
    {
        super();
        this.setMaxDamage(maxUses);
        this.setCreativeTab(Tabs.tabFergoShears);
        this.setMaxStackSize(1);
        this.setTextureName(String.format("%s%s", NameHelper.getModString(1), NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", NameHelper.getModString(1), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", NameHelper.getModString(1), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
}
