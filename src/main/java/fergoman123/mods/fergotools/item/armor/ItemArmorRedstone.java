package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.strings.ArmorStrings;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemArmorRedstone extends ItemArmor{

    public ItemArmorRedstone(int type)
    {
        super(ToolArmorMaterials.redstoneArmor, FergoTools.proxy.addArmor("redstone"), type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.redstoneHelmet || stack.getItem() == ModItems.redstoneChestplate || stack.getItem() == ModItems.redstoneBoots)
        {
            return ArmorStrings.redstoneArmorRender[0];
        }

        if (stack.getItem() == ModItems.redstoneLeggings)
        {
            return ArmorStrings.redstoneArmorRender[1];
        }
        else
        {
            return null;
        }
    }
}
