package io.github.fergoman123.fergotools.event;

import java.util.List;

import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.item.*;
import io.github.fergoman123.fergotools.reference.BlockNames;
import io.github.fergoman123.fergotools.reference.ItemNames;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemToolTipEvent {
    public static final ItemToolTipEvent instance = new ItemToolTipEvent();

    @SubscribeEvent
    public void onItemTooltip(ItemTooltipEvent evt) {
        ItemStack stack = evt.itemStack;
        Item item = stack.getItem();
        Block block = Block.getBlockFromItem(item);//TODO: Blocks
        List<String> list = evt.toolTip;

        if (item == ModItems.ingotObsidian){
            list.add(NameHelper.translate("ft.tooltip.odn"));
            list.add(ItemNames.ingotObsidian);
        }

        if (item == ModItems.gemEmerald){
            list.add(NameHelper.translate("ft.tooltip.odn"));
            list.add(ItemNames.gemEmerald);
        }

        if (item == ModItems.gemLapis){
            list.add(NameHelper.translate("ft.tooltip.odn"));
            list.add(ItemNames.gemLapis);
        }

        if (item == ModItems.ingotBronze){
            list.add(NameHelper.translate("ft.tooltip.odn"));
            list.add(ItemNames.ingotBronze);
        }
        if (item == ModItems.ingotCoal){
            list.add(NameHelper.translate("ft.tooltip.odn"));
            list.add(ItemNames.ingotCoal);
        }

        if (item == ModItems.ingotGlowstone){
            list.add(NameHelper.translate("ft.tooltip.odn"));
            list.add(ItemNames.ingotGlowstone);
        }

        if (item == ModItems.ingotAdamantium){
            list.add(NameHelper.translate("ft.tooltip.odn"));
            list.add(ItemNames.ingotAdamantium);
        }

        if (item == ModItems.gemSilk){
            list.add(NameHelper.translate("ft.tooltip.odn"));
            list.add(ItemNames.gemSilk);
        }

        if (item == ModItems.gemRedstone){
            list.add(NameHelper.translate("ft.tooltip.odn"));
            list.add(ItemNames.gemRedstone);
        }

        if (item == ModItems.shardExp){
            list.add(NameHelper.translate("ft.tooltip.shardExp.rcl"));
        }

        if (item == ModItems.expCollector){
            list.add(NameHelper.translate("ft.tooltip.ctitem"));
        }
        
        if(block == ModBlocks.oreExperience){
        	list.add(NameHelper.translate("ft.tooltip.odn"));
        	list.add(BlockNames.oreExperience);
        }

        if (item instanceof ItemPickaxeFT){
            ItemPickaxeFT pickaxe = (ItemPickaxeFT)item;
            list.add(NameHelper.translate("ft.tooltip.tm") + " " + pickaxe.getMaterial().toString());
            list.add(NameHelper.translate("ft.tooltip.hvl") + " " + pickaxe.getMaterial().getHarvestLevel());
            list.add(NameHelper.translate("ft.tooltip.dur") + " " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translate("ft.tooltip.eff") + " " + pickaxe.getMaterial().getEfficiencyOnProperMaterial());
            list.add(NameHelper.translate("ft.tooltip.dve") + " " + pickaxe.getMaterial().getDamageVsEntity());
            list.add(NameHelper.translate("ft.tooltip.ench") + " " + pickaxe.getMaterial().getEnchantability());
        }

        if (item instanceof ItemShovelFT){
            ItemShovelFT shovel = (ItemShovelFT)item;
            list.add(NameHelper.translate("ft.tooltip.tm") + " " + shovel.getMaterial().toString());
            list.add(NameHelper.translate("ft.tooltip.hvl") + " " + shovel.getMaterial().getHarvestLevel());
            list.add(NameHelper.translate("ft.tooltip.dur") + " " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translate("ft.tooltip.eff") + " " + shovel.getMaterial().getEfficiencyOnProperMaterial());
            list.add(NameHelper.translate("ft.tooltip.dve") + " " + shovel.getMaterial().getDamageVsEntity());
            list.add(NameHelper.translate("ft.tooltip.ench") + " " + shovel.getMaterial().getEnchantability());
        }

        if (item instanceof ItemAxeFT){
            ItemAxeFT axe = (ItemAxeFT)item;
            list.add(NameHelper.translate("ft.tooltip.tm") + " " + axe.getMaterial().toString());
            list.add(NameHelper.translate("ft.tooltip.hvl") + " " + axe.getMaterial().getHarvestLevel());
            list.add(NameHelper.translate("ft.tooltip.dur") + " " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translate("ft.tooltip.eff") + " " + axe.getMaterial().getEfficiencyOnProperMaterial());
            list.add(NameHelper.translate("ft.tooltip.dve") + " " + axe.getMaterial().getDamageVsEntity());
            list.add(NameHelper.translate("ft.tooltip.ench") + " " + axe.getMaterial().getEnchantability());
        }

        if (item instanceof ItemHoeFT){
            ItemHoeFT hoe = (ItemHoeFT)item;
            list.add(NameHelper.translate("ft.tooltip.tm") + " " + hoe.getMaterial().toString());
            list.add(NameHelper.translate("ft.tooltip.dur") + " " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translate("ft.tooltip.ench") + " " + hoe.getMaterial().getEnchantability());
        }

        if (item instanceof ItemSwordFT){
            ItemSwordFT sword = (ItemSwordFT)item;
            list.add(NameHelper.translate("ft.tooltip.tm") + " " + sword.getMaterial().toString());
            list.add(NameHelper.translate("ft.tooltip.dur") + " " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translate("ft.tooltip.dve") + " " + sword.getMaterial().getDamageVsEntity());
            list.add(NameHelper.translate("ft.tooltip.ench") + " " + sword.getMaterial().getEnchantability());
        }

        if (item instanceof ItemGemExpBase){
            ItemGemExpBase base = (ItemGemExpBase)item;
            if (base.getType() == 0) list.add(NameHelper.translate("ft.tooltip.gemExp"));
            if (base.getType() == 1) list.add(NameHelper.translate("ft.tooltip.gemExp2"));
            if (base.getType() == 2) list.add(NameHelper.translate("ft.tooltip.gemExp3"));
        }

        if (item instanceof ItemStaffExpBase){
            ItemStaffExpBase staff = (ItemStaffExpBase)item;
            if (staff.getType() == 0){
                list.add(NameHelper.translate("ft.tooltip.staffexp.rcl"));
                list.add(NameHelper.translate("ft.tooltip.staffexp.srcl"));
            }

            if (staff.getType() == 1){
                list.add(NameHelper.translate("ft.tooltip.staffexp2.rcl"));
                list.add(NameHelper.translate("ft.tooltip.staffexp2.srcl"));
            }

            if (staff.getType() == 2){
                list.add(NameHelper.translate("ft.tooltip.staffexp3.rcl"));
                list.add(NameHelper.translate("ft.tooltip.staffexp3.srcl"));
            }
        }
    }
}
