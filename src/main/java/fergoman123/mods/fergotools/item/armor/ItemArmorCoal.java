package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmorCoal extends ItemArmorFT {

    public ItemArmorCoal(Armor.EnumArmorType type)
    {
        super("coal", ToolArmorMaterials.coalArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.coalHelmet || stack.getItem() == ModItems.coalChestplate || stack.getItem() == ModItems.coalBoots)
        {
            return Textures.coalArmorLayer1;
        }

        if(stack.getItem() == ModItems.coalLeggings)
        {
            return Textures.coalArmorLayer2;
        }
        else
        {
            return null;
        }
    }

}