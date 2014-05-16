package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemArmorQuartz extends ItemArmor{

    public ItemArmorQuartz(int type)
    {
        super(UtilToolArmor.quartzArmor, FergoTools.proxy.addArmor("quartz"), type);
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return par2ItemStack.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModItems.quartzHelmet || stack.getItem() == ModItems.quartzChestplate || stack.getItem() == ModItems.quartzBoots)
        {
            return Textures.ArmorTextures.quartzArmorRender1;
        }

        if (stack.getItem() == ModItems.quartzLeggings)
        {
            return Textures.ArmorTextures.quartzArmorRender2;
        }
        else
        {
            return null;
        }
    }
}
