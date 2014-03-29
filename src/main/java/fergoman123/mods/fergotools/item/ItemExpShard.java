package fergoman123.mods.fergotools.item;

import cpw.mods.fml.relauncher.SideOnly;
import static cpw.mods.fml.relauncher.Side.CLIENT;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemExpShard extends Item {

	public ItemExpShard() {
        super();
	}

    @SideOnly(CLIENT)
    public boolean hasEffect(ItemStack stack, int pass)
    {
        return true;
    }
}
