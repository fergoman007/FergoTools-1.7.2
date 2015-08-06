package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.block.BlockFurnaceFergo;
import net.minecraft.block.material.Material;

public abstract class BlockFurnaceFT extends BlockFurnaceFergo {

	protected BlockFurnaceFT(boolean isActive, Material materialIn, String name) {
		super(isActive, "ft", materialIn, FergoTools.tabFergoTools, name);
	}
}
