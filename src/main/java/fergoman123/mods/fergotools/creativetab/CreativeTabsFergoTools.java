package fergoman123.mods.fergotools.creativetab;

import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.ItemExpCollector;
import fergoman123.mods.fergotools.item.armor.ItemArmorQuartz;
import fergoman123.mods.fergotools.item.bow.ItemQuartzBow;
import fergoman123.mods.fergotools.item.pickaxe.ItemQuartzPickaxe;
import fergoman123.mods.fergotools.reference.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

public class CreativeTabsFergoTools {
    public static CreativeTabs tabFergoTools;
    public static CreativeTabs tabFergoBlocks;
    public static CreativeTabs tabFergoFurnaces;
    public static CreativeTabs tabFergoItems;
    public static CreativeTabs tabFergoArmor;
    public static CreativeTabs tabFergoBows;

    public static void init(){
        tabFergoTools = new CreativeTabs(Strings.Tab.tabFergoTools)
        {
            public Item getTabIconItem()
            {
                return ModItems.quartzPickaxe;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return StatCollector.translateToLocal(Strings.Tab.itemGroupFergoTools);
            }
        };

        tabFergoBlocks = new CreativeTabs(Strings.Tab.tabFergoBlocks)
        {
            public Item getTabIconItem()
            {
                return Item.getItemFromBlock(ModBlocks.blockFergoGlass);
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return StatCollector.translateToLocal(Strings.Tab.itemGroupFergoBlocks);
            }
        };

        tabFergoFurnaces = new CreativeTabs(Strings.Tab.tabFergoFurnaces)
        {
            public Item getTabIconItem()
            {
                return Item.getItemFromBlock(ModBlocks.quartzFurnaceActive);
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return StatCollector.translateToLocal(Strings.Tab.itemGroupFergoFurnaces);
            }
        };

        tabFergoItems = new CreativeTabs(Strings.Tab.tabFergoItems)
        {
            public Item getTabIconItem()
            {
                return ModItems.expCollector;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return StatCollector.translateToLocal(Strings.Tab.itemGroupFergoItems);
            }
        };

        tabFergoArmor = new CreativeTabs(Strings.Tab.tabFergoArmor)
        {
            public Item getTabIconItem()
            {
                return ItemArmorQuartz.instanceChest;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return StatCollector.translateToLocal(Strings.Tab.itemGroupFergoArmor);
            }
        };

        tabFergoBows = new CreativeTabs(Strings.Tab.tabFergoBows)
        {
            public Item getTabIconItem()
            {
                return ModItems.bowQuartz;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return StatCollector.translateToLocal(Strings.Tab.itemGroupFergoBows);
            }
        };
    }
}
