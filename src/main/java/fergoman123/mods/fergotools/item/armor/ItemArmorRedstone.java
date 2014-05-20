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
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemArmorRedstone extends ItemArmor{

    public ItemArmorRedstone(ArmorType type)
    {
        super(UtilToolArmor.redstoneArmor, FergoTools.proxy.addArmor("redstone"), type.ordinal());
        this.setCreativeTab(Tabs.tabFergoArmor);

        if (armorType == type.HELMET.ordinal())
        {
            this.setUnlocalizedName(Strings.ArmorStrings.redstoneHelmet);
        }
        else if (armorType == type.CHEST.ordinal())
        {
            this.setUnlocalizedName(Strings.ArmorStrings.redstoneChest);
        }
        else if (armorType == type.LEGS.ordinal())
        {
            this.setUnlocalizedName(Strings.ArmorStrings.redstoneLegs);
        }
        else if (armorType == type.BOOTS.ordinal())
        {
            this.setUnlocalizedName(Strings.ArmorStrings.redstoneBoots);
        }
    }

    public void registerIcons(IIconRegister register)
    {
        if (armorType == ArmorType.HELMET.ordinal())
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.redstoneHelmet);
        }

        if (armorType == ArmorType.CHEST.ordinal())
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.redstoneChestplate);
        }

        if (armorType == ArmorType.LEGS.ordinal())
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.redstoneLeggings);
        }

        if (armorType == ArmorType.BOOTS.ordinal())
        {
            this.itemIcon = register.registerIcon(Textures.ArmorTextures.redstoneBoots);
        }
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.redstoneHelmet || stack.getItem() == ModItems.redstoneChestplate || stack.getItem() == ModItems.redstoneBoots)
        {
            return Textures.ArmorTextures.redstoneArmorRender1;
        }

        if (stack.getItem() == ModItems.redstoneLeggings)
        {
            return Textures.ArmorTextures.redstoneArmorRender2;
        }
        else
        {
            return null;
        }
    }
}
