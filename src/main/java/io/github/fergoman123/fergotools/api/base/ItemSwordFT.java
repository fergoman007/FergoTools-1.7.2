package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemSwordFT extends ItemSword
{
	private ToolMaterial material;
	
	public ItemSwordFT(ToolMaterial material, String name) {
        super(material);
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setUnlocalizedName("ft." + name);
        this.material = material;
    }
    
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
    	return repair.isItemEqual(this.getToolMaterial().getRepairItemStack()) || super.getIsRepairable(toRepair, repair);
    }
    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List list, boolean advanced) {
    	list.add(StatCollector.translateToLocal(Locale.toolMat) + " " + this.getToolMaterialName());
    	list.add(StatCollector.translateToLocal(Locale.uses) + " " + NameHelper.getDurabilityString(stack));
    	list.add(StatCollector.translateToLocal(Locale.hl) + " " + this.getToolMaterial().getHarvestLevel());
    	list.add(StatCollector.translateToLocal(Locale.eff) + " " + this.getToolMaterial().getEfficiencyOnProperMaterial());
    	list.add(StatCollector.translateToLocal(Locale.dve) + " " + this.getToolMaterial().getDamageVsEntity());
    	list.add(StatCollector.translateToLocal(Locale.ench) + " " + this.getToolMaterial().getEnchantability());
    	list.add(StatCollector.translateToLocal(Locale.rpitem) + " " + this.getToolMaterial().getRepairItemStack().getDisplayName());
    }

    public ToolMaterial getToolMaterial(){
        return this.material;
    }
}
