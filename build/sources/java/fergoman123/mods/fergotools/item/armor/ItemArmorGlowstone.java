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
public class ItemArmorGlowstone extends ItemArmor {

    public ItemArmorGlowstone(ArmorType type)
    {
        super(UtilToolArmor.glowstoneArmor, FergoTools.proxy.addArmor("glowstone"), type.ordinal());
        this.setCreativeTab(Tabs.tabFergoArmor);

        if (armorType == type.HELMET.ordinal())
        {
            this.setUnlocalizedName(Strings.ArmorStrings.glowstoneHelmet);
        }
        else if (armorType == type.CHEST.ordinal())
        {
            this.setUnlocalizedName(Strings.ArmorStrings.glowstoneChest);
        }
        else if (armorType == type.LEGS.ordinal())
        {
            this.setUnlocalizedName(Strings.ArmorStrings.glowstoneLegs);
        }
        else if (armorType == type.BOOTS.ordinal())
        {
            this.setUnlocalizedName(Strings.ArmorStrings.glowstoneBoots);
        }
    }

    public void registerIcons(IIconRegister register)
    {
        if (armorType == ArmorType.HELMET.ordinal())
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.glowstoneHelmet);
        }

        if (armorType == ArmorType.CHEST.ordinal())
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.glowstoneChestplate);
        }

        if (armorType == ArmorType.LEGS.ordinal())
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.glowstoneLeggings);
        }

        if (armorType == ArmorType.BOOTS.ordinal())
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.glowstoneBoots);
        }
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.glowstoneHelmet || stack.getItem() == ModItems.glowstoneChestplate || stack.getItem() == ModItems.glowstoneBoots)
        {
            return Textures.ArmorTextures.glowstoneArmorRender1;
        }

        if(stack.getItem() == ModItems.glowstoneLeggings)
        {
            return Textures.ArmorTextures.glowstoneArmorRender2;
        }
        else
        {
            return null;
        }
    }

}
