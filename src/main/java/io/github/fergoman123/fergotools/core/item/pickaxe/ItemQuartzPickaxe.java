package io.github.fergoman123.fergotools.core.item.pickaxe;

import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Fergoman123.
 */
public final class ItemQuartzPickaxe extends ItemPickaxeFT
{

    public ItemQuartzPickaxe(ToolMaterial material, int maxUses, String itemName) {
        super(material, maxUses, itemName);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advancedTooltip) {
        list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
    }
}
