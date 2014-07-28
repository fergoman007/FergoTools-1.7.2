package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemObsidianIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemHoeFT;
import net.minecraft.item.ItemStack;

public class ItemObsidianHoe extends ItemHoeFT {

    public ItemObsidianHoe() {
        super(ToolArmorMaterials.obsidian, ToolArmorMaterials.obsidian.getMaxUses());
        this.setUnlocalizedName(Names.Items.obsidianHoe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.ingotObsidian)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
