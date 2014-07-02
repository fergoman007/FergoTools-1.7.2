package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmorRedstone extends ItemArmorFT{

    public static ItemArmorRedstone instanceHelmet = new ItemArmorRedstone(Armor.EnumArmorType.HELMET);
    public static ItemArmorRedstone instanceChest = new ItemArmorRedstone(Armor.EnumArmorType.CHEST);
    public static ItemArmorRedstone instanceLegs = new ItemArmorRedstone(Armor.EnumArmorType.LEGS);
    public static ItemArmorRedstone instanceBoots = new ItemArmorRedstone(Armor.EnumArmorType.BOOTS);

    public ItemArmorRedstone(Armor.EnumArmorType type) {
        super("redstone", UtilToolArmor.redstoneArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == instanceHelmet || stack.getItem() == instanceChest || stack.getItem() == instanceBoots)
        {
            return Textures.ArmorTextures.redstoneArmorRender1;
        }

        if (stack.getItem() == instanceLegs)
        {
            return Textures.ArmorTextures.redstoneArmorRender2;
        }
        else
        {
            return null;
        }
    }
}
