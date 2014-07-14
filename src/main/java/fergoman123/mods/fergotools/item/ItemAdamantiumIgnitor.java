package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.block.BlockFDPPortal;
import fergoman123.mods.fergotools.util.base.ItemFT;

public class ItemAdamantiumIgnitor extends ItemFT
{
    public static ItemAdamantiumIgnitor instance = new ItemAdamantiumIgnitor();
    public BlockFDPPortal portal;

    public ItemAdamantiumIgnitor()
    {
        super();
        this.setMaxStackSize(1);
        this.setUnlocalizedName("");
    }

}
