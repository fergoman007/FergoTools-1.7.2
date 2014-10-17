 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.creativetab;


 import io.github.fergoman123.fergotools.init.ModBlocks;
 import io.github.fergoman123.fergotools.init.ModItems;
 import io.github.fergoman123.fergotools.reference.strings.Tab;
 import io.github.fergoman123.fergoutil.helper.NameHelper;
 import net.minecraft.creativetab.CreativeTabs;
 import net.minecraft.init.Blocks;
 import net.minecraft.item.Item;

 public class Tabs {
    public static CreativeTabs tabFergoTools;
    public static CreativeTabs tabFergoBlocks;
    public static CreativeTabs tabFergoFurnaces;
    public static CreativeTabs tabFergoItems;
    public static CreativeTabs tabFergoArmor;
    public static CreativeTabs tabFergoBows;
    public static CreativeTabs tabFergoShears;
    public static CreativeTabs tabFergoWood;
    public static CreativeTabs tabFergoCT;

    public static void init(){
        tabFergoTools = new CreativeTabs(Tab.tabFergoTools)
        {
            public Item getTabIconItem()
            {
                return ModItems.quartzPickaxe;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoTools);
            }
        };

        tabFergoBlocks = new CreativeTabs(Tab.tabFergoBlocks)
        {
            public Item getTabIconItem()
            {
                return Item.getItemFromBlock(ModBlocks.blockFergoGlass);
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoBlocks);
            }
        };

        tabFergoFurnaces = new CreativeTabs(Tab.tabFergoFurnaces)
        {
            public Item getTabIconItem()
            {
                return Item.getItemFromBlock(ModBlocks.quartzFurnaceActive);
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoFurnaces);
            }
        };

        tabFergoItems = new CreativeTabs(Tab.tabFergoItems)
        {
            public Item getTabIconItem()
            {
                return ModItems.expCollector;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoItems);
            }
        };

        tabFergoArmor = new CreativeTabs(Tab.tabFergoArmor)
        {
            public Item getTabIconItem()
            {
                return ModItems.quartzChestplate;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoArmor);
            }
        };

        tabFergoBows = new CreativeTabs(Tab.tabFergoBows)
        {
            public Item getTabIconItem()
            {
                return ModItems.bowQuartz;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoBows);
            }
        };

        tabFergoShears = new CreativeTabs(Tab.tabFergoShears) {
            @Override
            public Item getTabIconItem() {
                return ModItems.quartzShears;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoShears);
            }

        };

        tabFergoWood = new CreativeTabs(Tab.tabFergoWood)
        {

            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(ModBlocks.logObsidian);
            }

            @Override
            public String getTranslatedTabLabel() {
                return NameHelper.translateToLocal(Tab.tabFergoWood);
            }
        };

        tabFergoCT = new CreativeTabs(Tab.tabFergoCT)
        {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Blocks.crafting_table);
            }

            @Override
            public String getTranslatedTabLabel() {
                return NameHelper.translateToLocal(Tab.tabFergoCT);
            }
        };
    }
}