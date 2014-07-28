package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemGlowstoneIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemHoeFT;
import net.minecraft.item.ItemStack;

public class ItemGlowstoneHoe extends ItemHoeFT {

    public ItemGlowstoneHoe() {
        super(ToolArmorMaterials.glowstone, ToolArmorMaterials.glowstone.getMaxUses());
        this.setUnlocalizedName(Names.Items.glowstoneHoe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.ingotGlowstone)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
