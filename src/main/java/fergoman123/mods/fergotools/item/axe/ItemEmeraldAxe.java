package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.Materials;
import fergoman123.mods.fergotools.util.tool.ItemAxeFT;
import net.minecraft.item.ItemStack;

public class ItemEmeraldAxe extends ItemAxeFT {

    public ItemEmeraldAxe() {
        super(Materials.Tools.emerald, Materials.Tools.emerald.getMaxUses());
        this.setUnlocalizedName(Names.Items.emeraldAxe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.gemEmerald)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
