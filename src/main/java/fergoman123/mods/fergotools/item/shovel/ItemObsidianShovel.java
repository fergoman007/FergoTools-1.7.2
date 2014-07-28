package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemObsidianIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import fergoman123.mods.fergotools.util.tool.ItemShovelFT;
import net.minecraft.item.ItemStack;

public class ItemObsidianShovel extends ItemShovelFT {


    public ItemObsidianShovel() {
        super(ToolArmorMaterials.obsidian, ToolArmorMaterials.obsidian.getMaxUses());
        this.setUnlocalizedName(Names.Items.obsidianShovel);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.ingotObsidian)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
