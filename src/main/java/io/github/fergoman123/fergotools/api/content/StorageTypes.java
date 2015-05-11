package io.github.fergoman123.fergotools.api.content;

import net.minecraft.util.IStringSerializable;

public enum StorageTypes implements IStringSerializable
{
    blockExperience(0, "blockExperience"),
    blockExpCollector(1, "blockExpCollector"),
    blockObsidian(2, "blockObsidian"),
    blockGemEmerald(3, "blockGemEmerald"),
    blockGemLapis(4, "blockGemLapis"),
    blockBronze(5, "blockBronze"),
    blockCoal(6, "blockCoal"),
    blockGlowstone(7, "blockGlowstone"),
    blockAdamantium(8, "blockAdamantium"),
    blockGemSilk(9, "blockGemSilk"),
    blockGemRedstone(10, "blockGemRedstone");

    private final int meta;
    private final String name;

    private StorageTypes(int meta, String name)
    {
        this.meta = meta;
        this.name = name;
    }

    public int getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
