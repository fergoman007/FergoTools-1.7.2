package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemEmeraldCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemHoeFT;
import net.minecraft.item.ItemStack;

public class ItemEmeraldHoe extends ItemHoeFT {

    public ItemEmeraldHoe() {
        super(ToolArmorMaterials.emerald, ToolArmorMaterials.emerald.getMaxUses());
        this.setUnlocalizedName(Names.Items.emeraldHoe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.emeraldCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
