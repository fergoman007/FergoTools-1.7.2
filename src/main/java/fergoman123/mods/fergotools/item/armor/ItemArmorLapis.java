package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.util.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemArmorLapis extends ItemArmorFT {

    public static ItemArmorLapis instanceHelmet = new ItemArmorLapis(ArmorType.HELMET);
    public static ItemArmorLapis instanceChest = new ItemArmorLapis(ArmorType.CHEST);
    public static ItemArmorLapis instanceLegs = new ItemArmorLapis(ArmorType.LEGS);
    public static ItemArmorLapis instanceBoots = new ItemArmorLapis(ArmorType.BOOTS);

    public ItemArmorLapis(ArmorType type)
    {
        super("lapis", UtilToolArmor.lapisArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.lapisHelmet || stack.getItem() == ModItems.lapisChestplate || stack.getItem() == ModItems.lapisBoots)
        {
            return Textures.ArmorTextures.lapisArmorRender1;
        }

        if(stack.getItem() == ModItems.lapisLeggings)
        {
            return Textures.ArmorTextures.lapisArmorRender2;
        }
        else
        {
            return null;
        }
    }

}