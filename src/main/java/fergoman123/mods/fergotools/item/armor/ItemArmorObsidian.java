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
public class ItemArmorObsidian extends ItemArmor {

    public ItemArmorObsidian(int type)
    {
        super(ToolArmorMaterials.obsidianArmor, FergoTools.proxy.addArmor("obsidian"), type);
    }

    public String getArmorTexture(ItemStack is, Entity entity, int slot, String type)
    {
        if(is.getItem() == ModItems.obsidianHelmet || is.getItem() == ModItems.obsidianChestplate || is.getItem() == ModItems.obsidianBoots)
        {
            return ArmorStrings.obsidianArmorRender[0];
        }

        if(is.getItem() == ModItems.obsidianLeggings)
        {
            return ArmorStrings.obsidianArmorRender[1];
        }
        else
        {
            return null;
        }
    }

}
