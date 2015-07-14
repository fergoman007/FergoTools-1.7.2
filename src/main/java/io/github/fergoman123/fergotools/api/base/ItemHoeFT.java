package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.reference.Assets;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemHoeFT extends ItemHoe
{
	private ToolMaterial material;
	
	public ItemHoeFT(ToolMaterial material, String name) {
        super(material);
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setUnlocalizedName("ft." + name);
        this.material = material;
    }
    
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
    	return repair.isItemEqual(this.material.getRepairItemStack()) || super.getIsRepairable(toRepair, repair);
    }
    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List list, boolean advanced) {
    	list.add(StatCollector.translateToLocal(Assets.Locale.toolMat) + " " + this.getToolMaterial().toString());
    	list.add(StatCollector.translateToLocal(Assets.Locale.uses) + " " + NameHelper.getDurabilityString(stack));
    	list.add(StatCollector.translateToLocal(Assets.Locale.rpitem) + " " + this.getToolMaterial().getRepairItemStack().getDisplayName());
    }

    public ToolMaterial getToolMaterial() {
        return this.material;
    }
}
