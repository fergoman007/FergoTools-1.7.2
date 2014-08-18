package fergoman123.mods.fergotools.util.base;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergotools.creativetab.CreativeTabsFergoTools;
import fergoman123.mods.fergoutil.helper.NameHelper;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public abstract class ItemArmorFT extends ItemArmor implements Armor.IArmor{

    public ArmorNames armorNames;
    public Keyboard kb;

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

    public ItemArmorFT(String armorName, ArmorMaterial material, Armor.EnumArmorType type)
    {
        super(material, 1, type.ordinal());
        this.setCreativeTab(CreativeTabsFergoTools.tabFergoArmor);
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

    public abstract void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo);
}
