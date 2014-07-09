package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.ItemFT;

public class ItemLapisCrystal extends ItemFT{

    public static ItemLapisCrystal instance = new ItemLapisCrystal();

    public ItemLapisCrystal()
    {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(Names.Items.lapisCrystal);
    }
}
