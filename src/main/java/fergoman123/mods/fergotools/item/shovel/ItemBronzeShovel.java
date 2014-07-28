package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemBronzeIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemShovelFT;
import net.minecraft.item.ItemStack;

public class ItemBronzeShovel extends ItemShovelFT {

    public ItemBronzeShovel() {
        super(ToolArmorMaterials.bronze, ToolArmorMaterials.bronze.getMaxUses());
        this.setUnlocalizedName(Names.Items.bronzeShovel);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.ingotBronze)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
