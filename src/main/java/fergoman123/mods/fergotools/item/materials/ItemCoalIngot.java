package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.base.ItemFT;

public class ItemCoalIngot extends ItemFT{

    public static ItemCoalIngot instance = new ItemCoalIngot();

    public ItemCoalIngot()
    {
        super();
        this.setUnlocalizedName(Strings.ItemStrings.ingotCoal);
    }
}
