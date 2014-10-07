package io.github.fergoman123.fergotools.item.axe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemAxeFT;
import net.minecraft.item.ItemStack;

public class ItemGlowstoneAxe extends ItemAxeFT {

    public ItemGlowstoneAxe() {
        super(Materials.Tools.glowstone, Materials.Tools.glowstone.getMaxUses());
        this.setUnlocalizedName(Names.Items.glowstoneAxe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.ingotGlowstone)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
