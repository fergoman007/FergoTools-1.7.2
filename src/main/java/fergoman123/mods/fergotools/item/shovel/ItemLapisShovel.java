package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.Materials;
import fergoman123.mods.fergotools.util.tool.ItemShovelFT;
import net.minecraft.item.ItemStack;

public class ItemLapisShovel extends ItemShovelFT {


    public ItemLapisShovel() {
        super(Materials.Tools.lapis, Materials.Tools.lapis.getMaxUses());
        this.setUnlocalizedName(Names.Items.lapisShovel);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.gemLapis)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
