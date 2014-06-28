package fergoman123.mods.fergotools.item.materials;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.base.ItemFT;

public class ItemGlowstoneIngot extends ItemFT{

    public static ItemGlowstoneIngot instance = new ItemGlowstoneIngot();

    public ItemGlowstoneIngot()
    {
        super();
        this.setUnlocalizedName(Strings.ItemStrings.ingotGlowstone);
    }
}
