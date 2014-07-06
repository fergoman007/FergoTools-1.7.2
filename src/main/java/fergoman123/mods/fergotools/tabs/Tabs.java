package fergoman123.mods.fergotools.tabs;

import fergoman123.mods.fergotools.block.furnace.BlockQuartzFurnace;
import fergoman123.mods.fergotools.block.ore.BlockOreExperience;
import fergoman123.mods.fergotools.item.armor.ItemArmorQuartz;
import fergoman123.mods.fergotools.item.bow.ItemQuartzBow;
import fergoman123.mods.fergotools.item.materials.ItemExpShard;
import fergoman123.mods.fergotools.item.pickaxe.ItemQuartzPickaxe;
import fergoman123.mods.fergotools.lib.strings.TabStrings;
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
        tabFergoTools = TabFergoTools.instance;
        tabFergoBlocks = TabFergoBlocks.instance;
        tabFergoFurnaces = TabFergoFurnaces.instance;
        tabFergoItems = TabFergoItems.instance;
        tabFergoArmor = TabFergoArmor.instance;
        tabFergoBows = TabFergoBows.instance;
    }

    public static class TabFergoTools extends CreativeTabs{
        public static final TabFergoTools instance = new TabFergoTools(TabStrings.tabFergoTools);

        public TabFergoTools(String label){super(label); }
        public Item getTabIconItem(){return ItemQuartzPickaxe.instance;}
        public String getTranslatedTabLabel(){return TabStrings.tabFergoToolsTranslated;}
    }

    public static class TabFergoBlocks extends CreativeTabs{
        public static final TabFergoBlocks instance = new TabFergoBlocks(TabStrings.tabFergoBlocks);

        public TabFergoBlocks(String label){super(label);}
        public Item getTabIconItem(){return Item.getItemFromBlock(BlockOreExperience.instance);}
        public String getTranslatedTabLabel(){return TabStrings.tabFergoBlocksTranslated;}
    }

    public static class TabFergoFurnaces extends CreativeTabs{

        public static final TabFergoFurnaces instance = new TabFergoFurnaces(TabStrings.tabFergoFurnaces);
        public TabFergoFurnaces(String label){super(label);}
        public Item getTabIconItem(){return Item.getItemFromBlock(BlockQuartzFurnace.instanceActive);}
        public String getTranslatedTabLabel(){return TabStrings.tabFergoFurnacesTranslated;}
    }

    public static class TabFergoItems extends CreativeTabs{
        public static final TabFergoItems instance = new TabFergoItems(TabStrings.tabFergoItems);

        public TabFergoItems(String label){super(label);}
        public Item getTabIconItem(){return ItemExpShard.instance;}
        public String getTranslatedTabLabel(){return TabStrings.tabFergoItemsTranslated;}
    }

    public static class TabFergoArmor extends CreativeTabs{
        public static final TabFergoArmor instance = new TabFergoArmor(TabStrings.tabFergoArmor);

        public TabFergoArmor(String label){super(label);}
        public Item getTabIconItem(){return ItemArmorQuartz.instanceHelmet;}
        public String getTranslatedTabLabel(){return TabStrings.tabFergoArmorTranslated;}
    }

    public static class TabFergoBows extends CreativeTabs{
        public static final TabFergoBows instance = new TabFergoBows(TabStrings.tabFergoBows);

        public TabFergoBows(String label){super(label);}
        public Item getTabIconItem(){return ItemQuartzBow.instance;}
        public String getTranslatedTabLabel() {return TabStrings.tabFergoBowsTranslated;}
    }
}
