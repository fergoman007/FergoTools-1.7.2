 /*
   * Fergoman123's Tools
   * Copyright (c) 2014 fergoman123.
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the GNU Lesser Public License v2.1
   * which accompanies this distribution, and is available at
   * http://www.gnu.org/licenses/gpl-3.0.html
   */
package io.github.fergoman123.fergotools.crafting.ow;

 import net.minecraft.block.Block;
 import net.minecraft.init.Blocks;
 import net.minecraft.init.Items;
 import net.minecraft.inventory.InventoryCrafting;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 import net.minecraft.item.crafting.IRecipe;
 import net.minecraft.item.crafting.ShapedRecipes;
 import net.minecraft.item.crafting.ShapelessRecipes;
 import net.minecraft.world.World;

 import java.util.*;

 public class CraftingManagerOW
{
    private static final CraftingManagerOW instance = new CraftingManagerOW();

    private List recipes = new ArrayList();

    public static final CraftingManagerOW getInstance()
    {
        return instance;
    }

    private CraftingManagerOW()
    {
        this.recipes.add(RecipesOW.armorDyes);
        this.recipes.add(RecipesOW.bookCloning);
        this.recipes.add(RecipesOW.mapCloning);
        this.recipes.add(RecipesOW.mapExtending);
        this.recipes.add(RecipesOW.fireworks);
        Collections.sort(this.recipes, new Comparator() {
            public int compare(IRecipe p_compare_1_, IRecipe p_compare_2_)
            {
                return p_compare_1_ instanceof ShapelessRecipes && p_compare_2_ instanceof ShapedRecipes ? 1 : (p_compare_2_ instanceof ShapelessRecipes && p_compare_1_ instanceof ShapedRecipes ? -1 : (p_compare_2_.getRecipeSize() < p_compare_1_.getRecipeSize() ? -1 : (p_compare_2_.getRecipeSize() > p_compare_1_.getRecipeSize() ? 1 : 0)));
            }
            public int compare(Object p_compare_1_, Object p_compare_2_)
            {
                return this.compare((IRecipe)p_compare_1_, (IRecipe)p_compare_2_);
            }
        });
    }

    public void addRecipes()
    {

    }



    public ShapedRecipes addRecipe(ItemStack output, Object ... recipe)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (recipe[i] instanceof String[])
        {
            String[] astring = (String[])((String[])recipe[i++]);

            for (int l = 0; l < astring.length; ++l)
            {
                String s1 = astring[l];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }
        else
        {
            while (recipe[i] instanceof String)
            {
                String s2 = (String)recipe[i++];
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }

        HashMap hashmap;

        for (hashmap = new HashMap(); i < recipe.length; i += 2)
        {
            Character character = (Character)recipe[i];
            ItemStack itemstack1 = null;

            if (recipe[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)recipe[i + 1]);
            }
            else if (recipe[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)recipe[i + 1], 1, 32767);
            }
            else if (recipe[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)recipe[i + 1];
            }

            hashmap.put(character, itemstack1);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int i1 = 0; i1 < j * k; ++i1)
        {
            char c0 = s.charAt(i1);

            if (hashmap.containsKey(Character.valueOf(c0)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }

        ShapedRecipes shapedrecipes = new ShapedRecipes(j, k, aitemstack, output);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }

    public void addShapelessRecipe(ItemStack output, Object ... recipe)
    {
        ArrayList arraylist = new ArrayList();
        Object[] aobject = recipe;
        int i = recipe.length;

        for (int j = 0; j < i; ++j)
        {
            Object object1 = aobject[j];

            if (object1 instanceof ItemStack)
            {
                arraylist.add(((ItemStack)object1).copy());
            }
            else if (object1 instanceof Item)
            {
                arraylist.add(new ItemStack((Item)object1));
            }
            else
            {
                if (!(object1 instanceof Block))
                {
                    throw new RuntimeException("Invalid shapeless recipy!");
                }

                arraylist.add(new ItemStack((Block)object1));
            }
        }

        this.recipes.add(new ShapelessRecipes(output, arraylist));
    }

    public ItemStack findMatchingRecipe(InventoryCrafting craftingInv, World world)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        int j;

        for (j = 0; j < craftingInv.getSizeInventory(); ++j)
        {
            ItemStack itemstack2 = craftingInv.getStackInSlot(j);

            if (itemstack2 != null)
            {
                if (i == 0)
                {
                    itemstack = itemstack2;
                }

                if (i == 1)
                {
                    itemstack1 = itemstack2;
                }

                ++i;
            }
        }

        if (i == 2 && itemstack.getItem() == itemstack1.getItem() && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && itemstack.getItem().isRepairable())
        {
            Item item = itemstack.getItem();
            int j1 = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
            int k = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
            int l = j1 + k + item.getMaxDamage() * 5 / 100;
            int i1 = item.getMaxDamage() - l;

            if (i1 < 0)
            {
                i1 = 0;
            }

            return new ItemStack(itemstack.getItem(), 1, i1);
        }
        else
        {
            for (j = 0; j < this.recipes.size(); ++j)
            {
                IRecipe irecipe = (IRecipe)this.recipes.get(j);

                if (irecipe.matches(craftingInv, world))
                {
                    return irecipe.getCraftingResult(craftingInv);
                }
            }

            return null;
        }
    }

    public List getRecipeList()
    {
        return this.recipes;
    }
}
