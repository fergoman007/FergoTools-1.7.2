package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemCoalIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemSwordFT;
import net.minecraft.item.ItemStack;

public class ItemCoalSword extends ItemSwordFT {

    public ItemCoalSword() {
        super(ToolArmorMaterials.coal, ToolArmorMaterials.coal.getMaxUses());
        this.setUnlocalizedName(Names.Items.coalSword);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.ingotCoal)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
