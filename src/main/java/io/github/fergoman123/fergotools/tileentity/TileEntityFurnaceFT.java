package io.github.fergoman123.fergotools.tileentity;

import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergoutil.tileentity.TileEntityFurnaceFergo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class TileEntityFurnaceFT extends TileEntityFurnaceFergo {
	
	public static int getBurnTime(ItemStack stack){
		if(stack == null){
			return 0;
		} else {
			Item item = stack.getItem();
			
			if(item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air){
				Block block = Block.getBlockFromItem(item);
				
				if(block == Blocks.wooden_slab){
					return 150;
				}
				
				if(block.getMaterial() == Material.wood){
					return 300;
				}
				
				if(block == Blocks.coal_block){
					return 16000;
				}
			}
			
			if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe)item).getMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(stack);
		}
	}
	
	public static int getMaceratorBurnTime(ItemStack stack){
		if(stack == null){
			return 0;
		} else {
			
			if(stack.getItem() == Items.redstone)return 150;
			if(stack.getItem() == Item.getItemFromBlock(Blocks.redstone_block));
			if(stack == new ItemStack(ModBlocks.storageFT, 1, 10))return 9*1350;
			return GameRegistry.getFuelValue(stack);
		}
	}
	
	public static boolean isItemFuel(ItemStack stack){
		return getBurnTime(stack) > 0;
	}
	
	public static boolean isItemMaceratorFuel(ItemStack stack){
		return getMaceratorBurnTime(stack) > 0;
	}
	
	public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction)
    {
        if (direction == EnumFacing.DOWN && index == 1)
        {
            Item item = stack.getItem();

            if (item != Items.water_bucket && item != Items.bucket)
            {
                return false;
            }
        }

        return true;
    }
	
	@Override
	public boolean canInsertItem(int index, ItemStack stack, EnumFacing direction) {
		return this.isItemValidForSlot(index, stack);
	}
}
