package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.ItemFT;

public class ItemRedstoneCrystal extends ItemFT{

    public static ItemRedstoneCrystal instance = new ItemRedstoneCrystal();

    public ItemRedstoneCrystal()
    {
        super();
        this.setUnlocalizedName(Strings.ItemStrings.redstoneCrystal);
    }
}
