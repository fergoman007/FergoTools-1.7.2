package fergoman123.mods.fergotools.tabs;

import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings.TabStrings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class Tabs {

    public static CreativeTabs tabFergoTools;
    public static CreativeTabs tabFergoBlocks;
    public static CreativeTabs tabFergoFurnaces;
    public static CreativeTabs tabFergoItems;
    public static CreativeTabs tabFergoArmor;
    public static CreativeTabs tabFergoBows;

    public static void init()
    {
        tabFergoTools = new TabFergoTools(TabStrings.tabFergoTools);
        tabFergoBlocks = new TabFergoBlocks(TabStrings.tabFergoBlocks);
        tabFergoFurnaces = new TabFergoFurnaces(TabStrings.tabFergoFurnaces);
        tabFergoItems = new TabFergoItems(TabStrings.tabFergoItems);
        tabFergoArmor = new TabFergoArmor(TabStrings.tabFergoArmor);
        tabFergoBows = new TabFergoBows(TabStrings.tabFergoBows);
    }

    public static class TabFergoTools extends CreativeTabs
    {

        public TabFergoTools(String label) {
            super(label);
        }

        @Override
        public Item getTabIconItem() {
            return ModItems.quartzPickaxe;
        }
    }

    public static class TabFergoBlocks extends CreativeTabs
    {
        public TabFergoBlocks(String label)
        {
            super(label);
        }

        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.oreExperience);
        }
    }

    public static class TabFergoFurnaces extends CreativeTabs
    {
        public TabFergoFurnaces(String label)
        {
            super(label);
        }

        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.quartzFurnaceIdle);
        }
    }

    public static class TabFergoItems extends CreativeTabs
    {
        public TabFergoItems(String label)
        {
            super(label);
        }

        private ItemStack iconItemStack;

        public Item getTabIconItem()
        {
            return ModItems.expShard;
        }

        public ItemStack getIconItemStack()
        {
            if (this.iconItemStack == null)
            {
                this.iconItemStack = new ItemStack(this.getTabIconItem(), 1, this.func_151243_f());
            }

            return this.iconItemStack;
        }

        public int func_151243_f()
        {
            return 7;
        }
    }

    public static class TabFergoArmor extends CreativeTabs
    {
        public TabFergoArmor(String label)
        {
            super(label);
        }
        public Item getTabIconItem()
        {
            return ModItems.quartzHelmet;
        }
    }

    public static class TabFergoBows extends CreativeTabs
    {
        public TabFergoBows(String label)
        {
            super(label);
        }

        public Item getTabIconItem()
        {
            return ModItems.quartzBow;
        }
    }
}
