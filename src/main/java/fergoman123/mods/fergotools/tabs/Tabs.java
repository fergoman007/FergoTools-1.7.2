package fergoman123.mods.fergotools.tabs;

import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings.TabStrings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tabs {
    public static CreativeTabs tabFergoTools;
    public static CreativeTabs tabFergoBlocks;
    public static CreativeTabs tabFergoFurnaces;
    public static CreativeTabs tabFergoItems;
    public static CreativeTabs tabFergoArmor;
    public static CreativeTabs tabFergoBows;

    public static void init(){
        tabFergoTools = new TabFergoTools(TabStrings.tabFergoTools);
        tabFergoBlocks = new TabFergoBlocks(TabStrings.tabFergoBlocks);
        tabFergoFurnaces = new TabFergoFurnaces(TabStrings.tabFergoFurnaces);
        tabFergoItems = new TabFergoItems(TabStrings.tabFergoItems);
        tabFergoArmor = new TabFergoArmor(TabStrings.tabFergoArmor);
        tabFergoBows = new TabFergoBows(TabStrings.tabFergoBows);
    }

    public static class TabFergoTools extends CreativeTabs{
        public TabFergoTools(String label){super(label); }
        public Item getTabIconItem(){return ModItems.quartzPickaxe;}
        public String getTranslatedTabLabel(){return "Fergoman123's Tools | Tools";}
    }

    public static class TabFergoBlocks extends CreativeTabs{
        public TabFergoBlocks(String label){super(label);}
        public Item getTabIconItem(){return Item.getItemFromBlock(ModBlocks.oreExperience);}
        public String getTranslatedTabLabel(){return "Fergoman123's Tools | Blocks";}
    }

    public static class TabFergoFurnaces extends CreativeTabs{
        public TabFergoFurnaces(String label){super(label);}
        public Item getTabIconItem(){return Item.getItemFromBlock(ModBlocks.quartzFurnaceIdle);}
        public String getTranslatedTabLabel(){return "Fergoman123's Tools | Furnaces";}
    }

    public static class TabFergoItems extends CreativeTabs{
        public TabFergoItems(String label){super(label);}
        public Item getTabIconItem(){return ModItems.expShard;}
        public String getTranslatedTabLabel(){return "Fergoman123's Tools | Items";}
    }

    public static class TabFergoArmor extends CreativeTabs{
        public TabFergoArmor(String label){super(label);}
        public Item getTabIconItem(){return ModItems.quartzHelmet;}
        public String getTranslatedTabLabel(){return "Fergoman123's Tools | Armor";}
    }

    public static class TabFergoBows extends CreativeTabs{
        public TabFergoBows(String label){super(label);}
        public Item getTabIconItem(){return ModItems.quartzBow;}
        public String getTranslatedTabLabel() {return "Fergoman123's Tools | Bows";}
    }
}
