package io.github.fergoman123.fergotools.common.handler;

import io.github.fergoman123.fergotools.api.*;
import io.github.fergoman123.fergotools.common.furnace.QuartzFurnace;
import io.github.fergoman123.fergotools.common.items.ItemExpShard;
import io.github.fergoman123.fergotools.common.items.ItemStaffExp;
import io.github.fergoman123.fergotools.info.ItemNames;
import io.github.fergoman123.fergotools.info.Locale;
import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

public class EventHandler
{
    public static final OnItemTooltipEvent tooltipEvent = new OnItemTooltipEvent();

    public static class OnItemTooltipEvent
    {
        @SubscribeEvent
        public void onItemTooltip(ItemTooltipEvent evt)
        {
            ItemStack stack = evt.itemStack;
            Item item = stack.getItem();
            Block block = Block.getBlockFromItem(item);
            List<String> list = evt.toolTip;
            if (item != null) {
                if (item instanceof ItemExpShard) {
                    ItemExpShard shardExp = (ItemExpShard) item;

                    list.add(NameHelper.translate(Locale.shardExp));
                }

                if (item == ModItems.ingotObsidian)
                {
                    list.add(NameHelper.translate(Locale.oreDictName));
                    list.add(ItemNames.ingotObsidian);
                }

                if (item == ModItems.gemEmerald)
                {
                    list.add(NameHelper.translate(Locale.oreDictName));
                    list.add(ItemNames.gemEmerald);
                }

                if (item == ModItems.gemLapis)
                {
                    list.add(NameHelper.translate(Locale.oreDictName));
                    list.add(ItemNames.gemLapis);
                }

                if (item == ModItems.ingotBronze)
                {
                    list.add(NameHelper.translate(Locale.oreDictName));
                    list.add(ItemNames.ingotBronze);
                }

                if (item == ModItems.ingotCoal)
                {
                    list.add(NameHelper.translate(Locale.oreDictName));
                    list.add(ItemNames.ingotCoal);
                }

                if (item == ModItems.ingotGlowstone)
                {
                    list.add(NameHelper.translate(Locale.oreDictName));
                    list.add(ItemNames.ingotGlowstone);
                }

                if (item == ModItems.ingotAdamantium)
                {
                    list.add(NameHelper.translate(Locale.oreDictName));
                    list.add(ItemNames.ingotAdamantium);
                }

                if (item == ModItems.gemSilk)
                {
                    list.add(NameHelper.translate(Locale.oreDictName));
                    list.add(ItemNames.gemSilk);
                }

                if (item == ModItems.gemRedstone)
                {
                    list.add(NameHelper.translate(Locale.oreDictName));
                    list.add(ItemNames.gemRedstone);
                }

                if (item == ModItems.expCollector)
                {
                    list.add(NameHelper.translate(Locale.craftingItem));
                }

                if (item instanceof ItemStaffExp)
                {
                    if (stack.getItemDamage() == 0)
                    {
                        for(String s : Locale.staffExp)
                        {
                            list.add(NameHelper.translate(s));
                        }
                    }
                    else if(stack.getItemDamage() == 1)
                    {
                        for(String s : Locale.staffExp2)
                        {
                            list.add(NameHelper.translate(s));
                        }
                    }
                    else if (stack.getItemDamage() == 2)
                    {
                        for(String s : Locale.staffExp3)
                        {
                            list.add(NameHelper.translate(s));
                        }
                    }
                }

                if (item == ModItems.gemExp)
                {
                    list.add(NameHelper.translate(Locale.gemExp));
                }

                if (item == ModItems.gemExp2)
                {
                    list.add(NameHelper.translate(Locale.gemExp2));
                }

                if (item == ModItems.gemExp3)
                {
                    list.add(NameHelper.translate(Locale.gemExp3));
                }

                if (item instanceof ItemPickaxeFT)
                {
                    ItemPickaxeFT pickaxe = (ItemPickaxeFT)item;

                    list.add(NameHelper.translate(Locale.material) + " " + pickaxe.getToolMaterial().name());
                    list.add(NameHelper.translate(Locale.usesLeft) + " " + (stack.getMaxDamage() - stack.getItemDamage()));
                    list.add(NameHelper.translate(Locale.harvestLvl) + " " + pickaxe.getToolMaterial().getHarvestLevel());
                    list.add(NameHelper.translate(Locale.maxUses) + " " +  stack.getMaxDamage());
                    list.add(NameHelper.translate(Locale.eff) + " " +  pickaxe.getToolMaterial().getEfficiencyOnProperMaterial());
                    list.add(NameHelper.translate(Locale.damagevsentity) + " " +  pickaxe.getToolMaterial());
                    list.add(NameHelper.translate(Locale.enchantability) + " " +  pickaxe.getToolMaterial().getEnchantability());
                }

                if (item instanceof ItemShovelFT)
                {
                    ItemShovelFT shovel = (ItemShovelFT)item;

                    list.add(NameHelper.translate(Locale.material) + " " + shovel.getToolMaterial().name());
                    list.add(NameHelper.translate(Locale.usesLeft) + " " + (stack.getMaxDamage() - stack.getItemDamage()));
                    list.add(NameHelper.translate(Locale.harvestLvl) + " " + shovel.getToolMaterial().getHarvestLevel());
                    list.add(NameHelper.translate(Locale.maxUses) + " " +  stack.getMaxDamage());
                    list.add(NameHelper.translate(Locale.eff) + " " +  shovel.getToolMaterial().getEfficiencyOnProperMaterial());
                    list.add(NameHelper.translate(Locale.damagevsentity) + " " + shovel.getToolMaterial());
                    list.add(NameHelper.translate(Locale.enchantability) + " " +  shovel.getToolMaterial().getEnchantability());
                }

                if (item instanceof ItemAxeFT)
                {
                    ItemAxeFT axe = (ItemAxeFT)item;

                    list.add(NameHelper.translate(Locale.material) + " " + axe.getToolMaterial().name());
                    list.add(NameHelper.translate(Locale.usesLeft) + " " + (stack.getMaxDamage() - stack.getItemDamage()));
                    list.add(NameHelper.translate(Locale.harvestLvl) + " " + axe.getToolMaterial().getHarvestLevel());
                    list.add(NameHelper.translate(Locale.maxUses) + " " +  stack.getMaxDamage());
                    list.add(NameHelper.translate(Locale.eff) + " " +  axe.getToolMaterial().getEfficiencyOnProperMaterial());
                    list.add(NameHelper.translate(Locale.damagevsentity) + " " + axe.getToolMaterial());
                    list.add(NameHelper.translate(Locale.enchantability) + " " +  axe.getToolMaterial().getEnchantability());
                }

                if (item instanceof ItemHoeFT)
                {
                    ItemHoeFT hoe = (ItemHoeFT)item;

                    list.add(NameHelper.translate(Locale.material) + " " + hoe.getToolMaterial().name());
                    list.add(NameHelper.translate(Locale.usesLeft) + " " + (stack.getMaxDamage() - stack.getItemDamage()));
                    list.add(NameHelper.translate(Locale.harvestLvl) + " " + hoe.getToolMaterial().getHarvestLevel());
                    list.add(NameHelper.translate(Locale.maxUses) + " " +  stack.getMaxDamage());
                    list.add(NameHelper.translate(Locale.eff) + " " +  hoe.getToolMaterial().getEfficiencyOnProperMaterial());
                    list.add(NameHelper.translate(Locale.damagevsentity) + " " + hoe.getToolMaterial());
                    list.add(NameHelper.translate(Locale.enchantability) + " " +  hoe.getToolMaterial().getEnchantability());
                }

                if (item instanceof ItemSwordFT)
                {
                    ItemSwordFT sword = (ItemSwordFT)item;

                    list.add(NameHelper.translate(Locale.material) + " " + sword.getToolMaterial().name());
                    list.add(NameHelper.translate(Locale.usesLeft) + " " + (stack.getMaxDamage() - stack.getItemDamage()));
                    list.add(NameHelper.translate(Locale.harvestLvl) + " " + sword.getToolMaterial().getHarvestLevel());
                    list.add(NameHelper.translate(Locale.maxUses) + " " +  stack.getMaxDamage());
                    list.add(NameHelper.translate(Locale.eff) + " " +  sword.getToolMaterial().getEfficiencyOnProperMaterial());
                    list.add(NameHelper.translate(Locale.damagevsentity) + " " + sword.getToolMaterial());
                    list.add(NameHelper.translate(Locale.enchantability) + " " +  sword.getToolMaterial().getEnchantability());
                }

                if (block instanceof QuartzFurnace.BlockQuartzFurnace)
                {
                    QuartzFurnace.BlockQuartzFurnace quartzFurnace = (QuartzFurnace.BlockQuartzFurnace)block;

                    list.add(NameHelper.translate(Locale.Furnace.material) + " " + quartzFurnace.getMaterial().toString());
                    list.add(NameHelper.translate(Locale.Furnace.state) + " " + (quartzFurnace.getIsActive() ? "Active" : "Idle"));
                    list.add(NameHelper.translate(Locale.Furnace.speed) + " " + 200 * 200 + "x");
                }
            }
        }
    }
}
