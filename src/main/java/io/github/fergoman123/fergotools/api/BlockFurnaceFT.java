package io.github.fergoman123.fergotools.api;

import io.github.fergoman123.fergotools.common.CTFT;
import io.github.fergoman123.fergoutil.block.BlockFurnaceFergo;
import net.minecraft.block.material.Material;

public abstract class BlockFurnaceFT extends BlockFurnaceFergo

{
    public BlockFurnaceFT(boolean isActive, Material material, String name) {
        super(isActive, material, 0, null, 3.5f, 2000f, name);
        if (isActive)
        {
            this.setLightLevel(0.875f);
        }
        else
        {
            this.setCreativeTab(CTFT.instance);
        }
    }
}
