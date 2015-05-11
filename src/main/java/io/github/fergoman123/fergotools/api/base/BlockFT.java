package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.block.BlockFergo;
import net.minecraft.block.material.Material;

public class BlockFT extends BlockFergo{
    public BlockFT(Material material, float hardness, float resistance, String name) {
        super(material, 0, FergoTools.tabFergoTools, hardness, resistance, name);
    }
}
