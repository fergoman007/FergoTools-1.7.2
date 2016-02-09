package io.github.fergoman123.fergotools.tab;

import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CTFT {

    public static final CreativeTabs tabFergoTools = new CreativeTabs("fergotools:tabFergoTools") {
        public Item getTabIconItem(){return ModItems.quartzPickaxe;}
        public String getTranslatedTabLabel(){return NameHelper.translate(this.getTabLabel());}
    };
    public static final CreativeTabs tabFergoItems = new CreativeTabs("fergotools:tabFergoItems") {
        public Item getTabIconItem(){return this.getIconItemStack().getItem();}
        public ItemStack getIconItemStack(){return new ItemStack(ModItems.gemExp, 1, 0);}
        public String getTranslatedTabLabel(){return NameHelper.translate(this.getTabLabel());}
    };
    public static final CreativeTabs tabFergoBlocks = new CreativeTabs("fergotools:tabFergoBlocks"){
        public Item getTabIconItem(){return Item.getItemFromBlock(ModBlocks.oreObsidian);}
        public String getTranslatedTabLabel(){return NameHelper.translate(this.getTabLabel());}
    };
    public static final CreativeTabs tabFergoMisc = new CreativeTabs("fergotools:tabFergoMisc") {
        public Item getTabIconItem(){return ModItems.staffExp;}
        public ItemStack getIconItemStack(){return super.getIconItemStack();}
        public String getTranslatedTabLabel(){return NameHelper.translate(this.getTabLabel());}
    };
}
