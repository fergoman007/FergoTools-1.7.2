package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import io.github.fergoman123.fergotools.reference.Strings;
import io.github.fergoman123.fergotools.util.Utils;

public class ModTiles {

    public static void init()
    {
        for (int i = 0; i < Strings.Tile.tileList.length; i++)
        {
            RegisterHelper.registerTileEntity(Utils.tileEntityList[i], Strings.Tile.tileList[i]);
        }
    }
}
