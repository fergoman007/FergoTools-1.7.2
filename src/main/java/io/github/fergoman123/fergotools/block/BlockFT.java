package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergoutil.block.BlockFergo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class BlockFT extends BlockFergo {

    public BlockFT(Material materialIn, String name) {
        super(materialIn, "fergotools", name);
    }
}
