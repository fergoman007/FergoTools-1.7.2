package io.github.fergoman123.fergotools.item.crafting;

import com.google.common.collect.Maps;
import io.github.fergoman123.fergotools.common.recipe.MaceratorRecipeList;
import io.github.fergoman123.fergotools.common.recipe.RecipeMacerator;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Iterator;
import java.util.Map;

public class MaceratorRecipes
{
    private static final MaceratorRecipes maceratingBase = new MaceratorRecipes();

    private Map smeltingList = Maps.newHashMap();
    private Map experienceList = Maps.newHashMap();

    public static MaceratorRecipes instance()
    {
        return maceratingBase;
    }

    private MaceratorRecipes()
    {
        this.addBlockRecipe(MaceratorRecipeList.iron_ore);
        this.addBlockRecipe(MaceratorRecipeList.gold_ore);
        this.addBlockRecipe(MaceratorRecipeList.iron_ore);
        this.addBlockRecipe(MaceratorRecipeList.gold_ore);
        this.addBlockRecipe(MaceratorRecipeList.diamond_ore);
        this.addBlockRecipe(MaceratorRecipeList.coal_ore);
        this.addBlockRecipe(MaceratorRecipeList.redstone_ore);
        this.addBlockRecipe(MaceratorRecipeList.lapis_ore);
        this.addBlockRecipe(MaceratorRecipeList.quartz_ore);

        this.addBlockRecipe(MaceratorRecipeList.oreObsidian);
        this.addBlockRecipe(MaceratorRecipeList.oreGemEmerald);
        this.addBlockRecipe(MaceratorRecipeList.oreGemLapis);
        this.addBlockRecipe(MaceratorRecipeList.oreBronze);
        this.addBlockRecipe(MaceratorRecipeList.coal_block);
        this.addBlockRecipe(MaceratorRecipeList.glowstone);
        this.addBlockRecipe(MaceratorRecipeList.oreAdamantium);
        this.addBlockRecipe(MaceratorRecipeList.oreExperience);
        this.addBlockRecipe(MaceratorRecipeList.oreGemRedstone);
    }

    public void addSmeltingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addSmelting(Item.getItemFromBlock(input), stack, experience);
    }

    private void addBlockRecipe(RecipeMacerator recipe)
    {
        this.addSmeltingRecipeForBlock(recipe.getBlock(), recipe.getStack(), recipe.getExp());
    }

    /**
     * Adds a smelting recipe using an Item as the input item.
     *
     * @param input The input Item to be used for this recipe.
     * @param stack The output ItemStack for this recipe.
     * @param experience The amount of experience this recipe will give the player.
     */
    public void addSmelting(Item input, ItemStack stack, float experience)
    {
        this.addSmeltingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }

    public void addSmeltingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        this.smeltingList.put(input, stack);
        this.experienceList.put(stack, experience);
    }

    /**
     * Returns the smelting result of an item.
     */
    public ItemStack getSmeltingResult(ItemStack stack)
    {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Map.Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Map.Entry)iterator.next();
        }
        while (!this.compareItemStacks(stack, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    /**
     * Compares two itemstacks to ensure that they are the same. This checks both the item and the metadata of the item.
     */
    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }

    public float getSmeltingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Map.Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return 0.0F;
            }

            entry = (Map.Entry)iterator.next();
        }
        while (!this.compareItemStacks(stack, (ItemStack)entry.getKey()));

        return (Float) entry.getValue();
    }
}
