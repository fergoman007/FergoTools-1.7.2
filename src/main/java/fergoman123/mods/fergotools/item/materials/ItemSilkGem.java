package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.strings.ItemStrings;
import fergoman123.mods.fergotools.util.base.ItemFT;

public class ItemSilkGem extends ItemFT{

    public static ItemSilkGem instance = new ItemSilkGem();

    public ItemSilkGem()
    {
        super();
        this.setUnlocalizedName(ItemStrings.silkGem);
    }
}
