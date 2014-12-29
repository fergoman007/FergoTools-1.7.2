 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.tool;

 import io.github.fergoman123.fergotools.creativetab.Tabs;
 import io.github.fergoman123.fergotools.reference.Reference;
 import io.github.fergoman123.fergoutil.helper.NameHelper;
 import io.github.fergoman123.fergoutil.item.tool.ItemFergoShovel;
 import net.minecraft.client.renderer.texture.IIconRegister;
 import net.minecraft.creativetab.CreativeTabs;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemSpade;
 import net.minecraft.item.ItemStack;

 import java.util.List;

 public class ItemShovelFT extends ItemSpade
 {

     public Item repairItem;

     public ItemShovelFT(ToolMaterial material, Item repairItem) {
         super(material);
         this.repairItem = repairItem;
         this.setMaxDamage(material.getMaxUses());
         this.setCreativeTab(Tabs.tabFergoTools);
     }

     public boolean getIsReapirable(ItemStack itemToRepair, ItemStack repairItem)
     {
         return repairItem.isItemEqual(new ItemStack(this.repairItem)) || super.getIsRepairable(itemToRepair, repairItem);
     }

     public String getUnlocalizedName()
     {
         return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
     }

     public String getUnlocalizedName(ItemStack stack)
     {
         return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
     }

     public void registerIcons(IIconRegister register)
     {
         itemIcon = register.registerIcon(String.format("%s%s/%s/%s", Reference.textureLoc, "tool", "shovel", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
     }

     @Override
     public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
         list.add(NameHelper.getDurabilityString(stack));
     }
 }
