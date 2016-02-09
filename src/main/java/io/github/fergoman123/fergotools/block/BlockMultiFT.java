package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import net.minecraft.block.material.Material;

public abstract class BlockMultiFT extends BlockMultiFergo {

    public BlockMultiFT(Material materialIn, String[] subNames, String name) {
        super(materialIn, "fergotools", subNames, name);
    }
}
