package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.tab.CTFT;
import io.github.fergoman123.fergoutil.item.ItemMultiFergo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaffExp extends ItemMultiFT {

    public static final String[] names = new String[]{"staffExp", "staffExp2", "staffExp3"};

    public ItemStaffExp() {
        super(names);
        this.setMaxStackSize(1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer player) {
        if (stack.getItemDamage() == 0) {
            if (player.experienceLevel > 4 && !player.isSneaking()) {
                player.addExperienceLevel(-5);
                player.inventory.addItemStackToInventory(new ItemStack(ModItems.gemExp, 1, 0));
            } else if (player.isSneaking() && player.inventory.hasItemStack(new ItemStack(ModItems.gemExp, 1, 0))) {
                player.addExperienceLevel(5);
                player.inventory.consumeInventoryItem(new ItemStack(ModItems.gemExp, 1, 0).getItem());
            }
        }

        if (stack.getItemDamage() == 1) {
            if (player.experienceLevel > 9 && !player.isSneaking()) {
                player.addExperienceLevel(-10);
                player.inventory.addItemStackToInventory(new ItemStack(ModItems.gemExp, 1, 1));
            } else if (player.isSneaking() && player.inventory.hasItemStack(new ItemStack(ModItems.gemExp, 1, 1))) {
                player.addExperienceLevel(10);
                player.inventory.consumeInventoryItem(new ItemStack(ModItems.gemExp, 1, 1).getItem());
            }
        }

        if (stack.getItemDamage() == 2) {
            if (player.experienceLevel > 29 && !player.isSneaking()) {
                player.addExperienceLevel(-30);
                player.inventory.addItemStackToInventory(new ItemStack(ModItems.gemExp, 1, 2));
            } else if (player.isSneaking() && player.inventory.hasItemStack(new ItemStack(ModItems.gemExp, 1, 2))) {
                player.addExperienceLevel(30);
                player.inventory.consumeInventoryItem(new ItemStack(ModItems.gemExp, 1, 2).getItem());
            }
        }
        return stack;
    }
}
