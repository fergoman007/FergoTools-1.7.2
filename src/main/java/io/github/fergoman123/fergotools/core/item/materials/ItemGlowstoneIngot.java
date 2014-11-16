package io.github.fergoman123.fergotools.core.item.materials;

import io.github.fergoman123.fergotools.reference.names.OreDict;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Fergoman123.
 */
public final class ItemGlowstoneIngot extends ItemFT
{

    public ItemGlowstoneIngot(String itemName) {
        super(itemName);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        String[] oreDictNames = {OreDict.oreDictName, OreDict.ingotGlowstone};
        for (String oreDict : oreDictNames)
        {
            list.add(NameHelper.translateToLocal(oreDict));
        }
    }
}
