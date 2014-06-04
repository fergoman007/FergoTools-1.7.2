package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.util.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemArmorRedstone extends ItemArmorFT
{

    public ItemArmorRedstone(ArmorType type) {
        super("redstone", UtilToolArmor.redstoneArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.redstoneHelmet || stack.getItem() == ModItems.redstoneChestplate || stack.getItem() == ModItems.redstoneBoots)
        {
            return Textures.ArmorTextures.redstoneArmorRender1;
        }

        if (stack.getItem() == ModItems.redstoneLeggings)
        {
            return Textures.ArmorTextures.redstoneArmorRender2;
        }
        else
        {
            return null;
        }
    }
}
