package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.strings.ItemStrings;
import fergoman123.mods.fergotools.util.base.ItemFT;

public class ItemRedstoneCrystal extends ItemFT{

    public static ItemRedstoneCrystal instance = new ItemRedstoneCrystal();

    public ItemRedstoneCrystal()
    {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ItemStrings.redstoneCrystal);
    }
}
