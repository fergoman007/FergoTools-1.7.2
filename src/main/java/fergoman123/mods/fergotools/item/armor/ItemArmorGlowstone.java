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
public class ItemArmorGlowstone extends ItemArmor {

    public ItemArmorGlowstone(int type)
    {
        super(UtilToolArmor.glowstoneArmor, FergoTools.proxy.addArmor("glowstone"), type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.glowstoneHelmet || stack.getItem() == ModItems.glowstoneChestplate || stack.getItem() == ModItems.glowstoneBoots)
        {
            return Textures.ArmorTextures.glowstoneArmorRender1;
        }

        if(stack.getItem() == ModItems.glowstoneLeggings)
        {
            return Textures.ArmorTextures.glowstoneArmorRender2;
        }
        else
        {
            return null;
        }
    }

}
