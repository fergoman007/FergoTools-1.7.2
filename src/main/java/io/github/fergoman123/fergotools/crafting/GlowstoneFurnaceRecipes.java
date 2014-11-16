 /*
   * Fergoman123's Tools
   * Copyright (c) 2014 fergoman123.
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the GNU Lesser Public License v2.1
   * which accompanies this distribution, and is available at
   * http://www.gnu.org/licenses/gpl-3.0.html
   */

package io.github.fergoman123.fergotools.crafting;

 import net.minecraft.block.Block;
 import net.minecraft.init.Blocks;
 import net.minecraft.init.Items;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemFishFood;
 import net.minecraft.item.ItemStack;

 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.Map;
 import java.util.Map.Entry;

 public class GlowstoneFurnaceRecipes
{
    private static final GlowstoneFurnaceRecipes smeltingBase = new GlowstoneFurnaceRecipes();
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();

    public static GlowstoneFurnaceRecipes instance()
    {
        return smeltingBase;
    }

    private GlowstoneFurnaceRecipes()
    {
        this.addSmeltingRecipeForBlock(Blocks.iron_ore, new ItemStack(Items.iron_ingot), 0.7F);
        this.addSmeltingRecipeForBlock(Blocks.gold_ore, new ItemStack(Items.gold_ingot), 1.0F);
        this.addSmeltingRecipeForBlock(Blocks.diamond_ore, new ItemStack(Items.diamond), 1.0F);
        this.addSmeltingRecipeForBlock(Blocks.sand, new ItemStack(Blocks.glass), 0.1F);
        this.addSmelting(Items.porkchop, new ItemStack(Items.cooked_porkchop), 0.35F);
        this.addSmelting(Items.beef, new ItemStack(Items.cooked_beef), 0.35F);
        this.addSmelting(Items.chicken, new ItemStack(Items.cooked_chicken), 0.35F);
        this.addSmeltingRecipeForBlock(Blocks.cobblestone, new ItemStack(Blocks.stone), 0.1F);
        this.addSmelting(Items.clay_ball, new ItemStack(Items.brick), 0.3F);
        this.addSmeltingRecipeForBlock(Blocks.clay, new ItemStack(Blocks.hardened_clay), 0.35F);
        this.addSmeltingRecipeForBlock(Blocks.cactus, new ItemStack(Items.dye, 1, 2), 0.2F);
        this.addSmeltingRecipeForBlock(Blocks.log, new ItemStack(Items.coal, 1, 1), 0.15F);
        this.addSmeltingRecipeForBlock(Blocks.log2, new ItemStack(Items.coal, 1, 1), 0.15F);
        this.addSmeltingRecipeForBlock(Blocks.emerald_ore, new ItemStack(Items.emerald), 1.0F);
        this.addSmelting(Items.potato, new ItemStack(Items.baked_potato), 0.35F);
        this.addSmeltingRecipeForBlock(Blocks.netherrack, new ItemStack(Items.netherbrick), 0.1F);
        ItemFishFood.FishType[] afishType = ItemFishFood.FishType.values();
        int i = afishType.length;

        for (int j = 0; j < i; j++) {
            ItemFishFood.FishType fishType = afishType[j];

            if (fishType.func_150973_i())
            {
                this.addSmeltingRecipe(new ItemStack(Items.fish, 1, fishType.func_150976_a()), new ItemStack(Items.cooked_fished, 1, fishType.func_150976_a()), 0.35F);
            }
        }

        this.addSmeltingRecipeForBlock(Blocks.coal_ore, new ItemStack(Items.coal), 0.1F);
        this.addSmeltingRecipeForBlock(Blocks.redstone_ore, new ItemStack(Items.redstone), 0.7F);
        this.addSmeltingRecipeForBlock(Blocks.lapis_ore, new ItemStack(Items.dye, 1, 4), 0.2F);
        this.addSmeltingRecipeForBlock(Blocks.quartz_ore, new ItemStack(Items.quartz), 0.2F);

    }

    public void addSmeltingRecipeForBlock(Block input, ItemStack output, float experience)
    {
        this.addSmelting(Item.getItemFromBlock(input), output, experience);
    }

    public void addSmelting(Item input, ItemStack output, float experience)
    {
        this.addSmeltingRecipe(new ItemStack(input, 1, 32767), output, experience);
    }

    public void addSmeltingRecipe(ItemStack input, ItemStack output, float experience)
    {
        this.smeltingList.put(input, output);
        this.experienceList.put(output, Float.valueOf(experience));
    }

    public ItemStack getSmeltingResult(ItemStack stack)
    {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.compareItemStacks(stack, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getItemDamage() == 32767 || stack2.getItemDamage() == stack1.getItemDamage());
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }

    public float func_151398_b(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1)return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Map.Entry entry;

        do {
            if (!iterator.hasNext())
            {
                return 0.0F;
            }

            entry = (Map.Entry)iterator.next();
        }
        while (!this.compareItemStacks(stack, (ItemStack) entry.getKey()));

        return ((Float)entry.getValue()).floatValue();
    }
}
