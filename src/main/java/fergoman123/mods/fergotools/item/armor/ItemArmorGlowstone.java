package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.strings.ArmorStrings;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemArmorGlowstone extends ItemArmor {

    public ItemArmorGlowstone(int type)
    {
        super(ToolArmorMaterials.glowstoneArmor, FergoTools.proxy.addArmor("glowstone"), type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.glowstoneHelmet || stack.getItem() == ModItems.glowstoneChestplate || stack.getItem() == ModItems.glowstoneBoots)
        {
            return ArmorStrings.glowstoneArmorRender[0];
        }

        if(stack.getItem() == ModItems.glowstoneLeggings)
        {
            return ArmorStrings.glowstoneArmorRender[1];
        }
        else
        {
            return null;
        }
    }

}
