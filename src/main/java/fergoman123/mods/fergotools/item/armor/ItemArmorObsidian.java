package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
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
public class ItemArmorObsidian extends ItemArmor {

    public ItemArmorObsidian(ArmorType type)
    {
        super(UtilToolArmor.obsidianArmor, FergoTools.proxy.addArmor(Strings.MaterialStrings.obsidianToolMat), type.ordinal());
        this.setCreativeTab(Tabs.tabFergoArmor);
        if (armorType == 0)
        {
            this.setUnlocalizedName(ArmorStrings.obsidianHelmet);
        }
        else if (armorType == 1)
        {
            this.setUnlocalizedName(ArmorStrings.obsidianChest);
        }
        else if (armorType == 2)
        {
            this.setUnlocalizedName(ArmorStrings.obsidianLegs);
        }
        else if (armorType == 3)
        {
            this.setUnlocalizedName(ArmorStrings.obsidianBoots);
        }

    }

    public void registerIcons(IIconRegister register)
    {
        if (armorType == 0)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.obsidianHelmet);
        }

        if (armorType == 1)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.obsidianChestplate);
        }

        if (armorType == 2)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.obsidianLeggings);
        }

        if (armorType == 3)
        {
            this.itemIcon = register.registerIcon(ArmorTextures.obsidianBoots);
        }
    }

    public String getArmorTexture(ItemStack is, Entity entity, int slot, String type)
    {
        if(is.getItem() == ModItems.obsidianHelmet || is.getItem() == ModItems.obsidianChestplate || is.getItem() == ModItems.obsidianBoots)
        {
            return ArmorTextures.obsidianArmorRender1;
        }

        if(is.getItem() == ModItems.obsidianLeggings)
        {
            return ArmorTextures.obsidianArmorRender2;
        }
        else
        {
            return null;
        }
    }

}
