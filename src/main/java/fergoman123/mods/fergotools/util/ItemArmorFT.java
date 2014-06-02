package fergoman123.mods.fergotools.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ISpecialArmor;

/**
 * Created by Fergoman123 on 02/06/2014.
 */
public abstract class ItemArmorFT extends ItemArmor implements ISpecialArmor{

    /**
     *
     * @param armorName type of armor
     * @param material the armor material
     * @param type the type of the armor 0 = helmet, 1 = chestplate, 2 = leggings, 3 = boots
     */
    public ItemArmorFT(String armorName, ArmorMaterial material, ArmorType type)
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
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(itemStack)), getArmorTypeName(itemStack.getItem()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        super.registerIcons(iconRegister);
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    /**
     * Get the displayed effective armor.
     *
     * @param player
     *         The player wearing the armor.
     * @param armor
     *         The ItemStack of the armor item itself.
     * @param slot
     *         The armor slot the item is in.
     *
     * @return The number of armor points for display, 2 per shield.
     */
    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot)
    {
        return this.getArmorMaterial().getDamageReductionAmount(slot);
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
        else// slot == 3
        {
            return "Boots";
        }
    }
}
