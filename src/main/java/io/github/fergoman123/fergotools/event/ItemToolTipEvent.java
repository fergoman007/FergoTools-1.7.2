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

        if (item instanceof ItemPickaxeFT) {
            ItemPickaxeFT pickaxeFT = (ItemPickaxeFT) item;
            list.add(StatCollector.translateToLocal("fergotools.tooltip.tm") + " " + pickaxeFT.getToolMaterialName());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.hl") + " " + pickaxeFT.getToolMaterial().getHarvestLevel());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.md") + " " + pickaxeFT.getToolMaterial().getMaxUses());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.eff") + " " + pickaxeFT.getToolMaterial().getEfficiencyOnProperMaterial());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.dam") + " " + pickaxeFT.getToolMaterial().getDamageVsEntity());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.ench") + " " + pickaxeFT.getToolMaterial().getEnchantability());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.ul") + " " + (stack.getMaxDamage() - stack.getItemDamage()));
        }

        if (item instanceof ItemShovelFT) {
            ItemShovelFT shovelFT = (ItemShovelFT) item;
            list.add(StatCollector.translateToLocal("fergotools.tooltip.tm") + " " + shovelFT.getToolMaterialName());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.hl") + " " + shovelFT.getToolMaterial().getHarvestLevel());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.md") + " " + shovelFT.getToolMaterial().getMaxUses());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.eff") + " " + shovelFT.getToolMaterial().getEfficiencyOnProperMaterial());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.dam") + " " + shovelFT.getToolMaterial().getDamageVsEntity());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.ench") + " " + shovelFT.getToolMaterial().getEnchantability());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.ul") + " " + (stack.getMaxDamage() - stack.getItemDamage()));
        }

        if (item instanceof ItemAxeFT)
        {
            ItemAxeFT axeFT = (ItemAxeFT)item;
            list.add(StatCollector.translateToLocal("fergotools.tooltip.tm") + " " + axeFT.getToolMaterialName());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.hl") + " " + axeFT.getToolMaterial().getHarvestLevel());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.md") + " " + axeFT.getToolMaterial().getMaxUses());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.eff") + " " + axeFT.getToolMaterial().getEfficiencyOnProperMaterial());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.dam") + " " + axeFT.getToolMaterial().getDamageVsEntity());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.ench") + " " + axeFT.getToolMaterial().getEnchantability());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.ul") + " " + (stack.getMaxDamage() - stack.getItemDamage()));
        }

        if (item instanceof ItemHoeFT)
        {
            ItemHoeFT hoeFT = (ItemHoeFT)item;
            list.add(StatCollector.translateToLocal("fergotools.tooltip.tm") + " " + hoeFT.getMaterialName());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.hl") + " " + hoeFT.getMaterial().getHarvestLevel());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.md") + " " + hoeFT.getMaterial().getMaxUses());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.eff") + " " + hoeFT.getMaterial().getEfficiencyOnProperMaterial());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.dam") + " " + hoeFT.getMaterial().getDamageVsEntity());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.ench") + " " + hoeFT.getMaterial().getEnchantability());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.ul") + " " + (stack.getMaxDamage() - stack.getItemDamage()));
        }

        if (item instanceof ItemSwordFT)
        {
            ItemSwordFT swordFT = (ItemSwordFT)item;
            list.add(StatCollector.translateToLocal("fergotools.tooltip.tm") + " " + swordFT.getToolMaterialName());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.hl") + " " + swordFT.getMaterial().getHarvestLevel());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.md") + " " + swordFT.getMaterial().getMaxUses());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.eff") + " " + swordFT.getMaterial().getEfficiencyOnProperMaterial());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.dam") + " " + swordFT.getMaterial().getDamageVsEntity());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.ench") + " " + swordFT.getMaterial().getEnchantability());
            list.add(StatCollector.translateToLocal("fergotools.tooltip.ul") + " " + (stack.getMaxDamage() - stack.getItemDamage()));
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
