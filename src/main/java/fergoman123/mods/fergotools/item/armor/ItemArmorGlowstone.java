package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Textures;
import fergoman123.mods.fergotools.util.base.ItemArmorFT;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergoutil.item.Armor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmorGlowstone extends ItemArmorFT {

    public ItemArmorGlowstone(Armor.EnumArmorType type)
    {
        super("glowstone", ToolArmorMaterials.glowstoneArmor, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.glowstoneHelmet || stack.getItem() == ModItems.glowstoneChestplate || stack.getItem() == ModItems.glowstoneBoots)
        {
            return Textures.glowstoneArmorLayer1;
        }

        if(stack.getItem() == ModItems.glowstoneLeggings)
        {
            return Textures.glowstoneArmorLayer2;
        }
        else
        {
            return null;
        }
    }

}
