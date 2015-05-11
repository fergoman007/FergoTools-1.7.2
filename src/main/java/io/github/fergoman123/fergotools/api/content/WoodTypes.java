package io.github.fergoman123.fergotools.api.content;

import net.minecraft.util.IStringSerializable;

public enum WoodTypes implements IStringSerializable
{
    obsidian(0),
    emerald(1),
    lapis(2),
    bronze(3),
    coal(4),
    glowstone(5),
    adamantium(6),
    silk(7),
    redstone(8);

    private static final WoodTypes[] VALUES = new WoodTypes[values().length];

    private final int meta;

    private WoodTypes(int meta)
    {
        this.meta = meta;
    }

    public int getMeta() {
        return meta;
    }

    public static WoodTypes byMetadata(int meta)
    {
        if (meta < 0 || meta >= VALUES.length)
        {
            meta = 0;
        }

        return VALUES[meta];
    }

    public String getName()
    {
        return this.name();
    }
}
