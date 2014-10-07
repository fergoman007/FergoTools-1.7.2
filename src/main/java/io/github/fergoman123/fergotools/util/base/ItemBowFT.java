package io.github.fergoman123.fergotools.util.base;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public abstract class ItemBowFT extends ItemBow
{

    @SideOnly(Side.CLIENT)
    public IIcon[] textures;

    public ItemBowFT(int maxUses)
    {
        super();
        this.setMaxDamage(maxUses);
        this.setMaxStackSize(1);
        this.setCreativeTab(Tabs.tabFergoBows);
    }

    public abstract void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4);

    public abstract ItemStack onEaten(ItemStack stack, World world, EntityPlayer player);

    public abstract EnumAction getItemUseAction(ItemStack stack);

    public abstract ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player);

    public abstract int getItemEnchantability();

    public abstract void registerIcons(IIconRegister register);

    public abstract IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining);

}
