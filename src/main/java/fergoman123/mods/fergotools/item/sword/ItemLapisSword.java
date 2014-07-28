package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemLapisCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemSwordFT;
import net.minecraft.item.ItemStack;

public class ItemLapisSword extends ItemSwordFT {

    public ItemLapisSword() {
        super(ToolArmorMaterials.lapis, ToolArmorMaterials.lapis.getMaxUses());
        this.setUnlocalizedName(Names.Items.lapisSword);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.lapisCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
