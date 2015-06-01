package io.github.fergoman123.fergotools.reference;

import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergoutil.info.BlockInfo;
import io.github.fergoman123.fergoutil.info.MultiBlockInfo;
import net.minecraft.block.material.Material;

public class BlockInfos
{
    public static final BlockInfo oreExperience = getBlockInfo(Material.rock, BlockNames.oreExperience);
    public static final BlockInfo oreObsidian = getBlockInfo(Material.rock, BlockNames.oreObsidian);
    public static final BlockInfo oreGemEmerald = getBlockInfo(Material.rock, BlockNames.oreGemEmerald);
    public static final BlockInfo oreGemLapis = getBlockInfo(Material.rock, BlockNames.oreGemLapis);
    public static final BlockInfo oreBronze = getBlockInfo(Material.rock, BlockNames.oreBronze);
    public static final BlockInfo oreAdamantium = getBlockInfo(Material.rock, BlockNames.oreAdamantium);
    public static final BlockInfo oreGemRedstone = getBlockInfo(Material.rock, BlockNames.oreGemRedstone);
    public static final MultiBlockInfo storageFT;


    public static BlockInfo getBlockInfo(Material material, String name)
    {
        return new BlockInfo(material, name, "fergotools:" + name);
    }

    public static MultiBlockInfo getMultiBlockInfo
}
