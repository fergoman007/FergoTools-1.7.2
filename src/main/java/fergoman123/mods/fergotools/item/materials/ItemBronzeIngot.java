package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.strings.ItemStrings;
import fergoman123.mods.fergotools.util.base.ItemFT;

public class ItemBronzeIngot extends ItemFT {

    public static ItemBronzeIngot instance = new ItemBronzeIngot();

    public ItemBronzeIngot()
    {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ItemStrings.ingotBronze);
    }
}
