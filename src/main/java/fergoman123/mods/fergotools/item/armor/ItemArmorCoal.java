package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings.ArmorStrings;
import fergoman123.mods.fergotools.lib.Textures.ArmorTextures;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemArmorCoal extends ItemArmor {

    public ItemArmorCoal(ArmorType type)
    {
        super(UtilToolArmor.coalArmor, FergoTools.proxy.addArmor("coal"), type.ordinal());
        this.setCreativeTab(Tabs.tabFergoArmor);

        if (armorType == 0)
        {
            this.setUnlocalizedName(ArmorStrings.coalHelmet);
        }
        else if (armorType == 1)
        {
            this.setUnlocalizedName(ArmorStrings.coalChest);
        }
        else if (armorType == 2)
        {
            this.setUnlocalizedName(ArmorStrings.coalLegs);
        }
        else if (armorType == 3)
        {
            this.setUnlocalizedName(ArmorStrings.coalBoots);
        }
    }

    public void registerIcons(IIconRegister register)
    {
        if (armorType == 0)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.coalHelmet);
        }

        if (armorType == 1)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.coalChestplate);
        }

        if (armorType == 2)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.coalLeggings);
        }

        if (armorType == 3)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.coalBoots);
        }
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.coalHelmet || stack.getItem() == ModItems.coalChestplate || stack.getItem() == ModItems.coalBoots)
        {
            return ArmorTextures.coalArmorRender1;
        }

        if(stack.getItem() == ModItems.coalLeggings)
        {
            return ArmorTextures.coalArmorRender2;
        }
        else
        {
            return null;
        }
    }

}