package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.lib.Textures;
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
public class ItemArmorLapis extends ItemArmor {

    public ItemArmorLapis(ArmorType type)
    {
        super(UtilToolArmor.lapisArmor, FergoTools.proxy.addArmor("lapis"), type.ordinal());
        this.setCreativeTab(Tabs.tabFergoArmor);

        if (armorType == 0)
    {
        this.setUnlocalizedName(Strings.ArmorStrings.lapisHelmet);
    }
    else if (armorType == 1)
    {
        this.setUnlocalizedName(Strings.ArmorStrings.lapisChest);
    }
    else if (armorType == 2)
    {
        this.setUnlocalizedName(Strings.ArmorStrings.lapisLegs);
    }
    else if (armorType == 3)
    {
        this.setUnlocalizedName(Strings.ArmorStrings.lapisBoots);
    }
    }

    public void registerIcons(IIconRegister register)
    {
        if (armorType == 0)
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.lapisHelmet);
        }

        if (armorType == 1)
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.lapisChestplate);
        }

        if (armorType == 2)
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.lapisLeggings);
        }

        if (armorType == 3)
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.lapisBoots);
        }
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.lapisHelmet || stack.getItem() == ModItems.lapisChestplate || stack.getItem() == ModItems.lapisBoots)
        {
            return Textures.ArmorTextures.lapisArmorRender1;
        }

        if(stack.getItem() == ModItems.lapisLeggings)
        {
            return Textures.ArmorTextures.lapisArmorRender2;
        }
        else
        {
            return null;
        }
    }

}