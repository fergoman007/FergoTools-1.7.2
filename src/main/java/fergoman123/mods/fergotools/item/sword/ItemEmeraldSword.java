package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemEmeraldCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemSwordFT;
import net.minecraft.item.ItemStack;

public class ItemEmeraldSword extends ItemSwordFT {

    public ItemEmeraldSword() {
        super(ToolArmorMaterials.emerald, ToolArmorMaterials.emerald.getMaxUses());
        this.setUnlocalizedName(Names.Items.emeraldSword);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.emeraldCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
