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
public class ItemArmorLapis extends ItemArmor {

    public ItemArmorLapis(int type)
    {
        super(UtilToolArmor.lapisArmor, FergoTools.proxy.addArmor("lapis"), type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.lapisHelmet || stack.getItem() == ModItems.lapisChestplate || stack.getItem() == ModItems.lapisBoots)
        {
            return Textures.ArmorTextures.lapisArmorRender1;
        }

        if(stack.getItem() == ModItems.lapisLeggings)
        {
            return Textures.ArmorTextures.lapisArmorRender2;
        }
        else
        {
            return null;
        }
    }

}