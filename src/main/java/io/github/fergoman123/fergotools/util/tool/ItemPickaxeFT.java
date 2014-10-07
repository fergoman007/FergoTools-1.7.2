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
 import net.minecraft.client.renderer.texture.IIconRegister;
 import net.minecraft.item.ItemPickaxe;
 import net.minecraft.item.ItemStack;

 public class ItemPickaxeFT extends ItemPickaxe
{

    public ItemPickaxeFT(ToolMaterial material, int maxUses) {
        super(material);
        this.setMaxDamage(maxUses);
        this.setMaxStackSize(1);
        this.setCreativeTab(Tabs.tabFergoTools);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format(NameHelper.getLocaleType(1), NameHelper.getModString(1), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format(NameHelper.getLocaleType(1), NameHelper.getModString(1), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public void registerIcons(IIconRegister register) {
        itemIcon = register.registerIcon(String.format("%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
}
