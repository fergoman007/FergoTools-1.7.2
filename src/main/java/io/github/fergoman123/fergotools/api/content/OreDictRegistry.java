/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.api.content;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergoutil.oredict.OreDictItem;
import io.github.fergoman123.fergoutil.oredict.OreDictItemStack;
import net.minecraft.item.ItemStack;

public class OreDictRegistry
{
    public static final OreDictItem ingotObsidian = new OreDictItem(ItemNames.ingotObsidian, ModItems.ingotObsidian);
    public static final OreDictItem gemEmerald = new OreDictItem(ItemNames.gemEmerald, ModItems.gemEmerald);
    public static final OreDictItem gemLapis = new OreDictItem(ItemNames.gemLapis, ModItems.gemLapis);
    public static final OreDictItem ingotBronze = new OreDictItem(ItemNames.ingotBronze, ModItems.ingotBronze);
    public static final OreDictItem ingotCoal = new OreDictItem(ItemNames.ingotCoal, ModItems.ingotCoal);
    public static final OreDictItem ingotGlowstone = new OreDictItem(ItemNames.ingotGlowstone, ModItems.ingotGlowstone);
    public static final OreDictItem ingotAdamantium = new OreDictItem(ItemNames.ingotAdamantium, ModItems.ingotAdamantium);
    public static final OreDictItem gemSilk = new OreDictItem(ItemNames.gemSilk, ModItems.gemSilk);
    public static final OreDictItem gemRedstone = new OreDictItem(ItemNames.gemRedstone, ModItems.gemRedstone);
    public static final OreDictItem gemExp = new OreDictItem(ItemNames.gemExp, ModItems.gemExp);
    public static final OreDictItem gemExp2 = new OreDictItem(ItemNames.gemExp2, ModItems.gemExp2);
    public static final OreDictItem gemExp3 = new OreDictItem(ItemNames.gemExp3, ModItems.gemExp3);

    public static final OreDictItem staffExp = new OreDictItem(ItemNames.staffExpVariants[0], ModItems.staffExp);
    public static final OreDictItem staffExp2 = new OreDictItem(ItemNames.staffExpVariants[1], ModItems.staffExp2);
    public static final OreDictItem staffExp3 = new OreDictItem(ItemNames.staffExpVariants[2], ModItems.staffExp3);

    public static final OreDictItem shardExp = new OreDictItem(ItemNames.shardExp, ModItems.shardExp);

    public static final OreDictItemStack stickFT0 = new OreDictItemStack(ItemNames.sticks[0], new ItemStack(ModItems.stickFT, 1, 0));
    public static final OreDictItemStack stickFT1 = new OreDictItemStack(ItemNames.sticks[1], new ItemStack(ModItems.stickFT, 1, 1));
    public static final OreDictItemStack stickFT2 = new OreDictItemStack(ItemNames.sticks[2], new ItemStack(ModItems.stickFT, 1, 2));
    public static final OreDictItemStack stickFT3 = new OreDictItemStack(ItemNames.sticks[3], new ItemStack(ModItems.stickFT, 1, 3));
    public static final OreDictItemStack stickFT4 = new OreDictItemStack(ItemNames.sticks[4], new ItemStack(ModItems.stickFT, 1, 4));
    public static final OreDictItemStack stickFT5 = new OreDictItemStack(ItemNames.sticks[5], new ItemStack(ModItems.stickFT, 1, 5));
    public static final OreDictItemStack stickFT6 = new OreDictItemStack(ItemNames.sticks[6], new ItemStack(ModItems.stickFT, 1, 6));
    public static final OreDictItemStack stickFT7 = new OreDictItemStack(ItemNames.sticks[7], new ItemStack(ModItems.stickFT, 1, 7));
    public static final OreDictItemStack stickFT8 = new OreDictItemStack(ItemNames.sticks[8], new ItemStack(ModItems.stickFT, 1, 8));

    public static void registerOres()
    {
        ingotObsidian.registerOre();
        gemEmerald.registerOre();
        gemLapis.registerOre();
        ingotBronze.registerOre();
        ingotCoal.registerOre();
        ingotGlowstone.registerOre();
        ingotAdamantium.registerOre();
        gemSilk.registerOre();
        gemRedstone.registerOre();
        gemExp.registerOre();
        gemExp2.registerOre();
        gemExp3.registerOre();

        staffExp.registerOre();
        staffExp2.registerOre();
        staffExp3.registerOre();

        shardExp.registerOre();

        stickFT0.registerOre();
        stickFT1.registerOre();
        stickFT2.registerOre();
        stickFT3.registerOre();
        stickFT4.registerOre();
        stickFT5.registerOre();
        stickFT6.registerOre();
        stickFT7.registerOre();
        stickFT8.registerOre();
    }
}
