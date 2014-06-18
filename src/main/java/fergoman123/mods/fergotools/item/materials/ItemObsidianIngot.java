package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.ItemFT;

public class ItemObsidianIngot extends ItemFT{

    public static ItemObsidianIngot instance = new ItemObsidianIngot();

    public ItemObsidianIngot()
    {
        super();
        this.setUnlocalizedName(Strings.ItemStrings.ingotObsidian);
    }
}
