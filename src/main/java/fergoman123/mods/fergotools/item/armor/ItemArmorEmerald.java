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
public class ItemArmorEmerald extends ItemArmor {

    public ItemArmorEmerald(int type)
    {
        super(UtilToolArmor.emeraldArmor, FergoTools.proxy.addArmor("emerald"), type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.emeraldHelmet || stack.getItem() == ModItems.emeraldChestplate || stack.getItem() == ModItems.emeraldBoots)
        {
            return Textures.ArmorTextures.emeraldArmorRender1;
        }

        if(stack.getItem() == ModItems.emeraldLeggings)
        {
            return Textures.ArmorTextures.emeraldArmorRender2;
        }
        else
        {
            return null;
        }
    }

}
