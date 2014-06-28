package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Textures.ArmorTextures;
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
        if(stack.getItem() == ModItems.bronzeHelmet || stack.getItem() == ModItems.bronzeChestplate || stack.getItem() == ModItems.bronzeBoots)
        {
            return ArmorTextures.bronzeArmorRender1;
        }

        if(stack.getItem() == ModItems.bronzeLeggings)
        {
            return ArmorTextures.bronzeArmorRender2;
        }
        else
        {
            return null;
        }
    }

}
