package io.github.fergoman123.fergotools.api.content;

import net.minecraft.util.IStringSerializable;

public enum WoodTypes implements IStringSerializable
{
    obsidian(0, "Obsidian"),
    emerald(1, "Emerald"),
    lapis(2, "Lapis"),
    bronze(3, "Bronze"),
    coal(4, "Coal"),
    glowstone(5, "Glowstone"),
    adamantium(6, "Adamantium"),
    silk(7, "Silk"),
    redstone(8, "Redstone");

    private static final WoodTypes[] VALUES = new WoodTypes[values().length];

    private final int meta;
    private final String name;

    private WoodTypes(int meta, String name)
    {
        this.meta = meta;
        this.name = name;
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
        return this.name;
    }
}
