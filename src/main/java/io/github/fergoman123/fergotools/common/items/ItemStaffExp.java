package io.github.fergoman123.fergotools.common.items;

import io.github.fergoman123.fergotools.common.CTFT;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class ItemStaffExp extends Item{

    private static final String[] subTypes = new String[]{"staffExp", "staffExp2", "staffExp3"};

    public ItemStaffExp(String name)
    {
        super();
        this.setCreativeTab(CTFT.instance);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(1);
        this.setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s.%s", NameHelper.getModString(0).toLowerCase(), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s.%s.%s", NameHelper.getModString(0).toLowerCase(), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)), subTypes[MathHelper.clamp_int(stack.getItemDamage(), 0, subTypes.length - 1)]);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (stack.getItemDamage() == 0)
        {
            if (player.experienceLevel > 4 && !player.isSneaking())
            {
                player.addExperienceLevel(-5);
                player.inventory.addItemStackToInventory(new ItemStack(ModItems.gemExp));
            }
            else if (player.isSneaking() && player.inventory.hasItemStack(new ItemStack(ModItems.gemExp)))
            {
                player.addExperienceLevel(5);
                player.inventory.consumeInventoryItem(ModItems.gemExp);
            }
        }

        if (stack.getItemDamage() == 1)
        {
            if (player.experienceLevel > 9 && !player.isSneaking())
            {
                player.addExperienceLevel(-10);
                player.inventory.addItemStackToInventory(new ItemStack(ModItems.gemExp2));
            }
            else if (player.isSneaking() && player.inventory.hasItemStack(new ItemStack(ModItems.gemExp2)))
            {
                player.addExperienceLevel(10);
                player.inventory.consumeInventoryItem(ModItems.gemExp2);
            }
        }

        if (stack.getItemDamage() == 2)
        {
            if (player.experienceLevel > 29 && !player.isSneaking())
            {
                player.addExperienceLevel(-30);
                player.inventory.addItemStackToInventory(new ItemStack(ModItems.gemExp3));
            }
            else if (player.isSneaking() && player.inventory.hasItemStack(new ItemStack(ModItems.gemExp3)))
            {
                player.addExperienceLevel(30);
                player.inventory.consumeInventoryItem(ModItems.gemExp3);
            }
        }
        return stack;
    }

    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, List subItems) {
        for (int i = 0; i < subTypes.length; i++) {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }
}
