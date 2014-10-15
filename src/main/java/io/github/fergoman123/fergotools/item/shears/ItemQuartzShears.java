package io.github.fergoman123.fergotools.item.shears;

import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemShearsFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ITooltipItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

@SuppressWarnings("unchecked")
public class ItemQuartzShears extends ItemShearsFT implements ITooltipItem {


    public ItemQuartzShears() {
        super(Materials.Tools.quartz.getMaxUses());
        this.setUnlocalizedName(Names.Items.quartzShears);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(Names.Locale.durabilityToolTip) + (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage());
    }
}
