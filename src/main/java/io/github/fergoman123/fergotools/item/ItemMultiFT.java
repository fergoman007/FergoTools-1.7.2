package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMultiFT extends Item {

    private String[] subNames;
    private String name;

    public ItemMultiFT(String[] subNames, String name){
        super();
        this.setUnlocalizedName(name);
        this.subNames = subNames;
        this.name = name;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.ft.%s", this.name);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.ft.%s.%s", this.name, subNames[stack.getItemDamage()]);
    }

    public String[] getSubNames() {
        return subNames;
    }

    public String getName() {
        return name;
    }
}
