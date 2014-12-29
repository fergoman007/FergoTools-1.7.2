 /*
   * Fergoman123's Tools
   * Copyright (c) 2014 fergoman123.
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the GNU Lesser Public License v2.1
   * which accompanies this distribution, and is available at
   * http://www.gnu.org/licenses/gpl-3.0.html
   */

package io.github.fergoman123.fergotools.util.base;

 import cpw.mods.fml.relauncher.Side;
 import cpw.mods.fml.relauncher.SideOnly;
 import io.github.fergoman123.fergotools.creativetab.Tabs;
 import io.github.fergoman123.fergotools.helper.ItemHelper;
 import io.github.fergoman123.fergotools.reference.Reference;
 import io.github.fergoman123.fergoutil.helper.NameHelper;
 import io.github.fergoman123.fergoutil.item.ItemBowFergo;
 import net.minecraft.client.renderer.texture.IIconRegister;
 import net.minecraft.creativetab.CreativeTabs;
 import net.minecraft.enchantment.Enchantment;
 import net.minecraft.enchantment.EnchantmentHelper;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.entity.projectile.EntityArrow;
 import net.minecraft.init.Items;
 import net.minecraft.item.EnumAction;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemBow;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.IIcon;
 import net.minecraft.world.World;
 import net.minecraftforge.common.MinecraftForge;
 import net.minecraftforge.event.entity.player.ArrowLooseEvent;
 import net.minecraftforge.event.entity.player.ArrowNockEvent;

 public class ItemBowFT extends ItemBow
{
    public static final String[] pullArray = new String[]{"_0", "_1", "_2", "_3"};

    @SideOnly(Side.CLIENT)
    public IIcon[] textures;

    public String textureName;
    public Item repairItem;

    public ItemBowFT(ToolMaterial material, String textureName, Item repairItem)
    {
        super();
        this.textureName = textureName;
        this.repairItem = repairItem;
        this.setMaxDamage(material.getMaxUses());
        this.setMaxStackSize(1);
    }

    @Override
    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem) {
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
        this.textures = new IIcon[pullArray.length];
        for (int i = 0; i < pullArray.length; i++)
        {
            this.textures[i] = register.registerIcon(String.format
                    ("%sbow/%s/bow%s%s", Reference.textureLoc, this.textureName.toLowerCase(), this.textureName, pullArray[i]));
        }
    }

    public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
    {
        if(player.getItemInUse() == null) return this.itemIcon;
        int pulling = stack.getMaxItemUseDuration() - useRemaining;
        if(pulling >= 18)
        {
            return textures[2];
        }
        else if(pulling > 13)
        {
            return textures[1];
        }
        else if(pulling > 0)
        {
            return textures[0];
        }
        return this.itemIcon;
    }
}
