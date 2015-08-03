package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ItemBowFT extends ItemBow {
    public ToolMaterial material;

    public ItemBowFT(ToolMaterial material, String name) {
        super();
        this.material = material;
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setUnlocalizedName(name);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(this.material.getRepairItemStack()) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.ft.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.ft.%s", NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining) {
        String[] pulls = new String[]{"_0", "_1", "_2",};
        String standby = String.format("fergotools:%s", super.getUnlocalizedName(stack).substring(5));
        String pull0 = String.format("fergotools:%s%s", super.getUnlocalizedName(stack).substring(5), pulls[0]);
        String pull1 = String.format("fergotools:%s%s", super.getUnlocalizedName(stack).substring(5), pulls[1]);
        String pull2 = String.format("fergotools:%s%s", super.getUnlocalizedName(stack).substring(5), pulls[2]);

        ModelResourceLocation modelresourcelocation = new ModelResourceLocation(standby, "inventory");

        if (stack.getItem() == this && player.getItemInUse() != null) {
            if (useRemaining >= 18) {
                modelresourcelocation = new ModelResourceLocation(pull0, "inventory");
            } else if (useRemaining > 13) {
                modelresourcelocation = new ModelResourceLocation(pull1, "inventory");
            } else if (useRemaining > 0) {
                modelresourcelocation = new ModelResourceLocation(pull2, "inventory");
            }
        }
        return modelresourcelocation;
    }
}
