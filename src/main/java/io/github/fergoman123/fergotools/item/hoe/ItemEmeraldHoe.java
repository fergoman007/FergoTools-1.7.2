package io.github.fergoman123.fergotools.item.hoe;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemHoeFT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemEmeraldHoe extends ItemHoeFT {

    public ItemEmeraldHoe() {
        super(Materials.Tools.emerald, Materials.Tools.emerald.getMaxUses());
        this.setUnlocalizedName(Names.Items.emeraldHoe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.gemEmerald)) || super.getIsRepairable(itemstack1, itemstack2);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(Names.Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
    }
}
