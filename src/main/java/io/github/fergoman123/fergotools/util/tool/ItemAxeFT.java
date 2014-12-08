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
 import io.github.fergoman123.fergotools.reference.names.Locale;
 import io.github.fergoman123.fergotools.util.item.Materials;
 import io.github.fergoman123.fergoutil.helper.NameHelper;
 import io.github.fergoman123.fergoutil.item.tool.ItemFergoAxe;
 import net.minecraft.client.renderer.texture.IIconRegister;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.item.ItemAxe;
 import net.minecraft.item.ItemStack;

 import java.util.List;

 public class ItemAxeFT extends ItemFergoAxe
{
    public ItemAxeFT(ToolMaterial material, String itemName) {
        super(material, 0, itemName, Tabs.tabFergoTools);
    }
}
