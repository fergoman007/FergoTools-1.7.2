package fergoman123.mods.fergotools.tabs;

import fergoman123.mods.fergotools.block.ModBlocks;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.strings.TabStrings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

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
    public static CreativeTabs tabFergoHammers;
    public static CreativeTabs tabFergoExcavators;

    public static void addTabs()
    {
        tabFergoTools = new TabFergoTools(TabStrings.tabs[0]);
        tabFergoBlocks = new TabFergoBlocks(TabStrings.tabs[1]);
        tabFergoFurnaces = new TabFergoFurnaces(TabStrings.tabs[2]);
        tabFergoItems = new TabFergoItems(TabStrings.tabs[3]);
        tabFergoArmor = new TabFergoArmor(TabStrings.tabs[4]);
        tabFergoBows = new TabFergoBows(TabStrings.tabs[5]);
        tabFergoHammers = new TabFergoHammers(TabStrings.tabs[6]);
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

        public Item getTabIconItem()
        {
            return ModItems.expShard;
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

    private static class TabFergoHammers extends CreativeTabs {
        public TabFergoHammers(String label) {
            super(label);
        }

        public Item getTabIconItem() {
            return ModItems.quartzHammer;
        }
    }
}
