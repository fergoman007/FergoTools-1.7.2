package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemHoeFT;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemQuartzHoe extends ItemHoeFT {

    public ItemQuartzHoe() {
        super(ToolArmorMaterials.quartz, ToolArmorMaterials.quartz.getMaxUses());
        this.setUnlocalizedName(Names.Items.quartzHoe);
    }


    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2) {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }
}


