package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergoutil.block.BlockFurnaceFergo;
import net.minecraft.block.material.Material;

public abstract class BlockFurnaceFT extends BlockFurnaceFergo
{
    public BlockFurnaceFT(Material materialIn, boolean isActive, String name) {
        super(materialIn, isActive, 0, Tabs.tabFergoFurnaces, name);
    }
}
