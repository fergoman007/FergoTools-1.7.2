package fergoman123.mods.fergotools.util.base;

import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public abstract class ItemBowFT extends ItemBow{

    public IIcon[] textures;

    public ItemBowFT()
    {
        this.maxStackSize = 1;
        this.setCreativeTab(Tabs.tabFergoBows);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    public abstract void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int par4);

    public abstract ItemStack onEaten(ItemStack stack, World world, EntityPlayer player);

    public abstract int getMaxItemUseDuration(ItemStack stack);

    public abstract EnumAction getItemUseAction(ItemStack stack);

    public abstract ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player);

    public abstract int getEnchantability();

    public abstract void registerIcons(IIconRegister register);

    public abstract IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining);


}
