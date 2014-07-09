package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.ItemFT;

public class ItemCoalIngot extends ItemFT{

    public static ItemCoalIngot instance = new ItemCoalIngot();

    public ItemCoalIngot()
    {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(Names.Items.ingotCoal);
    }
}
