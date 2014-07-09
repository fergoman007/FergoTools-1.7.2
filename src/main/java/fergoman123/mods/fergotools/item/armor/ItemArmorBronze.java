package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmorBronze extends ItemArmorFT {

    public static ItemArmorBronze instanceHelmet = new ItemArmorBronze(Armor.EnumArmorType.HELMET);
    public static ItemArmorBronze instanceChest = new ItemArmorBronze(Armor.EnumArmorType.CHEST);
    public static ItemArmorBronze instanceLegs = new ItemArmorBronze(Armor.EnumArmorType.LEGS);
    public static ItemArmorBronze instanceBoots = new ItemArmorBronze(Armor.EnumArmorType.BOOTS);

    public ItemArmorBronze(Armor.EnumArmorType type)
    {
        super("bronze", UtilToolArmor.bronzeArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemArmorBronze.instanceHelmet || stack.getItem() == ItemArmorBronze.instanceChest || stack.getItem() == ItemArmorBronze.instanceBoots)
        {
            return Textures.bronzeArmorLayer1;
        }

        if(stack.getItem() == ItemArmorBronze.instanceLegs)
        {
            return Textures.bronzeArmorLayer2;
        }
        else
        {
            return null;
        }
    }

}
