package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings.ArmorStrings;
import fergoman123.mods.fergotools.lib.Strings.MaterialStrings;
import fergoman123.mods.fergotools.lib.Textures.ArmorTextures;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.ArmorType;
import fergoman123.mods.fergoutil.util.UtilArmor;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorQuartz extends ItemArmor{
    public static final String armor = MaterialStrings.quartzArmor;

    public static String armorName;

    public static UtilArmor helper;




    public ItemArmorQuartz(ArmorType type)
    {
        super(UtilToolArmor.quartzArmor, FergoTools.proxy.addArmor(armor), type.ordinal());
        this.setCreativeTab(Tabs.tabFergoArmor);

        if (armorType == helper.HELMET)
        {
            this.setUnlocalizedName(ArmorStrings.quartzHelmet);
        }
        else if (armorType == helper.CHEST)
        {
            this.setUnlocalizedName(ArmorStrings.quartzChest);
        }
        else if (armorType == helper.LEGS)
        {
            this.setUnlocalizedName(ArmorStrings.quartzLegs);
        }
        else if (armorType == helper.BOOTS)
        {
            this.setUnlocalizedName(ArmorStrings.quartzBoots);
        }
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return par2ItemStack.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    public void registerIcons(IIconRegister register)
    {
        if (this.armorType == 0)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.quartzHelmet);
        }

        if (this.armorType == 1)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.quartzChestplate);
        }

        if (this.armorType == 2)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.quartzLeggings);
        }

        if (this.armorType == 3)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.quartzBoots);
        }
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.quartzHelmet || stack.getItem() == ModItems.quartzChestplate || stack.getItem() == ModItems.quartzBoots)
        {
            return ArmorTextures.quartzArmorRender1;
        }

        if (stack.getItem() == ModItems.quartzLeggings)
        {
            return ArmorTextures.quartzArmorRender2;
        }
        else
        {
            return null;
        }
    }

}
