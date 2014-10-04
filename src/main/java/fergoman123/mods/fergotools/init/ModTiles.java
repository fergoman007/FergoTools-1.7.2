package fergoman123.mods.fergotools.init;

import fergoman123.mods.fergotools.reference.Strings;
import fergoman123.mods.fergotools.util.Utils;
import fergoman123.mods.fergoutil.helper.RegisterHelper;

public class ModTiles {

    public static void init()
    {
        for (int i = 0; i < Strings.Tile.tileList.length; i++)
        {
            RegisterHelper.registerTileEntity(Utils.tileEntityList[i], Strings.Tile.tileList[i]);
        }
    }
}
