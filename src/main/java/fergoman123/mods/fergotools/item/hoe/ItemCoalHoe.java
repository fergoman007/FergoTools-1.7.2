package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemCoalIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemHoeFT;
import net.minecraft.item.ItemStack;

public class ItemCoalHoe extends ItemHoeFT {

    public ItemCoalHoe()
    {
        super(ToolArmorMaterials.coal, ToolArmorMaterials.coal.getMaxUses());
        this.setUnlocalizedName(Names.Items.coalHoe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.ingotCoal)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
