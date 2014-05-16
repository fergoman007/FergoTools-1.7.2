package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemArmorObsidian extends ItemArmor {

    public ItemArmorObsidian(int type)
    {
        super(UtilToolArmor.obsidianArmor, FergoTools.proxy.addArmor("obsidian"), type);
    }

    public String getArmorTexture(ItemStack is, Entity entity, int slot, String type)
    {
        if(is.getItem() == ModItems.obsidianHelmet || is.getItem() == ModItems.obsidianChestplate || is.getItem() == ModItems.obsidianBoots)
        {
            return Textures.ArmorTextures.obsidianArmorRender1;
        }

        if(is.getItem() == ModItems.obsidianLeggings)
        {
            return Textures.ArmorTextures.obsidianArmorRender2;
        }
        else
        {
            return null;
        }
    }

}
