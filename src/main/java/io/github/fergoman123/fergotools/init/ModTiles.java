package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.reference.strings.Tile;
import io.github.fergoman123.fergotools.util.Utils;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;

public class ModTiles {

    public static void init()
    {
        for (int i = 0; i < Tile.tileList.length; i++)
        {
            RegisterHelper.registerTileEntity(Utils.tileEntityList[i], Tile.tileList[i]);
        }
    }
}
