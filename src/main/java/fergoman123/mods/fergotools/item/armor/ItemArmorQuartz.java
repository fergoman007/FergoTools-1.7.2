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
public class ItemArmorQuartz extends ItemArmor{

    public ItemArmorQuartz(int type)
    {
        super(ToolArmorMaterials.quartzArmor, FergoTools.proxy.addArmor("quartz"), type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.quartzHelmet || stack.getItem() == ModItems.quartzChestplate || stack.getItem() == ModItems.quartzBoots)
        {
            return ArmorStrings.quartzArmorRender[0];
        }

        if (stack.getItem() == ModItems.quartzLeggings)
        {
            return ArmorStrings.quartzArmorRender[1];
        }
        else
        {
            return null;
        }
    }
}
