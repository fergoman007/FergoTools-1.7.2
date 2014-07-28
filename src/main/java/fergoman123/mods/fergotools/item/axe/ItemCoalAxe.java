package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemCoalIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemAxeFT;
import net.minecraft.item.ItemStack;

public class ItemCoalAxe extends ItemAxeFT {

    public ItemCoalAxe() {
        super(ToolArmorMaterials.coal, ToolArmorMaterials.coal.getMaxUses());
        this.setUnlocalizedName(Names.Items.coalAxe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack1.isItemEqual(new ItemStack(ModItems.ingotCoal)) || super.getIsRepairable(itemstack1, itemstack2);
    }
}
