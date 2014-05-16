package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
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
public class ItemArmorBronze extends ItemArmor {

    public ItemArmorBronze(ArmorType type)
    {
        super(UtilToolArmor.bronzeArmor, FergoTools.proxy.addArmor("bronze"), type.ordinal());
        this.setCreativeTab(Tabs.tabFergoArmor);

        if (armorType == 0)
        {
            this.setUnlocalizedName(Strings.ArmorStrings.bronzeHelmet);
        }
        else if (armorType == 1)
        {
            this.setUnlocalizedName(Strings.ArmorStrings.bronzeChest);
        }
        else if (armorType == 2)
        {
            this.setUnlocalizedName(Strings.ArmorStrings.bronzeLegs);
        }
        else if (armorType == 3)
        {
            this.setUnlocalizedName(Strings.ArmorStrings.bronzeBoots);
        }
    }

    public void registerIcons(IIconRegister register)
    {
        if (armorType == 0)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.bronzeHelmet);
        }

        if (armorType == 1)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.bronzeChestplate);
        }

        if (armorType == 2)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.bronzeLeggings);
        }

        if (armorType == 3)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.bronzeBoots);
        }
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.bronzeHelmet || stack.getItem() == ModItems.bronzeChestplate || stack.getItem() == ModItems.bronzeBoots)
        {
            return ArmorTextures.bronzeArmorRender1;
        }

        if(stack.getItem() == ModItems.bronzeLeggings)
        {
            return ArmorTextures.bronzeArmorRender2;
        }
        else
        {
            return null;
        }
    }

}
