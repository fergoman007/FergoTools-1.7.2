package io.github.fergoman123.fergotools.event;

import java.util.List;

import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.item.ItemAxeFT;
import io.github.fergoman123.fergotools.item.ItemGemExpBase;
import io.github.fergoman123.fergotools.item.ItemHoeFT;
import io.github.fergoman123.fergotools.item.ItemPickaxeFT;
import io.github.fergoman123.fergotools.item.ItemShovelFT;
import io.github.fergoman123.fergotools.item.ItemStaffExpBase;
import io.github.fergoman123.fergotools.item.ItemSwordFT;
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
            list.add(NameHelper.translate("ft.tooltip.tm") + " " + pickaxe.material.toString());
            list.add(NameHelper.translate("ft.tooltip.hvl") + " " + pickaxe.material.getHarvestLevel());
            list.add(NameHelper.translate("ft.tooltip.dur") + " " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translate("ft.tooltip.eff") + " " + pickaxe.material.getEfficiencyOnProperMaterial());
            list.add(NameHelper.translate("ft.tooltip.dve") + " " + pickaxe.material.getDamageVsEntity());
            list.add(NameHelper.translate("ft.tooltip.ench") + " " + pickaxe.material.getEnchantability());
        }

        if (item instanceof ItemShovelFT){
            ItemShovelFT shovel = (ItemShovelFT)item;
            list.add(NameHelper.translate("ft.tooltip.tm") + " " + shovel.material.toString());
            list.add(NameHelper.translate("ft.tooltip.hvl") + " " + shovel.material.getHarvestLevel());
            list.add(NameHelper.translate("ft.tooltip.dur") + " " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translate("ft.tooltip.eff") + " " + shovel.material.getEfficiencyOnProperMaterial());
            list.add(NameHelper.translate("ft.tooltip.dve") + " " + shovel.material.getDamageVsEntity());
            list.add(NameHelper.translate("ft.tooltip.ench") + " " + shovel.material.getEnchantability());
        }

        if (item instanceof ItemAxeFT){
            ItemAxeFT axe = (ItemAxeFT)item;
            list.add(NameHelper.translate("ft.tooltip.tm") + " " + axe.material.toString());
            list.add(NameHelper.translate("ft.tooltip.hvl") + " " + axe.material.getHarvestLevel());
            list.add(NameHelper.translate("ft.tooltip.dur") + " " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translate("ft.tooltip.eff") + " " + axe.material.getEfficiencyOnProperMaterial());
            list.add(NameHelper.translate("ft.tooltip.dve") + " " + axe.material.getDamageVsEntity());
            list.add(NameHelper.translate("ft.tooltip.ench") + " " + axe.material.getEnchantability());
        }

        if (item instanceof ItemHoeFT){
            ItemHoeFT hoe = (ItemHoeFT)item;
            list.add(NameHelper.translate("ft.tooltip.tm") + " " + hoe.material.toString());
            list.add(NameHelper.translate("ft.tooltip.dur") + " " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translate("ft.tooltip.ench") + " " + hoe.material.getEnchantability());
        }

        if (item instanceof ItemSwordFT){
            ItemSwordFT sword = (ItemSwordFT)item;
            list.add(NameHelper.translate("ft.tooltip.tm") + " " + sword.material.toString());
            list.add(NameHelper.translate("ft.tooltip.dur") + " " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
            list.add(NameHelper.translate("ft.tooltip.dve") + " " + sword.material.getDamageVsEntity());
            list.add(NameHelper.translate("ft.tooltip.ench") + " " + sword.material.getEnchantability());
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
