package fergoman123.mods.fergotools.item.crafting;

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

/**
 * Created by Fergoman123 on 12/05/2014.
 */
public class MaceratorRecipes {

    private static final MaceratorRecipes smeltingBase = new MaceratorRecipes();

    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();

    public static MaceratorRecipes smelting(){return smeltingBase;}

    private MaceratorRecipes()
    {
        this.func_151393_a(Blocks.iron_ore, new ItemStack(Items.iron_ingot, 2), 1.4F);
        this.func_151393_a(Blocks.gold_ore, new ItemStack(Items.gold_ingot, 2), 2.0F);
        this.func_151393_a(Blocks.diamond_ore, new ItemStack(Items.diamond, 2), 2.0F);
        this.func_151393_a(Blocks.sand, new ItemStack(Blocks.glass, 2), 0.2F);
        this.func_151396_a(Items.porkchop, new ItemStack(Items.cooked_porkchop, 2), 0.70F);
        this.func_151396_a(Items.beef, new ItemStack(Items.cooked_beef, 2), 0.70F);
        this.func_151396_a(Items.chicken, new ItemStack(Items.cooked_chicken, 2), 0.70F);
        this.func_151393_a(Blocks.cobblestone, new ItemStack(Blocks.stone, 2), 0.2F);
        this.func_151396_a(Items.clay_ball, new ItemStack(Items.brick, 2), 0.6F);
        this.func_151393_a(Blocks.clay, new ItemStack(Blocks.hardened_clay, 2), 0.70F);
        this.func_151393_a(Blocks.cactus, new ItemStack(Items.dye, 2, 2), 0.4F);
        this.func_151393_a(Blocks.log, new ItemStack(Items.coal, 2, 1), 0.30F);
        this.func_151393_a(Blocks.log2, new ItemStack(Items.coal, 2, 1), 0.30F);
        this.func_151393_a(Blocks.emerald_ore, new ItemStack(Items.emerald, 2), 2.0F);
        this.func_151396_a(Items.potato, new ItemStack(Items.baked_potato, 2), 0.70F);
        this.func_151393_a(Blocks.netherrack, new ItemStack(Items.netherbrick, 2), 0.2F);
        ItemFishFood.FishType[] afishtype = ItemFishFood.FishType.values();
        int i = afishtype.length;

        for (int j = 0; j < i; ++j)
        {
            ItemFishFood.FishType fishType = afishtype[j];

            if (fishType.func_150973_i())
            {
                this.func_151394_a(new ItemStack(Items.fish, 2, fishType.func_150976_a()), new ItemStack(Items.cooked_fished, 2, fishType.func_150976_a()), 0.7f);
            }
        }

        this.func_151393_a(Blocks.coal_ore, new ItemStack(Items.coal), 0.2f);
        this.func_151393_a(Blocks.redstone_ore, new ItemStack(Items.redstone), 1.4f);
        this.func_151393_a(Blocks.lapis_ore, new ItemStack(Items.dye, 2, 4), 0.4f);
        this.func_151393_a(Blocks.quartz_ore, new ItemStack(Items.quartz), 0.4f);
    }

    public void func_151393_a(Block block, ItemStack stack, float xp)
    {
        this.func_151396_a(Item.getItemFromBlock(block), stack, xp);
    }

    public void func_151396_a(Item item, ItemStack stack, float xp)
    {

    }

    @SuppressWarnings("unchecked")
    public void func_151394_a(ItemStack stack1, ItemStack stack2, float xp)
    {
        this.smeltingList.put(stack1, stack2);
        this.experienceList.put(stack2, Float.valueOf(xp));
    }

    public ItemStack getSmeltingResult(ItemStack stack)
    {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(stack, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean func_151397_a(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getItemDamage() == 32767 || stack2.getItemDamage() == stack1.getItemDamage());
    }

    public Map getSmeltingList(){return this.smeltingList;}

    public float func_151398_b(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Entry entry;

        do {
            if (!iterator.hasNext())
            {
                return 0.0f;
            }
            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(stack, (ItemStack)entry.getKey()));
        return ((Float)entry.getValue()).floatValue();
    }
}
