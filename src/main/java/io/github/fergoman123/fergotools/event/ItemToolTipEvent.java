package io.github.fergoman123.fergotools.event;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.item.ItemArmorFT;
import io.github.fergoman123.fergotools.item.ItemFT;
import io.github.fergoman123.fergotools.item.tool.*;
import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

public class ItemToolTipEvent {

    @SubscribeEvent
    public void onItemTooltip(ItemTooltipEvent evt) {
        ItemStack stack = evt.itemStack;
        Item item = stack.getItem();
        Block block = Block.getBlockFromItem(item);
        List<String> list = evt.toolTip;

        if (item instanceof ItemPickaxeFT) {
            ItemPickaxeFT pickaxe = (ItemPickaxeFT) item;
            list.add("Material: " + pickaxe.getToolMaterial().name());
            list.add("Harvest Level: " + pickaxe.getToolMaterial().getHarvestLevel());
            list.add("Max Uses: " + pickaxe.getToolMaterial().getMaxUses());
            list.add("Efficiency: " + pickaxe.getToolMaterial().getEfficiencyOnProperMaterial());
            list.add("Damage Vs Entity: " + pickaxe.getToolMaterial().getDamageVsEntity());
            list.add("Enchantability: " + pickaxe.getToolMaterial().getEnchantability());
            list.add("-------------------------------");
            list.add("Durability: " + (stack.getMaxDamage() - stack.getItemDamage()) + " / " + stack.getMaxDamage());
        }

        if (item instanceof ItemShovelFT){
            ItemShovelFT shovel = (ItemShovelFT)item;
            list.add("Material: " + shovel.getToolMaterial().name());
            list.add("Harvest Level: " + shovel.getToolMaterial().getHarvestLevel());
            list.add("Max Uses: " + shovel.getToolMaterial().getMaxUses());
            list.add("Efficiency: " + shovel.getToolMaterial().getEfficiencyOnProperMaterial());
            list.add("Damage Vs Entity: " + shovel.getToolMaterial().getDamageVsEntity());
            list.add("Enchantability: " + shovel.getToolMaterial().getEnchantability());
            list.add("-------------------------------");
            list.add("Durability: " + (stack.getMaxDamage() - stack.getItemDamage()) + " / " + stack.getMaxDamage());
        }

        if (item instanceof ItemAxeFT){
            ItemAxeFT axe = (ItemAxeFT)item;
            list.add("Material: " + axe.getToolMaterial().name());
            list.add("Harvest Level: " + axe.getToolMaterial().getHarvestLevel());
            list.add("Max Uses: " + axe.getToolMaterial().getMaxUses());
            list.add("Efficiency: " + axe.getToolMaterial().getEfficiencyOnProperMaterial());
            list.add("Damage Vs Entity: " + axe.getToolMaterial().getDamageVsEntity());
            list.add("Enchantability: " + axe.getToolMaterial().getEnchantability());
            list.add("-------------------------------");
            list.add("Durability: " + (stack.getMaxDamage() - stack.getItemDamage()) + " / " + stack.getMaxDamage());
        }

        if (item instanceof ItemHoeFT){
            ItemHoeFT hoe = (ItemHoeFT)item;
            list.add("Material: " + hoe.getToolMaterial().name());
            list.add("Max Uses: " + hoe.getToolMaterial().getMaxUses());
            list.add("Enchantability: " + hoe.getToolMaterial().getEnchantability());
            list.add("-------------------------------");
            list.add("Durability: " + (stack.getMaxDamage() - stack.getItemDamage()) + " / " + stack.getMaxDamage());
        }

        if (item instanceof ItemSwordFT){
            ItemSwordFT sword = (ItemSwordFT)item;
            list.add("Material: " + sword.getToolMaterial().name());
            list.add("Max Uses: " + sword.getToolMaterial().getMaxUses());
            list.add("Damage Vs Entity: " + sword.getToolMaterial().getDamageVsEntity());
            list.add("Enchantability: " + sword.getToolMaterial().getEnchantability());
            list.add("-------------------------------");
            list.add("Durability: " + (stack.getMaxDamage() - stack.getItemDamage()) + " / " + stack.getMaxDamage());
        }

        if (item instanceof ItemArmorFT){
            ItemArmorFT armor = (ItemArmorFT)item;
            ArmorType armorType = armor.getArmorType();
            list.add("Material: " + armor.getArmorMaterial().getName());
            switch (armorType){
                case helmet:{
                    list.add("Max Damage Factor: " + armor.getArmorMaterial().getDurability(0));
                    list.add("Reduction Amount: " + armor.getArmorMaterial().getDamageReductionAmount(0));
                }
                case chestplate: {
                    list.add("Max Damage Factor: " + armor.getArmorMaterial().getDurability(1));
                    list.add("Reduction Amount: " + armor.getArmorMaterial().getDamageReductionAmount(1));
                }
                case leggings:{
                    list.add("Max Damage Factor: " + armor.getArmorMaterial().getDurability(2));
                    list.add("Reduction Amount: " + armor.getArmorMaterial().getDamageReductionAmount(2));
                }
                case boots:{
                    list.add("Max Damage Factor: " + armor.getArmorMaterial().getDurability(3));
                    list.add("Reduction Amount: " + armor.getArmorMaterial().getDamageReductionAmount(3));
                }
            }
            list.add("Enchantability: " + armor.getArmorMaterial().getEnchantability());

        }

        if (item == ModItems.ingotObsidian) {
            list.add("Ore Dictionary Name:");
            list.add(ItemNames.ingotObsidian);
        }

        if (item == ModItems.gemEmerald) {
            list.add("Ore Dictionary Name:");
            list.add(ItemNames.gemEmerald);
        }

        if (item == ModItems.gemLapis) {
            list.add("Ore Dictionary Name:");
            list.add(ItemNames.gemLapis);
        }

        if (item == ModItems.ingotBronze) {
            list.add("Ore Dictionary Name:");
            list.add(ItemNames.ingotBronze);
        }

        if (item == ModItems.ingotCoal) {
            list.add("Ore Dictionary Name: ");
            list.add(ItemNames.ingotCoal);
        }

        if (item == ModItems.ingotGlowstone) {
            list.add("Ore Dictionary Name: ");
            list.add(ItemNames.ingotGlowstone);
        }

        if (item == ModItems.ingotAdamantium) {
            list.add("Ore Dictionary Name: ");
            list.add(ItemNames.ingotAdamantium);
        }

        if (item == ModItems.gemSilk) {
            list.add("Ore Dictionary Name: ");
            list.add(ItemNames.gemSilk);
        }

        if (item == ModItems.gemRedstone) {
            list.add("Ore Dictionary Name: ");
            list.add(ItemNames.gemRedstone);
        }

        if (item == ModItems.shardExp){
            list.add(NameHelper.translate("fergotools:tooltip.shardexp"));
        }

        if(item == ModItems.expCollector){
            list.add("fergotools:tooltip.crafting");
        }

        if(item == ModItems.gemExp) {

            if (stack.getItemDamage() == 0) {
                list.add(NameHelper.translate("fergotools:tooltip.gemexp"));
            }

            if (stack.getItemDamage() == 1) {
                list.add(NameHelper.translate("fergotools:tooltip.gemexp2"));
            }

            if (stack.getItemDamage() == 2) {
                list.add(NameHelper.translate("fergotools:tooltip.gemexp3"));
            }
        }

        if (item == ModItems.staffExp){
            if (stack.getItemDamage() == 0){
                list.add(NameHelper.translate("fergotools:tooltip.staffexp.rc"));
                list.add(NameHelper.translate("fergotools:tooltip.staffexp.src"));
            }

            if (stack.getItemDamage() == 1){
                list.add(NameHelper.translate("fergotools:tooltip.staffexp2.rc"));
                list.add(NameHelper.translate("fergotools:tooltip.staffexp2.src"));
            }

            if (stack.getItemDamage() == 2){
                list.add(NameHelper.translate("fergotools:tooltip.staffexp3.rc"));
                list.add(NameHelper.translate("fergotools:tooltip.staffexp3.src"));
            }
        }


        if (stack.hasTagCompound()) {
            list.add("NBT Tags:");
            for (String tag : stack.getTagCompound().getKeySet()) {
                list.add(tag);
            }
        }
    }
}
