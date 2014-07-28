package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemEmeraldCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemShovelFT;
import net.minecraft.item.ItemStack;

public class ItemEmeraldShovel extends ItemShovelFT {

    public ItemEmeraldShovel() {
        super(ToolArmorMaterials.emerald, ToolArmorMaterials.emerald.getMaxUses());
        this.setUnlocalizedName(Names.Items.emeraldShovel);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.emeraldCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
