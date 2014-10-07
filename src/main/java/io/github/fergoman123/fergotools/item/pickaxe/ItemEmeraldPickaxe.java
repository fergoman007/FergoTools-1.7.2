package io.github.fergoman123.fergotools.item.pickaxe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.item.ItemStack;

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
}
