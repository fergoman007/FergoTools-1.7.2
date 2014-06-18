package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Textures.ArmorTextures;
import fergoman123.mods.fergotools.util.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemArmorBronze extends ItemArmorFT {

    public static ItemArmorBronze instanceHelmet = new ItemArmorBronze(ArmorType.HELMET);
    public static ItemArmorBronze instanceChest = new ItemArmorBronze(ArmorType.CHEST);
    public static ItemArmorBronze instanceLegs = new ItemArmorBronze(ArmorType.LEGS);
    public static ItemArmorBronze instanceBoots = new ItemArmorBronze(ArmorType.BOOTS);

    public ItemArmorBronze(ArmorType type)
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
