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
public class ItemArmorBronze extends ItemArmor {

    public ItemArmorBronze(int type)
    {
        super(UtilToolArmor.bronzeArmor, FergoTools.proxy.addArmor("bronze"), type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.bronzeHelmet || stack.getItem() == ModItems.bronzeChestplate || stack.getItem() == ModItems.bronzeBoots)
        {
            return Textures.ArmorTextures.bronzeArmorRender1;
        }

        if(stack.getItem() == ModItems.bronzeLeggings)
        {
            return Textures.ArmorTextures.bronzeArmorRender2;
        }
        else
        {
            return null;
        }
    }

}
