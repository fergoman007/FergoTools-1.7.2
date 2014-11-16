package io.github.fergoman123.fergotools.core.item.shovel;

import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.tool.ItemShovelFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Fergoman123.
 */
public final class ItemLapisShovel extends ItemShovelFT
{

    public ItemLapisShovel(ToolMaterial material, int maxUses, String itemName) {
        super(material, maxUses, itemName);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
    }
}
