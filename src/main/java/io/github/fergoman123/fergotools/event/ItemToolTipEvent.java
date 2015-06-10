package io.github.fergoman123.fergotools.event;

import io.github.fergoman123.fergotools.api.base.*;
import io.github.fergoman123.fergotools.helper.StaffExpHelper;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

public class ItemToolTipEvent {
    public static final ItemToolTipEvent instance = new ItemToolTipEvent();

    @SubscribeEvent
    public void onItemTooltip(ItemTooltipEvent evt) {
        ItemStack stack = evt.itemStack;
        Item item = stack.getItem();
        Block block = Block.getBlockFromItem(item);
        List<String> list = evt.toolTip;

        if (item instanceof ItemStaffExpBase) {
            ItemStaffExpBase staffExpBase = (ItemStaffExpBase) item;
            if (staffExpBase == ModItems.staffExp) {
                list.add(StatCollector.translateToLocal("fergotools.tooltip.staffexp.rc"));
                list.add(StatCollector.translateToLocal("fergotools.tooltip.staffexp.src"));
                list.add("");
                list.add(StatCollector.translateToLocal("fergotools.staffexp.storedexp"));
                list.add(staffExpBase.getStoredExp(stack) + "/" + StaffExpHelper.getMaxExp(staffExpBase.getType()));
            }

            if (staffExpBase == ModItems.staffExp) {
                list.add(StatCollector.translateToLocal("fergotools.tooltip.staffexp2.rc"));
                list.add(StatCollector.translateToLocal("fergotools.tooltip.staffexp2.src"));
                list.add("");
                list.add(StatCollector.translateToLocal("fergotools.staffexp.storedexp"));
                list.add(staffExpBase.getStoredExp(stack) + "/" + StaffExpHelper.getMaxExp(staffExpBase.getType()));
            }

            if (staffExpBase == ModItems.staffExp) {
                list.add(StatCollector.translateToLocal("fergotools.tooltip.staffexp3.rc"));
                list.add(StatCollector.translateToLocal("fergotools.tooltip.staffexp3.src"));
                list.add("");
                list.add(StatCollector.translateToLocal("fergotools.staffexp.storedexp"));
                list.add(staffExpBase.getStoredExp(stack) + "/" + StaffExpHelper.getMaxExp(staffExpBase.getType()));
            }
        }

        if (block == ModBlocks.oreExperience) {
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredict"));
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredictname.oreexperience"));
        }

        if (block == ModBlocks.oreObsidian) {
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredict"));
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredictname.oreobsidian"));
        }

        if (block == ModBlocks.oreGemEmerald) {
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredict"));
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredictname.oregememerald"));
        }

        if (block == ModBlocks.oreGemLapis)
        {
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredict"));
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredictname.oregemlapis"));
        }

        if (block == ModBlocks.oreBronze)
        {
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredict"));
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredictname.orebronze"));
        }

        if (block == ModBlocks.oreAdamantium)
        {
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredict"));
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredictname.oreadamantium"));
        }

        if (block == ModBlocks.oreGemRedstone)
        {
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredict"));
            list.add(StatCollector.translateToLocal("fergotools.tooltip.oredictname.oregemredstone"));
        }
    }
}
