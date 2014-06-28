package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Textures.ArmorTextures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmorCoal extends ItemArmorFT {

    public static ItemArmorCoal instanceHelmet = new ItemArmorCoal(Armor.EnumArmorType.HELMET);
    public static ItemArmorCoal instanceChest = new ItemArmorCoal(Armor.EnumArmorType.CHEST);
    public static ItemArmorCoal instanceLegs = new ItemArmorCoal(Armor.EnumArmorType.LEGS);
    public static ItemArmorCoal instanceBoots = new ItemArmorCoal(Armor.EnumArmorType.BOOTS);

    public ItemArmorCoal(Armor.EnumArmorType type)
    {
        super("coal", UtilToolArmor.coalArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.coalHelmet || stack.getItem() == ModItems.coalChestplate || stack.getItem() == ModItems.coalBoots)
        {
            return ArmorTextures.coalArmorRender1;
        }

        if(stack.getItem() == ModItems.coalLeggings)
        {
            return ArmorTextures.coalArmorRender2;
        }
        else
        {
            return null;
        }
    }

}