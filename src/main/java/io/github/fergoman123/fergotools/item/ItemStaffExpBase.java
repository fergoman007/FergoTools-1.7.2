package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.ItemNames;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaffExpBase extends ItemFT {
    private int type;
    private int maxExp;

    public static final ItemStaffExpBase type1 = new ItemStaffExpBase(0, 50);
    public static final ItemStaffExpBase type2 = new ItemStaffExpBase(0, 150);
    public static final ItemStaffExpBase type3 = new ItemStaffExpBase(0, 300);

    public ItemStaffExpBase(int type, int maxExp) {
        super(ItemNames.staffExpVariants[type], 1);
        this.type = type;
        this.maxExp = maxExp;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
        if (!playerIn.isSneaking()) {
            if (type == 0 && playerIn.experienceLevel > 5) {
                playerIn.addExperienceLevel(-5);
                playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.gemExp));
            } else if (type == 1 && playerIn.experienceLevel > 10){
                playerIn.addExperienceLevel(-10);
                playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.gemExp2));
            } else if (type == 2 && playerIn.experienceLevel > 30){
                playerIn.addExperienceLevel(-30);
                playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.gemExp3));
            }
        } else{
            if (type == 0 && playerIn.inventory.hasItem(ModItems.gemExp)){
                playerIn.addExperienceLevel(5);
                playerIn.inventory.consumeInventoryItem(ModItems.gemExp);
            } else if (type == 1 && playerIn.inventory.hasItem(ModItems.gemExp2)){
                playerIn.addExperienceLevel(10);
                playerIn.inventory.consumeInventoryItem(ModItems.gemExp2);
            } else if (type == 2 && playerIn.inventory.hasItem(ModItems.gemExp3)){
                playerIn.addExperienceLevel(30);
                playerIn.inventory.consumeInventoryItem(ModItems.gemExp3);
            }
        }
        return itemStackIn;
    }

    public int getType() {
        return type;
    }

    public int getMaxExp() {
        return maxExp;
    }
}
