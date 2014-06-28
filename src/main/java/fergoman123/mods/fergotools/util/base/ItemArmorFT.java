package fergoman123.mods.fergotools.util.base;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 02/06/2014.
 */
public abstract class ItemArmorFT extends ItemArmor implements Armor.IArmor{

    public ItemArmorFT(String armorName, ArmorMaterial material, Armor.EnumArmorType type)
    {
        super(material, 1, type.ordinal());
        this.setCreativeTab(Tabs.tabFergoArmor);
        this.setUnlocalizedName(armorName);
        this.setTextureName(String.format("%s%s%s", Reference.textureLoc, armorName, getArmorTypeName(this.armorType)));
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), getArmorTypeName(this.armorType));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(itemStack)), getArmorTypeName(itemStack.getItem()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        super.registerIcons(iconRegister);
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getArmorTypeName(Item item)
    {
        if (item instanceof ItemArmor)
        {ItemArmor itemArmor = (ItemArmor) item;
         return getArmorTypeName(itemArmor.armorType);}
         return "";
    }

    protected String getArmorTypeName(int slot)
    {
        if (slot == 0)
        {return "Helmet";}
        else if (slot == 1)
        {return "Chestplate";}
        else if (slot == 2)
        {return "Leggings";}
        else{return "Boots";}
    }

    public abstract String getArmorTexture(ItemStack stack, Entity entity, int slot, String type);
}
