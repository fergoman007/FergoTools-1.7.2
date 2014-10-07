package io.github.fergoman123.fergotools.item.pickaxe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSilkPickaxe extends ItemPickaxeFT {

    public ItemSilkPickaxe()
    {
        super(Materials.Tools.silk, Materials.Tools.silk.getMaxUses());
        this.setUnlocalizedName(Names.Items.silkPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.gemSilk)) || super.getIsRepairable(stack1, stack2);
    }

    public void onCreated(ItemStack stack, World world, EntityPlayer player)
    {
        stack.addEnchantment(Enchantment.silkTouch, 1);
    }

}
