package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmorRedstone extends ItemArmorFT{

    public ItemArmorRedstone(Armor.EnumArmorType type) {
        super("redstone", ToolArmorMaterials.redstoneArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.redstoneHelmet || stack.getItem() == ModItems.redstoneChestplate || stack.getItem() == ModItems.redstoneBoots)
        {
            return Textures.redstoneArmorLayer1;
        }

        if (stack.getItem() == ModItems.redstoneLeggings)
        {
            return Textures.redstoneArmorLayer2;
        }
        else
        {
            return null;
        }
    }
}
