package io.github.fergoman123.fergotools.core.item.sword;

import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.tool.ItemSwordFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Fergoman123.
 */
public final class ItemBronzeSword extends ItemSwordFT
{

    public ItemBronzeSword(ToolMaterial material, int maxUses, String itemName) {
        super(material, maxUses, itemName);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
    }
}
