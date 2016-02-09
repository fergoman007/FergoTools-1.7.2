package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemMultiFT extends Item{
    private String[] subNames;

    public ItemMultiFT(String[] subNames){
        this.subNames = subNames;
    }

    public String getUnlocalizedName(){
        return String.format("item.fergotools.%s", NameHelper.getName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack){
        return String.format("item.fergotools.%s.%s", NameHelper.getName(super.getUnlocalizedName()), subNames[stack.getItemDamage()]);
    }

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void getSubItems(Item item, CreativeTabs tabs, List list){
        for (int i = 0; i < subNames.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    public String[] getSubNames(){
        return subNames;
    }

    public ItemMultiFT setUnlocalizedName(String name){
        super.setUnlocalizedName(name);
        return this;
    }

    public ItemMultiFT setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }
}
