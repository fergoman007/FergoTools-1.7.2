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
 import io.github.fergoman123.fergotools.reference.Reference;
 import net.minecraft.client.renderer.texture.IIconRegister;
 import net.minecraft.item.ItemAxe;
 import net.minecraft.item.ItemStack;

 public abstract class ItemAxeFT extends ItemAxe
{
    public ItemAxeFT(ToolMaterial material, int maxUses) {
        super(material);
        this.setMaxStackSize(1);
        this.setMaxDamage(maxUses);
        this.setCreativeTab(Tabs.tabFergoTools);
        this.setTextureName(String.format("%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public void registerIcons(IIconRegister r) {
        itemIcon = r.registerIcon(String.format("%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
}
