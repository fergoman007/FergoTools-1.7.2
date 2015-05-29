package io.github.fergoman123.fergotools.reference;

import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergoutil.info.BlockInfo;
import net.minecraft.block.material.Material;

public class BlockInfos
{
    public static final BlockInfo oreExperience = getBlockInfo(Material.rock, BlockNames.oreExperience);
    public static final BlockInfo oreObsidian = getBlockInfo(Material.rock, BlockNames.oreObsidian);

    public static BlockInfo getBlockInfo(Material material, String name)
    {
        return new BlockInfo(material, name, "fergotools:" + name);
    }
}
