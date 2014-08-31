 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergotools.util.tool;

import fergoman123.mods.fergotools.creativetab.CreativeTabsFergoTools;
import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergotools.reference.Strings;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

public class ItemShearsFT extends ItemShears
{
    public Keyboard kb;

    public ItemShearsFT(int maxUses)
    {
        super();
        this.setMaxStackSize(1);
        this.setMaxDamage(maxUses);
        this.setCreativeTab(CreativeTabsFergoTools.tabFergoShears);
    }

    @Override
    public String getUnlocalizedName()
    {
        return NameHelper.format(Strings.OtherStrings.itemForLocalization, Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return NameHelper.format(Strings.OtherStrings.itemForLocalization, Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
