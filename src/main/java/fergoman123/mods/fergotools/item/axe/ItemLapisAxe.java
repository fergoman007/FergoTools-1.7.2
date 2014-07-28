package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemLapisCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemAxeFT;
import net.minecraft.item.ItemStack;

public class ItemLapisAxe extends ItemAxeFT {

    public ItemLapisAxe() {
        super(ToolArmorMaterials.lapis, ToolArmorMaterials.lapis.getMaxUses());
        this.setUnlocalizedName(Names.Items.lapisAxe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.lapisCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}