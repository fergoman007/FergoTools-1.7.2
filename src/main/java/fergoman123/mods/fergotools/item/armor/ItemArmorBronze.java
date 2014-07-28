package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmorBronze extends ItemArmorFT {

    public ItemArmorBronze(Armor.EnumArmorType type)
    {
        super("bronze", ToolArmorMaterials.bronzeArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.bronzeHelmet || stack.getItem() == ModItems.bronzeChestplate || stack.getItem() == ModItems.bronzeBoots)
        {
            return Textures.bronzeArmorLayer1;
        }

        if(stack.getItem() == ModItems.bronzeLeggings)
        {
            return Textures.bronzeArmorLayer2;
        }
        else
        {
            return null;
        }
    }

}
