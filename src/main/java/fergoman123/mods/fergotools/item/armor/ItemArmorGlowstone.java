package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmorGlowstone extends ItemArmorFT {

    public static ItemArmorGlowstone instanceHelmet = new ItemArmorGlowstone(Armor.EnumArmorType.HELMET);
    public static ItemArmorGlowstone instanceChest = new ItemArmorGlowstone(Armor.EnumArmorType.CHEST);
    public static ItemArmorGlowstone instanceLegs = new ItemArmorGlowstone(Armor.EnumArmorType.LEGS);
    public static ItemArmorGlowstone instanceBoots = new ItemArmorGlowstone(Armor.EnumArmorType.BOOTS);

    public ItemArmorGlowstone(Armor.EnumArmorType type)
    {
        super("glowstone", UtilToolArmor.glowstoneArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemArmorGlowstone.instanceHelmet || stack.getItem() == ItemArmorGlowstone.instanceChest || stack.getItem() == ItemArmorGlowstone.instanceBoots)
        {
            return Textures.glowstoneArmorLayer1;
        }

        if(stack.getItem() == ItemArmorGlowstone.instanceLegs)
        {
            return Textures.glowstoneArmorLayer2;
        }
        else
        {
            return null;
        }
    }

}
