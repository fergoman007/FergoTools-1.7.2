package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public abstract class ItemBowFT extends ItemBow {
    private ToolMaterial material;
    public ItemBowFT(ToolMaterial material, String name) {
        this.setMaxDamage(material.getMaxUses());
        this.setUnlocalizedName("ft." + name);
        this.material = material;
    }

    @Override
    public abstract ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining);

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        tooltip.add(StatCollector.translateToLocal("ft.tooltip.bowmat") + ": " + this.material.toString());
        tooltip.add(StatCollector.translateToLocal("ft.tooltip.usesleft")+": " + NameHelper.getDurabilityString(stack));
        tooltip.add(StatCollector.translateToLocal("ft.tooltip.rpitem") + ": " + StatCollector.translateToLocal(getRepairItemName()));
    }

    public String getRepairItemName(){
        return this.material.getRepairItemStack().getItem().getUnlocalizedName();
    }
}
