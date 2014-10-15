package io.github.fergoman123.fergotools.item.pickaxe;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemEmeraldPickaxe extends ItemPickaxeFT
{

    public ItemEmeraldPickaxe()
    {
        super(Materials.Tools.emerald, Materials.Tools.emerald.getMaxUses());
        this.setUnlocalizedName(Names.Items.emeraldPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.gemEmerald)) || super.getIsRepairable(stack1, stack2);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(Names.Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
    }
}
