/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergotools.api.content;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictRegistry
{
    public static void registerOres()
    {
    	
    }
    
    private static void registerOre(String name, Block ore){
    	OreDictionary.registerOre(name, ore);
    }
    
    public static void registerOre(String name, Block ore, int meta){
    	OreDictionary.registerOre(name, new ItemStack(ore, 1, meta));
    }
    
    public static void registerOre(String name, Item ore){
    	OreDictionary.registerOre(name, ore);
    }
    
    public static void registerOre(String name, Item ore, int meta){
    	OreDictionary.registerOre(name, new ItemStack(ore, 1, meta));
    }
}
