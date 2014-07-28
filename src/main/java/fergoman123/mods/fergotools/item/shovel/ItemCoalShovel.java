package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemCoalIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemShovelFT;
import net.minecraft.item.ItemStack;

public class ItemCoalShovel extends ItemShovelFT {

    public ItemCoalShovel() {
        super(ToolArmorMaterials.coal, ToolArmorMaterials.coal.getMaxUses());
        this.setUnlocalizedName(Names.Items.coalShovel);
        this.setMaxDamage(ToolArmorMaterials.getCoalMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.ingotCoal)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
