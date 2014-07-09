package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmorEmerald extends ItemArmorFT {

    public static ItemArmorEmerald instanceHelmet = new ItemArmorEmerald(Armor.EnumArmorType.HELMET);
    public static ItemArmorEmerald instanceChest = new ItemArmorEmerald(Armor.EnumArmorType.CHEST);
    public static ItemArmorEmerald instanceLegs = new ItemArmorEmerald(Armor.EnumArmorType.LEGS);
    public static ItemArmorEmerald instanceBoots = new ItemArmorEmerald(Armor.EnumArmorType.BOOTS);

    public ItemArmorEmerald(Armor.EnumArmorType type)
    {
        super("emerald",  UtilToolArmor.emeraldArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == instanceHelmet || stack.getItem() == instanceChest || stack.getItem() == instanceBoots)
        {
            return Textures.emeraldArmorLayer1;
        }

        if(stack.getItem() == instanceLegs)
        {
            return Textures.emeraldArmorLayer2;
        }
        else
        {
            return null;
        }
    }

}
