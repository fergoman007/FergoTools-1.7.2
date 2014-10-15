package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public abstract class ItemArmorFT extends ItemArmor
{

    public static final class ArmorNames
    {
        public static final String quartz = "quartz";
        public static final String obsidian = "obsidian";
        public static final String emerald = "emerald";
        public static final String lapis = "lapis";
        public static final String bronze = "bronze";
        public static final String coal = "coal";
        public static final String glowstone = "glowstone";
        public static final String redstone = "redstone";
        public static final String adamantium = "adamantium";
    }

    public ItemArmorFT(String armorName, ArmorMaterial material, ArmorType type)
    {
        super(material, 1, type.ordinal());
        this.setUnlocalizedName(armorName);
        this.setCreativeTab(Tabs.tabFergoArmor);
        this.setMaxStackSize(1);
        this.setTextureName(String.format("%s%s%s", Reference.textureLoc, armorName, getArmorTypeName(this.armorType)));
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), getArmorTypeName(this.armorType));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)), getArmorTypeName(stack.getItem()));
    }

    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon(String.format("%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getArmorTypeName(int slot)
    {
        if (slot == 0)
        {
            return "Helmet";
        }
        else if (slot == 1)
        {
            return "Chestplate";
        }
        else if (slot == 2)
        {
            return "Leggings";
        }
        else
        {
            return "Boots";
        }
    }

    protected String getArmorTypeName(Item item)
    {
        if (item instanceof ItemArmor)
        {
            ItemArmor itemArmor = (ItemArmor) item;
            return getArmorTypeName(itemArmor.armorType);
        }
        return "";
    }
}
