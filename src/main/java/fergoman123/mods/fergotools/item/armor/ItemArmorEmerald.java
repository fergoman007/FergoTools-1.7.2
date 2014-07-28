package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmorEmerald extends ItemArmorFT {

    public ItemArmorEmerald(Armor.EnumArmorType type)
    {
        super("emerald",  ToolArmorMaterials.emeraldArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.emeraldHelmet || stack.getItem() == ModItems.emeraldChestplate || stack.getItem() == ModItems.emeraldBoots)
        {
            return Textures.emeraldArmorLayer1;
        }

        if(stack.getItem() == ModItems.emeraldLeggings)
        {
            return Textures.emeraldArmorLayer2;
        }
        else
        {
            return null;
        }
    }

}
