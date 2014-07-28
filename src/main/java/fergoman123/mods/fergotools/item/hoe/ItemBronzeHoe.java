package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemBronzeIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemHoeFT;
import net.minecraft.item.ItemStack;

public class ItemBronzeHoe extends ItemHoeFT {

    public ItemBronzeHoe() {
        super(ToolArmorMaterials.bronze, ToolArmorMaterials.bronze.getMaxUses());
        this.setUnlocalizedName(Names.Items.bronzeHoe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.ingotBronze)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
