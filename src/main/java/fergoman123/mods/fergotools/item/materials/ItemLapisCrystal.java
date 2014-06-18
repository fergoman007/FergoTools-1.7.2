package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.ItemFT;

public class ItemLapisCrystal extends ItemFT{

    public static ItemLapisCrystal instance = new ItemLapisCrystal();

    public ItemLapisCrystal()
    {
        super();
        this.setUnlocalizedName(Strings.ItemStrings.lapisCrystal);
    }
}
