 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.creativetab;

 import io.github.fergoman123.fergotools.api.content.FTContent;
 import io.github.fergoman123.fergotools.reference.strings.Tab;
 import io.github.fergoman123.fergoutil.creativetab.FergoCreativeTab;
 import io.github.fergoman123.fergoutil.helper.NameHelper;
 import net.minecraft.init.Blocks;
 import net.minecraft.item.Item;

 public class Tabs
{
    public static FergoCreativeTab tabFergoTools;
    public static FergoCreativeTab tabFergoBlocks;
    public static FergoCreativeTab tabFergoFurnaces;
    public static FergoCreativeTab tabFergoItems;
    public static FergoCreativeTab tabFergoArmor;
    public static FergoCreativeTab tabFergoBows;
    public static FergoCreativeTab tabFergoShears;
    public static FergoCreativeTab tabFergoWood;
    public static FergoCreativeTab tabFergoCT;

    public static void init(){
        tabFergoTools = new FergoCreativeTab(Tab.tabFergoTools)
        {
            public Item getTabIconItem()
            {
                return FTContent.quartzPickaxe;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoTools);
            }
        };

        tabFergoBlocks = new FergoCreativeTab(Tab.tabFergoBlocks)
        {
            public Item getTabIconItem()
            {
                return Item.getItemFromBlock(FTContent.blockFergoGlass);
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoBlocks);
            }
        };

        tabFergoFurnaces = new FergoCreativeTab(Tab.tabFergoFurnaces)
        {
            public Item getTabIconItem()
            {
                return Item.getItemFromBlock(FTContent.quartzFurnaceActive);
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoFurnaces);
            }
        };

        tabFergoItems = new FergoCreativeTab(Tab.tabFergoItems)
        {
            public Item getTabIconItem()
            {
                return FTContent.expCollector;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoItems);
            }
        };

        tabFergoArmor = new FergoCreativeTab(Tab.tabFergoArmor)
        {
            public Item getTabIconItem()
            {
                return FTContent.quartzChestplate;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoArmor);
            }
        };

        tabFergoBows = new FergoCreativeTab(Tab.tabFergoBows)
        {
            public Item getTabIconItem()
            {
                return FTContent.bowQuartz;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoBows);
            }
        };

        tabFergoShears = new FergoCreativeTab(Tab.tabFergoShears) {
            @Override
            public Item getTabIconItem() {
                return FTContent.quartzShears;
            }

            @Override
            public String getTranslatedTabLabel()
            {
                return NameHelper.translateToLocal(Tab.tabFergoShears);
            }

        };

        tabFergoWood = new FergoCreativeTab(Tab.tabFergoWood)
        {

            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(FTContent.logObsidian);
            }
            @Override
            public String getTranslatedTabLabel() {
                return NameHelper.translateToLocal(Tab.tabFergoWood);
            }
        };

        tabFergoCT = new FergoCreativeTab(Tab.tabFergoCT)
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
