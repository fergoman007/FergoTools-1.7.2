package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.strings.Strings;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.recipe.UtilToolArmor;
import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemArmorEmerald extends ItemArmor {

    public ItemArmorEmerald(ArmorType type)
    {
        super(UtilToolArmor.emeraldArmor, FergoTools.proxy.addArmor("emerald"), type.ordinal());
        this.setCreativeTab(Tabs.tabFergoArmor);

        if (armorType == 0)
        {
            this.setUnlocalizedName(Strings.ArmorStrings.emeraldHelmet);
        }
        else if (armorType == 1)
        {
            this.setUnlocalizedName(Strings.ArmorStrings.emeraldChest);
        }
        else if (armorType == 2)
        {
            this.setUnlocalizedName(Strings.ArmorStrings.emeraldLegs);
        }
        else if (armorType == 3)
        {
            this.setUnlocalizedName(Strings.ArmorStrings.emeraldBoots);
        }
    }

    public void registerIcons(IIconRegister register)
    {
        if (armorType == 0)
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.emeraldHelmet);
        }

        if (armorType == 1)
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.emeraldChestplate);
        }

        if (armorType == 2)
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.emeraldLeggings);
        }

        if (this.armorType == 3)
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.emeraldBoots);
        }
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.emeraldHelmet || stack.getItem() == ModItems.emeraldChestplate || stack.getItem() == ModItems.emeraldBoots)
        {
            return Textures.ArmorTextures.emeraldArmorRender1;
        }

        if(stack.getItem() == ModItems.emeraldLeggings)
        {
            return Textures.ArmorTextures.emeraldArmorRender2;
        }
        else
        {
            return null;
        }
    }

}