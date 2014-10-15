 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.tool;

 import io.github.fergoman123.fergoutil.helper.NameHelper;
 import io.github.fergoman123.fergotools.creativetab.Tabs;
 import io.github.fergoman123.fergotools.reference.Reference;
 import net.minecraft.client.renderer.texture.IIconRegister;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.item.ItemPickaxe;
 import net.minecraft.item.ItemStack;

 import java.util.List;

 public abstract class ItemPickaxeFT extends ItemPickaxe
{

    public ItemPickaxeFT(ToolMaterial material, int maxUses) {
        super(material);
        this.setMaxDamage(maxUses);
        this.setMaxStackSize(1);
        this.setCreativeTab(Tabs.tabFergoTools);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public void registerIcons(IIconRegister register) {
        itemIcon = register.registerIcon(String.format("%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    public abstract void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b);
}
