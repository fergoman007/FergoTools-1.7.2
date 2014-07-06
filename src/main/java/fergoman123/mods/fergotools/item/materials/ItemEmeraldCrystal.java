package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.strings.ItemStrings;
import fergoman123.mods.fergotools.util.base.ItemFT;

public class ItemEmeraldCrystal extends ItemFT{

    public static ItemEmeraldCrystal instance = new ItemEmeraldCrystal();
    public ItemEmeraldCrystal()
    {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName(ItemStrings.emeraldCrystal);
    }
}
